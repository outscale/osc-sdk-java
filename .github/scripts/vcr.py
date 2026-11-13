from http.server import BaseHTTPRequestHandler, HTTPServer
import http.client
from pathlib import Path
import os
import base64
import tempfile
import argparse

MAX_BODY = int(1024 * 1024)  # 1 Mo
RECORDED_RESPONSE_HEADERS = {"content-type"}

import datetime
import hashlib
import hmac
import json


def sign(key, msg):
    return hmac.new(key, msg.encode("utf-8"), hashlib.sha256).digest()


def getSignatureKey(key, dateStamp, regionName, serviceName):
    kDate = sign(("AWS4" + key).encode("utf-8"), dateStamp)
    kRegion = sign(kDate, regionName)
    kService = sign(kRegion, serviceName)
    kSigning = sign(kService, "aws4_request")
    return kSigning


class RemoteSigner:
    def __init__(self, access_key: str, secret_key: str, region: str, service: str):
        self.access_key = access_key
        self.secret_key = secret_key
        self.region = region
        self.service = service

    def sign(self, method, host, endpoint, body) -> dict[str, str]:
        # https://github.com/aws-samples/sigv4-signing-examples/blob/b9011eb840d97e05b8a46d3bb4246b85e03aab8f/no-sdk/python/main.py
        t = datetime.datetime.now(datetime.timezone.utc)
        oscdate = t.strftime("%Y%m%dT%H%M%SZ")
        datestamp = t.strftime("%Y%m%d")
        canonical_uri = endpoint
        canonical_querystring = ""
        canonical_headers = "host:" + host + "\n" + "x-amz-date:" + oscdate + "\n"
        signed_headers = "host;x-amz-date"
        payload_hash = hashlib.sha256(body).hexdigest()
        canonical_request = (
            method
            + "\n"
            + canonical_uri
            + "\n"
            + canonical_querystring
            + "\n"
            + canonical_headers
            + "\n"
            + signed_headers
            + "\n"
            + payload_hash
        )
        algorithm = "AWS4-HMAC-SHA256"
        credential_scope = (
            datestamp + "/" + self.region + "/" + self.service + "/" + "aws4_request"
        )
        string_to_sign = (
            algorithm
            + "\n"
            + oscdate
            + "\n"
            + credential_scope
            + "\n"
            + hashlib.sha256(canonical_request.encode("utf-8")).hexdigest()
        )
        signing_key = getSignatureKey(
            self.secret_key, datestamp, self.region, self.service
        )
        signature = hmac.new(
            signing_key, (string_to_sign).encode("utf-8"), hashlib.sha256
        ).hexdigest()
        authorization_header = (
            algorithm
            + " "
            + "Credential="
            + self.access_key
            + "/"
            + credential_scope
            + ", "
            + "SignedHeaders="
            + signed_headers
            + ", "
            + "Signature="
            + signature
        )

        return {
            "host": host,
            "x-amz-date": oscdate,
            "authorization": authorization_header,
        }


def fixture_key(method, target, body):
    identity = {
        "method": method,
        "target": target,
        "body_sha256": hashlib.sha256(body).hexdigest(),
    }
    serialized = json.dumps(identity, sort_keys=True, separators=(",", ":")).encode()

    return hashlib.sha256(serialized).hexdigest(), identity


def save_fixture(path, entries):
    data = json.dumps(entries, indent=2).encode()
    fd, temporary = tempfile.mkstemp(prefix=".fixture-", dir=FIXTURES)
    try:
        os.fchmod(fd, 0o600)
        with os.fdopen(fd, "wb") as file:
            file.write(data)
        os.replace(temporary, path)
    finally:
        if os.path.exists(temporary):
            os.unlink(temporary)


FIXTURES = Path("./fixtures")
FIXTURES.mkdir(parents=True, exist_ok=True)
REPLAY_POSITIONS = {}


class Proxy(BaseHTTPRequestHandler):
    protocol_version = "HTTP/1.1"

    def handle_request(self):
        try:
            headers = {}
            for name, value in self.headers.items():
                name = name.lower()
                if not name.startswith("x-awz") and not name.startswith("x-osc"):
                    headers[name] = value

            length = int(headers.get("content-length", "0"))
            if length < 0 or length > MAX_BODY:
                raise ValueError("invalid or oversized Content-Length")
            body = self.rfile.read(length)

            key, identity = fixture_key(self.command, self.path, body)
            path = FIXTURES / f"{key}.json"

            if MODE == "replay":
                if not path.exists():
                    self.reply(404, {}, b"no matching fixture\n")
                    return
                entries = json.loads(path.read_text())
                position = REPLAY_POSITIONS.get(key, 0)
                if position >= len(entries):
                    self.reply(409, {}, b"fixture sequence exhausted\n")
                    return
                REPLAY_POSITIONS[key] = position + 1
                response = entries[position]
                self.reply(
                    response["status"],
                    response["headers"],
                    base64.b64decode(response["body_base64"]),
                )
                return

            connection = http.client.HTTPSConnection(
                UPSTREAM_HOST, UPSTREAM_PORT, timeout=30
            )
            try:
                connection.putrequest(
                    self.command, self.path, skip_host=True, skip_accept_encoding=True
                )

                headers.update(
                    SIGNER.sign(self.command, UPSTREAM_HOST, self.path, body)
                )

                for name, value in headers.items():
                    print(name, "->", value)
                    connection.putheader(name, value)
                print(body)
                connection.endheaders(body)

                upstream_response = connection.getresponse()
                response_body = upstream_response.read()
                response_headers = {
                    name.lower(): value
                    for name, value in upstream_response.getheaders()
                    if name.lower() in RECORDED_RESPONSE_HEADERS
                }
                status = upstream_response.status

            finally:
                connection.close()

            entries = json.loads(path.read_text()) if path.exists() else []
            entries.append(
                {
                    "status": status,
                    "headers": response_headers,
                    "body_base64": base64.b64encode(response_body).decode(),
                }
            )
            save_fixture(path, entries)
            self.reply(status, response_headers, response_body)
        except PermissionError as exc:
            self.reply(401, {}, f"{exc}\n".encode())
        except (ValueError, UnicodeError) as exc:
            self.reply(400, {}, f"{exc}\n".encode())
        except Exception:
            self.log_exception()
            self.reply(502, {}, b"proxy error\n")

    def log_exception(self):
        import traceback

        traceback.print_exc()

    def reply(self, status, headers, body):
        self.send_response(status)
        for name, value in headers.items():
            self.send_header(name, value)
        self.send_header("Content-Length", str(len(body)))
        self.end_headers()
        if self.command != "HEAD":
            self.wfile.write(body)

    do_GET = handle_request
    do_POST = handle_request
    do_PUT = handle_request
    do_PATCH = handle_request
    do_DELETE = handle_request
    do_HEAD = handle_request


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="test proxy VCR server")
    parser.add_argument("mode", choices=("record", "replay"))
    parser.add_argument("--host", default="127.0.0.1", help="listen address")
    parser.add_argument("--port", type=int, default=8000, help="listen port")
    parser.add_argument("--upstream-host", default="api.eu-west-2.outscale.com")
    parser.add_argument("--upstream-port", type=int, default=443)
    parser.add_argument("--region", default=os.environ.get("OSC_REGION", "eu-west-2"))
    parser.add_argument("--access-key", default=os.environ.get("OSC_ACCESS_KEY", "<ak>"))
    parser.add_argument("--secret-key", default=os.environ.get("OSC_SECRET_KEY", "<sk>"))
    args = parser.parse_args()
    MODE = args.mode
    UPSTREAM_HOST = args.upstream_host
    UPSTREAM_PORT = args.upstream_port
    SIGNER = RemoteSigner(args.access_key, args.secret_key, args.region, "api")
    server_address = (args.host, args.port)
    httpd = HTTPServer(server_address, Proxy)
    httpd.serve_forever()

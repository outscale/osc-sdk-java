package io.github.outscale.osc_sdk_java.client;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import okhttp3.OkHttpClient;
import okhttp3.tls.HandshakeCertificates;
import okhttp3.tls.HeldCertificate;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;

public class ConfigurationInitializer {

    protected ApiClient getApiClient(Profile profile) {
        Profile selectedProfile = profile;

        ApiClient apiClient = new ApiClient();

        String accessKey = "";
        if (selectedProfile.getAccessKey() != null && selectedProfile.getAccessKey().length() > 0) {
            accessKey = selectedProfile.getAccessKey();
        }

        String secretKey = "";
        if (selectedProfile.getSecretKey() != null && selectedProfile.getSecretKey().length() > 0) {
            secretKey = selectedProfile.getSecretKey();
        }

        String region = "eu-west-2";
        if (selectedProfile.getRegion() != null && selectedProfile.getRegion().length() > 0) {
            region = selectedProfile.getRegion();
        }

        apiClient.setAWS4Configuration(accessKey, secretKey, region, "api");

        StringBuilder urlBuilder = new StringBuilder();
        if (selectedProfile.getProtocol() != null && selectedProfile.getProtocol().length() > 0) {
            urlBuilder.append(selectedProfile.getProtocol() + "://");
        } else {
            urlBuilder.append("https://");
        }

        Endpoint endpoints = selectedProfile.getEndpoints();
        if (endpoints != null && endpoints.getApi() != null && endpoints.getApi().length() > 0) {
            urlBuilder.append(endpoints.getApi());
        } else {
            urlBuilder.append("api.{region}.outscale.com/api/v1");
        }

        HashMap<String, ServerVariable> serverVariables = new HashMap<>();
        serverVariables.put("region", new ServerVariable("Loaded from profile", region, null));
        ServerConfiguration serverConfiguration =
                new ServerConfiguration(
                        urlBuilder.toString(), "Loaded from profile", serverVariables);
        apiClient.setServers(
                new ArrayList<ServerConfiguration>() {
                    {
                        add(serverConfiguration);
                    }
                });
        apiClient.setServerIndex(0);
        apiClient.setServerVariables(null);

        // TLS
        boolean tlsConfigured = false;
        if (selectedProfile.getX509ClientCert() != null
                && selectedProfile.getX509ClientCert().length() > 0
                && selectedProfile.getX509ClientKey() != null
                && selectedProfile.getX509ClientKey().length() > 0) {
            tlsConfigured = true;

            X509Certificate cert = null;
            try (FileInputStream br = new FileInputStream(selectedProfile.getX509ClientCert())) {
                CertificateFactory factory = CertificateFactory.getInstance("X.509");
                cert = (X509Certificate) factory.generateCertificate(br);
            } catch (FileNotFoundException e) {
                System.err.println("The certificate is not found ");
                return null;
            } catch (IOException e) {
                System.err.println("Error during the read of the certificate");
                return null;
            } catch (CertificateException e) {
                System.err.println("Error during the parse of the certificate");
                return null;
            }

            PEMKeyPair pemKey;
            PrivateKey ecKey = null;
            try (BufferedReader br =
                    new BufferedReader(new FileReader(selectedProfile.getX509ClientKey()))) {
                pemKey = (PEMKeyPair) new PEMParser(br).readObject();
                ecKey =
                        (PrivateKey)
                                new JcaPEMKeyConverter().getPrivateKey(pemKey.getPrivateKeyInfo());
            } catch (FileNotFoundException e) {
                System.err.println("The private key is not found ");
                return null;
            } catch (IOException e) {
                System.err.println("Error during the read of the private key");
                return null;
            }

            HeldCertificate clientCertificate =
                    new HeldCertificate(new KeyPair(cert.getPublicKey(), ecKey), cert);
            HandshakeCertificates clientCertificates =
                    new HandshakeCertificates.Builder()
                            .addPlatformTrustedCertificates()
                            .heldCertificate(clientCertificate)
                            .build();

            OkHttpClient client =
                    new OkHttpClient.Builder()
                            .sslSocketFactory(
                                    clientCertificates.sslSocketFactory(),
                                    clientCertificates.trustManager())
                            .build();

            apiClient.setHttpClient(client);
        }

        if (selectedProfile.getX509ClientCertB64() != null
                && selectedProfile.getX509ClientCertB64().length() > 0
                && selectedProfile.getX509ClientKeyB64() != null
                && selectedProfile.getX509ClientKeyB64().length() > 0) {
            if (tlsConfigured) {
                System.err.println("Cannot configure client certificate with both file and base64");
                return null;
            }

            byte[] decodedBytes = Base64.getDecoder().decode(selectedProfile.getX509ClientKeyB64());
            String privateKey = new String(decodedBytes);

            decodedBytes = Base64.getDecoder().decode(selectedProfile.getX509ClientCertB64());
            String certificate = new String(decodedBytes);

            PEMKeyPair pemKey;
            PrivateKey ecKey = null;
            try {
                pemKey = (PEMKeyPair) new PEMParser(new StringReader(privateKey)).readObject();
                ecKey =
                        (PrivateKey)
                                new JcaPEMKeyConverter().getPrivateKey(pemKey.getPrivateKeyInfo());
            } catch (IOException e) {
                System.err.println("Cannot parse the private Key");
                return null;
            }

            X509Certificate cert = null;
            try {
                CertificateFactory factory = CertificateFactory.getInstance("X.509");
                cert =
                        (X509Certificate)
                                factory.generateCertificate(
                                        new ByteArrayInputStream(certificate.getBytes()));
            } catch (CertificateException e) {
                System.err.println("Error during parse of the certificate");
                return null;
            }

            HeldCertificate clientCertificate =
                    new HeldCertificate(new KeyPair(cert.getPublicKey(), ecKey), cert);
            HandshakeCertificates clientCertificates =
                    new HandshakeCertificates.Builder()
                            .addPlatformTrustedCertificates()
                            .heldCertificate(clientCertificate)
                            .build();

            OkHttpClient client =
                    new OkHttpClient.Builder()
                            .sslSocketFactory(
                                    clientCertificates.sslSocketFactory(),
                                    clientCertificates.trustManager())
                            .build();

            apiClient.setHttpClient(client);
        }

        return apiClient;
    }
}

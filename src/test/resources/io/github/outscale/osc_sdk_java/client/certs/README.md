# Certificates

## How to regenerate test certificate
```
mkdir -p valid 
cd valid
openssl genrsa -des3 -out myCA.key 2048
openssl req -x509 -new -nodes -key myCA.key -sha256 -days 1825 -out myCA.pem
openssl genrsa -out sdk.test.key 2048
openssl req -new -key sdk.test.key -out sdk.test.csr
openssl x509 -req -in sdk.test.csr -CA myCA.pem -CAkey myCA.key -CAcreateserial -out sdk.test.crt -days 999 -sha256
```


# CreateServerCertificateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | **String** | The PEM-encoded X509 certificate. |  |
|**chain** | **String** | The PEM-encoded intermediate certification authorities. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**name** | **String** | A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (&#x3D;), commas (,), periods (.), at signs (@), minuses (-), or underscores (_). |  |
|**path** | **String** | The path to the server certificate, set to a slash (/) if not specified. |  [optional] |
|**privateKey** | **String** | The PEM-encoded private key matching the certificate. |  |




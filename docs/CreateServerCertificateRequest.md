

# CreateServerCertificateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | **String** | The PEM-encoded X509 certificate.&lt;br /&gt;With OSC CLI, use the following syntax to make sure your CA file is correctly parsed: &#x60;--CaPem&#x3D;&amp;quot;$(cat FILENAME)&amp;quot;&#x60;. |  |
|**chain** | **String** | The PEM-encoded intermediate certification authorities.&lt;br /&gt;With OSC CLI, use the following syntax to make sure your CA file is correctly parsed: &#x60;--CaPem&#x3D;&amp;quot;$(cat FILENAME)&amp;quot;&#x60;. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**name** | **String** | A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+), equals (&#x3D;), commas (,), periods (.), at signs (@), minuses (-), or underscores (_). |  |
|**path** | **String** | The path to the server certificate, set to a slash (/) if not specified. |  [optional] |
|**privateKey** | **String** | The PEM-encoded private key matching the certificate.&lt;br /&gt;With OSC CLI, use the following syntax to make sure your CA file is correctly parsed: &#x60;--CaPem&#x3D;&amp;quot;$(cat FILENAME)&amp;quot;&#x60;. |  |




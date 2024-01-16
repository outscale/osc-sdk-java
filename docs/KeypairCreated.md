

# KeypairCreated

Information about the created keypair.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keypairFingerprint** | **String** | The MD5 public key fingerprint, as specified in section 4 of RFC 4716. |  [optional] |
|**keypairName** | **String** | The name of the keypair. |  [optional] |
|**keypairType** | **String** | The type of the keypair (&#x60;ssh-rsa&#x60;, &#x60;ssh-ed25519&#x60;, &#x60;ecdsa-sha2-nistp256&#x60;, &#x60;ecdsa-sha2-nistp384&#x60;, or &#x60;ecdsa-sha2-nistp521&#x60;). |  [optional] |
|**privateKey** | **String** | The private key, returned only if you are creating a keypair (not if you are importing). When you save this private key in a .rsa file, make sure you replace the &#x60;\\n&#x60; escape sequences with real line breaks. |  [optional] |




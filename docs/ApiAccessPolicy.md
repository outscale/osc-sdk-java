

# ApiAccessPolicy

Information about the API access policy.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxAccessKeyExpirationSeconds** | **Long** | The maximum possible lifetime for your access keys, in seconds. If &#x60;0&#x60;, your access keys can have unlimited lifetimes. |  [optional] |
|**requireTrustedEnv** | **Boolean** | If true, a trusted session is activated, allowing you to bypass Certificate Authorities (CAs) enforcement. For more information, see [About Your API Access Policy](https://docs.outscale.com/en/userguide/About-Your-API-Access-Policy.html).&lt;br /&gt; If this is enabled, it is required that you and all your users log in to Cockpit v2 using the WebAuthn method for multi-factor authentication. For more information, see [About Authentication &gt; Multi-Factor Authentication](https://docs.outscale.com/en/userguide/About-Authentication.html#_multi_factor_authentication). |  [optional] |




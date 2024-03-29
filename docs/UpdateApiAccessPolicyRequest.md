

# UpdateApiAccessPolicyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**maxAccessKeyExpirationSeconds** | **Long** | The maximum possible lifetime for your access keys, in seconds (between &#x60;0&#x60; and &#x60;3153600000&#x60;, both included). If set to &#x60;O&#x60;, your access keys can have unlimited lifetimes, but a trusted session cannot be activated. Otherwise, all your access keys must have an expiration date. This value must be greater than the remaining lifetime of each access key of your account. |  |
|**requireTrustedEnv** | **Boolean** | If true, a trusted session is activated, provided that you specify the &#x60;MaxAccessKeyExpirationSeconds&#x60; parameter with a value greater than &#x60;0&#x60;.&lt;br /&gt; Enabling this will require you and all your users to log in to Cockpit v2 using the WebAuthn method for multi-factor authentication. For more information, see [About Authentication &gt; Multi-Factor Authentication](https://docs.outscale.com/en/userguide/About-Authentication.html#_multi_factor_authentication). |  |




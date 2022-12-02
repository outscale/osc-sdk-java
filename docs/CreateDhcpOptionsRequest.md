

# CreateDhcpOptionsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domainName** | **String** | Specify a domain name (for example, &#x60;MyCompany.com&#x60;). You can specify only one domain name. You must specify at least one of the following parameters: &#x60;DomainName&#x60;, &#x60;DomainNameServers&#x60;, &#x60;LogServers&#x60;, or &#x60;NtpServers&#x60;. |  [optional] |
|**domainNameServers** | **List&lt;String&gt;** | The IPs of domain name servers. If no IPs are specified, the &#x60;OutscaleProvidedDNS&#x60; value is set by default. You must specify at least one of the following parameters: &#x60;DomainName&#x60;, &#x60;DomainNameServers&#x60;, &#x60;LogServers&#x60;, or &#x60;NtpServers&#x60;. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**logServers** | **List&lt;String&gt;** | The IPs of the log servers. You must specify at least one of the following parameters: &#x60;DomainName&#x60;, &#x60;DomainNameServers&#x60;, &#x60;LogServers&#x60;, or &#x60;NtpServers&#x60;. |  [optional] |
|**ntpServers** | **List&lt;String&gt;** | The IPs of the Network Time Protocol (NTP) servers. You must specify at least one of the following parameters: &#x60;DomainName&#x60;, &#x60;DomainNameServers&#x60;, &#x60;LogServers&#x60;, or &#x60;NtpServers&#x60;. |  [optional] |




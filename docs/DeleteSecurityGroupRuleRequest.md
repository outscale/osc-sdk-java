

# DeleteSecurityGroupRuleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**flow** | **String** | The direction of the flow: &#x60;Inbound&#x60; or &#x60;Outbound&#x60;. You can specify &#x60;Outbound&#x60; for Nets only. |  |
|**fromPortRange** | **Integer** | The beginning of the port range for the TCP and UDP protocols, or an ICMP type number. |  [optional] |
|**ipProtocol** | **String** | The IP protocol name (&#x60;tcp&#x60;, &#x60;udp&#x60;, &#x60;icmp&#x60;, or &#x60;-1&#x60; for all protocols). By default, &#x60;-1&#x60;. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml). |  [optional] |
|**ipRange** | **String** | The IP range for the security group rule, in CIDR notation (for example, &#x60;10.0.0.0/16&#x60;). |  [optional] |
|**rules** | [**List&lt;SecurityGroupRule&gt;**](SecurityGroupRule.md) | One or more rules you want to delete from the security group. |  [optional] |
|**securityGroupAccountIdToUnlink** | **String** | The account ID of the owner of the security group you want to delete a rule from. |  [optional] |
|**securityGroupId** | **String** | The ID of the security group you want to delete a rule from. |  |
|**securityGroupNameToUnlink** | **String** | The ID of the source security group. If you are in the Public Cloud, you can also specify the name of the source security group. |  [optional] |
|**toPortRange** | **Integer** | The end of the port range for the TCP and UDP protocols, or an ICMP code number. |  [optional] |




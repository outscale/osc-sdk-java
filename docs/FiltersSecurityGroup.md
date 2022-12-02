

# FiltersSecurityGroup

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountIds** | **List&lt;String&gt;** | The account IDs of the owners of the security groups. |  [optional] |
|**descriptions** | **List&lt;String&gt;** | The descriptions of the security groups. |  [optional] |
|**inboundRuleAccountIds** | **List&lt;String&gt;** | The account IDs that have been granted permissions. |  [optional] |
|**inboundRuleFromPortRanges** | **List&lt;Integer&gt;** | The beginnings of the port ranges for the TCP and UDP protocols, or the ICMP type numbers. |  [optional] |
|**inboundRuleIpRanges** | **List&lt;String&gt;** | The IP ranges that have been granted permissions, in CIDR notation (for example, &#x60;10.0.0.0/24&#x60;). |  [optional] |
|**inboundRuleProtocols** | **List&lt;String&gt;** | The IP protocols for the permissions (&#x60;tcp&#x60; \\| &#x60;udp&#x60; \\| &#x60;icmp&#x60;, or a protocol number, or &#x60;-1&#x60; for all protocols). |  [optional] |
|**inboundRuleSecurityGroupIds** | **List&lt;String&gt;** | The IDs of the security groups that have been granted permissions. |  [optional] |
|**inboundRuleSecurityGroupNames** | **List&lt;String&gt;** | The names of the security groups that have been granted permissions. |  [optional] |
|**inboundRuleToPortRanges** | **List&lt;Integer&gt;** | The ends of the port ranges for the TCP and UDP protocols, or the ICMP code numbers. |  [optional] |
|**netIds** | **List&lt;String&gt;** | The IDs of the Nets specified when the security groups were created. |  [optional] |
|**outboundRuleAccountIds** | **List&lt;String&gt;** | The account IDs that have been granted permissions. |  [optional] |
|**outboundRuleFromPortRanges** | **List&lt;Integer&gt;** | The beginnings of the port ranges for the TCP and UDP protocols, or the ICMP type numbers. |  [optional] |
|**outboundRuleIpRanges** | **List&lt;String&gt;** | The IP ranges that have been granted permissions, in CIDR notation (for example, &#x60;10.0.0.0/24&#x60;). |  [optional] |
|**outboundRuleProtocols** | **List&lt;String&gt;** | The IP protocols for the permissions (&#x60;tcp&#x60; \\| &#x60;udp&#x60; \\| &#x60;icmp&#x60;, or a protocol number, or &#x60;-1&#x60; for all protocols). |  [optional] |
|**outboundRuleSecurityGroupIds** | **List&lt;String&gt;** | The IDs of the security groups that have been granted permissions. |  [optional] |
|**outboundRuleSecurityGroupNames** | **List&lt;String&gt;** | The names of the security groups that have been granted permissions. |  [optional] |
|**outboundRuleToPortRanges** | **List&lt;Integer&gt;** | The ends of the port ranges for the TCP and UDP protocols, or the ICMP code numbers. |  [optional] |
|**securityGroupIds** | **List&lt;String&gt;** | The IDs of the security groups. |  [optional] |
|**securityGroupNames** | **List&lt;String&gt;** | The names of the security groups. |  [optional] |
|**tagKeys** | **List&lt;String&gt;** | The keys of the tags associated with the security groups. |  [optional] |
|**tagValues** | **List&lt;String&gt;** | The values of the tags associated with the security groups. |  [optional] |
|**tags** | **List&lt;String&gt;** | The key/value combination of the tags associated with the security groups, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}. |  [optional] |




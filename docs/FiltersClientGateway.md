

# FiltersClientGateway

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bgpAsns** | **List&lt;Integer&gt;** | The Border Gateway Protocol (BGP) Autonomous System Numbers (ASNs) of the connections. |  [optional] |
|**clientGatewayIds** | **List&lt;String&gt;** | The IDs of the client gateways. |  [optional] |
|**connectionTypes** | **List&lt;String&gt;** | The types of communication tunnels used by the client gateways (only &#x60;ipsec.1&#x60; is supported). |  [optional] |
|**publicIps** | **List&lt;String&gt;** | The public IPv4 addresses of the client gateways. |  [optional] |
|**states** | **List&lt;String&gt;** | The states of the client gateways (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;deleting&#x60; \\| &#x60;deleted&#x60;). |  [optional] |
|**tagKeys** | **List&lt;String&gt;** | The keys of the tags associated with the client gateways. |  [optional] |
|**tagValues** | **List&lt;String&gt;** | The values of the tags associated with the client gateways. |  [optional] |
|**tags** | **List&lt;String&gt;** | The key/value combination of the tags associated with the client gateways, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}. |  [optional] |




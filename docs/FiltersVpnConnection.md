

# FiltersVpnConnection

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bgpAsns** | **List&lt;Integer&gt;** | The Border Gateway Protocol (BGP) Autonomous System Numbers (ASNs) of the connections. |  [optional] |
|**clientGatewayIds** | **List&lt;String&gt;** | The IDs of the client gateways. |  [optional] |
|**connectionTypes** | **List&lt;String&gt;** | The types of the VPN connections (only &#x60;ipsec.1&#x60; is supported). |  [optional] |
|**routeDestinationIpRanges** | **List&lt;String&gt;** | The destination IP ranges. |  [optional] |
|**states** | **List&lt;String&gt;** | The states of the VPN connections (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;deleting&#x60; \\| &#x60;deleted&#x60;). |  [optional] |
|**staticRoutesOnly** | **Boolean** | If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](#createvpnconnectionroute) and [DeleteVpnConnectionRoute](#deletevpnconnectionroute). |  [optional] |
|**tagKeys** | **List&lt;String&gt;** | The keys of the tags associated with the VPN connections. |  [optional] |
|**tagValues** | **List&lt;String&gt;** | The values of the tags associated with the VPN connections. |  [optional] |
|**tags** | **List&lt;String&gt;** | The key/value combination of the tags associated with the VPN connections, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}. |  [optional] |
|**virtualGatewayIds** | **List&lt;String&gt;** | The IDs of the virtual gateways. |  [optional] |
|**vpnConnectionIds** | **List&lt;String&gt;** | The IDs of the VPN connections. |  [optional] |




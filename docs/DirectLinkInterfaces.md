

# DirectLinkInterfaces

Information about the DirectLink interfaces.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The account ID of the owner of the DirectLink interface. |  [optional] |
|**bgpAsn** | **Integer** | The BGP (Border Gateway Protocol) ASN (Autonomous System Number) on the customer&#39;s side of the DirectLink interface. |  [optional] |
|**bgpKey** | **String** | The BGP authentication key. |  [optional] |
|**clientPrivateIp** | **String** | The IP on the customer&#39;s side of the DirectLink interface. |  [optional] |
|**directLinkId** | **String** | The ID of the DirectLink. |  [optional] |
|**directLinkInterfaceId** | **String** | The ID of the DirectLink interface. |  [optional] |
|**directLinkInterfaceName** | **String** | The name of the DirectLink interface. |  [optional] |
|**interfaceType** | **String** | The type of the DirectLink interface (always &#x60;private&#x60;). |  [optional] |
|**location** | **String** | The datacenter where the DirectLink interface is located. |  [optional] |
|**mtu** | **Integer** | The maximum transmission unit (MTU) of the DirectLink interface, in bytes (always &#x60;1500&#x60;). |  [optional] |
|**outscalePrivateIp** | **String** | The IP on the OUTSCALE side of the DirectLink interface. |  [optional] |
|**state** | **String** | The state of the DirectLink interface (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;deleting&#x60; \\| &#x60;deleted&#x60; \\| &#x60;confirming&#x60; \\| &#x60;rejected&#x60; \\| &#x60;expired&#x60;). |  [optional] |
|**virtualGatewayId** | **String** | The ID of the target virtual gateway. |  [optional] |
|**vlan** | **Integer** | The VLAN number associated with the DirectLink interface. |  [optional] |






# ClientGateway

Information about the client gateway.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bgpAsn** | **Integer** | The Autonomous System Number (ASN) used by the Border Gateway Protocol (BGP) to find the path to your client gateway through the Internet. |  [optional] |
|**clientGatewayId** | **String** | The ID of the client gateway. |  [optional] |
|**connectionType** | **String** | The type of communication tunnel used by the client gateway (only &#x60;ipsec.1&#x60; is supported). |  [optional] |
|**publicIp** | **String** | The public IPv4 address of the client gateway (must be a fixed address into a NATed network). |  [optional] |
|**state** | **String** | The state of the client gateway (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;deleting&#x60; \\| &#x60;deleted&#x60;). |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the client gateway. |  [optional] |




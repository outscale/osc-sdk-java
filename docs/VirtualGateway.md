

# VirtualGateway

Information about the virtual gateway.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionType** | **String** | The type of VPN connection supported by the virtual gateway (only &#x60;ipsec.1&#x60; is supported). |  [optional] |
|**netToVirtualGatewayLinks** | [**List&lt;NetToVirtualGatewayLink&gt;**](NetToVirtualGatewayLink.md) | The Net to which the virtual gateway is attached. |  [optional] |
|**state** | **String** | The state of the virtual gateway (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;deleting&#x60; \\| &#x60;deleted&#x60;). |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the virtual gateway. |  [optional] |
|**virtualGatewayId** | **String** | The ID of the virtual gateway. |  [optional] |




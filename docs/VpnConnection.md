

# VpnConnection

Information about a VPN connection.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientGatewayConfiguration** | **String** | Example configuration for the client gateway. |  [optional] |
|**clientGatewayId** | **String** | The ID of the client gateway used on the client end of the connection. |  [optional] |
|**connectionType** | **String** | The type of VPN connection (always &#x60;ipsec.1&#x60;). |  [optional] |
|**routes** | [**List&lt;RouteLight&gt;**](RouteLight.md) | Information about one or more static routes associated with the VPN connection, if any. |  [optional] |
|**state** | **String** | The state of the VPN connection (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;deleting&#x60; \\| &#x60;deleted&#x60;). |  [optional] |
|**staticRoutesOnly** | **Boolean** | If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](#createvpnconnectionroute) and [DeleteVpnConnectionRoute](#deletevpnconnectionroute). |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the VPN connection. |  [optional] |
|**vgwTelemetries** | [**List&lt;VgwTelemetry&gt;**](VgwTelemetry.md) | Information about the current state of one or more of the VPN tunnels. |  [optional] |
|**virtualGatewayId** | **String** | The ID of the virtual gateway used on the OUTSCALE end of the connection. |  [optional] |
|**vpnConnectionId** | **String** | The ID of the VPN connection. |  [optional] |
|**vpnOptions** | [**VpnOptions**](VpnOptions.md) |  |  [optional] |




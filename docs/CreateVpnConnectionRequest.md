

# CreateVpnConnectionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientGatewayId** | **String** | The ID of the client gateway. |  |
|**connectionType** | **String** | The type of VPN connection (always &#x60;ipsec.1&#x60;). |  |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**staticRoutesOnly** | **Boolean** | By default or if false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If true, routing is controlled using static routes. For more information about how to create and delete static routes, see [CreateVpnConnectionRoute](#createvpnconnectionroute) and [DeleteVpnConnectionRoute](#deletevpnconnectionroute). |  [optional] |
|**virtualGatewayId** | **String** | The ID of the virtual gateway. |  |




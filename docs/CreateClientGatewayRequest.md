

# CreateClientGatewayRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bgpAsn** | **Integer** | The Autonomous System Number (ASN) used by the Border Gateway Protocol (BGP) to find the path to your client gateway through the Internet. This number must be between &#x60;1&#x60; and &#x60;4294967295&#x60;. |  |
|**connectionType** | **String** | The communication protocol used to establish tunnel with your client gateway (only &#x60;ipsec.1&#x60; is supported). |  |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**publicIp** | **String** | The public fixed IPv4 address of your client gateway. |  |




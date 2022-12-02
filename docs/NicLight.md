

# NicLight

Information about the network interface card (NIC).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The account ID of the owner of the NIC. |  [optional] |
|**description** | **String** | The description of the NIC. |  [optional] |
|**isSourceDestChecked** | **Boolean** | (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net. |  [optional] |
|**linkNic** | [**LinkNicLight**](LinkNicLight.md) |  |  [optional] |
|**linkPublicIp** | [**LinkPublicIpLightForVm**](LinkPublicIpLightForVm.md) |  |  [optional] |
|**macAddress** | **String** | The Media Access Control (MAC) address of the NIC. |  [optional] |
|**netId** | **String** | The ID of the Net for the NIC. |  [optional] |
|**nicId** | **String** | The ID of the NIC. |  [optional] |
|**privateDnsName** | **String** | The name of the private DNS. |  [optional] |
|**privateIps** | [**List&lt;PrivateIpLightForVm&gt;**](PrivateIpLightForVm.md) | The private IP or IPs of the NIC. |  [optional] |
|**securityGroups** | [**List&lt;SecurityGroupLight&gt;**](SecurityGroupLight.md) | One or more IDs of security groups for the NIC. |  [optional] |
|**state** | **String** | The state of the NIC (&#x60;available&#x60; \\| &#x60;attaching&#x60; \\| &#x60;in-use&#x60; \\| &#x60;detaching&#x60;). |  [optional] |
|**subnetId** | **String** | The ID of the Subnet for the NIC. |  [optional] |




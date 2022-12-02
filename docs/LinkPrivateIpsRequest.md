

# LinkPrivateIpsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowRelink** | **Boolean** | If true, allows an IP that is already assigned to another NIC in the same Subnet to be assigned to the NIC you specified. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**nicId** | **String** | The ID of the NIC. |  |
|**privateIps** | **List&lt;String&gt;** | The secondary private IP or IPs you want to assign to the NIC within the IP range of the Subnet. |  [optional] |
|**secondaryPrivateIpCount** | **Integer** | The number of secondary private IPs to assign to the NIC. |  [optional] |






# NicForVmCreation

Information about the network interface card (NIC) when creating a virtual machine (VM).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteOnVmDeletion** | **Boolean** | If true, the NIC is deleted when the VM is terminated. You can specify this parameter only for a new NIC. To modify this value for an existing NIC, see [UpdateNic](#updatenic). |  [optional] |
|**description** | **String** | The description of the NIC, if you are creating a NIC when creating the VM. |  [optional] |
|**deviceNumber** | **Integer** | The index of the VM device for the NIC attachment (between &#x60;0&#x60; and &#x60;7&#x60;, both included). This parameter is required if you create a NIC when creating the VM. |  [optional] |
|**nicId** | **String** | The ID of the NIC, if you are attaching an existing NIC when creating a VM. |  [optional] |
|**privateIps** | [**List&lt;PrivateIpLight&gt;**](PrivateIpLight.md) | One or more private IPs to assign to the NIC, if you create a NIC when creating a VM. Only one private IP can be the primary private IP. |  [optional] |
|**secondaryPrivateIpCount** | **Integer** | The number of secondary private IPs, if you create a NIC when creating a VM. This parameter cannot be specified if you specified more than one private IP in the &#x60;PrivateIps&#x60; parameter. |  [optional] |
|**securityGroupIds** | **List&lt;String&gt;** | One or more IDs of security groups for the NIC, if you create a NIC when creating a VM. |  [optional] |
|**subnetId** | **String** | The ID of the Subnet for the NIC, if you create a NIC when creating a VM. This parameter is required if you create a NIC when creating the VM. |  [optional] |






# CreateNicRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for the NIC. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**privateIps** | [**List&lt;PrivateIpLight&gt;**](PrivateIpLight.md) | The primary private IP for the NIC.&lt;br /&gt; This IP must be within the IP range of the Subnet that you specify with the &#x60;SubnetId&#x60; attribute.&lt;br /&gt; If you do not specify this attribute, a random private IP is selected within the IP range of the Subnet. |  [optional] |
|**securityGroupIds** | **List&lt;String&gt;** | One or more IDs of security groups for the NIC. |  [optional] |
|**subnetId** | **String** | The ID of the Subnet in which you want to create the NIC. |  |




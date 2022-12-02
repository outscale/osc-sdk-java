

# Subnet

Information about the Subnet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**availableIpsCount** | **Integer** | The number of available IPs in the Subnets. |  [optional] |
|**ipRange** | **String** | The IP range in the Subnet, in CIDR notation (for example, &#x60;10.0.0.0/16&#x60;). |  [optional] |
|**mapPublicIpOnLaunch** | **Boolean** | If true, a public IP is assigned to the network interface cards (NICs) created in the specified Subnet. |  [optional] |
|**netId** | **String** | The ID of the Net in which the Subnet is. |  [optional] |
|**state** | **String** | The state of the Subnet (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;deleted&#x60;). |  [optional] |
|**subnetId** | **String** | The ID of the Subnet. |  [optional] |
|**subregionName** | **String** | The name of the Subregion in which the Subnet is located. |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the Subnet. |  [optional] |




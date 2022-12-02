

# CreateLoadBalancerRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**listeners** | [**List&lt;ListenerForCreation&gt;**](ListenerForCreation.md) | One or more listeners to create. |  |
|**loadBalancerName** | **String** | The unique name of the load balancer (32 alphanumeric or hyphen characters maximum, but cannot start or end with a hyphen). |  |
|**loadBalancerType** | **String** | The type of load balancer: &#x60;internet-facing&#x60; or &#x60;internal&#x60;. Use this parameter only for load balancers in a Net. |  [optional] |
|**publicIp** | **String** | (internet-facing only) The public IP you want to associate with the load balancer. If not specified, a public IP owned by 3DS OUTSCALE is associated. |  [optional] |
|**securityGroups** | **List&lt;String&gt;** | (Net only) One or more IDs of security groups you want to assign to the load balancer. If not specified, the default security group of the Net is assigned to the load balancer. |  [optional] |
|**subnets** | **List&lt;String&gt;** | (Net only) The ID of the Subnet in which you want to create the load balancer. Regardless of this Subnet, the load balancer can distribute traffic to all Subnets. This parameter is required in a Net. |  [optional] |
|**subregionNames** | **List&lt;String&gt;** | (public Cloud only) The Subregion in which you want to create the load balancer. Regardless of this Subregion, the load balancer can distribute traffic to all Subregions. This parameter is required in the public Cloud. |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags assigned to the load balancer. |  [optional] |






# LoadBalancer

Information about the load balancer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessLog** | [**AccessLog**](AccessLog.md) |  |  [optional] |
|**applicationStickyCookiePolicies** | [**List&lt;ApplicationStickyCookiePolicy&gt;**](ApplicationStickyCookiePolicy.md) | The stickiness policies defined for the load balancer. |  [optional] |
|**backendIps** | **List&lt;String&gt;** | One or more public IPs of backend VMs. |  [optional] |
|**backendVmIds** | **List&lt;String&gt;** | One or more IDs of backend VMs for the load balancer. |  [optional] |
|**dnsName** | **String** | The DNS name of the load balancer. |  [optional] |
|**healthCheck** | [**HealthCheck**](HealthCheck.md) |  |  [optional] |
|**listeners** | [**List&lt;Listener&gt;**](Listener.md) | The listeners for the load balancer. |  [optional] |
|**loadBalancerName** | **String** | The name of the load balancer. |  [optional] |
|**loadBalancerStickyCookiePolicies** | [**List&lt;LoadBalancerStickyCookiePolicy&gt;**](LoadBalancerStickyCookiePolicy.md) | The policies defined for the load balancer. |  [optional] |
|**loadBalancerType** | **String** | The type of load balancer. Valid only for load balancers in a Net.&lt;br /&gt; If &#x60;LoadBalancerType&#x60; is &#x60;internet-facing&#x60;, the load balancer has a public DNS name that resolves to a public IP.&lt;br /&gt; If &#x60;LoadBalancerType&#x60; is &#x60;internal&#x60;, the load balancer has a public DNS name that resolves to a private IP. |  [optional] |
|**netId** | **String** | The ID of the Net for the load balancer. |  [optional] |
|**publicIp** | **String** | (internet-facing only) The public IP associated with the load balancer. |  [optional] |
|**securedCookies** | **Boolean** | Whether secure cookies are enabled for the load balancer. |  [optional] |
|**securityGroups** | **List&lt;String&gt;** | One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net. |  [optional] |
|**sourceSecurityGroup** | [**SourceSecurityGroup**](SourceSecurityGroup.md) |  |  [optional] |
|**subnets** | **List&lt;String&gt;** | The ID of the Subnet in which the load balancer was created. |  [optional] |
|**subregionNames** | **List&lt;String&gt;** | The ID of the Subregion in which the load balancer was created. |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the load balancer. |  [optional] |




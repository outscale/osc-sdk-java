

# CreateLoadBalancerPolicyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cookieExpirationPeriod** | **Integer** | The lifetime of the cookie, in seconds. If not specified, the default value of this parameter is &#x60;1&#x60;, which means that the sticky session lasts for the duration of the browser session. |  [optional] |
|**cookieName** | **String** | The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**loadBalancerName** | **String** | The name of the load balancer for which you want to create a policy. |  |
|**policyName** | **String** | The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-). |  |
|**policyType** | **String** | The type of stickiness policy you want to create: &#x60;app&#x60; or &#x60;load_balancer&#x60;. |  |




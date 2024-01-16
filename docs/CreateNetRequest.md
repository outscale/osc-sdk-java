

# CreateNetRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**ipRange** | **String** | The IP range for the Net, in CIDR notation (for example, &#x60;10.0.0.0/16&#x60;). |  |
|**tenancy** | **String** | The tenancy options for the VMs:&lt;br /&gt; - &#x60;default&#x60; if a VM created in a Net can be launched with any tenancy.&lt;br /&gt; - &#x60;dedicated&#x60; if it can be launched with dedicated tenancy VMs running on single-tenant hardware.&lt;br /&gt; - &#x60;dedicated group ID&#x60;: if it can be launched in a dedicated group on single-tenant hardware. |  [optional] |






# CreateVmGroupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for the VM group. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**positioningStrategy** | [**PositioningStrategyEnum**](#PositioningStrategyEnum) | The positioning strategy of VMs on hypervisors. By default, or if set to &#x60;no-strategy&#x60; our orchestrator determines the most adequate position for your VMs. If set to &#x60;attract&#x60;, your VMs are deployed on the same hypervisor, which improves network performance. If set to &#x60;repulse&#x60;, your VMs are deployed on a different hypervisor, which improves fault tolerance. |  [optional] |
|**securityGroupIds** | **List&lt;String&gt;** | One or more IDs of security groups for the VM group. |  |
|**subnetId** | **String** | The ID of the Subnet in which you want to create the VM group. |  |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags to add to the VM group. |  [optional] |
|**vmCount** | **Integer** | The number of VMs deployed in the VM group. |  |
|**vmGroupName** | **String** | The name of the VM group. |  |
|**vmTemplateId** | **String** | The ID of the VM template used to launch VMs in the VM group. |  |



## Enum: PositioningStrategyEnum

| Name | Value |
|---- | -----|
| ATTRACT | &quot;attract&quot; |
| NO_STRATEGY | &quot;no-strategy&quot; |
| REPULSE | &quot;repulse&quot; |




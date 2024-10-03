

# VmGroup

Information about the VM group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creationDate** | **String** | The date and time (UTC) at which the VM group was created. |  [optional] |
|**description** | **String** | The description of the VM group. |  [optional] |
|**positioningStrategy** | [**PositioningStrategyEnum**](#PositioningStrategyEnum) | The positioning strategy of the VMs on hypervisors. By default, or if set to &#x60;no-strategy&#x60;, TINA determines the most adequate position for the VMs. If set to &#x60;attract&#x60;, the VMs are deployed on the same hypervisor, which improves network performance. If set to &#x60;repulse&#x60;, the VMs are deployed on a different hypervisor, which improves fault tolerance. |  [optional] |
|**securityGroupIds** | **List&lt;String&gt;** | One or more IDs of security groups for the VM group. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state of the VM group (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;scaling up&#x60; \\| &#x60;scaling down&#x60; \\| &#x60;deleting&#x60; \\| &#x60;deleted&#x60;). |  [optional] |
|**subnetId** | **String** | The ID of the Subnet for the VM group. |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the VM. |  [optional] |
|**vmCount** | **Integer** | The number of VMs in the VM group. |  [optional] |
|**vmGroupId** | **String** | The ID of the VM group. |  [optional] |
|**vmGroupName** | **String** | The name of the VM group. |  [optional] |
|**vmIds** | **List&lt;String&gt;** | The IDs of the VMs in the VM group. |  [optional] |
|**vmTemplateId** | **String** | The ID of the VM template used by the VM group. |  [optional] |



## Enum: PositioningStrategyEnum

| Name | Value |
|---- | -----|
| ATTRACT | &quot;attract&quot; |
| NO_STRATEGY | &quot;no-strategy&quot; |
| REPULSE | &quot;repulse&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| DELETED | &quot;deleted&quot; |
| DELETING | &quot;deleting&quot; |
| PENDING | &quot;pending&quot; |
| SCALING_DOWN | &quot;scaling down&quot; |
| SCALING_UP | &quot;scaling up&quot; |






# CreateVmTemplateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cpuCores** | **Integer** | The number of vCores to use for each VM. |  |
|**cpuGeneration** | **String** | The processor generation to use for each VM (for example, &#x60;v4&#x60;). |  |
|**cpuPerformance** | [**CpuPerformanceEnum**](#CpuPerformanceEnum) | The performance of the VMs (&#x60;medium&#x60; \\| &#x60;high&#x60; \\|  &#x60;highest&#x60;). |  [optional] |
|**description** | **String** | A description for the VM template. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**imageId** | **String** | The ID of the OMI to use for each VM. You can find a list of OMIs by calling the [ReadImages](#readimages) method. |  |
|**keypairName** | **String** | The name of the keypair to use for each VM. |  [optional] |
|**ram** | **Integer** | The amount of RAM to use for each VM. |  |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags to add to the VM template. |  [optional] |
|**vmTemplateName** | **String** | The name of the VM template. |  |



## Enum: CpuPerformanceEnum

| Name | Value |
|---- | -----|
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| HIGHEST | &quot;highest&quot; |




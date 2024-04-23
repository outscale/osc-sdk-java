

# VmTemplate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cpuCores** | **Integer** | The number of vCores. |  |
|**cpuGeneration** | **String** | The processor generation. |  |
|**cpuPerformance** | [**CpuPerformanceEnum**](#CpuPerformanceEnum) | The performance of the VMs. |  [optional] |
|**creationDate** | **OffsetDateTime** | The date and time (UTC) of creation of the VM template. |  [optional] |
|**description** | **String** | The description of the VM template. |  [optional] |
|**imageId** | **String** | The ID of the OMI. |  |
|**keypairName** | **String** | The name of the keypair. |  [optional] |
|**ram** | **Integer** | The amount of RAM. |  |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the VM template. |  [optional] |
|**vmTemplateId** | **String** | The ID of the VM template. |  |
|**vmTemplateName** | **String** | The name of the VM template. |  |



## Enum: CpuPerformanceEnum

| Name | Value |
|---- | -----|
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| HIGHEST | &quot;highest&quot; |




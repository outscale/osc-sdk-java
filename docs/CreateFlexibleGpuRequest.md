

# CreateFlexibleGpuRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteOnVmDeletion** | **Boolean** | If true, the fGPU is deleted when the VM is terminated. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**generation** | **String** | The processor generation that the fGPU must be compatible with. If not specified, the oldest possible processor generation is selected (as provided by [ReadFlexibleGpuCatalog](#readflexiblegpucatalog) for the specified model of fGPU). |  [optional] |
|**modelName** | **String** | The model of fGPU you want to allocate. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html). |  |
|**subregionName** | **String** | The Subregion in which you want to create the fGPU. |  |




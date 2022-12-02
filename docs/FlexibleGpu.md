

# FlexibleGpu

Information about the flexible GPU (fGPU).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteOnVmDeletion** | **Boolean** | If true, the fGPU is deleted when the VM is terminated. |  [optional] |
|**flexibleGpuId** | **String** | The ID of the fGPU. |  [optional] |
|**generation** | **String** | The compatible processor generation. |  [optional] |
|**modelName** | **String** | The model of fGPU. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html). |  [optional] |
|**state** | **String** | The state of the fGPU (&#x60;allocated&#x60; \\| &#x60;attaching&#x60; \\| &#x60;attached&#x60; \\| &#x60;detaching&#x60;). |  [optional] |
|**subregionName** | **String** | The Subregion where the fGPU is located. |  [optional] |
|**vmId** | **String** | The ID of the VM the fGPU is attached to, if any. |  [optional] |




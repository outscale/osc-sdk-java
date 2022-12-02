

# FiltersFlexibleGpu

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deleteOnVmDeletion** | **Boolean** | Indicates whether the fGPU is deleted when terminating the VM. |  [optional] |
|**flexibleGpuIds** | **List&lt;String&gt;** | One or more IDs of fGPUs. |  [optional] |
|**generations** | **List&lt;String&gt;** | The processor generations that the fGPUs are compatible with. |  [optional] |
|**modelNames** | **List&lt;String&gt;** | One or more models of fGPUs. For more information, see [About Flexible GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html). |  [optional] |
|**states** | **List&lt;String&gt;** | The states of the fGPUs (&#x60;allocated&#x60; \\| &#x60;attaching&#x60; \\| &#x60;attached&#x60; \\| &#x60;detaching&#x60;). |  [optional] |
|**subregionNames** | **List&lt;String&gt;** | The Subregions where the fGPUs are located. |  [optional] |
|**vmIds** | **List&lt;String&gt;** | One or more IDs of VMs. |  [optional] |




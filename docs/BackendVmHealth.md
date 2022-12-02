

# BackendVmHealth

Information about the health of a back-end VM.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the state of the back-end VM. |  [optional] |
|**state** | **String** | The state of the back-end VM (&#x60;InService&#x60; \\| &#x60;OutOfService&#x60; \\| &#x60;Unknown&#x60;). |  [optional] |
|**stateReason** | **String** | Information about the cause of &#x60;OutOfService&#x60; VMs.&lt;br /&gt; Specifically, whether the cause is Elastic Load Balancing or the VM (&#x60;ELB&#x60; \\| &#x60;Instance&#x60; \\| &#x60;N/A&#x60;). |  [optional] |
|**vmId** | **String** | The ID of the back-end VM. |  [optional] |






# LinkPublicIpRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowRelink** | **Boolean** | If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.) |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**nicId** | **String** | (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the &#x60;VmId&#x60; parameter instead. You cannot specify both parameters at the same time. |  [optional] |
|**privateIp** | **String** | (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP. |  [optional] |
|**publicIp** | **String** | The public IP. This parameter is required unless you use the &#x60;PublicIpId&#x60; parameter. |  [optional] |
|**publicIpId** | **String** | The allocation ID of the public IP. This parameter is required unless you use the &#x60;PublicIp&#x60; parameter. |  [optional] |
|**vmId** | **String** | The ID of the VM.&lt;br /&gt; - In the public Cloud, this parameter is required.&lt;br /&gt; - In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the &#x60;NicId&#x60; parameter instead. You cannot specify both parameters at the same time. |  [optional] |




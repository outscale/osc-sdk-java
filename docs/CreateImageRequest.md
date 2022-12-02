

# CreateImageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**architecture** | **String** | The architecture of the OMI (by default, &#x60;i386&#x60; if you specified the &#x60;FileLocation&#x60; or &#x60;RootDeviceName&#x60; parameter). |  [optional] |
|**blockDeviceMappings** | [**List&lt;BlockDeviceMappingImage&gt;**](BlockDeviceMappingImage.md) | One or more block device mappings. |  [optional] |
|**description** | **String** | A description for the new OMI. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**fileLocation** | **String** | The pre-signed URL of the OMI manifest file, or the full path to the OMI stored in a bucket. If you specify this parameter, a copy of the OMI is created in your account. You must specify only one of the following parameters: &#x60;FileLocation&#x60;, &#x60;RootDeviceName&#x60;, &#x60;SourceImageId&#x60; or &#x60;VmId&#x60;. |  [optional] |
|**imageName** | **String** | A unique name for the new OMI.&lt;br /&gt; Constraints: 3-128 alphanumeric characters, underscores (_), spaces ( ), parentheses (()), slashes (/), periods (.), or dashes (-). |  [optional] |
|**noReboot** | **Boolean** | If false, the VM shuts down before creating the OMI and then reboots. If true, the VM does not. |  [optional] |
|**rootDeviceName** | **String** | The name of the root device. You must specify only one of the following parameters: &#x60;FileLocation&#x60;, &#x60;RootDeviceName&#x60;, &#x60;SourceImageId&#x60; or &#x60;VmId&#x60;. |  [optional] |
|**sourceImageId** | **String** | The ID of the OMI you want to copy. You must specify only one of the following parameters: &#x60;FileLocation&#x60;, &#x60;RootDeviceName&#x60;, &#x60;SourceImageId&#x60; or &#x60;VmId&#x60;. |  [optional] |
|**sourceRegionName** | **String** | The name of the source Region, which must be the same as the Region of your account. |  [optional] |
|**vmId** | **String** | The ID of the VM from which you want to create the OMI. You must specify only one of the following parameters: &#x60;FileLocation&#x60;, &#x60;RootDeviceName&#x60;, &#x60;SourceImageId&#x60; or &#x60;VmId&#x60;. |  [optional] |




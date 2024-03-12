

# CreateImageRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**architecture** | **String** | **(when registering from a snapshot, or from a bucket without using a manifest file)** The architecture of the OMI (&#x60;i386&#x60; or &#x60;x86_64&#x60;). |  [optional] |
|**blockDeviceMappings** | [**List&lt;BlockDeviceMappingImage&gt;**](BlockDeviceMappingImage.md) | **(when registering from a snapshot, or from a bucket without using a manifest file)** One or more block device mappings. |  [optional] |
|**description** | **String** | A description for the new OMI. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**fileLocation** | **String** | **(when registering from a bucket by using a manifest file)** The pre-signed URL of the manifest file for the OMI you want to register. For more information, see [Configuring a Pre-signed URL](https://docs.outscale.com/en/userguide/Configuring-a-Pre-signed-URL.html) or [Managing Access to Your Buckets and Objects](https://docs.outscale.com/en/userguide/Managing-Access-to-Your-Buckets-and-Objects.html).&lt;br /&gt; You can also specify the normal URL of the OMI if you have permission on the OOS bucket, without using the manifest file, but in that case, you need to manually specify through the other parameters all the information that would otherwise be read from the manifest file. |  [optional] |
|**imageName** | **String** | A unique name for the new OMI.&lt;br /&gt; Constraints: 3-128 alphanumeric characters, underscores (&#x60;_&#x60;), spaces (&#x60; &#x60;), parentheses (&#x60;()&#x60;), slashes (&#x60;/&#x60;), periods (&#x60;.&#x60;), or dashes (&#x60;-&#x60;). |  [optional] |
|**noReboot** | **Boolean** | **(when creating from a VM)** If false, the VM shuts down before creating the OMI and then reboots. If true, the VM does not. |  [optional] |
|**productCodes** | **List&lt;String&gt;** | The product codes associated with the OMI. |  [optional] |
|**rootDeviceName** | **String** | **(when registering from a snapshot, or from a bucket without using a manifest file)** The name of the root device for the new OMI. |  [optional] |
|**sourceImageId** | **String** | **(when copying an OMI)** The ID of the OMI you want to copy. |  [optional] |
|**sourceRegionName** | **String** | **(when copying an OMI)** The name of the source Region (always the same as the Region of your account). |  [optional] |
|**vmId** | **String** | **(when creating from a VM)** The ID of the VM from which you want to create the OMI. |  [optional] |




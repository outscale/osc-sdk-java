

# Image

Information about the OMI.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountAlias** | **String** | The account alias of the owner of the OMI. |  [optional] |
|**accountId** | **String** | The account ID of the owner of the OMI. |  [optional] |
|**architecture** | **String** | The architecture of the OMI. |  [optional] |
|**blockDeviceMappings** | [**List&lt;BlockDeviceMappingImage&gt;**](BlockDeviceMappingImage.md) | One or more block device mappings. |  [optional] |
|**creationDate** | **OffsetDateTime** | The date and time of creation of the OMI, in ISO 8601 date-time format. |  [optional] |
|**description** | **String** | The description of the OMI. |  [optional] |
|**fileLocation** | **String** | The location from which the OMI files were created. |  [optional] |
|**imageId** | **String** | The ID of the OMI. |  [optional] |
|**imageName** | **String** | The name of the OMI. |  [optional] |
|**imageType** | **String** | The type of the OMI. |  [optional] |
|**permissionsToLaunch** | [**PermissionsOnResource**](PermissionsOnResource.md) |  |  [optional] |
|**productCodes** | **List&lt;String&gt;** | The product codes associated with the OMI. |  [optional] |
|**rootDeviceName** | **String** | The name of the root device. |  [optional] |
|**rootDeviceType** | **String** | The type of root device used by the OMI (always &#x60;bsu&#x60;). |  [optional] |
|**state** | **String** | The state of the OMI (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;failed&#x60;). |  [optional] |
|**stateComment** | [**StateComment**](StateComment.md) |  |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the OMI. |  [optional] |




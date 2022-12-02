

# ImageExportTask

Information about the OMI export task.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comment** | **String** | If the OMI export task fails, an error message appears. |  [optional] |
|**imageId** | **String** | The ID of the OMI to be exported. |  [optional] |
|**osuExport** | [**OsuExportImageExportTask**](OsuExportImageExportTask.md) |  |  [optional] |
|**progress** | **Integer** | The progress of the OMI export task, as a percentage. |  [optional] |
|**state** | **String** | The state of the OMI export task (&#x60;pending/queued&#x60; \\| &#x60;pending&#x60; \\| &#x60;completed&#x60; \\| &#x60;failed&#x60; \\| &#x60;cancelled&#x60;). |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the image export task. |  [optional] |
|**taskId** | **String** | The ID of the OMI export task. |  [optional] |




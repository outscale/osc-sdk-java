

# Volume

Information about the volume.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creationDate** | **String** | The date and time (UTC) at which the volume was created. |  [optional] |
|**iops** | **Integer** | The number of I/O operations per second (IOPS):&lt;br /&gt; - For &#x60;io1&#x60; volumes, the number of provisioned IOPS&lt;br /&gt; - For &#x60;gp2&#x60; volumes, the baseline performance of the volume |  [optional] |
|**linkedVolumes** | [**List&lt;LinkedVolume&gt;**](LinkedVolume.md) | Information about your volume attachment. |  [optional] |
|**size** | **Integer** | The size of the volume, in gibibytes (GiB). |  [optional] |
|**snapshotId** | **String** | The snapshot from which the volume was created. |  [optional] |
|**state** | **String** | The state of the volume (&#x60;creating&#x60; \\| &#x60;available&#x60; \\| &#x60;in-use&#x60; \\| &#x60;updating&#x60; \\| &#x60;deleting&#x60; \\| &#x60;error&#x60;). |  [optional] |
|**subregionName** | **String** | The Subregion in which the volume was created. |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the volume. |  [optional] |
|**volumeId** | **String** | The ID of the volume. |  [optional] |
|**volumeType** | **String** | The type of the volume (&#x60;standard&#x60; \\| &#x60;gp2&#x60; \\| &#x60;io1&#x60;). |  [optional] |




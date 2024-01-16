

# UpdateVolumeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**iops** | **Integer** | **Cold volume**: the new number of I/O operations per second (IOPS). This parameter can be specified only if you update an &#x60;io1&#x60; volume or if you change the type of the volume for an &#x60;io1&#x60;. This modification is instantaneous. &lt;br /&gt; **Hot volume**: the new number of I/O operations per second (IOPS). This parameter can be specified only if you update an &#x60;io1&#x60; volume. This modification is not instantaneous. &lt;br /&gt;&lt;br /&gt; The maximum number of IOPS allowed for &#x60;io1&#x60; volumes is &#x60;13000&#x60; with a maximum performance ratio of 300 IOPS per gibibyte. |  [optional] |
|**size** | **Integer** | **Cold volume**: the new size of the volume, in gibibytes (GiB). This value must be equal to or greater than the current size of the volume. This modification is not instantaneous. &lt;br /&gt; **Hot volume**: you cannot change the size of a hot volume. |  [optional] |
|**volumeId** | **String** | The ID of the volume you want to update. |  |
|**volumeType** | **String** | **Cold volume**: the new type of the volume (&#x60;standard&#x60; \\| &#x60;io1&#x60; \\| &#x60;gp2&#x60;). This modification is instantaneous. If you update to an &#x60;io1&#x60; volume, you must also specify the &#x60;Iops&#x60; parameter.&lt;br /&gt; **Hot volume**: you cannot change the type of a hot volume. |  [optional] |




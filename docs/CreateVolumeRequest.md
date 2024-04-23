

# CreateVolumeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**iops** | **Integer** | The number of I/O operations per second (IOPS). This parameter must be specified only if you create an &#x60;io1&#x60; volume. The maximum number of IOPS allowed for &#x60;io1&#x60; volumes is &#x60;13000&#x60; with a maximum performance ratio of 300 IOPS per gibibyte. |  [optional] |
|**size** | **Integer** | The size of the volume, in gibibytes (GiB). The maximum allowed size for a volume is 14901 GiB. This parameter is required if the volume is not created from a snapshot (&#x60;SnapshotId&#x60; unspecified). |  [optional] |
|**snapshotId** | **String** | The ID of the snapshot from which you want to create the volume. |  [optional] |
|**subregionName** | **String** | The Subregion in which you want to create the volume. |  |
|**volumeType** | **String** | The type of volume you want to create (&#x60;io1&#x60; \\| &#x60;gp2&#x60; \\| &#x60;standard&#x60;). If not specified, a &#x60;standard&#x60; volume is created.&lt;br /&gt; For more information about volume types, see [About Volumes &gt; Volume Types and IOPS](https://docs.outscale.com/en/userguide/About-Volumes.html#_volume_types_and_iops). |  [optional] |




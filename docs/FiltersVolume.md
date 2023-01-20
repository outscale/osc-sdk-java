

# FiltersVolume

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creationDates** | **List&lt;OffsetDateTime&gt;** | The dates and times of creation of the volumes. |  [optional] |
|**linkVolumeDeleteOnVmDeletion** | **Boolean** | Whether the volumes are deleted or not when terminating the VMs. |  [optional] |
|**linkVolumeDeviceNames** | **List&lt;String&gt;** | The VM device names. |  [optional] |
|**linkVolumeLinkDates** | **List&lt;OffsetDateTime&gt;** | The dates and times of creation of the volumes. |  [optional] |
|**linkVolumeLinkStates** | **List&lt;String&gt;** | The attachment states of the volumes (&#x60;attaching&#x60; \\| &#x60;detaching&#x60; \\| &#x60;attached&#x60; \\| &#x60;detached&#x60;). |  [optional] |
|**linkVolumeVmIds** | **List&lt;String&gt;** | One or more IDs of VMs. |  [optional] |
|**snapshotIds** | **List&lt;String&gt;** | The snapshots from which the volumes were created. |  [optional] |
|**subregionNames** | **List&lt;String&gt;** | The names of the Subregions in which the volumes were created. |  [optional] |
|**tagKeys** | **List&lt;String&gt;** | The keys of the tags associated with the volumes. |  [optional] |
|**tagValues** | **List&lt;String&gt;** | The values of the tags associated with the volumes. |  [optional] |
|**tags** | **List&lt;String&gt;** | The key/value combination of the tags associated with the volumes, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}. |  [optional] |
|**volumeIds** | **List&lt;String&gt;** | The IDs of the volumes. |  [optional] |
|**volumeSizes** | **List&lt;Integer&gt;** | The sizes of the volumes, in gibibytes (GiB). |  [optional] |
|**volumeStates** | **List&lt;String&gt;** | The states of the volumes (&#x60;creating&#x60; \\| &#x60;available&#x60; \\| &#x60;in-use&#x60; \\| &#x60;updating&#x60; \\| &#x60;deleting&#x60; \\| &#x60;error&#x60;). |  [optional] |
|**volumeTypes** | **List&lt;String&gt;** | The types of the volumes (&#x60;standard&#x60; \\| &#x60;gp2&#x60; \\| &#x60;io1&#x60;). |  [optional] |






# FiltersSnapshot

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountAliases** | **List&lt;String&gt;** | The account aliases of the owners of the snapshots. |  [optional] |
|**accountIds** | **List&lt;String&gt;** | The account IDs of the owners of the snapshots. |  [optional] |
|**descriptions** | **List&lt;String&gt;** | The descriptions of the snapshots. |  [optional] |
|**fromCreationDate** | **OffsetDateTime** | The beginning of the time period, in ISO 8601 date-time format (for example, &#x60;2020-06-14T00:00:00.000Z&#x60;). |  [optional] |
|**permissionsToCreateVolumeAccountIds** | **List&lt;String&gt;** | The account IDs of one or more users who have permissions to create volumes. |  [optional] |
|**permissionsToCreateVolumeGlobalPermission** | **Boolean** | If true, lists all public volumes. If false, lists all private volumes. |  [optional] |
|**progresses** | **List&lt;Integer&gt;** | The progresses of the snapshots, as a percentage. |  [optional] |
|**snapshotIds** | **List&lt;String&gt;** | The IDs of the snapshots. |  [optional] |
|**states** | **List&lt;String&gt;** | The states of the snapshots (&#x60;in-queue&#x60; \\| &#x60;completed&#x60; \\| &#x60;error&#x60;). |  [optional] |
|**tagKeys** | **List&lt;String&gt;** | The keys of the tags associated with the snapshots. |  [optional] |
|**tagValues** | **List&lt;String&gt;** | The values of the tags associated with the snapshots. |  [optional] |
|**tags** | **List&lt;String&gt;** | The key/value combination of the tags associated with the snapshots, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}. |  [optional] |
|**toCreationDate** | **OffsetDateTime** | The end of the time period, in ISO 8601 date-time format (for example, &#x60;2020-06-30T00:00:00.000Z&#x60;). |  [optional] |
|**volumeIds** | **List&lt;String&gt;** | The IDs of the volumes used to create the snapshots. |  [optional] |
|**volumeSizes** | **List&lt;Integer&gt;** | The sizes of the volumes used to create the snapshots, in gibibytes (GiB). |  [optional] |




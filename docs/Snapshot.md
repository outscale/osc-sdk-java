

# Snapshot

Information about the snapshot.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountAlias** | **String** | The account alias of the owner of the snapshot. |  [optional] |
|**accountId** | **String** | The account ID of the owner of the snapshot. |  [optional] |
|**creationDate** | **String** | The date and time (UTC) at which the snapshot was created. |  [optional] |
|**description** | **String** | The description of the snapshot. |  [optional] |
|**permissionsToCreateVolume** | [**PermissionsOnResource**](PermissionsOnResource.md) |  |  [optional] |
|**progress** | **Integer** | The progress of the snapshot, as a percentage. |  [optional] |
|**snapshotId** | **String** | The ID of the snapshot. |  [optional] |
|**state** | **String** | The state of the snapshot (&#x60;in-queue&#x60; \\| &#x60;pending&#x60; \\| &#x60;completed&#x60; \\| &#x60;error&#x60; \\| &#x60;deleting&#x60;)). |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the snapshot. |  [optional] |
|**volumeId** | **String** | The ID of the volume used to create the snapshot. |  [optional] |
|**volumeSize** | **Integer** | The size of the volume used to create the snapshot, in gibibytes (GiB). |  [optional] |




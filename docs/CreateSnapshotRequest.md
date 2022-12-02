

# CreateSnapshotRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for the snapshot. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**fileLocation** | **String** | (When importing) The pre-signed URL of the snapshot you want to import, or the normal URL of the snapshot if you have permission on the OOS bucket. For more information, see [Configuring a Pre-signed URL](https://docs.outscale.com/en/userguide/Configuring-a-Pre-signed-URL.html) or [Managing Access to Your Buckets and Objects](https://docs.outscale.com/en/userguide/Managing-Access-to-Your-Buckets-and-Objects.html). |  [optional] |
|**snapshotSize** | **Long** | (When importing) The size of the snapshot you want to create in your account, in bytes. This size must be greater than or equal to the size of the original, uncompressed snapshot. |  [optional] |
|**sourceRegionName** | **String** | (When copying) The name of the source Region, which must be the same as the Region of your account. |  [optional] |
|**sourceSnapshotId** | **String** | (When copying) The ID of the snapshot you want to copy. |  [optional] |
|**volumeId** | **String** | (When creating) The ID of the volume you want to create a snapshot of. |  [optional] |




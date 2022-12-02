

# UpdateNicRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A new description for the NIC. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**linkNic** | [**LinkNicToUpdate**](LinkNicToUpdate.md) |  |  [optional] |
|**nicId** | **String** | The ID of the NIC you want to modify. |  |
|**securityGroupIds** | **List&lt;String&gt;** | One or more IDs of security groups for the NIC.&lt;br /&gt; You must specify at least one group, even if you use the default security group in the Net. |  [optional] |






# UpdateAccessKeyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessKeyId** | **String** | The ID of the access key. |  |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**expirationDate** | **OffsetDateTime** | The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, &#x60;2020-06-14T00:00:00.000Z&#x60; or &#x60;2020-06-14&#x60;). If not specified, the access key is set to not expire. |  [optional] |
|**state** | **String** | The new state for the access key (&#x60;ACTIVE&#x60; \\| &#x60;INACTIVE&#x60;). When set to &#x60;ACTIVE&#x60;, the access key is enabled and can be used to send requests. When set to &#x60;INACTIVE&#x60;, the access key is disabled. |  |
|**userName** | **String** | The name of the EIM user that the access key you want to modify is associated with. If you do not specify a user name, this action modifies the access key of the user who sends the request (which can be the root account). |  [optional] |






# UpdateAccessKeyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessKeyId** | **String** | The ID of the access key. |  |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**expirationDate** | [**UpdateAccessKeyRequestExpirationDate**](UpdateAccessKeyRequestExpirationDate.md) |  |  [optional] |
|**state** | **String** | The new state for the access key (&#x60;ACTIVE&#x60; \\| &#x60;INACTIVE&#x60;). When set to &#x60;ACTIVE&#x60;, the access key is enabled and can be used to send requests. When set to &#x60;INACTIVE&#x60;, the access key is disabled. |  |




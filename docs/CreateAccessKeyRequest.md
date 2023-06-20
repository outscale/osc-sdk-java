

# CreateAccessKeyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**expirationDate** | **String** | The date and time, or the date, at which you want the access key to expire, in ISO 8601 format (for example, &#x60;2020-06-14T00:00:00.000Z&#x60;, or &#x60;2020-06-14&#x60;). To remove an existing expiration date, use the method without specifying this parameter. |  [optional] |
|**userName** | **String** | The name of the EIM user that owns the key to be created. If you do not specify a user name, this action creates an access key for the user who sends the request (which can be the root account). |  [optional] |




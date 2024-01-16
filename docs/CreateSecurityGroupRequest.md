

# CreateSecurityGroupRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | A description for the security group.&lt;br /&gt; This description can contain between 1 and 255 characters. Allowed characters are &#x60;a-z&#x60;, &#x60;A-Z&#x60;, &#x60;0-9&#x60;, accented letters, spaces, and &#x60;_.-:/()#,@[]+&#x3D;&amp;;{}!$*&#x60;. |  |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**netId** | **String** | The ID of the Net for the security group. |  [optional] |
|**securityGroupName** | **String** | The name of the security group.&lt;br /&gt; This name must not start with &#x60;sg-&#x60;.&lt;br /&gt; This name must be unique and contain between 1 and 255 characters. Allowed characters are &#x60;a-z&#x60;, &#x60;A-Z&#x60;, &#x60;0-9&#x60;, spaces, and &#x60;_.-:/()#,@[]+&#x3D;&amp;;{}!$*&#x60;. |  |




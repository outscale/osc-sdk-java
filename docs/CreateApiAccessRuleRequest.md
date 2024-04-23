

# CreateApiAccessRuleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**caIds** | **List&lt;String&gt;** | One or more IDs of Client Certificate Authorities (CAs). |  [optional] |
|**cns** | **List&lt;String&gt;** | One or more Client Certificate Common Names (CNs). If this parameter is specified, you must also specify the &#x60;CaIds&#x60; parameter. |  [optional] |
|**description** | **String** | A description for the API access rule. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**ipRanges** | **List&lt;String&gt;** | One or more IPs or CIDR blocks (for example, &#x60;192.0.2.0/16&#x60;). |  [optional] |




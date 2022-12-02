

# ReadConsumptionAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**fromDate** | **OffsetDateTime** | The beginning of the time period, in ISO 8601 date-time format (for example, &#x60;2017-06-14&#x60; or &#x60;2017-06-14T00:00:00Z&#x60;). |  |
|**overall** | **Boolean** | By default or if false, returns only the consumption of the specific account that sends this request. If true, returns either the overall consumption of your paying account and all linked accounts (if the account that sends this request is a paying account) or returns nothing (if the account that sends this request is a linked account). |  [optional] |
|**toDate** | **OffsetDateTime** | The end of the time period, in ISO 8601 date-time format (for example, &#x60;2017-06-30&#x60; or &#x60;2017-06-30T00:00:00Z&#x60;). |  |




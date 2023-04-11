

# ReadConsumptionAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**fromDate** | [**ReadConsumptionAccountRequestFromDate**](ReadConsumptionAccountRequestFromDate.md) |  |  |
|**overall** | **Boolean** | By default or if false, returns only the consumption of the specific account that sends this request. If true, returns either the overall consumption of your paying account and all linked accounts (if the account that sends this request is a paying account) or returns nothing (if the account that sends this request is a linked account). |  [optional] |
|**toDate** | [**ReadConsumptionAccountRequestToDate**](ReadConsumptionAccountRequestToDate.md) |  |  |




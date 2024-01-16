

# ReadConsumptionAccountRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**fromDate** | **LocalDate** | The beginning of the time period, in ISO 8601 date format (for example, &#x60;2020-06-14&#x60;). The date-time format is also accepted, but only with a time set to midnight (for example, &#x60;2020-06-14T00:00:00.000Z&#x60;). |  |
|**overall** | **Boolean** | By default or if false, returns only the consumption of the specific account that sends this request. If true, returns either the overall consumption of your paying account and all linked accounts (if the account that sends this request is a paying account) or returns nothing (if the account that sends this request is a linked account). |  [optional] |
|**showPrice** | **Boolean** | By default or if false, returns only the consumption of the specific account that sends this request. If true, returns the unit price of the consumed resource, and the total price of the consumed resource during the specified time period in the currency of the catalog of the Region where the API method was used. |  [optional] |
|**toDate** | **LocalDate** | The end of the time period, in ISO 8601 date format (for example, &#x60;2020-06-30&#x60;). The date-time format is also accepted, but only with a time set to midnight (for example, &#x60;2020-06-30T00:00:00.000Z&#x60;). |  |




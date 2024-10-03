

# ConsumptionEntry

Information about the resources consumed during the specified time period.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The ID of your TINA account. |  [optional] |
|**category** | **String** | The category of the resource (for example, &#x60;network&#x60;). |  [optional] |
|**fromDate** | **String** | The beginning of the time period (UTC). |  [optional] |
|**operation** | **String** | The API call that triggered the resource consumption (for example, &#x60;RunInstances&#x60; or &#x60;CreateVolume&#x60;). |  [optional] |
|**payingAccountId** | **String** | The ID of the TINA account which is billed for your consumption. It can be different from your account in the &#x60;AccountId&#x60; parameter. |  [optional] |
|**price** | **Double** | The total price of the consumed resource during the specified time period, in the currency of the Region&#39;s catalog. |  [optional] |
|**service** | **String** | The service of the API call (&#x60;TinaOS-FCU&#x60;, &#x60;TinaOS-LBU&#x60;, &#x60;TinaOS-DirectLink&#x60;, &#x60;TinaOS-OOS&#x60;, or &#x60;TinaOS-OSU&#x60;). |  [optional] |
|**subregionName** | **String** | The name of the Subregion. |  [optional] |
|**title** | **String** | A description of the consumed resource. |  [optional] |
|**toDate** | **String** | The end of the time period (UTC). |  [optional] |
|**type** | **String** | The type of resource, depending on the API call. |  [optional] |
|**unitPrice** | **Double** | The unit price of the consumed resource in the currency of your account, in the ISO-4217 format (for example, &#x60;EUR&#x60;). |  [optional] |
|**value** | **Double** | The consumed amount for the resource. The unit depends on the resource type. For more information, see the &#x60;Title&#x60; element. |  [optional] |




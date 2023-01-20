

# FiltersApiLog

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**queryAccessKeys** | **List&lt;String&gt;** | The access keys used for the logged calls. |  [optional] |
|**queryApiNames** | **List&lt;String&gt;** | The names of the APIs of the logged calls (always &#x60;oapi&#x60; for the OUTSCALE API). |  [optional] |
|**queryCallNames** | **List&lt;String&gt;** | The names of the logged calls. |  [optional] |
|**queryDateAfter** | **OffsetDateTime** | The date after which you want to retrieve logged calls, in ISO 8601 format (for example, &#x60;2020-06-14&#x60;). By default, this date is set to 48 hours before the &#x60;QueryDateBefore&#x60; parameter value. |  [optional] |
|**queryDateBefore** | **OffsetDateTime** | The date before which you want to retrieve logged calls, in ISO 8601 format (for example, &#x60;2020-06-30&#x60;). By default, this date is set to now, or 48 hours after the &#x60;QueryDateAfter&#x60; parameter value. |  [optional] |
|**queryIpAddresses** | **List&lt;String&gt;** | The IPs used for the logged calls. |  [optional] |
|**queryUserAgents** | **List&lt;String&gt;** | The user agents of the HTTP requests of the logged calls. |  [optional] |
|**requestIds** | **List&lt;String&gt;** | The request IDs provided in the responses of the logged calls. |  [optional] |
|**responseStatusCodes** | **List&lt;Integer&gt;** | The HTTP status codes of the logged calls. |  [optional] |




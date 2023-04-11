

# FiltersApiLog

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**queryAccessKeys** | **List&lt;String&gt;** | The access keys used for the logged calls. |  [optional] |
|**queryApiNames** | **List&lt;String&gt;** | The names of the APIs of the logged calls (always &#x60;oapi&#x60; for the OUTSCALE API). |  [optional] |
|**queryCallNames** | **List&lt;String&gt;** | The names of the logged calls. |  [optional] |
|**queryDateAfter** | [**FiltersApiLogQueryDateAfter**](FiltersApiLogQueryDateAfter.md) |  |  [optional] |
|**queryDateBefore** | [**FiltersApiLogQueryDateBefore**](FiltersApiLogQueryDateBefore.md) |  |  [optional] |
|**queryIpAddresses** | **List&lt;String&gt;** | The IPs used for the logged calls. |  [optional] |
|**queryUserAgents** | **List&lt;String&gt;** | The user agents of the HTTP requests of the logged calls. |  [optional] |
|**requestIds** | **List&lt;String&gt;** | The request IDs provided in the responses of the logged calls. |  [optional] |
|**responseStatusCodes** | **List&lt;Integer&gt;** | The HTTP status codes of the logged calls. |  [optional] |




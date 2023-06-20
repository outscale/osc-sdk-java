

# Log

Information about the log.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The account ID of the logged call. |  [optional] |
|**callDuration** | **Integer** | The duration of the logged call, in microseconds. |  [optional] |
|**queryAccessKey** | **String** | The access key used for the logged call. |  [optional] |
|**queryApiName** | **String** | The name of the API used by the logged call (always &#x60;oapi&#x60; for the OUTSCALE API). |  [optional] |
|**queryApiVersion** | **String** | The version of the API used by the logged call. |  [optional] |
|**queryCallName** | **String** | The name of the logged call. |  [optional] |
|**queryDate** | **LocalDate** | The date and time of the logged call, in ISO 8601 date-time format. |  [optional] |
|**queryHeaderRaw** | **String** | The raw header of the HTTP request of the logged call. |  [optional] |
|**queryHeaderSize** | **Integer** | The size of the raw header of the HTTP request of the logged call, in bytes. |  [optional] |
|**queryIpAddress** | **String** | The IP used for the logged call. |  [optional] |
|**queryPayloadRaw** | **String** | The raw payload of the HTTP request of the logged call. |  [optional] |
|**queryPayloadSize** | **Integer** | The size of the raw payload of the HTTP request of the logged call, in bytes. |  [optional] |
|**queryUserAgent** | **String** | The user agent of the HTTP request of the logged call. |  [optional] |
|**requestId** | **String** | The request ID provided in the response of the logged call. |  [optional] |
|**responseSize** | **Integer** | The size of the response of the logged call, in bytes. |  [optional] |
|**responseStatusCode** | **Integer** | The HTTP status code of the response of the logged call. |  [optional] |




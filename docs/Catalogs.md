

# Catalogs

Information about the catalogs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entries** | [**List&lt;CatalogEntry&gt;**](CatalogEntry.md) | One or more catalog entries. |  [optional] |
|**fromDate** | **OffsetDateTime** | The beginning of the time period (UTC). |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The state of the catalog (&#x60;CURRENT&#x60; \\| &#x60;OBSOLETE&#x60;). |  [optional] |
|**toDate** | **OffsetDateTime** | The end of the time period (UTC). |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CURRENT | &quot;CURRENT&quot; |
| OBSOLETE | &quot;OBSOLETE&quot; |




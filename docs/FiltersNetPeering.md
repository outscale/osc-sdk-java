

# FiltersNetPeering

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accepterNetAccountIds** | **List&lt;String&gt;** | The account IDs of the owners of the peer Nets. |  [optional] |
|**accepterNetIpRanges** | **List&lt;String&gt;** | The IP ranges of the peer Nets, in CIDR notation (for example, &#x60;10.0.0.0/24&#x60;). |  [optional] |
|**accepterNetNetIds** | **List&lt;String&gt;** | The IDs of the peer Nets. |  [optional] |
|**expirationDates** | **List&lt;OffsetDateTime&gt;** | The dates and times at which the Net peerings expire, in ISO 8601 date-time format (for example, &#x60;2020-06-14T00:00:00.000Z&#x60;). |  [optional] |
|**netPeeringIds** | **List&lt;String&gt;** | The IDs of the Net peerings. |  [optional] |
|**sourceNetAccountIds** | **List&lt;String&gt;** | The account IDs of the owners of the peer Nets. |  [optional] |
|**sourceNetIpRanges** | **List&lt;String&gt;** | The IP ranges of the peer Nets. |  [optional] |
|**sourceNetNetIds** | **List&lt;String&gt;** | The IDs of the peer Nets. |  [optional] |
|**stateMessages** | **List&lt;String&gt;** | Additional information about the states of the Net peerings. |  [optional] |
|**stateNames** | **List&lt;String&gt;** | The states of the Net peerings (&#x60;pending-acceptance&#x60; \\| &#x60;active&#x60; \\| &#x60;rejected&#x60; \\| &#x60;failed&#x60; \\| &#x60;expired&#x60; \\| &#x60;deleted&#x60;). |  [optional] |
|**tagKeys** | **List&lt;String&gt;** | The keys of the tags associated with the Net peerings. |  [optional] |
|**tagValues** | **List&lt;String&gt;** | The values of the tags associated with the Net peerings. |  [optional] |
|**tags** | **List&lt;String&gt;** | The key/value combination of the tags associated with the Net peerings, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}. |  [optional] |




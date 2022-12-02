

# FiltersVirtualGateway

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionTypes** | **List&lt;String&gt;** | The types of the virtual gateways (only &#x60;ipsec.1&#x60; is supported). |  [optional] |
|**linkNetIds** | **List&lt;String&gt;** | The IDs of the Nets the virtual gateways are attached to. |  [optional] |
|**linkStates** | **List&lt;String&gt;** | The current states of the attachments between the virtual gateways and the Nets (&#x60;attaching&#x60; \\| &#x60;attached&#x60; \\| &#x60;detaching&#x60; \\| &#x60;detached&#x60;). |  [optional] |
|**states** | **List&lt;String&gt;** | The states of the virtual gateways (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;deleting&#x60; \\| &#x60;deleted&#x60;). |  [optional] |
|**tagKeys** | **List&lt;String&gt;** | The keys of the tags associated with the virtual gateways. |  [optional] |
|**tagValues** | **List&lt;String&gt;** | The values of the tags associated with the virtual gateways. |  [optional] |
|**tags** | **List&lt;String&gt;** | The key/value combination of the tags associated with the virtual gateways, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}. |  [optional] |
|**virtualGatewayIds** | **List&lt;String&gt;** | The IDs of the virtual gateways. |  [optional] |




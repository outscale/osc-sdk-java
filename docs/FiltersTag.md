

# FiltersTag

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keys** | **List&lt;String&gt;** | The keys of the tags that are assigned to the resources. You can use this filter alongside the &#x60;Values&#x60; filter. In that case, you filter the resources corresponding to each tag, regardless of the other filter. |  [optional] |
|**resourceIds** | **List&lt;String&gt;** | The IDs of the resources with which the tags are associated. |  [optional] |
|**resourceTypes** | **List&lt;String&gt;** | The resource type (&#x60;vm&#x60; \\| &#x60;image&#x60; \\| &#x60;volume&#x60; \\| &#x60;snapshot&#x60; \\| &#x60;public-ip&#x60; \\| &#x60;security-group&#x60; \\| &#x60;route-table&#x60; \\| &#x60;nic&#x60; \\| &#x60;net&#x60; \\| &#x60;subnet&#x60; \\| &#x60;net-peering&#x60; \\| &#x60;net-access-point&#x60; \\| &#x60;nat-service&#x60; \\| &#x60;internet-service&#x60; \\| &#x60;client-gateway&#x60; \\| &#x60;virtual-gateway&#x60; \\| &#x60;vpn-connection&#x60; \\| &#x60;dhcp-options&#x60; \\| &#x60;task&#x60;). |  [optional] |
|**values** | **List&lt;String&gt;** | The values of the tags that are assigned to the resources. You can use this filter alongside the &#x60;TagKeys&#x60; filter. In that case, you filter the resources corresponding to each tag, regardless of the other filter. |  [optional] |




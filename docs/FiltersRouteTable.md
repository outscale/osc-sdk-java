

# FiltersRouteTable

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**linkRouteTableIds** | **List&lt;String&gt;** | The IDs of the route tables involved in the associations. |  [optional] |
|**linkRouteTableLinkRouteTableIds** | **List&lt;String&gt;** | The IDs of the associations between the route tables and the Subnets. |  [optional] |
|**linkRouteTableMain** | **Boolean** | If true, the route tables are the main ones for their Nets. |  [optional] |
|**linkSubnetIds** | **List&lt;String&gt;** | The IDs of the Subnets involved in the associations. |  [optional] |
|**netIds** | **List&lt;String&gt;** | The IDs of the Nets for the route tables. |  [optional] |
|**routeCreationMethods** | **List&lt;String&gt;** | The methods used to create a route. |  [optional] |
|**routeDestinationIpRanges** | **List&lt;String&gt;** | The IP ranges specified in routes in the tables. |  [optional] |
|**routeDestinationServiceIds** | **List&lt;String&gt;** | The service IDs specified in routes in the tables. |  [optional] |
|**routeGatewayIds** | **List&lt;String&gt;** | The IDs of the gateways specified in routes in the tables. |  [optional] |
|**routeNatServiceIds** | **List&lt;String&gt;** | The IDs of the NAT services specified in routes in the tables. |  [optional] |
|**routeNetPeeringIds** | **List&lt;String&gt;** | The IDs of the Net peerings specified in routes in the tables. |  [optional] |
|**routeStates** | **List&lt;String&gt;** | The states of routes in the route tables (always &#x60;active&#x60;). |  [optional] |
|**routeTableIds** | **List&lt;String&gt;** | The IDs of the route tables. |  [optional] |
|**routeVmIds** | **List&lt;String&gt;** | The IDs of the VMs specified in routes in the tables. |  [optional] |
|**tagKeys** | **List&lt;String&gt;** | The keys of the tags associated with the route tables. |  [optional] |
|**tagValues** | **List&lt;String&gt;** | The values of the tags associated with the route tables. |  [optional] |
|**tags** | **List&lt;String&gt;** | The key/value combination of the tags associated with the route tables, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}. |  [optional] |




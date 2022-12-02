

# FiltersNic

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**descriptions** | **List&lt;String&gt;** | The descriptions of the NICs. |  [optional] |
|**isSourceDestCheck** | **Boolean** | Whether the source/destination checking is enabled (true) or disabled (false). |  [optional] |
|**linkNicDeleteOnVmDeletion** | **Boolean** | Whether the NICs are deleted when the VMs they are attached to are terminated. |  [optional] |
|**linkNicDeviceNumbers** | **List&lt;Integer&gt;** | The device numbers the NICs are attached to. |  [optional] |
|**linkNicLinkNicIds** | **List&lt;String&gt;** | The attachment IDs of the NICs. |  [optional] |
|**linkNicStates** | **List&lt;String&gt;** | The states of the attachments. |  [optional] |
|**linkNicVmAccountIds** | **List&lt;String&gt;** | The account IDs of the owners of the VMs the NICs are attached to. |  [optional] |
|**linkNicVmIds** | **List&lt;String&gt;** | The IDs of the VMs the NICs are attached to. |  [optional] |
|**linkPublicIpAccountIds** | **List&lt;String&gt;** | The account IDs of the owners of the public IPs associated with the NICs. |  [optional] |
|**linkPublicIpLinkPublicIpIds** | **List&lt;String&gt;** | The association IDs returned when the public IPs were associated with the NICs. |  [optional] |
|**linkPublicIpPublicIpIds** | **List&lt;String&gt;** | The allocation IDs returned when the public IPs were allocated to their accounts. |  [optional] |
|**linkPublicIpPublicIps** | **List&lt;String&gt;** | The public IPs associated with the NICs. |  [optional] |
|**macAddresses** | **List&lt;String&gt;** | The Media Access Control (MAC) addresses of the NICs. |  [optional] |
|**netIds** | **List&lt;String&gt;** | The IDs of the Nets where the NICs are located. |  [optional] |
|**nicIds** | **List&lt;String&gt;** | The IDs of the NICs. |  [optional] |
|**privateDnsNames** | **List&lt;String&gt;** | The private DNS names associated with the primary private IPs. |  [optional] |
|**privateIpsLinkPublicIpAccountIds** | **List&lt;String&gt;** | The account IDs of the owner of the public IPs associated with the private IPs. |  [optional] |
|**privateIpsLinkPublicIpPublicIps** | **List&lt;String&gt;** | The public IPs associated with the private IPs. |  [optional] |
|**privateIpsPrimaryIp** | **Boolean** | Whether the private IP is the primary IP associated with the NIC. |  [optional] |
|**privateIpsPrivateIps** | **List&lt;String&gt;** | The private IPs of the NICs. |  [optional] |
|**securityGroupIds** | **List&lt;String&gt;** | The IDs of the security groups associated with the NICs. |  [optional] |
|**securityGroupNames** | **List&lt;String&gt;** | The names of the security groups associated with the NICs. |  [optional] |
|**states** | **List&lt;String&gt;** | The states of the NICs. |  [optional] |
|**subnetIds** | **List&lt;String&gt;** | The IDs of the Subnets for the NICs. |  [optional] |
|**subregionNames** | **List&lt;String&gt;** | The Subregions where the NICs are located. |  [optional] |
|**tagKeys** | **List&lt;String&gt;** | The keys of the tags associated with the NICs. |  [optional] |
|**tagValues** | **List&lt;String&gt;** | The values of the tags associated with the NICs. |  [optional] |
|**tags** | **List&lt;String&gt;** | The key/value combination of the tags associated with the NICs, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}. |  [optional] |




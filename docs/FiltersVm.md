

# FiltersVm

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**architectures** | **List&lt;String&gt;** | The architectures of the VMs (&#x60;i386&#x60; \\| &#x60;x86_64&#x60;). |  [optional] |
|**blockDeviceMappingDeleteOnVmDeletion** | **Boolean** | Whether the BSU volumes are deleted when terminating the VMs. |  [optional] |
|**blockDeviceMappingDeviceNames** | **List&lt;String&gt;** | The device names for the BSU volumes (in the format &#x60;/dev/sdX&#x60;, &#x60;/dev/sdXX&#x60;, &#x60;/dev/xvdX&#x60;, or &#x60;/dev/xvdXX&#x60;). |  [optional] |
|**blockDeviceMappingLinkDates** | **List&lt;LocalDate&gt;** | The link dates for the BSU volumes mapped to the VMs (for example, &#x60;2016-01-23T18:45:30.000Z&#x60;). |  [optional] |
|**blockDeviceMappingStates** | **List&lt;String&gt;** | The states for the BSU volumes (&#x60;attaching&#x60; \\| &#x60;attached&#x60; \\| &#x60;detaching&#x60; \\| &#x60;detached&#x60;). |  [optional] |
|**blockDeviceMappingVolumeIds** | **List&lt;String&gt;** | The volume IDs of the BSU volumes. |  [optional] |
|**clientTokens** | **List&lt;String&gt;** | The idempotency tokens provided when launching the VMs. |  [optional] |
|**creationDates** | **List&lt;LocalDate&gt;** | The dates when the VMs were launched. |  [optional] |
|**imageIds** | **List&lt;String&gt;** | The IDs of the OMIs used to launch the VMs. |  [optional] |
|**isSourceDestChecked** | **Boolean** | Whether the source/destination checking is enabled (true) or disabled (false). |  [optional] |
|**keypairNames** | **List&lt;String&gt;** | The names of the keypairs used when launching the VMs. |  [optional] |
|**launchNumbers** | **List&lt;Integer&gt;** | The numbers for the VMs when launching a group of several VMs (for example, &#x60;0&#x60;, &#x60;1&#x60;, &#x60;2&#x60;, and so on). |  [optional] |
|**lifecycles** | **List&lt;String&gt;** | Whether the VMs are Spot Instances (spot). |  [optional] |
|**netIds** | **List&lt;String&gt;** | The IDs of the Nets in which the VMs are running. |  [optional] |
|**nicAccountIds** | **List&lt;String&gt;** | The IDs of the NICs. |  [optional] |
|**nicDescriptions** | **List&lt;String&gt;** | The descriptions of the NICs. |  [optional] |
|**nicIsSourceDestChecked** | **Boolean** | Whether the source/destination checking is enabled (true) or disabled (false). |  [optional] |
|**nicLinkNicDeleteOnVmDeletion** | **Boolean** | Whether the NICs are deleted when the VMs they are attached to are deleted. |  [optional] |
|**nicLinkNicDeviceNumbers** | **List&lt;Integer&gt;** | The device numbers the NICs are attached to. |  [optional] |
|**nicLinkNicLinkNicDates** | **List&lt;LocalDate&gt;** | The dates and times (UTC) when the NICs were attached to the VMs. |  [optional] |
|**nicLinkNicLinkNicIds** | **List&lt;String&gt;** | The IDs of the NIC attachments. |  [optional] |
|**nicLinkNicStates** | **List&lt;String&gt;** | The states of the attachments. |  [optional] |
|**nicLinkNicVmAccountIds** | **List&lt;String&gt;** | The account IDs of the owners of the VMs the NICs are attached to. |  [optional] |
|**nicLinkNicVmIds** | **List&lt;String&gt;** | The IDs of the VMs the NICs are attached to. |  [optional] |
|**nicLinkPublicIpAccountIds** | **List&lt;String&gt;** | The account IDs of the owners of the public IPs associated with the NICs. |  [optional] |
|**nicLinkPublicIpLinkPublicIpIds** | **List&lt;String&gt;** | The association IDs returned when the public IPs were associated with the NICs. |  [optional] |
|**nicLinkPublicIpPublicIpIds** | **List&lt;String&gt;** | The allocation IDs returned when the public IPs were allocated to their accounts. |  [optional] |
|**nicLinkPublicIpPublicIps** | **List&lt;String&gt;** | The public IPs associated with the NICs. |  [optional] |
|**nicMacAddresses** | **List&lt;String&gt;** | The Media Access Control (MAC) addresses of the NICs. |  [optional] |
|**nicNetIds** | **List&lt;String&gt;** | The IDs of the Nets where the NICs are located. |  [optional] |
|**nicNicIds** | **List&lt;String&gt;** | The IDs of the NICs. |  [optional] |
|**nicPrivateIpsLinkPublicIpAccountIds** | **List&lt;String&gt;** | The account IDs of the owner of the public IPs associated with the private IPs. |  [optional] |
|**nicPrivateIpsLinkPublicIpIds** | **List&lt;String&gt;** | The public IPs associated with the private IPs. |  [optional] |
|**nicPrivateIpsPrimaryIp** | **Boolean** | Whether the private IPs are the primary IPs associated with the NICs. |  [optional] |
|**nicPrivateIpsPrivateIps** | **List&lt;String&gt;** | The private IPs of the NICs. |  [optional] |
|**nicSecurityGroupIds** | **List&lt;String&gt;** | The IDs of the security groups associated with the NICs. |  [optional] |
|**nicSecurityGroupNames** | **List&lt;String&gt;** | The names of the security groups associated with the NICs. |  [optional] |
|**nicStates** | **List&lt;String&gt;** | The states of the NICs (&#x60;available&#x60; \\| &#x60;in-use&#x60;). |  [optional] |
|**nicSubnetIds** | **List&lt;String&gt;** | The IDs of the Subnets for the NICs. |  [optional] |
|**nicSubregionNames** | **List&lt;String&gt;** | The Subregions where the NICs are located. |  [optional] |
|**platforms** | **List&lt;String&gt;** | The platforms. Use windows if you have Windows VMs. Otherwise, leave this filter blank. |  [optional] |
|**privateIps** | **List&lt;String&gt;** | The private IPs of the VMs. |  [optional] |
|**productCodes** | **List&lt;String&gt;** | The product codes associated with the OMI used to create the VMs. |  [optional] |
|**publicIps** | **List&lt;String&gt;** | The public IPs of the VMs. |  [optional] |
|**reservationIds** | **List&lt;String&gt;** | The IDs of the reservation of the VMs, created every time you launch VMs. These reservation IDs can be associated with several VMs when you lauch a group of VMs using the same launch request. |  [optional] |
|**rootDeviceNames** | **List&lt;String&gt;** | The names of the root devices for the VMs (for example, &#x60;/dev/sda1&#x60;) |  [optional] |
|**rootDeviceTypes** | **List&lt;String&gt;** | The root devices types used by the VMs (always &#x60;ebs&#x60;) |  [optional] |
|**securityGroupIds** | **List&lt;String&gt;** | The IDs of the security groups for the VMs (only in the public Cloud). |  [optional] |
|**securityGroupNames** | **List&lt;String&gt;** | The names of the security groups for the VMs (only in the public Cloud). |  [optional] |
|**stateReasonCodes** | **List&lt;Integer&gt;** | The reason codes for the state changes. |  [optional] |
|**stateReasonMessages** | **List&lt;String&gt;** | The messages describing the state changes. |  [optional] |
|**stateReasons** | **List&lt;String&gt;** | The reasons explaining the current states of the VMs. This filter is like the &#x60;StateReasonCodes&#x60; one. |  [optional] |
|**subnetIds** | **List&lt;String&gt;** | The IDs of the Subnets for the VMs. |  [optional] |
|**subregionNames** | **List&lt;String&gt;** | The names of the Subregions of the VMs. |  [optional] |
|**tagKeys** | **List&lt;String&gt;** | The keys of the tags associated with the VMs. |  [optional] |
|**tagValues** | **List&lt;String&gt;** | The values of the tags associated with the VMs. |  [optional] |
|**tags** | **List&lt;String&gt;** | The key/value combination of the tags associated with the VMs, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}. |  [optional] |
|**tenancies** | **List&lt;String&gt;** | The tenancies of the VMs (&#x60;dedicated&#x60; \\| &#x60;default&#x60; \\| &#x60;host&#x60;). |  [optional] |
|**vmIds** | **List&lt;String&gt;** | One or more IDs of VMs. |  [optional] |
|**vmSecurityGroupIds** | **List&lt;String&gt;** | The IDs of the security groups for the VMs. |  [optional] |
|**vmSecurityGroupNames** | **List&lt;String&gt;** | The names of the security group for the VMs. |  [optional] |
|**vmStateCodes** | **List&lt;Integer&gt;** | The state codes of the VMs: &#x60;-1&#x60; (quarantine), &#x60;0&#x60; (pending), &#x60;16&#x60; (running), &#x60;32&#x60; (shutting-down), &#x60;48&#x60; (terminated), &#x60;64&#x60; (stopping), and &#x60;80&#x60; (stopped). |  [optional] |
|**vmStateNames** | **List&lt;String&gt;** | The state names of the VMs (&#x60;pending&#x60; \\| &#x60;running&#x60; \\| &#x60;stopping&#x60; \\| &#x60;stopped&#x60; \\| &#x60;shutting-down&#x60; \\| &#x60;terminated&#x60; \\| &#x60;quarantine&#x60;). |  [optional] |
|**vmTypes** | **List&lt;String&gt;** | The VM types (for example, t2.micro). For more information, see [VM Types](https://docs.outscale.com/en/userguide/VM-Types.html). |  [optional] |




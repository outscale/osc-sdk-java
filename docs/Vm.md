

# Vm

Information about the VM.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**architecture** | **String** | The architecture of the VM (&#x60;i386&#x60; \\| &#x60;x86_64&#x60;). |  [optional] |
|**blockDeviceMappings** | [**List&lt;BlockDeviceMappingCreated&gt;**](BlockDeviceMappingCreated.md) | The block device mapping of the VM. |  [optional] |
|**bsuOptimized** | **Boolean** | This parameter is not available. It is present in our API for the sake of historical compatibility with AWS. |  [optional] |
|**clientToken** | **String** | The idempotency token provided when launching the VM. |  [optional] |
|**creationDate** | **OffsetDateTime** | The date and time of creation of the VM. |  [optional] |
|**deletionProtection** | **Boolean** | If true, you cannot delete the VM unless you change this parameter back to false. |  [optional] |
|**hypervisor** | **String** | The hypervisor type of the VMs (&#x60;ovm&#x60; \\| &#x60;xen&#x60;). |  [optional] |
|**imageId** | **String** | The ID of the OMI used to create the VM. |  [optional] |
|**isSourceDestChecked** | **Boolean** | (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net. |  [optional] |
|**keypairName** | **String** | The name of the keypair used when launching the VM. |  [optional] |
|**launchNumber** | **Integer** | The number for the VM when launching a group of several VMs (for example, &#x60;0&#x60;, &#x60;1&#x60;, &#x60;2&#x60;, and so on). |  [optional] |
|**nestedVirtualization** | **Boolean** | If true, nested virtualization is enabled. If false, it is disabled. |  [optional] |
|**netId** | **String** | The ID of the Net in which the VM is running. |  [optional] |
|**nics** | [**List&lt;NicLight&gt;**](NicLight.md) | (Net only) The network interface cards (NICs) the VMs are attached to. |  [optional] |
|**osFamily** | **String** | Indicates the operating system (OS) of the VM. |  [optional] |
|**performance** | **String** | The performance of the VM (&#x60;medium&#x60; \\| &#x60;high&#x60; \\|  &#x60;highest&#x60;). |  [optional] |
|**placement** | [**Placement**](Placement.md) |  |  [optional] |
|**privateDnsName** | **String** | The name of the private DNS. |  [optional] |
|**privateIp** | **String** | The primary private IP of the VM. |  [optional] |
|**productCodes** | **List&lt;String&gt;** | The product codes associated with the OMI used to create the VM. |  [optional] |
|**publicDnsName** | **String** | The name of the public DNS. |  [optional] |
|**publicIp** | **String** | The public IP of the VM. |  [optional] |
|**reservationId** | **String** | The reservation ID of the VM. |  [optional] |
|**rootDeviceName** | **String** | The name of the root device for the VM (for example, &#x60;/dev/sda1&#x60;). |  [optional] |
|**rootDeviceType** | **String** | The type of root device used by the VM (always &#x60;bsu&#x60;). |  [optional] |
|**securityGroups** | [**List&lt;SecurityGroupLight&gt;**](SecurityGroupLight.md) | One or more security groups associated with the VM. |  [optional] |
|**state** | **String** | The state of the VM (&#x60;pending&#x60; \\| &#x60;running&#x60; \\| &#x60;stopping&#x60; \\| &#x60;stopped&#x60; \\| &#x60;shutting-down&#x60; \\| &#x60;terminated&#x60; \\| &#x60;quarantine&#x60;). |  [optional] |
|**stateReason** | **String** | The reason explaining the current state of the VM. |  [optional] |
|**subnetId** | **String** | The ID of the Subnet for the VM. |  [optional] |
|**tags** | [**List&lt;ResourceTag&gt;**](ResourceTag.md) | One or more tags associated with the VM. |  [optional] |
|**userData** | **String** | The Base64-encoded MIME user data. |  [optional] |
|**vmId** | **String** | The ID of the VM. |  [optional] |
|**vmInitiatedShutdownBehavior** | **String** | The VM behavior when you stop it. If set to &#x60;stop&#x60;, the VM stops. If set to &#x60;restart&#x60;, the VM stops then automatically restarts. If set to &#x60;terminate&#x60;, the VM stops and is deleted. |  [optional] |
|**vmType** | **String** | The type of VM. For more information, see [VM Types](https://docs.outscale.com/en/userguide/VM-Types.html). |  [optional] |




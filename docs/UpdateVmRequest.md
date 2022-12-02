

# UpdateVmRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockDeviceMappings** | [**List&lt;BlockDeviceMappingVmUpdate&gt;**](BlockDeviceMappingVmUpdate.md) | One or more block device mappings of the VM. |  [optional] |
|**bsuOptimized** | **Boolean** | This parameter is not available. It is present in our API for the sake of historical compatibility with AWS. |  [optional] |
|**deletionProtection** | **Boolean** | If true, you cannot delete the VM unless you change this parameter back to false. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**isSourceDestChecked** | **Boolean** | (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net. |  [optional] |
|**keypairName** | **String** | The name of the keypair.&lt;br /&gt; To complete the replacement, manually replace the old public key with the new public key in the ~/.ssh/authorized_keys file located in the VM. Restart the VM to apply the change. |  [optional] |
|**nestedVirtualization** | **Boolean** | (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled. |  [optional] |
|**performance** | [**PerformanceEnum**](#PerformanceEnum) | The performance of the VM (&#x60;medium&#x60; \\| &#x60;high&#x60; \\|  &#x60;highest&#x60;). |  [optional] |
|**securityGroupIds** | **List&lt;String&gt;** | One or more IDs of security groups for the VM. |  [optional] |
|**userData** | **String** | The Base64-encoded MIME user data, limited to 500 kibibytes (KiB). |  [optional] |
|**vmId** | **String** | The ID of the VM. |  |
|**vmInitiatedShutdownBehavior** | **String** | The VM behavior when you stop it. If set to &#x60;stop&#x60;, the VM stops. If set to &#x60;restart&#x60;, the VM stops then automatically restarts. If set to &#x60;terminate&#x60;, the VM stops and is terminated. |  [optional] |
|**vmType** | **String** | The type of VM. For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html). |  [optional] |



## Enum: PerformanceEnum

| Name | Value |
|---- | -----|
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |
| HIGHEST | &quot;highest&quot; |




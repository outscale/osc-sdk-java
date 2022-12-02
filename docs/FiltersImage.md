

# FiltersImage

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountAliases** | **List&lt;String&gt;** | The account aliases of the owners of the OMIs. |  [optional] |
|**accountIds** | **List&lt;String&gt;** | The account IDs of the owners of the OMIs. By default, all the OMIs for which you have launch permissions are described. |  [optional] |
|**architectures** | **List&lt;String&gt;** | The architectures of the OMIs (&#x60;i386&#x60; \\| &#x60;x86_64&#x60;). |  [optional] |
|**blockDeviceMappingDeleteOnVmDeletion** | **Boolean** | Whether the volumes are deleted or not when terminating the VM. |  [optional] |
|**blockDeviceMappingDeviceNames** | **List&lt;String&gt;** | The device names for the volumes. |  [optional] |
|**blockDeviceMappingSnapshotIds** | **List&lt;String&gt;** | The IDs of the snapshots used to create the volumes. |  [optional] |
|**blockDeviceMappingVolumeSizes** | **List&lt;Integer&gt;** | The sizes of the volumes, in gibibytes (GiB). |  [optional] |
|**blockDeviceMappingVolumeTypes** | **List&lt;String&gt;** | The types of volumes (&#x60;standard&#x60; \\| &#x60;gp2&#x60; \\| &#x60;io1&#x60;). |  [optional] |
|**descriptions** | **List&lt;String&gt;** | The descriptions of the OMIs, provided when they were created. |  [optional] |
|**fileLocations** | **List&lt;String&gt;** | The locations of the buckets where the OMI files are stored. |  [optional] |
|**hypervisors** | **List&lt;String&gt;** | The hypervisor type of the OMI (always &#x60;xen&#x60;). |  [optional] |
|**imageIds** | **List&lt;String&gt;** | The IDs of the OMIs. |  [optional] |
|**imageNames** | **List&lt;String&gt;** | The names of the OMIs, provided when they were created. |  [optional] |
|**permissionsToLaunchAccountIds** | **List&lt;String&gt;** | The account IDs of the users who have launch permissions for the OMIs. |  [optional] |
|**permissionsToLaunchGlobalPermission** | **Boolean** | If true, lists all public OMIs. If false, lists all private OMIs. |  [optional] |
|**productCodes** | **List&lt;String&gt;** | The product code associated with the OMI (&#x60;0001&#x60; Linux/Unix \\| &#x60;0002&#x60; Windows \\| &#x60;0004&#x60; Linux/Oracle \\| &#x60;0005&#x60; Windows 10). |  [optional] |
|**rootDeviceNames** | **List&lt;String&gt;** | The name of the root device. This value must be /dev/sda1. |  [optional] |
|**rootDeviceTypes** | **List&lt;String&gt;** | The types of root device used by the OMIs (always &#x60;bsu&#x60;). |  [optional] |
|**states** | **List&lt;String&gt;** | The states of the OMIs (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;failed&#x60;). |  [optional] |
|**tagKeys** | **List&lt;String&gt;** | The keys of the tags associated with the OMIs. |  [optional] |
|**tagValues** | **List&lt;String&gt;** | The values of the tags associated with the OMIs. |  [optional] |
|**tags** | **List&lt;String&gt;** | The key/value combination of the tags associated with the OMIs, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}. |  [optional] |
|**virtualizationTypes** | **List&lt;String&gt;** | The virtualization types (always &#x60;hvm&#x60;). |  [optional] |




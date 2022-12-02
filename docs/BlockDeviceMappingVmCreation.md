

# BlockDeviceMappingVmCreation

Information about the block device mapping.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bsu** | [**BsuToCreate**](BsuToCreate.md) |  |  [optional] |
|**deviceName** | **String** | The device name for the volume. For a root device, you must use &#x60;/dev/sda1&#x60;. For other volumes, you must use &#x60;/dev/sdX&#x60;, &#x60;/dev/sdXX&#x60;, &#x60;/dev/xvdX&#x60;, or &#x60;/dev/xvdXX&#x60; (where the first &#x60;X&#x60; is a letter between &#x60;b&#x60; and &#x60;z&#x60;, and the second &#x60;X&#x60; is a letter between &#x60;a&#x60; and &#x60;z&#x60;). |  [optional] |
|**noDevice** | **String** | Removes the device which is included in the block device mapping of the OMI. |  [optional] |
|**virtualDeviceName** | **String** | The name of the virtual device (&#x60;ephemeralN&#x60;). |  [optional] |




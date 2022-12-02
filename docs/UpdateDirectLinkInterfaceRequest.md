

# UpdateDirectLinkInterfaceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**directLinkInterfaceId** | **String** | The ID of the DirectLink interface you want to update. |  |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**mtu** | [**MtuEnum**](#MtuEnum) | The maximum transmission unit (MTU) of the DirectLink interface, in bytes (either &#x60;1500&#x60; or &#x60;9000&#x60;). |  |



## Enum: MtuEnum

| Name | Value |
|---- | -----|
| NUMBER_1500 | 1500 |
| NUMBER_9000 | 9000 |




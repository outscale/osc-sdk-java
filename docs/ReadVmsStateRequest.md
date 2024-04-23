

# ReadVmsStateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allVms** | **Boolean** | If true, includes the status of all VMs. By default or if set to false, only includes the status of running VMs. |  [optional] |
|**dryRun** | **Boolean** | If true, checks whether you have the required permissions to perform the action. |  [optional] |
|**filters** | [**FiltersVmsState**](FiltersVmsState.md) |  |  [optional] |
|**nextPageToken** | **byte[]** | The token to request the next page of results. Each token refers to a specific page. |  [optional] |
|**resultsPerPage** | **Integer** | The maximum number of logs returned in a single response (between &#x60;1&#x60;and &#x60;1000&#x60;, both included). By default, &#x60;100&#x60;. |  [optional] |




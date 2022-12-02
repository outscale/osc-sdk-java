

# FiltersVmsState

One or more filters.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maintenanceEventCodes** | **List&lt;String&gt;** | The code for the scheduled event (&#x60;system-reboot&#x60; \\| &#x60;system-maintenance&#x60;). |  [optional] |
|**maintenanceEventDescriptions** | **List&lt;String&gt;** | The description of the scheduled event. |  [optional] |
|**maintenanceEventsNotAfter** | **List&lt;LocalDate&gt;** | The latest time the event can end. |  [optional] |
|**maintenanceEventsNotBefore** | **List&lt;LocalDate&gt;** | The earliest time the event can start. |  [optional] |
|**subregionNames** | **List&lt;String&gt;** | The names of the Subregions of the VMs. |  [optional] |
|**vmIds** | **List&lt;String&gt;** | One or more IDs of VMs. |  [optional] |
|**vmStates** | **List&lt;String&gt;** | The states of the VMs (&#x60;pending&#x60; \\| &#x60;running&#x60; \\| &#x60;stopping&#x60; \\| &#x60;stopped&#x60; \\| &#x60;shutting-down&#x60; \\| &#x60;terminated&#x60; \\| &#x60;quarantine&#x60;). |  [optional] |




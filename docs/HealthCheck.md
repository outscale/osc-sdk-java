

# HealthCheck

Information about the health check configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkInterval** | **Integer** | The number of seconds between two requests (between &#x60;5&#x60; and &#x60;600&#x60; both included). |  |
|**healthyThreshold** | **Integer** | The number of consecutive successful requests before considering the VM as healthy (between &#x60;2&#x60; and &#x60;10&#x60; both included). |  |
|**path** | **String** | If you use the HTTP or HTTPS protocols, the request URL path. |  [optional] |
|**port** | **Integer** | The port number (between &#x60;1&#x60; and &#x60;65535&#x60;, both included). |  |
|**protocol** | **String** | The protocol for the URL of the VM (&#x60;HTTP&#x60; \\| &#x60;HTTPS&#x60; \\| &#x60;TCP&#x60; \\| &#x60;SSL&#x60;). |  |
|**timeout** | **Integer** | The maximum waiting time for a response before considering the VM as unhealthy, in seconds (between &#x60;2&#x60; and &#x60;60&#x60; both included). |  |
|**unhealthyThreshold** | **Integer** | The number of consecutive failed requests before considering the VM as unhealthy (between &#x60;2&#x60; and &#x60;10&#x60; both included). |  |




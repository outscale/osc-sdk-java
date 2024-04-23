

# ListenerForCreation

Information about the listener to create.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backendPort** | **Integer** | The port on which the backend VM is listening (between &#x60;1&#x60; and &#x60;65535&#x60;, both included). |  |
|**backendProtocol** | **String** | The protocol for routing traffic to backend VMs (&#x60;HTTP&#x60; \\| &#x60;HTTPS&#x60; \\| &#x60;TCP&#x60; \\| &#x60;SSL&#x60;). |  [optional] |
|**loadBalancerPort** | **Integer** | The port on which the load balancer is listening (between &#x60;1&#x60; and &#x60;65535&#x60;, both included). |  |
|**loadBalancerProtocol** | **String** | The routing protocol (&#x60;HTTP&#x60; \\| &#x60;HTTPS&#x60; \\| &#x60;TCP&#x60; \\| &#x60;SSL&#x60;). |  |
|**serverCertificateId** | **String** | The OUTSCALE Resource Name (ORN) of the server certificate. For more information, see [Resource Identifiers &gt; OUTSCALE Resource Names (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns). |  [optional] |






# Phase2Options

Information about Phase 2 of the Internet Key Exchange (IKE) negotiation. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phase2DhGroupNumbers** | **List&lt;Integer&gt;** | The Diffie-Hellman (DH) group numbers allowed for the VPN tunnel for phase 2. |  [optional] |
|**phase2EncryptionAlgorithms** | **List&lt;String&gt;** | The encryption algorithms allowed for the VPN tunnel for phase 2. |  [optional] |
|**phase2IntegrityAlgorithms** | **List&lt;String&gt;** | The integrity algorithms allowed for the VPN tunnel for phase 2. |  [optional] |
|**phase2LifetimeSeconds** | **Integer** | The lifetime for phase 2 of the Internet Key Exchange (IKE) negociation process, in seconds. |  [optional] |
|**preSharedKey** | **String** | The pre-shared key to establish the initial authentication between the client gateway and the virtual gateway. This key can contain any character except line breaks and double quotes (&amp;quot;). |  [optional] |




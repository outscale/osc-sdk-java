

# Phase1Options

Information about Phase 1 of the Internet Key Exchange (IKE) negotiation. When Phase 1 finishes successfully, peers proceed to Phase 2 negotiations. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dpdTimeoutAction** | **String** | The action to carry out after a Dead Peer Detection (DPD) timeout occurs. |  [optional] |
|**dpdTimeoutSeconds** | **Integer** | The maximum waiting time for a Dead Peer Detection (DPD) response before considering the peer as dead, in seconds. |  [optional] |
|**ikeVersions** | **List&lt;String&gt;** | The Internet Key Exchange (IKE) versions allowed for the VPN tunnel. |  [optional] |
|**phase1DhGroupNumbers** | **List&lt;Integer&gt;** | The Diffie-Hellman (DH) group numbers allowed for the VPN tunnel for phase 1. |  [optional] |
|**phase1EncryptionAlgorithms** | **List&lt;String&gt;** | The encryption algorithms allowed for the VPN tunnel for phase 1. |  [optional] |
|**phase1IntegrityAlgorithms** | **List&lt;String&gt;** | The integrity algorithms allowed for the VPN tunnel for phase 1. |  [optional] |
|**phase1LifetimeSeconds** | **Integer** | The lifetime for phase 1 of the IKE negotiation process, in seconds. |  [optional] |
|**replayWindowSize** | **Integer** | The number of packets in an IKE replay window. |  [optional] |
|**startupAction** | **String** | The action to carry out when establishing tunnels for a VPN connection. |  [optional] |




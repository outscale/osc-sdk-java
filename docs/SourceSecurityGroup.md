

# SourceSecurityGroup

Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.<br /> To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**securityGroupAccountId** | **String** | The account ID of the owner of the security group. |  [optional] |
|**securityGroupName** | **String** | The name of the security group. |  [optional] |




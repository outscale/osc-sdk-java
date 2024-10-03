

# ListenerRule

Information about the listener rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | The type of action for the rule (always &#x60;forward&#x60;). |  [optional] |
|**hostNamePattern** | **String** | A host-name pattern for the rule, with a maximum length of 128 characters. This host-name pattern supports maximum three wildcards, and must not contain any special characters except &#x60;-.?&#x60;. |  [optional] |
|**listenerId** | **Integer** | The ID of the listener. |  [optional] |
|**listenerRuleId** | **Integer** | The ID of the listener rule. |  [optional] |
|**listenerRuleName** | **String** | A human-readable name for the listener rule. |  [optional] |
|**pathPattern** | **String** | A path pattern for the rule, with a maximum length of 128 characters. This path pattern supports maximum three wildcards, and must not contain any special characters except &#x60;_-.$/~&amp;quot;&#39;@:+?&#x60;. |  [optional] |
|**priority** | **Integer** | The priority level of the listener rule, between &#x60;1&#x60; and &#x60;19999&#x60; both included. Each rule must have a unique priority level. Otherwise, an error is returned. |  [optional] |
|**vmIds** | **List&lt;String&gt;** | The IDs of the backend VMs. |  [optional] |




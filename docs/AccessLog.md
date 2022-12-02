

# AccessLog

Information about access logs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isEnabled** | **Boolean** | If true, access logs are enabled for your load balancer. If false, they are not. If you set this to true in your request, the &#x60;OsuBucketName&#x60; parameter is required. |  [optional] |
|**osuBucketName** | **String** | The name of the OOS bucket for the access logs. |  [optional] |
|**osuBucketPrefix** | **String** | The path to the folder of the access logs in your OOS bucket (by default, the &#x60;root&#x60; level of your bucket). |  [optional] |
|**publicationInterval** | **Integer** | The time interval for the publication of access logs in the OOS bucket, in minutes. This value can be either &#x60;5&#x60; or &#x60;60&#x60; (by default, &#x60;60&#x60;). |  [optional] |




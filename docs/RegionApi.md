# RegionApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**readRegions**](RegionApi.md#readRegions) | **POST** /ReadRegions |  |


<a name="readRegions"></a>
# **readRegions**
> ReadRegionsResponse readRegions(readRegionsRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.RegionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");

    RegionApi apiInstance = new RegionApi(defaultClient);
    ReadRegionsRequest readRegionsRequest = new ReadRegionsRequest(); // ReadRegionsRequest | 
    try {
      ReadRegionsResponse result = apiInstance.readRegions(readRegionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegionApi#readRegions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **readRegionsRequest** | [**ReadRegionsRequest**](ReadRegionsRequest.md)|  | [optional] |

### Return type

[**ReadRegionsResponse**](ReadRegionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


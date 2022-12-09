# ProductTypeApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**readProductTypes**](ProductTypeApi.md#readProductTypes) | **POST** /ReadProductTypes |  |


<a name="readProductTypes"></a>
# **readProductTypes**
> ReadProductTypesResponse readProductTypes(readProductTypesRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.ProductTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");

    ProductTypeApi apiInstance = new ProductTypeApi(defaultClient);
    ReadProductTypesRequest readProductTypesRequest = new ReadProductTypesRequest(); // ReadProductTypesRequest | 
    try {
      ReadProductTypesResponse result = apiInstance.readProductTypes(readProductTypesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductTypeApi#readProductTypes");
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
| **readProductTypesRequest** | [**ReadProductTypesRequest**](ReadProductTypesRequest.md)|  | [optional] |

### Return type

[**ReadProductTypesResponse**](ReadProductTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


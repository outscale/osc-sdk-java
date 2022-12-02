# PublicCatalogApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**readPublicCatalog**](PublicCatalogApi.md#readPublicCatalog) | **POST** /ReadPublicCatalog |  |


<a name="readPublicCatalog"></a>
# **readPublicCatalog**
> ReadPublicCatalogResponse readPublicCatalog(readPublicCatalogRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.PublicCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");

    PublicCatalogApi apiInstance = new PublicCatalogApi(defaultClient);
    ReadPublicCatalogRequest readPublicCatalogRequest = new ReadPublicCatalogRequest(); // ReadPublicCatalogRequest | 
    try {
      ReadPublicCatalogResponse result = apiInstance.readPublicCatalog(readPublicCatalogRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicCatalogApi#readPublicCatalog");
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
| **readPublicCatalogRequest** | [**ReadPublicCatalogRequest**](ReadPublicCatalogRequest.md)|  | [optional] |

### Return type

[**ReadPublicCatalogResponse**](ReadPublicCatalogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


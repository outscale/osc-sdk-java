# DirectLinkApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDirectLink**](DirectLinkApi.md#createDirectLink) | **POST** /CreateDirectLink |  |
| [**deleteDirectLink**](DirectLinkApi.md#deleteDirectLink) | **POST** /DeleteDirectLink |  |
| [**readDirectLinks**](DirectLinkApi.md#readDirectLinks) | **POST** /ReadDirectLinks |  |


<a name="createDirectLink"></a>
# **createDirectLink**
> CreateDirectLinkResponse createDirectLink(createDirectLinkRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.DirectLinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DirectLinkApi apiInstance = new DirectLinkApi(defaultClient);
    CreateDirectLinkRequest createDirectLinkRequest = new CreateDirectLinkRequest(); // CreateDirectLinkRequest | 
    try {
      CreateDirectLinkResponse result = apiInstance.createDirectLink(createDirectLinkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectLinkApi#createDirectLink");
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
| **createDirectLinkRequest** | [**CreateDirectLinkRequest**](CreateDirectLinkRequest.md)|  | [optional] |

### Return type

[**CreateDirectLinkResponse**](CreateDirectLinkResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteDirectLink"></a>
# **deleteDirectLink**
> DeleteDirectLinkResponse deleteDirectLink(deleteDirectLinkRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.DirectLinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DirectLinkApi apiInstance = new DirectLinkApi(defaultClient);
    DeleteDirectLinkRequest deleteDirectLinkRequest = new DeleteDirectLinkRequest(); // DeleteDirectLinkRequest | 
    try {
      DeleteDirectLinkResponse result = apiInstance.deleteDirectLink(deleteDirectLinkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectLinkApi#deleteDirectLink");
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
| **deleteDirectLinkRequest** | [**DeleteDirectLinkRequest**](DeleteDirectLinkRequest.md)|  | [optional] |

### Return type

[**DeleteDirectLinkResponse**](DeleteDirectLinkResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readDirectLinks"></a>
# **readDirectLinks**
> ReadDirectLinksResponse readDirectLinks(readDirectLinksRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.DirectLinkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DirectLinkApi apiInstance = new DirectLinkApi(defaultClient);
    ReadDirectLinksRequest readDirectLinksRequest = new ReadDirectLinksRequest(); // ReadDirectLinksRequest | 
    try {
      ReadDirectLinksResponse result = apiInstance.readDirectLinks(readDirectLinksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectLinkApi#readDirectLinks");
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
| **readDirectLinksRequest** | [**ReadDirectLinksRequest**](ReadDirectLinksRequest.md)|  | [optional] |

### Return type

[**ReadDirectLinksResponse**](ReadDirectLinksResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


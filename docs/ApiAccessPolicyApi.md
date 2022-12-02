# ApiAccessPolicyApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**readApiAccessPolicy**](ApiAccessPolicyApi.md#readApiAccessPolicy) | **POST** /ReadApiAccessPolicy |  |
| [**updateApiAccessPolicy**](ApiAccessPolicyApi.md#updateApiAccessPolicy) | **POST** /UpdateApiAccessPolicy |  |


<a name="readApiAccessPolicy"></a>
# **readApiAccessPolicy**
> ReadApiAccessPolicyResponse readApiAccessPolicy(readApiAccessPolicyRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.ApiAccessPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuthSec
    ApiKeyAuth ApiKeyAuthSec = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuthSec");
    ApiKeyAuthSec.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuthSec.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    ApiAccessPolicyApi apiInstance = new ApiAccessPolicyApi(defaultClient);
    ReadApiAccessPolicyRequest readApiAccessPolicyRequest = new ReadApiAccessPolicyRequest(); // ReadApiAccessPolicyRequest | 
    try {
      ReadApiAccessPolicyResponse result = apiInstance.readApiAccessPolicy(readApiAccessPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAccessPolicyApi#readApiAccessPolicy");
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
| **readApiAccessPolicyRequest** | [**ReadApiAccessPolicyRequest**](ReadApiAccessPolicyRequest.md)|  | [optional] |

### Return type

[**ReadApiAccessPolicyResponse**](ReadApiAccessPolicyResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |
| **400** | The HTTP 400 response (Bad Request). |  -  |
| **401** | The HTTP 401 response (Unauthorized). |  -  |
| **500** | The HTTP 500 response (Internal Server Error). |  -  |

<a name="updateApiAccessPolicy"></a>
# **updateApiAccessPolicy**
> UpdateApiAccessPolicyResponse updateApiAccessPolicy(updateApiAccessPolicyRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.ApiAccessPolicyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuthSec
    ApiKeyAuth ApiKeyAuthSec = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuthSec");
    ApiKeyAuthSec.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuthSec.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    ApiAccessPolicyApi apiInstance = new ApiAccessPolicyApi(defaultClient);
    UpdateApiAccessPolicyRequest updateApiAccessPolicyRequest = new UpdateApiAccessPolicyRequest(); // UpdateApiAccessPolicyRequest | 
    try {
      UpdateApiAccessPolicyResponse result = apiInstance.updateApiAccessPolicy(updateApiAccessPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAccessPolicyApi#updateApiAccessPolicy");
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
| **updateApiAccessPolicyRequest** | [**UpdateApiAccessPolicyRequest**](UpdateApiAccessPolicyRequest.md)|  | [optional] |

### Return type

[**UpdateApiAccessPolicyResponse**](UpdateApiAccessPolicyResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |
| **400** | The HTTP 400 response (Bad Request). |  -  |
| **401** | The HTTP 401 response (Unauthorized). |  -  |
| **500** | The HTTP 500 response (Internal Server Error). |  -  |


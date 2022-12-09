# DhcpOptionApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDhcpOptions**](DhcpOptionApi.md#createDhcpOptions) | **POST** /CreateDhcpOptions |  |
| [**deleteDhcpOptions**](DhcpOptionApi.md#deleteDhcpOptions) | **POST** /DeleteDhcpOptions |  |
| [**readDhcpOptions**](DhcpOptionApi.md#readDhcpOptions) | **POST** /ReadDhcpOptions |  |


<a name="createDhcpOptions"></a>
# **createDhcpOptions**
> CreateDhcpOptionsResponse createDhcpOptions(createDhcpOptionsRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.DhcpOptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DhcpOptionApi apiInstance = new DhcpOptionApi(defaultClient);
    CreateDhcpOptionsRequest createDhcpOptionsRequest = new CreateDhcpOptionsRequest(); // CreateDhcpOptionsRequest | 
    try {
      CreateDhcpOptionsResponse result = apiInstance.createDhcpOptions(createDhcpOptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DhcpOptionApi#createDhcpOptions");
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
| **createDhcpOptionsRequest** | [**CreateDhcpOptionsRequest**](CreateDhcpOptionsRequest.md)|  | [optional] |

### Return type

[**CreateDhcpOptionsResponse**](CreateDhcpOptionsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteDhcpOptions"></a>
# **deleteDhcpOptions**
> DeleteDhcpOptionsResponse deleteDhcpOptions(deleteDhcpOptionsRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.DhcpOptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DhcpOptionApi apiInstance = new DhcpOptionApi(defaultClient);
    DeleteDhcpOptionsRequest deleteDhcpOptionsRequest = new DeleteDhcpOptionsRequest(); // DeleteDhcpOptionsRequest | 
    try {
      DeleteDhcpOptionsResponse result = apiInstance.deleteDhcpOptions(deleteDhcpOptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DhcpOptionApi#deleteDhcpOptions");
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
| **deleteDhcpOptionsRequest** | [**DeleteDhcpOptionsRequest**](DeleteDhcpOptionsRequest.md)|  | [optional] |

### Return type

[**DeleteDhcpOptionsResponse**](DeleteDhcpOptionsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readDhcpOptions"></a>
# **readDhcpOptions**
> ReadDhcpOptionsResponse readDhcpOptions(readDhcpOptionsRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.DhcpOptionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DhcpOptionApi apiInstance = new DhcpOptionApi(defaultClient);
    ReadDhcpOptionsRequest readDhcpOptionsRequest = new ReadDhcpOptionsRequest(); // ReadDhcpOptionsRequest | 
    try {
      ReadDhcpOptionsResponse result = apiInstance.readDhcpOptions(readDhcpOptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DhcpOptionApi#readDhcpOptions");
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
| **readDhcpOptionsRequest** | [**ReadDhcpOptionsRequest**](ReadDhcpOptionsRequest.md)|  | [optional] |

### Return type

[**ReadDhcpOptionsResponse**](ReadDhcpOptionsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


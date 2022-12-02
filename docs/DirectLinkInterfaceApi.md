# DirectLinkInterfaceApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDirectLinkInterface**](DirectLinkInterfaceApi.md#createDirectLinkInterface) | **POST** /CreateDirectLinkInterface |  |
| [**deleteDirectLinkInterface**](DirectLinkInterfaceApi.md#deleteDirectLinkInterface) | **POST** /DeleteDirectLinkInterface |  |
| [**readDirectLinkInterfaces**](DirectLinkInterfaceApi.md#readDirectLinkInterfaces) | **POST** /ReadDirectLinkInterfaces |  |
| [**updateDirectLinkInterface**](DirectLinkInterfaceApi.md#updateDirectLinkInterface) | **POST** /UpdateDirectLinkInterface |  |


<a name="createDirectLinkInterface"></a>
# **createDirectLinkInterface**
> CreateDirectLinkInterfaceResponse createDirectLinkInterface(createDirectLinkInterfaceRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.DirectLinkInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DirectLinkInterfaceApi apiInstance = new DirectLinkInterfaceApi(defaultClient);
    CreateDirectLinkInterfaceRequest createDirectLinkInterfaceRequest = new CreateDirectLinkInterfaceRequest(); // CreateDirectLinkInterfaceRequest | 
    try {
      CreateDirectLinkInterfaceResponse result = apiInstance.createDirectLinkInterface(createDirectLinkInterfaceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectLinkInterfaceApi#createDirectLinkInterface");
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
| **createDirectLinkInterfaceRequest** | [**CreateDirectLinkInterfaceRequest**](CreateDirectLinkInterfaceRequest.md)|  | [optional] |

### Return type

[**CreateDirectLinkInterfaceResponse**](CreateDirectLinkInterfaceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteDirectLinkInterface"></a>
# **deleteDirectLinkInterface**
> DeleteDirectLinkInterfaceResponse deleteDirectLinkInterface(deleteDirectLinkInterfaceRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.DirectLinkInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DirectLinkInterfaceApi apiInstance = new DirectLinkInterfaceApi(defaultClient);
    DeleteDirectLinkInterfaceRequest deleteDirectLinkInterfaceRequest = new DeleteDirectLinkInterfaceRequest(); // DeleteDirectLinkInterfaceRequest | 
    try {
      DeleteDirectLinkInterfaceResponse result = apiInstance.deleteDirectLinkInterface(deleteDirectLinkInterfaceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectLinkInterfaceApi#deleteDirectLinkInterface");
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
| **deleteDirectLinkInterfaceRequest** | [**DeleteDirectLinkInterfaceRequest**](DeleteDirectLinkInterfaceRequest.md)|  | [optional] |

### Return type

[**DeleteDirectLinkInterfaceResponse**](DeleteDirectLinkInterfaceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readDirectLinkInterfaces"></a>
# **readDirectLinkInterfaces**
> ReadDirectLinkInterfacesResponse readDirectLinkInterfaces(readDirectLinkInterfacesRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.DirectLinkInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DirectLinkInterfaceApi apiInstance = new DirectLinkInterfaceApi(defaultClient);
    ReadDirectLinkInterfacesRequest readDirectLinkInterfacesRequest = new ReadDirectLinkInterfacesRequest(); // ReadDirectLinkInterfacesRequest | 
    try {
      ReadDirectLinkInterfacesResponse result = apiInstance.readDirectLinkInterfaces(readDirectLinkInterfacesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectLinkInterfaceApi#readDirectLinkInterfaces");
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
| **readDirectLinkInterfacesRequest** | [**ReadDirectLinkInterfacesRequest**](ReadDirectLinkInterfacesRequest.md)|  | [optional] |

### Return type

[**ReadDirectLinkInterfacesResponse**](ReadDirectLinkInterfacesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="updateDirectLinkInterface"></a>
# **updateDirectLinkInterface**
> UpdateDirectLinkInterfaceResponse updateDirectLinkInterface(updateDirectLinkInterfaceRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.DirectLinkInterfaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DirectLinkInterfaceApi apiInstance = new DirectLinkInterfaceApi(defaultClient);
    UpdateDirectLinkInterfaceRequest updateDirectLinkInterfaceRequest = new UpdateDirectLinkInterfaceRequest(); // UpdateDirectLinkInterfaceRequest | 
    try {
      UpdateDirectLinkInterfaceResponse result = apiInstance.updateDirectLinkInterface(updateDirectLinkInterfaceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectLinkInterfaceApi#updateDirectLinkInterface");
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
| **updateDirectLinkInterfaceRequest** | [**UpdateDirectLinkInterfaceRequest**](UpdateDirectLinkInterfaceRequest.md)|  | [optional] |

### Return type

[**UpdateDirectLinkInterfaceResponse**](UpdateDirectLinkInterfaceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


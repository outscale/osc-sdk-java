# NatServiceApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNatService**](NatServiceApi.md#createNatService) | **POST** /CreateNatService |  |
| [**deleteNatService**](NatServiceApi.md#deleteNatService) | **POST** /DeleteNatService |  |
| [**readNatServices**](NatServiceApi.md#readNatServices) | **POST** /ReadNatServices |  |


<a name="createNatService"></a>
# **createNatService**
> CreateNatServiceResponse createNatService(createNatServiceRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.NatServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NatServiceApi apiInstance = new NatServiceApi(defaultClient);
    CreateNatServiceRequest createNatServiceRequest = new CreateNatServiceRequest(); // CreateNatServiceRequest | 
    try {
      CreateNatServiceResponse result = apiInstance.createNatService(createNatServiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NatServiceApi#createNatService");
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
| **createNatServiceRequest** | [**CreateNatServiceRequest**](CreateNatServiceRequest.md)|  | [optional] |

### Return type

[**CreateNatServiceResponse**](CreateNatServiceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

<a name="deleteNatService"></a>
# **deleteNatService**
> DeleteNatServiceResponse deleteNatService(deleteNatServiceRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.NatServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NatServiceApi apiInstance = new NatServiceApi(defaultClient);
    DeleteNatServiceRequest deleteNatServiceRequest = new DeleteNatServiceRequest(); // DeleteNatServiceRequest | 
    try {
      DeleteNatServiceResponse result = apiInstance.deleteNatService(deleteNatServiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NatServiceApi#deleteNatService");
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
| **deleteNatServiceRequest** | [**DeleteNatServiceRequest**](DeleteNatServiceRequest.md)|  | [optional] |

### Return type

[**DeleteNatServiceResponse**](DeleteNatServiceResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

<a name="readNatServices"></a>
# **readNatServices**
> ReadNatServicesResponse readNatServices(readNatServicesRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.NatServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NatServiceApi apiInstance = new NatServiceApi(defaultClient);
    ReadNatServicesRequest readNatServicesRequest = new ReadNatServicesRequest(); // ReadNatServicesRequest | 
    try {
      ReadNatServicesResponse result = apiInstance.readNatServices(readNatServicesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NatServiceApi#readNatServices");
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
| **readNatServicesRequest** | [**ReadNatServicesRequest**](ReadNatServicesRequest.md)|  | [optional] |

### Return type

[**ReadNatServicesResponse**](ReadNatServicesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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


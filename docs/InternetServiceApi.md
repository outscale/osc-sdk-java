# InternetServiceApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInternetService**](InternetServiceApi.md#createInternetService) | **POST** /CreateInternetService |  |
| [**deleteInternetService**](InternetServiceApi.md#deleteInternetService) | **POST** /DeleteInternetService |  |
| [**linkInternetService**](InternetServiceApi.md#linkInternetService) | **POST** /LinkInternetService |  |
| [**readInternetServices**](InternetServiceApi.md#readInternetServices) | **POST** /ReadInternetServices |  |
| [**unlinkInternetService**](InternetServiceApi.md#unlinkInternetService) | **POST** /UnlinkInternetService |  |


<a name="createInternetService"></a>
# **createInternetService**
> CreateInternetServiceResponse createInternetService(createInternetServiceRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.InternetServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InternetServiceApi apiInstance = new InternetServiceApi(defaultClient);
    CreateInternetServiceRequest createInternetServiceRequest = new CreateInternetServiceRequest(); // CreateInternetServiceRequest | 
    try {
      CreateInternetServiceResponse result = apiInstance.createInternetService(createInternetServiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetServiceApi#createInternetService");
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
| **createInternetServiceRequest** | [**CreateInternetServiceRequest**](CreateInternetServiceRequest.md)|  | [optional] |

### Return type

[**CreateInternetServiceResponse**](CreateInternetServiceResponse.md)

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

<a name="deleteInternetService"></a>
# **deleteInternetService**
> DeleteInternetServiceResponse deleteInternetService(deleteInternetServiceRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.InternetServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InternetServiceApi apiInstance = new InternetServiceApi(defaultClient);
    DeleteInternetServiceRequest deleteInternetServiceRequest = new DeleteInternetServiceRequest(); // DeleteInternetServiceRequest | 
    try {
      DeleteInternetServiceResponse result = apiInstance.deleteInternetService(deleteInternetServiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetServiceApi#deleteInternetService");
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
| **deleteInternetServiceRequest** | [**DeleteInternetServiceRequest**](DeleteInternetServiceRequest.md)|  | [optional] |

### Return type

[**DeleteInternetServiceResponse**](DeleteInternetServiceResponse.md)

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

<a name="linkInternetService"></a>
# **linkInternetService**
> LinkInternetServiceResponse linkInternetService(linkInternetServiceRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.InternetServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InternetServiceApi apiInstance = new InternetServiceApi(defaultClient);
    LinkInternetServiceRequest linkInternetServiceRequest = new LinkInternetServiceRequest(); // LinkInternetServiceRequest | 
    try {
      LinkInternetServiceResponse result = apiInstance.linkInternetService(linkInternetServiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetServiceApi#linkInternetService");
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
| **linkInternetServiceRequest** | [**LinkInternetServiceRequest**](LinkInternetServiceRequest.md)|  | [optional] |

### Return type

[**LinkInternetServiceResponse**](LinkInternetServiceResponse.md)

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

<a name="readInternetServices"></a>
# **readInternetServices**
> ReadInternetServicesResponse readInternetServices(readInternetServicesRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.InternetServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InternetServiceApi apiInstance = new InternetServiceApi(defaultClient);
    ReadInternetServicesRequest readInternetServicesRequest = new ReadInternetServicesRequest(); // ReadInternetServicesRequest | 
    try {
      ReadInternetServicesResponse result = apiInstance.readInternetServices(readInternetServicesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetServiceApi#readInternetServices");
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
| **readInternetServicesRequest** | [**ReadInternetServicesRequest**](ReadInternetServicesRequest.md)|  | [optional] |

### Return type

[**ReadInternetServicesResponse**](ReadInternetServicesResponse.md)

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

<a name="unlinkInternetService"></a>
# **unlinkInternetService**
> UnlinkInternetServiceResponse unlinkInternetService(unlinkInternetServiceRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.InternetServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    InternetServiceApi apiInstance = new InternetServiceApi(defaultClient);
    UnlinkInternetServiceRequest unlinkInternetServiceRequest = new UnlinkInternetServiceRequest(); // UnlinkInternetServiceRequest | 
    try {
      UnlinkInternetServiceResponse result = apiInstance.unlinkInternetService(unlinkInternetServiceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternetServiceApi#unlinkInternetService");
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
| **unlinkInternetServiceRequest** | [**UnlinkInternetServiceRequest**](UnlinkInternetServiceRequest.md)|  | [optional] |

### Return type

[**UnlinkInternetServiceResponse**](UnlinkInternetServiceResponse.md)

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


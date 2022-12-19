# NetAccessPointApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNetAccessPoint**](NetAccessPointApi.md#createNetAccessPoint) | **POST** /CreateNetAccessPoint |  |
| [**deleteNetAccessPoint**](NetAccessPointApi.md#deleteNetAccessPoint) | **POST** /DeleteNetAccessPoint |  |
| [**readNetAccessPointServices**](NetAccessPointApi.md#readNetAccessPointServices) | **POST** /ReadNetAccessPointServices |  |
| [**readNetAccessPoints**](NetAccessPointApi.md#readNetAccessPoints) | **POST** /ReadNetAccessPoints |  |
| [**updateNetAccessPoint**](NetAccessPointApi.md#updateNetAccessPoint) | **POST** /UpdateNetAccessPoint |  |


<a name="createNetAccessPoint"></a>
# **createNetAccessPoint**
> CreateNetAccessPointResponse createNetAccessPoint(createNetAccessPointRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.NetAccessPointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NetAccessPointApi apiInstance = new NetAccessPointApi(defaultClient);
    CreateNetAccessPointRequest createNetAccessPointRequest = new CreateNetAccessPointRequest(); // CreateNetAccessPointRequest | 
    try {
      CreateNetAccessPointResponse result = apiInstance.createNetAccessPoint(createNetAccessPointRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetAccessPointApi#createNetAccessPoint");
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
| **createNetAccessPointRequest** | [**CreateNetAccessPointRequest**](CreateNetAccessPointRequest.md)|  | [optional] |

### Return type

[**CreateNetAccessPointResponse**](CreateNetAccessPointResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteNetAccessPoint"></a>
# **deleteNetAccessPoint**
> DeleteNetAccessPointResponse deleteNetAccessPoint(deleteNetAccessPointRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.NetAccessPointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NetAccessPointApi apiInstance = new NetAccessPointApi(defaultClient);
    DeleteNetAccessPointRequest deleteNetAccessPointRequest = new DeleteNetAccessPointRequest(); // DeleteNetAccessPointRequest | 
    try {
      DeleteNetAccessPointResponse result = apiInstance.deleteNetAccessPoint(deleteNetAccessPointRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetAccessPointApi#deleteNetAccessPoint");
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
| **deleteNetAccessPointRequest** | [**DeleteNetAccessPointRequest**](DeleteNetAccessPointRequest.md)|  | [optional] |

### Return type

[**DeleteNetAccessPointResponse**](DeleteNetAccessPointResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readNetAccessPointServices"></a>
# **readNetAccessPointServices**
> ReadNetAccessPointServicesResponse readNetAccessPointServices(readNetAccessPointServicesRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.NetAccessPointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")

    NetAccessPointApi apiInstance = new NetAccessPointApi(defaultClient);
    ReadNetAccessPointServicesRequest readNetAccessPointServicesRequest = new ReadNetAccessPointServicesRequest(); // ReadNetAccessPointServicesRequest | 
    try {
      ReadNetAccessPointServicesResponse result = apiInstance.readNetAccessPointServices(readNetAccessPointServicesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetAccessPointApi#readNetAccessPointServices");
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
| **readNetAccessPointServicesRequest** | [**ReadNetAccessPointServicesRequest**](ReadNetAccessPointServicesRequest.md)|  | [optional] |

### Return type

[**ReadNetAccessPointServicesResponse**](ReadNetAccessPointServicesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readNetAccessPoints"></a>
# **readNetAccessPoints**
> ReadNetAccessPointsResponse readNetAccessPoints(readNetAccessPointsRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.NetAccessPointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NetAccessPointApi apiInstance = new NetAccessPointApi(defaultClient);
    ReadNetAccessPointsRequest readNetAccessPointsRequest = new ReadNetAccessPointsRequest(); // ReadNetAccessPointsRequest | 
    try {
      ReadNetAccessPointsResponse result = apiInstance.readNetAccessPoints(readNetAccessPointsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetAccessPointApi#readNetAccessPoints");
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
| **readNetAccessPointsRequest** | [**ReadNetAccessPointsRequest**](ReadNetAccessPointsRequest.md)|  | [optional] |

### Return type

[**ReadNetAccessPointsResponse**](ReadNetAccessPointsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="updateNetAccessPoint"></a>
# **updateNetAccessPoint**
> UpdateNetAccessPointResponse updateNetAccessPoint(updateNetAccessPointRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.NetAccessPointApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NetAccessPointApi apiInstance = new NetAccessPointApi(defaultClient);
    UpdateNetAccessPointRequest updateNetAccessPointRequest = new UpdateNetAccessPointRequest(); // UpdateNetAccessPointRequest | 
    try {
      UpdateNetAccessPointResponse result = apiInstance.updateNetAccessPoint(updateNetAccessPointRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetAccessPointApi#updateNetAccessPoint");
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
| **updateNetAccessPointRequest** | [**UpdateNetAccessPointRequest**](UpdateNetAccessPointRequest.md)|  | [optional] |

### Return type

[**UpdateNetAccessPointResponse**](UpdateNetAccessPointResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


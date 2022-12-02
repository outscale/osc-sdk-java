# NetPeeringApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptNetPeering**](NetPeeringApi.md#acceptNetPeering) | **POST** /AcceptNetPeering |  |
| [**createNetPeering**](NetPeeringApi.md#createNetPeering) | **POST** /CreateNetPeering |  |
| [**deleteNetPeering**](NetPeeringApi.md#deleteNetPeering) | **POST** /DeleteNetPeering |  |
| [**readNetPeerings**](NetPeeringApi.md#readNetPeerings) | **POST** /ReadNetPeerings |  |
| [**rejectNetPeering**](NetPeeringApi.md#rejectNetPeering) | **POST** /RejectNetPeering |  |


<a name="acceptNetPeering"></a>
# **acceptNetPeering**
> AcceptNetPeeringResponse acceptNetPeering(acceptNetPeeringRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.NetPeeringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NetPeeringApi apiInstance = new NetPeeringApi(defaultClient);
    AcceptNetPeeringRequest acceptNetPeeringRequest = new AcceptNetPeeringRequest(); // AcceptNetPeeringRequest | 
    try {
      AcceptNetPeeringResponse result = apiInstance.acceptNetPeering(acceptNetPeeringRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetPeeringApi#acceptNetPeering");
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
| **acceptNetPeeringRequest** | [**AcceptNetPeeringRequest**](AcceptNetPeeringRequest.md)|  | [optional] |

### Return type

[**AcceptNetPeeringResponse**](AcceptNetPeeringResponse.md)

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
| **409** | The HTTP 409 response (Conflict). |  -  |
| **500** | The HTTP 500 response (Internal Server Error). |  -  |

<a name="createNetPeering"></a>
# **createNetPeering**
> CreateNetPeeringResponse createNetPeering(createNetPeeringRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.NetPeeringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NetPeeringApi apiInstance = new NetPeeringApi(defaultClient);
    CreateNetPeeringRequest createNetPeeringRequest = new CreateNetPeeringRequest(); // CreateNetPeeringRequest | 
    try {
      CreateNetPeeringResponse result = apiInstance.createNetPeering(createNetPeeringRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetPeeringApi#createNetPeering");
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
| **createNetPeeringRequest** | [**CreateNetPeeringRequest**](CreateNetPeeringRequest.md)|  | [optional] |

### Return type

[**CreateNetPeeringResponse**](CreateNetPeeringResponse.md)

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

<a name="deleteNetPeering"></a>
# **deleteNetPeering**
> DeleteNetPeeringResponse deleteNetPeering(deleteNetPeeringRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.NetPeeringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NetPeeringApi apiInstance = new NetPeeringApi(defaultClient);
    DeleteNetPeeringRequest deleteNetPeeringRequest = new DeleteNetPeeringRequest(); // DeleteNetPeeringRequest | 
    try {
      DeleteNetPeeringResponse result = apiInstance.deleteNetPeering(deleteNetPeeringRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetPeeringApi#deleteNetPeering");
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
| **deleteNetPeeringRequest** | [**DeleteNetPeeringRequest**](DeleteNetPeeringRequest.md)|  | [optional] |

### Return type

[**DeleteNetPeeringResponse**](DeleteNetPeeringResponse.md)

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
| **409** | The HTTP 409 response (Conflict). |  -  |
| **500** | The HTTP 500 response (Internal Server Error). |  -  |

<a name="readNetPeerings"></a>
# **readNetPeerings**
> ReadNetPeeringsResponse readNetPeerings(readNetPeeringsRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.NetPeeringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NetPeeringApi apiInstance = new NetPeeringApi(defaultClient);
    ReadNetPeeringsRequest readNetPeeringsRequest = new ReadNetPeeringsRequest(); // ReadNetPeeringsRequest | 
    try {
      ReadNetPeeringsResponse result = apiInstance.readNetPeerings(readNetPeeringsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetPeeringApi#readNetPeerings");
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
| **readNetPeeringsRequest** | [**ReadNetPeeringsRequest**](ReadNetPeeringsRequest.md)|  | [optional] |

### Return type

[**ReadNetPeeringsResponse**](ReadNetPeeringsResponse.md)

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

<a name="rejectNetPeering"></a>
# **rejectNetPeering**
> RejectNetPeeringResponse rejectNetPeering(rejectNetPeeringRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.NetPeeringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    NetPeeringApi apiInstance = new NetPeeringApi(defaultClient);
    RejectNetPeeringRequest rejectNetPeeringRequest = new RejectNetPeeringRequest(); // RejectNetPeeringRequest | 
    try {
      RejectNetPeeringResponse result = apiInstance.rejectNetPeering(rejectNetPeeringRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetPeeringApi#rejectNetPeering");
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
| **rejectNetPeeringRequest** | [**RejectNetPeeringRequest**](RejectNetPeeringRequest.md)|  | [optional] |

### Return type

[**RejectNetPeeringResponse**](RejectNetPeeringResponse.md)

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
| **409** | The HTTP 409 response (Conflict). |  -  |
| **500** | The HTTP 500 response (Internal Server Error). |  -  |


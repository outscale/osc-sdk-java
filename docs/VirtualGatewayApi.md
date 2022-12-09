# VirtualGatewayApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVirtualGateway**](VirtualGatewayApi.md#createVirtualGateway) | **POST** /CreateVirtualGateway |  |
| [**deleteVirtualGateway**](VirtualGatewayApi.md#deleteVirtualGateway) | **POST** /DeleteVirtualGateway |  |
| [**linkVirtualGateway**](VirtualGatewayApi.md#linkVirtualGateway) | **POST** /LinkVirtualGateway |  |
| [**readVirtualGateways**](VirtualGatewayApi.md#readVirtualGateways) | **POST** /ReadVirtualGateways |  |
| [**unlinkVirtualGateway**](VirtualGatewayApi.md#unlinkVirtualGateway) | **POST** /UnlinkVirtualGateway |  |
| [**updateRoutePropagation**](VirtualGatewayApi.md#updateRoutePropagation) | **POST** /UpdateRoutePropagation |  |


<a name="createVirtualGateway"></a>
# **createVirtualGateway**
> CreateVirtualGatewayResponse createVirtualGateway(createVirtualGatewayRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VirtualGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VirtualGatewayApi apiInstance = new VirtualGatewayApi(defaultClient);
    CreateVirtualGatewayRequest createVirtualGatewayRequest = new CreateVirtualGatewayRequest(); // CreateVirtualGatewayRequest | 
    try {
      CreateVirtualGatewayResponse result = apiInstance.createVirtualGateway(createVirtualGatewayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualGatewayApi#createVirtualGateway");
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
| **createVirtualGatewayRequest** | [**CreateVirtualGatewayRequest**](CreateVirtualGatewayRequest.md)|  | [optional] |

### Return type

[**CreateVirtualGatewayResponse**](CreateVirtualGatewayResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteVirtualGateway"></a>
# **deleteVirtualGateway**
> DeleteVirtualGatewayResponse deleteVirtualGateway(deleteVirtualGatewayRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VirtualGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VirtualGatewayApi apiInstance = new VirtualGatewayApi(defaultClient);
    DeleteVirtualGatewayRequest deleteVirtualGatewayRequest = new DeleteVirtualGatewayRequest(); // DeleteVirtualGatewayRequest | 
    try {
      DeleteVirtualGatewayResponse result = apiInstance.deleteVirtualGateway(deleteVirtualGatewayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualGatewayApi#deleteVirtualGateway");
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
| **deleteVirtualGatewayRequest** | [**DeleteVirtualGatewayRequest**](DeleteVirtualGatewayRequest.md)|  | [optional] |

### Return type

[**DeleteVirtualGatewayResponse**](DeleteVirtualGatewayResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="linkVirtualGateway"></a>
# **linkVirtualGateway**
> LinkVirtualGatewayResponse linkVirtualGateway(linkVirtualGatewayRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VirtualGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VirtualGatewayApi apiInstance = new VirtualGatewayApi(defaultClient);
    LinkVirtualGatewayRequest linkVirtualGatewayRequest = new LinkVirtualGatewayRequest(); // LinkVirtualGatewayRequest | 
    try {
      LinkVirtualGatewayResponse result = apiInstance.linkVirtualGateway(linkVirtualGatewayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualGatewayApi#linkVirtualGateway");
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
| **linkVirtualGatewayRequest** | [**LinkVirtualGatewayRequest**](LinkVirtualGatewayRequest.md)|  | [optional] |

### Return type

[**LinkVirtualGatewayResponse**](LinkVirtualGatewayResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readVirtualGateways"></a>
# **readVirtualGateways**
> ReadVirtualGatewaysResponse readVirtualGateways(readVirtualGatewaysRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VirtualGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VirtualGatewayApi apiInstance = new VirtualGatewayApi(defaultClient);
    ReadVirtualGatewaysRequest readVirtualGatewaysRequest = new ReadVirtualGatewaysRequest(); // ReadVirtualGatewaysRequest | 
    try {
      ReadVirtualGatewaysResponse result = apiInstance.readVirtualGateways(readVirtualGatewaysRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualGatewayApi#readVirtualGateways");
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
| **readVirtualGatewaysRequest** | [**ReadVirtualGatewaysRequest**](ReadVirtualGatewaysRequest.md)|  | [optional] |

### Return type

[**ReadVirtualGatewaysResponse**](ReadVirtualGatewaysResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="unlinkVirtualGateway"></a>
# **unlinkVirtualGateway**
> UnlinkVirtualGatewayResponse unlinkVirtualGateway(unlinkVirtualGatewayRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VirtualGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VirtualGatewayApi apiInstance = new VirtualGatewayApi(defaultClient);
    UnlinkVirtualGatewayRequest unlinkVirtualGatewayRequest = new UnlinkVirtualGatewayRequest(); // UnlinkVirtualGatewayRequest | 
    try {
      UnlinkVirtualGatewayResponse result = apiInstance.unlinkVirtualGateway(unlinkVirtualGatewayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualGatewayApi#unlinkVirtualGateway");
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
| **unlinkVirtualGatewayRequest** | [**UnlinkVirtualGatewayRequest**](UnlinkVirtualGatewayRequest.md)|  | [optional] |

### Return type

[**UnlinkVirtualGatewayResponse**](UnlinkVirtualGatewayResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="updateRoutePropagation"></a>
# **updateRoutePropagation**
> UpdateRoutePropagationResponse updateRoutePropagation(updateRoutePropagationRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VirtualGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    VirtualGatewayApi apiInstance = new VirtualGatewayApi(defaultClient);
    UpdateRoutePropagationRequest updateRoutePropagationRequest = new UpdateRoutePropagationRequest(); // UpdateRoutePropagationRequest | 
    try {
      UpdateRoutePropagationResponse result = apiInstance.updateRoutePropagation(updateRoutePropagationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualGatewayApi#updateRoutePropagation");
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
| **updateRoutePropagationRequest** | [**UpdateRoutePropagationRequest**](UpdateRoutePropagationRequest.md)|  | [optional] |

### Return type

[**UpdateRoutePropagationResponse**](UpdateRoutePropagationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


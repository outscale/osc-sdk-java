# VpnConnectionApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVpnConnection**](VpnConnectionApi.md#createVpnConnection) | **POST** /CreateVpnConnection |  |
| [**createVpnConnectionRoute**](VpnConnectionApi.md#createVpnConnectionRoute) | **POST** /CreateVpnConnectionRoute |  |
| [**deleteVpnConnection**](VpnConnectionApi.md#deleteVpnConnection) | **POST** /DeleteVpnConnection |  |
| [**deleteVpnConnectionRoute**](VpnConnectionApi.md#deleteVpnConnectionRoute) | **POST** /DeleteVpnConnectionRoute |  |
| [**readVpnConnections**](VpnConnectionApi.md#readVpnConnections) | **POST** /ReadVpnConnections |  |
| [**updateVpnConnection**](VpnConnectionApi.md#updateVpnConnection) | **POST** /UpdateVpnConnection |  |


<a name="createVpnConnection"></a>
# **createVpnConnection**
> CreateVpnConnectionResponse createVpnConnection(createVpnConnectionRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VpnConnectionApi;

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

    VpnConnectionApi apiInstance = new VpnConnectionApi(defaultClient);
    CreateVpnConnectionRequest createVpnConnectionRequest = new CreateVpnConnectionRequest(); // CreateVpnConnectionRequest | 
    try {
      CreateVpnConnectionResponse result = apiInstance.createVpnConnection(createVpnConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VpnConnectionApi#createVpnConnection");
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
| **createVpnConnectionRequest** | [**CreateVpnConnectionRequest**](CreateVpnConnectionRequest.md)|  | [optional] |

### Return type

[**CreateVpnConnectionResponse**](CreateVpnConnectionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="createVpnConnectionRoute"></a>
# **createVpnConnectionRoute**
> CreateVpnConnectionRouteResponse createVpnConnectionRoute(createVpnConnectionRouteRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VpnConnectionApi;

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

    VpnConnectionApi apiInstance = new VpnConnectionApi(defaultClient);
    CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest = new CreateVpnConnectionRouteRequest(); // CreateVpnConnectionRouteRequest | 
    try {
      CreateVpnConnectionRouteResponse result = apiInstance.createVpnConnectionRoute(createVpnConnectionRouteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VpnConnectionApi#createVpnConnectionRoute");
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
| **createVpnConnectionRouteRequest** | [**CreateVpnConnectionRouteRequest**](CreateVpnConnectionRouteRequest.md)|  | [optional] |

### Return type

[**CreateVpnConnectionRouteResponse**](CreateVpnConnectionRouteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteVpnConnection"></a>
# **deleteVpnConnection**
> DeleteVpnConnectionResponse deleteVpnConnection(deleteVpnConnectionRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VpnConnectionApi;

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

    VpnConnectionApi apiInstance = new VpnConnectionApi(defaultClient);
    DeleteVpnConnectionRequest deleteVpnConnectionRequest = new DeleteVpnConnectionRequest(); // DeleteVpnConnectionRequest | 
    try {
      DeleteVpnConnectionResponse result = apiInstance.deleteVpnConnection(deleteVpnConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VpnConnectionApi#deleteVpnConnection");
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
| **deleteVpnConnectionRequest** | [**DeleteVpnConnectionRequest**](DeleteVpnConnectionRequest.md)|  | [optional] |

### Return type

[**DeleteVpnConnectionResponse**](DeleteVpnConnectionResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteVpnConnectionRoute"></a>
# **deleteVpnConnectionRoute**
> DeleteVpnConnectionRouteResponse deleteVpnConnectionRoute(deleteVpnConnectionRouteRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VpnConnectionApi;

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

    VpnConnectionApi apiInstance = new VpnConnectionApi(defaultClient);
    DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest = new DeleteVpnConnectionRouteRequest(); // DeleteVpnConnectionRouteRequest | 
    try {
      DeleteVpnConnectionRouteResponse result = apiInstance.deleteVpnConnectionRoute(deleteVpnConnectionRouteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VpnConnectionApi#deleteVpnConnectionRoute");
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
| **deleteVpnConnectionRouteRequest** | [**DeleteVpnConnectionRouteRequest**](DeleteVpnConnectionRouteRequest.md)|  | [optional] |

### Return type

[**DeleteVpnConnectionRouteResponse**](DeleteVpnConnectionRouteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readVpnConnections"></a>
# **readVpnConnections**
> ReadVpnConnectionsResponse readVpnConnections(readVpnConnectionsRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VpnConnectionApi;

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

    VpnConnectionApi apiInstance = new VpnConnectionApi(defaultClient);
    ReadVpnConnectionsRequest readVpnConnectionsRequest = new ReadVpnConnectionsRequest(); // ReadVpnConnectionsRequest | 
    try {
      ReadVpnConnectionsResponse result = apiInstance.readVpnConnections(readVpnConnectionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VpnConnectionApi#readVpnConnections");
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
| **readVpnConnectionsRequest** | [**ReadVpnConnectionsRequest**](ReadVpnConnectionsRequest.md)|  | [optional] |

### Return type

[**ReadVpnConnectionsResponse**](ReadVpnConnectionsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="updateVpnConnection"></a>
# **updateVpnConnection**
> UpdateVpnConnectionResponse updateVpnConnection(updateVpnConnectionRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.VpnConnectionApi;

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

    VpnConnectionApi apiInstance = new VpnConnectionApi(defaultClient);
    UpdateVpnConnectionRequest updateVpnConnectionRequest = new UpdateVpnConnectionRequest(); // UpdateVpnConnectionRequest | 
    try {
      UpdateVpnConnectionResponse result = apiInstance.updateVpnConnection(updateVpnConnectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VpnConnectionApi#updateVpnConnection");
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
| **updateVpnConnectionRequest** | [**UpdateVpnConnectionRequest**](UpdateVpnConnectionRequest.md)|  | [optional] |

### Return type

[**UpdateVpnConnectionResponse**](UpdateVpnConnectionResponse.md)

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


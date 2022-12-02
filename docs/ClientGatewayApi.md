# ClientGatewayApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createClientGateway**](ClientGatewayApi.md#createClientGateway) | **POST** /CreateClientGateway |  |
| [**deleteClientGateway**](ClientGatewayApi.md#deleteClientGateway) | **POST** /DeleteClientGateway |  |
| [**readClientGateways**](ClientGatewayApi.md#readClientGateways) | **POST** /ReadClientGateways |  |


<a name="createClientGateway"></a>
# **createClientGateway**
> CreateClientGatewayResponse createClientGateway(createClientGatewayRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.ClientGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientGatewayApi apiInstance = new ClientGatewayApi(defaultClient);
    CreateClientGatewayRequest createClientGatewayRequest = new CreateClientGatewayRequest(); // CreateClientGatewayRequest | 
    try {
      CreateClientGatewayResponse result = apiInstance.createClientGateway(createClientGatewayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientGatewayApi#createClientGateway");
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
| **createClientGatewayRequest** | [**CreateClientGatewayRequest**](CreateClientGatewayRequest.md)|  | [optional] |

### Return type

[**CreateClientGatewayResponse**](CreateClientGatewayResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteClientGateway"></a>
# **deleteClientGateway**
> DeleteClientGatewayResponse deleteClientGateway(deleteClientGatewayRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.ClientGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientGatewayApi apiInstance = new ClientGatewayApi(defaultClient);
    DeleteClientGatewayRequest deleteClientGatewayRequest = new DeleteClientGatewayRequest(); // DeleteClientGatewayRequest | 
    try {
      DeleteClientGatewayResponse result = apiInstance.deleteClientGateway(deleteClientGatewayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientGatewayApi#deleteClientGateway");
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
| **deleteClientGatewayRequest** | [**DeleteClientGatewayRequest**](DeleteClientGatewayRequest.md)|  | [optional] |

### Return type

[**DeleteClientGatewayResponse**](DeleteClientGatewayResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readClientGateways"></a>
# **readClientGateways**
> ReadClientGatewaysResponse readClientGateways(readClientGatewaysRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.ClientGatewayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ClientGatewayApi apiInstance = new ClientGatewayApi(defaultClient);
    ReadClientGatewaysRequest readClientGatewaysRequest = new ReadClientGatewaysRequest(); // ReadClientGatewaysRequest | 
    try {
      ReadClientGatewaysResponse result = apiInstance.readClientGateways(readClientGatewaysRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientGatewayApi#readClientGateways");
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
| **readClientGatewaysRequest** | [**ReadClientGatewaysRequest**](ReadClientGatewaysRequest.md)|  | [optional] |

### Return type

[**ReadClientGatewaysResponse**](ReadClientGatewaysResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


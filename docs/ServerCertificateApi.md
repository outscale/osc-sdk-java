# ServerCertificateApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createServerCertificate**](ServerCertificateApi.md#createServerCertificate) | **POST** /CreateServerCertificate |  |
| [**deleteServerCertificate**](ServerCertificateApi.md#deleteServerCertificate) | **POST** /DeleteServerCertificate |  |
| [**readServerCertificates**](ServerCertificateApi.md#readServerCertificates) | **POST** /ReadServerCertificates |  |
| [**updateServerCertificate**](ServerCertificateApi.md#updateServerCertificate) | **POST** /UpdateServerCertificate |  |


<a name="createServerCertificate"></a>
# **createServerCertificate**
> CreateServerCertificateResponse createServerCertificate(createServerCertificateRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.ServerCertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ServerCertificateApi apiInstance = new ServerCertificateApi(defaultClient);
    CreateServerCertificateRequest createServerCertificateRequest = new CreateServerCertificateRequest(); // CreateServerCertificateRequest | 
    try {
      CreateServerCertificateResponse result = apiInstance.createServerCertificate(createServerCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerCertificateApi#createServerCertificate");
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
| **createServerCertificateRequest** | [**CreateServerCertificateRequest**](CreateServerCertificateRequest.md)|  | [optional] |

### Return type

[**CreateServerCertificateResponse**](CreateServerCertificateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteServerCertificate"></a>
# **deleteServerCertificate**
> DeleteServerCertificateResponse deleteServerCertificate(deleteServerCertificateRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.ServerCertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ServerCertificateApi apiInstance = new ServerCertificateApi(defaultClient);
    DeleteServerCertificateRequest deleteServerCertificateRequest = new DeleteServerCertificateRequest(); // DeleteServerCertificateRequest | 
    try {
      DeleteServerCertificateResponse result = apiInstance.deleteServerCertificate(deleteServerCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerCertificateApi#deleteServerCertificate");
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
| **deleteServerCertificateRequest** | [**DeleteServerCertificateRequest**](DeleteServerCertificateRequest.md)|  | [optional] |

### Return type

[**DeleteServerCertificateResponse**](DeleteServerCertificateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readServerCertificates"></a>
# **readServerCertificates**
> ReadServerCertificatesResponse readServerCertificates(readServerCertificatesRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.ServerCertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ServerCertificateApi apiInstance = new ServerCertificateApi(defaultClient);
    ReadServerCertificatesRequest readServerCertificatesRequest = new ReadServerCertificatesRequest(); // ReadServerCertificatesRequest | 
    try {
      ReadServerCertificatesResponse result = apiInstance.readServerCertificates(readServerCertificatesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerCertificateApi#readServerCertificates");
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
| **readServerCertificatesRequest** | [**ReadServerCertificatesRequest**](ReadServerCertificatesRequest.md)|  | [optional] |

### Return type

[**ReadServerCertificatesResponse**](ReadServerCertificatesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="updateServerCertificate"></a>
# **updateServerCertificate**
> UpdateServerCertificateResponse updateServerCertificate(updateServerCertificateRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.ServerCertificateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ServerCertificateApi apiInstance = new ServerCertificateApi(defaultClient);
    UpdateServerCertificateRequest updateServerCertificateRequest = new UpdateServerCertificateRequest(); // UpdateServerCertificateRequest | 
    try {
      UpdateServerCertificateResponse result = apiInstance.updateServerCertificate(updateServerCertificateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServerCertificateApi#updateServerCertificate");
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
| **updateServerCertificateRequest** | [**UpdateServerCertificateRequest**](UpdateServerCertificateRequest.md)|  | [optional] |

### Return type

[**UpdateServerCertificateResponse**](UpdateServerCertificateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


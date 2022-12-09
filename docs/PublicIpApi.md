# PublicIpApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPublicIp**](PublicIpApi.md#createPublicIp) | **POST** /CreatePublicIp |  |
| [**deletePublicIp**](PublicIpApi.md#deletePublicIp) | **POST** /DeletePublicIp |  |
| [**linkPublicIp**](PublicIpApi.md#linkPublicIp) | **POST** /LinkPublicIp |  |
| [**readPublicIpRanges**](PublicIpApi.md#readPublicIpRanges) | **POST** /ReadPublicIpRanges |  |
| [**readPublicIps**](PublicIpApi.md#readPublicIps) | **POST** /ReadPublicIps |  |
| [**unlinkPublicIp**](PublicIpApi.md#unlinkPublicIp) | **POST** /UnlinkPublicIp |  |


<a name="createPublicIp"></a>
# **createPublicIp**
> CreatePublicIpResponse createPublicIp(createPublicIpRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.PublicIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PublicIpApi apiInstance = new PublicIpApi(defaultClient);
    CreatePublicIpRequest createPublicIpRequest = new CreatePublicIpRequest(); // CreatePublicIpRequest | 
    try {
      CreatePublicIpResponse result = apiInstance.createPublicIp(createPublicIpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicIpApi#createPublicIp");
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
| **createPublicIpRequest** | [**CreatePublicIpRequest**](CreatePublicIpRequest.md)|  | [optional] |

### Return type

[**CreatePublicIpResponse**](CreatePublicIpResponse.md)

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

<a name="deletePublicIp"></a>
# **deletePublicIp**
> DeletePublicIpResponse deletePublicIp(deletePublicIpRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.PublicIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PublicIpApi apiInstance = new PublicIpApi(defaultClient);
    DeletePublicIpRequest deletePublicIpRequest = new DeletePublicIpRequest(); // DeletePublicIpRequest | 
    try {
      DeletePublicIpResponse result = apiInstance.deletePublicIp(deletePublicIpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicIpApi#deletePublicIp");
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
| **deletePublicIpRequest** | [**DeletePublicIpRequest**](DeletePublicIpRequest.md)|  | [optional] |

### Return type

[**DeletePublicIpResponse**](DeletePublicIpResponse.md)

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

<a name="linkPublicIp"></a>
# **linkPublicIp**
> LinkPublicIpResponse linkPublicIp(linkPublicIpRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.PublicIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PublicIpApi apiInstance = new PublicIpApi(defaultClient);
    LinkPublicIpRequest linkPublicIpRequest = new LinkPublicIpRequest(); // LinkPublicIpRequest | 
    try {
      LinkPublicIpResponse result = apiInstance.linkPublicIp(linkPublicIpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicIpApi#linkPublicIp");
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
| **linkPublicIpRequest** | [**LinkPublicIpRequest**](LinkPublicIpRequest.md)|  | [optional] |

### Return type

[**LinkPublicIpResponse**](LinkPublicIpResponse.md)

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

<a name="readPublicIpRanges"></a>
# **readPublicIpRanges**
> ReadPublicIpRangesResponse readPublicIpRanges(readPublicIpRangesRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.PublicIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");

    PublicIpApi apiInstance = new PublicIpApi(defaultClient);
    ReadPublicIpRangesRequest readPublicIpRangesRequest = new ReadPublicIpRangesRequest(); // ReadPublicIpRangesRequest | 
    try {
      ReadPublicIpRangesResponse result = apiInstance.readPublicIpRanges(readPublicIpRangesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicIpApi#readPublicIpRanges");
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
| **readPublicIpRangesRequest** | [**ReadPublicIpRangesRequest**](ReadPublicIpRangesRequest.md)|  | [optional] |

### Return type

[**ReadPublicIpRangesResponse**](ReadPublicIpRangesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readPublicIps"></a>
# **readPublicIps**
> ReadPublicIpsResponse readPublicIps(readPublicIpsRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.PublicIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PublicIpApi apiInstance = new PublicIpApi(defaultClient);
    ReadPublicIpsRequest readPublicIpsRequest = new ReadPublicIpsRequest(); // ReadPublicIpsRequest | 
    try {
      ReadPublicIpsResponse result = apiInstance.readPublicIps(readPublicIpsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicIpApi#readPublicIps");
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
| **readPublicIpsRequest** | [**ReadPublicIpsRequest**](ReadPublicIpsRequest.md)|  | [optional] |

### Return type

[**ReadPublicIpsResponse**](ReadPublicIpsResponse.md)

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

<a name="unlinkPublicIp"></a>
# **unlinkPublicIp**
> UnlinkPublicIpResponse unlinkPublicIp(unlinkPublicIpRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.PublicIpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    PublicIpApi apiInstance = new PublicIpApi(defaultClient);
    UnlinkPublicIpRequest unlinkPublicIpRequest = new UnlinkPublicIpRequest(); // UnlinkPublicIpRequest | 
    try {
      UnlinkPublicIpResponse result = apiInstance.unlinkPublicIp(unlinkPublicIpRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicIpApi#unlinkPublicIp");
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
| **unlinkPublicIpRequest** | [**UnlinkPublicIpRequest**](UnlinkPublicIpRequest.md)|  | [optional] |

### Return type

[**UnlinkPublicIpResponse**](UnlinkPublicIpResponse.md)

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


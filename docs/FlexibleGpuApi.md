# FlexibleGpuApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFlexibleGpu**](FlexibleGpuApi.md#createFlexibleGpu) | **POST** /CreateFlexibleGpu |  |
| [**deleteFlexibleGpu**](FlexibleGpuApi.md#deleteFlexibleGpu) | **POST** /DeleteFlexibleGpu |  |
| [**linkFlexibleGpu**](FlexibleGpuApi.md#linkFlexibleGpu) | **POST** /LinkFlexibleGpu |  |
| [**readFlexibleGpuCatalog**](FlexibleGpuApi.md#readFlexibleGpuCatalog) | **POST** /ReadFlexibleGpuCatalog |  |
| [**readFlexibleGpus**](FlexibleGpuApi.md#readFlexibleGpus) | **POST** /ReadFlexibleGpus |  |
| [**unlinkFlexibleGpu**](FlexibleGpuApi.md#unlinkFlexibleGpu) | **POST** /UnlinkFlexibleGpu |  |
| [**updateFlexibleGpu**](FlexibleGpuApi.md#updateFlexibleGpu) | **POST** /UpdateFlexibleGpu |  |


<a name="createFlexibleGpu"></a>
# **createFlexibleGpu**
> CreateFlexibleGpuResponse createFlexibleGpu(createFlexibleGpuRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.FlexibleGpuApi;

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

    FlexibleGpuApi apiInstance = new FlexibleGpuApi(defaultClient);
    CreateFlexibleGpuRequest createFlexibleGpuRequest = new CreateFlexibleGpuRequest(); // CreateFlexibleGpuRequest | 
    try {
      CreateFlexibleGpuResponse result = apiInstance.createFlexibleGpu(createFlexibleGpuRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleGpuApi#createFlexibleGpu");
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
| **createFlexibleGpuRequest** | [**CreateFlexibleGpuRequest**](CreateFlexibleGpuRequest.md)|  | [optional] |

### Return type

[**CreateFlexibleGpuResponse**](CreateFlexibleGpuResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteFlexibleGpu"></a>
# **deleteFlexibleGpu**
> DeleteFlexibleGpuResponse deleteFlexibleGpu(deleteFlexibleGpuRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.FlexibleGpuApi;

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

    FlexibleGpuApi apiInstance = new FlexibleGpuApi(defaultClient);
    DeleteFlexibleGpuRequest deleteFlexibleGpuRequest = new DeleteFlexibleGpuRequest(); // DeleteFlexibleGpuRequest | 
    try {
      DeleteFlexibleGpuResponse result = apiInstance.deleteFlexibleGpu(deleteFlexibleGpuRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleGpuApi#deleteFlexibleGpu");
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
| **deleteFlexibleGpuRequest** | [**DeleteFlexibleGpuRequest**](DeleteFlexibleGpuRequest.md)|  | [optional] |

### Return type

[**DeleteFlexibleGpuResponse**](DeleteFlexibleGpuResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="linkFlexibleGpu"></a>
# **linkFlexibleGpu**
> LinkFlexibleGpuResponse linkFlexibleGpu(linkFlexibleGpuRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.FlexibleGpuApi;

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

    FlexibleGpuApi apiInstance = new FlexibleGpuApi(defaultClient);
    LinkFlexibleGpuRequest linkFlexibleGpuRequest = new LinkFlexibleGpuRequest(); // LinkFlexibleGpuRequest | 
    try {
      LinkFlexibleGpuResponse result = apiInstance.linkFlexibleGpu(linkFlexibleGpuRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleGpuApi#linkFlexibleGpu");
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
| **linkFlexibleGpuRequest** | [**LinkFlexibleGpuRequest**](LinkFlexibleGpuRequest.md)|  | [optional] |

### Return type

[**LinkFlexibleGpuResponse**](LinkFlexibleGpuResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readFlexibleGpuCatalog"></a>
# **readFlexibleGpuCatalog**
> ReadFlexibleGpuCatalogResponse readFlexibleGpuCatalog(readFlexibleGpuCatalogRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.FlexibleGpuApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")

    FlexibleGpuApi apiInstance = new FlexibleGpuApi(defaultClient);
    ReadFlexibleGpuCatalogRequest readFlexibleGpuCatalogRequest = new ReadFlexibleGpuCatalogRequest(); // ReadFlexibleGpuCatalogRequest | 
    try {
      ReadFlexibleGpuCatalogResponse result = apiInstance.readFlexibleGpuCatalog(readFlexibleGpuCatalogRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleGpuApi#readFlexibleGpuCatalog");
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
| **readFlexibleGpuCatalogRequest** | [**ReadFlexibleGpuCatalogRequest**](ReadFlexibleGpuCatalogRequest.md)|  | [optional] |

### Return type

[**ReadFlexibleGpuCatalogResponse**](ReadFlexibleGpuCatalogResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readFlexibleGpus"></a>
# **readFlexibleGpus**
> ReadFlexibleGpusResponse readFlexibleGpus(readFlexibleGpusRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.FlexibleGpuApi;

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

    FlexibleGpuApi apiInstance = new FlexibleGpuApi(defaultClient);
    ReadFlexibleGpusRequest readFlexibleGpusRequest = new ReadFlexibleGpusRequest(); // ReadFlexibleGpusRequest | 
    try {
      ReadFlexibleGpusResponse result = apiInstance.readFlexibleGpus(readFlexibleGpusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleGpuApi#readFlexibleGpus");
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
| **readFlexibleGpusRequest** | [**ReadFlexibleGpusRequest**](ReadFlexibleGpusRequest.md)|  | [optional] |

### Return type

[**ReadFlexibleGpusResponse**](ReadFlexibleGpusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="unlinkFlexibleGpu"></a>
# **unlinkFlexibleGpu**
> UnlinkFlexibleGpuResponse unlinkFlexibleGpu(unlinkFlexibleGpuRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.FlexibleGpuApi;

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

    FlexibleGpuApi apiInstance = new FlexibleGpuApi(defaultClient);
    UnlinkFlexibleGpuRequest unlinkFlexibleGpuRequest = new UnlinkFlexibleGpuRequest(); // UnlinkFlexibleGpuRequest | 
    try {
      UnlinkFlexibleGpuResponse result = apiInstance.unlinkFlexibleGpu(unlinkFlexibleGpuRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleGpuApi#unlinkFlexibleGpu");
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
| **unlinkFlexibleGpuRequest** | [**UnlinkFlexibleGpuRequest**](UnlinkFlexibleGpuRequest.md)|  | [optional] |

### Return type

[**UnlinkFlexibleGpuResponse**](UnlinkFlexibleGpuResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="updateFlexibleGpu"></a>
# **updateFlexibleGpu**
> UpdateFlexibleGpuResponse updateFlexibleGpu(updateFlexibleGpuRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.FlexibleGpuApi;

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

    FlexibleGpuApi apiInstance = new FlexibleGpuApi(defaultClient);
    UpdateFlexibleGpuRequest updateFlexibleGpuRequest = new UpdateFlexibleGpuRequest(); // UpdateFlexibleGpuRequest | 
    try {
      UpdateFlexibleGpuResponse result = apiInstance.updateFlexibleGpu(updateFlexibleGpuRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleGpuApi#updateFlexibleGpu");
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
| **updateFlexibleGpuRequest** | [**UpdateFlexibleGpuRequest**](UpdateFlexibleGpuRequest.md)|  | [optional] |

### Return type

[**UpdateFlexibleGpuResponse**](UpdateFlexibleGpuResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


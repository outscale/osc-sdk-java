# LoadBalancerApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLoadBalancer**](LoadBalancerApi.md#createLoadBalancer) | **POST** /CreateLoadBalancer |  |
| [**createLoadBalancerTags**](LoadBalancerApi.md#createLoadBalancerTags) | **POST** /CreateLoadBalancerTags |  |
| [**deleteLoadBalancer**](LoadBalancerApi.md#deleteLoadBalancer) | **POST** /DeleteLoadBalancer |  |
| [**deleteLoadBalancerTags**](LoadBalancerApi.md#deleteLoadBalancerTags) | **POST** /DeleteLoadBalancerTags |  |
| [**deregisterVmsInLoadBalancer**](LoadBalancerApi.md#deregisterVmsInLoadBalancer) | **POST** /DeregisterVmsInLoadBalancer |  |
| [**linkLoadBalancerBackendMachines**](LoadBalancerApi.md#linkLoadBalancerBackendMachines) | **POST** /LinkLoadBalancerBackendMachines |  |
| [**readLoadBalancerTags**](LoadBalancerApi.md#readLoadBalancerTags) | **POST** /ReadLoadBalancerTags |  |
| [**readLoadBalancers**](LoadBalancerApi.md#readLoadBalancers) | **POST** /ReadLoadBalancers |  |
| [**readVmsHealth**](LoadBalancerApi.md#readVmsHealth) | **POST** /ReadVmsHealth |  |
| [**registerVmsInLoadBalancer**](LoadBalancerApi.md#registerVmsInLoadBalancer) | **POST** /RegisterVmsInLoadBalancer |  |
| [**unlinkLoadBalancerBackendMachines**](LoadBalancerApi.md#unlinkLoadBalancerBackendMachines) | **POST** /UnlinkLoadBalancerBackendMachines |  |
| [**updateLoadBalancer**](LoadBalancerApi.md#updateLoadBalancer) | **POST** /UpdateLoadBalancer |  |


<a name="createLoadBalancer"></a>
# **createLoadBalancer**
> CreateLoadBalancerResponse createLoadBalancer(createLoadBalancerRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    CreateLoadBalancerRequest createLoadBalancerRequest = new CreateLoadBalancerRequest(); // CreateLoadBalancerRequest | 
    try {
      CreateLoadBalancerResponse result = apiInstance.createLoadBalancer(createLoadBalancerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#createLoadBalancer");
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
| **createLoadBalancerRequest** | [**CreateLoadBalancerRequest**](CreateLoadBalancerRequest.md)|  | [optional] |

### Return type

[**CreateLoadBalancerResponse**](CreateLoadBalancerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="createLoadBalancerTags"></a>
# **createLoadBalancerTags**
> CreateLoadBalancerTagsResponse createLoadBalancerTags(createLoadBalancerTagsRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    CreateLoadBalancerTagsRequest createLoadBalancerTagsRequest = new CreateLoadBalancerTagsRequest(); // CreateLoadBalancerTagsRequest | 
    try {
      CreateLoadBalancerTagsResponse result = apiInstance.createLoadBalancerTags(createLoadBalancerTagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#createLoadBalancerTags");
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
| **createLoadBalancerTagsRequest** | [**CreateLoadBalancerTagsRequest**](CreateLoadBalancerTagsRequest.md)|  | [optional] |

### Return type

[**CreateLoadBalancerTagsResponse**](CreateLoadBalancerTagsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteLoadBalancer"></a>
# **deleteLoadBalancer**
> DeleteLoadBalancerResponse deleteLoadBalancer(deleteLoadBalancerRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    DeleteLoadBalancerRequest deleteLoadBalancerRequest = new DeleteLoadBalancerRequest(); // DeleteLoadBalancerRequest | 
    try {
      DeleteLoadBalancerResponse result = apiInstance.deleteLoadBalancer(deleteLoadBalancerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#deleteLoadBalancer");
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
| **deleteLoadBalancerRequest** | [**DeleteLoadBalancerRequest**](DeleteLoadBalancerRequest.md)|  | [optional] |

### Return type

[**DeleteLoadBalancerResponse**](DeleteLoadBalancerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteLoadBalancerTags"></a>
# **deleteLoadBalancerTags**
> DeleteLoadBalancerTagsResponse deleteLoadBalancerTags(deleteLoadBalancerTagsRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    DeleteLoadBalancerTagsRequest deleteLoadBalancerTagsRequest = new DeleteLoadBalancerTagsRequest(); // DeleteLoadBalancerTagsRequest | 
    try {
      DeleteLoadBalancerTagsResponse result = apiInstance.deleteLoadBalancerTags(deleteLoadBalancerTagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#deleteLoadBalancerTags");
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
| **deleteLoadBalancerTagsRequest** | [**DeleteLoadBalancerTagsRequest**](DeleteLoadBalancerTagsRequest.md)|  | [optional] |

### Return type

[**DeleteLoadBalancerTagsResponse**](DeleteLoadBalancerTagsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deregisterVmsInLoadBalancer"></a>
# **deregisterVmsInLoadBalancer**
> DeregisterVmsInLoadBalancerResponse deregisterVmsInLoadBalancer(deregisterVmsInLoadBalancerRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    DeregisterVmsInLoadBalancerRequest deregisterVmsInLoadBalancerRequest = new DeregisterVmsInLoadBalancerRequest(); // DeregisterVmsInLoadBalancerRequest | 
    try {
      DeregisterVmsInLoadBalancerResponse result = apiInstance.deregisterVmsInLoadBalancer(deregisterVmsInLoadBalancerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#deregisterVmsInLoadBalancer");
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
| **deregisterVmsInLoadBalancerRequest** | [**DeregisterVmsInLoadBalancerRequest**](DeregisterVmsInLoadBalancerRequest.md)|  | [optional] |

### Return type

[**DeregisterVmsInLoadBalancerResponse**](DeregisterVmsInLoadBalancerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="linkLoadBalancerBackendMachines"></a>
# **linkLoadBalancerBackendMachines**
> LinkLoadBalancerBackendMachinesResponse linkLoadBalancerBackendMachines(linkLoadBalancerBackendMachinesRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    LinkLoadBalancerBackendMachinesRequest linkLoadBalancerBackendMachinesRequest = new LinkLoadBalancerBackendMachinesRequest(); // LinkLoadBalancerBackendMachinesRequest | 
    try {
      LinkLoadBalancerBackendMachinesResponse result = apiInstance.linkLoadBalancerBackendMachines(linkLoadBalancerBackendMachinesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#linkLoadBalancerBackendMachines");
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
| **linkLoadBalancerBackendMachinesRequest** | [**LinkLoadBalancerBackendMachinesRequest**](LinkLoadBalancerBackendMachinesRequest.md)|  | [optional] |

### Return type

[**LinkLoadBalancerBackendMachinesResponse**](LinkLoadBalancerBackendMachinesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readLoadBalancerTags"></a>
# **readLoadBalancerTags**
> ReadLoadBalancerTagsResponse readLoadBalancerTags(readLoadBalancerTagsRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    ReadLoadBalancerTagsRequest readLoadBalancerTagsRequest = new ReadLoadBalancerTagsRequest(); // ReadLoadBalancerTagsRequest | 
    try {
      ReadLoadBalancerTagsResponse result = apiInstance.readLoadBalancerTags(readLoadBalancerTagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#readLoadBalancerTags");
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
| **readLoadBalancerTagsRequest** | [**ReadLoadBalancerTagsRequest**](ReadLoadBalancerTagsRequest.md)|  | [optional] |

### Return type

[**ReadLoadBalancerTagsResponse**](ReadLoadBalancerTagsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readLoadBalancers"></a>
# **readLoadBalancers**
> ReadLoadBalancersResponse readLoadBalancers(readLoadBalancersRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    ReadLoadBalancersRequest readLoadBalancersRequest = new ReadLoadBalancersRequest(); // ReadLoadBalancersRequest | 
    try {
      ReadLoadBalancersResponse result = apiInstance.readLoadBalancers(readLoadBalancersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#readLoadBalancers");
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
| **readLoadBalancersRequest** | [**ReadLoadBalancersRequest**](ReadLoadBalancersRequest.md)|  | [optional] |

### Return type

[**ReadLoadBalancersResponse**](ReadLoadBalancersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readVmsHealth"></a>
# **readVmsHealth**
> ReadVmsHealthResponse readVmsHealth(readVmsHealthRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    ReadVmsHealthRequest readVmsHealthRequest = new ReadVmsHealthRequest(); // ReadVmsHealthRequest | 
    try {
      ReadVmsHealthResponse result = apiInstance.readVmsHealth(readVmsHealthRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#readVmsHealth");
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
| **readVmsHealthRequest** | [**ReadVmsHealthRequest**](ReadVmsHealthRequest.md)|  | [optional] |

### Return type

[**ReadVmsHealthResponse**](ReadVmsHealthResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="registerVmsInLoadBalancer"></a>
# **registerVmsInLoadBalancer**
> RegisterVmsInLoadBalancerResponse registerVmsInLoadBalancer(registerVmsInLoadBalancerRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    RegisterVmsInLoadBalancerRequest registerVmsInLoadBalancerRequest = new RegisterVmsInLoadBalancerRequest(); // RegisterVmsInLoadBalancerRequest | 
    try {
      RegisterVmsInLoadBalancerResponse result = apiInstance.registerVmsInLoadBalancer(registerVmsInLoadBalancerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#registerVmsInLoadBalancer");
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
| **registerVmsInLoadBalancerRequest** | [**RegisterVmsInLoadBalancerRequest**](RegisterVmsInLoadBalancerRequest.md)|  | [optional] |

### Return type

[**RegisterVmsInLoadBalancerResponse**](RegisterVmsInLoadBalancerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="unlinkLoadBalancerBackendMachines"></a>
# **unlinkLoadBalancerBackendMachines**
> UnlinkLoadBalancerBackendMachinesResponse unlinkLoadBalancerBackendMachines(unlinkLoadBalancerBackendMachinesRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    UnlinkLoadBalancerBackendMachinesRequest unlinkLoadBalancerBackendMachinesRequest = new UnlinkLoadBalancerBackendMachinesRequest(); // UnlinkLoadBalancerBackendMachinesRequest | 
    try {
      UnlinkLoadBalancerBackendMachinesResponse result = apiInstance.unlinkLoadBalancerBackendMachines(unlinkLoadBalancerBackendMachinesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#unlinkLoadBalancerBackendMachines");
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
| **unlinkLoadBalancerBackendMachinesRequest** | [**UnlinkLoadBalancerBackendMachinesRequest**](UnlinkLoadBalancerBackendMachinesRequest.md)|  | [optional] |

### Return type

[**UnlinkLoadBalancerBackendMachinesResponse**](UnlinkLoadBalancerBackendMachinesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="updateLoadBalancer"></a>
# **updateLoadBalancer**
> UpdateLoadBalancerResponse updateLoadBalancer(updateLoadBalancerRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerApi;

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

    LoadBalancerApi apiInstance = new LoadBalancerApi(defaultClient);
    UpdateLoadBalancerRequest updateLoadBalancerRequest = new UpdateLoadBalancerRequest(); // UpdateLoadBalancerRequest | 
    try {
      UpdateLoadBalancerResponse result = apiInstance.updateLoadBalancer(updateLoadBalancerRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerApi#updateLoadBalancer");
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
| **updateLoadBalancerRequest** | [**UpdateLoadBalancerRequest**](UpdateLoadBalancerRequest.md)|  | [optional] |

### Return type

[**UpdateLoadBalancerResponse**](UpdateLoadBalancerResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


# AccessKeyApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAccessKey**](AccessKeyApi.md#createAccessKey) | **POST** /CreateAccessKey |  |
| [**deleteAccessKey**](AccessKeyApi.md#deleteAccessKey) | **POST** /DeleteAccessKey |  |
| [**readAccessKeys**](AccessKeyApi.md#readAccessKeys) | **POST** /ReadAccessKeys |  |
| [**readSecretAccessKey**](AccessKeyApi.md#readSecretAccessKey) | **POST** /ReadSecretAccessKey |  |
| [**updateAccessKey**](AccessKeyApi.md#updateAccessKey) | **POST** /UpdateAccessKey |  |


<a name="createAccessKey"></a>
# **createAccessKey**
> CreateAccessKeyResponse createAccessKey(createAccessKeyRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.AccessKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuthSec
    ApiKeyAuth ApiKeyAuthSec = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuthSec");
    ApiKeyAuthSec.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuthSec.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    AccessKeyApi apiInstance = new AccessKeyApi(defaultClient);
    CreateAccessKeyRequest createAccessKeyRequest = new CreateAccessKeyRequest(); // CreateAccessKeyRequest | 
    try {
      CreateAccessKeyResponse result = apiInstance.createAccessKey(createAccessKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyApi#createAccessKey");
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
| **createAccessKeyRequest** | [**CreateAccessKeyRequest**](CreateAccessKeyRequest.md)|  | [optional] |

### Return type

[**CreateAccessKeyResponse**](CreateAccessKeyResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteAccessKey"></a>
# **deleteAccessKey**
> DeleteAccessKeyResponse deleteAccessKey(deleteAccessKeyRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.AccessKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuthSec
    ApiKeyAuth ApiKeyAuthSec = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuthSec");
    ApiKeyAuthSec.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuthSec.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    AccessKeyApi apiInstance = new AccessKeyApi(defaultClient);
    DeleteAccessKeyRequest deleteAccessKeyRequest = new DeleteAccessKeyRequest(); // DeleteAccessKeyRequest | 
    try {
      DeleteAccessKeyResponse result = apiInstance.deleteAccessKey(deleteAccessKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyApi#deleteAccessKey");
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
| **deleteAccessKeyRequest** | [**DeleteAccessKeyRequest**](DeleteAccessKeyRequest.md)|  | [optional] |

### Return type

[**DeleteAccessKeyResponse**](DeleteAccessKeyResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readAccessKeys"></a>
# **readAccessKeys**
> ReadAccessKeysResponse readAccessKeys(readAccessKeysRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.AccessKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuthSec
    ApiKeyAuth ApiKeyAuthSec = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuthSec");
    ApiKeyAuthSec.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuthSec.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    AccessKeyApi apiInstance = new AccessKeyApi(defaultClient);
    ReadAccessKeysRequest readAccessKeysRequest = new ReadAccessKeysRequest(); // ReadAccessKeysRequest | 
    try {
      ReadAccessKeysResponse result = apiInstance.readAccessKeys(readAccessKeysRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyApi#readAccessKeys");
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
| **readAccessKeysRequest** | [**ReadAccessKeysRequest**](ReadAccessKeysRequest.md)|  | [optional] |

### Return type

[**ReadAccessKeysResponse**](ReadAccessKeysResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readSecretAccessKey"></a>
# **readSecretAccessKey**
> ReadSecretAccessKeyResponse readSecretAccessKey(readSecretAccessKeyRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.AccessKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuthSec
    ApiKeyAuth ApiKeyAuthSec = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuthSec");
    ApiKeyAuthSec.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuthSec.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    AccessKeyApi apiInstance = new AccessKeyApi(defaultClient);
    ReadSecretAccessKeyRequest readSecretAccessKeyRequest = new ReadSecretAccessKeyRequest(); // ReadSecretAccessKeyRequest | 
    try {
      ReadSecretAccessKeyResponse result = apiInstance.readSecretAccessKey(readSecretAccessKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyApi#readSecretAccessKey");
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
| **readSecretAccessKeyRequest** | [**ReadSecretAccessKeyRequest**](ReadSecretAccessKeyRequest.md)|  | [optional] |

### Return type

[**ReadSecretAccessKeyResponse**](ReadSecretAccessKeyResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="updateAccessKey"></a>
# **updateAccessKey**
> UpdateAccessKeyResponse updateAccessKey(updateAccessKeyRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.AccessKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuthSec
    ApiKeyAuth ApiKeyAuthSec = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuthSec");
    ApiKeyAuthSec.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuthSec.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    AccessKeyApi apiInstance = new AccessKeyApi(defaultClient);
    UpdateAccessKeyRequest updateAccessKeyRequest = new UpdateAccessKeyRequest(); // UpdateAccessKeyRequest | 
    try {
      UpdateAccessKeyResponse result = apiInstance.updateAccessKey(updateAccessKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessKeyApi#updateAccessKey");
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
| **updateAccessKeyRequest** | [**UpdateAccessKeyRequest**](UpdateAccessKeyRequest.md)|  | [optional] |

### Return type

[**UpdateAccessKeyResponse**](UpdateAccessKeyResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


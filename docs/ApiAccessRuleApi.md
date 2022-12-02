# ApiAccessRuleApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createApiAccessRule**](ApiAccessRuleApi.md#createApiAccessRule) | **POST** /CreateApiAccessRule |  |
| [**deleteApiAccessRule**](ApiAccessRuleApi.md#deleteApiAccessRule) | **POST** /DeleteApiAccessRule |  |
| [**readApiAccessRules**](ApiAccessRuleApi.md#readApiAccessRules) | **POST** /ReadApiAccessRules |  |
| [**updateApiAccessRule**](ApiAccessRuleApi.md#updateApiAccessRule) | **POST** /UpdateApiAccessRule |  |


<a name="createApiAccessRule"></a>
# **createApiAccessRule**
> CreateApiAccessRuleResponse createApiAccessRule(createApiAccessRuleRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.ApiAccessRuleApi;

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

    ApiAccessRuleApi apiInstance = new ApiAccessRuleApi(defaultClient);
    CreateApiAccessRuleRequest createApiAccessRuleRequest = new CreateApiAccessRuleRequest(); // CreateApiAccessRuleRequest | 
    try {
      CreateApiAccessRuleResponse result = apiInstance.createApiAccessRule(createApiAccessRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAccessRuleApi#createApiAccessRule");
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
| **createApiAccessRuleRequest** | [**CreateApiAccessRuleRequest**](CreateApiAccessRuleRequest.md)|  | [optional] |

### Return type

[**CreateApiAccessRuleResponse**](CreateApiAccessRuleResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteApiAccessRule"></a>
# **deleteApiAccessRule**
> DeleteApiAccessRuleResponse deleteApiAccessRule(deleteApiAccessRuleRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.ApiAccessRuleApi;

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

    ApiAccessRuleApi apiInstance = new ApiAccessRuleApi(defaultClient);
    DeleteApiAccessRuleRequest deleteApiAccessRuleRequest = new DeleteApiAccessRuleRequest(); // DeleteApiAccessRuleRequest | 
    try {
      DeleteApiAccessRuleResponse result = apiInstance.deleteApiAccessRule(deleteApiAccessRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAccessRuleApi#deleteApiAccessRule");
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
| **deleteApiAccessRuleRequest** | [**DeleteApiAccessRuleRequest**](DeleteApiAccessRuleRequest.md)|  | [optional] |

### Return type

[**DeleteApiAccessRuleResponse**](DeleteApiAccessRuleResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readApiAccessRules"></a>
# **readApiAccessRules**
> ReadApiAccessRulesResponse readApiAccessRules(readApiAccessRulesRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.ApiAccessRuleApi;

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

    ApiAccessRuleApi apiInstance = new ApiAccessRuleApi(defaultClient);
    ReadApiAccessRulesRequest readApiAccessRulesRequest = new ReadApiAccessRulesRequest(); // ReadApiAccessRulesRequest | 
    try {
      ReadApiAccessRulesResponse result = apiInstance.readApiAccessRules(readApiAccessRulesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAccessRuleApi#readApiAccessRules");
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
| **readApiAccessRulesRequest** | [**ReadApiAccessRulesRequest**](ReadApiAccessRulesRequest.md)|  | [optional] |

### Return type

[**ReadApiAccessRulesResponse**](ReadApiAccessRulesResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="updateApiAccessRule"></a>
# **updateApiAccessRule**
> UpdateApiAccessRuleResponse updateApiAccessRule(updateApiAccessRuleRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.ApiAccessRuleApi;

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

    ApiAccessRuleApi apiInstance = new ApiAccessRuleApi(defaultClient);
    UpdateApiAccessRuleRequest updateApiAccessRuleRequest = new UpdateApiAccessRuleRequest(); // UpdateApiAccessRuleRequest | 
    try {
      UpdateApiAccessRuleResponse result = apiInstance.updateApiAccessRule(updateApiAccessRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAccessRuleApi#updateApiAccessRule");
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
| **updateApiAccessRuleRequest** | [**UpdateApiAccessRuleRequest**](UpdateApiAccessRuleRequest.md)|  | [optional] |

### Return type

[**UpdateApiAccessRuleResponse**](UpdateApiAccessRuleResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


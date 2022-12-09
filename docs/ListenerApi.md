# ListenerApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createListenerRule**](ListenerApi.md#createListenerRule) | **POST** /CreateListenerRule |  |
| [**createLoadBalancerListeners**](ListenerApi.md#createLoadBalancerListeners) | **POST** /CreateLoadBalancerListeners |  |
| [**deleteListenerRule**](ListenerApi.md#deleteListenerRule) | **POST** /DeleteListenerRule |  |
| [**deleteLoadBalancerListeners**](ListenerApi.md#deleteLoadBalancerListeners) | **POST** /DeleteLoadBalancerListeners |  |
| [**readListenerRules**](ListenerApi.md#readListenerRules) | **POST** /ReadListenerRules |  |
| [**updateListenerRule**](ListenerApi.md#updateListenerRule) | **POST** /UpdateListenerRule |  |


<a name="createListenerRule"></a>
# **createListenerRule**
> CreateListenerRuleResponse createListenerRule(createListenerRuleRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.ListenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ListenerApi apiInstance = new ListenerApi(defaultClient);
    CreateListenerRuleRequest createListenerRuleRequest = new CreateListenerRuleRequest(); // CreateListenerRuleRequest | 
    try {
      CreateListenerRuleResponse result = apiInstance.createListenerRule(createListenerRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListenerApi#createListenerRule");
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
| **createListenerRuleRequest** | [**CreateListenerRuleRequest**](CreateListenerRuleRequest.md)|  | [optional] |

### Return type

[**CreateListenerRuleResponse**](CreateListenerRuleResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="createLoadBalancerListeners"></a>
# **createLoadBalancerListeners**
> CreateLoadBalancerListenersResponse createLoadBalancerListeners(createLoadBalancerListenersRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.ListenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ListenerApi apiInstance = new ListenerApi(defaultClient);
    CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest = new CreateLoadBalancerListenersRequest(); // CreateLoadBalancerListenersRequest | 
    try {
      CreateLoadBalancerListenersResponse result = apiInstance.createLoadBalancerListeners(createLoadBalancerListenersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListenerApi#createLoadBalancerListeners");
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
| **createLoadBalancerListenersRequest** | [**CreateLoadBalancerListenersRequest**](CreateLoadBalancerListenersRequest.md)|  | [optional] |

### Return type

[**CreateLoadBalancerListenersResponse**](CreateLoadBalancerListenersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteListenerRule"></a>
# **deleteListenerRule**
> DeleteListenerRuleResponse deleteListenerRule(deleteListenerRuleRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.ListenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ListenerApi apiInstance = new ListenerApi(defaultClient);
    DeleteListenerRuleRequest deleteListenerRuleRequest = new DeleteListenerRuleRequest(); // DeleteListenerRuleRequest | 
    try {
      DeleteListenerRuleResponse result = apiInstance.deleteListenerRule(deleteListenerRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListenerApi#deleteListenerRule");
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
| **deleteListenerRuleRequest** | [**DeleteListenerRuleRequest**](DeleteListenerRuleRequest.md)|  | [optional] |

### Return type

[**DeleteListenerRuleResponse**](DeleteListenerRuleResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteLoadBalancerListeners"></a>
# **deleteLoadBalancerListeners**
> DeleteLoadBalancerListenersResponse deleteLoadBalancerListeners(deleteLoadBalancerListenersRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.ListenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ListenerApi apiInstance = new ListenerApi(defaultClient);
    DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest = new DeleteLoadBalancerListenersRequest(); // DeleteLoadBalancerListenersRequest | 
    try {
      DeleteLoadBalancerListenersResponse result = apiInstance.deleteLoadBalancerListeners(deleteLoadBalancerListenersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListenerApi#deleteLoadBalancerListeners");
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
| **deleteLoadBalancerListenersRequest** | [**DeleteLoadBalancerListenersRequest**](DeleteLoadBalancerListenersRequest.md)|  | [optional] |

### Return type

[**DeleteLoadBalancerListenersResponse**](DeleteLoadBalancerListenersResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readListenerRules"></a>
# **readListenerRules**
> ReadListenerRulesResponse readListenerRules(readListenerRulesRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.ListenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ListenerApi apiInstance = new ListenerApi(defaultClient);
    ReadListenerRulesRequest readListenerRulesRequest = new ReadListenerRulesRequest(); // ReadListenerRulesRequest | 
    try {
      ReadListenerRulesResponse result = apiInstance.readListenerRules(readListenerRulesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListenerApi#readListenerRules");
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
| **readListenerRulesRequest** | [**ReadListenerRulesRequest**](ReadListenerRulesRequest.md)|  | [optional] |

### Return type

[**ReadListenerRulesResponse**](ReadListenerRulesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="updateListenerRule"></a>
# **updateListenerRule**
> UpdateListenerRuleResponse updateListenerRule(updateListenerRuleRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.ListenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ListenerApi apiInstance = new ListenerApi(defaultClient);
    UpdateListenerRuleRequest updateListenerRuleRequest = new UpdateListenerRuleRequest(); // UpdateListenerRuleRequest | 
    try {
      UpdateListenerRuleResponse result = apiInstance.updateListenerRule(updateListenerRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListenerApi#updateListenerRule");
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
| **updateListenerRuleRequest** | [**UpdateListenerRuleRequest**](UpdateListenerRuleRequest.md)|  | [optional] |

### Return type

[**UpdateListenerRuleResponse**](UpdateListenerRuleResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


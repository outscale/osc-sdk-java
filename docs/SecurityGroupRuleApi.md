# SecurityGroupRuleApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSecurityGroupRule**](SecurityGroupRuleApi.md#createSecurityGroupRule) | **POST** /CreateSecurityGroupRule |  |
| [**deleteSecurityGroupRule**](SecurityGroupRuleApi.md#deleteSecurityGroupRule) | **POST** /DeleteSecurityGroupRule |  |


<a name="createSecurityGroupRule"></a>
# **createSecurityGroupRule**
> CreateSecurityGroupRuleResponse createSecurityGroupRule(createSecurityGroupRuleRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.SecurityGroupRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SecurityGroupRuleApi apiInstance = new SecurityGroupRuleApi(defaultClient);
    CreateSecurityGroupRuleRequest createSecurityGroupRuleRequest = new CreateSecurityGroupRuleRequest(); // CreateSecurityGroupRuleRequest | 
    try {
      CreateSecurityGroupRuleResponse result = apiInstance.createSecurityGroupRule(createSecurityGroupRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityGroupRuleApi#createSecurityGroupRule");
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
| **createSecurityGroupRuleRequest** | [**CreateSecurityGroupRuleRequest**](CreateSecurityGroupRuleRequest.md)|  | [optional] |

### Return type

[**CreateSecurityGroupRuleResponse**](CreateSecurityGroupRuleResponse.md)

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

<a name="deleteSecurityGroupRule"></a>
# **deleteSecurityGroupRule**
> DeleteSecurityGroupRuleResponse deleteSecurityGroupRule(deleteSecurityGroupRuleRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.SecurityGroupRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SecurityGroupRuleApi apiInstance = new SecurityGroupRuleApi(defaultClient);
    DeleteSecurityGroupRuleRequest deleteSecurityGroupRuleRequest = new DeleteSecurityGroupRuleRequest(); // DeleteSecurityGroupRuleRequest | 
    try {
      DeleteSecurityGroupRuleResponse result = apiInstance.deleteSecurityGroupRule(deleteSecurityGroupRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityGroupRuleApi#deleteSecurityGroupRule");
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
| **deleteSecurityGroupRuleRequest** | [**DeleteSecurityGroupRuleRequest**](DeleteSecurityGroupRuleRequest.md)|  | [optional] |

### Return type

[**DeleteSecurityGroupRuleResponse**](DeleteSecurityGroupRuleResponse.md)

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


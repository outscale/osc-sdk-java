# LoadBalancerPolicyApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLoadBalancerPolicy**](LoadBalancerPolicyApi.md#createLoadBalancerPolicy) | **POST** /CreateLoadBalancerPolicy |  |
| [**deleteLoadBalancerPolicy**](LoadBalancerPolicyApi.md#deleteLoadBalancerPolicy) | **POST** /DeleteLoadBalancerPolicy |  |


<a name="createLoadBalancerPolicy"></a>
# **createLoadBalancerPolicy**
> CreateLoadBalancerPolicyResponse createLoadBalancerPolicy(createLoadBalancerPolicyRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerPolicyApi;

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

    LoadBalancerPolicyApi apiInstance = new LoadBalancerPolicyApi(defaultClient);
    CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest = new CreateLoadBalancerPolicyRequest(); // CreateLoadBalancerPolicyRequest | 
    try {
      CreateLoadBalancerPolicyResponse result = apiInstance.createLoadBalancerPolicy(createLoadBalancerPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPolicyApi#createLoadBalancerPolicy");
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
| **createLoadBalancerPolicyRequest** | [**CreateLoadBalancerPolicyRequest**](CreateLoadBalancerPolicyRequest.md)|  | [optional] |

### Return type

[**CreateLoadBalancerPolicyResponse**](CreateLoadBalancerPolicyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteLoadBalancerPolicy"></a>
# **deleteLoadBalancerPolicy**
> DeleteLoadBalancerPolicyResponse deleteLoadBalancerPolicy(deleteLoadBalancerPolicyRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.LoadBalancerPolicyApi;

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

    LoadBalancerPolicyApi apiInstance = new LoadBalancerPolicyApi(defaultClient);
    DeleteLoadBalancerPolicyRequest deleteLoadBalancerPolicyRequest = new DeleteLoadBalancerPolicyRequest(); // DeleteLoadBalancerPolicyRequest | 
    try {
      DeleteLoadBalancerPolicyResponse result = apiInstance.deleteLoadBalancerPolicy(deleteLoadBalancerPolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoadBalancerPolicyApi#deleteLoadBalancerPolicy");
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
| **deleteLoadBalancerPolicyRequest** | [**DeleteLoadBalancerPolicyRequest**](DeleteLoadBalancerPolicyRequest.md)|  | [optional] |

### Return type

[**DeleteLoadBalancerPolicyResponse**](DeleteLoadBalancerPolicyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


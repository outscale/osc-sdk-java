# CaApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCa**](CaApi.md#createCa) | **POST** /CreateCa |  |
| [**deleteCa**](CaApi.md#deleteCa) | **POST** /DeleteCa |  |
| [**readCas**](CaApi.md#readCas) | **POST** /ReadCas |  |
| [**updateCa**](CaApi.md#updateCa) | **POST** /UpdateCa |  |


<a name="createCa"></a>
# **createCa**
> CreateCaResponse createCa(createCaRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.CaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    // Configure API key authorization: ApiKeyAuthSec
    ApiKeyAuth ApiKeyAuthSec = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuthSec");
    ApiKeyAuthSec.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuthSec.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CaApi apiInstance = new CaApi(defaultClient);
    CreateCaRequest createCaRequest = new CreateCaRequest(); // CreateCaRequest | 
    try {
      CreateCaResponse result = apiInstance.createCa(createCaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaApi#createCa");
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
| **createCaRequest** | [**CreateCaRequest**](CreateCaRequest.md)|  | [optional] |

### Return type

[**CreateCaResponse**](CreateCaResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteCa"></a>
# **deleteCa**
> DeleteCaResponse deleteCa(deleteCaRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.CaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    // Configure API key authorization: ApiKeyAuthSec
    ApiKeyAuth ApiKeyAuthSec = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuthSec");
    ApiKeyAuthSec.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuthSec.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CaApi apiInstance = new CaApi(defaultClient);
    DeleteCaRequest deleteCaRequest = new DeleteCaRequest(); // DeleteCaRequest | 
    try {
      DeleteCaResponse result = apiInstance.deleteCa(deleteCaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaApi#deleteCa");
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
| **deleteCaRequest** | [**DeleteCaRequest**](DeleteCaRequest.md)|  | [optional] |

### Return type

[**DeleteCaResponse**](DeleteCaResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readCas"></a>
# **readCas**
> ReadCasResponse readCas(readCasRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.CaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    // Configure API key authorization: ApiKeyAuthSec
    ApiKeyAuth ApiKeyAuthSec = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuthSec");
    ApiKeyAuthSec.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuthSec.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CaApi apiInstance = new CaApi(defaultClient);
    ReadCasRequest readCasRequest = new ReadCasRequest(); // ReadCasRequest | 
    try {
      ReadCasResponse result = apiInstance.readCas(readCasRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaApi#readCas");
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
| **readCasRequest** | [**ReadCasRequest**](ReadCasRequest.md)|  | [optional] |

### Return type

[**ReadCasResponse**](ReadCasResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="updateCa"></a>
# **updateCa**
> UpdateCaResponse updateCa(updateCaRequest)



### Example
```java
// Import classes:
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.auth.*;
import io.github.outscale.osc_sdk_java.client.models.*;
import io.github.outscale.osc_sdk_java.client.api.CaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    // Configure AWS Signature V4 authorization
    defaultClient.setAWS4Configuration("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY", "REGION", "SERVICE")
    
    // Configure API key authorization: ApiKeyAuthSec
    ApiKeyAuth ApiKeyAuthSec = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuthSec");
    ApiKeyAuthSec.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuthSec.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    CaApi apiInstance = new CaApi(defaultClient);
    UpdateCaRequest updateCaRequest = new UpdateCaRequest(); // UpdateCaRequest | 
    try {
      UpdateCaResponse result = apiInstance.updateCa(updateCaRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaApi#updateCa");
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
| **updateCaRequest** | [**UpdateCaRequest**](UpdateCaRequest.md)|  | [optional] |

### Return type

[**UpdateCaResponse**](UpdateCaResponse.md)

### Authorization

[ApiKeyAuthSec](../README.md#ApiKeyAuthSec), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |


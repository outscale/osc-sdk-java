# SnapshotApi

All URIs are relative to *https://api.eu-west-2.outscale.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSnapshot**](SnapshotApi.md#createSnapshot) | **POST** /CreateSnapshot |  |
| [**createSnapshotExportTask**](SnapshotApi.md#createSnapshotExportTask) | **POST** /CreateSnapshotExportTask |  |
| [**deleteSnapshot**](SnapshotApi.md#deleteSnapshot) | **POST** /DeleteSnapshot |  |
| [**readSnapshotExportTasks**](SnapshotApi.md#readSnapshotExportTasks) | **POST** /ReadSnapshotExportTasks |  |
| [**readSnapshots**](SnapshotApi.md#readSnapshots) | **POST** /ReadSnapshots |  |
| [**updateSnapshot**](SnapshotApi.md#updateSnapshot) | **POST** /UpdateSnapshot |  |


<a name="createSnapshot"></a>
# **createSnapshot**
> CreateSnapshotResponse createSnapshot(createSnapshotRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.SnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotApi apiInstance = new SnapshotApi(defaultClient);
    CreateSnapshotRequest createSnapshotRequest = new CreateSnapshotRequest(); // CreateSnapshotRequest | 
    try {
      CreateSnapshotResponse result = apiInstance.createSnapshot(createSnapshotRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotApi#createSnapshot");
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
| **createSnapshotRequest** | [**CreateSnapshotRequest**](CreateSnapshotRequest.md)|  | [optional] |

### Return type

[**CreateSnapshotResponse**](CreateSnapshotResponse.md)

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

<a name="createSnapshotExportTask"></a>
# **createSnapshotExportTask**
> CreateSnapshotExportTaskResponse createSnapshotExportTask(createSnapshotExportTaskRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.SnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotApi apiInstance = new SnapshotApi(defaultClient);
    CreateSnapshotExportTaskRequest createSnapshotExportTaskRequest = new CreateSnapshotExportTaskRequest(); // CreateSnapshotExportTaskRequest | 
    try {
      CreateSnapshotExportTaskResponse result = apiInstance.createSnapshotExportTask(createSnapshotExportTaskRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotApi#createSnapshotExportTask");
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
| **createSnapshotExportTaskRequest** | [**CreateSnapshotExportTaskRequest**](CreateSnapshotExportTaskRequest.md)|  | [optional] |

### Return type

[**CreateSnapshotExportTaskResponse**](CreateSnapshotExportTaskResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="deleteSnapshot"></a>
# **deleteSnapshot**
> DeleteSnapshotResponse deleteSnapshot(deleteSnapshotRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.SnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotApi apiInstance = new SnapshotApi(defaultClient);
    DeleteSnapshotRequest deleteSnapshotRequest = new DeleteSnapshotRequest(); // DeleteSnapshotRequest | 
    try {
      DeleteSnapshotResponse result = apiInstance.deleteSnapshot(deleteSnapshotRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotApi#deleteSnapshot");
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
| **deleteSnapshotRequest** | [**DeleteSnapshotRequest**](DeleteSnapshotRequest.md)|  | [optional] |

### Return type

[**DeleteSnapshotResponse**](DeleteSnapshotResponse.md)

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

<a name="readSnapshotExportTasks"></a>
# **readSnapshotExportTasks**
> ReadSnapshotExportTasksResponse readSnapshotExportTasks(readSnapshotExportTasksRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.SnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotApi apiInstance = new SnapshotApi(defaultClient);
    ReadSnapshotExportTasksRequest readSnapshotExportTasksRequest = new ReadSnapshotExportTasksRequest(); // ReadSnapshotExportTasksRequest | 
    try {
      ReadSnapshotExportTasksResponse result = apiInstance.readSnapshotExportTasks(readSnapshotExportTasksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotApi#readSnapshotExportTasks");
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
| **readSnapshotExportTasksRequest** | [**ReadSnapshotExportTasksRequest**](ReadSnapshotExportTasksRequest.md)|  | [optional] |

### Return type

[**ReadSnapshotExportTasksResponse**](ReadSnapshotExportTasksResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The HTTP 200 response (OK). |  -  |

<a name="readSnapshots"></a>
# **readSnapshots**
> ReadSnapshotsResponse readSnapshots(readSnapshotsRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.SnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotApi apiInstance = new SnapshotApi(defaultClient);
    ReadSnapshotsRequest readSnapshotsRequest = new ReadSnapshotsRequest(); // ReadSnapshotsRequest | 
    try {
      ReadSnapshotsResponse result = apiInstance.readSnapshots(readSnapshotsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotApi#readSnapshots");
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
| **readSnapshotsRequest** | [**ReadSnapshotsRequest**](ReadSnapshotsRequest.md)|  | [optional] |

### Return type

[**ReadSnapshotsResponse**](ReadSnapshotsResponse.md)

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

<a name="updateSnapshot"></a>
# **updateSnapshot**
> UpdateSnapshotResponse updateSnapshot(updateSnapshotRequest)



### Example
```java
// Import classes:
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.auth.*;
import com.outscale.osc_sdk_java.client.models.*;
import com.outscale.osc_sdk_java.client.api.SnapshotApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.eu-west-2.outscale.com/api/v1");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    SnapshotApi apiInstance = new SnapshotApi(defaultClient);
    UpdateSnapshotRequest updateSnapshotRequest = new UpdateSnapshotRequest(); // UpdateSnapshotRequest | 
    try {
      UpdateSnapshotResponse result = apiInstance.updateSnapshot(updateSnapshotRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnapshotApi#updateSnapshot");
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
| **updateSnapshotRequest** | [**UpdateSnapshotRequest**](UpdateSnapshotRequest.md)|  | [optional] |

### Return type

[**UpdateSnapshotResponse**](UpdateSnapshotResponse.md)

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


/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.26
 * Contact: support@outscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.outscale.osc_sdk_java.client.api;

import com.google.gson.reflect.TypeToken;
import io.github.outscale.osc_sdk_java.client.ApiCallback;
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.ApiResponse;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.Pair;
import io.github.outscale.osc_sdk_java.client.model.CreateNetAccessPointRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateNetAccessPointResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteNetAccessPointRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteNetAccessPointResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadNetAccessPointServicesRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadNetAccessPointServicesResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadNetAccessPointsRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadNetAccessPointsResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateNetAccessPointRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateNetAccessPointResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetAccessPointApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NetAccessPointApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NetAccessPointApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createNetAccessPoint
     *
     * @param createNetAccessPointRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createNetAccessPointCall(
            CreateNetAccessPointRequest createNetAccessPointRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createNetAccessPointRequest;

        // create path and map variables
        String localVarPath = "/CreateNetAccessPoint";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"AWS4Auth", "ApiKeyAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNetAccessPointValidateBeforeCall(
            CreateNetAccessPointRequest createNetAccessPointRequest, final ApiCallback _callback)
            throws ApiException {
        return createNetAccessPointCall(createNetAccessPointRequest, _callback);
    }

    /**
     * @param createNetAccessPointRequest (optional)
     * @return CreateNetAccessPointResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public CreateNetAccessPointResponse createNetAccessPoint(
            CreateNetAccessPointRequest createNetAccessPointRequest) throws ApiException {
        ApiResponse<CreateNetAccessPointResponse> localVarResp =
                createNetAccessPointWithHttpInfo(createNetAccessPointRequest);
        return localVarResp.getData();
    }

    /**
     * @param createNetAccessPointRequest (optional)
     * @return ApiResponse&lt;CreateNetAccessPointResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CreateNetAccessPointResponse> createNetAccessPointWithHttpInfo(
            CreateNetAccessPointRequest createNetAccessPointRequest) throws ApiException {
        okhttp3.Call localVarCall =
                createNetAccessPointValidateBeforeCall(createNetAccessPointRequest, null);
        Type localVarReturnType = new TypeToken<CreateNetAccessPointResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param createNetAccessPointRequest (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createNetAccessPointAsync(
            CreateNetAccessPointRequest createNetAccessPointRequest,
            final ApiCallback<CreateNetAccessPointResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createNetAccessPointValidateBeforeCall(createNetAccessPointRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateNetAccessPointResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteNetAccessPoint
     *
     * @param deleteNetAccessPointRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteNetAccessPointCall(
            DeleteNetAccessPointRequest deleteNetAccessPointRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deleteNetAccessPointRequest;

        // create path and map variables
        String localVarPath = "/DeleteNetAccessPoint";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"AWS4Auth", "ApiKeyAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteNetAccessPointValidateBeforeCall(
            DeleteNetAccessPointRequest deleteNetAccessPointRequest, final ApiCallback _callback)
            throws ApiException {
        return deleteNetAccessPointCall(deleteNetAccessPointRequest, _callback);
    }

    /**
     * @param deleteNetAccessPointRequest (optional)
     * @return DeleteNetAccessPointResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public DeleteNetAccessPointResponse deleteNetAccessPoint(
            DeleteNetAccessPointRequest deleteNetAccessPointRequest) throws ApiException {
        ApiResponse<DeleteNetAccessPointResponse> localVarResp =
                deleteNetAccessPointWithHttpInfo(deleteNetAccessPointRequest);
        return localVarResp.getData();
    }

    /**
     * @param deleteNetAccessPointRequest (optional)
     * @return ApiResponse&lt;DeleteNetAccessPointResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<DeleteNetAccessPointResponse> deleteNetAccessPointWithHttpInfo(
            DeleteNetAccessPointRequest deleteNetAccessPointRequest) throws ApiException {
        okhttp3.Call localVarCall =
                deleteNetAccessPointValidateBeforeCall(deleteNetAccessPointRequest, null);
        Type localVarReturnType = new TypeToken<DeleteNetAccessPointResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param deleteNetAccessPointRequest (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteNetAccessPointAsync(
            DeleteNetAccessPointRequest deleteNetAccessPointRequest,
            final ApiCallback<DeleteNetAccessPointResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteNetAccessPointValidateBeforeCall(deleteNetAccessPointRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteNetAccessPointResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readNetAccessPointServices
     *
     * @param readNetAccessPointServicesRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call readNetAccessPointServicesCall(
            ReadNetAccessPointServicesRequest readNetAccessPointServicesRequest,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = readNetAccessPointServicesRequest;

        // create path and map variables
        String localVarPath = "/ReadNetAccessPointServices";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"AWS4Auth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call readNetAccessPointServicesValidateBeforeCall(
            ReadNetAccessPointServicesRequest readNetAccessPointServicesRequest,
            final ApiCallback _callback)
            throws ApiException {
        return readNetAccessPointServicesCall(readNetAccessPointServicesRequest, _callback);
    }

    /**
     * @param readNetAccessPointServicesRequest (optional)
     * @return ReadNetAccessPointServicesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ReadNetAccessPointServicesResponse readNetAccessPointServices(
            ReadNetAccessPointServicesRequest readNetAccessPointServicesRequest)
            throws ApiException {
        ApiResponse<ReadNetAccessPointServicesResponse> localVarResp =
                readNetAccessPointServicesWithHttpInfo(readNetAccessPointServicesRequest);
        return localVarResp.getData();
    }

    /**
     * @param readNetAccessPointServicesRequest (optional)
     * @return ApiResponse&lt;ReadNetAccessPointServicesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ReadNetAccessPointServicesResponse> readNetAccessPointServicesWithHttpInfo(
            ReadNetAccessPointServicesRequest readNetAccessPointServicesRequest)
            throws ApiException {
        okhttp3.Call localVarCall =
                readNetAccessPointServicesValidateBeforeCall(
                        readNetAccessPointServicesRequest, null);
        Type localVarReturnType = new TypeToken<ReadNetAccessPointServicesResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param readNetAccessPointServicesRequest (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call readNetAccessPointServicesAsync(
            ReadNetAccessPointServicesRequest readNetAccessPointServicesRequest,
            final ApiCallback<ReadNetAccessPointServicesResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                readNetAccessPointServicesValidateBeforeCall(
                        readNetAccessPointServicesRequest, _callback);
        Type localVarReturnType = new TypeToken<ReadNetAccessPointServicesResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readNetAccessPoints
     *
     * @param readNetAccessPointsRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call readNetAccessPointsCall(
            ReadNetAccessPointsRequest readNetAccessPointsRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = readNetAccessPointsRequest;

        // create path and map variables
        String localVarPath = "/ReadNetAccessPoints";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"AWS4Auth", "ApiKeyAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call readNetAccessPointsValidateBeforeCall(
            ReadNetAccessPointsRequest readNetAccessPointsRequest, final ApiCallback _callback)
            throws ApiException {
        return readNetAccessPointsCall(readNetAccessPointsRequest, _callback);
    }

    /**
     * @param readNetAccessPointsRequest (optional)
     * @return ReadNetAccessPointsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ReadNetAccessPointsResponse readNetAccessPoints(
            ReadNetAccessPointsRequest readNetAccessPointsRequest) throws ApiException {
        ApiResponse<ReadNetAccessPointsResponse> localVarResp =
                readNetAccessPointsWithHttpInfo(readNetAccessPointsRequest);
        return localVarResp.getData();
    }

    /**
     * @param readNetAccessPointsRequest (optional)
     * @return ApiResponse&lt;ReadNetAccessPointsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ReadNetAccessPointsResponse> readNetAccessPointsWithHttpInfo(
            ReadNetAccessPointsRequest readNetAccessPointsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                readNetAccessPointsValidateBeforeCall(readNetAccessPointsRequest, null);
        Type localVarReturnType = new TypeToken<ReadNetAccessPointsResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param readNetAccessPointsRequest (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call readNetAccessPointsAsync(
            ReadNetAccessPointsRequest readNetAccessPointsRequest,
            final ApiCallback<ReadNetAccessPointsResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                readNetAccessPointsValidateBeforeCall(readNetAccessPointsRequest, _callback);
        Type localVarReturnType = new TypeToken<ReadNetAccessPointsResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateNetAccessPoint
     *
     * @param updateNetAccessPointRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateNetAccessPointCall(
            UpdateNetAccessPointRequest updateNetAccessPointRequest, final ApiCallback _callback)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = updateNetAccessPointRequest;

        // create path and map variables
        String localVarPath = "/UpdateNetAccessPoint";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"AWS4Auth", "ApiKeyAuth"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateNetAccessPointValidateBeforeCall(
            UpdateNetAccessPointRequest updateNetAccessPointRequest, final ApiCallback _callback)
            throws ApiException {
        return updateNetAccessPointCall(updateNetAccessPointRequest, _callback);
    }

    /**
     * @param updateNetAccessPointRequest (optional)
     * @return UpdateNetAccessPointResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public UpdateNetAccessPointResponse updateNetAccessPoint(
            UpdateNetAccessPointRequest updateNetAccessPointRequest) throws ApiException {
        ApiResponse<UpdateNetAccessPointResponse> localVarResp =
                updateNetAccessPointWithHttpInfo(updateNetAccessPointRequest);
        return localVarResp.getData();
    }

    /**
     * @param updateNetAccessPointRequest (optional)
     * @return ApiResponse&lt;UpdateNetAccessPointResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<UpdateNetAccessPointResponse> updateNetAccessPointWithHttpInfo(
            UpdateNetAccessPointRequest updateNetAccessPointRequest) throws ApiException {
        okhttp3.Call localVarCall =
                updateNetAccessPointValidateBeforeCall(updateNetAccessPointRequest, null);
        Type localVarReturnType = new TypeToken<UpdateNetAccessPointResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param updateNetAccessPointRequest (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateNetAccessPointAsync(
            UpdateNetAccessPointRequest updateNetAccessPointRequest,
            final ApiCallback<UpdateNetAccessPointResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateNetAccessPointValidateBeforeCall(updateNetAccessPointRequest, _callback);
        Type localVarReturnType = new TypeToken<UpdateNetAccessPointResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

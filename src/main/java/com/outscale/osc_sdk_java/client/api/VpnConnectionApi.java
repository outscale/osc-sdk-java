/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.23
 * Contact: support@outscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.outscale.osc_sdk_java.client.api;

import com.outscale.osc_sdk_java.client.ApiCallback;
import com.outscale.osc_sdk_java.client.ApiClient;
import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.ApiResponse;
import com.outscale.osc_sdk_java.client.Configuration;
import com.outscale.osc_sdk_java.client.Pair;
import com.outscale.osc_sdk_java.client.ProgressRequestBody;
import com.outscale.osc_sdk_java.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.outscale.osc_sdk_java.client.model.CreateVpnConnectionRequest;
import com.outscale.osc_sdk_java.client.model.CreateVpnConnectionResponse;
import com.outscale.osc_sdk_java.client.model.CreateVpnConnectionRouteRequest;
import com.outscale.osc_sdk_java.client.model.CreateVpnConnectionRouteResponse;
import com.outscale.osc_sdk_java.client.model.DeleteVpnConnectionRequest;
import com.outscale.osc_sdk_java.client.model.DeleteVpnConnectionResponse;
import com.outscale.osc_sdk_java.client.model.DeleteVpnConnectionRouteRequest;
import com.outscale.osc_sdk_java.client.model.DeleteVpnConnectionRouteResponse;
import com.outscale.osc_sdk_java.client.model.ErrorResponse;
import com.outscale.osc_sdk_java.client.model.ReadVpnConnectionsRequest;
import com.outscale.osc_sdk_java.client.model.ReadVpnConnectionsResponse;
import com.outscale.osc_sdk_java.client.model.UpdateVpnConnectionRequest;
import com.outscale.osc_sdk_java.client.model.UpdateVpnConnectionResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class VpnConnectionApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VpnConnectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VpnConnectionApi(ApiClient apiClient) {
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
     * Build call for createVpnConnection
     * @param createVpnConnectionRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVpnConnectionCall(CreateVpnConnectionRequest createVpnConnectionRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createVpnConnectionRequest;

        // create path and map variables
        String localVarPath = "/CreateVpnConnection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AWS4Auth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createVpnConnectionValidateBeforeCall(CreateVpnConnectionRequest createVpnConnectionRequest, final ApiCallback _callback) throws ApiException {
        return createVpnConnectionCall(createVpnConnectionRequest, _callback);

    }

    /**
     * 
     * 
     * @param createVpnConnectionRequest  (optional)
     * @return CreateVpnConnectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public CreateVpnConnectionResponse createVpnConnection(CreateVpnConnectionRequest createVpnConnectionRequest) throws ApiException {
        ApiResponse<CreateVpnConnectionResponse> localVarResp = createVpnConnectionWithHttpInfo(createVpnConnectionRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param createVpnConnectionRequest  (optional)
     * @return ApiResponse&lt;CreateVpnConnectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateVpnConnectionResponse> createVpnConnectionWithHttpInfo(CreateVpnConnectionRequest createVpnConnectionRequest) throws ApiException {
        okhttp3.Call localVarCall = createVpnConnectionValidateBeforeCall(createVpnConnectionRequest, null);
        Type localVarReturnType = new TypeToken<CreateVpnConnectionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param createVpnConnectionRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVpnConnectionAsync(CreateVpnConnectionRequest createVpnConnectionRequest, final ApiCallback<CreateVpnConnectionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createVpnConnectionValidateBeforeCall(createVpnConnectionRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateVpnConnectionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createVpnConnectionRoute
     * @param createVpnConnectionRouteRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVpnConnectionRouteCall(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createVpnConnectionRouteRequest;

        // create path and map variables
        String localVarPath = "/CreateVpnConnectionRoute";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AWS4Auth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createVpnConnectionRouteValidateBeforeCall(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest, final ApiCallback _callback) throws ApiException {
        return createVpnConnectionRouteCall(createVpnConnectionRouteRequest, _callback);

    }

    /**
     * 
     * 
     * @param createVpnConnectionRouteRequest  (optional)
     * @return CreateVpnConnectionRouteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public CreateVpnConnectionRouteResponse createVpnConnectionRoute(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest) throws ApiException {
        ApiResponse<CreateVpnConnectionRouteResponse> localVarResp = createVpnConnectionRouteWithHttpInfo(createVpnConnectionRouteRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param createVpnConnectionRouteRequest  (optional)
     * @return ApiResponse&lt;CreateVpnConnectionRouteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateVpnConnectionRouteResponse> createVpnConnectionRouteWithHttpInfo(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest) throws ApiException {
        okhttp3.Call localVarCall = createVpnConnectionRouteValidateBeforeCall(createVpnConnectionRouteRequest, null);
        Type localVarReturnType = new TypeToken<CreateVpnConnectionRouteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param createVpnConnectionRouteRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createVpnConnectionRouteAsync(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest, final ApiCallback<CreateVpnConnectionRouteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createVpnConnectionRouteValidateBeforeCall(createVpnConnectionRouteRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateVpnConnectionRouteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVpnConnection
     * @param deleteVpnConnectionRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVpnConnectionCall(DeleteVpnConnectionRequest deleteVpnConnectionRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deleteVpnConnectionRequest;

        // create path and map variables
        String localVarPath = "/DeleteVpnConnection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AWS4Auth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteVpnConnectionValidateBeforeCall(DeleteVpnConnectionRequest deleteVpnConnectionRequest, final ApiCallback _callback) throws ApiException {
        return deleteVpnConnectionCall(deleteVpnConnectionRequest, _callback);

    }

    /**
     * 
     * 
     * @param deleteVpnConnectionRequest  (optional)
     * @return DeleteVpnConnectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public DeleteVpnConnectionResponse deleteVpnConnection(DeleteVpnConnectionRequest deleteVpnConnectionRequest) throws ApiException {
        ApiResponse<DeleteVpnConnectionResponse> localVarResp = deleteVpnConnectionWithHttpInfo(deleteVpnConnectionRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param deleteVpnConnectionRequest  (optional)
     * @return ApiResponse&lt;DeleteVpnConnectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeleteVpnConnectionResponse> deleteVpnConnectionWithHttpInfo(DeleteVpnConnectionRequest deleteVpnConnectionRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteVpnConnectionValidateBeforeCall(deleteVpnConnectionRequest, null);
        Type localVarReturnType = new TypeToken<DeleteVpnConnectionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param deleteVpnConnectionRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVpnConnectionAsync(DeleteVpnConnectionRequest deleteVpnConnectionRequest, final ApiCallback<DeleteVpnConnectionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteVpnConnectionValidateBeforeCall(deleteVpnConnectionRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteVpnConnectionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVpnConnectionRoute
     * @param deleteVpnConnectionRouteRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVpnConnectionRouteCall(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deleteVpnConnectionRouteRequest;

        // create path and map variables
        String localVarPath = "/DeleteVpnConnectionRoute";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AWS4Auth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteVpnConnectionRouteValidateBeforeCall(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest, final ApiCallback _callback) throws ApiException {
        return deleteVpnConnectionRouteCall(deleteVpnConnectionRouteRequest, _callback);

    }

    /**
     * 
     * 
     * @param deleteVpnConnectionRouteRequest  (optional)
     * @return DeleteVpnConnectionRouteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public DeleteVpnConnectionRouteResponse deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest) throws ApiException {
        ApiResponse<DeleteVpnConnectionRouteResponse> localVarResp = deleteVpnConnectionRouteWithHttpInfo(deleteVpnConnectionRouteRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param deleteVpnConnectionRouteRequest  (optional)
     * @return ApiResponse&lt;DeleteVpnConnectionRouteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeleteVpnConnectionRouteResponse> deleteVpnConnectionRouteWithHttpInfo(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteVpnConnectionRouteValidateBeforeCall(deleteVpnConnectionRouteRequest, null);
        Type localVarReturnType = new TypeToken<DeleteVpnConnectionRouteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param deleteVpnConnectionRouteRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteVpnConnectionRouteAsync(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest, final ApiCallback<DeleteVpnConnectionRouteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteVpnConnectionRouteValidateBeforeCall(deleteVpnConnectionRouteRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteVpnConnectionRouteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readVpnConnections
     * @param readVpnConnectionsRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call readVpnConnectionsCall(ReadVpnConnectionsRequest readVpnConnectionsRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = readVpnConnectionsRequest;

        // create path and map variables
        String localVarPath = "/ReadVpnConnections";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AWS4Auth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call readVpnConnectionsValidateBeforeCall(ReadVpnConnectionsRequest readVpnConnectionsRequest, final ApiCallback _callback) throws ApiException {
        return readVpnConnectionsCall(readVpnConnectionsRequest, _callback);

    }

    /**
     * 
     * 
     * @param readVpnConnectionsRequest  (optional)
     * @return ReadVpnConnectionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public ReadVpnConnectionsResponse readVpnConnections(ReadVpnConnectionsRequest readVpnConnectionsRequest) throws ApiException {
        ApiResponse<ReadVpnConnectionsResponse> localVarResp = readVpnConnectionsWithHttpInfo(readVpnConnectionsRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param readVpnConnectionsRequest  (optional)
     * @return ApiResponse&lt;ReadVpnConnectionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReadVpnConnectionsResponse> readVpnConnectionsWithHttpInfo(ReadVpnConnectionsRequest readVpnConnectionsRequest) throws ApiException {
        okhttp3.Call localVarCall = readVpnConnectionsValidateBeforeCall(readVpnConnectionsRequest, null);
        Type localVarReturnType = new TypeToken<ReadVpnConnectionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param readVpnConnectionsRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call readVpnConnectionsAsync(ReadVpnConnectionsRequest readVpnConnectionsRequest, final ApiCallback<ReadVpnConnectionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = readVpnConnectionsValidateBeforeCall(readVpnConnectionsRequest, _callback);
        Type localVarReturnType = new TypeToken<ReadVpnConnectionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVpnConnection
     * @param updateVpnConnectionRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVpnConnectionCall(UpdateVpnConnectionRequest updateVpnConnectionRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = updateVpnConnectionRequest;

        // create path and map variables
        String localVarPath = "/UpdateVpnConnection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AWS4Auth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateVpnConnectionValidateBeforeCall(UpdateVpnConnectionRequest updateVpnConnectionRequest, final ApiCallback _callback) throws ApiException {
        return updateVpnConnectionCall(updateVpnConnectionRequest, _callback);

    }

    /**
     * 
     * 
     * @param updateVpnConnectionRequest  (optional)
     * @return UpdateVpnConnectionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     </table>
     */
    public UpdateVpnConnectionResponse updateVpnConnection(UpdateVpnConnectionRequest updateVpnConnectionRequest) throws ApiException {
        ApiResponse<UpdateVpnConnectionResponse> localVarResp = updateVpnConnectionWithHttpInfo(updateVpnConnectionRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param updateVpnConnectionRequest  (optional)
     * @return ApiResponse&lt;UpdateVpnConnectionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UpdateVpnConnectionResponse> updateVpnConnectionWithHttpInfo(UpdateVpnConnectionRequest updateVpnConnectionRequest) throws ApiException {
        okhttp3.Call localVarCall = updateVpnConnectionValidateBeforeCall(updateVpnConnectionRequest, null);
        Type localVarReturnType = new TypeToken<UpdateVpnConnectionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param updateVpnConnectionRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateVpnConnectionAsync(UpdateVpnConnectionRequest updateVpnConnectionRequest, final ApiCallback<UpdateVpnConnectionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateVpnConnectionValidateBeforeCall(updateVpnConnectionRequest, _callback);
        Type localVarReturnType = new TypeToken<UpdateVpnConnectionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

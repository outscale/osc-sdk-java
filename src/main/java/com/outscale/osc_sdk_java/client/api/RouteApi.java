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


import com.outscale.osc_sdk_java.client.model.CreateRouteRequest;
import com.outscale.osc_sdk_java.client.model.CreateRouteResponse;
import com.outscale.osc_sdk_java.client.model.DeleteRouteRequest;
import com.outscale.osc_sdk_java.client.model.DeleteRouteResponse;
import com.outscale.osc_sdk_java.client.model.ErrorResponse;
import com.outscale.osc_sdk_java.client.model.UpdateRouteRequest;
import com.outscale.osc_sdk_java.client.model.UpdateRouteResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class RouteApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public RouteApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RouteApi(ApiClient apiClient) {
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
     * Build call for createRoute
     * @param createRouteRequest  (optional)
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
    public okhttp3.Call createRouteCall(CreateRouteRequest createRouteRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createRouteRequest;

        // create path and map variables
        String localVarPath = "/CreateRoute";

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
    private okhttp3.Call createRouteValidateBeforeCall(CreateRouteRequest createRouteRequest, final ApiCallback _callback) throws ApiException {
        return createRouteCall(createRouteRequest, _callback);

    }

    /**
     * 
     * 
     * @param createRouteRequest  (optional)
     * @return CreateRouteResponse
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
    public CreateRouteResponse createRoute(CreateRouteRequest createRouteRequest) throws ApiException {
        ApiResponse<CreateRouteResponse> localVarResp = createRouteWithHttpInfo(createRouteRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param createRouteRequest  (optional)
     * @return ApiResponse&lt;CreateRouteResponse&gt;
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
    public ApiResponse<CreateRouteResponse> createRouteWithHttpInfo(CreateRouteRequest createRouteRequest) throws ApiException {
        okhttp3.Call localVarCall = createRouteValidateBeforeCall(createRouteRequest, null);
        Type localVarReturnType = new TypeToken<CreateRouteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param createRouteRequest  (optional)
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
    public okhttp3.Call createRouteAsync(CreateRouteRequest createRouteRequest, final ApiCallback<CreateRouteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createRouteValidateBeforeCall(createRouteRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateRouteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteRoute
     * @param deleteRouteRequest  (optional)
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
    public okhttp3.Call deleteRouteCall(DeleteRouteRequest deleteRouteRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = deleteRouteRequest;

        // create path and map variables
        String localVarPath = "/DeleteRoute";

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
    private okhttp3.Call deleteRouteValidateBeforeCall(DeleteRouteRequest deleteRouteRequest, final ApiCallback _callback) throws ApiException {
        return deleteRouteCall(deleteRouteRequest, _callback);

    }

    /**
     * 
     * 
     * @param deleteRouteRequest  (optional)
     * @return DeleteRouteResponse
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
    public DeleteRouteResponse deleteRoute(DeleteRouteRequest deleteRouteRequest) throws ApiException {
        ApiResponse<DeleteRouteResponse> localVarResp = deleteRouteWithHttpInfo(deleteRouteRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param deleteRouteRequest  (optional)
     * @return ApiResponse&lt;DeleteRouteResponse&gt;
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
    public ApiResponse<DeleteRouteResponse> deleteRouteWithHttpInfo(DeleteRouteRequest deleteRouteRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteRouteValidateBeforeCall(deleteRouteRequest, null);
        Type localVarReturnType = new TypeToken<DeleteRouteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param deleteRouteRequest  (optional)
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
    public okhttp3.Call deleteRouteAsync(DeleteRouteRequest deleteRouteRequest, final ApiCallback<DeleteRouteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteRouteValidateBeforeCall(deleteRouteRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteRouteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateRoute
     * @param updateRouteRequest  (optional)
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
    public okhttp3.Call updateRouteCall(UpdateRouteRequest updateRouteRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateRouteRequest;

        // create path and map variables
        String localVarPath = "/UpdateRoute";

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
    private okhttp3.Call updateRouteValidateBeforeCall(UpdateRouteRequest updateRouteRequest, final ApiCallback _callback) throws ApiException {
        return updateRouteCall(updateRouteRequest, _callback);

    }

    /**
     * 
     * 
     * @param updateRouteRequest  (optional)
     * @return UpdateRouteResponse
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
    public UpdateRouteResponse updateRoute(UpdateRouteRequest updateRouteRequest) throws ApiException {
        ApiResponse<UpdateRouteResponse> localVarResp = updateRouteWithHttpInfo(updateRouteRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param updateRouteRequest  (optional)
     * @return ApiResponse&lt;UpdateRouteResponse&gt;
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
    public ApiResponse<UpdateRouteResponse> updateRouteWithHttpInfo(UpdateRouteRequest updateRouteRequest) throws ApiException {
        okhttp3.Call localVarCall = updateRouteValidateBeforeCall(updateRouteRequest, null);
        Type localVarReturnType = new TypeToken<UpdateRouteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param updateRouteRequest  (optional)
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
    public okhttp3.Call updateRouteAsync(UpdateRouteRequest updateRouteRequest, final ApiCallback<UpdateRouteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateRouteValidateBeforeCall(updateRouteRequest, _callback);
        Type localVarReturnType = new TypeToken<UpdateRouteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

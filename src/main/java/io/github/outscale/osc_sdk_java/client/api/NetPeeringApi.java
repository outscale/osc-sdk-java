/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.27
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
import io.github.outscale.osc_sdk_java.client.model.AcceptNetPeeringRequest;
import io.github.outscale.osc_sdk_java.client.model.AcceptNetPeeringResponse;
import io.github.outscale.osc_sdk_java.client.model.CreateNetPeeringRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateNetPeeringResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteNetPeeringRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteNetPeeringResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadNetPeeringsRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadNetPeeringsResponse;
import io.github.outscale.osc_sdk_java.client.model.RejectNetPeeringRequest;
import io.github.outscale.osc_sdk_java.client.model.RejectNetPeeringResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetPeeringApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NetPeeringApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NetPeeringApi(ApiClient apiClient) {
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
     * Build call for acceptNetPeering
     *
     * @param acceptNetPeeringRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call acceptNetPeeringCall(
            AcceptNetPeeringRequest acceptNetPeeringRequest, final ApiCallback _callback)
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

        Object localVarPostBody = acceptNetPeeringRequest;

        // create path and map variables
        String localVarPath = "/AcceptNetPeering";

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
    private okhttp3.Call acceptNetPeeringValidateBeforeCall(
            AcceptNetPeeringRequest acceptNetPeeringRequest, final ApiCallback _callback)
            throws ApiException {
        return acceptNetPeeringCall(acceptNetPeeringRequest, _callback);
    }

    /**
     * @param acceptNetPeeringRequest (optional)
     * @return AcceptNetPeeringResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public AcceptNetPeeringResponse acceptNetPeering(
            AcceptNetPeeringRequest acceptNetPeeringRequest) throws ApiException {
        ApiResponse<AcceptNetPeeringResponse> localVarResp =
                acceptNetPeeringWithHttpInfo(acceptNetPeeringRequest);
        return localVarResp.getData();
    }

    /**
     * @param acceptNetPeeringRequest (optional)
     * @return ApiResponse&lt;AcceptNetPeeringResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<AcceptNetPeeringResponse> acceptNetPeeringWithHttpInfo(
            AcceptNetPeeringRequest acceptNetPeeringRequest) throws ApiException {
        okhttp3.Call localVarCall =
                acceptNetPeeringValidateBeforeCall(acceptNetPeeringRequest, null);
        Type localVarReturnType = new TypeToken<AcceptNetPeeringResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param acceptNetPeeringRequest (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call acceptNetPeeringAsync(
            AcceptNetPeeringRequest acceptNetPeeringRequest,
            final ApiCallback<AcceptNetPeeringResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                acceptNetPeeringValidateBeforeCall(acceptNetPeeringRequest, _callback);
        Type localVarReturnType = new TypeToken<AcceptNetPeeringResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createNetPeering
     *
     * @param createNetPeeringRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createNetPeeringCall(
            CreateNetPeeringRequest createNetPeeringRequest, final ApiCallback _callback)
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

        Object localVarPostBody = createNetPeeringRequest;

        // create path and map variables
        String localVarPath = "/CreateNetPeering";

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
    private okhttp3.Call createNetPeeringValidateBeforeCall(
            CreateNetPeeringRequest createNetPeeringRequest, final ApiCallback _callback)
            throws ApiException {
        return createNetPeeringCall(createNetPeeringRequest, _callback);
    }

    /**
     * @param createNetPeeringRequest (optional)
     * @return CreateNetPeeringResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public CreateNetPeeringResponse createNetPeering(
            CreateNetPeeringRequest createNetPeeringRequest) throws ApiException {
        ApiResponse<CreateNetPeeringResponse> localVarResp =
                createNetPeeringWithHttpInfo(createNetPeeringRequest);
        return localVarResp.getData();
    }

    /**
     * @param createNetPeeringRequest (optional)
     * @return ApiResponse&lt;CreateNetPeeringResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CreateNetPeeringResponse> createNetPeeringWithHttpInfo(
            CreateNetPeeringRequest createNetPeeringRequest) throws ApiException {
        okhttp3.Call localVarCall =
                createNetPeeringValidateBeforeCall(createNetPeeringRequest, null);
        Type localVarReturnType = new TypeToken<CreateNetPeeringResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param createNetPeeringRequest (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createNetPeeringAsync(
            CreateNetPeeringRequest createNetPeeringRequest,
            final ApiCallback<CreateNetPeeringResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createNetPeeringValidateBeforeCall(createNetPeeringRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateNetPeeringResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteNetPeering
     *
     * @param deleteNetPeeringRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteNetPeeringCall(
            DeleteNetPeeringRequest deleteNetPeeringRequest, final ApiCallback _callback)
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

        Object localVarPostBody = deleteNetPeeringRequest;

        // create path and map variables
        String localVarPath = "/DeleteNetPeering";

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
    private okhttp3.Call deleteNetPeeringValidateBeforeCall(
            DeleteNetPeeringRequest deleteNetPeeringRequest, final ApiCallback _callback)
            throws ApiException {
        return deleteNetPeeringCall(deleteNetPeeringRequest, _callback);
    }

    /**
     * @param deleteNetPeeringRequest (optional)
     * @return DeleteNetPeeringResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public DeleteNetPeeringResponse deleteNetPeering(
            DeleteNetPeeringRequest deleteNetPeeringRequest) throws ApiException {
        ApiResponse<DeleteNetPeeringResponse> localVarResp =
                deleteNetPeeringWithHttpInfo(deleteNetPeeringRequest);
        return localVarResp.getData();
    }

    /**
     * @param deleteNetPeeringRequest (optional)
     * @return ApiResponse&lt;DeleteNetPeeringResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<DeleteNetPeeringResponse> deleteNetPeeringWithHttpInfo(
            DeleteNetPeeringRequest deleteNetPeeringRequest) throws ApiException {
        okhttp3.Call localVarCall =
                deleteNetPeeringValidateBeforeCall(deleteNetPeeringRequest, null);
        Type localVarReturnType = new TypeToken<DeleteNetPeeringResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param deleteNetPeeringRequest (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteNetPeeringAsync(
            DeleteNetPeeringRequest deleteNetPeeringRequest,
            final ApiCallback<DeleteNetPeeringResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteNetPeeringValidateBeforeCall(deleteNetPeeringRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteNetPeeringResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readNetPeerings
     *
     * @param readNetPeeringsRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call readNetPeeringsCall(
            ReadNetPeeringsRequest readNetPeeringsRequest, final ApiCallback _callback)
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

        Object localVarPostBody = readNetPeeringsRequest;

        // create path and map variables
        String localVarPath = "/ReadNetPeerings";

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
    private okhttp3.Call readNetPeeringsValidateBeforeCall(
            ReadNetPeeringsRequest readNetPeeringsRequest, final ApiCallback _callback)
            throws ApiException {
        return readNetPeeringsCall(readNetPeeringsRequest, _callback);
    }

    /**
     * @param readNetPeeringsRequest (optional)
     * @return ReadNetPeeringsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public ReadNetPeeringsResponse readNetPeerings(ReadNetPeeringsRequest readNetPeeringsRequest)
            throws ApiException {
        ApiResponse<ReadNetPeeringsResponse> localVarResp =
                readNetPeeringsWithHttpInfo(readNetPeeringsRequest);
        return localVarResp.getData();
    }

    /**
     * @param readNetPeeringsRequest (optional)
     * @return ApiResponse&lt;ReadNetPeeringsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ReadNetPeeringsResponse> readNetPeeringsWithHttpInfo(
            ReadNetPeeringsRequest readNetPeeringsRequest) throws ApiException {
        okhttp3.Call localVarCall = readNetPeeringsValidateBeforeCall(readNetPeeringsRequest, null);
        Type localVarReturnType = new TypeToken<ReadNetPeeringsResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param readNetPeeringsRequest (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call readNetPeeringsAsync(
            ReadNetPeeringsRequest readNetPeeringsRequest,
            final ApiCallback<ReadNetPeeringsResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                readNetPeeringsValidateBeforeCall(readNetPeeringsRequest, _callback);
        Type localVarReturnType = new TypeToken<ReadNetPeeringsResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for rejectNetPeering
     *
     * @param rejectNetPeeringRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call rejectNetPeeringCall(
            RejectNetPeeringRequest rejectNetPeeringRequest, final ApiCallback _callback)
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

        Object localVarPostBody = rejectNetPeeringRequest;

        // create path and map variables
        String localVarPath = "/RejectNetPeering";

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
    private okhttp3.Call rejectNetPeeringValidateBeforeCall(
            RejectNetPeeringRequest rejectNetPeeringRequest, final ApiCallback _callback)
            throws ApiException {
        return rejectNetPeeringCall(rejectNetPeeringRequest, _callback);
    }

    /**
     * @param rejectNetPeeringRequest (optional)
     * @return RejectNetPeeringResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public RejectNetPeeringResponse rejectNetPeering(
            RejectNetPeeringRequest rejectNetPeeringRequest) throws ApiException {
        ApiResponse<RejectNetPeeringResponse> localVarResp =
                rejectNetPeeringWithHttpInfo(rejectNetPeeringRequest);
        return localVarResp.getData();
    }

    /**
     * @param rejectNetPeeringRequest (optional)
     * @return ApiResponse&lt;RejectNetPeeringResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<RejectNetPeeringResponse> rejectNetPeeringWithHttpInfo(
            RejectNetPeeringRequest rejectNetPeeringRequest) throws ApiException {
        okhttp3.Call localVarCall =
                rejectNetPeeringValidateBeforeCall(rejectNetPeeringRequest, null);
        Type localVarReturnType = new TypeToken<RejectNetPeeringResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param rejectNetPeeringRequest (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> The HTTP 400 response (Bad Request). </td><td>  -  </td></tr>
     * <tr><td> 401 </td><td> The HTTP 401 response (Unauthorized). </td><td>  -  </td></tr>
     * <tr><td> 409 </td><td> The HTTP 409 response (Conflict). </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> The HTTP 500 response (Internal Server Error). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call rejectNetPeeringAsync(
            RejectNetPeeringRequest rejectNetPeeringRequest,
            final ApiCallback<RejectNetPeeringResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                rejectNetPeeringValidateBeforeCall(rejectNetPeeringRequest, _callback);
        Type localVarReturnType = new TypeToken<RejectNetPeeringResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

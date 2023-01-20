/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.24
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
import io.github.outscale.osc_sdk_java.client.model.CreateSecurityGroupRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateSecurityGroupResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteSecurityGroupRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteSecurityGroupResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadSecurityGroupsRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadSecurityGroupsResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecurityGroupApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SecurityGroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecurityGroupApi(ApiClient apiClient) {
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
     * Build call for createSecurityGroup
     *
     * @param createSecurityGroupRequest (optional)
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
    public okhttp3.Call createSecurityGroupCall(
            CreateSecurityGroupRequest createSecurityGroupRequest, final ApiCallback _callback)
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

        Object localVarPostBody = createSecurityGroupRequest;

        // create path and map variables
        String localVarPath = "/CreateSecurityGroup";

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
    private okhttp3.Call createSecurityGroupValidateBeforeCall(
            CreateSecurityGroupRequest createSecurityGroupRequest, final ApiCallback _callback)
            throws ApiException {
        return createSecurityGroupCall(createSecurityGroupRequest, _callback);
    }

    /**
     * @param createSecurityGroupRequest (optional)
     * @return CreateSecurityGroupResponse
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
    public CreateSecurityGroupResponse createSecurityGroup(
            CreateSecurityGroupRequest createSecurityGroupRequest) throws ApiException {
        ApiResponse<CreateSecurityGroupResponse> localVarResp =
                createSecurityGroupWithHttpInfo(createSecurityGroupRequest);
        return localVarResp.getData();
    }

    /**
     * @param createSecurityGroupRequest (optional)
     * @return ApiResponse&lt;CreateSecurityGroupResponse&gt;
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
    public ApiResponse<CreateSecurityGroupResponse> createSecurityGroupWithHttpInfo(
            CreateSecurityGroupRequest createSecurityGroupRequest) throws ApiException {
        okhttp3.Call localVarCall =
                createSecurityGroupValidateBeforeCall(createSecurityGroupRequest, null);
        Type localVarReturnType = new TypeToken<CreateSecurityGroupResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param createSecurityGroupRequest (optional)
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
    public okhttp3.Call createSecurityGroupAsync(
            CreateSecurityGroupRequest createSecurityGroupRequest,
            final ApiCallback<CreateSecurityGroupResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createSecurityGroupValidateBeforeCall(createSecurityGroupRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateSecurityGroupResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSecurityGroup
     *
     * @param deleteSecurityGroupRequest (optional)
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
    public okhttp3.Call deleteSecurityGroupCall(
            DeleteSecurityGroupRequest deleteSecurityGroupRequest, final ApiCallback _callback)
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

        Object localVarPostBody = deleteSecurityGroupRequest;

        // create path and map variables
        String localVarPath = "/DeleteSecurityGroup";

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
    private okhttp3.Call deleteSecurityGroupValidateBeforeCall(
            DeleteSecurityGroupRequest deleteSecurityGroupRequest, final ApiCallback _callback)
            throws ApiException {
        return deleteSecurityGroupCall(deleteSecurityGroupRequest, _callback);
    }

    /**
     * @param deleteSecurityGroupRequest (optional)
     * @return DeleteSecurityGroupResponse
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
    public DeleteSecurityGroupResponse deleteSecurityGroup(
            DeleteSecurityGroupRequest deleteSecurityGroupRequest) throws ApiException {
        ApiResponse<DeleteSecurityGroupResponse> localVarResp =
                deleteSecurityGroupWithHttpInfo(deleteSecurityGroupRequest);
        return localVarResp.getData();
    }

    /**
     * @param deleteSecurityGroupRequest (optional)
     * @return ApiResponse&lt;DeleteSecurityGroupResponse&gt;
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
    public ApiResponse<DeleteSecurityGroupResponse> deleteSecurityGroupWithHttpInfo(
            DeleteSecurityGroupRequest deleteSecurityGroupRequest) throws ApiException {
        okhttp3.Call localVarCall =
                deleteSecurityGroupValidateBeforeCall(deleteSecurityGroupRequest, null);
        Type localVarReturnType = new TypeToken<DeleteSecurityGroupResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param deleteSecurityGroupRequest (optional)
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
    public okhttp3.Call deleteSecurityGroupAsync(
            DeleteSecurityGroupRequest deleteSecurityGroupRequest,
            final ApiCallback<DeleteSecurityGroupResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteSecurityGroupValidateBeforeCall(deleteSecurityGroupRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteSecurityGroupResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readSecurityGroups
     *
     * @param readSecurityGroupsRequest (optional)
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
    public okhttp3.Call readSecurityGroupsCall(
            ReadSecurityGroupsRequest readSecurityGroupsRequest, final ApiCallback _callback)
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

        Object localVarPostBody = readSecurityGroupsRequest;

        // create path and map variables
        String localVarPath = "/ReadSecurityGroups";

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
    private okhttp3.Call readSecurityGroupsValidateBeforeCall(
            ReadSecurityGroupsRequest readSecurityGroupsRequest, final ApiCallback _callback)
            throws ApiException {
        return readSecurityGroupsCall(readSecurityGroupsRequest, _callback);
    }

    /**
     * @param readSecurityGroupsRequest (optional)
     * @return ReadSecurityGroupsResponse
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
    public ReadSecurityGroupsResponse readSecurityGroups(
            ReadSecurityGroupsRequest readSecurityGroupsRequest) throws ApiException {
        ApiResponse<ReadSecurityGroupsResponse> localVarResp =
                readSecurityGroupsWithHttpInfo(readSecurityGroupsRequest);
        return localVarResp.getData();
    }

    /**
     * @param readSecurityGroupsRequest (optional)
     * @return ApiResponse&lt;ReadSecurityGroupsResponse&gt;
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
    public ApiResponse<ReadSecurityGroupsResponse> readSecurityGroupsWithHttpInfo(
            ReadSecurityGroupsRequest readSecurityGroupsRequest) throws ApiException {
        okhttp3.Call localVarCall =
                readSecurityGroupsValidateBeforeCall(readSecurityGroupsRequest, null);
        Type localVarReturnType = new TypeToken<ReadSecurityGroupsResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param readSecurityGroupsRequest (optional)
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
    public okhttp3.Call readSecurityGroupsAsync(
            ReadSecurityGroupsRequest readSecurityGroupsRequest,
            final ApiCallback<ReadSecurityGroupsResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                readSecurityGroupsValidateBeforeCall(readSecurityGroupsRequest, _callback);
        Type localVarReturnType = new TypeToken<ReadSecurityGroupsResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

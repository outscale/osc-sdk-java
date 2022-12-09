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

package io.github.outscale.osc_sdk_java.client.api;

import com.google.gson.reflect.TypeToken;
import io.github.outscale.osc_sdk_java.client.ApiCallback;
import io.github.outscale.osc_sdk_java.client.ApiClient;
import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.ApiResponse;
import io.github.outscale.osc_sdk_java.client.Configuration;
import io.github.outscale.osc_sdk_java.client.Pair;
import io.github.outscale.osc_sdk_java.client.model.CreateServerCertificateRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateServerCertificateResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteServerCertificateRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteServerCertificateResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadServerCertificatesRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadServerCertificatesResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateServerCertificateRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateServerCertificateResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServerCertificateApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ServerCertificateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ServerCertificateApi(ApiClient apiClient) {
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
     * Build call for createServerCertificate
     *
     * @param createServerCertificateRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createServerCertificateCall(
            CreateServerCertificateRequest createServerCertificateRequest,
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

        Object localVarPostBody = createServerCertificateRequest;

        // create path and map variables
        String localVarPath = "/CreateServerCertificate";

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
    private okhttp3.Call createServerCertificateValidateBeforeCall(
            CreateServerCertificateRequest createServerCertificateRequest,
            final ApiCallback _callback)
            throws ApiException {
        return createServerCertificateCall(createServerCertificateRequest, _callback);
    }

    /**
     * @param createServerCertificateRequest (optional)
     * @return CreateServerCertificateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public CreateServerCertificateResponse createServerCertificate(
            CreateServerCertificateRequest createServerCertificateRequest) throws ApiException {
        ApiResponse<CreateServerCertificateResponse> localVarResp =
                createServerCertificateWithHttpInfo(createServerCertificateRequest);
        return localVarResp.getData();
    }

    /**
     * @param createServerCertificateRequest (optional)
     * @return ApiResponse&lt;CreateServerCertificateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CreateServerCertificateResponse> createServerCertificateWithHttpInfo(
            CreateServerCertificateRequest createServerCertificateRequest) throws ApiException {
        okhttp3.Call localVarCall =
                createServerCertificateValidateBeforeCall(createServerCertificateRequest, null);
        Type localVarReturnType = new TypeToken<CreateServerCertificateResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param createServerCertificateRequest (optional)
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
    public okhttp3.Call createServerCertificateAsync(
            CreateServerCertificateRequest createServerCertificateRequest,
            final ApiCallback<CreateServerCertificateResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createServerCertificateValidateBeforeCall(
                        createServerCertificateRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateServerCertificateResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteServerCertificate
     *
     * @param deleteServerCertificateRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteServerCertificateCall(
            DeleteServerCertificateRequest deleteServerCertificateRequest,
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

        Object localVarPostBody = deleteServerCertificateRequest;

        // create path and map variables
        String localVarPath = "/DeleteServerCertificate";

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
    private okhttp3.Call deleteServerCertificateValidateBeforeCall(
            DeleteServerCertificateRequest deleteServerCertificateRequest,
            final ApiCallback _callback)
            throws ApiException {
        return deleteServerCertificateCall(deleteServerCertificateRequest, _callback);
    }

    /**
     * @param deleteServerCertificateRequest (optional)
     * @return DeleteServerCertificateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public DeleteServerCertificateResponse deleteServerCertificate(
            DeleteServerCertificateRequest deleteServerCertificateRequest) throws ApiException {
        ApiResponse<DeleteServerCertificateResponse> localVarResp =
                deleteServerCertificateWithHttpInfo(deleteServerCertificateRequest);
        return localVarResp.getData();
    }

    /**
     * @param deleteServerCertificateRequest (optional)
     * @return ApiResponse&lt;DeleteServerCertificateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<DeleteServerCertificateResponse> deleteServerCertificateWithHttpInfo(
            DeleteServerCertificateRequest deleteServerCertificateRequest) throws ApiException {
        okhttp3.Call localVarCall =
                deleteServerCertificateValidateBeforeCall(deleteServerCertificateRequest, null);
        Type localVarReturnType = new TypeToken<DeleteServerCertificateResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param deleteServerCertificateRequest (optional)
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
    public okhttp3.Call deleteServerCertificateAsync(
            DeleteServerCertificateRequest deleteServerCertificateRequest,
            final ApiCallback<DeleteServerCertificateResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteServerCertificateValidateBeforeCall(
                        deleteServerCertificateRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteServerCertificateResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readServerCertificates
     *
     * @param readServerCertificatesRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call readServerCertificatesCall(
            ReadServerCertificatesRequest readServerCertificatesRequest,
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

        Object localVarPostBody = readServerCertificatesRequest;

        // create path and map variables
        String localVarPath = "/ReadServerCertificates";

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
    private okhttp3.Call readServerCertificatesValidateBeforeCall(
            ReadServerCertificatesRequest readServerCertificatesRequest,
            final ApiCallback _callback)
            throws ApiException {
        return readServerCertificatesCall(readServerCertificatesRequest, _callback);
    }

    /**
     * @param readServerCertificatesRequest (optional)
     * @return ReadServerCertificatesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ReadServerCertificatesResponse readServerCertificates(
            ReadServerCertificatesRequest readServerCertificatesRequest) throws ApiException {
        ApiResponse<ReadServerCertificatesResponse> localVarResp =
                readServerCertificatesWithHttpInfo(readServerCertificatesRequest);
        return localVarResp.getData();
    }

    /**
     * @param readServerCertificatesRequest (optional)
     * @return ApiResponse&lt;ReadServerCertificatesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ReadServerCertificatesResponse> readServerCertificatesWithHttpInfo(
            ReadServerCertificatesRequest readServerCertificatesRequest) throws ApiException {
        okhttp3.Call localVarCall =
                readServerCertificatesValidateBeforeCall(readServerCertificatesRequest, null);
        Type localVarReturnType = new TypeToken<ReadServerCertificatesResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param readServerCertificatesRequest (optional)
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
    public okhttp3.Call readServerCertificatesAsync(
            ReadServerCertificatesRequest readServerCertificatesRequest,
            final ApiCallback<ReadServerCertificatesResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                readServerCertificatesValidateBeforeCall(readServerCertificatesRequest, _callback);
        Type localVarReturnType = new TypeToken<ReadServerCertificatesResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateServerCertificate
     *
     * @param updateServerCertificateRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateServerCertificateCall(
            UpdateServerCertificateRequest updateServerCertificateRequest,
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

        Object localVarPostBody = updateServerCertificateRequest;

        // create path and map variables
        String localVarPath = "/UpdateServerCertificate";

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
    private okhttp3.Call updateServerCertificateValidateBeforeCall(
            UpdateServerCertificateRequest updateServerCertificateRequest,
            final ApiCallback _callback)
            throws ApiException {
        return updateServerCertificateCall(updateServerCertificateRequest, _callback);
    }

    /**
     * @param updateServerCertificateRequest (optional)
     * @return UpdateServerCertificateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public UpdateServerCertificateResponse updateServerCertificate(
            UpdateServerCertificateRequest updateServerCertificateRequest) throws ApiException {
        ApiResponse<UpdateServerCertificateResponse> localVarResp =
                updateServerCertificateWithHttpInfo(updateServerCertificateRequest);
        return localVarResp.getData();
    }

    /**
     * @param updateServerCertificateRequest (optional)
     * @return ApiResponse&lt;UpdateServerCertificateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<UpdateServerCertificateResponse> updateServerCertificateWithHttpInfo(
            UpdateServerCertificateRequest updateServerCertificateRequest) throws ApiException {
        okhttp3.Call localVarCall =
                updateServerCertificateValidateBeforeCall(updateServerCertificateRequest, null);
        Type localVarReturnType = new TypeToken<UpdateServerCertificateResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param updateServerCertificateRequest (optional)
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
    public okhttp3.Call updateServerCertificateAsync(
            UpdateServerCertificateRequest updateServerCertificateRequest,
            final ApiCallback<UpdateServerCertificateResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateServerCertificateValidateBeforeCall(
                        updateServerCertificateRequest, _callback);
        Type localVarReturnType = new TypeToken<UpdateServerCertificateResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

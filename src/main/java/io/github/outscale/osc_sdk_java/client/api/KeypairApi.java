/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html). ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages. ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).
 *
 * The version of the OpenAPI document: 1.28.5
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
import io.github.outscale.osc_sdk_java.client.model.CreateKeypairRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateKeypairResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteKeypairRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteKeypairResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadKeypairsRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadKeypairsResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeypairApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public KeypairApi() {
        this(Configuration.getDefaultApiClient());
    }

    public KeypairApi(ApiClient apiClient) {
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
     * Build call for createKeypair
     *
     * @param createKeypairRequest (optional)
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
    public okhttp3.Call createKeypairCall(
            CreateKeypairRequest createKeypairRequest, final ApiCallback _callback)
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

        Object localVarPostBody = createKeypairRequest;

        // create path and map variables
        String localVarPath = "/CreateKeypair";

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
    private okhttp3.Call createKeypairValidateBeforeCall(
            CreateKeypairRequest createKeypairRequest, final ApiCallback _callback)
            throws ApiException {
        return createKeypairCall(createKeypairRequest, _callback);
    }

    /**
     * @param createKeypairRequest (optional)
     * @return CreateKeypairResponse
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
    public CreateKeypairResponse createKeypair(CreateKeypairRequest createKeypairRequest)
            throws ApiException {
        ApiResponse<CreateKeypairResponse> localVarResp =
                createKeypairWithHttpInfo(createKeypairRequest);
        return localVarResp.getData();
    }

    /**
     * @param createKeypairRequest (optional)
     * @return ApiResponse&lt;CreateKeypairResponse&gt;
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
    public ApiResponse<CreateKeypairResponse> createKeypairWithHttpInfo(
            CreateKeypairRequest createKeypairRequest) throws ApiException {
        okhttp3.Call localVarCall = createKeypairValidateBeforeCall(createKeypairRequest, null);
        Type localVarReturnType = new TypeToken<CreateKeypairResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param createKeypairRequest (optional)
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
    public okhttp3.Call createKeypairAsync(
            CreateKeypairRequest createKeypairRequest,
            final ApiCallback<CreateKeypairResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createKeypairValidateBeforeCall(createKeypairRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateKeypairResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteKeypair
     *
     * @param deleteKeypairRequest (optional)
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
    public okhttp3.Call deleteKeypairCall(
            DeleteKeypairRequest deleteKeypairRequest, final ApiCallback _callback)
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

        Object localVarPostBody = deleteKeypairRequest;

        // create path and map variables
        String localVarPath = "/DeleteKeypair";

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
    private okhttp3.Call deleteKeypairValidateBeforeCall(
            DeleteKeypairRequest deleteKeypairRequest, final ApiCallback _callback)
            throws ApiException {
        return deleteKeypairCall(deleteKeypairRequest, _callback);
    }

    /**
     * @param deleteKeypairRequest (optional)
     * @return DeleteKeypairResponse
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
    public DeleteKeypairResponse deleteKeypair(DeleteKeypairRequest deleteKeypairRequest)
            throws ApiException {
        ApiResponse<DeleteKeypairResponse> localVarResp =
                deleteKeypairWithHttpInfo(deleteKeypairRequest);
        return localVarResp.getData();
    }

    /**
     * @param deleteKeypairRequest (optional)
     * @return ApiResponse&lt;DeleteKeypairResponse&gt;
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
    public ApiResponse<DeleteKeypairResponse> deleteKeypairWithHttpInfo(
            DeleteKeypairRequest deleteKeypairRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteKeypairValidateBeforeCall(deleteKeypairRequest, null);
        Type localVarReturnType = new TypeToken<DeleteKeypairResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param deleteKeypairRequest (optional)
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
    public okhttp3.Call deleteKeypairAsync(
            DeleteKeypairRequest deleteKeypairRequest,
            final ApiCallback<DeleteKeypairResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteKeypairValidateBeforeCall(deleteKeypairRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteKeypairResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readKeypairs
     *
     * @param readKeypairsRequest (optional)
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
    public okhttp3.Call readKeypairsCall(
            ReadKeypairsRequest readKeypairsRequest, final ApiCallback _callback)
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

        Object localVarPostBody = readKeypairsRequest;

        // create path and map variables
        String localVarPath = "/ReadKeypairs";

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
    private okhttp3.Call readKeypairsValidateBeforeCall(
            ReadKeypairsRequest readKeypairsRequest, final ApiCallback _callback)
            throws ApiException {
        return readKeypairsCall(readKeypairsRequest, _callback);
    }

    /**
     * @param readKeypairsRequest (optional)
     * @return ReadKeypairsResponse
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
    public ReadKeypairsResponse readKeypairs(ReadKeypairsRequest readKeypairsRequest)
            throws ApiException {
        ApiResponse<ReadKeypairsResponse> localVarResp =
                readKeypairsWithHttpInfo(readKeypairsRequest);
        return localVarResp.getData();
    }

    /**
     * @param readKeypairsRequest (optional)
     * @return ApiResponse&lt;ReadKeypairsResponse&gt;
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
    public ApiResponse<ReadKeypairsResponse> readKeypairsWithHttpInfo(
            ReadKeypairsRequest readKeypairsRequest) throws ApiException {
        okhttp3.Call localVarCall = readKeypairsValidateBeforeCall(readKeypairsRequest, null);
        Type localVarReturnType = new TypeToken<ReadKeypairsResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param readKeypairsRequest (optional)
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
    public okhttp3.Call readKeypairsAsync(
            ReadKeypairsRequest readKeypairsRequest,
            final ApiCallback<ReadKeypairsResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = readKeypairsValidateBeforeCall(readKeypairsRequest, _callback);
        Type localVarReturnType = new TypeToken<ReadKeypairsResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html). ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages. ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).
 *
 * The version of the OpenAPI document: 1.28.7
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
import io.github.outscale.osc_sdk_java.client.model.CreateUserRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateUserResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteUserRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteUserResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadUsersRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadUsersResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateUserRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateUserResponse;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserApi(ApiClient apiClient) {
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
     * Build call for createUser
     *
     * @param createUserRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call createUserCall(
            CreateUserRequest createUserRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createUserRequest;

        // create path and map variables
        String localVarPath = "/CreateUser";

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
    private okhttp3.Call createUserValidateBeforeCall(
            CreateUserRequest createUserRequest, final ApiCallback _callback) throws ApiException {
        return createUserCall(createUserRequest, _callback);
    }

    /**
     * @param createUserRequest (optional)
     * @return CreateUserResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public CreateUserResponse createUser(CreateUserRequest createUserRequest) throws ApiException {
        ApiResponse<CreateUserResponse> localVarResp = createUserWithHttpInfo(createUserRequest);
        return localVarResp.getData();
    }

    /**
     * @param createUserRequest (optional)
     * @return ApiResponse&lt;CreateUserResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<CreateUserResponse> createUserWithHttpInfo(
            CreateUserRequest createUserRequest) throws ApiException {
        okhttp3.Call localVarCall = createUserValidateBeforeCall(createUserRequest, null);
        Type localVarReturnType = new TypeToken<CreateUserResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param createUserRequest (optional)
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
    public okhttp3.Call createUserAsync(
            CreateUserRequest createUserRequest, final ApiCallback<CreateUserResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = createUserValidateBeforeCall(createUserRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateUserResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteUser
     *
     * @param deleteUserRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call deleteUserCall(
            DeleteUserRequest deleteUserRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = deleteUserRequest;

        // create path and map variables
        String localVarPath = "/DeleteUser";

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
    private okhttp3.Call deleteUserValidateBeforeCall(
            DeleteUserRequest deleteUserRequest, final ApiCallback _callback) throws ApiException {
        return deleteUserCall(deleteUserRequest, _callback);
    }

    /**
     * @param deleteUserRequest (optional)
     * @return DeleteUserResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest deleteUserRequest) throws ApiException {
        ApiResponse<DeleteUserResponse> localVarResp = deleteUserWithHttpInfo(deleteUserRequest);
        return localVarResp.getData();
    }

    /**
     * @param deleteUserRequest (optional)
     * @return ApiResponse&lt;DeleteUserResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<DeleteUserResponse> deleteUserWithHttpInfo(
            DeleteUserRequest deleteUserRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteUserValidateBeforeCall(deleteUserRequest, null);
        Type localVarReturnType = new TypeToken<DeleteUserResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param deleteUserRequest (optional)
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
    public okhttp3.Call deleteUserAsync(
            DeleteUserRequest deleteUserRequest, final ApiCallback<DeleteUserResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = deleteUserValidateBeforeCall(deleteUserRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteUserResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readUsers
     *
     * @param readUsersRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call readUsersCall(
            ReadUsersRequest readUsersRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = readUsersRequest;

        // create path and map variables
        String localVarPath = "/ReadUsers";

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
    private okhttp3.Call readUsersValidateBeforeCall(
            ReadUsersRequest readUsersRequest, final ApiCallback _callback) throws ApiException {
        return readUsersCall(readUsersRequest, _callback);
    }

    /**
     * @param readUsersRequest (optional)
     * @return ReadUsersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ReadUsersResponse readUsers(ReadUsersRequest readUsersRequest) throws ApiException {
        ApiResponse<ReadUsersResponse> localVarResp = readUsersWithHttpInfo(readUsersRequest);
        return localVarResp.getData();
    }

    /**
     * @param readUsersRequest (optional)
     * @return ApiResponse&lt;ReadUsersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ReadUsersResponse> readUsersWithHttpInfo(ReadUsersRequest readUsersRequest)
            throws ApiException {
        okhttp3.Call localVarCall = readUsersValidateBeforeCall(readUsersRequest, null);
        Type localVarReturnType = new TypeToken<ReadUsersResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param readUsersRequest (optional)
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
    public okhttp3.Call readUsersAsync(
            ReadUsersRequest readUsersRequest, final ApiCallback<ReadUsersResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = readUsersValidateBeforeCall(readUsersRequest, _callback);
        Type localVarReturnType = new TypeToken<ReadUsersResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateUser
     *
     * @param updateUserRequest (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call updateUserCall(
            UpdateUserRequest updateUserRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateUserRequest;

        // create path and map variables
        String localVarPath = "/UpdateUser";

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
    private okhttp3.Call updateUserValidateBeforeCall(
            UpdateUserRequest updateUserRequest, final ApiCallback _callback) throws ApiException {
        return updateUserCall(updateUserRequest, _callback);
    }

    /**
     * @param updateUserRequest (optional)
     * @return UpdateUserResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public UpdateUserResponse updateUser(UpdateUserRequest updateUserRequest) throws ApiException {
        ApiResponse<UpdateUserResponse> localVarResp = updateUserWithHttpInfo(updateUserRequest);
        return localVarResp.getData();
    }

    /**
     * @param updateUserRequest (optional)
     * @return ApiResponse&lt;UpdateUserResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<UpdateUserResponse> updateUserWithHttpInfo(
            UpdateUserRequest updateUserRequest) throws ApiException {
        okhttp3.Call localVarCall = updateUserValidateBeforeCall(updateUserRequest, null);
        Type localVarReturnType = new TypeToken<UpdateUserResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param updateUserRequest (optional)
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
    public okhttp3.Call updateUserAsync(
            UpdateUserRequest updateUserRequest, final ApiCallback<UpdateUserResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = updateUserValidateBeforeCall(updateUserRequest, _callback);
        Type localVarReturnType = new TypeToken<UpdateUserResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

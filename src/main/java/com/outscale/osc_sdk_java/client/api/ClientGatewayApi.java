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


import com.outscale.osc_sdk_java.client.model.CreateClientGatewayRequest;
import com.outscale.osc_sdk_java.client.model.CreateClientGatewayResponse;
import com.outscale.osc_sdk_java.client.model.DeleteClientGatewayRequest;
import com.outscale.osc_sdk_java.client.model.DeleteClientGatewayResponse;
import com.outscale.osc_sdk_java.client.model.ReadClientGatewaysRequest;
import com.outscale.osc_sdk_java.client.model.ReadClientGatewaysResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientGatewayApi {
    private ApiClient localVarApiClient;

    public ClientGatewayApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClientGatewayApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createClientGateway
     * @param createClientGatewayRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createClientGatewayCall(CreateClientGatewayRequest createClientGatewayRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createClientGatewayRequest;

        // create path and map variables
        String localVarPath = "/CreateClientGateway";

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createClientGatewayValidateBeforeCall(CreateClientGatewayRequest createClientGatewayRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createClientGatewayCall(createClientGatewayRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param createClientGatewayRequest  (optional)
     * @return CreateClientGatewayResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public CreateClientGatewayResponse createClientGateway(CreateClientGatewayRequest createClientGatewayRequest) throws ApiException {
        ApiResponse<CreateClientGatewayResponse> localVarResp = createClientGatewayWithHttpInfo(createClientGatewayRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param createClientGatewayRequest  (optional)
     * @return ApiResponse&lt;CreateClientGatewayResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateClientGatewayResponse> createClientGatewayWithHttpInfo(CreateClientGatewayRequest createClientGatewayRequest) throws ApiException {
        okhttp3.Call localVarCall = createClientGatewayValidateBeforeCall(createClientGatewayRequest, null);
        Type localVarReturnType = new TypeToken<CreateClientGatewayResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param createClientGatewayRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createClientGatewayAsync(CreateClientGatewayRequest createClientGatewayRequest, final ApiCallback<CreateClientGatewayResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createClientGatewayValidateBeforeCall(createClientGatewayRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateClientGatewayResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteClientGateway
     * @param deleteClientGatewayRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteClientGatewayCall(DeleteClientGatewayRequest deleteClientGatewayRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = deleteClientGatewayRequest;

        // create path and map variables
        String localVarPath = "/DeleteClientGateway";

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteClientGatewayValidateBeforeCall(DeleteClientGatewayRequest deleteClientGatewayRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = deleteClientGatewayCall(deleteClientGatewayRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param deleteClientGatewayRequest  (optional)
     * @return DeleteClientGatewayResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public DeleteClientGatewayResponse deleteClientGateway(DeleteClientGatewayRequest deleteClientGatewayRequest) throws ApiException {
        ApiResponse<DeleteClientGatewayResponse> localVarResp = deleteClientGatewayWithHttpInfo(deleteClientGatewayRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param deleteClientGatewayRequest  (optional)
     * @return ApiResponse&lt;DeleteClientGatewayResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeleteClientGatewayResponse> deleteClientGatewayWithHttpInfo(DeleteClientGatewayRequest deleteClientGatewayRequest) throws ApiException {
        okhttp3.Call localVarCall = deleteClientGatewayValidateBeforeCall(deleteClientGatewayRequest, null);
        Type localVarReturnType = new TypeToken<DeleteClientGatewayResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param deleteClientGatewayRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteClientGatewayAsync(DeleteClientGatewayRequest deleteClientGatewayRequest, final ApiCallback<DeleteClientGatewayResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteClientGatewayValidateBeforeCall(deleteClientGatewayRequest, _callback);
        Type localVarReturnType = new TypeToken<DeleteClientGatewayResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readClientGateways
     * @param readClientGatewaysRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call readClientGatewaysCall(ReadClientGatewaysRequest readClientGatewaysRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = readClientGatewaysRequest;

        // create path and map variables
        String localVarPath = "/ReadClientGateways";

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call readClientGatewaysValidateBeforeCall(ReadClientGatewaysRequest readClientGatewaysRequest, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = readClientGatewaysCall(readClientGatewaysRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param readClientGatewaysRequest  (optional)
     * @return ReadClientGatewaysResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public ReadClientGatewaysResponse readClientGateways(ReadClientGatewaysRequest readClientGatewaysRequest) throws ApiException {
        ApiResponse<ReadClientGatewaysResponse> localVarResp = readClientGatewaysWithHttpInfo(readClientGatewaysRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param readClientGatewaysRequest  (optional)
     * @return ApiResponse&lt;ReadClientGatewaysResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReadClientGatewaysResponse> readClientGatewaysWithHttpInfo(ReadClientGatewaysRequest readClientGatewaysRequest) throws ApiException {
        okhttp3.Call localVarCall = readClientGatewaysValidateBeforeCall(readClientGatewaysRequest, null);
        Type localVarReturnType = new TypeToken<ReadClientGatewaysResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param readClientGatewaysRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The HTTP 200 response (OK). </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call readClientGatewaysAsync(ReadClientGatewaysRequest readClientGatewaysRequest, final ApiCallback<ReadClientGatewaysResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = readClientGatewaysValidateBeforeCall(readClientGatewaysRequest, _callback);
        Type localVarReturnType = new TypeToken<ReadClientGatewaysResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

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

import com.outscale.osc_sdk_java.client.ApiException;
import com.outscale.osc_sdk_java.client.model.CheckAuthenticationRequest;
import com.outscale.osc_sdk_java.client.model.CheckAuthenticationResponse;
import com.outscale.osc_sdk_java.client.model.CreateAccountRequest;
import com.outscale.osc_sdk_java.client.model.CreateAccountResponse;
import com.outscale.osc_sdk_java.client.model.ReadAccountsRequest;
import com.outscale.osc_sdk_java.client.model.ReadAccountsResponse;
import com.outscale.osc_sdk_java.client.model.ReadConsumptionAccountRequest;
import com.outscale.osc_sdk_java.client.model.ReadConsumptionAccountResponse;
import com.outscale.osc_sdk_java.client.model.ResetAccountPasswordRequest;
import com.outscale.osc_sdk_java.client.model.ResetAccountPasswordResponse;
import com.outscale.osc_sdk_java.client.model.SendResetPasswordEmailRequest;
import com.outscale.osc_sdk_java.client.model.SendResetPasswordEmailResponse;
import com.outscale.osc_sdk_java.client.model.UpdateAccountRequest;
import com.outscale.osc_sdk_java.client.model.UpdateAccountResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Ignore
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void checkAuthenticationTest() throws ApiException {
        CheckAuthenticationRequest checkAuthenticationRequest = null;
        CheckAuthenticationResponse response = api.checkAuthentication(checkAuthenticationRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountTest() throws ApiException {
        CreateAccountRequest createAccountRequest = null;
        CreateAccountResponse response = api.createAccount(createAccountRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAccountsTest() throws ApiException {
        ReadAccountsRequest readAccountsRequest = null;
        ReadAccountsResponse response = api.readAccounts(readAccountsRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readConsumptionAccountTest() throws ApiException {
        ReadConsumptionAccountRequest readConsumptionAccountRequest = null;
        ReadConsumptionAccountResponse response = api.readConsumptionAccount(readConsumptionAccountRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetAccountPasswordTest() throws ApiException {
        ResetAccountPasswordRequest resetAccountPasswordRequest = null;
        ResetAccountPasswordResponse response = api.resetAccountPassword(resetAccountPasswordRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendResetPasswordEmailTest() throws ApiException {
        SendResetPasswordEmailRequest sendResetPasswordEmailRequest = null;
        SendResetPasswordEmailResponse response = api.sendResetPasswordEmail(sendResetPasswordEmailRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccountTest() throws ApiException {
        UpdateAccountRequest updateAccountRequest = null;
        UpdateAccountResponse response = api.updateAccount(updateAccountRequest);

        // TODO: test validations
    }
    
}

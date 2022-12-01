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
import com.outscale.osc_sdk_java.client.model.CreateListenerRuleRequest;
import com.outscale.osc_sdk_java.client.model.CreateListenerRuleResponse;
import com.outscale.osc_sdk_java.client.model.CreateLoadBalancerListenersRequest;
import com.outscale.osc_sdk_java.client.model.CreateLoadBalancerListenersResponse;
import com.outscale.osc_sdk_java.client.model.DeleteListenerRuleRequest;
import com.outscale.osc_sdk_java.client.model.DeleteListenerRuleResponse;
import com.outscale.osc_sdk_java.client.model.DeleteLoadBalancerListenersRequest;
import com.outscale.osc_sdk_java.client.model.DeleteLoadBalancerListenersResponse;
import com.outscale.osc_sdk_java.client.model.ReadListenerRulesRequest;
import com.outscale.osc_sdk_java.client.model.ReadListenerRulesResponse;
import com.outscale.osc_sdk_java.client.model.UpdateListenerRuleRequest;
import com.outscale.osc_sdk_java.client.model.UpdateListenerRuleResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ListenerApi
 */
@Ignore
public class ListenerApiTest {

    private final ListenerApi api = new ListenerApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createListenerRuleTest() throws ApiException {
        CreateListenerRuleRequest createListenerRuleRequest = null;
        CreateListenerRuleResponse response = api.createListenerRule(createListenerRuleRequest);

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
    public void createLoadBalancerListenersTest() throws ApiException {
        CreateLoadBalancerListenersRequest createLoadBalancerListenersRequest = null;
        CreateLoadBalancerListenersResponse response = api.createLoadBalancerListeners(createLoadBalancerListenersRequest);

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
    public void deleteListenerRuleTest() throws ApiException {
        DeleteListenerRuleRequest deleteListenerRuleRequest = null;
        DeleteListenerRuleResponse response = api.deleteListenerRule(deleteListenerRuleRequest);

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
    public void deleteLoadBalancerListenersTest() throws ApiException {
        DeleteLoadBalancerListenersRequest deleteLoadBalancerListenersRequest = null;
        DeleteLoadBalancerListenersResponse response = api.deleteLoadBalancerListeners(deleteLoadBalancerListenersRequest);

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
    public void readListenerRulesTest() throws ApiException {
        ReadListenerRulesRequest readListenerRulesRequest = null;
        ReadListenerRulesResponse response = api.readListenerRules(readListenerRulesRequest);

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
    public void updateListenerRuleTest() throws ApiException {
        UpdateListenerRuleRequest updateListenerRuleRequest = null;
        UpdateListenerRuleResponse response = api.updateListenerRule(updateListenerRuleRequest);

        // TODO: test validations
    }
    
}

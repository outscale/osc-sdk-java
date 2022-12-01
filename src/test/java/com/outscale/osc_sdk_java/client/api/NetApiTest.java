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
import com.outscale.osc_sdk_java.client.model.CreateNetRequest;
import com.outscale.osc_sdk_java.client.model.CreateNetResponse;
import com.outscale.osc_sdk_java.client.model.DeleteNetRequest;
import com.outscale.osc_sdk_java.client.model.DeleteNetResponse;
import com.outscale.osc_sdk_java.client.model.ErrorResponse;
import com.outscale.osc_sdk_java.client.model.ReadNetsRequest;
import com.outscale.osc_sdk_java.client.model.ReadNetsResponse;
import com.outscale.osc_sdk_java.client.model.UpdateNetRequest;
import com.outscale.osc_sdk_java.client.model.UpdateNetResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetApi
 */
@Ignore
public class NetApiTest {

    private final NetApi api = new NetApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNetTest() throws ApiException {
        CreateNetRequest createNetRequest = null;
        CreateNetResponse response = api.createNet(createNetRequest);

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
    public void deleteNetTest() throws ApiException {
        DeleteNetRequest deleteNetRequest = null;
        DeleteNetResponse response = api.deleteNet(deleteNetRequest);

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
    public void readNetsTest() throws ApiException {
        ReadNetsRequest readNetsRequest = null;
        ReadNetsResponse response = api.readNets(readNetsRequest);

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
    public void updateNetTest() throws ApiException {
        UpdateNetRequest updateNetRequest = null;
        UpdateNetResponse response = api.updateNet(updateNetRequest);

        // TODO: test validations
    }
    
}

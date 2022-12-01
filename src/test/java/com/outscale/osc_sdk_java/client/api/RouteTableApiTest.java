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
import com.outscale.osc_sdk_java.client.model.CreateRouteTableRequest;
import com.outscale.osc_sdk_java.client.model.CreateRouteTableResponse;
import com.outscale.osc_sdk_java.client.model.DeleteRouteTableRequest;
import com.outscale.osc_sdk_java.client.model.DeleteRouteTableResponse;
import com.outscale.osc_sdk_java.client.model.ErrorResponse;
import com.outscale.osc_sdk_java.client.model.LinkRouteTableRequest;
import com.outscale.osc_sdk_java.client.model.LinkRouteTableResponse;
import com.outscale.osc_sdk_java.client.model.ReadRouteTablesRequest;
import com.outscale.osc_sdk_java.client.model.ReadRouteTablesResponse;
import com.outscale.osc_sdk_java.client.model.UnlinkRouteTableRequest;
import com.outscale.osc_sdk_java.client.model.UnlinkRouteTableResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RouteTableApi
 */
@Disabled
public class RouteTableApiTest {

    private final RouteTableApi api = new RouteTableApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRouteTableTest() throws ApiException {
        CreateRouteTableRequest createRouteTableRequest = null;
        CreateRouteTableResponse response = api.createRouteTable(createRouteTableRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRouteTableTest() throws ApiException {
        DeleteRouteTableRequest deleteRouteTableRequest = null;
        DeleteRouteTableResponse response = api.deleteRouteTable(deleteRouteTableRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void linkRouteTableTest() throws ApiException {
        LinkRouteTableRequest linkRouteTableRequest = null;
        LinkRouteTableResponse response = api.linkRouteTable(linkRouteTableRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void readRouteTablesTest() throws ApiException {
        ReadRouteTablesRequest readRouteTablesRequest = null;
        ReadRouteTablesResponse response = api.readRouteTables(readRouteTablesRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unlinkRouteTableTest() throws ApiException {
        UnlinkRouteTableRequest unlinkRouteTableRequest = null;
        UnlinkRouteTableResponse response = api.unlinkRouteTable(unlinkRouteTableRequest);
        // TODO: test validations
    }

}

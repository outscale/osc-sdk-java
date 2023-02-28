/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.25
 * Contact: support@outscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.outscale.osc_sdk_java.client.api;

import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.model.CreateRouteRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateRouteResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteRouteRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteRouteResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateRouteRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateRouteResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for RouteApi */
@Disabled
public class RouteApiTest {

    private final RouteApi api = new RouteApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createRouteTest() throws ApiException {
        CreateRouteRequest createRouteRequest = null;
        CreateRouteResponse response = api.createRoute(createRouteRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteRouteTest() throws ApiException {
        DeleteRouteRequest deleteRouteRequest = null;
        DeleteRouteResponse response = api.deleteRoute(deleteRouteRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void updateRouteTest() throws ApiException {
        UpdateRouteRequest updateRouteRequest = null;
        UpdateRouteResponse response = api.updateRoute(updateRouteRequest);
        // TODO: test validations
    }
}

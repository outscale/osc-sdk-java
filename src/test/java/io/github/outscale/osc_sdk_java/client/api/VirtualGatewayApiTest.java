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

import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.model.CreateVirtualGatewayRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateVirtualGatewayResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteVirtualGatewayRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteVirtualGatewayResponse;
import io.github.outscale.osc_sdk_java.client.model.LinkVirtualGatewayRequest;
import io.github.outscale.osc_sdk_java.client.model.LinkVirtualGatewayResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadVirtualGatewaysRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadVirtualGatewaysResponse;
import io.github.outscale.osc_sdk_java.client.model.UnlinkVirtualGatewayRequest;
import io.github.outscale.osc_sdk_java.client.model.UnlinkVirtualGatewayResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateRoutePropagationRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateRoutePropagationResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for VirtualGatewayApi */
@Disabled
public class VirtualGatewayApiTest {

    private final VirtualGatewayApi api = new VirtualGatewayApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createVirtualGatewayTest() throws ApiException {
        CreateVirtualGatewayRequest createVirtualGatewayRequest = null;
        CreateVirtualGatewayResponse response =
                api.createVirtualGateway(createVirtualGatewayRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteVirtualGatewayTest() throws ApiException {
        DeleteVirtualGatewayRequest deleteVirtualGatewayRequest = null;
        DeleteVirtualGatewayResponse response =
                api.deleteVirtualGateway(deleteVirtualGatewayRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void linkVirtualGatewayTest() throws ApiException {
        LinkVirtualGatewayRequest linkVirtualGatewayRequest = null;
        LinkVirtualGatewayResponse response = api.linkVirtualGateway(linkVirtualGatewayRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readVirtualGatewaysTest() throws ApiException {
        ReadVirtualGatewaysRequest readVirtualGatewaysRequest = null;
        ReadVirtualGatewaysResponse response = api.readVirtualGateways(readVirtualGatewaysRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void unlinkVirtualGatewayTest() throws ApiException {
        UnlinkVirtualGatewayRequest unlinkVirtualGatewayRequest = null;
        UnlinkVirtualGatewayResponse response =
                api.unlinkVirtualGateway(unlinkVirtualGatewayRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void updateRoutePropagationTest() throws ApiException {
        UpdateRoutePropagationRequest updateRoutePropagationRequest = null;
        UpdateRoutePropagationResponse response =
                api.updateRoutePropagation(updateRoutePropagationRequest);
        // TODO: test validations
    }
}

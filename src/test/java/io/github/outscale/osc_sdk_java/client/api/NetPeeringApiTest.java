/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.26
 * Contact: support@outscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.outscale.osc_sdk_java.client.api;

import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.model.AcceptNetPeeringRequest;
import io.github.outscale.osc_sdk_java.client.model.AcceptNetPeeringResponse;
import io.github.outscale.osc_sdk_java.client.model.CreateNetPeeringRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateNetPeeringResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteNetPeeringRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteNetPeeringResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadNetPeeringsRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadNetPeeringsResponse;
import io.github.outscale.osc_sdk_java.client.model.RejectNetPeeringRequest;
import io.github.outscale.osc_sdk_java.client.model.RejectNetPeeringResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for NetPeeringApi */
@Disabled
public class NetPeeringApiTest {

    private final NetPeeringApi api = new NetPeeringApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void acceptNetPeeringTest() throws ApiException {
        AcceptNetPeeringRequest acceptNetPeeringRequest = null;
        AcceptNetPeeringResponse response = api.acceptNetPeering(acceptNetPeeringRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void createNetPeeringTest() throws ApiException {
        CreateNetPeeringRequest createNetPeeringRequest = null;
        CreateNetPeeringResponse response = api.createNetPeering(createNetPeeringRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteNetPeeringTest() throws ApiException {
        DeleteNetPeeringRequest deleteNetPeeringRequest = null;
        DeleteNetPeeringResponse response = api.deleteNetPeering(deleteNetPeeringRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readNetPeeringsTest() throws ApiException {
        ReadNetPeeringsRequest readNetPeeringsRequest = null;
        ReadNetPeeringsResponse response = api.readNetPeerings(readNetPeeringsRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void rejectNetPeeringTest() throws ApiException {
        RejectNetPeeringRequest rejectNetPeeringRequest = null;
        RejectNetPeeringResponse response = api.rejectNetPeering(rejectNetPeeringRequest);
        // TODO: test validations
    }
}

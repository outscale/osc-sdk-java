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

package io.github.outscale.osc_sdk_java.client.api;

import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.model.CreateDirectLinkInterfaceRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateDirectLinkInterfaceResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteDirectLinkInterfaceRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteDirectLinkInterfaceResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadDirectLinkInterfacesRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadDirectLinkInterfacesResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateDirectLinkInterfaceRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateDirectLinkInterfaceResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for DirectLinkInterfaceApi */
@Disabled
public class DirectLinkInterfaceApiTest {

    private final DirectLinkInterfaceApi api = new DirectLinkInterfaceApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createDirectLinkInterfaceTest() throws ApiException {
        CreateDirectLinkInterfaceRequest createDirectLinkInterfaceRequest = null;
        CreateDirectLinkInterfaceResponse response =
                api.createDirectLinkInterface(createDirectLinkInterfaceRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteDirectLinkInterfaceTest() throws ApiException {
        DeleteDirectLinkInterfaceRequest deleteDirectLinkInterfaceRequest = null;
        DeleteDirectLinkInterfaceResponse response =
                api.deleteDirectLinkInterface(deleteDirectLinkInterfaceRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readDirectLinkInterfacesTest() throws ApiException {
        ReadDirectLinkInterfacesRequest readDirectLinkInterfacesRequest = null;
        ReadDirectLinkInterfacesResponse response =
                api.readDirectLinkInterfaces(readDirectLinkInterfacesRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void updateDirectLinkInterfaceTest() throws ApiException {
        UpdateDirectLinkInterfaceRequest updateDirectLinkInterfaceRequest = null;
        UpdateDirectLinkInterfaceResponse response =
                api.updateDirectLinkInterface(updateDirectLinkInterfaceRequest);
        // TODO: test validations
    }
}

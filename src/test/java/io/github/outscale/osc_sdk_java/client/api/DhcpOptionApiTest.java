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
import io.github.outscale.osc_sdk_java.client.model.CreateDhcpOptionsRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateDhcpOptionsResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteDhcpOptionsRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteDhcpOptionsResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadDhcpOptionsRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadDhcpOptionsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for DhcpOptionApi */
@Disabled
public class DhcpOptionApiTest {

    private final DhcpOptionApi api = new DhcpOptionApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createDhcpOptionsTest() throws ApiException {
        CreateDhcpOptionsRequest createDhcpOptionsRequest = null;
        CreateDhcpOptionsResponse response = api.createDhcpOptions(createDhcpOptionsRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteDhcpOptionsTest() throws ApiException {
        DeleteDhcpOptionsRequest deleteDhcpOptionsRequest = null;
        DeleteDhcpOptionsResponse response = api.deleteDhcpOptions(deleteDhcpOptionsRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readDhcpOptionsTest() throws ApiException {
        ReadDhcpOptionsRequest readDhcpOptionsRequest = null;
        ReadDhcpOptionsResponse response = api.readDhcpOptions(readDhcpOptionsRequest);
        // TODO: test validations
    }
}

/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.27
 * Contact: support@outscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.outscale.osc_sdk_java.client.api;

import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.model.CreateSubnetRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateSubnetResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteSubnetRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteSubnetResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadSubnetsRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadSubnetsResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateSubnetRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateSubnetResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for SubnetApi */
@Disabled
public class SubnetApiTest {

    private final SubnetApi api = new SubnetApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createSubnetTest() throws ApiException {
        CreateSubnetRequest createSubnetRequest = null;
        CreateSubnetResponse response = api.createSubnet(createSubnetRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteSubnetTest() throws ApiException {
        DeleteSubnetRequest deleteSubnetRequest = null;
        DeleteSubnetResponse response = api.deleteSubnet(deleteSubnetRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readSubnetsTest() throws ApiException {
        ReadSubnetsRequest readSubnetsRequest = null;
        ReadSubnetsResponse response = api.readSubnets(readSubnetsRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void updateSubnetTest() throws ApiException {
        UpdateSubnetRequest updateSubnetRequest = null;
        UpdateSubnetResponse response = api.updateSubnet(updateSubnetRequest);
        // TODO: test validations
    }
}

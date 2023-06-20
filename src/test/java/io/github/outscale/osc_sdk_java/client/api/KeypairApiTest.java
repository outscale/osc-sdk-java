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
import io.github.outscale.osc_sdk_java.client.model.CreateKeypairRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateKeypairResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteKeypairRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteKeypairResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadKeypairsRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadKeypairsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for KeypairApi */
@Disabled
public class KeypairApiTest {

    private final KeypairApi api = new KeypairApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createKeypairTest() throws ApiException {
        CreateKeypairRequest createKeypairRequest = null;
        CreateKeypairResponse response = api.createKeypair(createKeypairRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteKeypairTest() throws ApiException {
        DeleteKeypairRequest deleteKeypairRequest = null;
        DeleteKeypairResponse response = api.deleteKeypair(deleteKeypairRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readKeypairsTest() throws ApiException {
        ReadKeypairsRequest readKeypairsRequest = null;
        ReadKeypairsResponse response = api.readKeypairs(readKeypairsRequest);
        // TODO: test validations
    }
}

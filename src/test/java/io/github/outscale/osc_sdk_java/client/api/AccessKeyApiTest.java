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
import io.github.outscale.osc_sdk_java.client.model.CreateAccessKeyRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateAccessKeyResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteAccessKeyRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteAccessKeyResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadAccessKeysRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadAccessKeysResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadSecretAccessKeyRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadSecretAccessKeyResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateAccessKeyRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateAccessKeyResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for AccessKeyApi */
@Disabled
public class AccessKeyApiTest {

    private final AccessKeyApi api = new AccessKeyApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createAccessKeyTest() throws ApiException {
        CreateAccessKeyRequest createAccessKeyRequest = null;
        CreateAccessKeyResponse response = api.createAccessKey(createAccessKeyRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteAccessKeyTest() throws ApiException {
        DeleteAccessKeyRequest deleteAccessKeyRequest = null;
        DeleteAccessKeyResponse response = api.deleteAccessKey(deleteAccessKeyRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readAccessKeysTest() throws ApiException {
        ReadAccessKeysRequest readAccessKeysRequest = null;
        ReadAccessKeysResponse response = api.readAccessKeys(readAccessKeysRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readSecretAccessKeyTest() throws ApiException {
        ReadSecretAccessKeyRequest readSecretAccessKeyRequest = null;
        ReadSecretAccessKeyResponse response = api.readSecretAccessKey(readSecretAccessKeyRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void updateAccessKeyTest() throws ApiException {
        UpdateAccessKeyRequest updateAccessKeyRequest = null;
        UpdateAccessKeyResponse response = api.updateAccessKey(updateAccessKeyRequest);
        // TODO: test validations
    }
}

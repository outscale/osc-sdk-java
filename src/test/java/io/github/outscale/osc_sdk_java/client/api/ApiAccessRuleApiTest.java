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
import io.github.outscale.osc_sdk_java.client.model.CreateApiAccessRuleRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateApiAccessRuleResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteApiAccessRuleRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteApiAccessRuleResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadApiAccessRulesRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadApiAccessRulesResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateApiAccessRuleRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateApiAccessRuleResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for ApiAccessRuleApi */
@Disabled
public class ApiAccessRuleApiTest {

    private final ApiAccessRuleApi api = new ApiAccessRuleApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createApiAccessRuleTest() throws ApiException {
        CreateApiAccessRuleRequest createApiAccessRuleRequest = null;
        CreateApiAccessRuleResponse response = api.createApiAccessRule(createApiAccessRuleRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteApiAccessRuleTest() throws ApiException {
        DeleteApiAccessRuleRequest deleteApiAccessRuleRequest = null;
        DeleteApiAccessRuleResponse response = api.deleteApiAccessRule(deleteApiAccessRuleRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readApiAccessRulesTest() throws ApiException {
        ReadApiAccessRulesRequest readApiAccessRulesRequest = null;
        ReadApiAccessRulesResponse response = api.readApiAccessRules(readApiAccessRulesRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void updateApiAccessRuleTest() throws ApiException {
        UpdateApiAccessRuleRequest updateApiAccessRuleRequest = null;
        UpdateApiAccessRuleResponse response = api.updateApiAccessRule(updateApiAccessRuleRequest);
        // TODO: test validations
    }
}

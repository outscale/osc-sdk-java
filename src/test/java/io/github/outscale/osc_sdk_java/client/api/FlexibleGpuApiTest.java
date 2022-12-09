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
import io.github.outscale.osc_sdk_java.client.model.CreateFlexibleGpuRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateFlexibleGpuResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteFlexibleGpuRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteFlexibleGpuResponse;
import io.github.outscale.osc_sdk_java.client.model.LinkFlexibleGpuRequest;
import io.github.outscale.osc_sdk_java.client.model.LinkFlexibleGpuResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadFlexibleGpuCatalogRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadFlexibleGpuCatalogResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadFlexibleGpusRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadFlexibleGpusResponse;
import io.github.outscale.osc_sdk_java.client.model.UnlinkFlexibleGpuRequest;
import io.github.outscale.osc_sdk_java.client.model.UnlinkFlexibleGpuResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateFlexibleGpuRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateFlexibleGpuResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for FlexibleGpuApi */
@Disabled
public class FlexibleGpuApiTest {

    private final FlexibleGpuApi api = new FlexibleGpuApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createFlexibleGpuTest() throws ApiException {
        CreateFlexibleGpuRequest createFlexibleGpuRequest = null;
        CreateFlexibleGpuResponse response = api.createFlexibleGpu(createFlexibleGpuRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteFlexibleGpuTest() throws ApiException {
        DeleteFlexibleGpuRequest deleteFlexibleGpuRequest = null;
        DeleteFlexibleGpuResponse response = api.deleteFlexibleGpu(deleteFlexibleGpuRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void linkFlexibleGpuTest() throws ApiException {
        LinkFlexibleGpuRequest linkFlexibleGpuRequest = null;
        LinkFlexibleGpuResponse response = api.linkFlexibleGpu(linkFlexibleGpuRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readFlexibleGpuCatalogTest() throws ApiException {
        ReadFlexibleGpuCatalogRequest readFlexibleGpuCatalogRequest = null;
        ReadFlexibleGpuCatalogResponse response =
                api.readFlexibleGpuCatalog(readFlexibleGpuCatalogRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readFlexibleGpusTest() throws ApiException {
        ReadFlexibleGpusRequest readFlexibleGpusRequest = null;
        ReadFlexibleGpusResponse response = api.readFlexibleGpus(readFlexibleGpusRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void unlinkFlexibleGpuTest() throws ApiException {
        UnlinkFlexibleGpuRequest unlinkFlexibleGpuRequest = null;
        UnlinkFlexibleGpuResponse response = api.unlinkFlexibleGpu(unlinkFlexibleGpuRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void updateFlexibleGpuTest() throws ApiException {
        UpdateFlexibleGpuRequest updateFlexibleGpuRequest = null;
        UpdateFlexibleGpuResponse response = api.updateFlexibleGpu(updateFlexibleGpuRequest);
        // TODO: test validations
    }
}

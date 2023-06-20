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
import io.github.outscale.osc_sdk_java.client.model.CreateVolumeRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateVolumeResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteVolumeRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteVolumeResponse;
import io.github.outscale.osc_sdk_java.client.model.LinkVolumeRequest;
import io.github.outscale.osc_sdk_java.client.model.LinkVolumeResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadVolumesRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadVolumesResponse;
import io.github.outscale.osc_sdk_java.client.model.UnlinkVolumeRequest;
import io.github.outscale.osc_sdk_java.client.model.UnlinkVolumeResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateVolumeRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateVolumeResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for VolumeApi */
@Disabled
public class VolumeApiTest {

    private final VolumeApi api = new VolumeApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createVolumeTest() throws ApiException {
        CreateVolumeRequest createVolumeRequest = null;
        CreateVolumeResponse response = api.createVolume(createVolumeRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteVolumeTest() throws ApiException {
        DeleteVolumeRequest deleteVolumeRequest = null;
        DeleteVolumeResponse response = api.deleteVolume(deleteVolumeRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void linkVolumeTest() throws ApiException {
        LinkVolumeRequest linkVolumeRequest = null;
        LinkVolumeResponse response = api.linkVolume(linkVolumeRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readVolumesTest() throws ApiException {
        ReadVolumesRequest readVolumesRequest = null;
        ReadVolumesResponse response = api.readVolumes(readVolumesRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void unlinkVolumeTest() throws ApiException {
        UnlinkVolumeRequest unlinkVolumeRequest = null;
        UnlinkVolumeResponse response = api.unlinkVolume(unlinkVolumeRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void updateVolumeTest() throws ApiException {
        UpdateVolumeRequest updateVolumeRequest = null;
        UpdateVolumeResponse response = api.updateVolume(updateVolumeRequest);
        // TODO: test validations
    }
}

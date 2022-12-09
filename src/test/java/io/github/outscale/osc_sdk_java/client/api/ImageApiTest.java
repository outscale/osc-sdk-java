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
import io.github.outscale.osc_sdk_java.client.model.CreateImageExportTaskRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateImageExportTaskResponse;
import io.github.outscale.osc_sdk_java.client.model.CreateImageRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateImageResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteImageRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteImageResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadImageExportTasksRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadImageExportTasksResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadImagesRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadImagesResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateImageRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateImageResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for ImageApi */
@Disabled
public class ImageApiTest {

    private final ImageApi api = new ImageApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createImageTest() throws ApiException {
        CreateImageRequest createImageRequest = null;
        CreateImageResponse response = api.createImage(createImageRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void createImageExportTaskTest() throws ApiException {
        CreateImageExportTaskRequest createImageExportTaskRequest = null;
        CreateImageExportTaskResponse response =
                api.createImageExportTask(createImageExportTaskRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteImageTest() throws ApiException {
        DeleteImageRequest deleteImageRequest = null;
        DeleteImageResponse response = api.deleteImage(deleteImageRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readImageExportTasksTest() throws ApiException {
        ReadImageExportTasksRequest readImageExportTasksRequest = null;
        ReadImageExportTasksResponse response =
                api.readImageExportTasks(readImageExportTasksRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readImagesTest() throws ApiException {
        ReadImagesRequest readImagesRequest = null;
        ReadImagesResponse response = api.readImages(readImagesRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void updateImageTest() throws ApiException {
        UpdateImageRequest updateImageRequest = null;
        UpdateImageResponse response = api.updateImage(updateImageRequest);
        // TODO: test validations
    }
}

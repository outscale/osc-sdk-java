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

package io.github.outscale.osc_sdk_java.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.outscale.osc_sdk_java.client.JSON;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** CreateImageExportTaskResponse */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateImageExportTaskResponse {
    public static final String SERIALIZED_NAME_IMAGE_EXPORT_TASK = "ImageExportTask";

    @SerializedName(SERIALIZED_NAME_IMAGE_EXPORT_TASK)
    private ImageExportTask imageExportTask;

    public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";

    @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
    private ResponseContext responseContext;

    public CreateImageExportTaskResponse() {}

    public CreateImageExportTaskResponse imageExportTask(ImageExportTask imageExportTask) {

        this.imageExportTask = imageExportTask;
        return this;
    }

    /**
     * Get imageExportTask
     *
     * @return imageExportTask
     */
    @javax.annotation.Nullable
    public ImageExportTask getImageExportTask() {
        return imageExportTask;
    }

    public void setImageExportTask(ImageExportTask imageExportTask) {
        this.imageExportTask = imageExportTask;
    }

    public CreateImageExportTaskResponse responseContext(ResponseContext responseContext) {

        this.responseContext = responseContext;
        return this;
    }

    /**
     * Get responseContext
     *
     * @return responseContext
     */
    @javax.annotation.Nullable
    public ResponseContext getResponseContext() {
        return responseContext;
    }

    public void setResponseContext(ResponseContext responseContext) {
        this.responseContext = responseContext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateImageExportTaskResponse createImageExportTaskResponse =
                (CreateImageExportTaskResponse) o;
        return Objects.equals(this.imageExportTask, createImageExportTaskResponse.imageExportTask)
                && Objects.equals(
                        this.responseContext, createImageExportTaskResponse.responseContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageExportTask, responseContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateImageExportTaskResponse {\n");
        sb.append("    imageExportTask: ").append(toIndentedString(imageExportTask)).append("\n");
        sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("ImageExportTask");
        openapiFields.add("ResponseContext");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to
     *     CreateImageExportTaskResponse
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateImageExportTaskResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateImageExportTaskResponse is not"
                                        + " found in the empty JSON string",
                                CreateImageExportTaskResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateImageExportTaskResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateImageExportTaskResponse` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // validate the optional field `ImageExportTask`
        if (jsonObj.get("ImageExportTask") != null
                && !jsonObj.get("ImageExportTask").isJsonNull()) {
            ImageExportTask.validateJsonObject(jsonObj.getAsJsonObject("ImageExportTask"));
        }
        // validate the optional field `ResponseContext`
        if (jsonObj.get("ResponseContext") != null
                && !jsonObj.get("ResponseContext").isJsonNull()) {
            ResponseContext.validateJsonObject(jsonObj.getAsJsonObject("ResponseContext"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateImageExportTaskResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateImageExportTaskResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateImageExportTaskResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CreateImageExportTaskResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateImageExportTaskResponse>() {
                        @Override
                        public void write(JsonWriter out, CreateImageExportTaskResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateImageExportTaskResponse read(JsonReader in)
                                throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateImageExportTaskResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateImageExportTaskResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     CreateImageExportTaskResponse
     */
    public static CreateImageExportTaskResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateImageExportTaskResponse.class);
    }

    /**
     * Convert an instance of CreateImageExportTaskResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

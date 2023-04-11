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

package io.github.outscale.osc_sdk_java.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** ReadVolumesResponse */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadVolumesResponse {
    public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";

    @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
    private ResponseContext responseContext;

    public static final String SERIALIZED_NAME_VOLUMES = "Volumes";

    @SerializedName(SERIALIZED_NAME_VOLUMES)
    private List<Volume> volumes = null;

    public ReadVolumesResponse() {}

    public ReadVolumesResponse responseContext(ResponseContext responseContext) {

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

    public ReadVolumesResponse volumes(List<Volume> volumes) {

        this.volumes = volumes;
        return this;
    }

    public ReadVolumesResponse addVolumesItem(Volume volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    /**
     * Information about one or more volumes.
     *
     * @return volumes
     */
    @javax.annotation.Nullable
    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReadVolumesResponse readVolumesResponse = (ReadVolumesResponse) o;
        return Objects.equals(this.responseContext, readVolumesResponse.responseContext)
                && Objects.equals(this.volumes, readVolumesResponse.volumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseContext, volumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadVolumesResponse {\n");
        sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
        openapiFields.add("ResponseContext");
        openapiFields.add("Volumes");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ReadVolumesResponse
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ReadVolumesResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ReadVolumesResponse is not found in"
                                        + " the empty JSON string",
                                ReadVolumesResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ReadVolumesResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ReadVolumesResponse` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // validate the optional field `ResponseContext`
        if (jsonObj.get("ResponseContext") != null
                && !jsonObj.get("ResponseContext").isJsonNull()) {
            ResponseContext.validateJsonObject(jsonObj.getAsJsonObject("ResponseContext"));
        }
        if (jsonObj.get("Volumes") != null && !jsonObj.get("Volumes").isJsonNull()) {
            JsonArray jsonArrayvolumes = jsonObj.getAsJsonArray("Volumes");
            if (jsonArrayvolumes != null) {
                // ensure the json data is an array
                if (!jsonObj.get("Volumes").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `Volumes` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("Volumes").toString()));
                }

                // validate the optional field `Volumes` (array)
                for (int i = 0; i < jsonArrayvolumes.size(); i++) {
                    Volume.validateJsonObject(jsonArrayvolumes.get(i).getAsJsonObject());
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ReadVolumesResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ReadVolumesResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ReadVolumesResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ReadVolumesResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ReadVolumesResponse>() {
                        @Override
                        public void write(JsonWriter out, ReadVolumesResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ReadVolumesResponse read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ReadVolumesResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ReadVolumesResponse
     * @throws IOException if the JSON string is invalid with respect to ReadVolumesResponse
     */
    public static ReadVolumesResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ReadVolumesResponse.class);
    }

    /**
     * Convert an instance of ReadVolumesResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

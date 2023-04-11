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

/** UpdateSnapshotResponse */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSnapshotResponse {
    public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";

    @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
    private ResponseContext responseContext;

    public static final String SERIALIZED_NAME_SNAPSHOT = "Snapshot";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT)
    private Snapshot snapshot;

    public UpdateSnapshotResponse() {}

    public UpdateSnapshotResponse responseContext(ResponseContext responseContext) {

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

    public UpdateSnapshotResponse snapshot(Snapshot snapshot) {

        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get snapshot
     *
     * @return snapshot
     */
    @javax.annotation.Nullable
    public Snapshot getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSnapshotResponse updateSnapshotResponse = (UpdateSnapshotResponse) o;
        return Objects.equals(this.responseContext, updateSnapshotResponse.responseContext)
                && Objects.equals(this.snapshot, updateSnapshotResponse.snapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseContext, snapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSnapshotResponse {\n");
        sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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
        openapiFields.add("Snapshot");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to UpdateSnapshotResponse
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!UpdateSnapshotResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateSnapshotResponse is not found"
                                        + " in the empty JSON string",
                                UpdateSnapshotResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!UpdateSnapshotResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateSnapshotResponse` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // validate the optional field `ResponseContext`
        if (jsonObj.get("ResponseContext") != null
                && !jsonObj.get("ResponseContext").isJsonNull()) {
            ResponseContext.validateJsonObject(jsonObj.getAsJsonObject("ResponseContext"));
        }
        // validate the optional field `Snapshot`
        if (jsonObj.get("Snapshot") != null && !jsonObj.get("Snapshot").isJsonNull()) {
            Snapshot.validateJsonObject(jsonObj.getAsJsonObject("Snapshot"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateSnapshotResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateSnapshotResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateSnapshotResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateSnapshotResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateSnapshotResponse>() {
                        @Override
                        public void write(JsonWriter out, UpdateSnapshotResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateSnapshotResponse read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateSnapshotResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateSnapshotResponse
     * @throws IOException if the JSON string is invalid with respect to UpdateSnapshotResponse
     */
    public static UpdateSnapshotResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateSnapshotResponse.class);
    }

    /**
     * Convert an instance of UpdateSnapshotResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

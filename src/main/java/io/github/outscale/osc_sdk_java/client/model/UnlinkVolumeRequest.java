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

/** UnlinkVolumeRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnlinkVolumeRequest {
    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_FORCE_UNLINK = "ForceUnlink";

    @SerializedName(SERIALIZED_NAME_FORCE_UNLINK)
    private Boolean forceUnlink;

    public static final String SERIALIZED_NAME_VOLUME_ID = "VolumeId";

    @SerializedName(SERIALIZED_NAME_VOLUME_ID)
    private String volumeId;

    public UnlinkVolumeRequest() {}

    public UnlinkVolumeRequest dryRun(Boolean dryRun) {

        this.dryRun = dryRun;
        return this;
    }

    /**
     * If true, checks whether you have the required permissions to perform the action.
     *
     * @return dryRun
     */
    @javax.annotation.Nullable
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public UnlinkVolumeRequest forceUnlink(Boolean forceUnlink) {

        this.forceUnlink = forceUnlink;
        return this;
    }

    /**
     * Forces the detachment of the volume in case of previous failure. Important: This action may
     * damage your data or file systems.
     *
     * @return forceUnlink
     */
    @javax.annotation.Nullable
    public Boolean getForceUnlink() {
        return forceUnlink;
    }

    public void setForceUnlink(Boolean forceUnlink) {
        this.forceUnlink = forceUnlink;
    }

    public UnlinkVolumeRequest volumeId(String volumeId) {

        this.volumeId = volumeId;
        return this;
    }

    /**
     * The ID of the volume you want to detach.
     *
     * @return volumeId
     */
    @javax.annotation.Nonnull
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnlinkVolumeRequest unlinkVolumeRequest = (UnlinkVolumeRequest) o;
        return Objects.equals(this.dryRun, unlinkVolumeRequest.dryRun)
                && Objects.equals(this.forceUnlink, unlinkVolumeRequest.forceUnlink)
                && Objects.equals(this.volumeId, unlinkVolumeRequest.volumeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, forceUnlink, volumeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnlinkVolumeRequest {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    forceUnlink: ").append(toIndentedString(forceUnlink)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
        openapiFields.add("DryRun");
        openapiFields.add("ForceUnlink");
        openapiFields.add("VolumeId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("VolumeId");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to UnlinkVolumeRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!UnlinkVolumeRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UnlinkVolumeRequest is not found in"
                                        + " the empty JSON string",
                                UnlinkVolumeRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!UnlinkVolumeRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UnlinkVolumeRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UnlinkVolumeRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("VolumeId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VolumeId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VolumeId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UnlinkVolumeRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UnlinkVolumeRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UnlinkVolumeRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UnlinkVolumeRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UnlinkVolumeRequest>() {
                        @Override
                        public void write(JsonWriter out, UnlinkVolumeRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UnlinkVolumeRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UnlinkVolumeRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UnlinkVolumeRequest
     * @throws IOException if the JSON string is invalid with respect to UnlinkVolumeRequest
     */
    public static UnlinkVolumeRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UnlinkVolumeRequest.class);
    }

    /**
     * Convert an instance of UnlinkVolumeRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
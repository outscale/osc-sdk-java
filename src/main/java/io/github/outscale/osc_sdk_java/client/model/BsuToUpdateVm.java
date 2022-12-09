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

/** Information about the BSU volume. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BsuToUpdateVm {
    public static final String SERIALIZED_NAME_DELETE_ON_VM_DELETION = "DeleteOnVmDeletion";

    @SerializedName(SERIALIZED_NAME_DELETE_ON_VM_DELETION)
    private Boolean deleteOnVmDeletion;

    public static final String SERIALIZED_NAME_VOLUME_ID = "VolumeId";

    @SerializedName(SERIALIZED_NAME_VOLUME_ID)
    private String volumeId;

    public BsuToUpdateVm() {}

    public BsuToUpdateVm deleteOnVmDeletion(Boolean deleteOnVmDeletion) {

        this.deleteOnVmDeletion = deleteOnVmDeletion;
        return this;
    }

    /**
     * If set to true, the volume is deleted when terminating the VM. If set to false, the volume is
     * not deleted when terminating the VM.
     *
     * @return deleteOnVmDeletion
     */
    @javax.annotation.Nullable
    public Boolean getDeleteOnVmDeletion() {
        return deleteOnVmDeletion;
    }

    public void setDeleteOnVmDeletion(Boolean deleteOnVmDeletion) {
        this.deleteOnVmDeletion = deleteOnVmDeletion;
    }

    public BsuToUpdateVm volumeId(String volumeId) {

        this.volumeId = volumeId;
        return this;
    }

    /**
     * The ID of the volume.
     *
     * @return volumeId
     */
    @javax.annotation.Nullable
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
        BsuToUpdateVm bsuToUpdateVm = (BsuToUpdateVm) o;
        return Objects.equals(this.deleteOnVmDeletion, bsuToUpdateVm.deleteOnVmDeletion)
                && Objects.equals(this.volumeId, bsuToUpdateVm.volumeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteOnVmDeletion, volumeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BsuToUpdateVm {\n");
        sb.append("    deleteOnVmDeletion: ")
                .append(toIndentedString(deleteOnVmDeletion))
                .append("\n");
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
        openapiFields.add("DeleteOnVmDeletion");
        openapiFields.add("VolumeId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to BsuToUpdateVm
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!BsuToUpdateVm.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in BsuToUpdateVm is not found in the"
                                        + " empty JSON string",
                                BsuToUpdateVm.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!BsuToUpdateVm.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `BsuToUpdateVm` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("VolumeId") != null && !jsonObj.get("VolumeId").isJsonNull())
                && !jsonObj.get("VolumeId").isJsonPrimitive()) {
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
            if (!BsuToUpdateVm.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'BsuToUpdateVm' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BsuToUpdateVm> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(BsuToUpdateVm.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<BsuToUpdateVm>() {
                        @Override
                        public void write(JsonWriter out, BsuToUpdateVm value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public BsuToUpdateVm read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of BsuToUpdateVm given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of BsuToUpdateVm
     * @throws IOException if the JSON string is invalid with respect to BsuToUpdateVm
     */
    public static BsuToUpdateVm fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, BsuToUpdateVm.class);
    }

    /**
     * Convert an instance of BsuToUpdateVm to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

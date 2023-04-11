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

/** CreateVolumeRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateVolumeRequest {
    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_IOPS = "Iops";

    @SerializedName(SERIALIZED_NAME_IOPS)
    private Integer iops;

    public static final String SERIALIZED_NAME_SIZE = "Size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Integer size;

    public static final String SERIALIZED_NAME_SNAPSHOT_ID = "SnapshotId";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
    private String snapshotId;

    public static final String SERIALIZED_NAME_SUBREGION_NAME = "SubregionName";

    @SerializedName(SERIALIZED_NAME_SUBREGION_NAME)
    private String subregionName;

    public static final String SERIALIZED_NAME_VOLUME_TYPE = "VolumeType";

    @SerializedName(SERIALIZED_NAME_VOLUME_TYPE)
    private String volumeType;

    public CreateVolumeRequest() {}

    public CreateVolumeRequest dryRun(Boolean dryRun) {

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

    public CreateVolumeRequest iops(Integer iops) {

        this.iops = iops;
        return this;
    }

    /**
     * The number of I/O operations per second (IOPS). This parameter must be specified only if you
     * create an &#x60;io1&#x60; volume. The maximum number of IOPS allowed for &#x60;io1&#x60;
     * volumes is &#x60;13000&#x60; with a maximum performance ratio of 300 IOPS per gibibyte.
     *
     * @return iops
     */
    @javax.annotation.Nullable
    public Integer getIops() {
        return iops;
    }

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public CreateVolumeRequest size(Integer size) {

        this.size = size;
        return this;
    }

    /**
     * The size of the volume, in gibibytes (GiB). The maximum allowed size for a volume is 14901
     * GiB. This parameter is required if the volume is not created from a snapshot
     * (&#x60;SnapshotId&#x60; unspecified).
     *
     * @return size
     */
    @javax.annotation.Nullable
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public CreateVolumeRequest snapshotId(String snapshotId) {

        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The ID of the snapshot from which you want to create the volume.
     *
     * @return snapshotId
     */
    @javax.annotation.Nullable
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public CreateVolumeRequest subregionName(String subregionName) {

        this.subregionName = subregionName;
        return this;
    }

    /**
     * The Subregion in which you want to create the volume.
     *
     * @return subregionName
     */
    @javax.annotation.Nonnull
    public String getSubregionName() {
        return subregionName;
    }

    public void setSubregionName(String subregionName) {
        this.subregionName = subregionName;
    }

    public CreateVolumeRequest volumeType(String volumeType) {

        this.volumeType = volumeType;
        return this;
    }

    /**
     * The type of volume you want to create (&#x60;io1&#x60; \\| &#x60;gp2&#x60; \\|
     * &#x60;standard&#x60;). If not specified, a &#x60;standard&#x60; volume is created.&lt;br
     * /&gt; For more information about volume types, see [About Volumes &gt; Volume Types and
     * IOPS](https://docs.outscale.com/en/userguide/About-Volumes.html#_volume_types_and_iops).
     *
     * @return volumeType
     */
    @javax.annotation.Nullable
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVolumeRequest createVolumeRequest = (CreateVolumeRequest) o;
        return Objects.equals(this.dryRun, createVolumeRequest.dryRun)
                && Objects.equals(this.iops, createVolumeRequest.iops)
                && Objects.equals(this.size, createVolumeRequest.size)
                && Objects.equals(this.snapshotId, createVolumeRequest.snapshotId)
                && Objects.equals(this.subregionName, createVolumeRequest.subregionName)
                && Objects.equals(this.volumeType, createVolumeRequest.volumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, iops, size, snapshotId, subregionName, volumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVolumeRequest {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    subregionName: ").append(toIndentedString(subregionName)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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
        openapiFields.add("Iops");
        openapiFields.add("Size");
        openapiFields.add("SnapshotId");
        openapiFields.add("SubregionName");
        openapiFields.add("VolumeType");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("SubregionName");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CreateVolumeRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateVolumeRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateVolumeRequest is not found in"
                                        + " the empty JSON string",
                                CreateVolumeRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateVolumeRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateVolumeRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateVolumeRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if ((jsonObj.get("SnapshotId") != null && !jsonObj.get("SnapshotId").isJsonNull())
                && !jsonObj.get("SnapshotId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SnapshotId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SnapshotId").toString()));
        }
        if (!jsonObj.get("SubregionName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubregionName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SubregionName").toString()));
        }
        if ((jsonObj.get("VolumeType") != null && !jsonObj.get("VolumeType").isJsonNull())
                && !jsonObj.get("VolumeType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VolumeType` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VolumeType").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateVolumeRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateVolumeRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateVolumeRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateVolumeRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateVolumeRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateVolumeRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateVolumeRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateVolumeRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateVolumeRequest
     * @throws IOException if the JSON string is invalid with respect to CreateVolumeRequest
     */
    public static CreateVolumeRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateVolumeRequest.class);
    }

    /**
     * Convert an instance of CreateVolumeRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

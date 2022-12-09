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

/** CreateSnapshotRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSnapshotRequest {
    public static final String SERIALIZED_NAME_DESCRIPTION = "Description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_FILE_LOCATION = "FileLocation";

    @SerializedName(SERIALIZED_NAME_FILE_LOCATION)
    private String fileLocation;

    public static final String SERIALIZED_NAME_SNAPSHOT_SIZE = "SnapshotSize";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_SIZE)
    private Long snapshotSize;

    public static final String SERIALIZED_NAME_SOURCE_REGION_NAME = "SourceRegionName";

    @SerializedName(SERIALIZED_NAME_SOURCE_REGION_NAME)
    private String sourceRegionName;

    public static final String SERIALIZED_NAME_SOURCE_SNAPSHOT_ID = "SourceSnapshotId";

    @SerializedName(SERIALIZED_NAME_SOURCE_SNAPSHOT_ID)
    private String sourceSnapshotId;

    public static final String SERIALIZED_NAME_VOLUME_ID = "VolumeId";

    @SerializedName(SERIALIZED_NAME_VOLUME_ID)
    private String volumeId;

    public CreateSnapshotRequest() {}

    public CreateSnapshotRequest description(String description) {

        this.description = description;
        return this;
    }

    /**
     * A description for the snapshot.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSnapshotRequest dryRun(Boolean dryRun) {

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

    public CreateSnapshotRequest fileLocation(String fileLocation) {

        this.fileLocation = fileLocation;
        return this;
    }

    /**
     * (When importing) The pre-signed URL of the snapshot you want to import, or the normal URL of
     * the snapshot if you have permission on the OOS bucket. For more information, see [Configuring
     * a Pre-signed URL](https://docs.outscale.com/en/userguide/Configuring-a-Pre-signed-URL.html)
     * or [Managing Access to Your Buckets and
     * Objects](https://docs.outscale.com/en/userguide/Managing-Access-to-Your-Buckets-and-Objects.html).
     *
     * @return fileLocation
     */
    @javax.annotation.Nullable
    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public CreateSnapshotRequest snapshotSize(Long snapshotSize) {

        this.snapshotSize = snapshotSize;
        return this;
    }

    /**
     * (When importing) The size of the snapshot you want to create in your account, in bytes. This
     * size must be greater than or equal to the size of the original, uncompressed snapshot.
     *
     * @return snapshotSize
     */
    @javax.annotation.Nullable
    public Long getSnapshotSize() {
        return snapshotSize;
    }

    public void setSnapshotSize(Long snapshotSize) {
        this.snapshotSize = snapshotSize;
    }

    public CreateSnapshotRequest sourceRegionName(String sourceRegionName) {

        this.sourceRegionName = sourceRegionName;
        return this;
    }

    /**
     * (When copying) The name of the source Region, which must be the same as the Region of your
     * account.
     *
     * @return sourceRegionName
     */
    @javax.annotation.Nullable
    public String getSourceRegionName() {
        return sourceRegionName;
    }

    public void setSourceRegionName(String sourceRegionName) {
        this.sourceRegionName = sourceRegionName;
    }

    public CreateSnapshotRequest sourceSnapshotId(String sourceSnapshotId) {

        this.sourceSnapshotId = sourceSnapshotId;
        return this;
    }

    /**
     * (When copying) The ID of the snapshot you want to copy.
     *
     * @return sourceSnapshotId
     */
    @javax.annotation.Nullable
    public String getSourceSnapshotId() {
        return sourceSnapshotId;
    }

    public void setSourceSnapshotId(String sourceSnapshotId) {
        this.sourceSnapshotId = sourceSnapshotId;
    }

    public CreateSnapshotRequest volumeId(String volumeId) {

        this.volumeId = volumeId;
        return this;
    }

    /**
     * (When creating) The ID of the volume you want to create a snapshot of.
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
        CreateSnapshotRequest createSnapshotRequest = (CreateSnapshotRequest) o;
        return Objects.equals(this.description, createSnapshotRequest.description)
                && Objects.equals(this.dryRun, createSnapshotRequest.dryRun)
                && Objects.equals(this.fileLocation, createSnapshotRequest.fileLocation)
                && Objects.equals(this.snapshotSize, createSnapshotRequest.snapshotSize)
                && Objects.equals(this.sourceRegionName, createSnapshotRequest.sourceRegionName)
                && Objects.equals(this.sourceSnapshotId, createSnapshotRequest.sourceSnapshotId)
                && Objects.equals(this.volumeId, createSnapshotRequest.volumeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description,
                dryRun,
                fileLocation,
                snapshotSize,
                sourceRegionName,
                sourceSnapshotId,
                volumeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSnapshotRequest {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    fileLocation: ").append(toIndentedString(fileLocation)).append("\n");
        sb.append("    snapshotSize: ").append(toIndentedString(snapshotSize)).append("\n");
        sb.append("    sourceRegionName: ").append(toIndentedString(sourceRegionName)).append("\n");
        sb.append("    sourceSnapshotId: ").append(toIndentedString(sourceSnapshotId)).append("\n");
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
        openapiFields.add("Description");
        openapiFields.add("DryRun");
        openapiFields.add("FileLocation");
        openapiFields.add("SnapshotSize");
        openapiFields.add("SourceRegionName");
        openapiFields.add("SourceSnapshotId");
        openapiFields.add("VolumeId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CreateSnapshotRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateSnapshotRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateSnapshotRequest is not found in"
                                        + " the empty JSON string",
                                CreateSnapshotRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateSnapshotRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateSnapshotRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull())
                && !jsonObj.get("Description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Description").toString()));
        }
        if ((jsonObj.get("FileLocation") != null && !jsonObj.get("FileLocation").isJsonNull())
                && !jsonObj.get("FileLocation").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `FileLocation` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("FileLocation").toString()));
        }
        if ((jsonObj.get("SourceRegionName") != null
                        && !jsonObj.get("SourceRegionName").isJsonNull())
                && !jsonObj.get("SourceRegionName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SourceRegionName` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("SourceRegionName").toString()));
        }
        if ((jsonObj.get("SourceSnapshotId") != null
                        && !jsonObj.get("SourceSnapshotId").isJsonNull())
                && !jsonObj.get("SourceSnapshotId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SourceSnapshotId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("SourceSnapshotId").toString()));
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
            if (!CreateSnapshotRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateSnapshotRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateSnapshotRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateSnapshotRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateSnapshotRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateSnapshotRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateSnapshotRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateSnapshotRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateSnapshotRequest
     * @throws IOException if the JSON string is invalid with respect to CreateSnapshotRequest
     */
    public static CreateSnapshotRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateSnapshotRequest.class);
    }

    /**
     * Convert an instance of CreateSnapshotRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

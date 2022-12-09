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

/** Information about the OMI export task. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OsuExportImageExportTask {
    public static final String SERIALIZED_NAME_DISK_IMAGE_FORMAT = "DiskImageFormat";

    @SerializedName(SERIALIZED_NAME_DISK_IMAGE_FORMAT)
    private String diskImageFormat;

    public static final String SERIALIZED_NAME_OSU_BUCKET = "OsuBucket";

    @SerializedName(SERIALIZED_NAME_OSU_BUCKET)
    private String osuBucket;

    public static final String SERIALIZED_NAME_OSU_MANIFEST_URL = "OsuManifestUrl";

    @SerializedName(SERIALIZED_NAME_OSU_MANIFEST_URL)
    private String osuManifestUrl;

    public static final String SERIALIZED_NAME_OSU_PREFIX = "OsuPrefix";

    @SerializedName(SERIALIZED_NAME_OSU_PREFIX)
    private String osuPrefix;

    public OsuExportImageExportTask() {}

    public OsuExportImageExportTask diskImageFormat(String diskImageFormat) {

        this.diskImageFormat = diskImageFormat;
        return this;
    }

    /**
     * The format of the export disk (&#x60;qcow2&#x60; \\| &#x60;raw&#x60;).
     *
     * @return diskImageFormat
     */
    @javax.annotation.Nonnull
    public String getDiskImageFormat() {
        return diskImageFormat;
    }

    public void setDiskImageFormat(String diskImageFormat) {
        this.diskImageFormat = diskImageFormat;
    }

    public OsuExportImageExportTask osuBucket(String osuBucket) {

        this.osuBucket = osuBucket;
        return this;
    }

    /**
     * The name of the OOS bucket the OMI is exported to.
     *
     * @return osuBucket
     */
    @javax.annotation.Nonnull
    public String getOsuBucket() {
        return osuBucket;
    }

    public void setOsuBucket(String osuBucket) {
        this.osuBucket = osuBucket;
    }

    public OsuExportImageExportTask osuManifestUrl(String osuManifestUrl) {

        this.osuManifestUrl = osuManifestUrl;
        return this;
    }

    /**
     * The URL of the manifest file.
     *
     * @return osuManifestUrl
     */
    @javax.annotation.Nullable
    public String getOsuManifestUrl() {
        return osuManifestUrl;
    }

    public void setOsuManifestUrl(String osuManifestUrl) {
        this.osuManifestUrl = osuManifestUrl;
    }

    public OsuExportImageExportTask osuPrefix(String osuPrefix) {

        this.osuPrefix = osuPrefix;
        return this;
    }

    /**
     * The prefix for the key of the OOS object corresponding to the image.
     *
     * @return osuPrefix
     */
    @javax.annotation.Nullable
    public String getOsuPrefix() {
        return osuPrefix;
    }

    public void setOsuPrefix(String osuPrefix) {
        this.osuPrefix = osuPrefix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OsuExportImageExportTask osuExportImageExportTask = (OsuExportImageExportTask) o;
        return Objects.equals(this.diskImageFormat, osuExportImageExportTask.diskImageFormat)
                && Objects.equals(this.osuBucket, osuExportImageExportTask.osuBucket)
                && Objects.equals(this.osuManifestUrl, osuExportImageExportTask.osuManifestUrl)
                && Objects.equals(this.osuPrefix, osuExportImageExportTask.osuPrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diskImageFormat, osuBucket, osuManifestUrl, osuPrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsuExportImageExportTask {\n");
        sb.append("    diskImageFormat: ").append(toIndentedString(diskImageFormat)).append("\n");
        sb.append("    osuBucket: ").append(toIndentedString(osuBucket)).append("\n");
        sb.append("    osuManifestUrl: ").append(toIndentedString(osuManifestUrl)).append("\n");
        sb.append("    osuPrefix: ").append(toIndentedString(osuPrefix)).append("\n");
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
        openapiFields.add("DiskImageFormat");
        openapiFields.add("OsuBucket");
        openapiFields.add("OsuManifestUrl");
        openapiFields.add("OsuPrefix");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("DiskImageFormat");
        openapiRequiredFields.add("OsuBucket");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to OsuExportImageExportTask
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!OsuExportImageExportTask.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in OsuExportImageExportTask is not found"
                                        + " in the empty JSON string",
                                OsuExportImageExportTask.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!OsuExportImageExportTask.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `OsuExportImageExportTask` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : OsuExportImageExportTask.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("DiskImageFormat").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `DiskImageFormat` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("DiskImageFormat").toString()));
        }
        if (!jsonObj.get("OsuBucket").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `OsuBucket` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("OsuBucket").toString()));
        }
        if ((jsonObj.get("OsuManifestUrl") != null && !jsonObj.get("OsuManifestUrl").isJsonNull())
                && !jsonObj.get("OsuManifestUrl").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `OsuManifestUrl` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("OsuManifestUrl").toString()));
        }
        if ((jsonObj.get("OsuPrefix") != null && !jsonObj.get("OsuPrefix").isJsonNull())
                && !jsonObj.get("OsuPrefix").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `OsuPrefix` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("OsuPrefix").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OsuExportImageExportTask.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OsuExportImageExportTask' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<OsuExportImageExportTask> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(OsuExportImageExportTask.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<OsuExportImageExportTask>() {
                        @Override
                        public void write(JsonWriter out, OsuExportImageExportTask value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public OsuExportImageExportTask read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of OsuExportImageExportTask given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of OsuExportImageExportTask
     * @throws IOException if the JSON string is invalid with respect to OsuExportImageExportTask
     */
    public static OsuExportImageExportTask fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, OsuExportImageExportTask.class);
    }

    /**
     * Convert an instance of OsuExportImageExportTask to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

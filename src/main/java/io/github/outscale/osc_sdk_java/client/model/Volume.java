/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html). ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages. ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).
 *
 * The version of the OpenAPI document: 1.28.7
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Information about the volume. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Volume {
    public static final String SERIALIZED_NAME_CREATION_DATE = "CreationDate";

    @SerializedName(SERIALIZED_NAME_CREATION_DATE)
    private OffsetDateTime creationDate;

    public static final String SERIALIZED_NAME_IOPS = "Iops";

    @SerializedName(SERIALIZED_NAME_IOPS)
    private Integer iops;

    public static final String SERIALIZED_NAME_LINKED_VOLUMES = "LinkedVolumes";

    @SerializedName(SERIALIZED_NAME_LINKED_VOLUMES)
    private List<LinkedVolume> linkedVolumes = null;

    public static final String SERIALIZED_NAME_SIZE = "Size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Integer size;

    public static final String SERIALIZED_NAME_SNAPSHOT_ID = "SnapshotId";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
    private String snapshotId;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_SUBREGION_NAME = "SubregionName";

    @SerializedName(SERIALIZED_NAME_SUBREGION_NAME)
    private String subregionName;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public static final String SERIALIZED_NAME_VOLUME_ID = "VolumeId";

    @SerializedName(SERIALIZED_NAME_VOLUME_ID)
    private String volumeId;

    public static final String SERIALIZED_NAME_VOLUME_TYPE = "VolumeType";

    @SerializedName(SERIALIZED_NAME_VOLUME_TYPE)
    private String volumeType;

    public Volume() {}

    public Volume creationDate(OffsetDateTime creationDate) {

        this.creationDate = creationDate;
        return this;
    }

    /**
     * The date and time of creation of the volume.
     *
     * @return creationDate
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Volume iops(Integer iops) {

        this.iops = iops;
        return this;
    }

    /**
     * The number of I/O operations per second (IOPS):&lt;br /&gt; - For &#x60;io1&#x60; volumes,
     * the number of provisioned IOPS&lt;br /&gt; - For &#x60;gp2&#x60; volumes, the baseline
     * performance of the volume
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

    public Volume linkedVolumes(List<LinkedVolume> linkedVolumes) {

        this.linkedVolumes = linkedVolumes;
        return this;
    }

    public Volume addLinkedVolumesItem(LinkedVolume linkedVolumesItem) {
        if (this.linkedVolumes == null) {
            this.linkedVolumes = new ArrayList<>();
        }
        this.linkedVolumes.add(linkedVolumesItem);
        return this;
    }

    /**
     * Information about your volume attachment.
     *
     * @return linkedVolumes
     */
    @javax.annotation.Nullable
    public List<LinkedVolume> getLinkedVolumes() {
        return linkedVolumes;
    }

    public void setLinkedVolumes(List<LinkedVolume> linkedVolumes) {
        this.linkedVolumes = linkedVolumes;
    }

    public Volume size(Integer size) {

        this.size = size;
        return this;
    }

    /**
     * The size of the volume, in gibibytes (GiB).
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

    public Volume snapshotId(String snapshotId) {

        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The snapshot from which the volume was created.
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

    public Volume state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the volume (&#x60;creating&#x60; \\| &#x60;available&#x60; \\|
     * &#x60;in-use&#x60; \\| &#x60;updating&#x60; \\| &#x60;deleting&#x60; \\| &#x60;error&#x60;).
     *
     * @return state
     */
    @javax.annotation.Nullable
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Volume subregionName(String subregionName) {

        this.subregionName = subregionName;
        return this;
    }

    /**
     * The Subregion in which the volume was created.
     *
     * @return subregionName
     */
    @javax.annotation.Nullable
    public String getSubregionName() {
        return subregionName;
    }

    public void setSubregionName(String subregionName) {
        this.subregionName = subregionName;
    }

    public Volume tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public Volume addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the volume.
     *
     * @return tags
     */
    @javax.annotation.Nullable
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public Volume volumeId(String volumeId) {

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

    public Volume volumeType(String volumeType) {

        this.volumeType = volumeType;
        return this;
    }

    /**
     * The type of the volume (&#x60;standard&#x60; \\| &#x60;gp2&#x60; \\| &#x60;io1&#x60;).
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
        Volume volume = (Volume) o;
        return Objects.equals(this.creationDate, volume.creationDate)
                && Objects.equals(this.iops, volume.iops)
                && Objects.equals(this.linkedVolumes, volume.linkedVolumes)
                && Objects.equals(this.size, volume.size)
                && Objects.equals(this.snapshotId, volume.snapshotId)
                && Objects.equals(this.state, volume.state)
                && Objects.equals(this.subregionName, volume.subregionName)
                && Objects.equals(this.tags, volume.tags)
                && Objects.equals(this.volumeId, volume.volumeId)
                && Objects.equals(this.volumeType, volume.volumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                creationDate,
                iops,
                linkedVolumes,
                size,
                snapshotId,
                state,
                subregionName,
                tags,
                volumeId,
                volumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Volume {\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    linkedVolumes: ").append(toIndentedString(linkedVolumes)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    subregionName: ").append(toIndentedString(subregionName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
        openapiFields.add("CreationDate");
        openapiFields.add("Iops");
        openapiFields.add("LinkedVolumes");
        openapiFields.add("Size");
        openapiFields.add("SnapshotId");
        openapiFields.add("State");
        openapiFields.add("SubregionName");
        openapiFields.add("Tags");
        openapiFields.add("VolumeId");
        openapiFields.add("VolumeType");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Volume
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Volume.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Volume is not found in the empty JSON"
                                        + " string",
                                Volume.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Volume.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Volume`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if (jsonObj.get("LinkedVolumes") != null && !jsonObj.get("LinkedVolumes").isJsonNull()) {
            JsonArray jsonArraylinkedVolumes = jsonObj.getAsJsonArray("LinkedVolumes");
            if (jsonArraylinkedVolumes != null) {
                // ensure the json data is an array
                if (!jsonObj.get("LinkedVolumes").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `LinkedVolumes` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("LinkedVolumes").toString()));
                }

                // validate the optional field `LinkedVolumes` (array)
                for (int i = 0; i < jsonArraylinkedVolumes.size(); i++) {
                    LinkedVolume.validateJsonObject(
                            jsonArraylinkedVolumes.get(i).getAsJsonObject());
                }
                ;
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
        if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull())
                && !jsonObj.get("State").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `State` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("State").toString()));
        }
        if ((jsonObj.get("SubregionName") != null && !jsonObj.get("SubregionName").isJsonNull())
                && !jsonObj.get("SubregionName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubregionName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SubregionName").toString()));
        }
        if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
            JsonArray jsonArraytags = jsonObj.getAsJsonArray("Tags");
            if (jsonArraytags != null) {
                // ensure the json data is an array
                if (!jsonObj.get("Tags").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `Tags` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("Tags").toString()));
                }

                // validate the optional field `Tags` (array)
                for (int i = 0; i < jsonArraytags.size(); i++) {
                    ResourceTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
                }
                ;
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
            if (!Volume.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Volume' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Volume> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Volume.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Volume>() {
                        @Override
                        public void write(JsonWriter out, Volume value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Volume read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Volume given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Volume
     * @throws IOException if the JSON string is invalid with respect to Volume
     */
    public static Volume fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Volume.class);
    }

    /**
     * Convert an instance of Volume to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

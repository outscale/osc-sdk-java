/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/About-the-APIs.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html).  > If you try to sign requests with an invalid access key four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages.  > If you try to sign requests with an invalid password four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).<br /> # Error Codes Reference You can learn more about errors returned by the API in the dedicated [errors page](api-errors.html).
 *
 * The version of the OpenAPI document: 1.30.0
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

/** Information about the BSU volume to create. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BsuToCreate {
    public static final String SERIALIZED_NAME_DELETE_ON_VM_DELETION = "DeleteOnVmDeletion";

    @SerializedName(SERIALIZED_NAME_DELETE_ON_VM_DELETION)
    private Boolean deleteOnVmDeletion = true;

    public static final String SERIALIZED_NAME_IOPS = "Iops";

    @SerializedName(SERIALIZED_NAME_IOPS)
    private Integer iops;

    public static final String SERIALIZED_NAME_SNAPSHOT_ID = "SnapshotId";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
    private String snapshotId;

    public static final String SERIALIZED_NAME_VOLUME_SIZE = "VolumeSize";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE)
    private Integer volumeSize;

    public static final String SERIALIZED_NAME_VOLUME_TYPE = "VolumeType";

    @SerializedName(SERIALIZED_NAME_VOLUME_TYPE)
    private String volumeType;

    public BsuToCreate() {}

    public BsuToCreate deleteOnVmDeletion(Boolean deleteOnVmDeletion) {

        this.deleteOnVmDeletion = deleteOnVmDeletion;
        return this;
    }

    /**
     * By default or if set to true, the volume is deleted when terminating the VM. If false, the
     * volume is not deleted when terminating the VM.
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

    public BsuToCreate iops(Integer iops) {

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

    public BsuToCreate snapshotId(String snapshotId) {

        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The ID of the snapshot used to create the volume.
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

    public BsuToCreate volumeSize(Integer volumeSize) {

        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * The size of the volume, in gibibytes (GiB).&lt;br /&gt; If you specify a snapshot ID, the
     * volume size must be at least equal to the snapshot size.&lt;br /&gt; If you specify a
     * snapshot ID but no volume size, the volume is created with a size similar to the snapshot
     * one.
     *
     * @return volumeSize
     */
    @javax.annotation.Nullable
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    public BsuToCreate volumeType(String volumeType) {

        this.volumeType = volumeType;
        return this;
    }

    /**
     * The type of the volume (&#x60;standard&#x60; \\| &#x60;io1&#x60; \\| &#x60;gp2&#x60;). If not
     * specified in the request, a &#x60;standard&#x60; volume is created.&lt;br /&gt; For more
     * information about volume types, see [About Volumes &gt; Volume Types and
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
        BsuToCreate bsuToCreate = (BsuToCreate) o;
        return Objects.equals(this.deleteOnVmDeletion, bsuToCreate.deleteOnVmDeletion)
                && Objects.equals(this.iops, bsuToCreate.iops)
                && Objects.equals(this.snapshotId, bsuToCreate.snapshotId)
                && Objects.equals(this.volumeSize, bsuToCreate.volumeSize)
                && Objects.equals(this.volumeType, bsuToCreate.volumeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteOnVmDeletion, iops, snapshotId, volumeSize, volumeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BsuToCreate {\n");
        sb.append("    deleteOnVmDeletion: ")
                .append(toIndentedString(deleteOnVmDeletion))
                .append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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
        openapiFields.add("DeleteOnVmDeletion");
        openapiFields.add("Iops");
        openapiFields.add("SnapshotId");
        openapiFields.add("VolumeSize");
        openapiFields.add("VolumeType");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to BsuToCreate
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!BsuToCreate.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in BsuToCreate is not found in the empty"
                                        + " JSON string",
                                BsuToCreate.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!BsuToCreate.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `BsuToCreate` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
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
            if (!BsuToCreate.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'BsuToCreate' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BsuToCreate> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(BsuToCreate.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<BsuToCreate>() {
                        @Override
                        public void write(JsonWriter out, BsuToCreate value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public BsuToCreate read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of BsuToCreate given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of BsuToCreate
     * @throws IOException if the JSON string is invalid with respect to BsuToCreate
     */
    public static BsuToCreate fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, BsuToCreate.class);
    }

    /**
     * Convert an instance of BsuToCreate to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

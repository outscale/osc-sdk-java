/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html). ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages. ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).
 *
 * The version of the OpenAPI document: 1.28.5
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

/** Information about volume attachment. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkedVolume {
    public static final String SERIALIZED_NAME_DELETE_ON_VM_DELETION = "DeleteOnVmDeletion";

    @SerializedName(SERIALIZED_NAME_DELETE_ON_VM_DELETION)
    private Boolean deleteOnVmDeletion;

    public static final String SERIALIZED_NAME_DEVICE_NAME = "DeviceName";

    @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
    private String deviceName;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_VM_ID = "VmId";

    @SerializedName(SERIALIZED_NAME_VM_ID)
    private String vmId;

    public static final String SERIALIZED_NAME_VOLUME_ID = "VolumeId";

    @SerializedName(SERIALIZED_NAME_VOLUME_ID)
    private String volumeId;

    public LinkedVolume() {}

    public LinkedVolume deleteOnVmDeletion(Boolean deleteOnVmDeletion) {

        this.deleteOnVmDeletion = deleteOnVmDeletion;
        return this;
    }

    /**
     * If true, the volume is deleted when terminating the VM. If false, the volume is not deleted
     * when terminating the VM.
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

    public LinkedVolume deviceName(String deviceName) {

        this.deviceName = deviceName;
        return this;
    }

    /**
     * The name of the device.
     *
     * @return deviceName
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public LinkedVolume state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the attachment of the volume (&#x60;attaching&#x60; \\| &#x60;detaching&#x60;
     * \\| &#x60;attached&#x60; \\| &#x60;detached&#x60;).
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

    public LinkedVolume vmId(String vmId) {

        this.vmId = vmId;
        return this;
    }

    /**
     * The ID of the VM.
     *
     * @return vmId
     */
    @javax.annotation.Nullable
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public LinkedVolume volumeId(String volumeId) {

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
        LinkedVolume linkedVolume = (LinkedVolume) o;
        return Objects.equals(this.deleteOnVmDeletion, linkedVolume.deleteOnVmDeletion)
                && Objects.equals(this.deviceName, linkedVolume.deviceName)
                && Objects.equals(this.state, linkedVolume.state)
                && Objects.equals(this.vmId, linkedVolume.vmId)
                && Objects.equals(this.volumeId, linkedVolume.volumeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteOnVmDeletion, deviceName, state, vmId, volumeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkedVolume {\n");
        sb.append("    deleteOnVmDeletion: ")
                .append(toIndentedString(deleteOnVmDeletion))
                .append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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
        openapiFields.add("DeviceName");
        openapiFields.add("State");
        openapiFields.add("VmId");
        openapiFields.add("VolumeId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to LinkedVolume
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!LinkedVolume.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in LinkedVolume is not found in the"
                                        + " empty JSON string",
                                LinkedVolume.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!LinkedVolume.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `LinkedVolume` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("DeviceName") != null && !jsonObj.get("DeviceName").isJsonNull())
                && !jsonObj.get("DeviceName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `DeviceName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("DeviceName").toString()));
        }
        if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull())
                && !jsonObj.get("State").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `State` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("State").toString()));
        }
        if ((jsonObj.get("VmId") != null && !jsonObj.get("VmId").isJsonNull())
                && !jsonObj.get("VmId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VmId").toString()));
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
            if (!LinkedVolume.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LinkedVolume' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LinkedVolume> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(LinkedVolume.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<LinkedVolume>() {
                        @Override
                        public void write(JsonWriter out, LinkedVolume value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public LinkedVolume read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of LinkedVolume given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LinkedVolume
     * @throws IOException if the JSON string is invalid with respect to LinkedVolume
     */
    public static LinkedVolume fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LinkedVolume.class);
    }

    /**
     * Convert an instance of LinkedVolume to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

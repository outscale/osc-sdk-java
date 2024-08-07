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

/** Information about the states of the VMs. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VmStates {
    public static final String SERIALIZED_NAME_MAINTENANCE_EVENTS = "MaintenanceEvents";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_EVENTS)
    private List<MaintenanceEvent> maintenanceEvents = null;

    public static final String SERIALIZED_NAME_SUBREGION_NAME = "SubregionName";

    @SerializedName(SERIALIZED_NAME_SUBREGION_NAME)
    private String subregionName;

    public static final String SERIALIZED_NAME_VM_ID = "VmId";

    @SerializedName(SERIALIZED_NAME_VM_ID)
    private String vmId;

    public static final String SERIALIZED_NAME_VM_STATE = "VmState";

    @SerializedName(SERIALIZED_NAME_VM_STATE)
    private String vmState;

    public VmStates() {}

    public VmStates maintenanceEvents(List<MaintenanceEvent> maintenanceEvents) {

        this.maintenanceEvents = maintenanceEvents;
        return this;
    }

    public VmStates addMaintenanceEventsItem(MaintenanceEvent maintenanceEventsItem) {
        if (this.maintenanceEvents == null) {
            this.maintenanceEvents = new ArrayList<>();
        }
        this.maintenanceEvents.add(maintenanceEventsItem);
        return this;
    }

    /**
     * One or more scheduled events associated with the VM.
     *
     * @return maintenanceEvents
     */
    @javax.annotation.Nullable
    public List<MaintenanceEvent> getMaintenanceEvents() {
        return maintenanceEvents;
    }

    public void setMaintenanceEvents(List<MaintenanceEvent> maintenanceEvents) {
        this.maintenanceEvents = maintenanceEvents;
    }

    public VmStates subregionName(String subregionName) {

        this.subregionName = subregionName;
        return this;
    }

    /**
     * The name of the Subregion of the VM.
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

    public VmStates vmId(String vmId) {

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

    public VmStates vmState(String vmState) {

        this.vmState = vmState;
        return this;
    }

    /**
     * The state of the VM (&#x60;pending&#x60; \\| &#x60;running&#x60; \\| &#x60;stopping&#x60; \\|
     * &#x60;stopped&#x60; \\| &#x60;shutting-down&#x60; \\| &#x60;terminated&#x60; \\|
     * &#x60;quarantine&#x60;).
     *
     * @return vmState
     */
    @javax.annotation.Nullable
    public String getVmState() {
        return vmState;
    }

    public void setVmState(String vmState) {
        this.vmState = vmState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmStates vmStates = (VmStates) o;
        return Objects.equals(this.maintenanceEvents, vmStates.maintenanceEvents)
                && Objects.equals(this.subregionName, vmStates.subregionName)
                && Objects.equals(this.vmId, vmStates.vmId)
                && Objects.equals(this.vmState, vmStates.vmState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maintenanceEvents, subregionName, vmId, vmState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmStates {\n");
        sb.append("    maintenanceEvents: ")
                .append(toIndentedString(maintenanceEvents))
                .append("\n");
        sb.append("    subregionName: ").append(toIndentedString(subregionName)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
        sb.append("    vmState: ").append(toIndentedString(vmState)).append("\n");
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
        openapiFields.add("MaintenanceEvents");
        openapiFields.add("SubregionName");
        openapiFields.add("VmId");
        openapiFields.add("VmState");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to VmStates
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!VmStates.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VmStates is not found in the empty"
                                        + " JSON string",
                                VmStates.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!VmStates.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `VmStates` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if (jsonObj.get("MaintenanceEvents") != null
                && !jsonObj.get("MaintenanceEvents").isJsonNull()) {
            JsonArray jsonArraymaintenanceEvents = jsonObj.getAsJsonArray("MaintenanceEvents");
            if (jsonArraymaintenanceEvents != null) {
                // ensure the json data is an array
                if (!jsonObj.get("MaintenanceEvents").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `MaintenanceEvents` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("MaintenanceEvents").toString()));
                }

                // validate the optional field `MaintenanceEvents` (array)
                for (int i = 0; i < jsonArraymaintenanceEvents.size(); i++) {
                    MaintenanceEvent.validateJsonObject(
                            jsonArraymaintenanceEvents.get(i).getAsJsonObject());
                }
                ;
            }
        }
        if ((jsonObj.get("SubregionName") != null && !jsonObj.get("SubregionName").isJsonNull())
                && !jsonObj.get("SubregionName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubregionName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SubregionName").toString()));
        }
        if ((jsonObj.get("VmId") != null && !jsonObj.get("VmId").isJsonNull())
                && !jsonObj.get("VmId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VmId").toString()));
        }
        if ((jsonObj.get("VmState") != null && !jsonObj.get("VmState").isJsonNull())
                && !jsonObj.get("VmState").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmState` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VmState").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VmStates.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VmStates' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VmStates> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VmStates.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VmStates>() {
                        @Override
                        public void write(JsonWriter out, VmStates value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VmStates read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VmStates given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VmStates
     * @throws IOException if the JSON string is invalid with respect to VmStates
     */
    public static VmStates fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VmStates.class);
    }

    /**
     * Convert an instance of VmStates to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

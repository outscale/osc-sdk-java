/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.24
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

/** Information about the state of the VM. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VmState {
    public static final String SERIALIZED_NAME_CURRENT_STATE = "CurrentState";

    @SerializedName(SERIALIZED_NAME_CURRENT_STATE)
    private String currentState;

    public static final String SERIALIZED_NAME_PREVIOUS_STATE = "PreviousState";

    @SerializedName(SERIALIZED_NAME_PREVIOUS_STATE)
    private String previousState;

    public static final String SERIALIZED_NAME_VM_ID = "VmId";

    @SerializedName(SERIALIZED_NAME_VM_ID)
    private String vmId;

    public VmState() {}

    public VmState currentState(String currentState) {

        this.currentState = currentState;
        return this;
    }

    /**
     * The current state of the VM (&#x60;InService&#x60; \\| &#x60;OutOfService&#x60; \\|
     * &#x60;Unknown&#x60;).
     *
     * @return currentState
     */
    @javax.annotation.Nullable
    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public VmState previousState(String previousState) {

        this.previousState = previousState;
        return this;
    }

    /**
     * The previous state of the VM (&#x60;InService&#x60; \\| &#x60;OutOfService&#x60; \\|
     * &#x60;Unknown&#x60;).
     *
     * @return previousState
     */
    @javax.annotation.Nullable
    public String getPreviousState() {
        return previousState;
    }

    public void setPreviousState(String previousState) {
        this.previousState = previousState;
    }

    public VmState vmId(String vmId) {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmState vmState = (VmState) o;
        return Objects.equals(this.currentState, vmState.currentState)
                && Objects.equals(this.previousState, vmState.previousState)
                && Objects.equals(this.vmId, vmState.vmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentState, previousState, vmId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmState {\n");
        sb.append("    currentState: ").append(toIndentedString(currentState)).append("\n");
        sb.append("    previousState: ").append(toIndentedString(previousState)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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
        openapiFields.add("CurrentState");
        openapiFields.add("PreviousState");
        openapiFields.add("VmId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to VmState
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!VmState.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VmState is not found in the empty"
                                        + " JSON string",
                                VmState.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!VmState.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `VmState`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("CurrentState") != null && !jsonObj.get("CurrentState").isJsonNull())
                && !jsonObj.get("CurrentState").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CurrentState` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("CurrentState").toString()));
        }
        if ((jsonObj.get("PreviousState") != null && !jsonObj.get("PreviousState").isJsonNull())
                && !jsonObj.get("PreviousState").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PreviousState` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PreviousState").toString()));
        }
        if ((jsonObj.get("VmId") != null && !jsonObj.get("VmId").isJsonNull())
                && !jsonObj.get("VmId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VmId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VmState.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VmState' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VmState> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VmState.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VmState>() {
                        @Override
                        public void write(JsonWriter out, VmState value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VmState read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VmState given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VmState
     * @throws IOException if the JSON string is invalid with respect to VmState
     */
    public static VmState fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VmState.class);
    }

    /**
     * Convert an instance of VmState to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

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

/** ReadVmsStateResponse */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadVmsStateResponse {
    public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";

    @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
    private ResponseContext responseContext;

    public static final String SERIALIZED_NAME_VM_STATES = "VmStates";

    @SerializedName(SERIALIZED_NAME_VM_STATES)
    private List<VmStates> vmStates = null;

    public ReadVmsStateResponse() {}

    public ReadVmsStateResponse responseContext(ResponseContext responseContext) {

        this.responseContext = responseContext;
        return this;
    }

    /**
     * Get responseContext
     *
     * @return responseContext
     */
    @javax.annotation.Nullable
    public ResponseContext getResponseContext() {
        return responseContext;
    }

    public void setResponseContext(ResponseContext responseContext) {
        this.responseContext = responseContext;
    }

    public ReadVmsStateResponse vmStates(List<VmStates> vmStates) {

        this.vmStates = vmStates;
        return this;
    }

    public ReadVmsStateResponse addVmStatesItem(VmStates vmStatesItem) {
        if (this.vmStates == null) {
            this.vmStates = new ArrayList<>();
        }
        this.vmStates.add(vmStatesItem);
        return this;
    }

    /**
     * Information about one or more VM states.
     *
     * @return vmStates
     */
    @javax.annotation.Nullable
    public List<VmStates> getVmStates() {
        return vmStates;
    }

    public void setVmStates(List<VmStates> vmStates) {
        this.vmStates = vmStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReadVmsStateResponse readVmsStateResponse = (ReadVmsStateResponse) o;
        return Objects.equals(this.responseContext, readVmsStateResponse.responseContext)
                && Objects.equals(this.vmStates, readVmsStateResponse.vmStates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseContext, vmStates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadVmsStateResponse {\n");
        sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
        sb.append("    vmStates: ").append(toIndentedString(vmStates)).append("\n");
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
        openapiFields.add("ResponseContext");
        openapiFields.add("VmStates");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ReadVmsStateResponse
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ReadVmsStateResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ReadVmsStateResponse is not found in"
                                        + " the empty JSON string",
                                ReadVmsStateResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ReadVmsStateResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ReadVmsStateResponse` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // validate the optional field `ResponseContext`
        if (jsonObj.get("ResponseContext") != null
                && !jsonObj.get("ResponseContext").isJsonNull()) {
            ResponseContext.validateJsonObject(jsonObj.getAsJsonObject("ResponseContext"));
        }
        if (jsonObj.get("VmStates") != null && !jsonObj.get("VmStates").isJsonNull()) {
            JsonArray jsonArrayvmStates = jsonObj.getAsJsonArray("VmStates");
            if (jsonArrayvmStates != null) {
                // ensure the json data is an array
                if (!jsonObj.get("VmStates").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `VmStates` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("VmStates").toString()));
                }

                // validate the optional field `VmStates` (array)
                for (int i = 0; i < jsonArrayvmStates.size(); i++) {
                    VmStates.validateJsonObject(jsonArrayvmStates.get(i).getAsJsonObject());
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ReadVmsStateResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ReadVmsStateResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ReadVmsStateResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ReadVmsStateResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ReadVmsStateResponse>() {
                        @Override
                        public void write(JsonWriter out, ReadVmsStateResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ReadVmsStateResponse read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ReadVmsStateResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ReadVmsStateResponse
     * @throws IOException if the JSON string is invalid with respect to ReadVmsStateResponse
     */
    public static ReadVmsStateResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ReadVmsStateResponse.class);
    }

    /**
     * Convert an instance of ReadVmsStateResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

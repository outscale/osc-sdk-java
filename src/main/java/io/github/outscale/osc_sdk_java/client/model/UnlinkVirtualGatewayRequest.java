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

/** UnlinkVirtualGatewayRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnlinkVirtualGatewayRequest {
    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_NET_ID = "NetId";

    @SerializedName(SERIALIZED_NAME_NET_ID)
    private String netId;

    public static final String SERIALIZED_NAME_VIRTUAL_GATEWAY_ID = "VirtualGatewayId";

    @SerializedName(SERIALIZED_NAME_VIRTUAL_GATEWAY_ID)
    private String virtualGatewayId;

    public UnlinkVirtualGatewayRequest() {}

    public UnlinkVirtualGatewayRequest dryRun(Boolean dryRun) {

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

    public UnlinkVirtualGatewayRequest netId(String netId) {

        this.netId = netId;
        return this;
    }

    /**
     * The ID of the Net from which you want to detach the virtual gateway.
     *
     * @return netId
     */
    @javax.annotation.Nonnull
    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public UnlinkVirtualGatewayRequest virtualGatewayId(String virtualGatewayId) {

        this.virtualGatewayId = virtualGatewayId;
        return this;
    }

    /**
     * The ID of the virtual gateway.
     *
     * @return virtualGatewayId
     */
    @javax.annotation.Nonnull
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnlinkVirtualGatewayRequest unlinkVirtualGatewayRequest = (UnlinkVirtualGatewayRequest) o;
        return Objects.equals(this.dryRun, unlinkVirtualGatewayRequest.dryRun)
                && Objects.equals(this.netId, unlinkVirtualGatewayRequest.netId)
                && Objects.equals(
                        this.virtualGatewayId, unlinkVirtualGatewayRequest.virtualGatewayId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, netId, virtualGatewayId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnlinkVirtualGatewayRequest {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
        sb.append("    virtualGatewayId: ").append(toIndentedString(virtualGatewayId)).append("\n");
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
        openapiFields.add("NetId");
        openapiFields.add("VirtualGatewayId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("NetId");
        openapiRequiredFields.add("VirtualGatewayId");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to UnlinkVirtualGatewayRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!UnlinkVirtualGatewayRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UnlinkVirtualGatewayRequest is not"
                                        + " found in the empty JSON string",
                                UnlinkVirtualGatewayRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!UnlinkVirtualGatewayRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UnlinkVirtualGatewayRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UnlinkVirtualGatewayRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("NetId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NetId").toString()));
        }
        if (!jsonObj.get("VirtualGatewayId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VirtualGatewayId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("VirtualGatewayId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UnlinkVirtualGatewayRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UnlinkVirtualGatewayRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UnlinkVirtualGatewayRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UnlinkVirtualGatewayRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UnlinkVirtualGatewayRequest>() {
                        @Override
                        public void write(JsonWriter out, UnlinkVirtualGatewayRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UnlinkVirtualGatewayRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UnlinkVirtualGatewayRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UnlinkVirtualGatewayRequest
     * @throws IOException if the JSON string is invalid with respect to UnlinkVirtualGatewayRequest
     */
    public static UnlinkVirtualGatewayRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UnlinkVirtualGatewayRequest.class);
    }

    /**
     * Convert an instance of UnlinkVirtualGatewayRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

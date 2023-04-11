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

/** LinkVirtualGatewayRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkVirtualGatewayRequest {
    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_NET_ID = "NetId";

    @SerializedName(SERIALIZED_NAME_NET_ID)
    private String netId;

    public static final String SERIALIZED_NAME_VIRTUAL_GATEWAY_ID = "VirtualGatewayId";

    @SerializedName(SERIALIZED_NAME_VIRTUAL_GATEWAY_ID)
    private String virtualGatewayId;

    public LinkVirtualGatewayRequest() {}

    public LinkVirtualGatewayRequest dryRun(Boolean dryRun) {

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

    public LinkVirtualGatewayRequest netId(String netId) {

        this.netId = netId;
        return this;
    }

    /**
     * The ID of the Net to which you want to attach the virtual gateway.
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

    public LinkVirtualGatewayRequest virtualGatewayId(String virtualGatewayId) {

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
        LinkVirtualGatewayRequest linkVirtualGatewayRequest = (LinkVirtualGatewayRequest) o;
        return Objects.equals(this.dryRun, linkVirtualGatewayRequest.dryRun)
                && Objects.equals(this.netId, linkVirtualGatewayRequest.netId)
                && Objects.equals(
                        this.virtualGatewayId, linkVirtualGatewayRequest.virtualGatewayId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, netId, virtualGatewayId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkVirtualGatewayRequest {\n");
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
     * @throws IOException if the JSON Object is invalid with respect to LinkVirtualGatewayRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!LinkVirtualGatewayRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in LinkVirtualGatewayRequest is not"
                                        + " found in the empty JSON string",
                                LinkVirtualGatewayRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!LinkVirtualGatewayRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `LinkVirtualGatewayRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : LinkVirtualGatewayRequest.openapiRequiredFields) {
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
            if (!LinkVirtualGatewayRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LinkVirtualGatewayRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LinkVirtualGatewayRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(LinkVirtualGatewayRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<LinkVirtualGatewayRequest>() {
                        @Override
                        public void write(JsonWriter out, LinkVirtualGatewayRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public LinkVirtualGatewayRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of LinkVirtualGatewayRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LinkVirtualGatewayRequest
     * @throws IOException if the JSON string is invalid with respect to LinkVirtualGatewayRequest
     */
    public static LinkVirtualGatewayRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LinkVirtualGatewayRequest.class);
    }

    /**
     * Convert an instance of LinkVirtualGatewayRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

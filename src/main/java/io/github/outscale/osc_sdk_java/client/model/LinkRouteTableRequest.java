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

/** LinkRouteTableRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkRouteTableRequest {
    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_ROUTE_TABLE_ID = "RouteTableId";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLE_ID)
    private String routeTableId;

    public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";

    @SerializedName(SERIALIZED_NAME_SUBNET_ID)
    private String subnetId;

    public LinkRouteTableRequest() {}

    public LinkRouteTableRequest dryRun(Boolean dryRun) {

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

    public LinkRouteTableRequest routeTableId(String routeTableId) {

        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * The ID of the route table.
     *
     * @return routeTableId
     */
    @javax.annotation.Nonnull
    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public LinkRouteTableRequest subnetId(String subnetId) {

        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ID of the Subnet.
     *
     * @return subnetId
     */
    @javax.annotation.Nonnull
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkRouteTableRequest linkRouteTableRequest = (LinkRouteTableRequest) o;
        return Objects.equals(this.dryRun, linkRouteTableRequest.dryRun)
                && Objects.equals(this.routeTableId, linkRouteTableRequest.routeTableId)
                && Objects.equals(this.subnetId, linkRouteTableRequest.subnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, routeTableId, subnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkRouteTableRequest {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
        openapiFields.add("RouteTableId");
        openapiFields.add("SubnetId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("RouteTableId");
        openapiRequiredFields.add("SubnetId");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to LinkRouteTableRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!LinkRouteTableRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in LinkRouteTableRequest is not found in"
                                        + " the empty JSON string",
                                LinkRouteTableRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!LinkRouteTableRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `LinkRouteTableRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : LinkRouteTableRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("RouteTableId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteTableId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("RouteTableId").toString()));
        }
        if (!jsonObj.get("SubnetId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubnetId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SubnetId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LinkRouteTableRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LinkRouteTableRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LinkRouteTableRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(LinkRouteTableRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<LinkRouteTableRequest>() {
                        @Override
                        public void write(JsonWriter out, LinkRouteTableRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public LinkRouteTableRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of LinkRouteTableRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LinkRouteTableRequest
     * @throws IOException if the JSON string is invalid with respect to LinkRouteTableRequest
     */
    public static LinkRouteTableRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LinkRouteTableRequest.class);
    }

    /**
     * Convert an instance of LinkRouteTableRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

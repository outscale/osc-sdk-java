/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.25
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

/** One or more associations between the route table and the Subnets. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkRouteTable {
    public static final String SERIALIZED_NAME_LINK_ROUTE_TABLE_ID = "LinkRouteTableId";

    @SerializedName(SERIALIZED_NAME_LINK_ROUTE_TABLE_ID)
    private String linkRouteTableId;

    public static final String SERIALIZED_NAME_MAIN = "Main";

    @SerializedName(SERIALIZED_NAME_MAIN)
    private Boolean main;

    public static final String SERIALIZED_NAME_ROUTE_TABLE_ID = "RouteTableId";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLE_ID)
    private String routeTableId;

    public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";

    @SerializedName(SERIALIZED_NAME_SUBNET_ID)
    private String subnetId;

    public LinkRouteTable() {}

    public LinkRouteTable linkRouteTableId(String linkRouteTableId) {

        this.linkRouteTableId = linkRouteTableId;
        return this;
    }

    /**
     * The ID of the association between the route table and the Subnet.
     *
     * @return linkRouteTableId
     */
    @javax.annotation.Nullable
    public String getLinkRouteTableId() {
        return linkRouteTableId;
    }

    public void setLinkRouteTableId(String linkRouteTableId) {
        this.linkRouteTableId = linkRouteTableId;
    }

    public LinkRouteTable main(Boolean main) {

        this.main = main;
        return this;
    }

    /**
     * If true, the route table is the main one.
     *
     * @return main
     */
    @javax.annotation.Nullable
    public Boolean getMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    public LinkRouteTable routeTableId(String routeTableId) {

        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * The ID of the route table.
     *
     * @return routeTableId
     */
    @javax.annotation.Nullable
    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public LinkRouteTable subnetId(String subnetId) {

        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ID of the Subnet.
     *
     * @return subnetId
     */
    @javax.annotation.Nullable
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
        LinkRouteTable linkRouteTable = (LinkRouteTable) o;
        return Objects.equals(this.linkRouteTableId, linkRouteTable.linkRouteTableId)
                && Objects.equals(this.main, linkRouteTable.main)
                && Objects.equals(this.routeTableId, linkRouteTable.routeTableId)
                && Objects.equals(this.subnetId, linkRouteTable.subnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkRouteTableId, main, routeTableId, subnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkRouteTable {\n");
        sb.append("    linkRouteTableId: ").append(toIndentedString(linkRouteTableId)).append("\n");
        sb.append("    main: ").append(toIndentedString(main)).append("\n");
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
        openapiFields.add("LinkRouteTableId");
        openapiFields.add("Main");
        openapiFields.add("RouteTableId");
        openapiFields.add("SubnetId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to LinkRouteTable
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!LinkRouteTable.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in LinkRouteTable is not found in the"
                                        + " empty JSON string",
                                LinkRouteTable.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!LinkRouteTable.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `LinkRouteTable` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("LinkRouteTableId") != null
                        && !jsonObj.get("LinkRouteTableId").isJsonNull())
                && !jsonObj.get("LinkRouteTableId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LinkRouteTableId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("LinkRouteTableId").toString()));
        }
        if ((jsonObj.get("RouteTableId") != null && !jsonObj.get("RouteTableId").isJsonNull())
                && !jsonObj.get("RouteTableId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteTableId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("RouteTableId").toString()));
        }
        if ((jsonObj.get("SubnetId") != null && !jsonObj.get("SubnetId").isJsonNull())
                && !jsonObj.get("SubnetId").isJsonPrimitive()) {
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
            if (!LinkRouteTable.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LinkRouteTable' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LinkRouteTable> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(LinkRouteTable.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<LinkRouteTable>() {
                        @Override
                        public void write(JsonWriter out, LinkRouteTable value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public LinkRouteTable read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of LinkRouteTable given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LinkRouteTable
     * @throws IOException if the JSON string is invalid with respect to LinkRouteTable
     */
    public static LinkRouteTable fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LinkRouteTable.class);
    }

    /**
     * Convert an instance of LinkRouteTable to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

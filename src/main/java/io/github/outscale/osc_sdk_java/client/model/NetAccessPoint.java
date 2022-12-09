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

/** Information about the Net access point. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetAccessPoint {
    public static final String SERIALIZED_NAME_NET_ACCESS_POINT_ID = "NetAccessPointId";

    @SerializedName(SERIALIZED_NAME_NET_ACCESS_POINT_ID)
    private String netAccessPointId;

    public static final String SERIALIZED_NAME_NET_ID = "NetId";

    @SerializedName(SERIALIZED_NAME_NET_ID)
    private String netId;

    public static final String SERIALIZED_NAME_ROUTE_TABLE_IDS = "RouteTableIds";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLE_IDS)
    private List<String> routeTableIds = null;

    public static final String SERIALIZED_NAME_SERVICE_NAME = "ServiceName";

    @SerializedName(SERIALIZED_NAME_SERVICE_NAME)
    private String serviceName;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public NetAccessPoint() {}

    public NetAccessPoint netAccessPointId(String netAccessPointId) {

        this.netAccessPointId = netAccessPointId;
        return this;
    }

    /**
     * The ID of the Net access point.
     *
     * @return netAccessPointId
     */
    @javax.annotation.Nullable
    public String getNetAccessPointId() {
        return netAccessPointId;
    }

    public void setNetAccessPointId(String netAccessPointId) {
        this.netAccessPointId = netAccessPointId;
    }

    public NetAccessPoint netId(String netId) {

        this.netId = netId;
        return this;
    }

    /**
     * The ID of the Net with which the Net access point is associated.
     *
     * @return netId
     */
    @javax.annotation.Nullable
    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public NetAccessPoint routeTableIds(List<String> routeTableIds) {

        this.routeTableIds = routeTableIds;
        return this;
    }

    public NetAccessPoint addRouteTableIdsItem(String routeTableIdsItem) {
        if (this.routeTableIds == null) {
            this.routeTableIds = new ArrayList<>();
        }
        this.routeTableIds.add(routeTableIdsItem);
        return this;
    }

    /**
     * The ID of the route tables associated with the Net access point.
     *
     * @return routeTableIds
     */
    @javax.annotation.Nullable
    public List<String> getRouteTableIds() {
        return routeTableIds;
    }

    public void setRouteTableIds(List<String> routeTableIds) {
        this.routeTableIds = routeTableIds;
    }

    public NetAccessPoint serviceName(String serviceName) {

        this.serviceName = serviceName;
        return this;
    }

    /**
     * The name of the service with which the Net access point is associated.
     *
     * @return serviceName
     */
    @javax.annotation.Nullable
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public NetAccessPoint state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the Net access point (&#x60;pending&#x60; \\| &#x60;available&#x60; \\|
     * &#x60;deleting&#x60; \\| &#x60;deleted&#x60;).
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

    public NetAccessPoint tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public NetAccessPoint addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the Net access point.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetAccessPoint netAccessPoint = (NetAccessPoint) o;
        return Objects.equals(this.netAccessPointId, netAccessPoint.netAccessPointId)
                && Objects.equals(this.netId, netAccessPoint.netId)
                && Objects.equals(this.routeTableIds, netAccessPoint.routeTableIds)
                && Objects.equals(this.serviceName, netAccessPoint.serviceName)
                && Objects.equals(this.state, netAccessPoint.state)
                && Objects.equals(this.tags, netAccessPoint.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(netAccessPointId, netId, routeTableIds, serviceName, state, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetAccessPoint {\n");
        sb.append("    netAccessPointId: ").append(toIndentedString(netAccessPointId)).append("\n");
        sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
        sb.append("    routeTableIds: ").append(toIndentedString(routeTableIds)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
        openapiFields.add("NetAccessPointId");
        openapiFields.add("NetId");
        openapiFields.add("RouteTableIds");
        openapiFields.add("ServiceName");
        openapiFields.add("State");
        openapiFields.add("Tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to NetAccessPoint
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!NetAccessPoint.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in NetAccessPoint is not found in the"
                                        + " empty JSON string",
                                NetAccessPoint.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!NetAccessPoint.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `NetAccessPoint` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("NetAccessPointId") != null
                        && !jsonObj.get("NetAccessPointId").isJsonNull())
                && !jsonObj.get("NetAccessPointId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetAccessPointId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("NetAccessPointId").toString()));
        }
        if ((jsonObj.get("NetId") != null && !jsonObj.get("NetId").isJsonNull())
                && !jsonObj.get("NetId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NetId").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("RouteTableIds") != null && !jsonObj.get("RouteTableIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteTableIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("RouteTableIds").toString()));
        }
        if ((jsonObj.get("ServiceName") != null && !jsonObj.get("ServiceName").isJsonNull())
                && !jsonObj.get("ServiceName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ServiceName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ServiceName").toString()));
        }
        if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull())
                && !jsonObj.get("State").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `State` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("State").toString()));
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!NetAccessPoint.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'NetAccessPoint' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NetAccessPoint> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(NetAccessPoint.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<NetAccessPoint>() {
                        @Override
                        public void write(JsonWriter out, NetAccessPoint value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public NetAccessPoint read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of NetAccessPoint given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of NetAccessPoint
     * @throws IOException if the JSON string is invalid with respect to NetAccessPoint
     */
    public static NetAccessPoint fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, NetAccessPoint.class);
    }

    /**
     * Convert an instance of NetAccessPoint to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

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

/** Information about the virtual gateway. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VirtualGateway {
    public static final String SERIALIZED_NAME_CONNECTION_TYPE = "ConnectionType";

    @SerializedName(SERIALIZED_NAME_CONNECTION_TYPE)
    private String connectionType;

    public static final String SERIALIZED_NAME_NET_TO_VIRTUAL_GATEWAY_LINKS =
            "NetToVirtualGatewayLinks";

    @SerializedName(SERIALIZED_NAME_NET_TO_VIRTUAL_GATEWAY_LINKS)
    private List<NetToVirtualGatewayLink> netToVirtualGatewayLinks = null;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public static final String SERIALIZED_NAME_VIRTUAL_GATEWAY_ID = "VirtualGatewayId";

    @SerializedName(SERIALIZED_NAME_VIRTUAL_GATEWAY_ID)
    private String virtualGatewayId;

    public VirtualGateway() {}

    public VirtualGateway connectionType(String connectionType) {

        this.connectionType = connectionType;
        return this;
    }

    /**
     * The type of VPN connection supported by the virtual gateway (only &#x60;ipsec.1&#x60; is
     * supported).
     *
     * @return connectionType
     */
    @javax.annotation.Nullable
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public VirtualGateway netToVirtualGatewayLinks(
            List<NetToVirtualGatewayLink> netToVirtualGatewayLinks) {

        this.netToVirtualGatewayLinks = netToVirtualGatewayLinks;
        return this;
    }

    public VirtualGateway addNetToVirtualGatewayLinksItem(
            NetToVirtualGatewayLink netToVirtualGatewayLinksItem) {
        if (this.netToVirtualGatewayLinks == null) {
            this.netToVirtualGatewayLinks = new ArrayList<>();
        }
        this.netToVirtualGatewayLinks.add(netToVirtualGatewayLinksItem);
        return this;
    }

    /**
     * The Net to which the virtual gateway is attached.
     *
     * @return netToVirtualGatewayLinks
     */
    @javax.annotation.Nullable
    public List<NetToVirtualGatewayLink> getNetToVirtualGatewayLinks() {
        return netToVirtualGatewayLinks;
    }

    public void setNetToVirtualGatewayLinks(
            List<NetToVirtualGatewayLink> netToVirtualGatewayLinks) {
        this.netToVirtualGatewayLinks = netToVirtualGatewayLinks;
    }

    public VirtualGateway state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the virtual gateway (&#x60;pending&#x60; \\| &#x60;available&#x60; \\|
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

    public VirtualGateway tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public VirtualGateway addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the virtual gateway.
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

    public VirtualGateway virtualGatewayId(String virtualGatewayId) {

        this.virtualGatewayId = virtualGatewayId;
        return this;
    }

    /**
     * The ID of the virtual gateway.
     *
     * @return virtualGatewayId
     */
    @javax.annotation.Nullable
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
        VirtualGateway virtualGateway = (VirtualGateway) o;
        return Objects.equals(this.connectionType, virtualGateway.connectionType)
                && Objects.equals(
                        this.netToVirtualGatewayLinks, virtualGateway.netToVirtualGatewayLinks)
                && Objects.equals(this.state, virtualGateway.state)
                && Objects.equals(this.tags, virtualGateway.tags)
                && Objects.equals(this.virtualGatewayId, virtualGateway.virtualGatewayId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                connectionType, netToVirtualGatewayLinks, state, tags, virtualGatewayId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualGateway {\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    netToVirtualGatewayLinks: ")
                .append(toIndentedString(netToVirtualGatewayLinks))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
        openapiFields.add("ConnectionType");
        openapiFields.add("NetToVirtualGatewayLinks");
        openapiFields.add("State");
        openapiFields.add("Tags");
        openapiFields.add("VirtualGatewayId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to VirtualGateway
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!VirtualGateway.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VirtualGateway is not found in the"
                                        + " empty JSON string",
                                VirtualGateway.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!VirtualGateway.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `VirtualGateway` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("ConnectionType") != null && !jsonObj.get("ConnectionType").isJsonNull())
                && !jsonObj.get("ConnectionType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ConnectionType` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("ConnectionType").toString()));
        }
        if (jsonObj.get("NetToVirtualGatewayLinks") != null
                && !jsonObj.get("NetToVirtualGatewayLinks").isJsonNull()) {
            JsonArray jsonArraynetToVirtualGatewayLinks =
                    jsonObj.getAsJsonArray("NetToVirtualGatewayLinks");
            if (jsonArraynetToVirtualGatewayLinks != null) {
                // ensure the json data is an array
                if (!jsonObj.get("NetToVirtualGatewayLinks").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `NetToVirtualGatewayLinks` to be an array"
                                            + " in the JSON string but got `%s`",
                                    jsonObj.get("NetToVirtualGatewayLinks").toString()));
                }

                // validate the optional field `NetToVirtualGatewayLinks` (array)
                for (int i = 0; i < jsonArraynetToVirtualGatewayLinks.size(); i++) {
                    NetToVirtualGatewayLink.validateJsonObject(
                            jsonArraynetToVirtualGatewayLinks.get(i).getAsJsonObject());
                }
                ;
            }
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
        if ((jsonObj.get("VirtualGatewayId") != null
                        && !jsonObj.get("VirtualGatewayId").isJsonNull())
                && !jsonObj.get("VirtualGatewayId").isJsonPrimitive()) {
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
            if (!VirtualGateway.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VirtualGateway' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VirtualGateway> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VirtualGateway.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VirtualGateway>() {
                        @Override
                        public void write(JsonWriter out, VirtualGateway value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VirtualGateway read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VirtualGateway given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VirtualGateway
     * @throws IOException if the JSON string is invalid with respect to VirtualGateway
     */
    public static VirtualGateway fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VirtualGateway.class);
    }

    /**
     * Convert an instance of VirtualGateway to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

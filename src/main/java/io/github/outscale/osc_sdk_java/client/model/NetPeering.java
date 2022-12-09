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

/** Information about the Net peering. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NetPeering {
    public static final String SERIALIZED_NAME_ACCEPTER_NET = "AccepterNet";

    @SerializedName(SERIALIZED_NAME_ACCEPTER_NET)
    private AccepterNet accepterNet;

    public static final String SERIALIZED_NAME_NET_PEERING_ID = "NetPeeringId";

    @SerializedName(SERIALIZED_NAME_NET_PEERING_ID)
    private String netPeeringId;

    public static final String SERIALIZED_NAME_SOURCE_NET = "SourceNet";

    @SerializedName(SERIALIZED_NAME_SOURCE_NET)
    private SourceNet sourceNet;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private NetPeeringState state;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public NetPeering() {}

    public NetPeering accepterNet(AccepterNet accepterNet) {

        this.accepterNet = accepterNet;
        return this;
    }

    /**
     * Get accepterNet
     *
     * @return accepterNet
     */
    @javax.annotation.Nullable
    public AccepterNet getAccepterNet() {
        return accepterNet;
    }

    public void setAccepterNet(AccepterNet accepterNet) {
        this.accepterNet = accepterNet;
    }

    public NetPeering netPeeringId(String netPeeringId) {

        this.netPeeringId = netPeeringId;
        return this;
    }

    /**
     * The ID of the Net peering.
     *
     * @return netPeeringId
     */
    @javax.annotation.Nullable
    public String getNetPeeringId() {
        return netPeeringId;
    }

    public void setNetPeeringId(String netPeeringId) {
        this.netPeeringId = netPeeringId;
    }

    public NetPeering sourceNet(SourceNet sourceNet) {

        this.sourceNet = sourceNet;
        return this;
    }

    /**
     * Get sourceNet
     *
     * @return sourceNet
     */
    @javax.annotation.Nullable
    public SourceNet getSourceNet() {
        return sourceNet;
    }

    public void setSourceNet(SourceNet sourceNet) {
        this.sourceNet = sourceNet;
    }

    public NetPeering state(NetPeeringState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nullable
    public NetPeeringState getState() {
        return state;
    }

    public void setState(NetPeeringState state) {
        this.state = state;
    }

    public NetPeering tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public NetPeering addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the Net peering.
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
        NetPeering netPeering = (NetPeering) o;
        return Objects.equals(this.accepterNet, netPeering.accepterNet)
                && Objects.equals(this.netPeeringId, netPeering.netPeeringId)
                && Objects.equals(this.sourceNet, netPeering.sourceNet)
                && Objects.equals(this.state, netPeering.state)
                && Objects.equals(this.tags, netPeering.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accepterNet, netPeeringId, sourceNet, state, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetPeering {\n");
        sb.append("    accepterNet: ").append(toIndentedString(accepterNet)).append("\n");
        sb.append("    netPeeringId: ").append(toIndentedString(netPeeringId)).append("\n");
        sb.append("    sourceNet: ").append(toIndentedString(sourceNet)).append("\n");
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
        openapiFields.add("AccepterNet");
        openapiFields.add("NetPeeringId");
        openapiFields.add("SourceNet");
        openapiFields.add("State");
        openapiFields.add("Tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to NetPeering
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!NetPeering.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in NetPeering is not found in the empty"
                                        + " JSON string",
                                NetPeering.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!NetPeering.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `NetPeering` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // validate the optional field `AccepterNet`
        if (jsonObj.get("AccepterNet") != null && !jsonObj.get("AccepterNet").isJsonNull()) {
            AccepterNet.validateJsonObject(jsonObj.getAsJsonObject("AccepterNet"));
        }
        if ((jsonObj.get("NetPeeringId") != null && !jsonObj.get("NetPeeringId").isJsonNull())
                && !jsonObj.get("NetPeeringId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetPeeringId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("NetPeeringId").toString()));
        }
        // validate the optional field `SourceNet`
        if (jsonObj.get("SourceNet") != null && !jsonObj.get("SourceNet").isJsonNull()) {
            SourceNet.validateJsonObject(jsonObj.getAsJsonObject("SourceNet"));
        }
        // validate the optional field `State`
        if (jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) {
            NetPeeringState.validateJsonObject(jsonObj.getAsJsonObject("State"));
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
            if (!NetPeering.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'NetPeering' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NetPeering> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(NetPeering.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<NetPeering>() {
                        @Override
                        public void write(JsonWriter out, NetPeering value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public NetPeering read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of NetPeering given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of NetPeering
     * @throws IOException if the JSON string is invalid with respect to NetPeering
     */
    public static NetPeering fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, NetPeering.class);
    }

    /**
     * Convert an instance of NetPeering to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

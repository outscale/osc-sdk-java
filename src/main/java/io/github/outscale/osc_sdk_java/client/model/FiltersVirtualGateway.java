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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** One or more filters. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiltersVirtualGateway {
    public static final String SERIALIZED_NAME_CONNECTION_TYPES = "ConnectionTypes";

    @SerializedName(SERIALIZED_NAME_CONNECTION_TYPES)
    private List<String> connectionTypes = null;

    public static final String SERIALIZED_NAME_LINK_NET_IDS = "LinkNetIds";

    @SerializedName(SERIALIZED_NAME_LINK_NET_IDS)
    private List<String> linkNetIds = null;

    public static final String SERIALIZED_NAME_LINK_STATES = "LinkStates";

    @SerializedName(SERIALIZED_NAME_LINK_STATES)
    private List<String> linkStates = null;

    public static final String SERIALIZED_NAME_STATES = "States";

    @SerializedName(SERIALIZED_NAME_STATES)
    private List<String> states = null;

    public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";

    @SerializedName(SERIALIZED_NAME_TAG_KEYS)
    private List<String> tagKeys = null;

    public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";

    @SerializedName(SERIALIZED_NAME_TAG_VALUES)
    private List<String> tagValues = null;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<String> tags = null;

    public static final String SERIALIZED_NAME_VIRTUAL_GATEWAY_IDS = "VirtualGatewayIds";

    @SerializedName(SERIALIZED_NAME_VIRTUAL_GATEWAY_IDS)
    private List<String> virtualGatewayIds = null;

    public FiltersVirtualGateway() {}

    public FiltersVirtualGateway connectionTypes(List<String> connectionTypes) {

        this.connectionTypes = connectionTypes;
        return this;
    }

    public FiltersVirtualGateway addConnectionTypesItem(String connectionTypesItem) {
        if (this.connectionTypes == null) {
            this.connectionTypes = new ArrayList<>();
        }
        this.connectionTypes.add(connectionTypesItem);
        return this;
    }

    /**
     * The types of the virtual gateways (only &#x60;ipsec.1&#x60; is supported).
     *
     * @return connectionTypes
     */
    @javax.annotation.Nullable
    public List<String> getConnectionTypes() {
        return connectionTypes;
    }

    public void setConnectionTypes(List<String> connectionTypes) {
        this.connectionTypes = connectionTypes;
    }

    public FiltersVirtualGateway linkNetIds(List<String> linkNetIds) {

        this.linkNetIds = linkNetIds;
        return this;
    }

    public FiltersVirtualGateway addLinkNetIdsItem(String linkNetIdsItem) {
        if (this.linkNetIds == null) {
            this.linkNetIds = new ArrayList<>();
        }
        this.linkNetIds.add(linkNetIdsItem);
        return this;
    }

    /**
     * The IDs of the Nets the virtual gateways are attached to.
     *
     * @return linkNetIds
     */
    @javax.annotation.Nullable
    public List<String> getLinkNetIds() {
        return linkNetIds;
    }

    public void setLinkNetIds(List<String> linkNetIds) {
        this.linkNetIds = linkNetIds;
    }

    public FiltersVirtualGateway linkStates(List<String> linkStates) {

        this.linkStates = linkStates;
        return this;
    }

    public FiltersVirtualGateway addLinkStatesItem(String linkStatesItem) {
        if (this.linkStates == null) {
            this.linkStates = new ArrayList<>();
        }
        this.linkStates.add(linkStatesItem);
        return this;
    }

    /**
     * The current states of the attachments between the virtual gateways and the Nets
     * (&#x60;attaching&#x60; \\| &#x60;attached&#x60; \\| &#x60;detaching&#x60; \\|
     * &#x60;detached&#x60;).
     *
     * @return linkStates
     */
    @javax.annotation.Nullable
    public List<String> getLinkStates() {
        return linkStates;
    }

    public void setLinkStates(List<String> linkStates) {
        this.linkStates = linkStates;
    }

    public FiltersVirtualGateway states(List<String> states) {

        this.states = states;
        return this;
    }

    public FiltersVirtualGateway addStatesItem(String statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    /**
     * The states of the virtual gateways (&#x60;pending&#x60; \\| &#x60;available&#x60; \\|
     * &#x60;deleting&#x60; \\| &#x60;deleted&#x60;).
     *
     * @return states
     */
    @javax.annotation.Nullable
    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }

    public FiltersVirtualGateway tagKeys(List<String> tagKeys) {

        this.tagKeys = tagKeys;
        return this;
    }

    public FiltersVirtualGateway addTagKeysItem(String tagKeysItem) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        this.tagKeys.add(tagKeysItem);
        return this;
    }

    /**
     * The keys of the tags associated with the virtual gateways.
     *
     * @return tagKeys
     */
    @javax.annotation.Nullable
    public List<String> getTagKeys() {
        return tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
    }

    public FiltersVirtualGateway tagValues(List<String> tagValues) {

        this.tagValues = tagValues;
        return this;
    }

    public FiltersVirtualGateway addTagValuesItem(String tagValuesItem) {
        if (this.tagValues == null) {
            this.tagValues = new ArrayList<>();
        }
        this.tagValues.add(tagValuesItem);
        return this;
    }

    /**
     * The values of the tags associated with the virtual gateways.
     *
     * @return tagValues
     */
    @javax.annotation.Nullable
    public List<String> getTagValues() {
        return tagValues;
    }

    public void setTagValues(List<String> tagValues) {
        this.tagValues = tagValues;
    }

    public FiltersVirtualGateway tags(List<String> tags) {

        this.tags = tags;
        return this;
    }

    public FiltersVirtualGateway addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The key/value combination of the tags associated with the virtual gateways, in the following
     * format:
     * &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}.
     *
     * @return tags
     */
    @javax.annotation.Nullable
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public FiltersVirtualGateway virtualGatewayIds(List<String> virtualGatewayIds) {

        this.virtualGatewayIds = virtualGatewayIds;
        return this;
    }

    public FiltersVirtualGateway addVirtualGatewayIdsItem(String virtualGatewayIdsItem) {
        if (this.virtualGatewayIds == null) {
            this.virtualGatewayIds = new ArrayList<>();
        }
        this.virtualGatewayIds.add(virtualGatewayIdsItem);
        return this;
    }

    /**
     * The IDs of the virtual gateways.
     *
     * @return virtualGatewayIds
     */
    @javax.annotation.Nullable
    public List<String> getVirtualGatewayIds() {
        return virtualGatewayIds;
    }

    public void setVirtualGatewayIds(List<String> virtualGatewayIds) {
        this.virtualGatewayIds = virtualGatewayIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersVirtualGateway filtersVirtualGateway = (FiltersVirtualGateway) o;
        return Objects.equals(this.connectionTypes, filtersVirtualGateway.connectionTypes)
                && Objects.equals(this.linkNetIds, filtersVirtualGateway.linkNetIds)
                && Objects.equals(this.linkStates, filtersVirtualGateway.linkStates)
                && Objects.equals(this.states, filtersVirtualGateway.states)
                && Objects.equals(this.tagKeys, filtersVirtualGateway.tagKeys)
                && Objects.equals(this.tagValues, filtersVirtualGateway.tagValues)
                && Objects.equals(this.tags, filtersVirtualGateway.tags)
                && Objects.equals(this.virtualGatewayIds, filtersVirtualGateway.virtualGatewayIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                connectionTypes,
                linkNetIds,
                linkStates,
                states,
                tagKeys,
                tagValues,
                tags,
                virtualGatewayIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersVirtualGateway {\n");
        sb.append("    connectionTypes: ").append(toIndentedString(connectionTypes)).append("\n");
        sb.append("    linkNetIds: ").append(toIndentedString(linkNetIds)).append("\n");
        sb.append("    linkStates: ").append(toIndentedString(linkStates)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
        sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    virtualGatewayIds: ")
                .append(toIndentedString(virtualGatewayIds))
                .append("\n");
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
        openapiFields.add("ConnectionTypes");
        openapiFields.add("LinkNetIds");
        openapiFields.add("LinkStates");
        openapiFields.add("States");
        openapiFields.add("TagKeys");
        openapiFields.add("TagValues");
        openapiFields.add("Tags");
        openapiFields.add("VirtualGatewayIds");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersVirtualGateway
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersVirtualGateway.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersVirtualGateway is not found in"
                                        + " the empty JSON string",
                                FiltersVirtualGateway.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersVirtualGateway.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersVirtualGateway` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("ConnectionTypes") != null
                && !jsonObj.get("ConnectionTypes").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ConnectionTypes` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ConnectionTypes").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("LinkNetIds") != null && !jsonObj.get("LinkNetIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LinkNetIds` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("LinkNetIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("LinkStates") != null && !jsonObj.get("LinkStates").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LinkStates` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("LinkStates").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("States") != null && !jsonObj.get("States").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `States` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("States").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("TagKeys") != null && !jsonObj.get("TagKeys").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `TagKeys` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("TagKeys").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("TagValues") != null && !jsonObj.get("TagValues").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `TagValues` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("TagValues").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Tags` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Tags").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VirtualGatewayIds") != null
                && !jsonObj.get("VirtualGatewayIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VirtualGatewayIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VirtualGatewayIds").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersVirtualGateway.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersVirtualGateway' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersVirtualGateway> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersVirtualGateway.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersVirtualGateway>() {
                        @Override
                        public void write(JsonWriter out, FiltersVirtualGateway value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersVirtualGateway read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersVirtualGateway given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersVirtualGateway
     * @throws IOException if the JSON string is invalid with respect to FiltersVirtualGateway
     */
    public static FiltersVirtualGateway fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersVirtualGateway.class);
    }

    /**
     * Convert an instance of FiltersVirtualGateway to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

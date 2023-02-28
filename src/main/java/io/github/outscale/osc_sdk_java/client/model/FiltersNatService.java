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
public class FiltersNatService {
    public static final String SERIALIZED_NAME_NAT_SERVICE_IDS = "NatServiceIds";

    @SerializedName(SERIALIZED_NAME_NAT_SERVICE_IDS)
    private List<String> natServiceIds = null;

    public static final String SERIALIZED_NAME_NET_IDS = "NetIds";

    @SerializedName(SERIALIZED_NAME_NET_IDS)
    private List<String> netIds = null;

    public static final String SERIALIZED_NAME_STATES = "States";

    @SerializedName(SERIALIZED_NAME_STATES)
    private List<String> states = null;

    public static final String SERIALIZED_NAME_SUBNET_IDS = "SubnetIds";

    @SerializedName(SERIALIZED_NAME_SUBNET_IDS)
    private List<String> subnetIds = null;

    public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";

    @SerializedName(SERIALIZED_NAME_TAG_KEYS)
    private List<String> tagKeys = null;

    public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";

    @SerializedName(SERIALIZED_NAME_TAG_VALUES)
    private List<String> tagValues = null;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<String> tags = null;

    public FiltersNatService() {}

    public FiltersNatService natServiceIds(List<String> natServiceIds) {

        this.natServiceIds = natServiceIds;
        return this;
    }

    public FiltersNatService addNatServiceIdsItem(String natServiceIdsItem) {
        if (this.natServiceIds == null) {
            this.natServiceIds = new ArrayList<>();
        }
        this.natServiceIds.add(natServiceIdsItem);
        return this;
    }

    /**
     * The IDs of the NAT services.
     *
     * @return natServiceIds
     */
    @javax.annotation.Nullable
    public List<String> getNatServiceIds() {
        return natServiceIds;
    }

    public void setNatServiceIds(List<String> natServiceIds) {
        this.natServiceIds = natServiceIds;
    }

    public FiltersNatService netIds(List<String> netIds) {

        this.netIds = netIds;
        return this;
    }

    public FiltersNatService addNetIdsItem(String netIdsItem) {
        if (this.netIds == null) {
            this.netIds = new ArrayList<>();
        }
        this.netIds.add(netIdsItem);
        return this;
    }

    /**
     * The IDs of the Nets in which the NAT services are.
     *
     * @return netIds
     */
    @javax.annotation.Nullable
    public List<String> getNetIds() {
        return netIds;
    }

    public void setNetIds(List<String> netIds) {
        this.netIds = netIds;
    }

    public FiltersNatService states(List<String> states) {

        this.states = states;
        return this;
    }

    public FiltersNatService addStatesItem(String statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    /**
     * The states of the NAT services (&#x60;pending&#x60; \\| &#x60;available&#x60; \\|
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

    public FiltersNatService subnetIds(List<String> subnetIds) {

        this.subnetIds = subnetIds;
        return this;
    }

    public FiltersNatService addSubnetIdsItem(String subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    /**
     * The IDs of the Subnets in which the NAT services are.
     *
     * @return subnetIds
     */
    @javax.annotation.Nullable
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public FiltersNatService tagKeys(List<String> tagKeys) {

        this.tagKeys = tagKeys;
        return this;
    }

    public FiltersNatService addTagKeysItem(String tagKeysItem) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        this.tagKeys.add(tagKeysItem);
        return this;
    }

    /**
     * The keys of the tags associated with the NAT services.
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

    public FiltersNatService tagValues(List<String> tagValues) {

        this.tagValues = tagValues;
        return this;
    }

    public FiltersNatService addTagValuesItem(String tagValuesItem) {
        if (this.tagValues == null) {
            this.tagValues = new ArrayList<>();
        }
        this.tagValues.add(tagValuesItem);
        return this;
    }

    /**
     * The values of the tags associated with the NAT services.
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

    public FiltersNatService tags(List<String> tags) {

        this.tags = tags;
        return this;
    }

    public FiltersNatService addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The key/value combination of the tags associated with the NAT services, in the following
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersNatService filtersNatService = (FiltersNatService) o;
        return Objects.equals(this.natServiceIds, filtersNatService.natServiceIds)
                && Objects.equals(this.netIds, filtersNatService.netIds)
                && Objects.equals(this.states, filtersNatService.states)
                && Objects.equals(this.subnetIds, filtersNatService.subnetIds)
                && Objects.equals(this.tagKeys, filtersNatService.tagKeys)
                && Objects.equals(this.tagValues, filtersNatService.tagValues)
                && Objects.equals(this.tags, filtersNatService.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natServiceIds, netIds, states, subnetIds, tagKeys, tagValues, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersNatService {\n");
        sb.append("    natServiceIds: ").append(toIndentedString(natServiceIds)).append("\n");
        sb.append("    netIds: ").append(toIndentedString(netIds)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
        sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
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
        openapiFields.add("NatServiceIds");
        openapiFields.add("NetIds");
        openapiFields.add("States");
        openapiFields.add("SubnetIds");
        openapiFields.add("TagKeys");
        openapiFields.add("TagValues");
        openapiFields.add("Tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersNatService
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersNatService.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersNatService is not found in the"
                                        + " empty JSON string",
                                FiltersNatService.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersNatService.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersNatService` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("NatServiceIds") != null && !jsonObj.get("NatServiceIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NatServiceIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NatServiceIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("NetIds") != null && !jsonObj.get("NetIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetIds` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("NetIds").toString()));
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
        if (jsonObj.get("SubnetIds") != null && !jsonObj.get("SubnetIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubnetIds` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("SubnetIds").toString()));
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersNatService.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersNatService' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersNatService> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersNatService.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersNatService>() {
                        @Override
                        public void write(JsonWriter out, FiltersNatService value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersNatService read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersNatService given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersNatService
     * @throws IOException if the JSON string is invalid with respect to FiltersNatService
     */
    public static FiltersNatService fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersNatService.class);
    }

    /**
     * Convert an instance of FiltersNatService to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

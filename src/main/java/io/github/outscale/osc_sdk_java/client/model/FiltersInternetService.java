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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** One or more filters. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiltersInternetService {
    public static final String SERIALIZED_NAME_INTERNET_SERVICE_IDS = "InternetServiceIds";

    @SerializedName(SERIALIZED_NAME_INTERNET_SERVICE_IDS)
    private List<String> internetServiceIds = null;

    public static final String SERIALIZED_NAME_LINK_NET_IDS = "LinkNetIds";

    @SerializedName(SERIALIZED_NAME_LINK_NET_IDS)
    private List<String> linkNetIds = null;

    public static final String SERIALIZED_NAME_LINK_STATES = "LinkStates";

    @SerializedName(SERIALIZED_NAME_LINK_STATES)
    private List<String> linkStates = null;

    public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";

    @SerializedName(SERIALIZED_NAME_TAG_KEYS)
    private List<String> tagKeys = null;

    public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";

    @SerializedName(SERIALIZED_NAME_TAG_VALUES)
    private List<String> tagValues = null;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<String> tags = null;

    public FiltersInternetService() {}

    public FiltersInternetService internetServiceIds(List<String> internetServiceIds) {

        this.internetServiceIds = internetServiceIds;
        return this;
    }

    public FiltersInternetService addInternetServiceIdsItem(String internetServiceIdsItem) {
        if (this.internetServiceIds == null) {
            this.internetServiceIds = new ArrayList<>();
        }
        this.internetServiceIds.add(internetServiceIdsItem);
        return this;
    }

    /**
     * The IDs of the Internet services.
     *
     * @return internetServiceIds
     */
    @javax.annotation.Nullable
    public List<String> getInternetServiceIds() {
        return internetServiceIds;
    }

    public void setInternetServiceIds(List<String> internetServiceIds) {
        this.internetServiceIds = internetServiceIds;
    }

    public FiltersInternetService linkNetIds(List<String> linkNetIds) {

        this.linkNetIds = linkNetIds;
        return this;
    }

    public FiltersInternetService addLinkNetIdsItem(String linkNetIdsItem) {
        if (this.linkNetIds == null) {
            this.linkNetIds = new ArrayList<>();
        }
        this.linkNetIds.add(linkNetIdsItem);
        return this;
    }

    /**
     * The IDs of the Nets the Internet services are attached to.
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

    public FiltersInternetService linkStates(List<String> linkStates) {

        this.linkStates = linkStates;
        return this;
    }

    public FiltersInternetService addLinkStatesItem(String linkStatesItem) {
        if (this.linkStates == null) {
            this.linkStates = new ArrayList<>();
        }
        this.linkStates.add(linkStatesItem);
        return this;
    }

    /**
     * The current states of the attachments between the Internet services and the Nets (only
     * &#x60;available&#x60;, if the Internet gateway is attached to a VPC).
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

    public FiltersInternetService tagKeys(List<String> tagKeys) {

        this.tagKeys = tagKeys;
        return this;
    }

    public FiltersInternetService addTagKeysItem(String tagKeysItem) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        this.tagKeys.add(tagKeysItem);
        return this;
    }

    /**
     * The keys of the tags associated with the Internet services.
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

    public FiltersInternetService tagValues(List<String> tagValues) {

        this.tagValues = tagValues;
        return this;
    }

    public FiltersInternetService addTagValuesItem(String tagValuesItem) {
        if (this.tagValues == null) {
            this.tagValues = new ArrayList<>();
        }
        this.tagValues.add(tagValuesItem);
        return this;
    }

    /**
     * The values of the tags associated with the Internet services.
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

    public FiltersInternetService tags(List<String> tags) {

        this.tags = tags;
        return this;
    }

    public FiltersInternetService addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The key/value combination of the tags associated with the Internet services, in the following
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
        FiltersInternetService filtersInternetService = (FiltersInternetService) o;
        return Objects.equals(this.internetServiceIds, filtersInternetService.internetServiceIds)
                && Objects.equals(this.linkNetIds, filtersInternetService.linkNetIds)
                && Objects.equals(this.linkStates, filtersInternetService.linkStates)
                && Objects.equals(this.tagKeys, filtersInternetService.tagKeys)
                && Objects.equals(this.tagValues, filtersInternetService.tagValues)
                && Objects.equals(this.tags, filtersInternetService.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internetServiceIds, linkNetIds, linkStates, tagKeys, tagValues, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersInternetService {\n");
        sb.append("    internetServiceIds: ")
                .append(toIndentedString(internetServiceIds))
                .append("\n");
        sb.append("    linkNetIds: ").append(toIndentedString(linkNetIds)).append("\n");
        sb.append("    linkStates: ").append(toIndentedString(linkStates)).append("\n");
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
        openapiFields.add("InternetServiceIds");
        openapiFields.add("LinkNetIds");
        openapiFields.add("LinkStates");
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
     * @throws IOException if the JSON Object is invalid with respect to FiltersInternetService
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersInternetService.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersInternetService is not found"
                                        + " in the empty JSON string",
                                FiltersInternetService.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersInternetService.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersInternetService` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("InternetServiceIds") != null
                && !jsonObj.get("InternetServiceIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `InternetServiceIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("InternetServiceIds").toString()));
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
            if (!FiltersInternetService.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersInternetService' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersInternetService> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersInternetService.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersInternetService>() {
                        @Override
                        public void write(JsonWriter out, FiltersInternetService value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersInternetService read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersInternetService given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersInternetService
     * @throws IOException if the JSON string is invalid with respect to FiltersInternetService
     */
    public static FiltersInternetService fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersInternetService.class);
    }

    /**
     * Convert an instance of FiltersInternetService to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

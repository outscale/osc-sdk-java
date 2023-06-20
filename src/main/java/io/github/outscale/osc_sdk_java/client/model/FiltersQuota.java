/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.27
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
public class FiltersQuota {
    public static final String SERIALIZED_NAME_COLLECTIONS = "Collections";

    @SerializedName(SERIALIZED_NAME_COLLECTIONS)
    private List<String> collections = null;

    public static final String SERIALIZED_NAME_QUOTA_NAMES = "QuotaNames";

    @SerializedName(SERIALIZED_NAME_QUOTA_NAMES)
    private List<String> quotaNames = null;

    public static final String SERIALIZED_NAME_QUOTA_TYPES = "QuotaTypes";

    @SerializedName(SERIALIZED_NAME_QUOTA_TYPES)
    private List<String> quotaTypes = null;

    public static final String SERIALIZED_NAME_SHORT_DESCRIPTIONS = "ShortDescriptions";

    @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTIONS)
    private List<String> shortDescriptions = null;

    public FiltersQuota() {}

    public FiltersQuota collections(List<String> collections) {

        this.collections = collections;
        return this;
    }

    public FiltersQuota addCollectionsItem(String collectionsItem) {
        if (this.collections == null) {
            this.collections = new ArrayList<>();
        }
        this.collections.add(collectionsItem);
        return this;
    }

    /**
     * The group names of the quotas.
     *
     * @return collections
     */
    @javax.annotation.Nullable
    public List<String> getCollections() {
        return collections;
    }

    public void setCollections(List<String> collections) {
        this.collections = collections;
    }

    public FiltersQuota quotaNames(List<String> quotaNames) {

        this.quotaNames = quotaNames;
        return this;
    }

    public FiltersQuota addQuotaNamesItem(String quotaNamesItem) {
        if (this.quotaNames == null) {
            this.quotaNames = new ArrayList<>();
        }
        this.quotaNames.add(quotaNamesItem);
        return this;
    }

    /**
     * The names of the quotas.
     *
     * @return quotaNames
     */
    @javax.annotation.Nullable
    public List<String> getQuotaNames() {
        return quotaNames;
    }

    public void setQuotaNames(List<String> quotaNames) {
        this.quotaNames = quotaNames;
    }

    public FiltersQuota quotaTypes(List<String> quotaTypes) {

        this.quotaTypes = quotaTypes;
        return this;
    }

    public FiltersQuota addQuotaTypesItem(String quotaTypesItem) {
        if (this.quotaTypes == null) {
            this.quotaTypes = new ArrayList<>();
        }
        this.quotaTypes.add(quotaTypesItem);
        return this;
    }

    /**
     * The resource IDs if these are resource-specific quotas, &#x60;global&#x60; if they are not.
     *
     * @return quotaTypes
     */
    @javax.annotation.Nullable
    public List<String> getQuotaTypes() {
        return quotaTypes;
    }

    public void setQuotaTypes(List<String> quotaTypes) {
        this.quotaTypes = quotaTypes;
    }

    public FiltersQuota shortDescriptions(List<String> shortDescriptions) {

        this.shortDescriptions = shortDescriptions;
        return this;
    }

    public FiltersQuota addShortDescriptionsItem(String shortDescriptionsItem) {
        if (this.shortDescriptions == null) {
            this.shortDescriptions = new ArrayList<>();
        }
        this.shortDescriptions.add(shortDescriptionsItem);
        return this;
    }

    /**
     * The description of the quotas.
     *
     * @return shortDescriptions
     */
    @javax.annotation.Nullable
    public List<String> getShortDescriptions() {
        return shortDescriptions;
    }

    public void setShortDescriptions(List<String> shortDescriptions) {
        this.shortDescriptions = shortDescriptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersQuota filtersQuota = (FiltersQuota) o;
        return Objects.equals(this.collections, filtersQuota.collections)
                && Objects.equals(this.quotaNames, filtersQuota.quotaNames)
                && Objects.equals(this.quotaTypes, filtersQuota.quotaTypes)
                && Objects.equals(this.shortDescriptions, filtersQuota.shortDescriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collections, quotaNames, quotaTypes, shortDescriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersQuota {\n");
        sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
        sb.append("    quotaNames: ").append(toIndentedString(quotaNames)).append("\n");
        sb.append("    quotaTypes: ").append(toIndentedString(quotaTypes)).append("\n");
        sb.append("    shortDescriptions: ")
                .append(toIndentedString(shortDescriptions))
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
        openapiFields.add("Collections");
        openapiFields.add("QuotaNames");
        openapiFields.add("QuotaTypes");
        openapiFields.add("ShortDescriptions");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersQuota
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersQuota.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersQuota is not found in the"
                                        + " empty JSON string",
                                FiltersQuota.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersQuota.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersQuota` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Collections") != null && !jsonObj.get("Collections").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Collections` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Collections").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("QuotaNames") != null && !jsonObj.get("QuotaNames").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QuotaNames` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("QuotaNames").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("QuotaTypes") != null && !jsonObj.get("QuotaTypes").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QuotaTypes` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("QuotaTypes").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("ShortDescriptions") != null
                && !jsonObj.get("ShortDescriptions").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ShortDescriptions` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ShortDescriptions").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersQuota.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersQuota' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersQuota> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersQuota.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersQuota>() {
                        @Override
                        public void write(JsonWriter out, FiltersQuota value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersQuota read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersQuota given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersQuota
     * @throws IOException if the JSON string is invalid with respect to FiltersQuota
     */
    public static FiltersQuota fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersQuota.class);
    }

    /**
     * Convert an instance of FiltersQuota to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

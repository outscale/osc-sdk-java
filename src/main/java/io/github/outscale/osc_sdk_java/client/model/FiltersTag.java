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
public class FiltersTag {
    public static final String SERIALIZED_NAME_KEYS = "Keys";

    @SerializedName(SERIALIZED_NAME_KEYS)
    private List<String> keys = null;

    public static final String SERIALIZED_NAME_RESOURCE_IDS = "ResourceIds";

    @SerializedName(SERIALIZED_NAME_RESOURCE_IDS)
    private List<String> resourceIds = null;

    public static final String SERIALIZED_NAME_RESOURCE_TYPES = "ResourceTypes";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPES)
    private List<String> resourceTypes = null;

    public static final String SERIALIZED_NAME_VALUES = "Values";

    @SerializedName(SERIALIZED_NAME_VALUES)
    private List<String> values = null;

    public FiltersTag() {}

    public FiltersTag keys(List<String> keys) {

        this.keys = keys;
        return this;
    }

    public FiltersTag addKeysItem(String keysItem) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(keysItem);
        return this;
    }

    /**
     * The keys of the tags that are assigned to the resources. You can use this filter alongside
     * the &#x60;Values&#x60; filter. In that case, you filter the resources corresponding to each
     * tag, regardless of the other filter.
     *
     * @return keys
     */
    @javax.annotation.Nullable
    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public FiltersTag resourceIds(List<String> resourceIds) {

        this.resourceIds = resourceIds;
        return this;
    }

    public FiltersTag addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    /**
     * The IDs of the resources with which the tags are associated.
     *
     * @return resourceIds
     */
    @javax.annotation.Nullable
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public FiltersTag resourceTypes(List<String> resourceTypes) {

        this.resourceTypes = resourceTypes;
        return this;
    }

    public FiltersTag addResourceTypesItem(String resourceTypesItem) {
        if (this.resourceTypes == null) {
            this.resourceTypes = new ArrayList<>();
        }
        this.resourceTypes.add(resourceTypesItem);
        return this;
    }

    /**
     * The resource type (&#x60;vm&#x60; \\| &#x60;image&#x60; \\| &#x60;volume&#x60; \\|
     * &#x60;snapshot&#x60; \\| &#x60;public-ip&#x60; \\| &#x60;security-group&#x60; \\|
     * &#x60;route-table&#x60; \\| &#x60;nic&#x60; \\| &#x60;net&#x60; \\| &#x60;subnet&#x60; \\|
     * &#x60;net-peering&#x60; \\| &#x60;net-access-point&#x60; \\| &#x60;nat-service&#x60; \\|
     * &#x60;internet-service&#x60; \\| &#x60;client-gateway&#x60; \\| &#x60;virtual-gateway&#x60;
     * \\| &#x60;vpn-connection&#x60; \\| &#x60;dhcp-options&#x60; \\| &#x60;task&#x60;).
     *
     * @return resourceTypes
     */
    @javax.annotation.Nullable
    public List<String> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<String> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public FiltersTag values(List<String> values) {

        this.values = values;
        return this;
    }

    public FiltersTag addValuesItem(String valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * The values of the tags that are assigned to the resources. You can use this filter alongside
     * the &#x60;TagKeys&#x60; filter. In that case, you filter the resources corresponding to each
     * tag, regardless of the other filter.
     *
     * @return values
     */
    @javax.annotation.Nullable
    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersTag filtersTag = (FiltersTag) o;
        return Objects.equals(this.keys, filtersTag.keys)
                && Objects.equals(this.resourceIds, filtersTag.resourceIds)
                && Objects.equals(this.resourceTypes, filtersTag.resourceTypes)
                && Objects.equals(this.values, filtersTag.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keys, resourceIds, resourceTypes, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersTag {\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
        openapiFields.add("Keys");
        openapiFields.add("ResourceIds");
        openapiFields.add("ResourceTypes");
        openapiFields.add("Values");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersTag
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersTag.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersTag is not found in the empty"
                                        + " JSON string",
                                FiltersTag.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersTag.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersTag` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Keys") != null && !jsonObj.get("Keys").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Keys` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Keys").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("ResourceIds") != null && !jsonObj.get("ResourceIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ResourceIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("ResourceIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("ResourceTypes") != null && !jsonObj.get("ResourceTypes").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ResourceTypes` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("ResourceTypes").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Values") != null && !jsonObj.get("Values").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Values` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Values").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersTag.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersTag' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersTag> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersTag.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersTag>() {
                        @Override
                        public void write(JsonWriter out, FiltersTag value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersTag read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersTag given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersTag
     * @throws IOException if the JSON string is invalid with respect to FiltersTag
     */
    public static FiltersTag fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersTag.class);
    }

    /**
     * Convert an instance of FiltersTag to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

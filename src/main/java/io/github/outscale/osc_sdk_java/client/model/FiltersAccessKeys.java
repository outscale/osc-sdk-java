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
public class FiltersAccessKeys {
    public static final String SERIALIZED_NAME_ACCESS_KEY_IDS = "AccessKeyIds";

    @SerializedName(SERIALIZED_NAME_ACCESS_KEY_IDS)
    private List<String> accessKeyIds = null;

    public static final String SERIALIZED_NAME_STATES = "States";

    @SerializedName(SERIALIZED_NAME_STATES)
    private List<String> states = null;

    public FiltersAccessKeys() {}

    public FiltersAccessKeys accessKeyIds(List<String> accessKeyIds) {

        this.accessKeyIds = accessKeyIds;
        return this;
    }

    public FiltersAccessKeys addAccessKeyIdsItem(String accessKeyIdsItem) {
        if (this.accessKeyIds == null) {
            this.accessKeyIds = new ArrayList<>();
        }
        this.accessKeyIds.add(accessKeyIdsItem);
        return this;
    }

    /**
     * The IDs of the access keys.
     *
     * @return accessKeyIds
     */
    @javax.annotation.Nullable
    public List<String> getAccessKeyIds() {
        return accessKeyIds;
    }

    public void setAccessKeyIds(List<String> accessKeyIds) {
        this.accessKeyIds = accessKeyIds;
    }

    public FiltersAccessKeys states(List<String> states) {

        this.states = states;
        return this;
    }

    public FiltersAccessKeys addStatesItem(String statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    /**
     * The states of the access keys (&#x60;ACTIVE&#x60; \\| &#x60;INACTIVE&#x60;).
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersAccessKeys filtersAccessKeys = (FiltersAccessKeys) o;
        return Objects.equals(this.accessKeyIds, filtersAccessKeys.accessKeyIds)
                && Objects.equals(this.states, filtersAccessKeys.states);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyIds, states);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersAccessKeys {\n");
        sb.append("    accessKeyIds: ").append(toIndentedString(accessKeyIds)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
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
        openapiFields.add("AccessKeyIds");
        openapiFields.add("States");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersAccessKeys
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersAccessKeys.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersAccessKeys is not found in the"
                                        + " empty JSON string",
                                FiltersAccessKeys.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersAccessKeys.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersAccessKeys` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("AccessKeyIds") != null && !jsonObj.get("AccessKeyIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `AccessKeyIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("AccessKeyIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("States") != null && !jsonObj.get("States").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `States` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("States").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersAccessKeys.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersAccessKeys' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersAccessKeys> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersAccessKeys.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersAccessKeys>() {
                        @Override
                        public void write(JsonWriter out, FiltersAccessKeys value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersAccessKeys read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersAccessKeys given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersAccessKeys
     * @throws IOException if the JSON string is invalid with respect to FiltersAccessKeys
     */
    public static FiltersAccessKeys fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersAccessKeys.class);
    }

    /**
     * Convert an instance of FiltersAccessKeys to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

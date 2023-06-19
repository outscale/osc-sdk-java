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
public class FiltersCa {
    public static final String SERIALIZED_NAME_CA_FINGERPRINTS = "CaFingerprints";

    @SerializedName(SERIALIZED_NAME_CA_FINGERPRINTS)
    private List<String> caFingerprints = null;

    public static final String SERIALIZED_NAME_CA_IDS = "CaIds";

    @SerializedName(SERIALIZED_NAME_CA_IDS)
    private List<String> caIds = null;

    public static final String SERIALIZED_NAME_DESCRIPTIONS = "Descriptions";

    @SerializedName(SERIALIZED_NAME_DESCRIPTIONS)
    private List<String> descriptions = null;

    public FiltersCa() {}

    public FiltersCa caFingerprints(List<String> caFingerprints) {

        this.caFingerprints = caFingerprints;
        return this;
    }

    public FiltersCa addCaFingerprintsItem(String caFingerprintsItem) {
        if (this.caFingerprints == null) {
            this.caFingerprints = new ArrayList<>();
        }
        this.caFingerprints.add(caFingerprintsItem);
        return this;
    }

    /**
     * The fingerprints of the CAs.
     *
     * @return caFingerprints
     */
    @javax.annotation.Nullable
    public List<String> getCaFingerprints() {
        return caFingerprints;
    }

    public void setCaFingerprints(List<String> caFingerprints) {
        this.caFingerprints = caFingerprints;
    }

    public FiltersCa caIds(List<String> caIds) {

        this.caIds = caIds;
        return this;
    }

    public FiltersCa addCaIdsItem(String caIdsItem) {
        if (this.caIds == null) {
            this.caIds = new ArrayList<>();
        }
        this.caIds.add(caIdsItem);
        return this;
    }

    /**
     * The IDs of the CAs.
     *
     * @return caIds
     */
    @javax.annotation.Nullable
    public List<String> getCaIds() {
        return caIds;
    }

    public void setCaIds(List<String> caIds) {
        this.caIds = caIds;
    }

    public FiltersCa descriptions(List<String> descriptions) {

        this.descriptions = descriptions;
        return this;
    }

    public FiltersCa addDescriptionsItem(String descriptionsItem) {
        if (this.descriptions == null) {
            this.descriptions = new ArrayList<>();
        }
        this.descriptions.add(descriptionsItem);
        return this;
    }

    /**
     * The descriptions of the CAs.
     *
     * @return descriptions
     */
    @javax.annotation.Nullable
    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersCa filtersCa = (FiltersCa) o;
        return Objects.equals(this.caFingerprints, filtersCa.caFingerprints)
                && Objects.equals(this.caIds, filtersCa.caIds)
                && Objects.equals(this.descriptions, filtersCa.descriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caFingerprints, caIds, descriptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersCa {\n");
        sb.append("    caFingerprints: ").append(toIndentedString(caFingerprints)).append("\n");
        sb.append("    caIds: ").append(toIndentedString(caIds)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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
        openapiFields.add("CaFingerprints");
        openapiFields.add("CaIds");
        openapiFields.add("Descriptions");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersCa
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersCa.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersCa is not found in the empty"
                                        + " JSON string",
                                FiltersCa.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersCa.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersCa` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("CaFingerprints") != null && !jsonObj.get("CaFingerprints").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CaFingerprints` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("CaFingerprints").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("CaIds") != null && !jsonObj.get("CaIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CaIds` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("CaIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Descriptions") != null && !jsonObj.get("Descriptions").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Descriptions` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Descriptions").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersCa.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersCa' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersCa> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersCa.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersCa>() {
                        @Override
                        public void write(JsonWriter out, FiltersCa value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersCa read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersCa given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersCa
     * @throws IOException if the JSON string is invalid with respect to FiltersCa
     */
    public static FiltersCa fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersCa.class);
    }

    /**
     * Convert an instance of FiltersCa to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

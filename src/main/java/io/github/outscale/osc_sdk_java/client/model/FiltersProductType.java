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
public class FiltersProductType {
    public static final String SERIALIZED_NAME_PRODUCT_TYPE_IDS = "ProductTypeIds";

    @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE_IDS)
    private List<String> productTypeIds = null;

    public FiltersProductType() {}

    public FiltersProductType productTypeIds(List<String> productTypeIds) {

        this.productTypeIds = productTypeIds;
        return this;
    }

    public FiltersProductType addProductTypeIdsItem(String productTypeIdsItem) {
        if (this.productTypeIds == null) {
            this.productTypeIds = new ArrayList<>();
        }
        this.productTypeIds.add(productTypeIdsItem);
        return this;
    }

    /**
     * The IDs of the product types.
     *
     * @return productTypeIds
     */
    @javax.annotation.Nullable
    public List<String> getProductTypeIds() {
        return productTypeIds;
    }

    public void setProductTypeIds(List<String> productTypeIds) {
        this.productTypeIds = productTypeIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersProductType filtersProductType = (FiltersProductType) o;
        return Objects.equals(this.productTypeIds, filtersProductType.productTypeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productTypeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersProductType {\n");
        sb.append("    productTypeIds: ").append(toIndentedString(productTypeIds)).append("\n");
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
        openapiFields.add("ProductTypeIds");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersProductType
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersProductType.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersProductType is not found in"
                                        + " the empty JSON string",
                                FiltersProductType.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersProductType.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersProductType` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("ProductTypeIds") != null && !jsonObj.get("ProductTypeIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ProductTypeIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("ProductTypeIds").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersProductType.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersProductType' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersProductType> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersProductType.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersProductType>() {
                        @Override
                        public void write(JsonWriter out, FiltersProductType value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersProductType read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersProductType given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersProductType
     * @throws IOException if the JSON string is invalid with respect to FiltersProductType
     */
    public static FiltersProductType fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersProductType.class);
    }

    /**
     * Convert an instance of FiltersProductType to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

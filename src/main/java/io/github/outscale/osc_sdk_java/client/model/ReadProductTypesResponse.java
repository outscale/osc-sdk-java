/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.24
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

/** ReadProductTypesResponse */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadProductTypesResponse {
    public static final String SERIALIZED_NAME_PRODUCT_TYPES = "ProductTypes";

    @SerializedName(SERIALIZED_NAME_PRODUCT_TYPES)
    private List<ProductType> productTypes = null;

    public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";

    @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
    private ResponseContext responseContext;

    public ReadProductTypesResponse() {}

    public ReadProductTypesResponse productTypes(List<ProductType> productTypes) {

        this.productTypes = productTypes;
        return this;
    }

    public ReadProductTypesResponse addProductTypesItem(ProductType productTypesItem) {
        if (this.productTypes == null) {
            this.productTypes = new ArrayList<>();
        }
        this.productTypes.add(productTypesItem);
        return this;
    }

    /**
     * Information about one or more product types.
     *
     * @return productTypes
     */
    @javax.annotation.Nullable
    public List<ProductType> getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(List<ProductType> productTypes) {
        this.productTypes = productTypes;
    }

    public ReadProductTypesResponse responseContext(ResponseContext responseContext) {

        this.responseContext = responseContext;
        return this;
    }

    /**
     * Get responseContext
     *
     * @return responseContext
     */
    @javax.annotation.Nullable
    public ResponseContext getResponseContext() {
        return responseContext;
    }

    public void setResponseContext(ResponseContext responseContext) {
        this.responseContext = responseContext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReadProductTypesResponse readProductTypesResponse = (ReadProductTypesResponse) o;
        return Objects.equals(this.productTypes, readProductTypesResponse.productTypes)
                && Objects.equals(this.responseContext, readProductTypesResponse.responseContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productTypes, responseContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadProductTypesResponse {\n");
        sb.append("    productTypes: ").append(toIndentedString(productTypes)).append("\n");
        sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
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
        openapiFields.add("ProductTypes");
        openapiFields.add("ResponseContext");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ReadProductTypesResponse
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ReadProductTypesResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ReadProductTypesResponse is not found"
                                        + " in the empty JSON string",
                                ReadProductTypesResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ReadProductTypesResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ReadProductTypesResponse` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if (jsonObj.get("ProductTypes") != null && !jsonObj.get("ProductTypes").isJsonNull()) {
            JsonArray jsonArrayproductTypes = jsonObj.getAsJsonArray("ProductTypes");
            if (jsonArrayproductTypes != null) {
                // ensure the json data is an array
                if (!jsonObj.get("ProductTypes").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `ProductTypes` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("ProductTypes").toString()));
                }

                // validate the optional field `ProductTypes` (array)
                for (int i = 0; i < jsonArrayproductTypes.size(); i++) {
                    ProductType.validateJsonObject(jsonArrayproductTypes.get(i).getAsJsonObject());
                }
                ;
            }
        }
        // validate the optional field `ResponseContext`
        if (jsonObj.get("ResponseContext") != null
                && !jsonObj.get("ResponseContext").isJsonNull()) {
            ResponseContext.validateJsonObject(jsonObj.getAsJsonObject("ResponseContext"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ReadProductTypesResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ReadProductTypesResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ReadProductTypesResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ReadProductTypesResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ReadProductTypesResponse>() {
                        @Override
                        public void write(JsonWriter out, ReadProductTypesResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ReadProductTypesResponse read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ReadProductTypesResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ReadProductTypesResponse
     * @throws IOException if the JSON string is invalid with respect to ReadProductTypesResponse
     */
    public static ReadProductTypesResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ReadProductTypesResponse.class);
    }

    /**
     * Convert an instance of ReadProductTypesResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

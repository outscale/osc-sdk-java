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

/** ReadSubregionsResponse */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadSubregionsResponse {
    public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";

    @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
    private ResponseContext responseContext;

    public static final String SERIALIZED_NAME_SUBREGIONS = "Subregions";

    @SerializedName(SERIALIZED_NAME_SUBREGIONS)
    private List<Subregion> subregions = null;

    public ReadSubregionsResponse() {}

    public ReadSubregionsResponse responseContext(ResponseContext responseContext) {

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

    public ReadSubregionsResponse subregions(List<Subregion> subregions) {

        this.subregions = subregions;
        return this;
    }

    public ReadSubregionsResponse addSubregionsItem(Subregion subregionsItem) {
        if (this.subregions == null) {
            this.subregions = new ArrayList<>();
        }
        this.subregions.add(subregionsItem);
        return this;
    }

    /**
     * Information about one or more Subregions.
     *
     * @return subregions
     */
    @javax.annotation.Nullable
    public List<Subregion> getSubregions() {
        return subregions;
    }

    public void setSubregions(List<Subregion> subregions) {
        this.subregions = subregions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReadSubregionsResponse readSubregionsResponse = (ReadSubregionsResponse) o;
        return Objects.equals(this.responseContext, readSubregionsResponse.responseContext)
                && Objects.equals(this.subregions, readSubregionsResponse.subregions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseContext, subregions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadSubregionsResponse {\n");
        sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
        sb.append("    subregions: ").append(toIndentedString(subregions)).append("\n");
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
        openapiFields.add("ResponseContext");
        openapiFields.add("Subregions");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ReadSubregionsResponse
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ReadSubregionsResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ReadSubregionsResponse is not found"
                                        + " in the empty JSON string",
                                ReadSubregionsResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ReadSubregionsResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ReadSubregionsResponse` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // validate the optional field `ResponseContext`
        if (jsonObj.get("ResponseContext") != null
                && !jsonObj.get("ResponseContext").isJsonNull()) {
            ResponseContext.validateJsonObject(jsonObj.getAsJsonObject("ResponseContext"));
        }
        if (jsonObj.get("Subregions") != null && !jsonObj.get("Subregions").isJsonNull()) {
            JsonArray jsonArraysubregions = jsonObj.getAsJsonArray("Subregions");
            if (jsonArraysubregions != null) {
                // ensure the json data is an array
                if (!jsonObj.get("Subregions").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `Subregions` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("Subregions").toString()));
                }

                // validate the optional field `Subregions` (array)
                for (int i = 0; i < jsonArraysubregions.size(); i++) {
                    Subregion.validateJsonObject(jsonArraysubregions.get(i).getAsJsonObject());
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ReadSubregionsResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ReadSubregionsResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ReadSubregionsResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ReadSubregionsResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ReadSubregionsResponse>() {
                        @Override
                        public void write(JsonWriter out, ReadSubregionsResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ReadSubregionsResponse read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ReadSubregionsResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ReadSubregionsResponse
     * @throws IOException if the JSON string is invalid with respect to ReadSubregionsResponse
     */
    public static ReadSubregionsResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ReadSubregionsResponse.class);
    }

    /**
     * Convert an instance of ReadSubregionsResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

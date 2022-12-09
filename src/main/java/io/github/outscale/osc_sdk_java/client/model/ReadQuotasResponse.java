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

/** ReadQuotasResponse */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadQuotasResponse {
    public static final String SERIALIZED_NAME_QUOTA_TYPES = "QuotaTypes";

    @SerializedName(SERIALIZED_NAME_QUOTA_TYPES)
    private List<QuotaTypes> quotaTypes = null;

    public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";

    @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
    private ResponseContext responseContext;

    public ReadQuotasResponse() {}

    public ReadQuotasResponse quotaTypes(List<QuotaTypes> quotaTypes) {

        this.quotaTypes = quotaTypes;
        return this;
    }

    public ReadQuotasResponse addQuotaTypesItem(QuotaTypes quotaTypesItem) {
        if (this.quotaTypes == null) {
            this.quotaTypes = new ArrayList<>();
        }
        this.quotaTypes.add(quotaTypesItem);
        return this;
    }

    /**
     * Information about one or more quotas.
     *
     * @return quotaTypes
     */
    @javax.annotation.Nullable
    public List<QuotaTypes> getQuotaTypes() {
        return quotaTypes;
    }

    public void setQuotaTypes(List<QuotaTypes> quotaTypes) {
        this.quotaTypes = quotaTypes;
    }

    public ReadQuotasResponse responseContext(ResponseContext responseContext) {

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
        ReadQuotasResponse readQuotasResponse = (ReadQuotasResponse) o;
        return Objects.equals(this.quotaTypes, readQuotasResponse.quotaTypes)
                && Objects.equals(this.responseContext, readQuotasResponse.responseContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaTypes, responseContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadQuotasResponse {\n");
        sb.append("    quotaTypes: ").append(toIndentedString(quotaTypes)).append("\n");
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
        openapiFields.add("QuotaTypes");
        openapiFields.add("ResponseContext");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ReadQuotasResponse
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ReadQuotasResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ReadQuotasResponse is not found in"
                                        + " the empty JSON string",
                                ReadQuotasResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ReadQuotasResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ReadQuotasResponse` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if (jsonObj.get("QuotaTypes") != null && !jsonObj.get("QuotaTypes").isJsonNull()) {
            JsonArray jsonArrayquotaTypes = jsonObj.getAsJsonArray("QuotaTypes");
            if (jsonArrayquotaTypes != null) {
                // ensure the json data is an array
                if (!jsonObj.get("QuotaTypes").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `QuotaTypes` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("QuotaTypes").toString()));
                }

                // validate the optional field `QuotaTypes` (array)
                for (int i = 0; i < jsonArrayquotaTypes.size(); i++) {
                    QuotaTypes.validateJsonObject(jsonArrayquotaTypes.get(i).getAsJsonObject());
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
            if (!ReadQuotasResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ReadQuotasResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ReadQuotasResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ReadQuotasResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ReadQuotasResponse>() {
                        @Override
                        public void write(JsonWriter out, ReadQuotasResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ReadQuotasResponse read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ReadQuotasResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ReadQuotasResponse
     * @throws IOException if the JSON string is invalid with respect to ReadQuotasResponse
     */
    public static ReadQuotasResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ReadQuotasResponse.class);
    }

    /**
     * Convert an instance of ReadQuotasResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

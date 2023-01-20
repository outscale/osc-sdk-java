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

/** One or more quotas. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuotaTypes {
    public static final String SERIALIZED_NAME_QUOTA_TYPE = "QuotaType";

    @SerializedName(SERIALIZED_NAME_QUOTA_TYPE)
    private String quotaType;

    public static final String SERIALIZED_NAME_QUOTAS = "Quotas";

    @SerializedName(SERIALIZED_NAME_QUOTAS)
    private List<Quota> quotas = null;

    public QuotaTypes() {}

    public QuotaTypes quotaType(String quotaType) {

        this.quotaType = quotaType;
        return this;
    }

    /**
     * The resource ID if it is a resource-specific quota, &#x60;global&#x60; if it is not.
     *
     * @return quotaType
     */
    @javax.annotation.Nullable
    public String getQuotaType() {
        return quotaType;
    }

    public void setQuotaType(String quotaType) {
        this.quotaType = quotaType;
    }

    public QuotaTypes quotas(List<Quota> quotas) {

        this.quotas = quotas;
        return this;
    }

    public QuotaTypes addQuotasItem(Quota quotasItem) {
        if (this.quotas == null) {
            this.quotas = new ArrayList<>();
        }
        this.quotas.add(quotasItem);
        return this;
    }

    /**
     * One or more quotas associated with the user.
     *
     * @return quotas
     */
    @javax.annotation.Nullable
    public List<Quota> getQuotas() {
        return quotas;
    }

    public void setQuotas(List<Quota> quotas) {
        this.quotas = quotas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuotaTypes quotaTypes = (QuotaTypes) o;
        return Objects.equals(this.quotaType, quotaTypes.quotaType)
                && Objects.equals(this.quotas, quotaTypes.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaType, quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaTypes {\n");
        sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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
        openapiFields.add("QuotaType");
        openapiFields.add("Quotas");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to QuotaTypes
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!QuotaTypes.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in QuotaTypes is not found in the empty"
                                        + " JSON string",
                                QuotaTypes.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!QuotaTypes.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `QuotaTypes` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("QuotaType") != null && !jsonObj.get("QuotaType").isJsonNull())
                && !jsonObj.get("QuotaType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QuotaType` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("QuotaType").toString()));
        }
        if (jsonObj.get("Quotas") != null && !jsonObj.get("Quotas").isJsonNull()) {
            JsonArray jsonArrayquotas = jsonObj.getAsJsonArray("Quotas");
            if (jsonArrayquotas != null) {
                // ensure the json data is an array
                if (!jsonObj.get("Quotas").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `Quotas` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("Quotas").toString()));
                }

                // validate the optional field `Quotas` (array)
                for (int i = 0; i < jsonArrayquotas.size(); i++) {
                    Quota.validateJsonObject(jsonArrayquotas.get(i).getAsJsonObject());
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QuotaTypes.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'QuotaTypes' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QuotaTypes> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(QuotaTypes.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<QuotaTypes>() {
                        @Override
                        public void write(JsonWriter out, QuotaTypes value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QuotaTypes read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QuotaTypes given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of QuotaTypes
     * @throws IOException if the JSON string is invalid with respect to QuotaTypes
     */
    public static QuotaTypes fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, QuotaTypes.class);
    }

    /**
     * Convert an instance of QuotaTypes to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

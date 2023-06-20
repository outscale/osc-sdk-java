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
public class FiltersApiAccessRule {
    public static final String SERIALIZED_NAME_API_ACCESS_RULE_IDS = "ApiAccessRuleIds";

    @SerializedName(SERIALIZED_NAME_API_ACCESS_RULE_IDS)
    private List<String> apiAccessRuleIds = null;

    public static final String SERIALIZED_NAME_CA_IDS = "CaIds";

    @SerializedName(SERIALIZED_NAME_CA_IDS)
    private List<String> caIds = null;

    public static final String SERIALIZED_NAME_CNS = "Cns";

    @SerializedName(SERIALIZED_NAME_CNS)
    private List<String> cns = null;

    public static final String SERIALIZED_NAME_DESCRIPTIONS = "Descriptions";

    @SerializedName(SERIALIZED_NAME_DESCRIPTIONS)
    private List<String> descriptions = null;

    public static final String SERIALIZED_NAME_IP_RANGES = "IpRanges";

    @SerializedName(SERIALIZED_NAME_IP_RANGES)
    private List<String> ipRanges = null;

    public FiltersApiAccessRule() {}

    public FiltersApiAccessRule apiAccessRuleIds(List<String> apiAccessRuleIds) {

        this.apiAccessRuleIds = apiAccessRuleIds;
        return this;
    }

    public FiltersApiAccessRule addApiAccessRuleIdsItem(String apiAccessRuleIdsItem) {
        if (this.apiAccessRuleIds == null) {
            this.apiAccessRuleIds = new ArrayList<>();
        }
        this.apiAccessRuleIds.add(apiAccessRuleIdsItem);
        return this;
    }

    /**
     * One or more IDs of API access rules.
     *
     * @return apiAccessRuleIds
     */
    @javax.annotation.Nullable
    public List<String> getApiAccessRuleIds() {
        return apiAccessRuleIds;
    }

    public void setApiAccessRuleIds(List<String> apiAccessRuleIds) {
        this.apiAccessRuleIds = apiAccessRuleIds;
    }

    public FiltersApiAccessRule caIds(List<String> caIds) {

        this.caIds = caIds;
        return this;
    }

    public FiltersApiAccessRule addCaIdsItem(String caIdsItem) {
        if (this.caIds == null) {
            this.caIds = new ArrayList<>();
        }
        this.caIds.add(caIdsItem);
        return this;
    }

    /**
     * One or more IDs of Client Certificate Authorities (CAs).
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

    public FiltersApiAccessRule cns(List<String> cns) {

        this.cns = cns;
        return this;
    }

    public FiltersApiAccessRule addCnsItem(String cnsItem) {
        if (this.cns == null) {
            this.cns = new ArrayList<>();
        }
        this.cns.add(cnsItem);
        return this;
    }

    /**
     * One or more Client Certificate Common Names (CNs).
     *
     * @return cns
     */
    @javax.annotation.Nullable
    public List<String> getCns() {
        return cns;
    }

    public void setCns(List<String> cns) {
        this.cns = cns;
    }

    public FiltersApiAccessRule descriptions(List<String> descriptions) {

        this.descriptions = descriptions;
        return this;
    }

    public FiltersApiAccessRule addDescriptionsItem(String descriptionsItem) {
        if (this.descriptions == null) {
            this.descriptions = new ArrayList<>();
        }
        this.descriptions.add(descriptionsItem);
        return this;
    }

    /**
     * One or more descriptions of API access rules.
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

    public FiltersApiAccessRule ipRanges(List<String> ipRanges) {

        this.ipRanges = ipRanges;
        return this;
    }

    public FiltersApiAccessRule addIpRangesItem(String ipRangesItem) {
        if (this.ipRanges == null) {
            this.ipRanges = new ArrayList<>();
        }
        this.ipRanges.add(ipRangesItem);
        return this;
    }

    /**
     * One or more IP addresses or CIDR blocks (for example, &#x60;192.0.2.0/16&#x60;).
     *
     * @return ipRanges
     */
    @javax.annotation.Nullable
    public List<String> getIpRanges() {
        return ipRanges;
    }

    public void setIpRanges(List<String> ipRanges) {
        this.ipRanges = ipRanges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersApiAccessRule filtersApiAccessRule = (FiltersApiAccessRule) o;
        return Objects.equals(this.apiAccessRuleIds, filtersApiAccessRule.apiAccessRuleIds)
                && Objects.equals(this.caIds, filtersApiAccessRule.caIds)
                && Objects.equals(this.cns, filtersApiAccessRule.cns)
                && Objects.equals(this.descriptions, filtersApiAccessRule.descriptions)
                && Objects.equals(this.ipRanges, filtersApiAccessRule.ipRanges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiAccessRuleIds, caIds, cns, descriptions, ipRanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersApiAccessRule {\n");
        sb.append("    apiAccessRuleIds: ").append(toIndentedString(apiAccessRuleIds)).append("\n");
        sb.append("    caIds: ").append(toIndentedString(caIds)).append("\n");
        sb.append("    cns: ").append(toIndentedString(cns)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    ipRanges: ").append(toIndentedString(ipRanges)).append("\n");
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
        openapiFields.add("ApiAccessRuleIds");
        openapiFields.add("CaIds");
        openapiFields.add("Cns");
        openapiFields.add("Descriptions");
        openapiFields.add("IpRanges");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersApiAccessRule
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersApiAccessRule.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersApiAccessRule is not found in"
                                        + " the empty JSON string",
                                FiltersApiAccessRule.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersApiAccessRule.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersApiAccessRule` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("ApiAccessRuleIds") != null
                && !jsonObj.get("ApiAccessRuleIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ApiAccessRuleIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ApiAccessRuleIds").toString()));
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
        if (jsonObj.get("Cns") != null && !jsonObj.get("Cns").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Cns` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Cns").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Descriptions") != null && !jsonObj.get("Descriptions").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Descriptions` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Descriptions").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("IpRanges") != null && !jsonObj.get("IpRanges").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `IpRanges` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("IpRanges").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersApiAccessRule.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersApiAccessRule' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersApiAccessRule> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersApiAccessRule.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersApiAccessRule>() {
                        @Override
                        public void write(JsonWriter out, FiltersApiAccessRule value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersApiAccessRule read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersApiAccessRule given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersApiAccessRule
     * @throws IOException if the JSON string is invalid with respect to FiltersApiAccessRule
     */
    public static FiltersApiAccessRule fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersApiAccessRule.class);
    }

    /**
     * Convert an instance of FiltersApiAccessRule to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

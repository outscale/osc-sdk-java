/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.26
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

/** CreateApiAccessRuleRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateApiAccessRuleRequest {
    public static final String SERIALIZED_NAME_CA_IDS = "CaIds";

    @SerializedName(SERIALIZED_NAME_CA_IDS)
    private List<String> caIds = null;

    public static final String SERIALIZED_NAME_CNS = "Cns";

    @SerializedName(SERIALIZED_NAME_CNS)
    private List<String> cns = null;

    public static final String SERIALIZED_NAME_DESCRIPTION = "Description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_IP_RANGES = "IpRanges";

    @SerializedName(SERIALIZED_NAME_IP_RANGES)
    private List<String> ipRanges = null;

    public CreateApiAccessRuleRequest() {}

    public CreateApiAccessRuleRequest caIds(List<String> caIds) {

        this.caIds = caIds;
        return this;
    }

    public CreateApiAccessRuleRequest addCaIdsItem(String caIdsItem) {
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

    public CreateApiAccessRuleRequest cns(List<String> cns) {

        this.cns = cns;
        return this;
    }

    public CreateApiAccessRuleRequest addCnsItem(String cnsItem) {
        if (this.cns == null) {
            this.cns = new ArrayList<>();
        }
        this.cns.add(cnsItem);
        return this;
    }

    /**
     * One or more Client Certificate Common Names (CNs). If this parameter is specified, you must
     * also specify the &#x60;CaIds&#x60; parameter.
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

    public CreateApiAccessRuleRequest description(String description) {

        this.description = description;
        return this;
    }

    /**
     * A description for the API access rule.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateApiAccessRuleRequest dryRun(Boolean dryRun) {

        this.dryRun = dryRun;
        return this;
    }

    /**
     * If true, checks whether you have the required permissions to perform the action.
     *
     * @return dryRun
     */
    @javax.annotation.Nullable
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public CreateApiAccessRuleRequest ipRanges(List<String> ipRanges) {

        this.ipRanges = ipRanges;
        return this;
    }

    public CreateApiAccessRuleRequest addIpRangesItem(String ipRangesItem) {
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
        CreateApiAccessRuleRequest createApiAccessRuleRequest = (CreateApiAccessRuleRequest) o;
        return Objects.equals(this.caIds, createApiAccessRuleRequest.caIds)
                && Objects.equals(this.cns, createApiAccessRuleRequest.cns)
                && Objects.equals(this.description, createApiAccessRuleRequest.description)
                && Objects.equals(this.dryRun, createApiAccessRuleRequest.dryRun)
                && Objects.equals(this.ipRanges, createApiAccessRuleRequest.ipRanges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caIds, cns, description, dryRun, ipRanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApiAccessRuleRequest {\n");
        sb.append("    caIds: ").append(toIndentedString(caIds)).append("\n");
        sb.append("    cns: ").append(toIndentedString(cns)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
        openapiFields.add("CaIds");
        openapiFields.add("Cns");
        openapiFields.add("Description");
        openapiFields.add("DryRun");
        openapiFields.add("IpRanges");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CreateApiAccessRuleRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateApiAccessRuleRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateApiAccessRuleRequest is not"
                                        + " found in the empty JSON string",
                                CreateApiAccessRuleRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateApiAccessRuleRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateApiAccessRuleRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
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
        if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull())
                && !jsonObj.get("Description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Description").toString()));
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
            if (!CreateApiAccessRuleRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateApiAccessRuleRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateApiAccessRuleRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateApiAccessRuleRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateApiAccessRuleRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateApiAccessRuleRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateApiAccessRuleRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateApiAccessRuleRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateApiAccessRuleRequest
     * @throws IOException if the JSON string is invalid with respect to CreateApiAccessRuleRequest
     */
    public static CreateApiAccessRuleRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateApiAccessRuleRequest.class);
    }

    /**
     * Convert an instance of CreateApiAccessRuleRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

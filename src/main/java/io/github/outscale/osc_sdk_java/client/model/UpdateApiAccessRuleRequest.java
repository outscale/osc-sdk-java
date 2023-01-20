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

/** UpdateApiAccessRuleRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateApiAccessRuleRequest {
    public static final String SERIALIZED_NAME_API_ACCESS_RULE_ID = "ApiAccessRuleId";

    @SerializedName(SERIALIZED_NAME_API_ACCESS_RULE_ID)
    private String apiAccessRuleId;

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

    public UpdateApiAccessRuleRequest() {}

    public UpdateApiAccessRuleRequest apiAccessRuleId(String apiAccessRuleId) {

        this.apiAccessRuleId = apiAccessRuleId;
        return this;
    }

    /**
     * The ID of the API access rule you want to update.
     *
     * @return apiAccessRuleId
     */
    @javax.annotation.Nonnull
    public String getApiAccessRuleId() {
        return apiAccessRuleId;
    }

    public void setApiAccessRuleId(String apiAccessRuleId) {
        this.apiAccessRuleId = apiAccessRuleId;
    }

    public UpdateApiAccessRuleRequest caIds(List<String> caIds) {

        this.caIds = caIds;
        return this;
    }

    public UpdateApiAccessRuleRequest addCaIdsItem(String caIdsItem) {
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

    public UpdateApiAccessRuleRequest cns(List<String> cns) {

        this.cns = cns;
        return this;
    }

    public UpdateApiAccessRuleRequest addCnsItem(String cnsItem) {
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

    public UpdateApiAccessRuleRequest description(String description) {

        this.description = description;
        return this;
    }

    /**
     * A new description for the API access rule.
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

    public UpdateApiAccessRuleRequest dryRun(Boolean dryRun) {

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

    public UpdateApiAccessRuleRequest ipRanges(List<String> ipRanges) {

        this.ipRanges = ipRanges;
        return this;
    }

    public UpdateApiAccessRuleRequest addIpRangesItem(String ipRangesItem) {
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
        UpdateApiAccessRuleRequest updateApiAccessRuleRequest = (UpdateApiAccessRuleRequest) o;
        return Objects.equals(this.apiAccessRuleId, updateApiAccessRuleRequest.apiAccessRuleId)
                && Objects.equals(this.caIds, updateApiAccessRuleRequest.caIds)
                && Objects.equals(this.cns, updateApiAccessRuleRequest.cns)
                && Objects.equals(this.description, updateApiAccessRuleRequest.description)
                && Objects.equals(this.dryRun, updateApiAccessRuleRequest.dryRun)
                && Objects.equals(this.ipRanges, updateApiAccessRuleRequest.ipRanges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiAccessRuleId, caIds, cns, description, dryRun, ipRanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateApiAccessRuleRequest {\n");
        sb.append("    apiAccessRuleId: ").append(toIndentedString(apiAccessRuleId)).append("\n");
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
        openapiFields.add("ApiAccessRuleId");
        openapiFields.add("CaIds");
        openapiFields.add("Cns");
        openapiFields.add("Description");
        openapiFields.add("DryRun");
        openapiFields.add("IpRanges");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("ApiAccessRuleId");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to UpdateApiAccessRuleRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!UpdateApiAccessRuleRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateApiAccessRuleRequest is not"
                                        + " found in the empty JSON string",
                                UpdateApiAccessRuleRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!UpdateApiAccessRuleRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateApiAccessRuleRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateApiAccessRuleRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("ApiAccessRuleId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ApiAccessRuleId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("ApiAccessRuleId").toString()));
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
            if (!UpdateApiAccessRuleRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateApiAccessRuleRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateApiAccessRuleRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateApiAccessRuleRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateApiAccessRuleRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateApiAccessRuleRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateApiAccessRuleRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateApiAccessRuleRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateApiAccessRuleRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateApiAccessRuleRequest
     */
    public static UpdateApiAccessRuleRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateApiAccessRuleRequest.class);
    }

    /**
     * Convert an instance of UpdateApiAccessRuleRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

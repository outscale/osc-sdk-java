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

/** DeleteSecurityGroupRuleRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeleteSecurityGroupRuleRequest {
    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_FLOW = "Flow";

    @SerializedName(SERIALIZED_NAME_FLOW)
    private String flow;

    public static final String SERIALIZED_NAME_FROM_PORT_RANGE = "FromPortRange";

    @SerializedName(SERIALIZED_NAME_FROM_PORT_RANGE)
    private Integer fromPortRange;

    public static final String SERIALIZED_NAME_IP_PROTOCOL = "IpProtocol";

    @SerializedName(SERIALIZED_NAME_IP_PROTOCOL)
    private String ipProtocol;

    public static final String SERIALIZED_NAME_IP_RANGE = "IpRange";

    @SerializedName(SERIALIZED_NAME_IP_RANGE)
    private String ipRange;

    public static final String SERIALIZED_NAME_RULES = "Rules";

    @SerializedName(SERIALIZED_NAME_RULES)
    private List<SecurityGroupRule> rules = null;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_ACCOUNT_ID_TO_UNLINK =
            "SecurityGroupAccountIdToUnlink";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ACCOUNT_ID_TO_UNLINK)
    private String securityGroupAccountIdToUnlink;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "SecurityGroupId";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
    private String securityGroupId;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_NAME_TO_UNLINK =
            "SecurityGroupNameToUnlink";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_NAME_TO_UNLINK)
    private String securityGroupNameToUnlink;

    public static final String SERIALIZED_NAME_TO_PORT_RANGE = "ToPortRange";

    @SerializedName(SERIALIZED_NAME_TO_PORT_RANGE)
    private Integer toPortRange;

    public DeleteSecurityGroupRuleRequest() {}

    public DeleteSecurityGroupRuleRequest dryRun(Boolean dryRun) {

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

    public DeleteSecurityGroupRuleRequest flow(String flow) {

        this.flow = flow;
        return this;
    }

    /**
     * The direction of the flow: &#x60;Inbound&#x60; or &#x60;Outbound&#x60;. You can specify
     * &#x60;Outbound&#x60; for Nets only.
     *
     * @return flow
     */
    @javax.annotation.Nonnull
    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public DeleteSecurityGroupRuleRequest fromPortRange(Integer fromPortRange) {

        this.fromPortRange = fromPortRange;
        return this;
    }

    /**
     * The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
     *
     * @return fromPortRange
     */
    @javax.annotation.Nullable
    public Integer getFromPortRange() {
        return fromPortRange;
    }

    public void setFromPortRange(Integer fromPortRange) {
        this.fromPortRange = fromPortRange;
    }

    public DeleteSecurityGroupRuleRequest ipProtocol(String ipProtocol) {

        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * The IP protocol name (&#x60;tcp&#x60;, &#x60;udp&#x60;, &#x60;icmp&#x60;, or &#x60;-1&#x60;
     * for all protocols). By default, &#x60;-1&#x60;. In a Net, this can also be an IP protocol
     * number. For more information, see the [IANA.org
     * website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
     *
     * @return ipProtocol
     */
    @javax.annotation.Nullable
    public String getIpProtocol() {
        return ipProtocol;
    }

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public DeleteSecurityGroupRuleRequest ipRange(String ipRange) {

        this.ipRange = ipRange;
        return this;
    }

    /**
     * The IP range for the security group rule, in CIDR notation (for example,
     * &#x60;10.0.0.0/16&#x60;).
     *
     * @return ipRange
     */
    @javax.annotation.Nullable
    public String getIpRange() {
        return ipRange;
    }

    public void setIpRange(String ipRange) {
        this.ipRange = ipRange;
    }

    public DeleteSecurityGroupRuleRequest rules(List<SecurityGroupRule> rules) {

        this.rules = rules;
        return this;
    }

    public DeleteSecurityGroupRuleRequest addRulesItem(SecurityGroupRule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    /**
     * One or more rules you want to delete from the security group.
     *
     * @return rules
     */
    @javax.annotation.Nullable
    public List<SecurityGroupRule> getRules() {
        return rules;
    }

    public void setRules(List<SecurityGroupRule> rules) {
        this.rules = rules;
    }

    public DeleteSecurityGroupRuleRequest securityGroupAccountIdToUnlink(
            String securityGroupAccountIdToUnlink) {

        this.securityGroupAccountIdToUnlink = securityGroupAccountIdToUnlink;
        return this;
    }

    /**
     * The account ID of the owner of the security group you want to delete a rule from.
     *
     * @return securityGroupAccountIdToUnlink
     */
    @javax.annotation.Nullable
    public String getSecurityGroupAccountIdToUnlink() {
        return securityGroupAccountIdToUnlink;
    }

    public void setSecurityGroupAccountIdToUnlink(String securityGroupAccountIdToUnlink) {
        this.securityGroupAccountIdToUnlink = securityGroupAccountIdToUnlink;
    }

    public DeleteSecurityGroupRuleRequest securityGroupId(String securityGroupId) {

        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * The ID of the security group you want to delete a rule from.
     *
     * @return securityGroupId
     */
    @javax.annotation.Nonnull
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public DeleteSecurityGroupRuleRequest securityGroupNameToUnlink(
            String securityGroupNameToUnlink) {

        this.securityGroupNameToUnlink = securityGroupNameToUnlink;
        return this;
    }

    /**
     * The ID of the source security group. If you are in the Public Cloud, you can also specify the
     * name of the source security group.
     *
     * @return securityGroupNameToUnlink
     */
    @javax.annotation.Nullable
    public String getSecurityGroupNameToUnlink() {
        return securityGroupNameToUnlink;
    }

    public void setSecurityGroupNameToUnlink(String securityGroupNameToUnlink) {
        this.securityGroupNameToUnlink = securityGroupNameToUnlink;
    }

    public DeleteSecurityGroupRuleRequest toPortRange(Integer toPortRange) {

        this.toPortRange = toPortRange;
        return this;
    }

    /**
     * The end of the port range for the TCP and UDP protocols, or an ICMP code number.
     *
     * @return toPortRange
     */
    @javax.annotation.Nullable
    public Integer getToPortRange() {
        return toPortRange;
    }

    public void setToPortRange(Integer toPortRange) {
        this.toPortRange = toPortRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSecurityGroupRuleRequest deleteSecurityGroupRuleRequest =
                (DeleteSecurityGroupRuleRequest) o;
        return Objects.equals(this.dryRun, deleteSecurityGroupRuleRequest.dryRun)
                && Objects.equals(this.flow, deleteSecurityGroupRuleRequest.flow)
                && Objects.equals(this.fromPortRange, deleteSecurityGroupRuleRequest.fromPortRange)
                && Objects.equals(this.ipProtocol, deleteSecurityGroupRuleRequest.ipProtocol)
                && Objects.equals(this.ipRange, deleteSecurityGroupRuleRequest.ipRange)
                && Objects.equals(this.rules, deleteSecurityGroupRuleRequest.rules)
                && Objects.equals(
                        this.securityGroupAccountIdToUnlink,
                        deleteSecurityGroupRuleRequest.securityGroupAccountIdToUnlink)
                && Objects.equals(
                        this.securityGroupId, deleteSecurityGroupRuleRequest.securityGroupId)
                && Objects.equals(
                        this.securityGroupNameToUnlink,
                        deleteSecurityGroupRuleRequest.securityGroupNameToUnlink)
                && Objects.equals(this.toPortRange, deleteSecurityGroupRuleRequest.toPortRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                dryRun,
                flow,
                fromPortRange,
                ipProtocol,
                ipRange,
                rules,
                securityGroupAccountIdToUnlink,
                securityGroupId,
                securityGroupNameToUnlink,
                toPortRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSecurityGroupRuleRequest {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
        sb.append("    fromPortRange: ").append(toIndentedString(fromPortRange)).append("\n");
        sb.append("    ipProtocol: ").append(toIndentedString(ipProtocol)).append("\n");
        sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    securityGroupAccountIdToUnlink: ")
                .append(toIndentedString(securityGroupAccountIdToUnlink))
                .append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    securityGroupNameToUnlink: ")
                .append(toIndentedString(securityGroupNameToUnlink))
                .append("\n");
        sb.append("    toPortRange: ").append(toIndentedString(toPortRange)).append("\n");
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
        openapiFields.add("DryRun");
        openapiFields.add("Flow");
        openapiFields.add("FromPortRange");
        openapiFields.add("IpProtocol");
        openapiFields.add("IpRange");
        openapiFields.add("Rules");
        openapiFields.add("SecurityGroupAccountIdToUnlink");
        openapiFields.add("SecurityGroupId");
        openapiFields.add("SecurityGroupNameToUnlink");
        openapiFields.add("ToPortRange");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("Flow");
        openapiRequiredFields.add("SecurityGroupId");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to
     *     DeleteSecurityGroupRuleRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!DeleteSecurityGroupRuleRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeleteSecurityGroupRuleRequest is not"
                                        + " found in the empty JSON string",
                                DeleteSecurityGroupRuleRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!DeleteSecurityGroupRuleRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DeleteSecurityGroupRuleRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : DeleteSecurityGroupRuleRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("Flow").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Flow` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Flow").toString()));
        }
        if ((jsonObj.get("IpProtocol") != null && !jsonObj.get("IpProtocol").isJsonNull())
                && !jsonObj.get("IpProtocol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `IpProtocol` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("IpProtocol").toString()));
        }
        if ((jsonObj.get("IpRange") != null && !jsonObj.get("IpRange").isJsonNull())
                && !jsonObj.get("IpRange").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `IpRange` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("IpRange").toString()));
        }
        if (jsonObj.get("Rules") != null && !jsonObj.get("Rules").isJsonNull()) {
            JsonArray jsonArrayrules = jsonObj.getAsJsonArray("Rules");
            if (jsonArrayrules != null) {
                // ensure the json data is an array
                if (!jsonObj.get("Rules").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `Rules` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("Rules").toString()));
                }

                // validate the optional field `Rules` (array)
                for (int i = 0; i < jsonArrayrules.size(); i++) {
                    SecurityGroupRule.validateJsonObject(jsonArrayrules.get(i).getAsJsonObject());
                }
                ;
            }
        }
        if ((jsonObj.get("SecurityGroupAccountIdToUnlink") != null
                        && !jsonObj.get("SecurityGroupAccountIdToUnlink").isJsonNull())
                && !jsonObj.get("SecurityGroupAccountIdToUnlink").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SecurityGroupAccountIdToUnlink` to be a primitive"
                                    + " type in the JSON string but got `%s`",
                            jsonObj.get("SecurityGroupAccountIdToUnlink").toString()));
        }
        if (!jsonObj.get("SecurityGroupId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SecurityGroupId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("SecurityGroupId").toString()));
        }
        if ((jsonObj.get("SecurityGroupNameToUnlink") != null
                        && !jsonObj.get("SecurityGroupNameToUnlink").isJsonNull())
                && !jsonObj.get("SecurityGroupNameToUnlink").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SecurityGroupNameToUnlink` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("SecurityGroupNameToUnlink").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeleteSecurityGroupRuleRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeleteSecurityGroupRuleRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeleteSecurityGroupRuleRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(DeleteSecurityGroupRuleRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeleteSecurityGroupRuleRequest>() {
                        @Override
                        public void write(JsonWriter out, DeleteSecurityGroupRuleRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DeleteSecurityGroupRuleRequest read(JsonReader in)
                                throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DeleteSecurityGroupRuleRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeleteSecurityGroupRuleRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     DeleteSecurityGroupRuleRequest
     */
    public static DeleteSecurityGroupRuleRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeleteSecurityGroupRuleRequest.class);
    }

    /**
     * Convert an instance of DeleteSecurityGroupRuleRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/About-the-APIs.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html).  > If you try to sign requests with an invalid access key four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages.  > If you try to sign requests with an invalid password four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).<br /> # Error Codes Reference You can learn more about errors returned by the API in the dedicated [errors page](api-errors.html).
 *
 * The version of the OpenAPI document: 1.30.0
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

/** CreateSecurityGroupRuleRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSecurityGroupRuleRequest {
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

    public static final String SERIALIZED_NAME_SECURITY_GROUP_ACCOUNT_ID_TO_LINK =
            "SecurityGroupAccountIdToLink";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ACCOUNT_ID_TO_LINK)
    private String securityGroupAccountIdToLink;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "SecurityGroupId";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
    private String securityGroupId;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_NAME_TO_LINK =
            "SecurityGroupNameToLink";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_NAME_TO_LINK)
    private String securityGroupNameToLink;

    public static final String SERIALIZED_NAME_TO_PORT_RANGE = "ToPortRange";

    @SerializedName(SERIALIZED_NAME_TO_PORT_RANGE)
    private Integer toPortRange;

    public CreateSecurityGroupRuleRequest() {}

    public CreateSecurityGroupRuleRequest dryRun(Boolean dryRun) {

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

    public CreateSecurityGroupRuleRequest flow(String flow) {

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

    public CreateSecurityGroupRuleRequest fromPortRange(Integer fromPortRange) {

        this.fromPortRange = fromPortRange;
        return this;
    }

    /**
     * The beginning of the port range for the TCP and UDP protocols, or an ICMP type number. If you
     * specify this parameter, you cannot specify the &#x60;Rules&#x60; parameter and its
     * subparameters.
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

    public CreateSecurityGroupRuleRequest ipProtocol(String ipProtocol) {

        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * The IP protocol name (&#x60;tcp&#x60;, &#x60;udp&#x60;, &#x60;icmp&#x60;, or &#x60;-1&#x60;
     * for all protocols). By default, &#x60;-1&#x60;. In a Net, this can also be an IP protocol
     * number. For more information, see the [IANA.org
     * website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml). If you
     * specify this parameter, you cannot specify the &#x60;Rules&#x60; parameter and its
     * subparameters.
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

    public CreateSecurityGroupRuleRequest ipRange(String ipRange) {

        this.ipRange = ipRange;
        return this;
    }

    /**
     * The IP range for the security group rule, in CIDR notation (for example, 10.0.0.0/16). If you
     * specify this parameter, you cannot specify the &#x60;Rules&#x60; parameter and its
     * subparameters.
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

    public CreateSecurityGroupRuleRequest rules(List<SecurityGroupRule> rules) {

        this.rules = rules;
        return this;
    }

    public CreateSecurityGroupRuleRequest addRulesItem(SecurityGroupRule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    /**
     * Information about the security group rule to create. If you specify this parent parameter and
     * its subparameters, you cannot specify the following parent parameters:
     * &#x60;FromPortRange&#x60;, &#x60;IpProtocol&#x60;, &#x60;IpRange&#x60;, and
     * &#x60;ToPortRange&#x60;.
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

    public CreateSecurityGroupRuleRequest securityGroupAccountIdToLink(
            String securityGroupAccountIdToLink) {

        this.securityGroupAccountIdToLink = securityGroupAccountIdToLink;
        return this;
    }

    /**
     * The account ID that owns the source or destination security group specified in the
     * &#x60;SecurityGroupNameToLink&#x60; parameter.
     *
     * @return securityGroupAccountIdToLink
     */
    @javax.annotation.Nullable
    public String getSecurityGroupAccountIdToLink() {
        return securityGroupAccountIdToLink;
    }

    public void setSecurityGroupAccountIdToLink(String securityGroupAccountIdToLink) {
        this.securityGroupAccountIdToLink = securityGroupAccountIdToLink;
    }

    public CreateSecurityGroupRuleRequest securityGroupId(String securityGroupId) {

        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * The ID of the security group for which you want to create a rule.
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

    public CreateSecurityGroupRuleRequest securityGroupNameToLink(String securityGroupNameToLink) {

        this.securityGroupNameToLink = securityGroupNameToLink;
        return this;
    }

    /**
     * The ID of a source or destination security group that you want to link to the security group
     * of the rule.
     *
     * @return securityGroupNameToLink
     */
    @javax.annotation.Nullable
    public String getSecurityGroupNameToLink() {
        return securityGroupNameToLink;
    }

    public void setSecurityGroupNameToLink(String securityGroupNameToLink) {
        this.securityGroupNameToLink = securityGroupNameToLink;
    }

    public CreateSecurityGroupRuleRequest toPortRange(Integer toPortRange) {

        this.toPortRange = toPortRange;
        return this;
    }

    /**
     * The end of the port range for the TCP and UDP protocols, or an ICMP code number. If you
     * specify this parameter, you cannot specify the &#x60;Rules&#x60; parameter and its
     * subparameters.
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
        CreateSecurityGroupRuleRequest createSecurityGroupRuleRequest =
                (CreateSecurityGroupRuleRequest) o;
        return Objects.equals(this.dryRun, createSecurityGroupRuleRequest.dryRun)
                && Objects.equals(this.flow, createSecurityGroupRuleRequest.flow)
                && Objects.equals(this.fromPortRange, createSecurityGroupRuleRequest.fromPortRange)
                && Objects.equals(this.ipProtocol, createSecurityGroupRuleRequest.ipProtocol)
                && Objects.equals(this.ipRange, createSecurityGroupRuleRequest.ipRange)
                && Objects.equals(this.rules, createSecurityGroupRuleRequest.rules)
                && Objects.equals(
                        this.securityGroupAccountIdToLink,
                        createSecurityGroupRuleRequest.securityGroupAccountIdToLink)
                && Objects.equals(
                        this.securityGroupId, createSecurityGroupRuleRequest.securityGroupId)
                && Objects.equals(
                        this.securityGroupNameToLink,
                        createSecurityGroupRuleRequest.securityGroupNameToLink)
                && Objects.equals(this.toPortRange, createSecurityGroupRuleRequest.toPortRange);
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
                securityGroupAccountIdToLink,
                securityGroupId,
                securityGroupNameToLink,
                toPortRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityGroupRuleRequest {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
        sb.append("    fromPortRange: ").append(toIndentedString(fromPortRange)).append("\n");
        sb.append("    ipProtocol: ").append(toIndentedString(ipProtocol)).append("\n");
        sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    securityGroupAccountIdToLink: ")
                .append(toIndentedString(securityGroupAccountIdToLink))
                .append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    securityGroupNameToLink: ")
                .append(toIndentedString(securityGroupNameToLink))
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
        openapiFields.add("SecurityGroupAccountIdToLink");
        openapiFields.add("SecurityGroupId");
        openapiFields.add("SecurityGroupNameToLink");
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
     *     CreateSecurityGroupRuleRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateSecurityGroupRuleRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateSecurityGroupRuleRequest is not"
                                        + " found in the empty JSON string",
                                CreateSecurityGroupRuleRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateSecurityGroupRuleRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateSecurityGroupRuleRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateSecurityGroupRuleRequest.openapiRequiredFields) {
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
        if ((jsonObj.get("SecurityGroupAccountIdToLink") != null
                        && !jsonObj.get("SecurityGroupAccountIdToLink").isJsonNull())
                && !jsonObj.get("SecurityGroupAccountIdToLink").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SecurityGroupAccountIdToLink` to be a primitive"
                                    + " type in the JSON string but got `%s`",
                            jsonObj.get("SecurityGroupAccountIdToLink").toString()));
        }
        if (!jsonObj.get("SecurityGroupId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SecurityGroupId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("SecurityGroupId").toString()));
        }
        if ((jsonObj.get("SecurityGroupNameToLink") != null
                        && !jsonObj.get("SecurityGroupNameToLink").isJsonNull())
                && !jsonObj.get("SecurityGroupNameToLink").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SecurityGroupNameToLink` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("SecurityGroupNameToLink").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateSecurityGroupRuleRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateSecurityGroupRuleRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateSecurityGroupRuleRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CreateSecurityGroupRuleRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateSecurityGroupRuleRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateSecurityGroupRuleRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateSecurityGroupRuleRequest read(JsonReader in)
                                throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateSecurityGroupRuleRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateSecurityGroupRuleRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     CreateSecurityGroupRuleRequest
     */
    public static CreateSecurityGroupRuleRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateSecurityGroupRuleRequest.class);
    }

    /**
     * Convert an instance of CreateSecurityGroupRuleRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

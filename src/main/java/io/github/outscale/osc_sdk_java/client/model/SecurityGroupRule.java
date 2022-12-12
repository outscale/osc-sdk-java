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

/** Information about the security group rule. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityGroupRule {
    public static final String SERIALIZED_NAME_FROM_PORT_RANGE = "FromPortRange";

    @SerializedName(SERIALIZED_NAME_FROM_PORT_RANGE)
    private Integer fromPortRange;

    public static final String SERIALIZED_NAME_IP_PROTOCOL = "IpProtocol";

    @SerializedName(SERIALIZED_NAME_IP_PROTOCOL)
    private String ipProtocol;

    public static final String SERIALIZED_NAME_IP_RANGES = "IpRanges";

    @SerializedName(SERIALIZED_NAME_IP_RANGES)
    private List<String> ipRanges = null;

    public static final String SERIALIZED_NAME_SECURITY_GROUPS_MEMBERS = "SecurityGroupsMembers";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS_MEMBERS)
    private List<SecurityGroupsMember> securityGroupsMembers = null;

    public static final String SERIALIZED_NAME_SERVICE_IDS = "ServiceIds";

    @SerializedName(SERIALIZED_NAME_SERVICE_IDS)
    private List<String> serviceIds = null;

    public static final String SERIALIZED_NAME_TO_PORT_RANGE = "ToPortRange";

    @SerializedName(SERIALIZED_NAME_TO_PORT_RANGE)
    private Integer toPortRange;

    public SecurityGroupRule() {}

    public SecurityGroupRule fromPortRange(Integer fromPortRange) {

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

    public SecurityGroupRule ipProtocol(String ipProtocol) {

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

    public SecurityGroupRule ipRanges(List<String> ipRanges) {

        this.ipRanges = ipRanges;
        return this;
    }

    public SecurityGroupRule addIpRangesItem(String ipRangesItem) {
        if (this.ipRanges == null) {
            this.ipRanges = new ArrayList<>();
        }
        this.ipRanges.add(ipRangesItem);
        return this;
    }

    /**
     * One or more IP ranges for the security group rules, in CIDR notation (for example,
     * &#x60;10.0.0.0/16&#x60;).
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

    public SecurityGroupRule securityGroupsMembers(
            List<SecurityGroupsMember> securityGroupsMembers) {

        this.securityGroupsMembers = securityGroupsMembers;
        return this;
    }

    public SecurityGroupRule addSecurityGroupsMembersItem(
            SecurityGroupsMember securityGroupsMembersItem) {
        if (this.securityGroupsMembers == null) {
            this.securityGroupsMembers = new ArrayList<>();
        }
        this.securityGroupsMembers.add(securityGroupsMembersItem);
        return this;
    }

    /**
     * Information about one or more members of a security group.
     *
     * @return securityGroupsMembers
     */
    @javax.annotation.Nullable
    public List<SecurityGroupsMember> getSecurityGroupsMembers() {
        return securityGroupsMembers;
    }

    public void setSecurityGroupsMembers(List<SecurityGroupsMember> securityGroupsMembers) {
        this.securityGroupsMembers = securityGroupsMembers;
    }

    public SecurityGroupRule serviceIds(List<String> serviceIds) {

        this.serviceIds = serviceIds;
        return this;
    }

    public SecurityGroupRule addServiceIdsItem(String serviceIdsItem) {
        if (this.serviceIds == null) {
            this.serviceIds = new ArrayList<>();
        }
        this.serviceIds.add(serviceIdsItem);
        return this;
    }

    /**
     * One or more service IDs to allow traffic from a Net to access the corresponding OUTSCALE
     * services. For more information, see
     * [ReadNetAccessPointServices](#readnetaccesspointservices).
     *
     * @return serviceIds
     */
    @javax.annotation.Nullable
    public List<String> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(List<String> serviceIds) {
        this.serviceIds = serviceIds;
    }

    public SecurityGroupRule toPortRange(Integer toPortRange) {

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
        SecurityGroupRule securityGroupRule = (SecurityGroupRule) o;
        return Objects.equals(this.fromPortRange, securityGroupRule.fromPortRange)
                && Objects.equals(this.ipProtocol, securityGroupRule.ipProtocol)
                && Objects.equals(this.ipRanges, securityGroupRule.ipRanges)
                && Objects.equals(
                        this.securityGroupsMembers, securityGroupRule.securityGroupsMembers)
                && Objects.equals(this.serviceIds, securityGroupRule.serviceIds)
                && Objects.equals(this.toPortRange, securityGroupRule.toPortRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fromPortRange,
                ipProtocol,
                ipRanges,
                securityGroupsMembers,
                serviceIds,
                toPortRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityGroupRule {\n");
        sb.append("    fromPortRange: ").append(toIndentedString(fromPortRange)).append("\n");
        sb.append("    ipProtocol: ").append(toIndentedString(ipProtocol)).append("\n");
        sb.append("    ipRanges: ").append(toIndentedString(ipRanges)).append("\n");
        sb.append("    securityGroupsMembers: ")
                .append(toIndentedString(securityGroupsMembers))
                .append("\n");
        sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
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
        openapiFields.add("FromPortRange");
        openapiFields.add("IpProtocol");
        openapiFields.add("IpRanges");
        openapiFields.add("SecurityGroupsMembers");
        openapiFields.add("ServiceIds");
        openapiFields.add("ToPortRange");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to SecurityGroupRule
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!SecurityGroupRule.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SecurityGroupRule is not found in the"
                                        + " empty JSON string",
                                SecurityGroupRule.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!SecurityGroupRule.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SecurityGroupRule` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("IpProtocol") != null && !jsonObj.get("IpProtocol").isJsonNull())
                && !jsonObj.get("IpProtocol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `IpProtocol` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("IpProtocol").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("IpRanges") != null && !jsonObj.get("IpRanges").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `IpRanges` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("IpRanges").toString()));
        }
        if (jsonObj.get("SecurityGroupsMembers") != null
                && !jsonObj.get("SecurityGroupsMembers").isJsonNull()) {
            JsonArray jsonArraysecurityGroupsMembers =
                    jsonObj.getAsJsonArray("SecurityGroupsMembers");
            if (jsonArraysecurityGroupsMembers != null) {
                // ensure the json data is an array
                if (!jsonObj.get("SecurityGroupsMembers").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `SecurityGroupsMembers` to be an array in"
                                            + " the JSON string but got `%s`",
                                    jsonObj.get("SecurityGroupsMembers").toString()));
                }

                // validate the optional field `SecurityGroupsMembers` (array)
                for (int i = 0; i < jsonArraysecurityGroupsMembers.size(); i++) {
                    SecurityGroupsMember.validateJsonObject(
                            jsonArraysecurityGroupsMembers.get(i).getAsJsonObject());
                }
                ;
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("ServiceIds") != null && !jsonObj.get("ServiceIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ServiceIds` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("ServiceIds").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SecurityGroupRule.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SecurityGroupRule' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SecurityGroupRule> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SecurityGroupRule.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SecurityGroupRule>() {
                        @Override
                        public void write(JsonWriter out, SecurityGroupRule value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SecurityGroupRule read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SecurityGroupRule given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SecurityGroupRule
     * @throws IOException if the JSON string is invalid with respect to SecurityGroupRule
     */
    public static SecurityGroupRule fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SecurityGroupRule.class);
    }

    /**
     * Convert an instance of SecurityGroupRule to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
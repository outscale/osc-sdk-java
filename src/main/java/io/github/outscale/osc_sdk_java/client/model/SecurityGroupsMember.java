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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Information about a source or destination security group. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityGroupsMember {
    public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private String accountId;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "SecurityGroupId";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
    private String securityGroupId;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_NAME = "SecurityGroupName";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_NAME)
    private String securityGroupName;

    public SecurityGroupsMember() {}

    public SecurityGroupsMember accountId(String accountId) {

        this.accountId = accountId;
        return this;
    }

    /**
     * The account ID that owns the source or destination security group.
     *
     * @return accountId
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public SecurityGroupsMember securityGroupId(String securityGroupId) {

        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * The ID of a source or destination security group that you want to link to the security group
     * of the rule.
     *
     * @return securityGroupId
     */
    @javax.annotation.Nullable
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public SecurityGroupsMember securityGroupName(String securityGroupName) {

        this.securityGroupName = securityGroupName;
        return this;
    }

    /**
     * (Public Cloud only) The name of a source or destination security group that you want to link
     * to the security group of the rule.
     *
     * @return securityGroupName
     */
    @javax.annotation.Nullable
    public String getSecurityGroupName() {
        return securityGroupName;
    }

    public void setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityGroupsMember securityGroupsMember = (SecurityGroupsMember) o;
        return Objects.equals(this.accountId, securityGroupsMember.accountId)
                && Objects.equals(this.securityGroupId, securityGroupsMember.securityGroupId)
                && Objects.equals(this.securityGroupName, securityGroupsMember.securityGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, securityGroupId, securityGroupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityGroupsMember {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    securityGroupName: ")
                .append(toIndentedString(securityGroupName))
                .append("\n");
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
        openapiFields.add("AccountId");
        openapiFields.add("SecurityGroupId");
        openapiFields.add("SecurityGroupName");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to SecurityGroupsMember
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!SecurityGroupsMember.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SecurityGroupsMember is not found in"
                                        + " the empty JSON string",
                                SecurityGroupsMember.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!SecurityGroupsMember.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SecurityGroupsMember` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("AccountId") != null && !jsonObj.get("AccountId").isJsonNull())
                && !jsonObj.get("AccountId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `AccountId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("AccountId").toString()));
        }
        if ((jsonObj.get("SecurityGroupId") != null && !jsonObj.get("SecurityGroupId").isJsonNull())
                && !jsonObj.get("SecurityGroupId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SecurityGroupId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("SecurityGroupId").toString()));
        }
        if ((jsonObj.get("SecurityGroupName") != null
                        && !jsonObj.get("SecurityGroupName").isJsonNull())
                && !jsonObj.get("SecurityGroupName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SecurityGroupName` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("SecurityGroupName").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SecurityGroupsMember.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SecurityGroupsMember' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SecurityGroupsMember> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SecurityGroupsMember.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SecurityGroupsMember>() {
                        @Override
                        public void write(JsonWriter out, SecurityGroupsMember value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SecurityGroupsMember read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SecurityGroupsMember given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SecurityGroupsMember
     * @throws IOException if the JSON string is invalid with respect to SecurityGroupsMember
     */
    public static SecurityGroupsMember fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SecurityGroupsMember.class);
    }

    /**
     * Convert an instance of SecurityGroupsMember to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

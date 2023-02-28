/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.25
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

/** DeleteSecurityGroupRuleResponse */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeleteSecurityGroupRuleResponse {
    public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";

    @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
    private ResponseContext responseContext;

    public static final String SERIALIZED_NAME_SECURITY_GROUP = "SecurityGroup";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP)
    private SecurityGroup securityGroup;

    public DeleteSecurityGroupRuleResponse() {}

    public DeleteSecurityGroupRuleResponse responseContext(ResponseContext responseContext) {

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

    public DeleteSecurityGroupRuleResponse securityGroup(SecurityGroup securityGroup) {

        this.securityGroup = securityGroup;
        return this;
    }

    /**
     * Get securityGroup
     *
     * @return securityGroup
     */
    @javax.annotation.Nullable
    public SecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(SecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSecurityGroupRuleResponse deleteSecurityGroupRuleResponse =
                (DeleteSecurityGroupRuleResponse) o;
        return Objects.equals(this.responseContext, deleteSecurityGroupRuleResponse.responseContext)
                && Objects.equals(
                        this.securityGroup, deleteSecurityGroupRuleResponse.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseContext, securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSecurityGroupRuleResponse {\n");
        sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
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
        openapiFields.add("SecurityGroup");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to
     *     DeleteSecurityGroupRuleResponse
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!DeleteSecurityGroupRuleResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeleteSecurityGroupRuleResponse is"
                                        + " not found in the empty JSON string",
                                DeleteSecurityGroupRuleResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!DeleteSecurityGroupRuleResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DeleteSecurityGroupRuleResponse` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // validate the optional field `ResponseContext`
        if (jsonObj.get("ResponseContext") != null
                && !jsonObj.get("ResponseContext").isJsonNull()) {
            ResponseContext.validateJsonObject(jsonObj.getAsJsonObject("ResponseContext"));
        }
        // validate the optional field `SecurityGroup`
        if (jsonObj.get("SecurityGroup") != null && !jsonObj.get("SecurityGroup").isJsonNull()) {
            SecurityGroup.validateJsonObject(jsonObj.getAsJsonObject("SecurityGroup"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeleteSecurityGroupRuleResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeleteSecurityGroupRuleResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeleteSecurityGroupRuleResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(DeleteSecurityGroupRuleResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeleteSecurityGroupRuleResponse>() {
                        @Override
                        public void write(JsonWriter out, DeleteSecurityGroupRuleResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DeleteSecurityGroupRuleResponse read(JsonReader in)
                                throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DeleteSecurityGroupRuleResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeleteSecurityGroupRuleResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     DeleteSecurityGroupRuleResponse
     */
    public static DeleteSecurityGroupRuleResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeleteSecurityGroupRuleResponse.class);
    }

    /**
     * Convert an instance of DeleteSecurityGroupRuleResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

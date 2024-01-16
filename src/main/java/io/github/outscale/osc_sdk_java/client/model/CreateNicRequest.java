/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html). ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages. ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).
 *
 * The version of the OpenAPI document: 1.28.5
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

/** CreateNicRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateNicRequest {
    public static final String SERIALIZED_NAME_DESCRIPTION = "Description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_PRIVATE_IPS = "PrivateIps";

    @SerializedName(SERIALIZED_NAME_PRIVATE_IPS)
    private List<PrivateIpLight> privateIps = null;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
    private List<String> securityGroupIds = null;

    public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";

    @SerializedName(SERIALIZED_NAME_SUBNET_ID)
    private String subnetId;

    public CreateNicRequest() {}

    public CreateNicRequest description(String description) {

        this.description = description;
        return this;
    }

    /**
     * A description for the NIC.
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

    public CreateNicRequest dryRun(Boolean dryRun) {

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

    public CreateNicRequest privateIps(List<PrivateIpLight> privateIps) {

        this.privateIps = privateIps;
        return this;
    }

    public CreateNicRequest addPrivateIpsItem(PrivateIpLight privateIpsItem) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        this.privateIps.add(privateIpsItem);
        return this;
    }

    /**
     * The primary private IP for the NIC.&lt;br /&gt; This IP must be within the IP range of the
     * Subnet that you specify with the &#x60;SubnetId&#x60; attribute.&lt;br /&gt; If you do not
     * specify this attribute, a random private IP is selected within the IP range of the Subnet.
     *
     * @return privateIps
     */
    @javax.annotation.Nullable
    public List<PrivateIpLight> getPrivateIps() {
        return privateIps;
    }

    public void setPrivateIps(List<PrivateIpLight> privateIps) {
        this.privateIps = privateIps;
    }

    public CreateNicRequest securityGroupIds(List<String> securityGroupIds) {

        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public CreateNicRequest addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    /**
     * One or more IDs of security groups for the NIC.
     *
     * @return securityGroupIds
     */
    @javax.annotation.Nullable
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public CreateNicRequest subnetId(String subnetId) {

        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ID of the Subnet in which you want to create the NIC.
     *
     * @return subnetId
     */
    @javax.annotation.Nonnull
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNicRequest createNicRequest = (CreateNicRequest) o;
        return Objects.equals(this.description, createNicRequest.description)
                && Objects.equals(this.dryRun, createNicRequest.dryRun)
                && Objects.equals(this.privateIps, createNicRequest.privateIps)
                && Objects.equals(this.securityGroupIds, createNicRequest.securityGroupIds)
                && Objects.equals(this.subnetId, createNicRequest.subnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, dryRun, privateIps, securityGroupIds, subnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNicRequest {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
        openapiFields.add("Description");
        openapiFields.add("DryRun");
        openapiFields.add("PrivateIps");
        openapiFields.add("SecurityGroupIds");
        openapiFields.add("SubnetId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("SubnetId");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CreateNicRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateNicRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateNicRequest is not found in the"
                                        + " empty JSON string",
                                CreateNicRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateNicRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateNicRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateNicRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull())
                && !jsonObj.get("Description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Description").toString()));
        }
        if (jsonObj.get("PrivateIps") != null && !jsonObj.get("PrivateIps").isJsonNull()) {
            JsonArray jsonArrayprivateIps = jsonObj.getAsJsonArray("PrivateIps");
            if (jsonArrayprivateIps != null) {
                // ensure the json data is an array
                if (!jsonObj.get("PrivateIps").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `PrivateIps` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("PrivateIps").toString()));
                }

                // validate the optional field `PrivateIps` (array)
                for (int i = 0; i < jsonArrayprivateIps.size(); i++) {
                    PrivateIpLight.validateJsonObject(jsonArrayprivateIps.get(i).getAsJsonObject());
                }
                ;
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("SecurityGroupIds") != null
                && !jsonObj.get("SecurityGroupIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SecurityGroupIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SecurityGroupIds").toString()));
        }
        if (!jsonObj.get("SubnetId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubnetId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SubnetId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateNicRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateNicRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateNicRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateNicRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateNicRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateNicRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateNicRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateNicRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateNicRequest
     * @throws IOException if the JSON string is invalid with respect to CreateNicRequest
     */
    public static CreateNicRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateNicRequest.class);
    }

    /**
     * Convert an instance of CreateNicRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

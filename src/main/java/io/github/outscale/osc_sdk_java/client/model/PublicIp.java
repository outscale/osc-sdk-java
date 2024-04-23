/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html).  > If you try to sign requests with an invalid access key four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages.  > If you try to sign requests with an invalid password four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).<br /> # Error Codes Reference You can learn more about errors returned by the API in the dedicated [errors page](api-errors.html).
 *
 * The version of the OpenAPI document: 1.29.3
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

/** Information about the public IP. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PublicIp {
    public static final String SERIALIZED_NAME_LINK_PUBLIC_IP_ID = "LinkPublicIpId";

    @SerializedName(SERIALIZED_NAME_LINK_PUBLIC_IP_ID)
    private String linkPublicIpId;

    public static final String SERIALIZED_NAME_NIC_ACCOUNT_ID = "NicAccountId";

    @SerializedName(SERIALIZED_NAME_NIC_ACCOUNT_ID)
    private String nicAccountId;

    public static final String SERIALIZED_NAME_NIC_ID = "NicId";

    @SerializedName(SERIALIZED_NAME_NIC_ID)
    private String nicId;

    public static final String SERIALIZED_NAME_PRIVATE_IP = "PrivateIp";

    @SerializedName(SERIALIZED_NAME_PRIVATE_IP)
    private String privateIp;

    public static final String SERIALIZED_NAME_PUBLIC_IP = "PublicIp";

    @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
    private String publicIp;

    public static final String SERIALIZED_NAME_PUBLIC_IP_ID = "PublicIpId";

    @SerializedName(SERIALIZED_NAME_PUBLIC_IP_ID)
    private String publicIpId;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public static final String SERIALIZED_NAME_VM_ID = "VmId";

    @SerializedName(SERIALIZED_NAME_VM_ID)
    private String vmId;

    public PublicIp() {}

    public PublicIp linkPublicIpId(String linkPublicIpId) {

        this.linkPublicIpId = linkPublicIpId;
        return this;
    }

    /**
     * (Required in a Net) The ID representing the association of the public IP with the VM or the
     * NIC.
     *
     * @return linkPublicIpId
     */
    @javax.annotation.Nullable
    public String getLinkPublicIpId() {
        return linkPublicIpId;
    }

    public void setLinkPublicIpId(String linkPublicIpId) {
        this.linkPublicIpId = linkPublicIpId;
    }

    public PublicIp nicAccountId(String nicAccountId) {

        this.nicAccountId = nicAccountId;
        return this;
    }

    /**
     * The account ID of the owner of the NIC.
     *
     * @return nicAccountId
     */
    @javax.annotation.Nullable
    public String getNicAccountId() {
        return nicAccountId;
    }

    public void setNicAccountId(String nicAccountId) {
        this.nicAccountId = nicAccountId;
    }

    public PublicIp nicId(String nicId) {

        this.nicId = nicId;
        return this;
    }

    /**
     * The ID of the NIC the public IP is associated with (if any).
     *
     * @return nicId
     */
    @javax.annotation.Nullable
    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public PublicIp privateIp(String privateIp) {

        this.privateIp = privateIp;
        return this;
    }

    /**
     * The private IP associated with the public IP.
     *
     * @return privateIp
     */
    @javax.annotation.Nullable
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public PublicIp publicIp(String publicIp) {

        this.publicIp = publicIp;
        return this;
    }

    /**
     * The public IP.
     *
     * @return publicIp
     */
    @javax.annotation.Nullable
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public PublicIp publicIpId(String publicIpId) {

        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * The allocation ID of the public IP.
     *
     * @return publicIpId
     */
    @javax.annotation.Nullable
    public String getPublicIpId() {
        return publicIpId;
    }

    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    public PublicIp tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public PublicIp addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the public IP.
     *
     * @return tags
     */
    @javax.annotation.Nullable
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public PublicIp vmId(String vmId) {

        this.vmId = vmId;
        return this;
    }

    /**
     * The ID of the VM the public IP is associated with (if any).
     *
     * @return vmId
     */
    @javax.annotation.Nullable
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicIp publicIp = (PublicIp) o;
        return Objects.equals(this.linkPublicIpId, publicIp.linkPublicIpId)
                && Objects.equals(this.nicAccountId, publicIp.nicAccountId)
                && Objects.equals(this.nicId, publicIp.nicId)
                && Objects.equals(this.privateIp, publicIp.privateIp)
                && Objects.equals(this.publicIp, publicIp.publicIp)
                && Objects.equals(this.publicIpId, publicIp.publicIpId)
                && Objects.equals(this.tags, publicIp.tags)
                && Objects.equals(this.vmId, publicIp.vmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                linkPublicIpId, nicAccountId, nicId, privateIp, publicIp, publicIpId, tags, vmId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIp {\n");
        sb.append("    linkPublicIpId: ").append(toIndentedString(linkPublicIpId)).append("\n");
        sb.append("    nicAccountId: ").append(toIndentedString(nicAccountId)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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
        openapiFields.add("LinkPublicIpId");
        openapiFields.add("NicAccountId");
        openapiFields.add("NicId");
        openapiFields.add("PrivateIp");
        openapiFields.add("PublicIp");
        openapiFields.add("PublicIpId");
        openapiFields.add("Tags");
        openapiFields.add("VmId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to PublicIp
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!PublicIp.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PublicIp is not found in the empty"
                                        + " JSON string",
                                PublicIp.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!PublicIp.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `PublicIp` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("LinkPublicIpId") != null && !jsonObj.get("LinkPublicIpId").isJsonNull())
                && !jsonObj.get("LinkPublicIpId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LinkPublicIpId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("LinkPublicIpId").toString()));
        }
        if ((jsonObj.get("NicAccountId") != null && !jsonObj.get("NicAccountId").isJsonNull())
                && !jsonObj.get("NicAccountId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NicAccountId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("NicAccountId").toString()));
        }
        if ((jsonObj.get("NicId") != null && !jsonObj.get("NicId").isJsonNull())
                && !jsonObj.get("NicId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NicId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NicId").toString()));
        }
        if ((jsonObj.get("PrivateIp") != null && !jsonObj.get("PrivateIp").isJsonNull())
                && !jsonObj.get("PrivateIp").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PrivateIp` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PrivateIp").toString()));
        }
        if ((jsonObj.get("PublicIp") != null && !jsonObj.get("PublicIp").isJsonNull())
                && !jsonObj.get("PublicIp").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PublicIp` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PublicIp").toString()));
        }
        if ((jsonObj.get("PublicIpId") != null && !jsonObj.get("PublicIpId").isJsonNull())
                && !jsonObj.get("PublicIpId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PublicIpId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PublicIpId").toString()));
        }
        if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
            JsonArray jsonArraytags = jsonObj.getAsJsonArray("Tags");
            if (jsonArraytags != null) {
                // ensure the json data is an array
                if (!jsonObj.get("Tags").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `Tags` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("Tags").toString()));
                }

                // validate the optional field `Tags` (array)
                for (int i = 0; i < jsonArraytags.size(); i++) {
                    ResourceTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
                }
                ;
            }
        }
        if ((jsonObj.get("VmId") != null && !jsonObj.get("VmId").isJsonNull())
                && !jsonObj.get("VmId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VmId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PublicIp.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PublicIp' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PublicIp> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PublicIp.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PublicIp>() {
                        @Override
                        public void write(JsonWriter out, PublicIp value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PublicIp read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PublicIp given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PublicIp
     * @throws IOException if the JSON string is invalid with respect to PublicIp
     */
    public static PublicIp fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PublicIp.class);
    }

    /**
     * Convert an instance of PublicIp to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

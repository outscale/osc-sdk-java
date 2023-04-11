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

/** Information about the public IP association. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkPublicIp {
    public static final String SERIALIZED_NAME_LINK_PUBLIC_IP_ID = "LinkPublicIpId";

    @SerializedName(SERIALIZED_NAME_LINK_PUBLIC_IP_ID)
    private String linkPublicIpId;

    public static final String SERIALIZED_NAME_PUBLIC_DNS_NAME = "PublicDnsName";

    @SerializedName(SERIALIZED_NAME_PUBLIC_DNS_NAME)
    private String publicDnsName;

    public static final String SERIALIZED_NAME_PUBLIC_IP = "PublicIp";

    @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
    private String publicIp;

    public static final String SERIALIZED_NAME_PUBLIC_IP_ACCOUNT_ID = "PublicIpAccountId";

    @SerializedName(SERIALIZED_NAME_PUBLIC_IP_ACCOUNT_ID)
    private String publicIpAccountId;

    public static final String SERIALIZED_NAME_PUBLIC_IP_ID = "PublicIpId";

    @SerializedName(SERIALIZED_NAME_PUBLIC_IP_ID)
    private String publicIpId;

    public LinkPublicIp() {}

    public LinkPublicIp linkPublicIpId(String linkPublicIpId) {

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

    public LinkPublicIp publicDnsName(String publicDnsName) {

        this.publicDnsName = publicDnsName;
        return this;
    }

    /**
     * The name of the public DNS.
     *
     * @return publicDnsName
     */
    @javax.annotation.Nullable
    public String getPublicDnsName() {
        return publicDnsName;
    }

    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }

    public LinkPublicIp publicIp(String publicIp) {

        this.publicIp = publicIp;
        return this;
    }

    /**
     * The public IP associated with the NIC.
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

    public LinkPublicIp publicIpAccountId(String publicIpAccountId) {

        this.publicIpAccountId = publicIpAccountId;
        return this;
    }

    /**
     * The account ID of the owner of the public IP.
     *
     * @return publicIpAccountId
     */
    @javax.annotation.Nullable
    public String getPublicIpAccountId() {
        return publicIpAccountId;
    }

    public void setPublicIpAccountId(String publicIpAccountId) {
        this.publicIpAccountId = publicIpAccountId;
    }

    public LinkPublicIp publicIpId(String publicIpId) {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkPublicIp linkPublicIp = (LinkPublicIp) o;
        return Objects.equals(this.linkPublicIpId, linkPublicIp.linkPublicIpId)
                && Objects.equals(this.publicDnsName, linkPublicIp.publicDnsName)
                && Objects.equals(this.publicIp, linkPublicIp.publicIp)
                && Objects.equals(this.publicIpAccountId, linkPublicIp.publicIpAccountId)
                && Objects.equals(this.publicIpId, linkPublicIp.publicIpId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkPublicIpId, publicDnsName, publicIp, publicIpAccountId, publicIpId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkPublicIp {\n");
        sb.append("    linkPublicIpId: ").append(toIndentedString(linkPublicIpId)).append("\n");
        sb.append("    publicDnsName: ").append(toIndentedString(publicDnsName)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    publicIpAccountId: ")
                .append(toIndentedString(publicIpAccountId))
                .append("\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
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
        openapiFields.add("PublicDnsName");
        openapiFields.add("PublicIp");
        openapiFields.add("PublicIpAccountId");
        openapiFields.add("PublicIpId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to LinkPublicIp
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!LinkPublicIp.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in LinkPublicIp is not found in the"
                                        + " empty JSON string",
                                LinkPublicIp.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!LinkPublicIp.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `LinkPublicIp` properties. JSON: %s",
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
        if ((jsonObj.get("PublicDnsName") != null && !jsonObj.get("PublicDnsName").isJsonNull())
                && !jsonObj.get("PublicDnsName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PublicDnsName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PublicDnsName").toString()));
        }
        if ((jsonObj.get("PublicIp") != null && !jsonObj.get("PublicIp").isJsonNull())
                && !jsonObj.get("PublicIp").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PublicIp` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PublicIp").toString()));
        }
        if ((jsonObj.get("PublicIpAccountId") != null
                        && !jsonObj.get("PublicIpAccountId").isJsonNull())
                && !jsonObj.get("PublicIpAccountId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PublicIpAccountId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("PublicIpAccountId").toString()));
        }
        if ((jsonObj.get("PublicIpId") != null && !jsonObj.get("PublicIpId").isJsonNull())
                && !jsonObj.get("PublicIpId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PublicIpId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PublicIpId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LinkPublicIp.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LinkPublicIp' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LinkPublicIp> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(LinkPublicIp.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<LinkPublicIp>() {
                        @Override
                        public void write(JsonWriter out, LinkPublicIp value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public LinkPublicIp read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of LinkPublicIp given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LinkPublicIp
     * @throws IOException if the JSON string is invalid with respect to LinkPublicIp
     */
    public static LinkPublicIp fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, LinkPublicIp.class);
    }

    /**
     * Convert an instance of LinkPublicIp to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

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

/** Information about the private IP of the NIC. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PrivateIpLightForVm {
    public static final String SERIALIZED_NAME_IS_PRIMARY = "IsPrimary";

    @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
    private Boolean isPrimary;

    public static final String SERIALIZED_NAME_LINK_PUBLIC_IP = "LinkPublicIp";

    @SerializedName(SERIALIZED_NAME_LINK_PUBLIC_IP)
    private LinkPublicIpLightForVm linkPublicIp;

    public static final String SERIALIZED_NAME_PRIVATE_DNS_NAME = "PrivateDnsName";

    @SerializedName(SERIALIZED_NAME_PRIVATE_DNS_NAME)
    private String privateDnsName;

    public static final String SERIALIZED_NAME_PRIVATE_IP = "PrivateIp";

    @SerializedName(SERIALIZED_NAME_PRIVATE_IP)
    private String privateIp;

    public PrivateIpLightForVm() {}

    public PrivateIpLightForVm isPrimary(Boolean isPrimary) {

        this.isPrimary = isPrimary;
        return this;
    }

    /**
     * If true, the IP is the primary private IP of the NIC.
     *
     * @return isPrimary
     */
    @javax.annotation.Nullable
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public PrivateIpLightForVm linkPublicIp(LinkPublicIpLightForVm linkPublicIp) {

        this.linkPublicIp = linkPublicIp;
        return this;
    }

    /**
     * Get linkPublicIp
     *
     * @return linkPublicIp
     */
    @javax.annotation.Nullable
    public LinkPublicIpLightForVm getLinkPublicIp() {
        return linkPublicIp;
    }

    public void setLinkPublicIp(LinkPublicIpLightForVm linkPublicIp) {
        this.linkPublicIp = linkPublicIp;
    }

    public PrivateIpLightForVm privateDnsName(String privateDnsName) {

        this.privateDnsName = privateDnsName;
        return this;
    }

    /**
     * The name of the private DNS.
     *
     * @return privateDnsName
     */
    @javax.annotation.Nullable
    public String getPrivateDnsName() {
        return privateDnsName;
    }

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    public PrivateIpLightForVm privateIp(String privateIp) {

        this.privateIp = privateIp;
        return this;
    }

    /**
     * The private IP.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivateIpLightForVm privateIpLightForVm = (PrivateIpLightForVm) o;
        return Objects.equals(this.isPrimary, privateIpLightForVm.isPrimary)
                && Objects.equals(this.linkPublicIp, privateIpLightForVm.linkPublicIp)
                && Objects.equals(this.privateDnsName, privateIpLightForVm.privateDnsName)
                && Objects.equals(this.privateIp, privateIpLightForVm.privateIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPrimary, linkPublicIp, privateDnsName, privateIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateIpLightForVm {\n");
        sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
        sb.append("    linkPublicIp: ").append(toIndentedString(linkPublicIp)).append("\n");
        sb.append("    privateDnsName: ").append(toIndentedString(privateDnsName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
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
        openapiFields.add("IsPrimary");
        openapiFields.add("LinkPublicIp");
        openapiFields.add("PrivateDnsName");
        openapiFields.add("PrivateIp");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to PrivateIpLightForVm
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!PrivateIpLightForVm.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PrivateIpLightForVm is not found in"
                                        + " the empty JSON string",
                                PrivateIpLightForVm.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!PrivateIpLightForVm.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `PrivateIpLightForVm` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // validate the optional field `LinkPublicIp`
        if (jsonObj.get("LinkPublicIp") != null && !jsonObj.get("LinkPublicIp").isJsonNull()) {
            LinkPublicIpLightForVm.validateJsonObject(jsonObj.getAsJsonObject("LinkPublicIp"));
        }
        if ((jsonObj.get("PrivateDnsName") != null && !jsonObj.get("PrivateDnsName").isJsonNull())
                && !jsonObj.get("PrivateDnsName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PrivateDnsName` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("PrivateDnsName").toString()));
        }
        if ((jsonObj.get("PrivateIp") != null && !jsonObj.get("PrivateIp").isJsonNull())
                && !jsonObj.get("PrivateIp").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PrivateIp` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PrivateIp").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PrivateIpLightForVm.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PrivateIpLightForVm' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PrivateIpLightForVm> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PrivateIpLightForVm.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PrivateIpLightForVm>() {
                        @Override
                        public void write(JsonWriter out, PrivateIpLightForVm value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PrivateIpLightForVm read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PrivateIpLightForVm given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PrivateIpLightForVm
     * @throws IOException if the JSON string is invalid with respect to PrivateIpLightForVm
     */
    public static PrivateIpLightForVm fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PrivateIpLightForVm.class);
    }

    /**
     * Convert an instance of PrivateIpLightForVm to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

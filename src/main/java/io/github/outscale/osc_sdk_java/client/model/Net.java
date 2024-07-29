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

/** Information about the Net. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Net {
    public static final String SERIALIZED_NAME_DHCP_OPTIONS_SET_ID = "DhcpOptionsSetId";

    @SerializedName(SERIALIZED_NAME_DHCP_OPTIONS_SET_ID)
    private String dhcpOptionsSetId;

    public static final String SERIALIZED_NAME_IP_RANGE = "IpRange";

    @SerializedName(SERIALIZED_NAME_IP_RANGE)
    private String ipRange;

    public static final String SERIALIZED_NAME_NET_ID = "NetId";

    @SerializedName(SERIALIZED_NAME_NET_ID)
    private String netId;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public static final String SERIALIZED_NAME_TENANCY = "Tenancy";

    @SerializedName(SERIALIZED_NAME_TENANCY)
    private String tenancy;

    public Net() {}

    public Net dhcpOptionsSetId(String dhcpOptionsSetId) {

        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }

    /**
     * The ID of the DHCP options set (or &#x60;default&#x60; if you want to associate the default
     * one).
     *
     * @return dhcpOptionsSetId
     */
    @javax.annotation.Nullable
    public String getDhcpOptionsSetId() {
        return dhcpOptionsSetId;
    }

    public void setDhcpOptionsSetId(String dhcpOptionsSetId) {
        this.dhcpOptionsSetId = dhcpOptionsSetId;
    }

    public Net ipRange(String ipRange) {

        this.ipRange = ipRange;
        return this;
    }

    /**
     * The IP range for the Net, in CIDR notation (for example, &#x60;10.0.0.0/16&#x60;).
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

    public Net netId(String netId) {

        this.netId = netId;
        return this;
    }

    /**
     * The ID of the Net.
     *
     * @return netId
     */
    @javax.annotation.Nullable
    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public Net state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the Net (&#x60;pending&#x60; \\| &#x60;available&#x60; \\|
     * &#x60;deleting&#x60;).
     *
     * @return state
     */
    @javax.annotation.Nullable
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Net tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public Net addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the Net.
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

    public Net tenancy(String tenancy) {

        this.tenancy = tenancy;
        return this;
    }

    /**
     * The VM tenancy in a Net.
     *
     * @return tenancy
     */
    @javax.annotation.Nullable
    public String getTenancy() {
        return tenancy;
    }

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Net net = (Net) o;
        return Objects.equals(this.dhcpOptionsSetId, net.dhcpOptionsSetId)
                && Objects.equals(this.ipRange, net.ipRange)
                && Objects.equals(this.netId, net.netId)
                && Objects.equals(this.state, net.state)
                && Objects.equals(this.tags, net.tags)
                && Objects.equals(this.tenancy, net.tenancy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dhcpOptionsSetId, ipRange, netId, state, tags, tenancy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Net {\n");
        sb.append("    dhcpOptionsSetId: ").append(toIndentedString(dhcpOptionsSetId)).append("\n");
        sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
        sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
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
        openapiFields.add("DhcpOptionsSetId");
        openapiFields.add("IpRange");
        openapiFields.add("NetId");
        openapiFields.add("State");
        openapiFields.add("Tags");
        openapiFields.add("Tenancy");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Net
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Net.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Net is not found in the empty JSON"
                                        + " string",
                                Net.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Net.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Net`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("DhcpOptionsSetId") != null
                        && !jsonObj.get("DhcpOptionsSetId").isJsonNull())
                && !jsonObj.get("DhcpOptionsSetId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `DhcpOptionsSetId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("DhcpOptionsSetId").toString()));
        }
        if ((jsonObj.get("IpRange") != null && !jsonObj.get("IpRange").isJsonNull())
                && !jsonObj.get("IpRange").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `IpRange` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("IpRange").toString()));
        }
        if ((jsonObj.get("NetId") != null && !jsonObj.get("NetId").isJsonNull())
                && !jsonObj.get("NetId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NetId").toString()));
        }
        if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull())
                && !jsonObj.get("State").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `State` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("State").toString()));
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
        if ((jsonObj.get("Tenancy") != null && !jsonObj.get("Tenancy").isJsonNull())
                && !jsonObj.get("Tenancy").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Tenancy` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Tenancy").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Net.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Net' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Net> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Net.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Net>() {
                        @Override
                        public void write(JsonWriter out, Net value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Net read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Net given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Net
     * @throws IOException if the JSON string is invalid with respect to Net
     */
    public static Net fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Net.class);
    }

    /**
     * Convert an instance of Net to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

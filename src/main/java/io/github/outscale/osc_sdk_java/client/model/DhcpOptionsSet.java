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

/** Information about the DHCP options set. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DhcpOptionsSet {
    public static final String SERIALIZED_NAME_DEFAULT = "Default";

    @SerializedName(SERIALIZED_NAME_DEFAULT)
    private Boolean _default;

    public static final String SERIALIZED_NAME_DHCP_OPTIONS_SET_ID = "DhcpOptionsSetId";

    @SerializedName(SERIALIZED_NAME_DHCP_OPTIONS_SET_ID)
    private String dhcpOptionsSetId;

    public static final String SERIALIZED_NAME_DOMAIN_NAME = "DomainName";

    @SerializedName(SERIALIZED_NAME_DOMAIN_NAME)
    private String domainName;

    public static final String SERIALIZED_NAME_DOMAIN_NAME_SERVERS = "DomainNameServers";

    @SerializedName(SERIALIZED_NAME_DOMAIN_NAME_SERVERS)
    private List<String> domainNameServers = null;

    public static final String SERIALIZED_NAME_LOG_SERVERS = "LogServers";

    @SerializedName(SERIALIZED_NAME_LOG_SERVERS)
    private List<String> logServers = null;

    public static final String SERIALIZED_NAME_NTP_SERVERS = "NtpServers";

    @SerializedName(SERIALIZED_NAME_NTP_SERVERS)
    private List<String> ntpServers = null;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public DhcpOptionsSet() {}

    public DhcpOptionsSet _default(Boolean _default) {

        this._default = _default;
        return this;
    }

    /**
     * If true, the DHCP options set is a default one. If false, it is not.
     *
     * @return _default
     */
    @javax.annotation.Nullable
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public DhcpOptionsSet dhcpOptionsSetId(String dhcpOptionsSetId) {

        this.dhcpOptionsSetId = dhcpOptionsSetId;
        return this;
    }

    /**
     * The ID of the DHCP options set.
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

    public DhcpOptionsSet domainName(String domainName) {

        this.domainName = domainName;
        return this;
    }

    /**
     * The domain name.
     *
     * @return domainName
     */
    @javax.annotation.Nullable
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public DhcpOptionsSet domainNameServers(List<String> domainNameServers) {

        this.domainNameServers = domainNameServers;
        return this;
    }

    public DhcpOptionsSet addDomainNameServersItem(String domainNameServersItem) {
        if (this.domainNameServers == null) {
            this.domainNameServers = new ArrayList<>();
        }
        this.domainNameServers.add(domainNameServersItem);
        return this;
    }

    /**
     * One or more IPs for the domain name servers.
     *
     * @return domainNameServers
     */
    @javax.annotation.Nullable
    public List<String> getDomainNameServers() {
        return domainNameServers;
    }

    public void setDomainNameServers(List<String> domainNameServers) {
        this.domainNameServers = domainNameServers;
    }

    public DhcpOptionsSet logServers(List<String> logServers) {

        this.logServers = logServers;
        return this;
    }

    public DhcpOptionsSet addLogServersItem(String logServersItem) {
        if (this.logServers == null) {
            this.logServers = new ArrayList<>();
        }
        this.logServers.add(logServersItem);
        return this;
    }

    /**
     * One or more IPs for the log servers.
     *
     * @return logServers
     */
    @javax.annotation.Nullable
    public List<String> getLogServers() {
        return logServers;
    }

    public void setLogServers(List<String> logServers) {
        this.logServers = logServers;
    }

    public DhcpOptionsSet ntpServers(List<String> ntpServers) {

        this.ntpServers = ntpServers;
        return this;
    }

    public DhcpOptionsSet addNtpServersItem(String ntpServersItem) {
        if (this.ntpServers == null) {
            this.ntpServers = new ArrayList<>();
        }
        this.ntpServers.add(ntpServersItem);
        return this;
    }

    /**
     * One or more IPs for the NTP servers.
     *
     * @return ntpServers
     */
    @javax.annotation.Nullable
    public List<String> getNtpServers() {
        return ntpServers;
    }

    public void setNtpServers(List<String> ntpServers) {
        this.ntpServers = ntpServers;
    }

    public DhcpOptionsSet tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public DhcpOptionsSet addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the DHCP options set.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DhcpOptionsSet dhcpOptionsSet = (DhcpOptionsSet) o;
        return Objects.equals(this._default, dhcpOptionsSet._default)
                && Objects.equals(this.dhcpOptionsSetId, dhcpOptionsSet.dhcpOptionsSetId)
                && Objects.equals(this.domainName, dhcpOptionsSet.domainName)
                && Objects.equals(this.domainNameServers, dhcpOptionsSet.domainNameServers)
                && Objects.equals(this.logServers, dhcpOptionsSet.logServers)
                && Objects.equals(this.ntpServers, dhcpOptionsSet.ntpServers)
                && Objects.equals(this.tags, dhcpOptionsSet.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                _default,
                dhcpOptionsSetId,
                domainName,
                domainNameServers,
                logServers,
                ntpServers,
                tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DhcpOptionsSet {\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    dhcpOptionsSetId: ").append(toIndentedString(dhcpOptionsSetId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    domainNameServers: ")
                .append(toIndentedString(domainNameServers))
                .append("\n");
        sb.append("    logServers: ").append(toIndentedString(logServers)).append("\n");
        sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
        openapiFields.add("Default");
        openapiFields.add("DhcpOptionsSetId");
        openapiFields.add("DomainName");
        openapiFields.add("DomainNameServers");
        openapiFields.add("LogServers");
        openapiFields.add("NtpServers");
        openapiFields.add("Tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to DhcpOptionsSet
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!DhcpOptionsSet.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DhcpOptionsSet is not found in the"
                                        + " empty JSON string",
                                DhcpOptionsSet.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!DhcpOptionsSet.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DhcpOptionsSet` properties. JSON: %s",
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
        if ((jsonObj.get("DomainName") != null && !jsonObj.get("DomainName").isJsonNull())
                && !jsonObj.get("DomainName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `DomainName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("DomainName").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("DomainNameServers") != null
                && !jsonObj.get("DomainNameServers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `DomainNameServers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("DomainNameServers").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("LogServers") != null && !jsonObj.get("LogServers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LogServers` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("LogServers").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("NtpServers") != null && !jsonObj.get("NtpServers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NtpServers` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("NtpServers").toString()));
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DhcpOptionsSet.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DhcpOptionsSet' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DhcpOptionsSet> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DhcpOptionsSet.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DhcpOptionsSet>() {
                        @Override
                        public void write(JsonWriter out, DhcpOptionsSet value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DhcpOptionsSet read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DhcpOptionsSet given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DhcpOptionsSet
     * @throws IOException if the JSON string is invalid with respect to DhcpOptionsSet
     */
    public static DhcpOptionsSet fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DhcpOptionsSet.class);
    }

    /**
     * Convert an instance of DhcpOptionsSet to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

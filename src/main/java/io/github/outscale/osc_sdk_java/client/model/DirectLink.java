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

/** Information about the DirectLink. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DirectLink {
    public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private String accountId;

    public static final String SERIALIZED_NAME_BANDWIDTH = "Bandwidth";

    @SerializedName(SERIALIZED_NAME_BANDWIDTH)
    private String bandwidth;

    public static final String SERIALIZED_NAME_DIRECT_LINK_ID = "DirectLinkId";

    @SerializedName(SERIALIZED_NAME_DIRECT_LINK_ID)
    private String directLinkId;

    public static final String SERIALIZED_NAME_DIRECT_LINK_NAME = "DirectLinkName";

    @SerializedName(SERIALIZED_NAME_DIRECT_LINK_NAME)
    private String directLinkName;

    public static final String SERIALIZED_NAME_LOCATION = "Location";

    @SerializedName(SERIALIZED_NAME_LOCATION)
    private String location;

    public static final String SERIALIZED_NAME_REGION_NAME = "RegionName";

    @SerializedName(SERIALIZED_NAME_REGION_NAME)
    private String regionName;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public DirectLink() {}

    public DirectLink accountId(String accountId) {

        this.accountId = accountId;
        return this;
    }

    /**
     * The account ID of the owner of the DirectLink.
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

    public DirectLink bandwidth(String bandwidth) {

        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * The physical link bandwidth (either 1 Gbps or 10 Gbps).
     *
     * @return bandwidth
     */
    @javax.annotation.Nullable
    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public DirectLink directLinkId(String directLinkId) {

        this.directLinkId = directLinkId;
        return this;
    }

    /**
     * The ID of the DirectLink (for example, &#x60;dxcon-xxxxxxxx&#x60;).
     *
     * @return directLinkId
     */
    @javax.annotation.Nullable
    public String getDirectLinkId() {
        return directLinkId;
    }

    public void setDirectLinkId(String directLinkId) {
        this.directLinkId = directLinkId;
    }

    public DirectLink directLinkName(String directLinkName) {

        this.directLinkName = directLinkName;
        return this;
    }

    /**
     * The name of the DirectLink.
     *
     * @return directLinkName
     */
    @javax.annotation.Nullable
    public String getDirectLinkName() {
        return directLinkName;
    }

    public void setDirectLinkName(String directLinkName) {
        this.directLinkName = directLinkName;
    }

    public DirectLink location(String location) {

        this.location = location;
        return this;
    }

    /**
     * The datacenter where the DirectLink is located.
     *
     * @return location
     */
    @javax.annotation.Nullable
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public DirectLink regionName(String regionName) {

        this.regionName = regionName;
        return this;
    }

    /**
     * The Region in which the DirectLink has been created.
     *
     * @return regionName
     */
    @javax.annotation.Nullable
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public DirectLink state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the DirectLink.&lt;br /&gt; * &#x60;requested&#x60;: The DirectLink is requested
     * but the request has not been validated yet.&lt;br /&gt; * &#x60;pending&#x60;: The DirectLink
     * request has been validated. It remains in the &#x60;pending&#x60; state until you establish
     * the physical link.&lt;br /&gt; * &#x60;available&#x60;: The physical link is established and
     * the connection is ready to use.&lt;br /&gt; * &#x60;deleting&#x60;: The deletion process is
     * in progress.&lt;br /&gt; * &#x60;deleted&#x60;: The DirectLink is deleted.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DirectLink directLink = (DirectLink) o;
        return Objects.equals(this.accountId, directLink.accountId)
                && Objects.equals(this.bandwidth, directLink.bandwidth)
                && Objects.equals(this.directLinkId, directLink.directLinkId)
                && Objects.equals(this.directLinkName, directLink.directLinkName)
                && Objects.equals(this.location, directLink.location)
                && Objects.equals(this.regionName, directLink.regionName)
                && Objects.equals(this.state, directLink.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accountId, bandwidth, directLinkId, directLinkName, location, regionName, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectLink {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    directLinkId: ").append(toIndentedString(directLinkId)).append("\n");
        sb.append("    directLinkName: ").append(toIndentedString(directLinkName)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
        openapiFields.add("Bandwidth");
        openapiFields.add("DirectLinkId");
        openapiFields.add("DirectLinkName");
        openapiFields.add("Location");
        openapiFields.add("RegionName");
        openapiFields.add("State");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to DirectLink
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!DirectLink.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DirectLink is not found in the empty"
                                        + " JSON string",
                                DirectLink.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!DirectLink.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DirectLink` properties. JSON: %s",
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
        if ((jsonObj.get("Bandwidth") != null && !jsonObj.get("Bandwidth").isJsonNull())
                && !jsonObj.get("Bandwidth").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Bandwidth` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Bandwidth").toString()));
        }
        if ((jsonObj.get("DirectLinkId") != null && !jsonObj.get("DirectLinkId").isJsonNull())
                && !jsonObj.get("DirectLinkId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `DirectLinkId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("DirectLinkId").toString()));
        }
        if ((jsonObj.get("DirectLinkName") != null && !jsonObj.get("DirectLinkName").isJsonNull())
                && !jsonObj.get("DirectLinkName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `DirectLinkName` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("DirectLinkName").toString()));
        }
        if ((jsonObj.get("Location") != null && !jsonObj.get("Location").isJsonNull())
                && !jsonObj.get("Location").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Location` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Location").toString()));
        }
        if ((jsonObj.get("RegionName") != null && !jsonObj.get("RegionName").isJsonNull())
                && !jsonObj.get("RegionName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RegionName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("RegionName").toString()));
        }
        if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull())
                && !jsonObj.get("State").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `State` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("State").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DirectLink.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DirectLink' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DirectLink> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DirectLink.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DirectLink>() {
                        @Override
                        public void write(JsonWriter out, DirectLink value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DirectLink read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DirectLink given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DirectLink
     * @throws IOException if the JSON string is invalid with respect to DirectLink
     */
    public static DirectLink fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DirectLink.class);
    }

    /**
     * Convert an instance of DirectLink to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

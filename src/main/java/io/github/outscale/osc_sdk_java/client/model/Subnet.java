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

/** Information about the Subnet. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Subnet {
    public static final String SERIALIZED_NAME_AVAILABLE_IPS_COUNT = "AvailableIpsCount";

    @SerializedName(SERIALIZED_NAME_AVAILABLE_IPS_COUNT)
    private Integer availableIpsCount;

    public static final String SERIALIZED_NAME_IP_RANGE = "IpRange";

    @SerializedName(SERIALIZED_NAME_IP_RANGE)
    private String ipRange;

    public static final String SERIALIZED_NAME_MAP_PUBLIC_IP_ON_LAUNCH = "MapPublicIpOnLaunch";

    @SerializedName(SERIALIZED_NAME_MAP_PUBLIC_IP_ON_LAUNCH)
    private Boolean mapPublicIpOnLaunch;

    public static final String SERIALIZED_NAME_NET_ID = "NetId";

    @SerializedName(SERIALIZED_NAME_NET_ID)
    private String netId;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";

    @SerializedName(SERIALIZED_NAME_SUBNET_ID)
    private String subnetId;

    public static final String SERIALIZED_NAME_SUBREGION_NAME = "SubregionName";

    @SerializedName(SERIALIZED_NAME_SUBREGION_NAME)
    private String subregionName;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public Subnet() {}

    public Subnet availableIpsCount(Integer availableIpsCount) {

        this.availableIpsCount = availableIpsCount;
        return this;
    }

    /**
     * The number of available IPs in the Subnets.
     *
     * @return availableIpsCount
     */
    @javax.annotation.Nullable
    public Integer getAvailableIpsCount() {
        return availableIpsCount;
    }

    public void setAvailableIpsCount(Integer availableIpsCount) {
        this.availableIpsCount = availableIpsCount;
    }

    public Subnet ipRange(String ipRange) {

        this.ipRange = ipRange;
        return this;
    }

    /**
     * The IP range in the Subnet, in CIDR notation (for example, &#x60;10.0.0.0/16&#x60;).
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

    public Subnet mapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {

        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        return this;
    }

    /**
     * If true, a public IP is assigned to the network interface cards (NICs) created in the
     * specified Subnet.
     *
     * @return mapPublicIpOnLaunch
     */
    @javax.annotation.Nullable
    public Boolean getMapPublicIpOnLaunch() {
        return mapPublicIpOnLaunch;
    }

    public void setMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    }

    public Subnet netId(String netId) {

        this.netId = netId;
        return this;
    }

    /**
     * The ID of the Net in which the Subnet is.
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

    public Subnet state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the Subnet (&#x60;pending&#x60; \\| &#x60;available&#x60; \\|
     * &#x60;deleted&#x60;).
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

    public Subnet subnetId(String subnetId) {

        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ID of the Subnet.
     *
     * @return subnetId
     */
    @javax.annotation.Nullable
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Subnet subregionName(String subregionName) {

        this.subregionName = subregionName;
        return this;
    }

    /**
     * The name of the Subregion in which the Subnet is located.
     *
     * @return subregionName
     */
    @javax.annotation.Nullable
    public String getSubregionName() {
        return subregionName;
    }

    public void setSubregionName(String subregionName) {
        this.subregionName = subregionName;
    }

    public Subnet tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public Subnet addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the Subnet.
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
        Subnet subnet = (Subnet) o;
        return Objects.equals(this.availableIpsCount, subnet.availableIpsCount)
                && Objects.equals(this.ipRange, subnet.ipRange)
                && Objects.equals(this.mapPublicIpOnLaunch, subnet.mapPublicIpOnLaunch)
                && Objects.equals(this.netId, subnet.netId)
                && Objects.equals(this.state, subnet.state)
                && Objects.equals(this.subnetId, subnet.subnetId)
                && Objects.equals(this.subregionName, subnet.subregionName)
                && Objects.equals(this.tags, subnet.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                availableIpsCount,
                ipRange,
                mapPublicIpOnLaunch,
                netId,
                state,
                subnetId,
                subregionName,
                tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subnet {\n");
        sb.append("    availableIpsCount: ")
                .append(toIndentedString(availableIpsCount))
                .append("\n");
        sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
        sb.append("    mapPublicIpOnLaunch: ")
                .append(toIndentedString(mapPublicIpOnLaunch))
                .append("\n");
        sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subregionName: ").append(toIndentedString(subregionName)).append("\n");
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
        openapiFields.add("AvailableIpsCount");
        openapiFields.add("IpRange");
        openapiFields.add("MapPublicIpOnLaunch");
        openapiFields.add("NetId");
        openapiFields.add("State");
        openapiFields.add("SubnetId");
        openapiFields.add("SubregionName");
        openapiFields.add("Tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Subnet
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Subnet.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Subnet is not found in the empty JSON"
                                        + " string",
                                Subnet.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Subnet.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Subnet`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
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
        if ((jsonObj.get("SubnetId") != null && !jsonObj.get("SubnetId").isJsonNull())
                && !jsonObj.get("SubnetId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubnetId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SubnetId").toString()));
        }
        if ((jsonObj.get("SubregionName") != null && !jsonObj.get("SubregionName").isJsonNull())
                && !jsonObj.get("SubregionName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubregionName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SubregionName").toString()));
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
            if (!Subnet.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Subnet' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Subnet> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Subnet.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Subnet>() {
                        @Override
                        public void write(JsonWriter out, Subnet value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Subnet read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Subnet given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Subnet
     * @throws IOException if the JSON string is invalid with respect to Subnet
     */
    public static Subnet fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Subnet.class);
    }

    /**
     * Convert an instance of Subnet to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
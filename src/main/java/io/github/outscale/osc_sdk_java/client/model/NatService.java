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

/** Information about the NAT service. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NatService {
    public static final String SERIALIZED_NAME_NAT_SERVICE_ID = "NatServiceId";

    @SerializedName(SERIALIZED_NAME_NAT_SERVICE_ID)
    private String natServiceId;

    public static final String SERIALIZED_NAME_NET_ID = "NetId";

    @SerializedName(SERIALIZED_NAME_NET_ID)
    private String netId;

    public static final String SERIALIZED_NAME_PUBLIC_IPS = "PublicIps";

    @SerializedName(SERIALIZED_NAME_PUBLIC_IPS)
    private List<PublicIpLight> publicIps = null;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";

    @SerializedName(SERIALIZED_NAME_SUBNET_ID)
    private String subnetId;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public NatService() {}

    public NatService natServiceId(String natServiceId) {

        this.natServiceId = natServiceId;
        return this;
    }

    /**
     * The ID of the NAT service.
     *
     * @return natServiceId
     */
    @javax.annotation.Nullable
    public String getNatServiceId() {
        return natServiceId;
    }

    public void setNatServiceId(String natServiceId) {
        this.natServiceId = natServiceId;
    }

    public NatService netId(String netId) {

        this.netId = netId;
        return this;
    }

    /**
     * The ID of the Net in which the NAT service is.
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

    public NatService publicIps(List<PublicIpLight> publicIps) {

        this.publicIps = publicIps;
        return this;
    }

    public NatService addPublicIpsItem(PublicIpLight publicIpsItem) {
        if (this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        this.publicIps.add(publicIpsItem);
        return this;
    }

    /**
     * Information about the public IP or IPs associated with the NAT service.
     *
     * @return publicIps
     */
    @javax.annotation.Nullable
    public List<PublicIpLight> getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(List<PublicIpLight> publicIps) {
        this.publicIps = publicIps;
    }

    public NatService state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the NAT service (&#x60;pending&#x60; \\| &#x60;available&#x60; \\|
     * &#x60;deleting&#x60; \\| &#x60;deleted&#x60;).
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

    public NatService subnetId(String subnetId) {

        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ID of the Subnet in which the NAT service is.
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

    public NatService tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public NatService addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the NAT service.
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
        NatService natService = (NatService) o;
        return Objects.equals(this.natServiceId, natService.natServiceId)
                && Objects.equals(this.netId, natService.netId)
                && Objects.equals(this.publicIps, natService.publicIps)
                && Objects.equals(this.state, natService.state)
                && Objects.equals(this.subnetId, natService.subnetId)
                && Objects.equals(this.tags, natService.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natServiceId, netId, publicIps, state, subnetId, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NatService {\n");
        sb.append("    natServiceId: ").append(toIndentedString(natServiceId)).append("\n");
        sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
        openapiFields.add("NatServiceId");
        openapiFields.add("NetId");
        openapiFields.add("PublicIps");
        openapiFields.add("State");
        openapiFields.add("SubnetId");
        openapiFields.add("Tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to NatService
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!NatService.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in NatService is not found in the empty"
                                        + " JSON string",
                                NatService.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!NatService.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `NatService` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("NatServiceId") != null && !jsonObj.get("NatServiceId").isJsonNull())
                && !jsonObj.get("NatServiceId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NatServiceId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("NatServiceId").toString()));
        }
        if ((jsonObj.get("NetId") != null && !jsonObj.get("NetId").isJsonNull())
                && !jsonObj.get("NetId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NetId").toString()));
        }
        if (jsonObj.get("PublicIps") != null && !jsonObj.get("PublicIps").isJsonNull()) {
            JsonArray jsonArraypublicIps = jsonObj.getAsJsonArray("PublicIps");
            if (jsonArraypublicIps != null) {
                // ensure the json data is an array
                if (!jsonObj.get("PublicIps").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `PublicIps` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("PublicIps").toString()));
                }

                // validate the optional field `PublicIps` (array)
                for (int i = 0; i < jsonArraypublicIps.size(); i++) {
                    PublicIpLight.validateJsonObject(jsonArraypublicIps.get(i).getAsJsonObject());
                }
                ;
            }
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
            if (!NatService.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'NatService' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NatService> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(NatService.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<NatService>() {
                        @Override
                        public void write(JsonWriter out, NatService value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public NatService read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of NatService given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of NatService
     * @throws IOException if the JSON string is invalid with respect to NatService
     */
    public static NatService fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, NatService.class);
    }

    /**
     * Convert an instance of NatService to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

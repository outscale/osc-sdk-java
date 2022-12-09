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

/** One or more filters. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiltersPublicIp {
    public static final String SERIALIZED_NAME_LINK_PUBLIC_IP_IDS = "LinkPublicIpIds";

    @SerializedName(SERIALIZED_NAME_LINK_PUBLIC_IP_IDS)
    private List<String> linkPublicIpIds = null;

    public static final String SERIALIZED_NAME_NIC_ACCOUNT_IDS = "NicAccountIds";

    @SerializedName(SERIALIZED_NAME_NIC_ACCOUNT_IDS)
    private List<String> nicAccountIds = null;

    public static final String SERIALIZED_NAME_NIC_IDS = "NicIds";

    @SerializedName(SERIALIZED_NAME_NIC_IDS)
    private List<String> nicIds = null;

    public static final String SERIALIZED_NAME_PLACEMENTS = "Placements";

    @SerializedName(SERIALIZED_NAME_PLACEMENTS)
    private List<String> placements = null;

    public static final String SERIALIZED_NAME_PRIVATE_IPS = "PrivateIps";

    @SerializedName(SERIALIZED_NAME_PRIVATE_IPS)
    private List<String> privateIps = null;

    public static final String SERIALIZED_NAME_PUBLIC_IP_IDS = "PublicIpIds";

    @SerializedName(SERIALIZED_NAME_PUBLIC_IP_IDS)
    private List<String> publicIpIds = null;

    public static final String SERIALIZED_NAME_PUBLIC_IPS = "PublicIps";

    @SerializedName(SERIALIZED_NAME_PUBLIC_IPS)
    private List<String> publicIps = null;

    public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";

    @SerializedName(SERIALIZED_NAME_TAG_KEYS)
    private List<String> tagKeys = null;

    public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";

    @SerializedName(SERIALIZED_NAME_TAG_VALUES)
    private List<String> tagValues = null;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<String> tags = null;

    public static final String SERIALIZED_NAME_VM_IDS = "VmIds";

    @SerializedName(SERIALIZED_NAME_VM_IDS)
    private List<String> vmIds = null;

    public FiltersPublicIp() {}

    public FiltersPublicIp linkPublicIpIds(List<String> linkPublicIpIds) {

        this.linkPublicIpIds = linkPublicIpIds;
        return this;
    }

    public FiltersPublicIp addLinkPublicIpIdsItem(String linkPublicIpIdsItem) {
        if (this.linkPublicIpIds == null) {
            this.linkPublicIpIds = new ArrayList<>();
        }
        this.linkPublicIpIds.add(linkPublicIpIdsItem);
        return this;
    }

    /**
     * The IDs representing the associations of public IPs with VMs or NICs.
     *
     * @return linkPublicIpIds
     */
    @javax.annotation.Nullable
    public List<String> getLinkPublicIpIds() {
        return linkPublicIpIds;
    }

    public void setLinkPublicIpIds(List<String> linkPublicIpIds) {
        this.linkPublicIpIds = linkPublicIpIds;
    }

    public FiltersPublicIp nicAccountIds(List<String> nicAccountIds) {

        this.nicAccountIds = nicAccountIds;
        return this;
    }

    public FiltersPublicIp addNicAccountIdsItem(String nicAccountIdsItem) {
        if (this.nicAccountIds == null) {
            this.nicAccountIds = new ArrayList<>();
        }
        this.nicAccountIds.add(nicAccountIdsItem);
        return this;
    }

    /**
     * The account IDs of the owners of the NICs.
     *
     * @return nicAccountIds
     */
    @javax.annotation.Nullable
    public List<String> getNicAccountIds() {
        return nicAccountIds;
    }

    public void setNicAccountIds(List<String> nicAccountIds) {
        this.nicAccountIds = nicAccountIds;
    }

    public FiltersPublicIp nicIds(List<String> nicIds) {

        this.nicIds = nicIds;
        return this;
    }

    public FiltersPublicIp addNicIdsItem(String nicIdsItem) {
        if (this.nicIds == null) {
            this.nicIds = new ArrayList<>();
        }
        this.nicIds.add(nicIdsItem);
        return this;
    }

    /**
     * The IDs of the NICs.
     *
     * @return nicIds
     */
    @javax.annotation.Nullable
    public List<String> getNicIds() {
        return nicIds;
    }

    public void setNicIds(List<String> nicIds) {
        this.nicIds = nicIds;
    }

    public FiltersPublicIp placements(List<String> placements) {

        this.placements = placements;
        return this;
    }

    public FiltersPublicIp addPlacementsItem(String placementsItem) {
        if (this.placements == null) {
            this.placements = new ArrayList<>();
        }
        this.placements.add(placementsItem);
        return this;
    }

    /**
     * Whether the public IPs are for use in the public Cloud or in a Net.
     *
     * @return placements
     */
    @javax.annotation.Nullable
    public List<String> getPlacements() {
        return placements;
    }

    public void setPlacements(List<String> placements) {
        this.placements = placements;
    }

    public FiltersPublicIp privateIps(List<String> privateIps) {

        this.privateIps = privateIps;
        return this;
    }

    public FiltersPublicIp addPrivateIpsItem(String privateIpsItem) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        this.privateIps.add(privateIpsItem);
        return this;
    }

    /**
     * The private IPs associated with the public IPs.
     *
     * @return privateIps
     */
    @javax.annotation.Nullable
    public List<String> getPrivateIps() {
        return privateIps;
    }

    public void setPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
    }

    public FiltersPublicIp publicIpIds(List<String> publicIpIds) {

        this.publicIpIds = publicIpIds;
        return this;
    }

    public FiltersPublicIp addPublicIpIdsItem(String publicIpIdsItem) {
        if (this.publicIpIds == null) {
            this.publicIpIds = new ArrayList<>();
        }
        this.publicIpIds.add(publicIpIdsItem);
        return this;
    }

    /**
     * The IDs of the public IPs.
     *
     * @return publicIpIds
     */
    @javax.annotation.Nullable
    public List<String> getPublicIpIds() {
        return publicIpIds;
    }

    public void setPublicIpIds(List<String> publicIpIds) {
        this.publicIpIds = publicIpIds;
    }

    public FiltersPublicIp publicIps(List<String> publicIps) {

        this.publicIps = publicIps;
        return this;
    }

    public FiltersPublicIp addPublicIpsItem(String publicIpsItem) {
        if (this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        this.publicIps.add(publicIpsItem);
        return this;
    }

    /**
     * The public IPs.
     *
     * @return publicIps
     */
    @javax.annotation.Nullable
    public List<String> getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
    }

    public FiltersPublicIp tagKeys(List<String> tagKeys) {

        this.tagKeys = tagKeys;
        return this;
    }

    public FiltersPublicIp addTagKeysItem(String tagKeysItem) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        this.tagKeys.add(tagKeysItem);
        return this;
    }

    /**
     * The keys of the tags associated with the public IPs.
     *
     * @return tagKeys
     */
    @javax.annotation.Nullable
    public List<String> getTagKeys() {
        return tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
    }

    public FiltersPublicIp tagValues(List<String> tagValues) {

        this.tagValues = tagValues;
        return this;
    }

    public FiltersPublicIp addTagValuesItem(String tagValuesItem) {
        if (this.tagValues == null) {
            this.tagValues = new ArrayList<>();
        }
        this.tagValues.add(tagValuesItem);
        return this;
    }

    /**
     * The values of the tags associated with the public IPs.
     *
     * @return tagValues
     */
    @javax.annotation.Nullable
    public List<String> getTagValues() {
        return tagValues;
    }

    public void setTagValues(List<String> tagValues) {
        this.tagValues = tagValues;
    }

    public FiltersPublicIp tags(List<String> tags) {

        this.tags = tags;
        return this;
    }

    public FiltersPublicIp addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The key/value combination of the tags associated with the public IPs, in the following
     * format:
     * &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}.
     *
     * @return tags
     */
    @javax.annotation.Nullable
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public FiltersPublicIp vmIds(List<String> vmIds) {

        this.vmIds = vmIds;
        return this;
    }

    public FiltersPublicIp addVmIdsItem(String vmIdsItem) {
        if (this.vmIds == null) {
            this.vmIds = new ArrayList<>();
        }
        this.vmIds.add(vmIdsItem);
        return this;
    }

    /**
     * The IDs of the VMs.
     *
     * @return vmIds
     */
    @javax.annotation.Nullable
    public List<String> getVmIds() {
        return vmIds;
    }

    public void setVmIds(List<String> vmIds) {
        this.vmIds = vmIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersPublicIp filtersPublicIp = (FiltersPublicIp) o;
        return Objects.equals(this.linkPublicIpIds, filtersPublicIp.linkPublicIpIds)
                && Objects.equals(this.nicAccountIds, filtersPublicIp.nicAccountIds)
                && Objects.equals(this.nicIds, filtersPublicIp.nicIds)
                && Objects.equals(this.placements, filtersPublicIp.placements)
                && Objects.equals(this.privateIps, filtersPublicIp.privateIps)
                && Objects.equals(this.publicIpIds, filtersPublicIp.publicIpIds)
                && Objects.equals(this.publicIps, filtersPublicIp.publicIps)
                && Objects.equals(this.tagKeys, filtersPublicIp.tagKeys)
                && Objects.equals(this.tagValues, filtersPublicIp.tagValues)
                && Objects.equals(this.tags, filtersPublicIp.tags)
                && Objects.equals(this.vmIds, filtersPublicIp.vmIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                linkPublicIpIds,
                nicAccountIds,
                nicIds,
                placements,
                privateIps,
                publicIpIds,
                publicIps,
                tagKeys,
                tagValues,
                tags,
                vmIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersPublicIp {\n");
        sb.append("    linkPublicIpIds: ").append(toIndentedString(linkPublicIpIds)).append("\n");
        sb.append("    nicAccountIds: ").append(toIndentedString(nicAccountIds)).append("\n");
        sb.append("    nicIds: ").append(toIndentedString(nicIds)).append("\n");
        sb.append("    placements: ").append(toIndentedString(placements)).append("\n");
        sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
        sb.append("    publicIpIds: ").append(toIndentedString(publicIpIds)).append("\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
        sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
        sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
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
        openapiFields.add("LinkPublicIpIds");
        openapiFields.add("NicAccountIds");
        openapiFields.add("NicIds");
        openapiFields.add("Placements");
        openapiFields.add("PrivateIps");
        openapiFields.add("PublicIpIds");
        openapiFields.add("PublicIps");
        openapiFields.add("TagKeys");
        openapiFields.add("TagValues");
        openapiFields.add("Tags");
        openapiFields.add("VmIds");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersPublicIp
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersPublicIp.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersPublicIp is not found in the"
                                        + " empty JSON string",
                                FiltersPublicIp.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersPublicIp.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersPublicIp` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("LinkPublicIpIds") != null
                && !jsonObj.get("LinkPublicIpIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LinkPublicIpIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("LinkPublicIpIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("NicAccountIds") != null && !jsonObj.get("NicAccountIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NicAccountIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NicAccountIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("NicIds") != null && !jsonObj.get("NicIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NicIds` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("NicIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Placements") != null && !jsonObj.get("Placements").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Placements` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("Placements").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("PrivateIps") != null && !jsonObj.get("PrivateIps").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PrivateIps` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("PrivateIps").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("PublicIpIds") != null && !jsonObj.get("PublicIpIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PublicIpIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("PublicIpIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("PublicIps") != null && !jsonObj.get("PublicIps").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PublicIps` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("PublicIps").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("TagKeys") != null && !jsonObj.get("TagKeys").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `TagKeys` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("TagKeys").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("TagValues") != null && !jsonObj.get("TagValues").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `TagValues` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("TagValues").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Tags` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Tags").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VmIds") != null && !jsonObj.get("VmIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmIds` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("VmIds").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersPublicIp.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersPublicIp' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersPublicIp> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersPublicIp.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersPublicIp>() {
                        @Override
                        public void write(JsonWriter out, FiltersPublicIp value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersPublicIp read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersPublicIp given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersPublicIp
     * @throws IOException if the JSON string is invalid with respect to FiltersPublicIp
     */
    public static FiltersPublicIp fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersPublicIp.class);
    }

    /**
     * Convert an instance of FiltersPublicIp to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

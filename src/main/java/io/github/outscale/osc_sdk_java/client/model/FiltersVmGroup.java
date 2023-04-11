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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** One or more filters. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiltersVmGroup {
    public static final String SERIALIZED_NAME_DESCRIPTIONS = "Descriptions";

    @SerializedName(SERIALIZED_NAME_DESCRIPTIONS)
    private List<String> descriptions = null;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
    private List<String> securityGroupIds = null;

    public static final String SERIALIZED_NAME_SUBNET_IDS = "SubnetIds";

    @SerializedName(SERIALIZED_NAME_SUBNET_IDS)
    private List<String> subnetIds = null;

    public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";

    @SerializedName(SERIALIZED_NAME_TAG_KEYS)
    private List<String> tagKeys = null;

    public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";

    @SerializedName(SERIALIZED_NAME_TAG_VALUES)
    private List<String> tagValues = null;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<String> tags = null;

    public static final String SERIALIZED_NAME_VM_COUNTS = "VmCounts";

    @SerializedName(SERIALIZED_NAME_VM_COUNTS)
    private List<Integer> vmCounts = null;

    public static final String SERIALIZED_NAME_VM_GROUP_IDS = "VmGroupIds";

    @SerializedName(SERIALIZED_NAME_VM_GROUP_IDS)
    private List<String> vmGroupIds = null;

    public static final String SERIALIZED_NAME_VM_GROUP_NAMES = "VmGroupNames";

    @SerializedName(SERIALIZED_NAME_VM_GROUP_NAMES)
    private List<String> vmGroupNames = null;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_IDS = "VmTemplateIds";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_IDS)
    private List<String> vmTemplateIds = null;

    public FiltersVmGroup() {}

    public FiltersVmGroup descriptions(List<String> descriptions) {

        this.descriptions = descriptions;
        return this;
    }

    public FiltersVmGroup addDescriptionsItem(String descriptionsItem) {
        if (this.descriptions == null) {
            this.descriptions = new ArrayList<>();
        }
        this.descriptions.add(descriptionsItem);
        return this;
    }

    /**
     * The descriptions of the VM groups.
     *
     * @return descriptions
     */
    @javax.annotation.Nullable
    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }

    public FiltersVmGroup securityGroupIds(List<String> securityGroupIds) {

        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public FiltersVmGroup addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    /**
     * The IDs of the security groups.
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

    public FiltersVmGroup subnetIds(List<String> subnetIds) {

        this.subnetIds = subnetIds;
        return this;
    }

    public FiltersVmGroup addSubnetIdsItem(String subnetIdsItem) {
        if (this.subnetIds == null) {
            this.subnetIds = new ArrayList<>();
        }
        this.subnetIds.add(subnetIdsItem);
        return this;
    }

    /**
     * The IDs of the Subnets.
     *
     * @return subnetIds
     */
    @javax.annotation.Nullable
    public List<String> getSubnetIds() {
        return subnetIds;
    }

    public void setSubnetIds(List<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public FiltersVmGroup tagKeys(List<String> tagKeys) {

        this.tagKeys = tagKeys;
        return this;
    }

    public FiltersVmGroup addTagKeysItem(String tagKeysItem) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        this.tagKeys.add(tagKeysItem);
        return this;
    }

    /**
     * The keys of the tags associated with the VM groups.
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

    public FiltersVmGroup tagValues(List<String> tagValues) {

        this.tagValues = tagValues;
        return this;
    }

    public FiltersVmGroup addTagValuesItem(String tagValuesItem) {
        if (this.tagValues == null) {
            this.tagValues = new ArrayList<>();
        }
        this.tagValues.add(tagValuesItem);
        return this;
    }

    /**
     * The values of the tags associated with the VM groups.
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

    public FiltersVmGroup tags(List<String> tags) {

        this.tags = tags;
        return this;
    }

    public FiltersVmGroup addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The key/value combination of the tags associated with the VMs, in the following format:
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

    public FiltersVmGroup vmCounts(List<Integer> vmCounts) {

        this.vmCounts = vmCounts;
        return this;
    }

    public FiltersVmGroup addVmCountsItem(Integer vmCountsItem) {
        if (this.vmCounts == null) {
            this.vmCounts = new ArrayList<>();
        }
        this.vmCounts.add(vmCountsItem);
        return this;
    }

    /**
     * The number of VMs in the VM group.
     *
     * @return vmCounts
     */
    @javax.annotation.Nullable
    public List<Integer> getVmCounts() {
        return vmCounts;
    }

    public void setVmCounts(List<Integer> vmCounts) {
        this.vmCounts = vmCounts;
    }

    public FiltersVmGroup vmGroupIds(List<String> vmGroupIds) {

        this.vmGroupIds = vmGroupIds;
        return this;
    }

    public FiltersVmGroup addVmGroupIdsItem(String vmGroupIdsItem) {
        if (this.vmGroupIds == null) {
            this.vmGroupIds = new ArrayList<>();
        }
        this.vmGroupIds.add(vmGroupIdsItem);
        return this;
    }

    /**
     * The IDs of the VM groups.
     *
     * @return vmGroupIds
     */
    @javax.annotation.Nullable
    public List<String> getVmGroupIds() {
        return vmGroupIds;
    }

    public void setVmGroupIds(List<String> vmGroupIds) {
        this.vmGroupIds = vmGroupIds;
    }

    public FiltersVmGroup vmGroupNames(List<String> vmGroupNames) {

        this.vmGroupNames = vmGroupNames;
        return this;
    }

    public FiltersVmGroup addVmGroupNamesItem(String vmGroupNamesItem) {
        if (this.vmGroupNames == null) {
            this.vmGroupNames = new ArrayList<>();
        }
        this.vmGroupNames.add(vmGroupNamesItem);
        return this;
    }

    /**
     * The names of the VM groups.
     *
     * @return vmGroupNames
     */
    @javax.annotation.Nullable
    public List<String> getVmGroupNames() {
        return vmGroupNames;
    }

    public void setVmGroupNames(List<String> vmGroupNames) {
        this.vmGroupNames = vmGroupNames;
    }

    public FiltersVmGroup vmTemplateIds(List<String> vmTemplateIds) {

        this.vmTemplateIds = vmTemplateIds;
        return this;
    }

    public FiltersVmGroup addVmTemplateIdsItem(String vmTemplateIdsItem) {
        if (this.vmTemplateIds == null) {
            this.vmTemplateIds = new ArrayList<>();
        }
        this.vmTemplateIds.add(vmTemplateIdsItem);
        return this;
    }

    /**
     * The IDs of the VM templates.
     *
     * @return vmTemplateIds
     */
    @javax.annotation.Nullable
    public List<String> getVmTemplateIds() {
        return vmTemplateIds;
    }

    public void setVmTemplateIds(List<String> vmTemplateIds) {
        this.vmTemplateIds = vmTemplateIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersVmGroup filtersVmGroup = (FiltersVmGroup) o;
        return Objects.equals(this.descriptions, filtersVmGroup.descriptions)
                && Objects.equals(this.securityGroupIds, filtersVmGroup.securityGroupIds)
                && Objects.equals(this.subnetIds, filtersVmGroup.subnetIds)
                && Objects.equals(this.tagKeys, filtersVmGroup.tagKeys)
                && Objects.equals(this.tagValues, filtersVmGroup.tagValues)
                && Objects.equals(this.tags, filtersVmGroup.tags)
                && Objects.equals(this.vmCounts, filtersVmGroup.vmCounts)
                && Objects.equals(this.vmGroupIds, filtersVmGroup.vmGroupIds)
                && Objects.equals(this.vmGroupNames, filtersVmGroup.vmGroupNames)
                && Objects.equals(this.vmTemplateIds, filtersVmGroup.vmTemplateIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                descriptions,
                securityGroupIds,
                subnetIds,
                tagKeys,
                tagValues,
                tags,
                vmCounts,
                vmGroupIds,
                vmGroupNames,
                vmTemplateIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersVmGroup {\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
        sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
        sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
        sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vmCounts: ").append(toIndentedString(vmCounts)).append("\n");
        sb.append("    vmGroupIds: ").append(toIndentedString(vmGroupIds)).append("\n");
        sb.append("    vmGroupNames: ").append(toIndentedString(vmGroupNames)).append("\n");
        sb.append("    vmTemplateIds: ").append(toIndentedString(vmTemplateIds)).append("\n");
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
        openapiFields.add("Descriptions");
        openapiFields.add("SecurityGroupIds");
        openapiFields.add("SubnetIds");
        openapiFields.add("TagKeys");
        openapiFields.add("TagValues");
        openapiFields.add("Tags");
        openapiFields.add("VmCounts");
        openapiFields.add("VmGroupIds");
        openapiFields.add("VmGroupNames");
        openapiFields.add("VmTemplateIds");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersVmGroup
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersVmGroup.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersVmGroup is not found in the"
                                        + " empty JSON string",
                                FiltersVmGroup.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersVmGroup.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersVmGroup` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Descriptions") != null && !jsonObj.get("Descriptions").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Descriptions` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Descriptions").toString()));
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
        // ensure the optional json data is an array if present
        if (jsonObj.get("SubnetIds") != null && !jsonObj.get("SubnetIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubnetIds` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("SubnetIds").toString()));
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
        if (jsonObj.get("VmCounts") != null && !jsonObj.get("VmCounts").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmCounts` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("VmCounts").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VmGroupIds") != null && !jsonObj.get("VmGroupIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmGroupIds` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("VmGroupIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VmGroupNames") != null && !jsonObj.get("VmGroupNames").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmGroupNames` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VmGroupNames").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VmTemplateIds") != null && !jsonObj.get("VmTemplateIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmTemplateIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VmTemplateIds").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersVmGroup.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersVmGroup' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersVmGroup> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersVmGroup.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersVmGroup>() {
                        @Override
                        public void write(JsonWriter out, FiltersVmGroup value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersVmGroup read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersVmGroup given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersVmGroup
     * @throws IOException if the JSON string is invalid with respect to FiltersVmGroup
     */
    public static FiltersVmGroup fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersVmGroup.class);
    }

    /**
     * Convert an instance of FiltersVmGroup to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

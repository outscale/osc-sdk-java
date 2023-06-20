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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** One or more filters. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiltersVmTemplate {
    public static final String SERIALIZED_NAME_CPU_CORES = "CpuCores";

    @SerializedName(SERIALIZED_NAME_CPU_CORES)
    private List<Integer> cpuCores = null;

    public static final String SERIALIZED_NAME_CPU_GENERATIONS = "CpuGenerations";

    @SerializedName(SERIALIZED_NAME_CPU_GENERATIONS)
    private List<String> cpuGenerations = null;

    public static final String SERIALIZED_NAME_CPU_PERFORMANCES = "CpuPerformances";

    @SerializedName(SERIALIZED_NAME_CPU_PERFORMANCES)
    private List<String> cpuPerformances = null;

    public static final String SERIALIZED_NAME_DESCRIPTIONS = "Descriptions";

    @SerializedName(SERIALIZED_NAME_DESCRIPTIONS)
    private List<String> descriptions = null;

    public static final String SERIALIZED_NAME_IMAGE_IDS = "ImageIds";

    @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
    private List<String> imageIds = null;

    public static final String SERIALIZED_NAME_KEYPAIR_NAMES = "KeypairNames";

    @SerializedName(SERIALIZED_NAME_KEYPAIR_NAMES)
    private List<String> keypairNames = null;

    public static final String SERIALIZED_NAME_RAMS = "Rams";

    @SerializedName(SERIALIZED_NAME_RAMS)
    private List<Integer> rams = null;

    public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";

    @SerializedName(SERIALIZED_NAME_TAG_KEYS)
    private List<String> tagKeys = null;

    public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";

    @SerializedName(SERIALIZED_NAME_TAG_VALUES)
    private List<String> tagValues = null;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<String> tags = null;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_IDS = "VmTemplateIds";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_IDS)
    private List<String> vmTemplateIds = null;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_NAMES = "VmTemplateNames";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NAMES)
    private List<String> vmTemplateNames = null;

    public FiltersVmTemplate() {}

    public FiltersVmTemplate cpuCores(List<Integer> cpuCores) {

        this.cpuCores = cpuCores;
        return this;
    }

    public FiltersVmTemplate addCpuCoresItem(Integer cpuCoresItem) {
        if (this.cpuCores == null) {
            this.cpuCores = new ArrayList<>();
        }
        this.cpuCores.add(cpuCoresItem);
        return this;
    }

    /**
     * The number of vCores.
     *
     * @return cpuCores
     */
    @javax.annotation.Nullable
    public List<Integer> getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(List<Integer> cpuCores) {
        this.cpuCores = cpuCores;
    }

    public FiltersVmTemplate cpuGenerations(List<String> cpuGenerations) {

        this.cpuGenerations = cpuGenerations;
        return this;
    }

    public FiltersVmTemplate addCpuGenerationsItem(String cpuGenerationsItem) {
        if (this.cpuGenerations == null) {
            this.cpuGenerations = new ArrayList<>();
        }
        this.cpuGenerations.add(cpuGenerationsItem);
        return this;
    }

    /**
     * The processor generations (for example, &#x60;v4&#x60;).
     *
     * @return cpuGenerations
     */
    @javax.annotation.Nullable
    public List<String> getCpuGenerations() {
        return cpuGenerations;
    }

    public void setCpuGenerations(List<String> cpuGenerations) {
        this.cpuGenerations = cpuGenerations;
    }

    public FiltersVmTemplate cpuPerformances(List<String> cpuPerformances) {

        this.cpuPerformances = cpuPerformances;
        return this;
    }

    public FiltersVmTemplate addCpuPerformancesItem(String cpuPerformancesItem) {
        if (this.cpuPerformances == null) {
            this.cpuPerformances = new ArrayList<>();
        }
        this.cpuPerformances.add(cpuPerformancesItem);
        return this;
    }

    /**
     * The performances of the VMs.
     *
     * @return cpuPerformances
     */
    @javax.annotation.Nullable
    public List<String> getCpuPerformances() {
        return cpuPerformances;
    }

    public void setCpuPerformances(List<String> cpuPerformances) {
        this.cpuPerformances = cpuPerformances;
    }

    public FiltersVmTemplate descriptions(List<String> descriptions) {

        this.descriptions = descriptions;
        return this;
    }

    public FiltersVmTemplate addDescriptionsItem(String descriptionsItem) {
        if (this.descriptions == null) {
            this.descriptions = new ArrayList<>();
        }
        this.descriptions.add(descriptionsItem);
        return this;
    }

    /**
     * The descriptions of the VM templates.
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

    public FiltersVmTemplate imageIds(List<String> imageIds) {

        this.imageIds = imageIds;
        return this;
    }

    public FiltersVmTemplate addImageIdsItem(String imageIdsItem) {
        if (this.imageIds == null) {
            this.imageIds = new ArrayList<>();
        }
        this.imageIds.add(imageIdsItem);
        return this;
    }

    /**
     * The IDs of the OMIs.
     *
     * @return imageIds
     */
    @javax.annotation.Nullable
    public List<String> getImageIds() {
        return imageIds;
    }

    public void setImageIds(List<String> imageIds) {
        this.imageIds = imageIds;
    }

    public FiltersVmTemplate keypairNames(List<String> keypairNames) {

        this.keypairNames = keypairNames;
        return this;
    }

    public FiltersVmTemplate addKeypairNamesItem(String keypairNamesItem) {
        if (this.keypairNames == null) {
            this.keypairNames = new ArrayList<>();
        }
        this.keypairNames.add(keypairNamesItem);
        return this;
    }

    /**
     * The names of the keypairs.
     *
     * @return keypairNames
     */
    @javax.annotation.Nullable
    public List<String> getKeypairNames() {
        return keypairNames;
    }

    public void setKeypairNames(List<String> keypairNames) {
        this.keypairNames = keypairNames;
    }

    public FiltersVmTemplate rams(List<Integer> rams) {

        this.rams = rams;
        return this;
    }

    public FiltersVmTemplate addRamsItem(Integer ramsItem) {
        if (this.rams == null) {
            this.rams = new ArrayList<>();
        }
        this.rams.add(ramsItem);
        return this;
    }

    /**
     * The amount of RAM.
     *
     * @return rams
     */
    @javax.annotation.Nullable
    public List<Integer> getRams() {
        return rams;
    }

    public void setRams(List<Integer> rams) {
        this.rams = rams;
    }

    public FiltersVmTemplate tagKeys(List<String> tagKeys) {

        this.tagKeys = tagKeys;
        return this;
    }

    public FiltersVmTemplate addTagKeysItem(String tagKeysItem) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        this.tagKeys.add(tagKeysItem);
        return this;
    }

    /**
     * The keys of the tags associated with the VM templates.
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

    public FiltersVmTemplate tagValues(List<String> tagValues) {

        this.tagValues = tagValues;
        return this;
    }

    public FiltersVmTemplate addTagValuesItem(String tagValuesItem) {
        if (this.tagValues == null) {
            this.tagValues = new ArrayList<>();
        }
        this.tagValues.add(tagValuesItem);
        return this;
    }

    /**
     * The values of the tags associated with the VM templates.
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

    public FiltersVmTemplate tags(List<String> tags) {

        this.tags = tags;
        return this;
    }

    public FiltersVmTemplate addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The key/value combination of the tags associated with the VM templates, in the following
     * format: \&quot;Filters\&quot;:{\&quot;Tags\&quot;:[\&quot;TAGKEY&#x3D;TAGVALUE\&quot;]}.
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

    public FiltersVmTemplate vmTemplateIds(List<String> vmTemplateIds) {

        this.vmTemplateIds = vmTemplateIds;
        return this;
    }

    public FiltersVmTemplate addVmTemplateIdsItem(String vmTemplateIdsItem) {
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

    public FiltersVmTemplate vmTemplateNames(List<String> vmTemplateNames) {

        this.vmTemplateNames = vmTemplateNames;
        return this;
    }

    public FiltersVmTemplate addVmTemplateNamesItem(String vmTemplateNamesItem) {
        if (this.vmTemplateNames == null) {
            this.vmTemplateNames = new ArrayList<>();
        }
        this.vmTemplateNames.add(vmTemplateNamesItem);
        return this;
    }

    /**
     * The names of the VM templates.
     *
     * @return vmTemplateNames
     */
    @javax.annotation.Nullable
    public List<String> getVmTemplateNames() {
        return vmTemplateNames;
    }

    public void setVmTemplateNames(List<String> vmTemplateNames) {
        this.vmTemplateNames = vmTemplateNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersVmTemplate filtersVmTemplate = (FiltersVmTemplate) o;
        return Objects.equals(this.cpuCores, filtersVmTemplate.cpuCores)
                && Objects.equals(this.cpuGenerations, filtersVmTemplate.cpuGenerations)
                && Objects.equals(this.cpuPerformances, filtersVmTemplate.cpuPerformances)
                && Objects.equals(this.descriptions, filtersVmTemplate.descriptions)
                && Objects.equals(this.imageIds, filtersVmTemplate.imageIds)
                && Objects.equals(this.keypairNames, filtersVmTemplate.keypairNames)
                && Objects.equals(this.rams, filtersVmTemplate.rams)
                && Objects.equals(this.tagKeys, filtersVmTemplate.tagKeys)
                && Objects.equals(this.tagValues, filtersVmTemplate.tagValues)
                && Objects.equals(this.tags, filtersVmTemplate.tags)
                && Objects.equals(this.vmTemplateIds, filtersVmTemplate.vmTemplateIds)
                && Objects.equals(this.vmTemplateNames, filtersVmTemplate.vmTemplateNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cpuCores,
                cpuGenerations,
                cpuPerformances,
                descriptions,
                imageIds,
                keypairNames,
                rams,
                tagKeys,
                tagValues,
                tags,
                vmTemplateIds,
                vmTemplateNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersVmTemplate {\n");
        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
        sb.append("    cpuGenerations: ").append(toIndentedString(cpuGenerations)).append("\n");
        sb.append("    cpuPerformances: ").append(toIndentedString(cpuPerformances)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
        sb.append("    keypairNames: ").append(toIndentedString(keypairNames)).append("\n");
        sb.append("    rams: ").append(toIndentedString(rams)).append("\n");
        sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
        sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vmTemplateIds: ").append(toIndentedString(vmTemplateIds)).append("\n");
        sb.append("    vmTemplateNames: ").append(toIndentedString(vmTemplateNames)).append("\n");
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
        openapiFields.add("CpuCores");
        openapiFields.add("CpuGenerations");
        openapiFields.add("CpuPerformances");
        openapiFields.add("Descriptions");
        openapiFields.add("ImageIds");
        openapiFields.add("KeypairNames");
        openapiFields.add("Rams");
        openapiFields.add("TagKeys");
        openapiFields.add("TagValues");
        openapiFields.add("Tags");
        openapiFields.add("VmTemplateIds");
        openapiFields.add("VmTemplateNames");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersVmTemplate
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersVmTemplate.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersVmTemplate is not found in the"
                                        + " empty JSON string",
                                FiltersVmTemplate.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersVmTemplate.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersVmTemplate` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("CpuCores") != null && !jsonObj.get("CpuCores").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CpuCores` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("CpuCores").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("CpuGenerations") != null && !jsonObj.get("CpuGenerations").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CpuGenerations` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("CpuGenerations").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("CpuPerformances") != null
                && !jsonObj.get("CpuPerformances").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CpuPerformances` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("CpuPerformances").toString()));
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
        if (jsonObj.get("ImageIds") != null && !jsonObj.get("ImageIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ImageIds` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("ImageIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("KeypairNames") != null && !jsonObj.get("KeypairNames").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `KeypairNames` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("KeypairNames").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Rams") != null && !jsonObj.get("Rams").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Rams` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Rams").toString()));
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
        if (jsonObj.get("VmTemplateIds") != null && !jsonObj.get("VmTemplateIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmTemplateIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VmTemplateIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VmTemplateNames") != null
                && !jsonObj.get("VmTemplateNames").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmTemplateNames` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VmTemplateNames").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersVmTemplate.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersVmTemplate' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersVmTemplate> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersVmTemplate.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersVmTemplate>() {
                        @Override
                        public void write(JsonWriter out, FiltersVmTemplate value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersVmTemplate read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersVmTemplate given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersVmTemplate
     * @throws IOException if the JSON string is invalid with respect to FiltersVmTemplate
     */
    public static FiltersVmTemplate fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersVmTemplate.class);
    }

    /**
     * Convert an instance of FiltersVmTemplate to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

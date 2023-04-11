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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.outscale.osc_sdk_java.client.JSON;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Information about the VM template. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VmTemplate {
    public static final String SERIALIZED_NAME_CPU_CORES = "CpuCores";

    @SerializedName(SERIALIZED_NAME_CPU_CORES)
    private Integer cpuCores;

    public static final String SERIALIZED_NAME_CPU_GENERATION = "CpuGeneration";

    @SerializedName(SERIALIZED_NAME_CPU_GENERATION)
    private String cpuGeneration;

    /** The performance of the VMs. */
    @JsonAdapter(CpuPerformanceEnum.Adapter.class)
    public enum CpuPerformanceEnum {
        MEDIUM("medium"),

        HIGH("high"),

        HIGHEST("highest");

        private String value;

        CpuPerformanceEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CpuPerformanceEnum fromValue(String value) {
            for (CpuPerformanceEnum b : CpuPerformanceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<CpuPerformanceEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CpuPerformanceEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CpuPerformanceEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CpuPerformanceEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_CPU_PERFORMANCE = "CpuPerformance";

    @SerializedName(SERIALIZED_NAME_CPU_PERFORMANCE)
    private CpuPerformanceEnum cpuPerformance;

    public static final String SERIALIZED_NAME_CREATION_DATE = "CreationDate";

    @SerializedName(SERIALIZED_NAME_CREATION_DATE)
    private OffsetDateTime creationDate;

    public static final String SERIALIZED_NAME_DESCRIPTION = "Description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_IMAGE_ID = "ImageId";

    @SerializedName(SERIALIZED_NAME_IMAGE_ID)
    private String imageId;

    public static final String SERIALIZED_NAME_KEYPAIR_NAME = "KeypairName";

    @SerializedName(SERIALIZED_NAME_KEYPAIR_NAME)
    private String keypairName;

    public static final String SERIALIZED_NAME_RAM = "Ram";

    @SerializedName(SERIALIZED_NAME_RAM)
    private Integer ram;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_ID = "VmTemplateId";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_ID)
    private String vmTemplateId;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_NAME = "VmTemplateName";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_NAME)
    private String vmTemplateName;

    public VmTemplate() {}

    public VmTemplate cpuCores(Integer cpuCores) {

        this.cpuCores = cpuCores;
        return this;
    }

    /**
     * The number of vCores.
     *
     * @return cpuCores
     */
    @javax.annotation.Nonnull
    public Integer getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
    }

    public VmTemplate cpuGeneration(String cpuGeneration) {

        this.cpuGeneration = cpuGeneration;
        return this;
    }

    /**
     * The processor generation.
     *
     * @return cpuGeneration
     */
    @javax.annotation.Nonnull
    public String getCpuGeneration() {
        return cpuGeneration;
    }

    public void setCpuGeneration(String cpuGeneration) {
        this.cpuGeneration = cpuGeneration;
    }

    public VmTemplate cpuPerformance(CpuPerformanceEnum cpuPerformance) {

        this.cpuPerformance = cpuPerformance;
        return this;
    }

    /**
     * The performance of the VMs.
     *
     * @return cpuPerformance
     */
    @javax.annotation.Nullable
    public CpuPerformanceEnum getCpuPerformance() {
        return cpuPerformance;
    }

    public void setCpuPerformance(CpuPerformanceEnum cpuPerformance) {
        this.cpuPerformance = cpuPerformance;
    }

    public VmTemplate creationDate(OffsetDateTime creationDate) {

        this.creationDate = creationDate;
        return this;
    }

    /**
     * The date and time of creation of the VM template.
     *
     * @return creationDate
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public VmTemplate description(String description) {

        this.description = description;
        return this;
    }

    /**
     * The description of the VM template.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VmTemplate imageId(String imageId) {

        this.imageId = imageId;
        return this;
    }

    /**
     * The ID of the OMI.
     *
     * @return imageId
     */
    @javax.annotation.Nonnull
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public VmTemplate keypairName(String keypairName) {

        this.keypairName = keypairName;
        return this;
    }

    /**
     * The name of the keypair.
     *
     * @return keypairName
     */
    @javax.annotation.Nullable
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public VmTemplate ram(Integer ram) {

        this.ram = ram;
        return this;
    }

    /**
     * The amount of RAM.
     *
     * @return ram
     */
    @javax.annotation.Nonnull
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public VmTemplate tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public VmTemplate addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the VM template.
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

    public VmTemplate vmTemplateId(String vmTemplateId) {

        this.vmTemplateId = vmTemplateId;
        return this;
    }

    /**
     * The ID of the VM template.
     *
     * @return vmTemplateId
     */
    @javax.annotation.Nonnull
    public String getVmTemplateId() {
        return vmTemplateId;
    }

    public void setVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
    }

    public VmTemplate vmTemplateName(String vmTemplateName) {

        this.vmTemplateName = vmTemplateName;
        return this;
    }

    /**
     * The name of the VM template.
     *
     * @return vmTemplateName
     */
    @javax.annotation.Nonnull
    public String getVmTemplateName() {
        return vmTemplateName;
    }

    public void setVmTemplateName(String vmTemplateName) {
        this.vmTemplateName = vmTemplateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmTemplate vmTemplate = (VmTemplate) o;
        return Objects.equals(this.cpuCores, vmTemplate.cpuCores)
                && Objects.equals(this.cpuGeneration, vmTemplate.cpuGeneration)
                && Objects.equals(this.cpuPerformance, vmTemplate.cpuPerformance)
                && Objects.equals(this.creationDate, vmTemplate.creationDate)
                && Objects.equals(this.description, vmTemplate.description)
                && Objects.equals(this.imageId, vmTemplate.imageId)
                && Objects.equals(this.keypairName, vmTemplate.keypairName)
                && Objects.equals(this.ram, vmTemplate.ram)
                && Objects.equals(this.tags, vmTemplate.tags)
                && Objects.equals(this.vmTemplateId, vmTemplate.vmTemplateId)
                && Objects.equals(this.vmTemplateName, vmTemplate.vmTemplateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cpuCores,
                cpuGeneration,
                cpuPerformance,
                creationDate,
                description,
                imageId,
                keypairName,
                ram,
                tags,
                vmTemplateId,
                vmTemplateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmTemplate {\n");
        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
        sb.append("    cpuGeneration: ").append(toIndentedString(cpuGeneration)).append("\n");
        sb.append("    cpuPerformance: ").append(toIndentedString(cpuPerformance)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vmTemplateId: ").append(toIndentedString(vmTemplateId)).append("\n");
        sb.append("    vmTemplateName: ").append(toIndentedString(vmTemplateName)).append("\n");
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
        openapiFields.add("CpuGeneration");
        openapiFields.add("CpuPerformance");
        openapiFields.add("CreationDate");
        openapiFields.add("Description");
        openapiFields.add("ImageId");
        openapiFields.add("KeypairName");
        openapiFields.add("Ram");
        openapiFields.add("Tags");
        openapiFields.add("VmTemplateId");
        openapiFields.add("VmTemplateName");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("CpuCores");
        openapiRequiredFields.add("CpuGeneration");
        openapiRequiredFields.add("ImageId");
        openapiRequiredFields.add("Ram");
        openapiRequiredFields.add("VmTemplateId");
        openapiRequiredFields.add("VmTemplateName");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to VmTemplate
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!VmTemplate.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VmTemplate is not found in the empty"
                                        + " JSON string",
                                VmTemplate.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!VmTemplate.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `VmTemplate` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : VmTemplate.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("CpuGeneration").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CpuGeneration` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("CpuGeneration").toString()));
        }
        if ((jsonObj.get("CpuPerformance") != null && !jsonObj.get("CpuPerformance").isJsonNull())
                && !jsonObj.get("CpuPerformance").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CpuPerformance` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("CpuPerformance").toString()));
        }
        if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull())
                && !jsonObj.get("Description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Description").toString()));
        }
        if (!jsonObj.get("ImageId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ImageId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ImageId").toString()));
        }
        if ((jsonObj.get("KeypairName") != null && !jsonObj.get("KeypairName").isJsonNull())
                && !jsonObj.get("KeypairName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `KeypairName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("KeypairName").toString()));
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
        if (!jsonObj.get("VmTemplateId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmTemplateId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VmTemplateId").toString()));
        }
        if (!jsonObj.get("VmTemplateName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmTemplateName` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("VmTemplateName").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VmTemplate.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VmTemplate' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VmTemplate> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VmTemplate.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VmTemplate>() {
                        @Override
                        public void write(JsonWriter out, VmTemplate value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VmTemplate read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VmTemplate given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VmTemplate
     * @throws IOException if the JSON string is invalid with respect to VmTemplate
     */
    public static VmTemplate fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VmTemplate.class);
    }

    /**
     * Convert an instance of VmTemplate to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

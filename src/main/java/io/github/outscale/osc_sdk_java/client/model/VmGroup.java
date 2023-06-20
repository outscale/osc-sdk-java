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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Information about the VM group. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VmGroup {
    public static final String SERIALIZED_NAME_CREATION_DATE = "CreationDate";

    @SerializedName(SERIALIZED_NAME_CREATION_DATE)
    private String creationDate;

    public static final String SERIALIZED_NAME_DESCRIPTION = "Description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    /**
     * The positioning strategy of the VMs on hypervisors. By default, or if set to
     * &#x60;no-strategy&#x60;, TINA determines the most adequate position for the VMs. If set to
     * &#x60;attract&#x60;, the VMs are deployed on the same hypervisor, which improves network
     * performance. If set to &#x60;repulse&#x60;, the VMs are deployed on a different hypervisor,
     * which improves fault tolerance.
     */
    @JsonAdapter(PositioningStrategyEnum.Adapter.class)
    public enum PositioningStrategyEnum {
        ATTRACT("attract"),

        NO_STRATEGY("no-strategy"),

        REPULSE("repulse");

        private String value;

        PositioningStrategyEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PositioningStrategyEnum fromValue(String value) {
            for (PositioningStrategyEnum b : PositioningStrategyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<PositioningStrategyEnum> {
            @Override
            public void write(
                    final JsonWriter jsonWriter, final PositioningStrategyEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public PositioningStrategyEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return PositioningStrategyEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_POSITIONING_STRATEGY = "PositioningStrategy";

    @SerializedName(SERIALIZED_NAME_POSITIONING_STRATEGY)
    private PositioningStrategyEnum positioningStrategy;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
    private List<String> securityGroupIds = null;

    /**
     * The state of the VM group (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;scaling
     * up&#x60; \\| &#x60;scaling down&#x60; \\| &#x60;deleting&#x60; \\| &#x60;deleted&#x60;).
     */
    @JsonAdapter(StateEnum.Adapter.class)
    public enum StateEnum {
        AVAILABLE("available"),

        DELETED("deleted"),

        DELETING("deleting"),

        PENDING("pending"),

        SCALING_DOWN("scaling down"),

        SCALING_UP("scaling up");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private StateEnum state;

    public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";

    @SerializedName(SERIALIZED_NAME_SUBNET_ID)
    private String subnetId;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public static final String SERIALIZED_NAME_VM_COUNT = "VmCount";

    @SerializedName(SERIALIZED_NAME_VM_COUNT)
    private Integer vmCount;

    public static final String SERIALIZED_NAME_VM_GROUP_ID = "VmGroupId";

    @SerializedName(SERIALIZED_NAME_VM_GROUP_ID)
    private String vmGroupId;

    public static final String SERIALIZED_NAME_VM_GROUP_NAME = "VmGroupName";

    @SerializedName(SERIALIZED_NAME_VM_GROUP_NAME)
    private String vmGroupName;

    public static final String SERIALIZED_NAME_VM_IDS = "VmIds";

    @SerializedName(SERIALIZED_NAME_VM_IDS)
    private List<String> vmIds = null;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_ID = "VmTemplateId";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_ID)
    private String vmTemplateId;

    public VmGroup() {}

    public VmGroup creationDate(String creationDate) {

        this.creationDate = creationDate;
        return this;
    }

    /**
     * The date and time of creation of the VM group.
     *
     * @return creationDate
     */
    @javax.annotation.Nullable
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public VmGroup description(String description) {

        this.description = description;
        return this;
    }

    /**
     * The description of the VM group.
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

    public VmGroup positioningStrategy(PositioningStrategyEnum positioningStrategy) {

        this.positioningStrategy = positioningStrategy;
        return this;
    }

    /**
     * The positioning strategy of the VMs on hypervisors. By default, or if set to
     * &#x60;no-strategy&#x60;, TINA determines the most adequate position for the VMs. If set to
     * &#x60;attract&#x60;, the VMs are deployed on the same hypervisor, which improves network
     * performance. If set to &#x60;repulse&#x60;, the VMs are deployed on a different hypervisor,
     * which improves fault tolerance.
     *
     * @return positioningStrategy
     */
    @javax.annotation.Nullable
    public PositioningStrategyEnum getPositioningStrategy() {
        return positioningStrategy;
    }

    public void setPositioningStrategy(PositioningStrategyEnum positioningStrategy) {
        this.positioningStrategy = positioningStrategy;
    }

    public VmGroup securityGroupIds(List<String> securityGroupIds) {

        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public VmGroup addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    /**
     * One or more IDs of security groups for the VM group.
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

    public VmGroup state(StateEnum state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the VM group (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;scaling
     * up&#x60; \\| &#x60;scaling down&#x60; \\| &#x60;deleting&#x60; \\| &#x60;deleted&#x60;).
     *
     * @return state
     */
    @javax.annotation.Nullable
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public VmGroup subnetId(String subnetId) {

        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ID of the Subnet for the VM group.
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

    public VmGroup tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public VmGroup addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the VM group.
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

    public VmGroup vmCount(Integer vmCount) {

        this.vmCount = vmCount;
        return this;
    }

    /**
     * The number of VMs in the VM group.
     *
     * @return vmCount
     */
    @javax.annotation.Nullable
    public Integer getVmCount() {
        return vmCount;
    }

    public void setVmCount(Integer vmCount) {
        this.vmCount = vmCount;
    }

    public VmGroup vmGroupId(String vmGroupId) {

        this.vmGroupId = vmGroupId;
        return this;
    }

    /**
     * The ID of the VM group.
     *
     * @return vmGroupId
     */
    @javax.annotation.Nullable
    public String getVmGroupId() {
        return vmGroupId;
    }

    public void setVmGroupId(String vmGroupId) {
        this.vmGroupId = vmGroupId;
    }

    public VmGroup vmGroupName(String vmGroupName) {

        this.vmGroupName = vmGroupName;
        return this;
    }

    /**
     * The name of the VM group.
     *
     * @return vmGroupName
     */
    @javax.annotation.Nullable
    public String getVmGroupName() {
        return vmGroupName;
    }

    public void setVmGroupName(String vmGroupName) {
        this.vmGroupName = vmGroupName;
    }

    public VmGroup vmIds(List<String> vmIds) {

        this.vmIds = vmIds;
        return this;
    }

    public VmGroup addVmIdsItem(String vmIdsItem) {
        if (this.vmIds == null) {
            this.vmIds = new ArrayList<>();
        }
        this.vmIds.add(vmIdsItem);
        return this;
    }

    /**
     * The IDs of the VMs in the VM group.
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

    public VmGroup vmTemplateId(String vmTemplateId) {

        this.vmTemplateId = vmTemplateId;
        return this;
    }

    /**
     * The ID of the VM template used by the VM group.
     *
     * @return vmTemplateId
     */
    @javax.annotation.Nullable
    public String getVmTemplateId() {
        return vmTemplateId;
    }

    public void setVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmGroup vmGroup = (VmGroup) o;
        return Objects.equals(this.creationDate, vmGroup.creationDate)
                && Objects.equals(this.description, vmGroup.description)
                && Objects.equals(this.positioningStrategy, vmGroup.positioningStrategy)
                && Objects.equals(this.securityGroupIds, vmGroup.securityGroupIds)
                && Objects.equals(this.state, vmGroup.state)
                && Objects.equals(this.subnetId, vmGroup.subnetId)
                && Objects.equals(this.tags, vmGroup.tags)
                && Objects.equals(this.vmCount, vmGroup.vmCount)
                && Objects.equals(this.vmGroupId, vmGroup.vmGroupId)
                && Objects.equals(this.vmGroupName, vmGroup.vmGroupName)
                && Objects.equals(this.vmIds, vmGroup.vmIds)
                && Objects.equals(this.vmTemplateId, vmGroup.vmTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                creationDate,
                description,
                positioningStrategy,
                securityGroupIds,
                state,
                subnetId,
                tags,
                vmCount,
                vmGroupId,
                vmGroupName,
                vmIds,
                vmTemplateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmGroup {\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    positioningStrategy: ")
                .append(toIndentedString(positioningStrategy))
                .append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vmCount: ").append(toIndentedString(vmCount)).append("\n");
        sb.append("    vmGroupId: ").append(toIndentedString(vmGroupId)).append("\n");
        sb.append("    vmGroupName: ").append(toIndentedString(vmGroupName)).append("\n");
        sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
        sb.append("    vmTemplateId: ").append(toIndentedString(vmTemplateId)).append("\n");
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
        openapiFields.add("CreationDate");
        openapiFields.add("Description");
        openapiFields.add("PositioningStrategy");
        openapiFields.add("SecurityGroupIds");
        openapiFields.add("State");
        openapiFields.add("SubnetId");
        openapiFields.add("Tags");
        openapiFields.add("VmCount");
        openapiFields.add("VmGroupId");
        openapiFields.add("VmGroupName");
        openapiFields.add("VmIds");
        openapiFields.add("VmTemplateId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to VmGroup
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!VmGroup.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VmGroup is not found in the empty"
                                        + " JSON string",
                                VmGroup.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!VmGroup.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `VmGroup`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("CreationDate") != null && !jsonObj.get("CreationDate").isJsonNull())
                && !jsonObj.get("CreationDate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CreationDate` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("CreationDate").toString()));
        }
        if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull())
                && !jsonObj.get("Description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Description").toString()));
        }
        if ((jsonObj.get("PositioningStrategy") != null
                        && !jsonObj.get("PositioningStrategy").isJsonNull())
                && !jsonObj.get("PositioningStrategy").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PositioningStrategy` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("PositioningStrategy").toString()));
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
        if ((jsonObj.get("VmGroupId") != null && !jsonObj.get("VmGroupId").isJsonNull())
                && !jsonObj.get("VmGroupId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmGroupId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VmGroupId").toString()));
        }
        if ((jsonObj.get("VmGroupName") != null && !jsonObj.get("VmGroupName").isJsonNull())
                && !jsonObj.get("VmGroupName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmGroupName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VmGroupName").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VmIds") != null && !jsonObj.get("VmIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmIds` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("VmIds").toString()));
        }
        if ((jsonObj.get("VmTemplateId") != null && !jsonObj.get("VmTemplateId").isJsonNull())
                && !jsonObj.get("VmTemplateId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmTemplateId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VmTemplateId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VmGroup.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VmGroup' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VmGroup> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VmGroup.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VmGroup>() {
                        @Override
                        public void write(JsonWriter out, VmGroup value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VmGroup read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VmGroup given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VmGroup
     * @throws IOException if the JSON string is invalid with respect to VmGroup
     */
    public static VmGroup fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VmGroup.class);
    }

    /**
     * Convert an instance of VmGroup to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

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

/** CreateVmGroupRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateVmGroupRequest {
    public static final String SERIALIZED_NAME_DESCRIPTION = "Description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    /**
     * The positioning strategy of VMs on hypervisors. By default, or if set to
     * &#x60;no-strategy&#x60; our orchestrator determines the most adequate position for your VMs.
     * If set to &#x60;attract&#x60;, your VMs are deployed on the same hypervisor, which improves
     * network performance. If set to &#x60;repulse&#x60;, your VMs are deployed on a different
     * hypervisor, which improves fault tolerance.
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
    private PositioningStrategyEnum positioningStrategy = PositioningStrategyEnum.NO_STRATEGY;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
    private List<String> securityGroupIds = new ArrayList<>();

    public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";

    @SerializedName(SERIALIZED_NAME_SUBNET_ID)
    private String subnetId;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public static final String SERIALIZED_NAME_VM_COUNT = "VmCount";

    @SerializedName(SERIALIZED_NAME_VM_COUNT)
    private Integer vmCount;

    public static final String SERIALIZED_NAME_VM_GROUP_NAME = "VmGroupName";

    @SerializedName(SERIALIZED_NAME_VM_GROUP_NAME)
    private String vmGroupName;

    public static final String SERIALIZED_NAME_VM_TEMPLATE_ID = "VmTemplateId";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATE_ID)
    private String vmTemplateId;

    public CreateVmGroupRequest() {}

    public CreateVmGroupRequest description(String description) {

        this.description = description;
        return this;
    }

    /**
     * A description for the VM group.
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

    public CreateVmGroupRequest dryRun(Boolean dryRun) {

        this.dryRun = dryRun;
        return this;
    }

    /**
     * If true, checks whether you have the required permissions to perform the action.
     *
     * @return dryRun
     */
    @javax.annotation.Nullable
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public CreateVmGroupRequest positioningStrategy(PositioningStrategyEnum positioningStrategy) {

        this.positioningStrategy = positioningStrategy;
        return this;
    }

    /**
     * The positioning strategy of VMs on hypervisors. By default, or if set to
     * &#x60;no-strategy&#x60; our orchestrator determines the most adequate position for your VMs.
     * If set to &#x60;attract&#x60;, your VMs are deployed on the same hypervisor, which improves
     * network performance. If set to &#x60;repulse&#x60;, your VMs are deployed on a different
     * hypervisor, which improves fault tolerance.
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

    public CreateVmGroupRequest securityGroupIds(List<String> securityGroupIds) {

        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public CreateVmGroupRequest addSecurityGroupIdsItem(String securityGroupIdsItem) {
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    /**
     * One or more IDs of security groups for the VM group.
     *
     * @return securityGroupIds
     */
    @javax.annotation.Nonnull
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public CreateVmGroupRequest subnetId(String subnetId) {

        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ID of the Subnet in which you want to create the VM group.
     *
     * @return subnetId
     */
    @javax.annotation.Nonnull
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateVmGroupRequest tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public CreateVmGroupRequest addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags to add to the VM group.
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

    public CreateVmGroupRequest vmCount(Integer vmCount) {

        this.vmCount = vmCount;
        return this;
    }

    /**
     * The number of VMs deployed in the VM group.
     *
     * @return vmCount
     */
    @javax.annotation.Nonnull
    public Integer getVmCount() {
        return vmCount;
    }

    public void setVmCount(Integer vmCount) {
        this.vmCount = vmCount;
    }

    public CreateVmGroupRequest vmGroupName(String vmGroupName) {

        this.vmGroupName = vmGroupName;
        return this;
    }

    /**
     * The name of the VM group.
     *
     * @return vmGroupName
     */
    @javax.annotation.Nonnull
    public String getVmGroupName() {
        return vmGroupName;
    }

    public void setVmGroupName(String vmGroupName) {
        this.vmGroupName = vmGroupName;
    }

    public CreateVmGroupRequest vmTemplateId(String vmTemplateId) {

        this.vmTemplateId = vmTemplateId;
        return this;
    }

    /**
     * The ID of the VM template used to launch VMs in the VM group.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVmGroupRequest createVmGroupRequest = (CreateVmGroupRequest) o;
        return Objects.equals(this.description, createVmGroupRequest.description)
                && Objects.equals(this.dryRun, createVmGroupRequest.dryRun)
                && Objects.equals(
                        this.positioningStrategy, createVmGroupRequest.positioningStrategy)
                && Objects.equals(this.securityGroupIds, createVmGroupRequest.securityGroupIds)
                && Objects.equals(this.subnetId, createVmGroupRequest.subnetId)
                && Objects.equals(this.tags, createVmGroupRequest.tags)
                && Objects.equals(this.vmCount, createVmGroupRequest.vmCount)
                && Objects.equals(this.vmGroupName, createVmGroupRequest.vmGroupName)
                && Objects.equals(this.vmTemplateId, createVmGroupRequest.vmTemplateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description,
                dryRun,
                positioningStrategy,
                securityGroupIds,
                subnetId,
                tags,
                vmCount,
                vmGroupName,
                vmTemplateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVmGroupRequest {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    positioningStrategy: ")
                .append(toIndentedString(positioningStrategy))
                .append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vmCount: ").append(toIndentedString(vmCount)).append("\n");
        sb.append("    vmGroupName: ").append(toIndentedString(vmGroupName)).append("\n");
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
        openapiFields.add("Description");
        openapiFields.add("DryRun");
        openapiFields.add("PositioningStrategy");
        openapiFields.add("SecurityGroupIds");
        openapiFields.add("SubnetId");
        openapiFields.add("Tags");
        openapiFields.add("VmCount");
        openapiFields.add("VmGroupName");
        openapiFields.add("VmTemplateId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("SecurityGroupIds");
        openapiRequiredFields.add("SubnetId");
        openapiRequiredFields.add("VmCount");
        openapiRequiredFields.add("VmGroupName");
        openapiRequiredFields.add("VmTemplateId");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CreateVmGroupRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateVmGroupRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateVmGroupRequest is not found in"
                                        + " the empty JSON string",
                                CreateVmGroupRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateVmGroupRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateVmGroupRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateVmGroupRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
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
        // ensure the required json array is present
        if (jsonObj.get("SecurityGroupIds") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("SecurityGroupIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SecurityGroupIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SecurityGroupIds").toString()));
        }
        if (!jsonObj.get("SubnetId").isJsonPrimitive()) {
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
        if (!jsonObj.get("VmGroupName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmGroupName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VmGroupName").toString()));
        }
        if (!jsonObj.get("VmTemplateId").isJsonPrimitive()) {
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
            if (!CreateVmGroupRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateVmGroupRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateVmGroupRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateVmGroupRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateVmGroupRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateVmGroupRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateVmGroupRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateVmGroupRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateVmGroupRequest
     * @throws IOException if the JSON string is invalid with respect to CreateVmGroupRequest
     */
    public static CreateVmGroupRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateVmGroupRequest.class);
    }

    /**
     * Convert an instance of CreateVmGroupRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

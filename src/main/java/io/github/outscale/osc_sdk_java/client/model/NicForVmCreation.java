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

/** Information about the network interface card (NIC) when creating a virtual machine (VM). */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NicForVmCreation {
    public static final String SERIALIZED_NAME_DELETE_ON_VM_DELETION = "DeleteOnVmDeletion";

    @SerializedName(SERIALIZED_NAME_DELETE_ON_VM_DELETION)
    private Boolean deleteOnVmDeletion;

    public static final String SERIALIZED_NAME_DESCRIPTION = "Description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DEVICE_NUMBER = "DeviceNumber";

    @SerializedName(SERIALIZED_NAME_DEVICE_NUMBER)
    private Integer deviceNumber;

    public static final String SERIALIZED_NAME_NIC_ID = "NicId";

    @SerializedName(SERIALIZED_NAME_NIC_ID)
    private String nicId;

    public static final String SERIALIZED_NAME_PRIVATE_IPS = "PrivateIps";

    @SerializedName(SERIALIZED_NAME_PRIVATE_IPS)
    private List<PrivateIpLight> privateIps = null;

    public static final String SERIALIZED_NAME_SECONDARY_PRIVATE_IP_COUNT =
            "SecondaryPrivateIpCount";

    @SerializedName(SERIALIZED_NAME_SECONDARY_PRIVATE_IP_COUNT)
    private Integer secondaryPrivateIpCount;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
    private List<String> securityGroupIds = null;

    public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";

    @SerializedName(SERIALIZED_NAME_SUBNET_ID)
    private String subnetId;

    public NicForVmCreation() {}

    public NicForVmCreation deleteOnVmDeletion(Boolean deleteOnVmDeletion) {

        this.deleteOnVmDeletion = deleteOnVmDeletion;
        return this;
    }

    /**
     * If true, the NIC is deleted when the VM is terminated. You can specify this parameter only
     * for a new NIC. To modify this value for an existing NIC, see [UpdateNic](#updatenic).
     *
     * @return deleteOnVmDeletion
     */
    @javax.annotation.Nullable
    public Boolean getDeleteOnVmDeletion() {
        return deleteOnVmDeletion;
    }

    public void setDeleteOnVmDeletion(Boolean deleteOnVmDeletion) {
        this.deleteOnVmDeletion = deleteOnVmDeletion;
    }

    public NicForVmCreation description(String description) {

        this.description = description;
        return this;
    }

    /**
     * The description of the NIC, if you are creating a NIC when creating the VM.
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

    public NicForVmCreation deviceNumber(Integer deviceNumber) {

        this.deviceNumber = deviceNumber;
        return this;
    }

    /**
     * The index of the VM device for the NIC attachment (between &#x60;0&#x60; and &#x60;7&#x60;,
     * both included). This parameter is required if you create a NIC when creating the VM.
     *
     * @return deviceNumber
     */
    @javax.annotation.Nullable
    public Integer getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(Integer deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public NicForVmCreation nicId(String nicId) {

        this.nicId = nicId;
        return this;
    }

    /**
     * The ID of the NIC, if you are attaching an existing NIC when creating a VM.
     *
     * @return nicId
     */
    @javax.annotation.Nullable
    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public NicForVmCreation privateIps(List<PrivateIpLight> privateIps) {

        this.privateIps = privateIps;
        return this;
    }

    public NicForVmCreation addPrivateIpsItem(PrivateIpLight privateIpsItem) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        this.privateIps.add(privateIpsItem);
        return this;
    }

    /**
     * One or more private IPs to assign to the NIC, if you create a NIC when creating a VM. Only
     * one private IP can be the primary private IP.
     *
     * @return privateIps
     */
    @javax.annotation.Nullable
    public List<PrivateIpLight> getPrivateIps() {
        return privateIps;
    }

    public void setPrivateIps(List<PrivateIpLight> privateIps) {
        this.privateIps = privateIps;
    }

    public NicForVmCreation secondaryPrivateIpCount(Integer secondaryPrivateIpCount) {

        this.secondaryPrivateIpCount = secondaryPrivateIpCount;
        return this;
    }

    /**
     * The number of secondary private IPs, if you create a NIC when creating a VM. This parameter
     * cannot be specified if you specified more than one private IP in the &#x60;PrivateIps&#x60;
     * parameter.
     *
     * @return secondaryPrivateIpCount
     */
    @javax.annotation.Nullable
    public Integer getSecondaryPrivateIpCount() {
        return secondaryPrivateIpCount;
    }

    public void setSecondaryPrivateIpCount(Integer secondaryPrivateIpCount) {
        this.secondaryPrivateIpCount = secondaryPrivateIpCount;
    }

    public NicForVmCreation securityGroupIds(List<String> securityGroupIds) {

        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public NicForVmCreation addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    /**
     * One or more IDs of security groups for the NIC, if you create a NIC when creating a VM.
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

    public NicForVmCreation subnetId(String subnetId) {

        this.subnetId = subnetId;
        return this;
    }

    /**
     * The ID of the Subnet for the NIC, if you create a NIC when creating a VM. This parameter is
     * required if you create a NIC when creating the VM.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NicForVmCreation nicForVmCreation = (NicForVmCreation) o;
        return Objects.equals(this.deleteOnVmDeletion, nicForVmCreation.deleteOnVmDeletion)
                && Objects.equals(this.description, nicForVmCreation.description)
                && Objects.equals(this.deviceNumber, nicForVmCreation.deviceNumber)
                && Objects.equals(this.nicId, nicForVmCreation.nicId)
                && Objects.equals(this.privateIps, nicForVmCreation.privateIps)
                && Objects.equals(
                        this.secondaryPrivateIpCount, nicForVmCreation.secondaryPrivateIpCount)
                && Objects.equals(this.securityGroupIds, nicForVmCreation.securityGroupIds)
                && Objects.equals(this.subnetId, nicForVmCreation.subnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                deleteOnVmDeletion,
                description,
                deviceNumber,
                nicId,
                privateIps,
                secondaryPrivateIpCount,
                securityGroupIds,
                subnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NicForVmCreation {\n");
        sb.append("    deleteOnVmDeletion: ")
                .append(toIndentedString(deleteOnVmDeletion))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deviceNumber: ").append(toIndentedString(deviceNumber)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
        sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
        sb.append("    secondaryPrivateIpCount: ")
                .append(toIndentedString(secondaryPrivateIpCount))
                .append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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
        openapiFields.add("DeleteOnVmDeletion");
        openapiFields.add("Description");
        openapiFields.add("DeviceNumber");
        openapiFields.add("NicId");
        openapiFields.add("PrivateIps");
        openapiFields.add("SecondaryPrivateIpCount");
        openapiFields.add("SecurityGroupIds");
        openapiFields.add("SubnetId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to NicForVmCreation
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!NicForVmCreation.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in NicForVmCreation is not found in the"
                                        + " empty JSON string",
                                NicForVmCreation.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!NicForVmCreation.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `NicForVmCreation` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
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
        if ((jsonObj.get("NicId") != null && !jsonObj.get("NicId").isJsonNull())
                && !jsonObj.get("NicId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NicId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NicId").toString()));
        }
        if (jsonObj.get("PrivateIps") != null && !jsonObj.get("PrivateIps").isJsonNull()) {
            JsonArray jsonArrayprivateIps = jsonObj.getAsJsonArray("PrivateIps");
            if (jsonArrayprivateIps != null) {
                // ensure the json data is an array
                if (!jsonObj.get("PrivateIps").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `PrivateIps` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("PrivateIps").toString()));
                }

                // validate the optional field `PrivateIps` (array)
                for (int i = 0; i < jsonArrayprivateIps.size(); i++) {
                    PrivateIpLight.validateJsonObject(jsonArrayprivateIps.get(i).getAsJsonObject());
                }
                ;
            }
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
        if ((jsonObj.get("SubnetId") != null && !jsonObj.get("SubnetId").isJsonNull())
                && !jsonObj.get("SubnetId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubnetId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SubnetId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!NicForVmCreation.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'NicForVmCreation' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NicForVmCreation> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(NicForVmCreation.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<NicForVmCreation>() {
                        @Override
                        public void write(JsonWriter out, NicForVmCreation value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public NicForVmCreation read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of NicForVmCreation given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of NicForVmCreation
     * @throws IOException if the JSON string is invalid with respect to NicForVmCreation
     */
    public static NicForVmCreation fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, NicForVmCreation.class);
    }

    /**
     * Convert an instance of NicForVmCreation to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

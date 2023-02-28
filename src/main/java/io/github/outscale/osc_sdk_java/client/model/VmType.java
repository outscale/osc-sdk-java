/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.25
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

/** Information about the VM type. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VmType {
    public static final String SERIALIZED_NAME_BSU_OPTIMIZED = "BsuOptimized";

    @SerializedName(SERIALIZED_NAME_BSU_OPTIMIZED)
    private Boolean bsuOptimized;

    public static final String SERIALIZED_NAME_MAX_PRIVATE_IPS = "MaxPrivateIps";

    @SerializedName(SERIALIZED_NAME_MAX_PRIVATE_IPS)
    private Integer maxPrivateIps;

    public static final String SERIALIZED_NAME_MEMORY_SIZE = "MemorySize";

    @SerializedName(SERIALIZED_NAME_MEMORY_SIZE)
    private Float memorySize;

    public static final String SERIALIZED_NAME_VCORE_COUNT = "VcoreCount";

    @SerializedName(SERIALIZED_NAME_VCORE_COUNT)
    private Integer vcoreCount;

    public static final String SERIALIZED_NAME_VM_TYPE_NAME = "VmTypeName";

    @SerializedName(SERIALIZED_NAME_VM_TYPE_NAME)
    private String vmTypeName;

    public static final String SERIALIZED_NAME_VOLUME_COUNT = "VolumeCount";

    @SerializedName(SERIALIZED_NAME_VOLUME_COUNT)
    private Integer volumeCount;

    public static final String SERIALIZED_NAME_VOLUME_SIZE = "VolumeSize";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE)
    private Integer volumeSize;

    public VmType() {}

    public VmType bsuOptimized(Boolean bsuOptimized) {

        this.bsuOptimized = bsuOptimized;
        return this;
    }

    /**
     * This parameter is not available. It is present in our API for the sake of historical
     * compatibility with AWS.
     *
     * @return bsuOptimized
     */
    @javax.annotation.Nullable
    public Boolean getBsuOptimized() {
        return bsuOptimized;
    }

    public void setBsuOptimized(Boolean bsuOptimized) {
        this.bsuOptimized = bsuOptimized;
    }

    public VmType maxPrivateIps(Integer maxPrivateIps) {

        this.maxPrivateIps = maxPrivateIps;
        return this;
    }

    /**
     * The maximum number of private IPs per network interface card (NIC).
     *
     * @return maxPrivateIps
     */
    @javax.annotation.Nullable
    public Integer getMaxPrivateIps() {
        return maxPrivateIps;
    }

    public void setMaxPrivateIps(Integer maxPrivateIps) {
        this.maxPrivateIps = maxPrivateIps;
    }

    public VmType memorySize(Float memorySize) {

        this.memorySize = memorySize;
        return this;
    }

    /**
     * The amount of memory, in gibibytes.
     *
     * @return memorySize
     */
    @javax.annotation.Nullable
    public Float getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Float memorySize) {
        this.memorySize = memorySize;
    }

    public VmType vcoreCount(Integer vcoreCount) {

        this.vcoreCount = vcoreCount;
        return this;
    }

    /**
     * The number of vCores.
     *
     * @return vcoreCount
     */
    @javax.annotation.Nullable
    public Integer getVcoreCount() {
        return vcoreCount;
    }

    public void setVcoreCount(Integer vcoreCount) {
        this.vcoreCount = vcoreCount;
    }

    public VmType vmTypeName(String vmTypeName) {

        this.vmTypeName = vmTypeName;
        return this;
    }

    /**
     * The name of the VM type.
     *
     * @return vmTypeName
     */
    @javax.annotation.Nullable
    public String getVmTypeName() {
        return vmTypeName;
    }

    public void setVmTypeName(String vmTypeName) {
        this.vmTypeName = vmTypeName;
    }

    public VmType volumeCount(Integer volumeCount) {

        this.volumeCount = volumeCount;
        return this;
    }

    /**
     * The maximum number of ephemeral storage disks.
     *
     * @return volumeCount
     */
    @javax.annotation.Nullable
    public Integer getVolumeCount() {
        return volumeCount;
    }

    public void setVolumeCount(Integer volumeCount) {
        this.volumeCount = volumeCount;
    }

    public VmType volumeSize(Integer volumeSize) {

        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * The size of one ephemeral storage disk, in gibibytes (GiB).
     *
     * @return volumeSize
     */
    @javax.annotation.Nullable
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmType vmType = (VmType) o;
        return Objects.equals(this.bsuOptimized, vmType.bsuOptimized)
                && Objects.equals(this.maxPrivateIps, vmType.maxPrivateIps)
                && Objects.equals(this.memorySize, vmType.memorySize)
                && Objects.equals(this.vcoreCount, vmType.vcoreCount)
                && Objects.equals(this.vmTypeName, vmType.vmTypeName)
                && Objects.equals(this.volumeCount, vmType.volumeCount)
                && Objects.equals(this.volumeSize, vmType.volumeSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                bsuOptimized,
                maxPrivateIps,
                memorySize,
                vcoreCount,
                vmTypeName,
                volumeCount,
                volumeSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmType {\n");
        sb.append("    bsuOptimized: ").append(toIndentedString(bsuOptimized)).append("\n");
        sb.append("    maxPrivateIps: ").append(toIndentedString(maxPrivateIps)).append("\n");
        sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
        sb.append("    vcoreCount: ").append(toIndentedString(vcoreCount)).append("\n");
        sb.append("    vmTypeName: ").append(toIndentedString(vmTypeName)).append("\n");
        sb.append("    volumeCount: ").append(toIndentedString(volumeCount)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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
        openapiFields.add("BsuOptimized");
        openapiFields.add("MaxPrivateIps");
        openapiFields.add("MemorySize");
        openapiFields.add("VcoreCount");
        openapiFields.add("VmTypeName");
        openapiFields.add("VolumeCount");
        openapiFields.add("VolumeSize");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to VmType
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!VmType.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VmType is not found in the empty JSON"
                                        + " string",
                                VmType.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!VmType.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `VmType`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("VmTypeName") != null && !jsonObj.get("VmTypeName").isJsonNull())
                && !jsonObj.get("VmTypeName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmTypeName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VmTypeName").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VmType.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VmType' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VmType> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VmType.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VmType>() {
                        @Override
                        public void write(JsonWriter out, VmType value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VmType read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VmType given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VmType
     * @throws IOException if the JSON string is invalid with respect to VmType
     */
    public static VmType fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VmType.class);
    }

    /**
     * Convert an instance of VmType to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

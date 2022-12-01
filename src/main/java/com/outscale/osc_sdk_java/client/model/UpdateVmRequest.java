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


package com.outscale.osc_sdk_java.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.outscale.osc_sdk_java.client.model.BlockDeviceMappingVmUpdate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.outscale.osc_sdk_java.client.JSON;

/**
 * UpdateVmRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class UpdateVmRequest {
  public static final String SERIALIZED_NAME_BLOCK_DEVICE_MAPPINGS = "BlockDeviceMappings";
  @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_MAPPINGS)
  private List<BlockDeviceMappingVmUpdate> blockDeviceMappings = null;

  public static final String SERIALIZED_NAME_BSU_OPTIMIZED = "BsuOptimized";
  @SerializedName(SERIALIZED_NAME_BSU_OPTIMIZED)
  private Boolean bsuOptimized;

  public static final String SERIALIZED_NAME_DELETION_PROTECTION = "DeletionProtection";
  @SerializedName(SERIALIZED_NAME_DELETION_PROTECTION)
  private Boolean deletionProtection;

  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_IS_SOURCE_DEST_CHECKED = "IsSourceDestChecked";
  @SerializedName(SERIALIZED_NAME_IS_SOURCE_DEST_CHECKED)
  private Boolean isSourceDestChecked;

  public static final String SERIALIZED_NAME_KEYPAIR_NAME = "KeypairName";
  @SerializedName(SERIALIZED_NAME_KEYPAIR_NAME)
  private String keypairName;

  public static final String SERIALIZED_NAME_NESTED_VIRTUALIZATION = "NestedVirtualization";
  @SerializedName(SERIALIZED_NAME_NESTED_VIRTUALIZATION)
  private Boolean nestedVirtualization;

  /**
   * The performance of the VM (&#x60;medium&#x60; \\| &#x60;high&#x60; \\|  &#x60;highest&#x60;).
   */
  @JsonAdapter(PerformanceEnum.Adapter.class)
  public enum PerformanceEnum {
    MEDIUM("medium"),
    
    HIGH("high"),
    
    HIGHEST("highest");

    private String value;

    PerformanceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PerformanceEnum fromValue(String value) {
      for (PerformanceEnum b : PerformanceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PerformanceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PerformanceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PerformanceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PerformanceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PERFORMANCE = "Performance";
  @SerializedName(SERIALIZED_NAME_PERFORMANCE)
  private PerformanceEnum performance;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
  private List<String> securityGroupIds = null;

  public static final String SERIALIZED_NAME_USER_DATA = "UserData";
  @SerializedName(SERIALIZED_NAME_USER_DATA)
  private String userData;

  public static final String SERIALIZED_NAME_VM_ID = "VmId";
  @SerializedName(SERIALIZED_NAME_VM_ID)
  private String vmId;

  public static final String SERIALIZED_NAME_VM_INITIATED_SHUTDOWN_BEHAVIOR = "VmInitiatedShutdownBehavior";
  @SerializedName(SERIALIZED_NAME_VM_INITIATED_SHUTDOWN_BEHAVIOR)
  private String vmInitiatedShutdownBehavior;

  public static final String SERIALIZED_NAME_VM_TYPE = "VmType";
  @SerializedName(SERIALIZED_NAME_VM_TYPE)
  private String vmType;

  public UpdateVmRequest() {
  }

  public UpdateVmRequest blockDeviceMappings(List<BlockDeviceMappingVmUpdate> blockDeviceMappings) {
    
    this.blockDeviceMappings = blockDeviceMappings;
    return this;
  }

  public UpdateVmRequest addBlockDeviceMappingsItem(BlockDeviceMappingVmUpdate blockDeviceMappingsItem) {
    if (this.blockDeviceMappings == null) {
      this.blockDeviceMappings = new ArrayList<>();
    }
    this.blockDeviceMappings.add(blockDeviceMappingsItem);
    return this;
  }

   /**
   * One or more block device mappings of the VM.
   * @return blockDeviceMappings
  **/
  @javax.annotation.Nullable

  public List<BlockDeviceMappingVmUpdate> getBlockDeviceMappings() {
    return blockDeviceMappings;
  }


  public void setBlockDeviceMappings(List<BlockDeviceMappingVmUpdate> blockDeviceMappings) {
    this.blockDeviceMappings = blockDeviceMappings;
  }


  public UpdateVmRequest bsuOptimized(Boolean bsuOptimized) {
    
    this.bsuOptimized = bsuOptimized;
    return this;
  }

   /**
   * This parameter is not available. It is present in our API for the sake of historical compatibility with AWS.
   * @return bsuOptimized
  **/
  @javax.annotation.Nullable

  public Boolean getBsuOptimized() {
    return bsuOptimized;
  }


  public void setBsuOptimized(Boolean bsuOptimized) {
    this.bsuOptimized = bsuOptimized;
  }


  public UpdateVmRequest deletionProtection(Boolean deletionProtection) {
    
    this.deletionProtection = deletionProtection;
    return this;
  }

   /**
   * If true, you cannot delete the VM unless you change this parameter back to false.
   * @return deletionProtection
  **/
  @javax.annotation.Nullable

  public Boolean getDeletionProtection() {
    return deletionProtection;
  }


  public void setDeletionProtection(Boolean deletionProtection) {
    this.deletionProtection = deletionProtection;
  }


  public UpdateVmRequest dryRun(Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

   /**
   * If true, checks whether you have the required permissions to perform the action.
   * @return dryRun
  **/
  @javax.annotation.Nullable

  public Boolean getDryRun() {
    return dryRun;
  }


  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public UpdateVmRequest isSourceDestChecked(Boolean isSourceDestChecked) {
    
    this.isSourceDestChecked = isSourceDestChecked;
    return this;
  }

   /**
   * (Net only) If true, the source/destination check is enabled. If false, it is disabled. This value must be false for a NAT VM to perform network address translation (NAT) in a Net.
   * @return isSourceDestChecked
  **/
  @javax.annotation.Nullable

  public Boolean getIsSourceDestChecked() {
    return isSourceDestChecked;
  }


  public void setIsSourceDestChecked(Boolean isSourceDestChecked) {
    this.isSourceDestChecked = isSourceDestChecked;
  }


  public UpdateVmRequest keypairName(String keypairName) {
    
    this.keypairName = keypairName;
    return this;
  }

   /**
   * The name of the keypair.&lt;br /&gt; To complete the replacement, manually replace the old public key with the new public key in the ~/.ssh/authorized_keys file located in the VM. Restart the VM to apply the change.
   * @return keypairName
  **/
  @javax.annotation.Nullable

  public String getKeypairName() {
    return keypairName;
  }


  public void setKeypairName(String keypairName) {
    this.keypairName = keypairName;
  }


  public UpdateVmRequest nestedVirtualization(Boolean nestedVirtualization) {
    
    this.nestedVirtualization = nestedVirtualization;
    return this;
  }

   /**
   * (dedicated tenancy only) If true, nested virtualization is enabled. If false, it is disabled.
   * @return nestedVirtualization
  **/
  @javax.annotation.Nullable

  public Boolean getNestedVirtualization() {
    return nestedVirtualization;
  }


  public void setNestedVirtualization(Boolean nestedVirtualization) {
    this.nestedVirtualization = nestedVirtualization;
  }


  public UpdateVmRequest performance(PerformanceEnum performance) {
    
    this.performance = performance;
    return this;
  }

   /**
   * The performance of the VM (&#x60;medium&#x60; \\| &#x60;high&#x60; \\|  &#x60;highest&#x60;).
   * @return performance
  **/
  @javax.annotation.Nullable

  public PerformanceEnum getPerformance() {
    return performance;
  }


  public void setPerformance(PerformanceEnum performance) {
    this.performance = performance;
  }


  public UpdateVmRequest securityGroupIds(List<String> securityGroupIds) {
    
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public UpdateVmRequest addSecurityGroupIdsItem(String securityGroupIdsItem) {
    if (this.securityGroupIds == null) {
      this.securityGroupIds = new ArrayList<>();
    }
    this.securityGroupIds.add(securityGroupIdsItem);
    return this;
  }

   /**
   * One or more IDs of security groups for the VM.
   * @return securityGroupIds
  **/
  @javax.annotation.Nullable

  public List<String> getSecurityGroupIds() {
    return securityGroupIds;
  }


  public void setSecurityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }


  public UpdateVmRequest userData(String userData) {
    
    this.userData = userData;
    return this;
  }

   /**
   * The Base64-encoded MIME user data, limited to 500 kibibytes (KiB).
   * @return userData
  **/
  @javax.annotation.Nullable

  public String getUserData() {
    return userData;
  }


  public void setUserData(String userData) {
    this.userData = userData;
  }


  public UpdateVmRequest vmId(String vmId) {
    
    this.vmId = vmId;
    return this;
  }

   /**
   * The ID of the VM.
   * @return vmId
  **/
  @javax.annotation.Nonnull

  public String getVmId() {
    return vmId;
  }


  public void setVmId(String vmId) {
    this.vmId = vmId;
  }


  public UpdateVmRequest vmInitiatedShutdownBehavior(String vmInitiatedShutdownBehavior) {
    
    this.vmInitiatedShutdownBehavior = vmInitiatedShutdownBehavior;
    return this;
  }

   /**
   * The VM behavior when you stop it. If set to &#x60;stop&#x60;, the VM stops. If set to &#x60;restart&#x60;, the VM stops then automatically restarts. If set to &#x60;terminate&#x60;, the VM stops and is terminated.
   * @return vmInitiatedShutdownBehavior
  **/
  @javax.annotation.Nullable

  public String getVmInitiatedShutdownBehavior() {
    return vmInitiatedShutdownBehavior;
  }


  public void setVmInitiatedShutdownBehavior(String vmInitiatedShutdownBehavior) {
    this.vmInitiatedShutdownBehavior = vmInitiatedShutdownBehavior;
  }


  public UpdateVmRequest vmType(String vmType) {
    
    this.vmType = vmType;
    return this;
  }

   /**
   * The type of VM. For more information, see [Instance Types](https://docs.outscale.com/en/userguide/Instance-Types.html).
   * @return vmType
  **/
  @javax.annotation.Nullable

  public String getVmType() {
    return vmType;
  }


  public void setVmType(String vmType) {
    this.vmType = vmType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVmRequest updateVmRequest = (UpdateVmRequest) o;
    return Objects.equals(this.blockDeviceMappings, updateVmRequest.blockDeviceMappings) &&
        Objects.equals(this.bsuOptimized, updateVmRequest.bsuOptimized) &&
        Objects.equals(this.deletionProtection, updateVmRequest.deletionProtection) &&
        Objects.equals(this.dryRun, updateVmRequest.dryRun) &&
        Objects.equals(this.isSourceDestChecked, updateVmRequest.isSourceDestChecked) &&
        Objects.equals(this.keypairName, updateVmRequest.keypairName) &&
        Objects.equals(this.nestedVirtualization, updateVmRequest.nestedVirtualization) &&
        Objects.equals(this.performance, updateVmRequest.performance) &&
        Objects.equals(this.securityGroupIds, updateVmRequest.securityGroupIds) &&
        Objects.equals(this.userData, updateVmRequest.userData) &&
        Objects.equals(this.vmId, updateVmRequest.vmId) &&
        Objects.equals(this.vmInitiatedShutdownBehavior, updateVmRequest.vmInitiatedShutdownBehavior) &&
        Objects.equals(this.vmType, updateVmRequest.vmType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockDeviceMappings, bsuOptimized, deletionProtection, dryRun, isSourceDestChecked, keypairName, nestedVirtualization, performance, securityGroupIds, userData, vmId, vmInitiatedShutdownBehavior, vmType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVmRequest {\n");
    sb.append("    blockDeviceMappings: ").append(toIndentedString(blockDeviceMappings)).append("\n");
    sb.append("    bsuOptimized: ").append(toIndentedString(bsuOptimized)).append("\n");
    sb.append("    deletionProtection: ").append(toIndentedString(deletionProtection)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    isSourceDestChecked: ").append(toIndentedString(isSourceDestChecked)).append("\n");
    sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
    sb.append("    nestedVirtualization: ").append(toIndentedString(nestedVirtualization)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
    sb.append("    vmInitiatedShutdownBehavior: ").append(toIndentedString(vmInitiatedShutdownBehavior)).append("\n");
    sb.append("    vmType: ").append(toIndentedString(vmType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
    openapiFields.add("BlockDeviceMappings");
    openapiFields.add("BsuOptimized");
    openapiFields.add("DeletionProtection");
    openapiFields.add("DryRun");
    openapiFields.add("IsSourceDestChecked");
    openapiFields.add("KeypairName");
    openapiFields.add("NestedVirtualization");
    openapiFields.add("Performance");
    openapiFields.add("SecurityGroupIds");
    openapiFields.add("UserData");
    openapiFields.add("VmId");
    openapiFields.add("VmInitiatedShutdownBehavior");
    openapiFields.add("VmType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("VmId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateVmRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateVmRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateVmRequest is not found in the empty JSON string", UpdateVmRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateVmRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateVmRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateVmRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("BlockDeviceMappings") != null && !jsonObj.get("BlockDeviceMappings").isJsonNull()) {
        JsonArray jsonArrayblockDeviceMappings = jsonObj.getAsJsonArray("BlockDeviceMappings");
        if (jsonArrayblockDeviceMappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("BlockDeviceMappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `BlockDeviceMappings` to be an array in the JSON string but got `%s`", jsonObj.get("BlockDeviceMappings").toString()));
          }

          // validate the optional field `BlockDeviceMappings` (array)
          for (int i = 0; i < jsonArrayblockDeviceMappings.size(); i++) {
            BlockDeviceMappingVmUpdate.validateJsonObject(jsonArrayblockDeviceMappings.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("KeypairName") != null && !jsonObj.get("KeypairName").isJsonNull()) && !jsonObj.get("KeypairName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeypairName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeypairName").toString()));
      }
      if ((jsonObj.get("Performance") != null && !jsonObj.get("Performance").isJsonNull()) && !jsonObj.get("Performance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Performance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Performance").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("SecurityGroupIds") != null && !jsonObj.get("SecurityGroupIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecurityGroupIds` to be an array in the JSON string but got `%s`", jsonObj.get("SecurityGroupIds").toString()));
      }
      if ((jsonObj.get("UserData") != null && !jsonObj.get("UserData").isJsonNull()) && !jsonObj.get("UserData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UserData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UserData").toString()));
      }
      if (!jsonObj.get("VmId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VmId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VmId").toString()));
      }
      if ((jsonObj.get("VmInitiatedShutdownBehavior") != null && !jsonObj.get("VmInitiatedShutdownBehavior").isJsonNull()) && !jsonObj.get("VmInitiatedShutdownBehavior").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VmInitiatedShutdownBehavior` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VmInitiatedShutdownBehavior").toString()));
      }
      if ((jsonObj.get("VmType") != null && !jsonObj.get("VmType").isJsonNull()) && !jsonObj.get("VmType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VmType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VmType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateVmRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateVmRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateVmRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateVmRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateVmRequest>() {
           @Override
           public void write(JsonWriter out, UpdateVmRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateVmRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateVmRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateVmRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateVmRequest
  */
  public static UpdateVmRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateVmRequest.class);
  }

 /**
  * Convert an instance of UpdateVmRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


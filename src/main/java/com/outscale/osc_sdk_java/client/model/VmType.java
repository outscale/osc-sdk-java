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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about the VM type.
 */
@ApiModel(description = "Information about the VM type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
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


  public VmType bsuOptimized(Boolean bsuOptimized) {
    
    this.bsuOptimized = bsuOptimized;
    return this;
  }

   /**
   * This parameter is not available. It is present in our API for the sake of historical compatibility with AWS.
   * @return bsuOptimized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This parameter is not available. It is present in our API for the sake of historical compatibility with AWS.")

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
   * @return maxPrivateIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of private IPs per network interface card (NIC).")

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
   * @return memorySize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of memory, in gibibytes.")

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
   * @return vcoreCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of vCores.")

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
   * @return vmTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the VM type.")

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
   * @return volumeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of ephemeral storage disks.")

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
   * @return volumeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of one ephemeral storage disk, in gibibytes (GiB).")

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
    return Objects.equals(this.bsuOptimized, vmType.bsuOptimized) &&
        Objects.equals(this.maxPrivateIps, vmType.maxPrivateIps) &&
        Objects.equals(this.memorySize, vmType.memorySize) &&
        Objects.equals(this.vcoreCount, vmType.vcoreCount) &&
        Objects.equals(this.vmTypeName, vmType.vmTypeName) &&
        Objects.equals(this.volumeCount, vmType.volumeCount) &&
        Objects.equals(this.volumeSize, vmType.volumeSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bsuOptimized, maxPrivateIps, memorySize, vcoreCount, vmTypeName, volumeCount, volumeSize);
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


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
 * LinkNicRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class LinkNicRequest {
  public static final String SERIALIZED_NAME_DEVICE_NUMBER = "DeviceNumber";
  @SerializedName(SERIALIZED_NAME_DEVICE_NUMBER)
  private Integer deviceNumber;

  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_NIC_ID = "NicId";
  @SerializedName(SERIALIZED_NAME_NIC_ID)
  private String nicId;

  public static final String SERIALIZED_NAME_VM_ID = "VmId";
  @SerializedName(SERIALIZED_NAME_VM_ID)
  private String vmId;


  public LinkNicRequest deviceNumber(Integer deviceNumber) {
    
    this.deviceNumber = deviceNumber;
    return this;
  }

   /**
   * The index of the VM device for the NIC attachment (between &#x60;1&#x60; and &#x60;7&#x60;, both included).
   * @return deviceNumber
  **/
  @ApiModelProperty(required = true, value = "The index of the VM device for the NIC attachment (between `1` and `7`, both included).")

  public Integer getDeviceNumber() {
    return deviceNumber;
  }


  public void setDeviceNumber(Integer deviceNumber) {
    this.deviceNumber = deviceNumber;
  }


  public LinkNicRequest dryRun(Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

   /**
   * If true, checks whether you have the required permissions to perform the action.
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, checks whether you have the required permissions to perform the action.")

  public Boolean getDryRun() {
    return dryRun;
  }


  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public LinkNicRequest nicId(String nicId) {
    
    this.nicId = nicId;
    return this;
  }

   /**
   * The ID of the NIC you want to attach.
   * @return nicId
  **/
  @ApiModelProperty(required = true, value = "The ID of the NIC you want to attach.")

  public String getNicId() {
    return nicId;
  }


  public void setNicId(String nicId) {
    this.nicId = nicId;
  }


  public LinkNicRequest vmId(String vmId) {
    
    this.vmId = vmId;
    return this;
  }

   /**
   * The ID of the VM to which you want to attach the NIC.
   * @return vmId
  **/
  @ApiModelProperty(required = true, value = "The ID of the VM to which you want to attach the NIC.")

  public String getVmId() {
    return vmId;
  }


  public void setVmId(String vmId) {
    this.vmId = vmId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkNicRequest linkNicRequest = (LinkNicRequest) o;
    return Objects.equals(this.deviceNumber, linkNicRequest.deviceNumber) &&
        Objects.equals(this.dryRun, linkNicRequest.dryRun) &&
        Objects.equals(this.nicId, linkNicRequest.nicId) &&
        Objects.equals(this.vmId, linkNicRequest.vmId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceNumber, dryRun, nicId, vmId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkNicRequest {\n");
    sb.append("    deviceNumber: ").append(toIndentedString(deviceNumber)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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


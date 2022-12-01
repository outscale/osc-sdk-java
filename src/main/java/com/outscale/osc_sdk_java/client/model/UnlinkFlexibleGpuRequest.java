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
 * UnlinkFlexibleGpuRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class UnlinkFlexibleGpuRequest {
  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_FLEXIBLE_GPU_ID = "FlexibleGpuId";
  @SerializedName(SERIALIZED_NAME_FLEXIBLE_GPU_ID)
  private String flexibleGpuId;


  public UnlinkFlexibleGpuRequest dryRun(Boolean dryRun) {
    
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


  public UnlinkFlexibleGpuRequest flexibleGpuId(String flexibleGpuId) {
    
    this.flexibleGpuId = flexibleGpuId;
    return this;
  }

   /**
   * The ID of the fGPU you want to detach from your VM.
   * @return flexibleGpuId
  **/
  @ApiModelProperty(required = true, value = "The ID of the fGPU you want to detach from your VM.")

  public String getFlexibleGpuId() {
    return flexibleGpuId;
  }


  public void setFlexibleGpuId(String flexibleGpuId) {
    this.flexibleGpuId = flexibleGpuId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnlinkFlexibleGpuRequest unlinkFlexibleGpuRequest = (UnlinkFlexibleGpuRequest) o;
    return Objects.equals(this.dryRun, unlinkFlexibleGpuRequest.dryRun) &&
        Objects.equals(this.flexibleGpuId, unlinkFlexibleGpuRequest.flexibleGpuId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, flexibleGpuId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnlinkFlexibleGpuRequest {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    flexibleGpuId: ").append(toIndentedString(flexibleGpuId)).append("\n");
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


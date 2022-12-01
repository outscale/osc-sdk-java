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
 * LinkRouteTableRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class LinkRouteTableRequest {
  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_ROUTE_TABLE_ID = "RouteTableId";
  @SerializedName(SERIALIZED_NAME_ROUTE_TABLE_ID)
  private String routeTableId;

  public static final String SERIALIZED_NAME_SUBNET_ID = "SubnetId";
  @SerializedName(SERIALIZED_NAME_SUBNET_ID)
  private String subnetId;


  public LinkRouteTableRequest dryRun(Boolean dryRun) {
    
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


  public LinkRouteTableRequest routeTableId(String routeTableId) {
    
    this.routeTableId = routeTableId;
    return this;
  }

   /**
   * The ID of the route table.
   * @return routeTableId
  **/
  @ApiModelProperty(required = true, value = "The ID of the route table.")

  public String getRouteTableId() {
    return routeTableId;
  }


  public void setRouteTableId(String routeTableId) {
    this.routeTableId = routeTableId;
  }


  public LinkRouteTableRequest subnetId(String subnetId) {
    
    this.subnetId = subnetId;
    return this;
  }

   /**
   * The ID of the Subnet.
   * @return subnetId
  **/
  @ApiModelProperty(required = true, value = "The ID of the Subnet.")

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
    LinkRouteTableRequest linkRouteTableRequest = (LinkRouteTableRequest) o;
    return Objects.equals(this.dryRun, linkRouteTableRequest.dryRun) &&
        Objects.equals(this.routeTableId, linkRouteTableRequest.routeTableId) &&
        Objects.equals(this.subnetId, linkRouteTableRequest.subnetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, routeTableId, subnetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkRouteTableRequest {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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


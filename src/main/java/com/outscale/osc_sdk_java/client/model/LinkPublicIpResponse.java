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
import com.outscale.osc_sdk_java.client.model.ResponseContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LinkPublicIpResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class LinkPublicIpResponse {
  public static final String SERIALIZED_NAME_LINK_PUBLIC_IP_ID = "LinkPublicIpId";
  @SerializedName(SERIALIZED_NAME_LINK_PUBLIC_IP_ID)
  private String linkPublicIpId;

  public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
  private ResponseContext responseContext;


  public LinkPublicIpResponse linkPublicIpId(String linkPublicIpId) {
    
    this.linkPublicIpId = linkPublicIpId;
    return this;
  }

   /**
   * (Net only) The ID representing the association of the public IP with the VM or the NIC.
   * @return linkPublicIpId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "(Net only) The ID representing the association of the public IP with the VM or the NIC.")

  public String getLinkPublicIpId() {
    return linkPublicIpId;
  }


  public void setLinkPublicIpId(String linkPublicIpId) {
    this.linkPublicIpId = linkPublicIpId;
  }


  public LinkPublicIpResponse responseContext(ResponseContext responseContext) {
    
    this.responseContext = responseContext;
    return this;
  }

   /**
   * Get responseContext
   * @return responseContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponseContext getResponseContext() {
    return responseContext;
  }


  public void setResponseContext(ResponseContext responseContext) {
    this.responseContext = responseContext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkPublicIpResponse linkPublicIpResponse = (LinkPublicIpResponse) o;
    return Objects.equals(this.linkPublicIpId, linkPublicIpResponse.linkPublicIpId) &&
        Objects.equals(this.responseContext, linkPublicIpResponse.responseContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkPublicIpId, responseContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkPublicIpResponse {\n");
    sb.append("    linkPublicIpId: ").append(toIndentedString(linkPublicIpId)).append("\n");
    sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
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


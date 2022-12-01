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
import com.outscale.osc_sdk_java.client.model.LinkPublicIpLightForVm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about the private IP of the NIC.
 */
@ApiModel(description = "Information about the private IP of the NIC.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class PrivateIpLightForVm {
  public static final String SERIALIZED_NAME_IS_PRIMARY = "IsPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;

  public static final String SERIALIZED_NAME_LINK_PUBLIC_IP = "LinkPublicIp";
  @SerializedName(SERIALIZED_NAME_LINK_PUBLIC_IP)
  private LinkPublicIpLightForVm linkPublicIp;

  public static final String SERIALIZED_NAME_PRIVATE_DNS_NAME = "PrivateDnsName";
  @SerializedName(SERIALIZED_NAME_PRIVATE_DNS_NAME)
  private String privateDnsName;

  public static final String SERIALIZED_NAME_PRIVATE_IP = "PrivateIp";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IP)
  private String privateIp;


  public PrivateIpLightForVm isPrimary(Boolean isPrimary) {
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * If true, the IP is the primary private IP of the NIC.
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the IP is the primary private IP of the NIC.")

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  public PrivateIpLightForVm linkPublicIp(LinkPublicIpLightForVm linkPublicIp) {
    
    this.linkPublicIp = linkPublicIp;
    return this;
  }

   /**
   * Get linkPublicIp
   * @return linkPublicIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkPublicIpLightForVm getLinkPublicIp() {
    return linkPublicIp;
  }


  public void setLinkPublicIp(LinkPublicIpLightForVm linkPublicIp) {
    this.linkPublicIp = linkPublicIp;
  }


  public PrivateIpLightForVm privateDnsName(String privateDnsName) {
    
    this.privateDnsName = privateDnsName;
    return this;
  }

   /**
   * The name of the private DNS.
   * @return privateDnsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the private DNS.")

  public String getPrivateDnsName() {
    return privateDnsName;
  }


  public void setPrivateDnsName(String privateDnsName) {
    this.privateDnsName = privateDnsName;
  }


  public PrivateIpLightForVm privateIp(String privateIp) {
    
    this.privateIp = privateIp;
    return this;
  }

   /**
   * The private IP.
   * @return privateIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The private IP.")

  public String getPrivateIp() {
    return privateIp;
  }


  public void setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateIpLightForVm privateIpLightForVm = (PrivateIpLightForVm) o;
    return Objects.equals(this.isPrimary, privateIpLightForVm.isPrimary) &&
        Objects.equals(this.linkPublicIp, privateIpLightForVm.linkPublicIp) &&
        Objects.equals(this.privateDnsName, privateIpLightForVm.privateDnsName) &&
        Objects.equals(this.privateIp, privateIpLightForVm.privateIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPrimary, linkPublicIp, privateDnsName, privateIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateIpLightForVm {\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    linkPublicIp: ").append(toIndentedString(linkPublicIp)).append("\n");
    sb.append("    privateDnsName: ").append(toIndentedString(privateDnsName)).append("\n");
    sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
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


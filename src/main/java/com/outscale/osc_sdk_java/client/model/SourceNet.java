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
 * Information about the source Net.
 */
@ApiModel(description = "Information about the source Net.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class SourceNet {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_IP_RANGE = "IpRange";
  @SerializedName(SERIALIZED_NAME_IP_RANGE)
  private String ipRange;

  public static final String SERIALIZED_NAME_NET_ID = "NetId";
  @SerializedName(SERIALIZED_NAME_NET_ID)
  private String netId;


  public SourceNet accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the owner of the source Net.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID of the owner of the source Net.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public SourceNet ipRange(String ipRange) {
    
    this.ipRange = ipRange;
    return this;
  }

   /**
   * The IP range for the source Net, in CIDR notation (for example, &#x60;10.0.0.0/16&#x60;).
   * @return ipRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP range for the source Net, in CIDR notation (for example, `10.0.0.0/16`).")

  public String getIpRange() {
    return ipRange;
  }


  public void setIpRange(String ipRange) {
    this.ipRange = ipRange;
  }


  public SourceNet netId(String netId) {
    
    this.netId = netId;
    return this;
  }

   /**
   * The ID of the source Net.
   * @return netId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the source Net.")

  public String getNetId() {
    return netId;
  }


  public void setNetId(String netId) {
    this.netId = netId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceNet sourceNet = (SourceNet) o;
    return Objects.equals(this.accountId, sourceNet.accountId) &&
        Objects.equals(this.ipRange, sourceNet.ipRange) &&
        Objects.equals(this.netId, sourceNet.netId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, ipRange, netId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceNet {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
    sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
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


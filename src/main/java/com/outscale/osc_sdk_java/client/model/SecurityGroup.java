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
import com.outscale.osc_sdk_java.client.model.ResourceTag;
import com.outscale.osc_sdk_java.client.model.SecurityGroupRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Information about the security group.
 */
@ApiModel(description = "Information about the security group.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class SecurityGroup {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INBOUND_RULES = "InboundRules";
  @SerializedName(SERIALIZED_NAME_INBOUND_RULES)
  private List<SecurityGroupRule> inboundRules = null;

  public static final String SERIALIZED_NAME_NET_ID = "NetId";
  @SerializedName(SERIALIZED_NAME_NET_ID)
  private String netId;

  public static final String SERIALIZED_NAME_OUTBOUND_RULES = "OutboundRules";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_RULES)
  private List<SecurityGroupRule> outboundRules = null;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "SecurityGroupId";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
  private String securityGroupId;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_NAME = "SecurityGroupName";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_NAME)
  private String securityGroupName;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<ResourceTag> tags = null;


  public SecurityGroup accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of a user that has been granted permission.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID of a user that has been granted permission.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public SecurityGroup description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the security group.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the security group.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SecurityGroup inboundRules(List<SecurityGroupRule> inboundRules) {
    
    this.inboundRules = inboundRules;
    return this;
  }

  public SecurityGroup addInboundRulesItem(SecurityGroupRule inboundRulesItem) {
    if (this.inboundRules == null) {
      this.inboundRules = new ArrayList<SecurityGroupRule>();
    }
    this.inboundRules.add(inboundRulesItem);
    return this;
  }

   /**
   * The inbound rules associated with the security group.
   * @return inboundRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The inbound rules associated with the security group.")

  public List<SecurityGroupRule> getInboundRules() {
    return inboundRules;
  }


  public void setInboundRules(List<SecurityGroupRule> inboundRules) {
    this.inboundRules = inboundRules;
  }


  public SecurityGroup netId(String netId) {
    
    this.netId = netId;
    return this;
  }

   /**
   * The ID of the Net for the security group.
   * @return netId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Net for the security group.")

  public String getNetId() {
    return netId;
  }


  public void setNetId(String netId) {
    this.netId = netId;
  }


  public SecurityGroup outboundRules(List<SecurityGroupRule> outboundRules) {
    
    this.outboundRules = outboundRules;
    return this;
  }

  public SecurityGroup addOutboundRulesItem(SecurityGroupRule outboundRulesItem) {
    if (this.outboundRules == null) {
      this.outboundRules = new ArrayList<SecurityGroupRule>();
    }
    this.outboundRules.add(outboundRulesItem);
    return this;
  }

   /**
   * The outbound rules associated with the security group.
   * @return outboundRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The outbound rules associated with the security group.")

  public List<SecurityGroupRule> getOutboundRules() {
    return outboundRules;
  }


  public void setOutboundRules(List<SecurityGroupRule> outboundRules) {
    this.outboundRules = outboundRules;
  }


  public SecurityGroup securityGroupId(String securityGroupId) {
    
    this.securityGroupId = securityGroupId;
    return this;
  }

   /**
   * The ID of the security group.
   * @return securityGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the security group.")

  public String getSecurityGroupId() {
    return securityGroupId;
  }


  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
  }


  public SecurityGroup securityGroupName(String securityGroupName) {
    
    this.securityGroupName = securityGroupName;
    return this;
  }

   /**
   * The name of the security group.
   * @return securityGroupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the security group.")

  public String getSecurityGroupName() {
    return securityGroupName;
  }


  public void setSecurityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
  }


  public SecurityGroup tags(List<ResourceTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public SecurityGroup addTagsItem(ResourceTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<ResourceTag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * One or more tags associated with the security group.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more tags associated with the security group.")

  public List<ResourceTag> getTags() {
    return tags;
  }


  public void setTags(List<ResourceTag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroup securityGroup = (SecurityGroup) o;
    return Objects.equals(this.accountId, securityGroup.accountId) &&
        Objects.equals(this.description, securityGroup.description) &&
        Objects.equals(this.inboundRules, securityGroup.inboundRules) &&
        Objects.equals(this.netId, securityGroup.netId) &&
        Objects.equals(this.outboundRules, securityGroup.outboundRules) &&
        Objects.equals(this.securityGroupId, securityGroup.securityGroupId) &&
        Objects.equals(this.securityGroupName, securityGroup.securityGroupName) &&
        Objects.equals(this.tags, securityGroup.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, description, inboundRules, netId, outboundRules, securityGroupId, securityGroupName, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroup {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inboundRules: ").append(toIndentedString(inboundRules)).append("\n");
    sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
    sb.append("    outboundRules: ").append(toIndentedString(outboundRules)).append("\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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


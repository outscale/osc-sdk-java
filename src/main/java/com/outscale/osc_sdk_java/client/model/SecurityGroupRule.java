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
import com.outscale.osc_sdk_java.client.model.SecurityGroupsMember;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Information about the security group rule.
 */
@ApiModel(description = "Information about the security group rule.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class SecurityGroupRule {
  public static final String SERIALIZED_NAME_FROM_PORT_RANGE = "FromPortRange";
  @SerializedName(SERIALIZED_NAME_FROM_PORT_RANGE)
  private Integer fromPortRange;

  public static final String SERIALIZED_NAME_IP_PROTOCOL = "IpProtocol";
  @SerializedName(SERIALIZED_NAME_IP_PROTOCOL)
  private String ipProtocol;

  public static final String SERIALIZED_NAME_IP_RANGES = "IpRanges";
  @SerializedName(SERIALIZED_NAME_IP_RANGES)
  private List<String> ipRanges = null;

  public static final String SERIALIZED_NAME_SECURITY_GROUPS_MEMBERS = "SecurityGroupsMembers";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS_MEMBERS)
  private List<SecurityGroupsMember> securityGroupsMembers = null;

  public static final String SERIALIZED_NAME_SERVICE_IDS = "ServiceIds";
  @SerializedName(SERIALIZED_NAME_SERVICE_IDS)
  private List<String> serviceIds = null;

  public static final String SERIALIZED_NAME_TO_PORT_RANGE = "ToPortRange";
  @SerializedName(SERIALIZED_NAME_TO_PORT_RANGE)
  private Integer toPortRange;


  public SecurityGroupRule fromPortRange(Integer fromPortRange) {
    
    this.fromPortRange = fromPortRange;
    return this;
  }

   /**
   * The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.
   * @return fromPortRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The beginning of the port range for the TCP and UDP protocols, or an ICMP type number.")

  public Integer getFromPortRange() {
    return fromPortRange;
  }


  public void setFromPortRange(Integer fromPortRange) {
    this.fromPortRange = fromPortRange;
  }


  public SecurityGroupRule ipProtocol(String ipProtocol) {
    
    this.ipProtocol = ipProtocol;
    return this;
  }

   /**
   * The IP protocol name (&#x60;tcp&#x60;, &#x60;udp&#x60;, &#x60;icmp&#x60;, or &#x60;-1&#x60; for all protocols). By default, &#x60;-1&#x60;. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).
   * @return ipProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP protocol name (`tcp`, `udp`, `icmp`, or `-1` for all protocols). By default, `-1`. In a Net, this can also be an IP protocol number. For more information, see the [IANA.org website](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml).")

  public String getIpProtocol() {
    return ipProtocol;
  }


  public void setIpProtocol(String ipProtocol) {
    this.ipProtocol = ipProtocol;
  }


  public SecurityGroupRule ipRanges(List<String> ipRanges) {
    
    this.ipRanges = ipRanges;
    return this;
  }

  public SecurityGroupRule addIpRangesItem(String ipRangesItem) {
    if (this.ipRanges == null) {
      this.ipRanges = new ArrayList<String>();
    }
    this.ipRanges.add(ipRangesItem);
    return this;
  }

   /**
   * One or more IP ranges for the security group rules, in CIDR notation (for example, &#x60;10.0.0.0/16&#x60;).
   * @return ipRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more IP ranges for the security group rules, in CIDR notation (for example, `10.0.0.0/16`).")

  public List<String> getIpRanges() {
    return ipRanges;
  }


  public void setIpRanges(List<String> ipRanges) {
    this.ipRanges = ipRanges;
  }


  public SecurityGroupRule securityGroupsMembers(List<SecurityGroupsMember> securityGroupsMembers) {
    
    this.securityGroupsMembers = securityGroupsMembers;
    return this;
  }

  public SecurityGroupRule addSecurityGroupsMembersItem(SecurityGroupsMember securityGroupsMembersItem) {
    if (this.securityGroupsMembers == null) {
      this.securityGroupsMembers = new ArrayList<SecurityGroupsMember>();
    }
    this.securityGroupsMembers.add(securityGroupsMembersItem);
    return this;
  }

   /**
   * Information about one or more members of a security group.
   * @return securityGroupsMembers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about one or more members of a security group.")

  public List<SecurityGroupsMember> getSecurityGroupsMembers() {
    return securityGroupsMembers;
  }


  public void setSecurityGroupsMembers(List<SecurityGroupsMember> securityGroupsMembers) {
    this.securityGroupsMembers = securityGroupsMembers;
  }


  public SecurityGroupRule serviceIds(List<String> serviceIds) {
    
    this.serviceIds = serviceIds;
    return this;
  }

  public SecurityGroupRule addServiceIdsItem(String serviceIdsItem) {
    if (this.serviceIds == null) {
      this.serviceIds = new ArrayList<String>();
    }
    this.serviceIds.add(serviceIdsItem);
    return this;
  }

   /**
   * One or more service IDs to allow traffic from a Net to access the corresponding OUTSCALE services. For more information, see [ReadNetAccessPointServices](#readnetaccesspointservices).
   * @return serviceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more service IDs to allow traffic from a Net to access the corresponding OUTSCALE services. For more information, see [ReadNetAccessPointServices](#readnetaccesspointservices).")

  public List<String> getServiceIds() {
    return serviceIds;
  }


  public void setServiceIds(List<String> serviceIds) {
    this.serviceIds = serviceIds;
  }


  public SecurityGroupRule toPortRange(Integer toPortRange) {
    
    this.toPortRange = toPortRange;
    return this;
  }

   /**
   * The end of the port range for the TCP and UDP protocols, or an ICMP code number.
   * @return toPortRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end of the port range for the TCP and UDP protocols, or an ICMP code number.")

  public Integer getToPortRange() {
    return toPortRange;
  }


  public void setToPortRange(Integer toPortRange) {
    this.toPortRange = toPortRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupRule securityGroupRule = (SecurityGroupRule) o;
    return Objects.equals(this.fromPortRange, securityGroupRule.fromPortRange) &&
        Objects.equals(this.ipProtocol, securityGroupRule.ipProtocol) &&
        Objects.equals(this.ipRanges, securityGroupRule.ipRanges) &&
        Objects.equals(this.securityGroupsMembers, securityGroupRule.securityGroupsMembers) &&
        Objects.equals(this.serviceIds, securityGroupRule.serviceIds) &&
        Objects.equals(this.toPortRange, securityGroupRule.toPortRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromPortRange, ipProtocol, ipRanges, securityGroupsMembers, serviceIds, toPortRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupRule {\n");
    sb.append("    fromPortRange: ").append(toIndentedString(fromPortRange)).append("\n");
    sb.append("    ipProtocol: ").append(toIndentedString(ipProtocol)).append("\n");
    sb.append("    ipRanges: ").append(toIndentedString(ipRanges)).append("\n");
    sb.append("    securityGroupsMembers: ").append(toIndentedString(securityGroupsMembers)).append("\n");
    sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
    sb.append("    toPortRange: ").append(toIndentedString(toPortRange)).append("\n");
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


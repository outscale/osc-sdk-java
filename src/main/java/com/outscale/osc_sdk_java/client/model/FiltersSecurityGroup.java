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
import java.util.ArrayList;
import java.util.List;

/**
 * One or more filters.
 */
@ApiModel(description = "One or more filters.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class FiltersSecurityGroup {
  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "AccountIds";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = null;

  public static final String SERIALIZED_NAME_DESCRIPTIONS = "Descriptions";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONS)
  private List<String> descriptions = null;

  public static final String SERIALIZED_NAME_INBOUND_RULE_ACCOUNT_IDS = "InboundRuleAccountIds";
  @SerializedName(SERIALIZED_NAME_INBOUND_RULE_ACCOUNT_IDS)
  private List<String> inboundRuleAccountIds = null;

  public static final String SERIALIZED_NAME_INBOUND_RULE_FROM_PORT_RANGES = "InboundRuleFromPortRanges";
  @SerializedName(SERIALIZED_NAME_INBOUND_RULE_FROM_PORT_RANGES)
  private List<Integer> inboundRuleFromPortRanges = null;

  public static final String SERIALIZED_NAME_INBOUND_RULE_IP_RANGES = "InboundRuleIpRanges";
  @SerializedName(SERIALIZED_NAME_INBOUND_RULE_IP_RANGES)
  private List<String> inboundRuleIpRanges = null;

  public static final String SERIALIZED_NAME_INBOUND_RULE_PROTOCOLS = "InboundRuleProtocols";
  @SerializedName(SERIALIZED_NAME_INBOUND_RULE_PROTOCOLS)
  private List<String> inboundRuleProtocols = null;

  public static final String SERIALIZED_NAME_INBOUND_RULE_SECURITY_GROUP_IDS = "InboundRuleSecurityGroupIds";
  @SerializedName(SERIALIZED_NAME_INBOUND_RULE_SECURITY_GROUP_IDS)
  private List<String> inboundRuleSecurityGroupIds = null;

  public static final String SERIALIZED_NAME_INBOUND_RULE_SECURITY_GROUP_NAMES = "InboundRuleSecurityGroupNames";
  @SerializedName(SERIALIZED_NAME_INBOUND_RULE_SECURITY_GROUP_NAMES)
  private List<String> inboundRuleSecurityGroupNames = null;

  public static final String SERIALIZED_NAME_INBOUND_RULE_TO_PORT_RANGES = "InboundRuleToPortRanges";
  @SerializedName(SERIALIZED_NAME_INBOUND_RULE_TO_PORT_RANGES)
  private List<Integer> inboundRuleToPortRanges = null;

  public static final String SERIALIZED_NAME_NET_IDS = "NetIds";
  @SerializedName(SERIALIZED_NAME_NET_IDS)
  private List<String> netIds = null;

  public static final String SERIALIZED_NAME_OUTBOUND_RULE_ACCOUNT_IDS = "OutboundRuleAccountIds";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_RULE_ACCOUNT_IDS)
  private List<String> outboundRuleAccountIds = null;

  public static final String SERIALIZED_NAME_OUTBOUND_RULE_FROM_PORT_RANGES = "OutboundRuleFromPortRanges";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_RULE_FROM_PORT_RANGES)
  private List<Integer> outboundRuleFromPortRanges = null;

  public static final String SERIALIZED_NAME_OUTBOUND_RULE_IP_RANGES = "OutboundRuleIpRanges";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_RULE_IP_RANGES)
  private List<String> outboundRuleIpRanges = null;

  public static final String SERIALIZED_NAME_OUTBOUND_RULE_PROTOCOLS = "OutboundRuleProtocols";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_RULE_PROTOCOLS)
  private List<String> outboundRuleProtocols = null;

  public static final String SERIALIZED_NAME_OUTBOUND_RULE_SECURITY_GROUP_IDS = "OutboundRuleSecurityGroupIds";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_RULE_SECURITY_GROUP_IDS)
  private List<String> outboundRuleSecurityGroupIds = null;

  public static final String SERIALIZED_NAME_OUTBOUND_RULE_SECURITY_GROUP_NAMES = "OutboundRuleSecurityGroupNames";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_RULE_SECURITY_GROUP_NAMES)
  private List<String> outboundRuleSecurityGroupNames = null;

  public static final String SERIALIZED_NAME_OUTBOUND_RULE_TO_PORT_RANGES = "OutboundRuleToPortRanges";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_RULE_TO_PORT_RANGES)
  private List<Integer> outboundRuleToPortRanges = null;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
  private List<String> securityGroupIds = null;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_NAMES = "SecurityGroupNames";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_NAMES)
  private List<String> securityGroupNames = null;

  public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";
  @SerializedName(SERIALIZED_NAME_TAG_KEYS)
  private List<String> tagKeys = null;

  public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";
  @SerializedName(SERIALIZED_NAME_TAG_VALUES)
  private List<String> tagValues = null;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;


  public FiltersSecurityGroup accountIds(List<String> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public FiltersSecurityGroup addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<String>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * The account IDs of the owners of the security groups.
   * @return accountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account IDs of the owners of the security groups.")

  public List<String> getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }


  public FiltersSecurityGroup descriptions(List<String> descriptions) {
    
    this.descriptions = descriptions;
    return this;
  }

  public FiltersSecurityGroup addDescriptionsItem(String descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<String>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * The descriptions of the security groups.
   * @return descriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The descriptions of the security groups.")

  public List<String> getDescriptions() {
    return descriptions;
  }


  public void setDescriptions(List<String> descriptions) {
    this.descriptions = descriptions;
  }


  public FiltersSecurityGroup inboundRuleAccountIds(List<String> inboundRuleAccountIds) {
    
    this.inboundRuleAccountIds = inboundRuleAccountIds;
    return this;
  }

  public FiltersSecurityGroup addInboundRuleAccountIdsItem(String inboundRuleAccountIdsItem) {
    if (this.inboundRuleAccountIds == null) {
      this.inboundRuleAccountIds = new ArrayList<String>();
    }
    this.inboundRuleAccountIds.add(inboundRuleAccountIdsItem);
    return this;
  }

   /**
   * The account IDs that have been granted permissions.
   * @return inboundRuleAccountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account IDs that have been granted permissions.")

  public List<String> getInboundRuleAccountIds() {
    return inboundRuleAccountIds;
  }


  public void setInboundRuleAccountIds(List<String> inboundRuleAccountIds) {
    this.inboundRuleAccountIds = inboundRuleAccountIds;
  }


  public FiltersSecurityGroup inboundRuleFromPortRanges(List<Integer> inboundRuleFromPortRanges) {
    
    this.inboundRuleFromPortRanges = inboundRuleFromPortRanges;
    return this;
  }

  public FiltersSecurityGroup addInboundRuleFromPortRangesItem(Integer inboundRuleFromPortRangesItem) {
    if (this.inboundRuleFromPortRanges == null) {
      this.inboundRuleFromPortRanges = new ArrayList<Integer>();
    }
    this.inboundRuleFromPortRanges.add(inboundRuleFromPortRangesItem);
    return this;
  }

   /**
   * The beginnings of the port ranges for the TCP and UDP protocols, or the ICMP type numbers.
   * @return inboundRuleFromPortRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The beginnings of the port ranges for the TCP and UDP protocols, or the ICMP type numbers.")

  public List<Integer> getInboundRuleFromPortRanges() {
    return inboundRuleFromPortRanges;
  }


  public void setInboundRuleFromPortRanges(List<Integer> inboundRuleFromPortRanges) {
    this.inboundRuleFromPortRanges = inboundRuleFromPortRanges;
  }


  public FiltersSecurityGroup inboundRuleIpRanges(List<String> inboundRuleIpRanges) {
    
    this.inboundRuleIpRanges = inboundRuleIpRanges;
    return this;
  }

  public FiltersSecurityGroup addInboundRuleIpRangesItem(String inboundRuleIpRangesItem) {
    if (this.inboundRuleIpRanges == null) {
      this.inboundRuleIpRanges = new ArrayList<String>();
    }
    this.inboundRuleIpRanges.add(inboundRuleIpRangesItem);
    return this;
  }

   /**
   * The IP ranges that have been granted permissions, in CIDR notation (for example, &#x60;10.0.0.0/24&#x60;).
   * @return inboundRuleIpRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP ranges that have been granted permissions, in CIDR notation (for example, `10.0.0.0/24`).")

  public List<String> getInboundRuleIpRanges() {
    return inboundRuleIpRanges;
  }


  public void setInboundRuleIpRanges(List<String> inboundRuleIpRanges) {
    this.inboundRuleIpRanges = inboundRuleIpRanges;
  }


  public FiltersSecurityGroup inboundRuleProtocols(List<String> inboundRuleProtocols) {
    
    this.inboundRuleProtocols = inboundRuleProtocols;
    return this;
  }

  public FiltersSecurityGroup addInboundRuleProtocolsItem(String inboundRuleProtocolsItem) {
    if (this.inboundRuleProtocols == null) {
      this.inboundRuleProtocols = new ArrayList<String>();
    }
    this.inboundRuleProtocols.add(inboundRuleProtocolsItem);
    return this;
  }

   /**
   * The IP protocols for the permissions (&#x60;tcp&#x60; \\| &#x60;udp&#x60; \\| &#x60;icmp&#x60;, or a protocol number, or &#x60;-1&#x60; for all protocols).
   * @return inboundRuleProtocols
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP protocols for the permissions (`tcp` \\| `udp` \\| `icmp`, or a protocol number, or `-1` for all protocols).")

  public List<String> getInboundRuleProtocols() {
    return inboundRuleProtocols;
  }


  public void setInboundRuleProtocols(List<String> inboundRuleProtocols) {
    this.inboundRuleProtocols = inboundRuleProtocols;
  }


  public FiltersSecurityGroup inboundRuleSecurityGroupIds(List<String> inboundRuleSecurityGroupIds) {
    
    this.inboundRuleSecurityGroupIds = inboundRuleSecurityGroupIds;
    return this;
  }

  public FiltersSecurityGroup addInboundRuleSecurityGroupIdsItem(String inboundRuleSecurityGroupIdsItem) {
    if (this.inboundRuleSecurityGroupIds == null) {
      this.inboundRuleSecurityGroupIds = new ArrayList<String>();
    }
    this.inboundRuleSecurityGroupIds.add(inboundRuleSecurityGroupIdsItem);
    return this;
  }

   /**
   * The IDs of the security groups that have been granted permissions.
   * @return inboundRuleSecurityGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the security groups that have been granted permissions.")

  public List<String> getInboundRuleSecurityGroupIds() {
    return inboundRuleSecurityGroupIds;
  }


  public void setInboundRuleSecurityGroupIds(List<String> inboundRuleSecurityGroupIds) {
    this.inboundRuleSecurityGroupIds = inboundRuleSecurityGroupIds;
  }


  public FiltersSecurityGroup inboundRuleSecurityGroupNames(List<String> inboundRuleSecurityGroupNames) {
    
    this.inboundRuleSecurityGroupNames = inboundRuleSecurityGroupNames;
    return this;
  }

  public FiltersSecurityGroup addInboundRuleSecurityGroupNamesItem(String inboundRuleSecurityGroupNamesItem) {
    if (this.inboundRuleSecurityGroupNames == null) {
      this.inboundRuleSecurityGroupNames = new ArrayList<String>();
    }
    this.inboundRuleSecurityGroupNames.add(inboundRuleSecurityGroupNamesItem);
    return this;
  }

   /**
   * The names of the security groups that have been granted permissions.
   * @return inboundRuleSecurityGroupNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The names of the security groups that have been granted permissions.")

  public List<String> getInboundRuleSecurityGroupNames() {
    return inboundRuleSecurityGroupNames;
  }


  public void setInboundRuleSecurityGroupNames(List<String> inboundRuleSecurityGroupNames) {
    this.inboundRuleSecurityGroupNames = inboundRuleSecurityGroupNames;
  }


  public FiltersSecurityGroup inboundRuleToPortRanges(List<Integer> inboundRuleToPortRanges) {
    
    this.inboundRuleToPortRanges = inboundRuleToPortRanges;
    return this;
  }

  public FiltersSecurityGroup addInboundRuleToPortRangesItem(Integer inboundRuleToPortRangesItem) {
    if (this.inboundRuleToPortRanges == null) {
      this.inboundRuleToPortRanges = new ArrayList<Integer>();
    }
    this.inboundRuleToPortRanges.add(inboundRuleToPortRangesItem);
    return this;
  }

   /**
   * The ends of the port ranges for the TCP and UDP protocols, or the ICMP code numbers.
   * @return inboundRuleToPortRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ends of the port ranges for the TCP and UDP protocols, or the ICMP code numbers.")

  public List<Integer> getInboundRuleToPortRanges() {
    return inboundRuleToPortRanges;
  }


  public void setInboundRuleToPortRanges(List<Integer> inboundRuleToPortRanges) {
    this.inboundRuleToPortRanges = inboundRuleToPortRanges;
  }


  public FiltersSecurityGroup netIds(List<String> netIds) {
    
    this.netIds = netIds;
    return this;
  }

  public FiltersSecurityGroup addNetIdsItem(String netIdsItem) {
    if (this.netIds == null) {
      this.netIds = new ArrayList<String>();
    }
    this.netIds.add(netIdsItem);
    return this;
  }

   /**
   * The IDs of the Nets specified when the security groups were created.
   * @return netIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the Nets specified when the security groups were created.")

  public List<String> getNetIds() {
    return netIds;
  }


  public void setNetIds(List<String> netIds) {
    this.netIds = netIds;
  }


  public FiltersSecurityGroup outboundRuleAccountIds(List<String> outboundRuleAccountIds) {
    
    this.outboundRuleAccountIds = outboundRuleAccountIds;
    return this;
  }

  public FiltersSecurityGroup addOutboundRuleAccountIdsItem(String outboundRuleAccountIdsItem) {
    if (this.outboundRuleAccountIds == null) {
      this.outboundRuleAccountIds = new ArrayList<String>();
    }
    this.outboundRuleAccountIds.add(outboundRuleAccountIdsItem);
    return this;
  }

   /**
   * The account IDs that have been granted permissions.
   * @return outboundRuleAccountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account IDs that have been granted permissions.")

  public List<String> getOutboundRuleAccountIds() {
    return outboundRuleAccountIds;
  }


  public void setOutboundRuleAccountIds(List<String> outboundRuleAccountIds) {
    this.outboundRuleAccountIds = outboundRuleAccountIds;
  }


  public FiltersSecurityGroup outboundRuleFromPortRanges(List<Integer> outboundRuleFromPortRanges) {
    
    this.outboundRuleFromPortRanges = outboundRuleFromPortRanges;
    return this;
  }

  public FiltersSecurityGroup addOutboundRuleFromPortRangesItem(Integer outboundRuleFromPortRangesItem) {
    if (this.outboundRuleFromPortRanges == null) {
      this.outboundRuleFromPortRanges = new ArrayList<Integer>();
    }
    this.outboundRuleFromPortRanges.add(outboundRuleFromPortRangesItem);
    return this;
  }

   /**
   * The beginnings of the port ranges for the TCP and UDP protocols, or the ICMP type numbers.
   * @return outboundRuleFromPortRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The beginnings of the port ranges for the TCP and UDP protocols, or the ICMP type numbers.")

  public List<Integer> getOutboundRuleFromPortRanges() {
    return outboundRuleFromPortRanges;
  }


  public void setOutboundRuleFromPortRanges(List<Integer> outboundRuleFromPortRanges) {
    this.outboundRuleFromPortRanges = outboundRuleFromPortRanges;
  }


  public FiltersSecurityGroup outboundRuleIpRanges(List<String> outboundRuleIpRanges) {
    
    this.outboundRuleIpRanges = outboundRuleIpRanges;
    return this;
  }

  public FiltersSecurityGroup addOutboundRuleIpRangesItem(String outboundRuleIpRangesItem) {
    if (this.outboundRuleIpRanges == null) {
      this.outboundRuleIpRanges = new ArrayList<String>();
    }
    this.outboundRuleIpRanges.add(outboundRuleIpRangesItem);
    return this;
  }

   /**
   * The IP ranges that have been granted permissions, in CIDR notation (for example, &#x60;10.0.0.0/24&#x60;).
   * @return outboundRuleIpRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP ranges that have been granted permissions, in CIDR notation (for example, `10.0.0.0/24`).")

  public List<String> getOutboundRuleIpRanges() {
    return outboundRuleIpRanges;
  }


  public void setOutboundRuleIpRanges(List<String> outboundRuleIpRanges) {
    this.outboundRuleIpRanges = outboundRuleIpRanges;
  }


  public FiltersSecurityGroup outboundRuleProtocols(List<String> outboundRuleProtocols) {
    
    this.outboundRuleProtocols = outboundRuleProtocols;
    return this;
  }

  public FiltersSecurityGroup addOutboundRuleProtocolsItem(String outboundRuleProtocolsItem) {
    if (this.outboundRuleProtocols == null) {
      this.outboundRuleProtocols = new ArrayList<String>();
    }
    this.outboundRuleProtocols.add(outboundRuleProtocolsItem);
    return this;
  }

   /**
   * The IP protocols for the permissions (&#x60;tcp&#x60; \\| &#x60;udp&#x60; \\| &#x60;icmp&#x60;, or a protocol number, or &#x60;-1&#x60; for all protocols).
   * @return outboundRuleProtocols
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP protocols for the permissions (`tcp` \\| `udp` \\| `icmp`, or a protocol number, or `-1` for all protocols).")

  public List<String> getOutboundRuleProtocols() {
    return outboundRuleProtocols;
  }


  public void setOutboundRuleProtocols(List<String> outboundRuleProtocols) {
    this.outboundRuleProtocols = outboundRuleProtocols;
  }


  public FiltersSecurityGroup outboundRuleSecurityGroupIds(List<String> outboundRuleSecurityGroupIds) {
    
    this.outboundRuleSecurityGroupIds = outboundRuleSecurityGroupIds;
    return this;
  }

  public FiltersSecurityGroup addOutboundRuleSecurityGroupIdsItem(String outboundRuleSecurityGroupIdsItem) {
    if (this.outboundRuleSecurityGroupIds == null) {
      this.outboundRuleSecurityGroupIds = new ArrayList<String>();
    }
    this.outboundRuleSecurityGroupIds.add(outboundRuleSecurityGroupIdsItem);
    return this;
  }

   /**
   * The IDs of the security groups that have been granted permissions.
   * @return outboundRuleSecurityGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the security groups that have been granted permissions.")

  public List<String> getOutboundRuleSecurityGroupIds() {
    return outboundRuleSecurityGroupIds;
  }


  public void setOutboundRuleSecurityGroupIds(List<String> outboundRuleSecurityGroupIds) {
    this.outboundRuleSecurityGroupIds = outboundRuleSecurityGroupIds;
  }


  public FiltersSecurityGroup outboundRuleSecurityGroupNames(List<String> outboundRuleSecurityGroupNames) {
    
    this.outboundRuleSecurityGroupNames = outboundRuleSecurityGroupNames;
    return this;
  }

  public FiltersSecurityGroup addOutboundRuleSecurityGroupNamesItem(String outboundRuleSecurityGroupNamesItem) {
    if (this.outboundRuleSecurityGroupNames == null) {
      this.outboundRuleSecurityGroupNames = new ArrayList<String>();
    }
    this.outboundRuleSecurityGroupNames.add(outboundRuleSecurityGroupNamesItem);
    return this;
  }

   /**
   * The names of the security groups that have been granted permissions.
   * @return outboundRuleSecurityGroupNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The names of the security groups that have been granted permissions.")

  public List<String> getOutboundRuleSecurityGroupNames() {
    return outboundRuleSecurityGroupNames;
  }


  public void setOutboundRuleSecurityGroupNames(List<String> outboundRuleSecurityGroupNames) {
    this.outboundRuleSecurityGroupNames = outboundRuleSecurityGroupNames;
  }


  public FiltersSecurityGroup outboundRuleToPortRanges(List<Integer> outboundRuleToPortRanges) {
    
    this.outboundRuleToPortRanges = outboundRuleToPortRanges;
    return this;
  }

  public FiltersSecurityGroup addOutboundRuleToPortRangesItem(Integer outboundRuleToPortRangesItem) {
    if (this.outboundRuleToPortRanges == null) {
      this.outboundRuleToPortRanges = new ArrayList<Integer>();
    }
    this.outboundRuleToPortRanges.add(outboundRuleToPortRangesItem);
    return this;
  }

   /**
   * The ends of the port ranges for the TCP and UDP protocols, or the ICMP code numbers.
   * @return outboundRuleToPortRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ends of the port ranges for the TCP and UDP protocols, or the ICMP code numbers.")

  public List<Integer> getOutboundRuleToPortRanges() {
    return outboundRuleToPortRanges;
  }


  public void setOutboundRuleToPortRanges(List<Integer> outboundRuleToPortRanges) {
    this.outboundRuleToPortRanges = outboundRuleToPortRanges;
  }


  public FiltersSecurityGroup securityGroupIds(List<String> securityGroupIds) {
    
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public FiltersSecurityGroup addSecurityGroupIdsItem(String securityGroupIdsItem) {
    if (this.securityGroupIds == null) {
      this.securityGroupIds = new ArrayList<String>();
    }
    this.securityGroupIds.add(securityGroupIdsItem);
    return this;
  }

   /**
   * The IDs of the security groups.
   * @return securityGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the security groups.")

  public List<String> getSecurityGroupIds() {
    return securityGroupIds;
  }


  public void setSecurityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }


  public FiltersSecurityGroup securityGroupNames(List<String> securityGroupNames) {
    
    this.securityGroupNames = securityGroupNames;
    return this;
  }

  public FiltersSecurityGroup addSecurityGroupNamesItem(String securityGroupNamesItem) {
    if (this.securityGroupNames == null) {
      this.securityGroupNames = new ArrayList<String>();
    }
    this.securityGroupNames.add(securityGroupNamesItem);
    return this;
  }

   /**
   * The names of the security groups.
   * @return securityGroupNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The names of the security groups.")

  public List<String> getSecurityGroupNames() {
    return securityGroupNames;
  }


  public void setSecurityGroupNames(List<String> securityGroupNames) {
    this.securityGroupNames = securityGroupNames;
  }


  public FiltersSecurityGroup tagKeys(List<String> tagKeys) {
    
    this.tagKeys = tagKeys;
    return this;
  }

  public FiltersSecurityGroup addTagKeysItem(String tagKeysItem) {
    if (this.tagKeys == null) {
      this.tagKeys = new ArrayList<String>();
    }
    this.tagKeys.add(tagKeysItem);
    return this;
  }

   /**
   * The keys of the tags associated with the security groups.
   * @return tagKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The keys of the tags associated with the security groups.")

  public List<String> getTagKeys() {
    return tagKeys;
  }


  public void setTagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
  }


  public FiltersSecurityGroup tagValues(List<String> tagValues) {
    
    this.tagValues = tagValues;
    return this;
  }

  public FiltersSecurityGroup addTagValuesItem(String tagValuesItem) {
    if (this.tagValues == null) {
      this.tagValues = new ArrayList<String>();
    }
    this.tagValues.add(tagValuesItem);
    return this;
  }

   /**
   * The values of the tags associated with the security groups.
   * @return tagValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The values of the tags associated with the security groups.")

  public List<String> getTagValues() {
    return tagValues;
  }


  public void setTagValues(List<String> tagValues) {
    this.tagValues = tagValues;
  }


  public FiltersSecurityGroup tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public FiltersSecurityGroup addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The key/value combination of the tags associated with the security groups, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key/value combination of the tags associated with the security groups, in the following format: &quot;Filters&quot;:{&quot;Tags&quot;:[&quot;TAGKEY=TAGVALUE&quot;]}.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
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
    FiltersSecurityGroup filtersSecurityGroup = (FiltersSecurityGroup) o;
    return Objects.equals(this.accountIds, filtersSecurityGroup.accountIds) &&
        Objects.equals(this.descriptions, filtersSecurityGroup.descriptions) &&
        Objects.equals(this.inboundRuleAccountIds, filtersSecurityGroup.inboundRuleAccountIds) &&
        Objects.equals(this.inboundRuleFromPortRanges, filtersSecurityGroup.inboundRuleFromPortRanges) &&
        Objects.equals(this.inboundRuleIpRanges, filtersSecurityGroup.inboundRuleIpRanges) &&
        Objects.equals(this.inboundRuleProtocols, filtersSecurityGroup.inboundRuleProtocols) &&
        Objects.equals(this.inboundRuleSecurityGroupIds, filtersSecurityGroup.inboundRuleSecurityGroupIds) &&
        Objects.equals(this.inboundRuleSecurityGroupNames, filtersSecurityGroup.inboundRuleSecurityGroupNames) &&
        Objects.equals(this.inboundRuleToPortRanges, filtersSecurityGroup.inboundRuleToPortRanges) &&
        Objects.equals(this.netIds, filtersSecurityGroup.netIds) &&
        Objects.equals(this.outboundRuleAccountIds, filtersSecurityGroup.outboundRuleAccountIds) &&
        Objects.equals(this.outboundRuleFromPortRanges, filtersSecurityGroup.outboundRuleFromPortRanges) &&
        Objects.equals(this.outboundRuleIpRanges, filtersSecurityGroup.outboundRuleIpRanges) &&
        Objects.equals(this.outboundRuleProtocols, filtersSecurityGroup.outboundRuleProtocols) &&
        Objects.equals(this.outboundRuleSecurityGroupIds, filtersSecurityGroup.outboundRuleSecurityGroupIds) &&
        Objects.equals(this.outboundRuleSecurityGroupNames, filtersSecurityGroup.outboundRuleSecurityGroupNames) &&
        Objects.equals(this.outboundRuleToPortRanges, filtersSecurityGroup.outboundRuleToPortRanges) &&
        Objects.equals(this.securityGroupIds, filtersSecurityGroup.securityGroupIds) &&
        Objects.equals(this.securityGroupNames, filtersSecurityGroup.securityGroupNames) &&
        Objects.equals(this.tagKeys, filtersSecurityGroup.tagKeys) &&
        Objects.equals(this.tagValues, filtersSecurityGroup.tagValues) &&
        Objects.equals(this.tags, filtersSecurityGroup.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountIds, descriptions, inboundRuleAccountIds, inboundRuleFromPortRanges, inboundRuleIpRanges, inboundRuleProtocols, inboundRuleSecurityGroupIds, inboundRuleSecurityGroupNames, inboundRuleToPortRanges, netIds, outboundRuleAccountIds, outboundRuleFromPortRanges, outboundRuleIpRanges, outboundRuleProtocols, outboundRuleSecurityGroupIds, outboundRuleSecurityGroupNames, outboundRuleToPortRanges, securityGroupIds, securityGroupNames, tagKeys, tagValues, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltersSecurityGroup {\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    inboundRuleAccountIds: ").append(toIndentedString(inboundRuleAccountIds)).append("\n");
    sb.append("    inboundRuleFromPortRanges: ").append(toIndentedString(inboundRuleFromPortRanges)).append("\n");
    sb.append("    inboundRuleIpRanges: ").append(toIndentedString(inboundRuleIpRanges)).append("\n");
    sb.append("    inboundRuleProtocols: ").append(toIndentedString(inboundRuleProtocols)).append("\n");
    sb.append("    inboundRuleSecurityGroupIds: ").append(toIndentedString(inboundRuleSecurityGroupIds)).append("\n");
    sb.append("    inboundRuleSecurityGroupNames: ").append(toIndentedString(inboundRuleSecurityGroupNames)).append("\n");
    sb.append("    inboundRuleToPortRanges: ").append(toIndentedString(inboundRuleToPortRanges)).append("\n");
    sb.append("    netIds: ").append(toIndentedString(netIds)).append("\n");
    sb.append("    outboundRuleAccountIds: ").append(toIndentedString(outboundRuleAccountIds)).append("\n");
    sb.append("    outboundRuleFromPortRanges: ").append(toIndentedString(outboundRuleFromPortRanges)).append("\n");
    sb.append("    outboundRuleIpRanges: ").append(toIndentedString(outboundRuleIpRanges)).append("\n");
    sb.append("    outboundRuleProtocols: ").append(toIndentedString(outboundRuleProtocols)).append("\n");
    sb.append("    outboundRuleSecurityGroupIds: ").append(toIndentedString(outboundRuleSecurityGroupIds)).append("\n");
    sb.append("    outboundRuleSecurityGroupNames: ").append(toIndentedString(outboundRuleSecurityGroupNames)).append("\n");
    sb.append("    outboundRuleToPortRanges: ").append(toIndentedString(outboundRuleToPortRanges)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    securityGroupNames: ").append(toIndentedString(securityGroupNames)).append("\n");
    sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
    sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
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


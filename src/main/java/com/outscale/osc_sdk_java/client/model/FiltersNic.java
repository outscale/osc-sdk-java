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
public class FiltersNic {
  public static final String SERIALIZED_NAME_DESCRIPTIONS = "Descriptions";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONS)
  private List<String> descriptions = null;

  public static final String SERIALIZED_NAME_IS_SOURCE_DEST_CHECK = "IsSourceDestCheck";
  @SerializedName(SERIALIZED_NAME_IS_SOURCE_DEST_CHECK)
  private Boolean isSourceDestCheck;

  public static final String SERIALIZED_NAME_LINK_NIC_DELETE_ON_VM_DELETION = "LinkNicDeleteOnVmDeletion";
  @SerializedName(SERIALIZED_NAME_LINK_NIC_DELETE_ON_VM_DELETION)
  private Boolean linkNicDeleteOnVmDeletion;

  public static final String SERIALIZED_NAME_LINK_NIC_DEVICE_NUMBERS = "LinkNicDeviceNumbers";
  @SerializedName(SERIALIZED_NAME_LINK_NIC_DEVICE_NUMBERS)
  private List<Integer> linkNicDeviceNumbers = null;

  public static final String SERIALIZED_NAME_LINK_NIC_LINK_NIC_IDS = "LinkNicLinkNicIds";
  @SerializedName(SERIALIZED_NAME_LINK_NIC_LINK_NIC_IDS)
  private List<String> linkNicLinkNicIds = null;

  public static final String SERIALIZED_NAME_LINK_NIC_STATES = "LinkNicStates";
  @SerializedName(SERIALIZED_NAME_LINK_NIC_STATES)
  private List<String> linkNicStates = null;

  public static final String SERIALIZED_NAME_LINK_NIC_VM_ACCOUNT_IDS = "LinkNicVmAccountIds";
  @SerializedName(SERIALIZED_NAME_LINK_NIC_VM_ACCOUNT_IDS)
  private List<String> linkNicVmAccountIds = null;

  public static final String SERIALIZED_NAME_LINK_NIC_VM_IDS = "LinkNicVmIds";
  @SerializedName(SERIALIZED_NAME_LINK_NIC_VM_IDS)
  private List<String> linkNicVmIds = null;

  public static final String SERIALIZED_NAME_LINK_PUBLIC_IP_ACCOUNT_IDS = "LinkPublicIpAccountIds";
  @SerializedName(SERIALIZED_NAME_LINK_PUBLIC_IP_ACCOUNT_IDS)
  private List<String> linkPublicIpAccountIds = null;

  public static final String SERIALIZED_NAME_LINK_PUBLIC_IP_LINK_PUBLIC_IP_IDS = "LinkPublicIpLinkPublicIpIds";
  @SerializedName(SERIALIZED_NAME_LINK_PUBLIC_IP_LINK_PUBLIC_IP_IDS)
  private List<String> linkPublicIpLinkPublicIpIds = null;

  public static final String SERIALIZED_NAME_LINK_PUBLIC_IP_PUBLIC_IP_IDS = "LinkPublicIpPublicIpIds";
  @SerializedName(SERIALIZED_NAME_LINK_PUBLIC_IP_PUBLIC_IP_IDS)
  private List<String> linkPublicIpPublicIpIds = null;

  public static final String SERIALIZED_NAME_LINK_PUBLIC_IP_PUBLIC_IPS = "LinkPublicIpPublicIps";
  @SerializedName(SERIALIZED_NAME_LINK_PUBLIC_IP_PUBLIC_IPS)
  private List<String> linkPublicIpPublicIps = null;

  public static final String SERIALIZED_NAME_MAC_ADDRESSES = "MacAddresses";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESSES)
  private List<String> macAddresses = null;

  public static final String SERIALIZED_NAME_NET_IDS = "NetIds";
  @SerializedName(SERIALIZED_NAME_NET_IDS)
  private List<String> netIds = null;

  public static final String SERIALIZED_NAME_NIC_IDS = "NicIds";
  @SerializedName(SERIALIZED_NAME_NIC_IDS)
  private List<String> nicIds = null;

  public static final String SERIALIZED_NAME_PRIVATE_DNS_NAMES = "PrivateDnsNames";
  @SerializedName(SERIALIZED_NAME_PRIVATE_DNS_NAMES)
  private List<String> privateDnsNames = null;

  public static final String SERIALIZED_NAME_PRIVATE_IPS_LINK_PUBLIC_IP_ACCOUNT_IDS = "PrivateIpsLinkPublicIpAccountIds";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IPS_LINK_PUBLIC_IP_ACCOUNT_IDS)
  private List<String> privateIpsLinkPublicIpAccountIds = null;

  public static final String SERIALIZED_NAME_PRIVATE_IPS_LINK_PUBLIC_IP_PUBLIC_IPS = "PrivateIpsLinkPublicIpPublicIps";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IPS_LINK_PUBLIC_IP_PUBLIC_IPS)
  private List<String> privateIpsLinkPublicIpPublicIps = null;

  public static final String SERIALIZED_NAME_PRIVATE_IPS_PRIMARY_IP = "PrivateIpsPrimaryIp";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IPS_PRIMARY_IP)
  private Boolean privateIpsPrimaryIp;

  public static final String SERIALIZED_NAME_PRIVATE_IPS_PRIVATE_IPS = "PrivateIpsPrivateIps";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IPS_PRIVATE_IPS)
  private List<String> privateIpsPrivateIps = null;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
  private List<String> securityGroupIds = null;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_NAMES = "SecurityGroupNames";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_NAMES)
  private List<String> securityGroupNames = null;

  public static final String SERIALIZED_NAME_STATES = "States";
  @SerializedName(SERIALIZED_NAME_STATES)
  private List<String> states = null;

  public static final String SERIALIZED_NAME_SUBNET_IDS = "SubnetIds";
  @SerializedName(SERIALIZED_NAME_SUBNET_IDS)
  private List<String> subnetIds = null;

  public static final String SERIALIZED_NAME_SUBREGION_NAMES = "SubregionNames";
  @SerializedName(SERIALIZED_NAME_SUBREGION_NAMES)
  private List<String> subregionNames = null;

  public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";
  @SerializedName(SERIALIZED_NAME_TAG_KEYS)
  private List<String> tagKeys = null;

  public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";
  @SerializedName(SERIALIZED_NAME_TAG_VALUES)
  private List<String> tagValues = null;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;


  public FiltersNic descriptions(List<String> descriptions) {
    
    this.descriptions = descriptions;
    return this;
  }

  public FiltersNic addDescriptionsItem(String descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<String>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * The descriptions of the NICs.
   * @return descriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The descriptions of the NICs.")

  public List<String> getDescriptions() {
    return descriptions;
  }


  public void setDescriptions(List<String> descriptions) {
    this.descriptions = descriptions;
  }


  public FiltersNic isSourceDestCheck(Boolean isSourceDestCheck) {
    
    this.isSourceDestCheck = isSourceDestCheck;
    return this;
  }

   /**
   * Whether the source/destination checking is enabled (true) or disabled (false).
   * @return isSourceDestCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the source/destination checking is enabled (true) or disabled (false).")

  public Boolean getIsSourceDestCheck() {
    return isSourceDestCheck;
  }


  public void setIsSourceDestCheck(Boolean isSourceDestCheck) {
    this.isSourceDestCheck = isSourceDestCheck;
  }


  public FiltersNic linkNicDeleteOnVmDeletion(Boolean linkNicDeleteOnVmDeletion) {
    
    this.linkNicDeleteOnVmDeletion = linkNicDeleteOnVmDeletion;
    return this;
  }

   /**
   * Whether the NICs are deleted when the VMs they are attached to are terminated.
   * @return linkNicDeleteOnVmDeletion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the NICs are deleted when the VMs they are attached to are terminated.")

  public Boolean getLinkNicDeleteOnVmDeletion() {
    return linkNicDeleteOnVmDeletion;
  }


  public void setLinkNicDeleteOnVmDeletion(Boolean linkNicDeleteOnVmDeletion) {
    this.linkNicDeleteOnVmDeletion = linkNicDeleteOnVmDeletion;
  }


  public FiltersNic linkNicDeviceNumbers(List<Integer> linkNicDeviceNumbers) {
    
    this.linkNicDeviceNumbers = linkNicDeviceNumbers;
    return this;
  }

  public FiltersNic addLinkNicDeviceNumbersItem(Integer linkNicDeviceNumbersItem) {
    if (this.linkNicDeviceNumbers == null) {
      this.linkNicDeviceNumbers = new ArrayList<Integer>();
    }
    this.linkNicDeviceNumbers.add(linkNicDeviceNumbersItem);
    return this;
  }

   /**
   * The device numbers the NICs are attached to.
   * @return linkNicDeviceNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The device numbers the NICs are attached to.")

  public List<Integer> getLinkNicDeviceNumbers() {
    return linkNicDeviceNumbers;
  }


  public void setLinkNicDeviceNumbers(List<Integer> linkNicDeviceNumbers) {
    this.linkNicDeviceNumbers = linkNicDeviceNumbers;
  }


  public FiltersNic linkNicLinkNicIds(List<String> linkNicLinkNicIds) {
    
    this.linkNicLinkNicIds = linkNicLinkNicIds;
    return this;
  }

  public FiltersNic addLinkNicLinkNicIdsItem(String linkNicLinkNicIdsItem) {
    if (this.linkNicLinkNicIds == null) {
      this.linkNicLinkNicIds = new ArrayList<String>();
    }
    this.linkNicLinkNicIds.add(linkNicLinkNicIdsItem);
    return this;
  }

   /**
   * The attachment IDs of the NICs.
   * @return linkNicLinkNicIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The attachment IDs of the NICs.")

  public List<String> getLinkNicLinkNicIds() {
    return linkNicLinkNicIds;
  }


  public void setLinkNicLinkNicIds(List<String> linkNicLinkNicIds) {
    this.linkNicLinkNicIds = linkNicLinkNicIds;
  }


  public FiltersNic linkNicStates(List<String> linkNicStates) {
    
    this.linkNicStates = linkNicStates;
    return this;
  }

  public FiltersNic addLinkNicStatesItem(String linkNicStatesItem) {
    if (this.linkNicStates == null) {
      this.linkNicStates = new ArrayList<String>();
    }
    this.linkNicStates.add(linkNicStatesItem);
    return this;
  }

   /**
   * The states of the attachments.
   * @return linkNicStates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The states of the attachments.")

  public List<String> getLinkNicStates() {
    return linkNicStates;
  }


  public void setLinkNicStates(List<String> linkNicStates) {
    this.linkNicStates = linkNicStates;
  }


  public FiltersNic linkNicVmAccountIds(List<String> linkNicVmAccountIds) {
    
    this.linkNicVmAccountIds = linkNicVmAccountIds;
    return this;
  }

  public FiltersNic addLinkNicVmAccountIdsItem(String linkNicVmAccountIdsItem) {
    if (this.linkNicVmAccountIds == null) {
      this.linkNicVmAccountIds = new ArrayList<String>();
    }
    this.linkNicVmAccountIds.add(linkNicVmAccountIdsItem);
    return this;
  }

   /**
   * The account IDs of the owners of the VMs the NICs are attached to.
   * @return linkNicVmAccountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account IDs of the owners of the VMs the NICs are attached to.")

  public List<String> getLinkNicVmAccountIds() {
    return linkNicVmAccountIds;
  }


  public void setLinkNicVmAccountIds(List<String> linkNicVmAccountIds) {
    this.linkNicVmAccountIds = linkNicVmAccountIds;
  }


  public FiltersNic linkNicVmIds(List<String> linkNicVmIds) {
    
    this.linkNicVmIds = linkNicVmIds;
    return this;
  }

  public FiltersNic addLinkNicVmIdsItem(String linkNicVmIdsItem) {
    if (this.linkNicVmIds == null) {
      this.linkNicVmIds = new ArrayList<String>();
    }
    this.linkNicVmIds.add(linkNicVmIdsItem);
    return this;
  }

   /**
   * The IDs of the VMs the NICs are attached to.
   * @return linkNicVmIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the VMs the NICs are attached to.")

  public List<String> getLinkNicVmIds() {
    return linkNicVmIds;
  }


  public void setLinkNicVmIds(List<String> linkNicVmIds) {
    this.linkNicVmIds = linkNicVmIds;
  }


  public FiltersNic linkPublicIpAccountIds(List<String> linkPublicIpAccountIds) {
    
    this.linkPublicIpAccountIds = linkPublicIpAccountIds;
    return this;
  }

  public FiltersNic addLinkPublicIpAccountIdsItem(String linkPublicIpAccountIdsItem) {
    if (this.linkPublicIpAccountIds == null) {
      this.linkPublicIpAccountIds = new ArrayList<String>();
    }
    this.linkPublicIpAccountIds.add(linkPublicIpAccountIdsItem);
    return this;
  }

   /**
   * The account IDs of the owners of the public IPs associated with the NICs.
   * @return linkPublicIpAccountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account IDs of the owners of the public IPs associated with the NICs.")

  public List<String> getLinkPublicIpAccountIds() {
    return linkPublicIpAccountIds;
  }


  public void setLinkPublicIpAccountIds(List<String> linkPublicIpAccountIds) {
    this.linkPublicIpAccountIds = linkPublicIpAccountIds;
  }


  public FiltersNic linkPublicIpLinkPublicIpIds(List<String> linkPublicIpLinkPublicIpIds) {
    
    this.linkPublicIpLinkPublicIpIds = linkPublicIpLinkPublicIpIds;
    return this;
  }

  public FiltersNic addLinkPublicIpLinkPublicIpIdsItem(String linkPublicIpLinkPublicIpIdsItem) {
    if (this.linkPublicIpLinkPublicIpIds == null) {
      this.linkPublicIpLinkPublicIpIds = new ArrayList<String>();
    }
    this.linkPublicIpLinkPublicIpIds.add(linkPublicIpLinkPublicIpIdsItem);
    return this;
  }

   /**
   * The association IDs returned when the public IPs were associated with the NICs.
   * @return linkPublicIpLinkPublicIpIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The association IDs returned when the public IPs were associated with the NICs.")

  public List<String> getLinkPublicIpLinkPublicIpIds() {
    return linkPublicIpLinkPublicIpIds;
  }


  public void setLinkPublicIpLinkPublicIpIds(List<String> linkPublicIpLinkPublicIpIds) {
    this.linkPublicIpLinkPublicIpIds = linkPublicIpLinkPublicIpIds;
  }


  public FiltersNic linkPublicIpPublicIpIds(List<String> linkPublicIpPublicIpIds) {
    
    this.linkPublicIpPublicIpIds = linkPublicIpPublicIpIds;
    return this;
  }

  public FiltersNic addLinkPublicIpPublicIpIdsItem(String linkPublicIpPublicIpIdsItem) {
    if (this.linkPublicIpPublicIpIds == null) {
      this.linkPublicIpPublicIpIds = new ArrayList<String>();
    }
    this.linkPublicIpPublicIpIds.add(linkPublicIpPublicIpIdsItem);
    return this;
  }

   /**
   * The allocation IDs returned when the public IPs were allocated to their accounts.
   * @return linkPublicIpPublicIpIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The allocation IDs returned when the public IPs were allocated to their accounts.")

  public List<String> getLinkPublicIpPublicIpIds() {
    return linkPublicIpPublicIpIds;
  }


  public void setLinkPublicIpPublicIpIds(List<String> linkPublicIpPublicIpIds) {
    this.linkPublicIpPublicIpIds = linkPublicIpPublicIpIds;
  }


  public FiltersNic linkPublicIpPublicIps(List<String> linkPublicIpPublicIps) {
    
    this.linkPublicIpPublicIps = linkPublicIpPublicIps;
    return this;
  }

  public FiltersNic addLinkPublicIpPublicIpsItem(String linkPublicIpPublicIpsItem) {
    if (this.linkPublicIpPublicIps == null) {
      this.linkPublicIpPublicIps = new ArrayList<String>();
    }
    this.linkPublicIpPublicIps.add(linkPublicIpPublicIpsItem);
    return this;
  }

   /**
   * The public IPs associated with the NICs.
   * @return linkPublicIpPublicIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public IPs associated with the NICs.")

  public List<String> getLinkPublicIpPublicIps() {
    return linkPublicIpPublicIps;
  }


  public void setLinkPublicIpPublicIps(List<String> linkPublicIpPublicIps) {
    this.linkPublicIpPublicIps = linkPublicIpPublicIps;
  }


  public FiltersNic macAddresses(List<String> macAddresses) {
    
    this.macAddresses = macAddresses;
    return this;
  }

  public FiltersNic addMacAddressesItem(String macAddressesItem) {
    if (this.macAddresses == null) {
      this.macAddresses = new ArrayList<String>();
    }
    this.macAddresses.add(macAddressesItem);
    return this;
  }

   /**
   * The Media Access Control (MAC) addresses of the NICs.
   * @return macAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Media Access Control (MAC) addresses of the NICs.")

  public List<String> getMacAddresses() {
    return macAddresses;
  }


  public void setMacAddresses(List<String> macAddresses) {
    this.macAddresses = macAddresses;
  }


  public FiltersNic netIds(List<String> netIds) {
    
    this.netIds = netIds;
    return this;
  }

  public FiltersNic addNetIdsItem(String netIdsItem) {
    if (this.netIds == null) {
      this.netIds = new ArrayList<String>();
    }
    this.netIds.add(netIdsItem);
    return this;
  }

   /**
   * The IDs of the Nets where the NICs are located.
   * @return netIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the Nets where the NICs are located.")

  public List<String> getNetIds() {
    return netIds;
  }


  public void setNetIds(List<String> netIds) {
    this.netIds = netIds;
  }


  public FiltersNic nicIds(List<String> nicIds) {
    
    this.nicIds = nicIds;
    return this;
  }

  public FiltersNic addNicIdsItem(String nicIdsItem) {
    if (this.nicIds == null) {
      this.nicIds = new ArrayList<String>();
    }
    this.nicIds.add(nicIdsItem);
    return this;
  }

   /**
   * The IDs of the NICs.
   * @return nicIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the NICs.")

  public List<String> getNicIds() {
    return nicIds;
  }


  public void setNicIds(List<String> nicIds) {
    this.nicIds = nicIds;
  }


  public FiltersNic privateDnsNames(List<String> privateDnsNames) {
    
    this.privateDnsNames = privateDnsNames;
    return this;
  }

  public FiltersNic addPrivateDnsNamesItem(String privateDnsNamesItem) {
    if (this.privateDnsNames == null) {
      this.privateDnsNames = new ArrayList<String>();
    }
    this.privateDnsNames.add(privateDnsNamesItem);
    return this;
  }

   /**
   * The private DNS names associated with the primary private IPs.
   * @return privateDnsNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The private DNS names associated with the primary private IPs.")

  public List<String> getPrivateDnsNames() {
    return privateDnsNames;
  }


  public void setPrivateDnsNames(List<String> privateDnsNames) {
    this.privateDnsNames = privateDnsNames;
  }


  public FiltersNic privateIpsLinkPublicIpAccountIds(List<String> privateIpsLinkPublicIpAccountIds) {
    
    this.privateIpsLinkPublicIpAccountIds = privateIpsLinkPublicIpAccountIds;
    return this;
  }

  public FiltersNic addPrivateIpsLinkPublicIpAccountIdsItem(String privateIpsLinkPublicIpAccountIdsItem) {
    if (this.privateIpsLinkPublicIpAccountIds == null) {
      this.privateIpsLinkPublicIpAccountIds = new ArrayList<String>();
    }
    this.privateIpsLinkPublicIpAccountIds.add(privateIpsLinkPublicIpAccountIdsItem);
    return this;
  }

   /**
   * The account IDs of the owner of the public IPs associated with the private IPs.
   * @return privateIpsLinkPublicIpAccountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account IDs of the owner of the public IPs associated with the private IPs.")

  public List<String> getPrivateIpsLinkPublicIpAccountIds() {
    return privateIpsLinkPublicIpAccountIds;
  }


  public void setPrivateIpsLinkPublicIpAccountIds(List<String> privateIpsLinkPublicIpAccountIds) {
    this.privateIpsLinkPublicIpAccountIds = privateIpsLinkPublicIpAccountIds;
  }


  public FiltersNic privateIpsLinkPublicIpPublicIps(List<String> privateIpsLinkPublicIpPublicIps) {
    
    this.privateIpsLinkPublicIpPublicIps = privateIpsLinkPublicIpPublicIps;
    return this;
  }

  public FiltersNic addPrivateIpsLinkPublicIpPublicIpsItem(String privateIpsLinkPublicIpPublicIpsItem) {
    if (this.privateIpsLinkPublicIpPublicIps == null) {
      this.privateIpsLinkPublicIpPublicIps = new ArrayList<String>();
    }
    this.privateIpsLinkPublicIpPublicIps.add(privateIpsLinkPublicIpPublicIpsItem);
    return this;
  }

   /**
   * The public IPs associated with the private IPs.
   * @return privateIpsLinkPublicIpPublicIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The public IPs associated with the private IPs.")

  public List<String> getPrivateIpsLinkPublicIpPublicIps() {
    return privateIpsLinkPublicIpPublicIps;
  }


  public void setPrivateIpsLinkPublicIpPublicIps(List<String> privateIpsLinkPublicIpPublicIps) {
    this.privateIpsLinkPublicIpPublicIps = privateIpsLinkPublicIpPublicIps;
  }


  public FiltersNic privateIpsPrimaryIp(Boolean privateIpsPrimaryIp) {
    
    this.privateIpsPrimaryIp = privateIpsPrimaryIp;
    return this;
  }

   /**
   * Whether the private IP is the primary IP associated with the NIC.
   * @return privateIpsPrimaryIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the private IP is the primary IP associated with the NIC.")

  public Boolean getPrivateIpsPrimaryIp() {
    return privateIpsPrimaryIp;
  }


  public void setPrivateIpsPrimaryIp(Boolean privateIpsPrimaryIp) {
    this.privateIpsPrimaryIp = privateIpsPrimaryIp;
  }


  public FiltersNic privateIpsPrivateIps(List<String> privateIpsPrivateIps) {
    
    this.privateIpsPrivateIps = privateIpsPrivateIps;
    return this;
  }

  public FiltersNic addPrivateIpsPrivateIpsItem(String privateIpsPrivateIpsItem) {
    if (this.privateIpsPrivateIps == null) {
      this.privateIpsPrivateIps = new ArrayList<String>();
    }
    this.privateIpsPrivateIps.add(privateIpsPrivateIpsItem);
    return this;
  }

   /**
   * The private IPs of the NICs.
   * @return privateIpsPrivateIps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The private IPs of the NICs.")

  public List<String> getPrivateIpsPrivateIps() {
    return privateIpsPrivateIps;
  }


  public void setPrivateIpsPrivateIps(List<String> privateIpsPrivateIps) {
    this.privateIpsPrivateIps = privateIpsPrivateIps;
  }


  public FiltersNic securityGroupIds(List<String> securityGroupIds) {
    
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public FiltersNic addSecurityGroupIdsItem(String securityGroupIdsItem) {
    if (this.securityGroupIds == null) {
      this.securityGroupIds = new ArrayList<String>();
    }
    this.securityGroupIds.add(securityGroupIdsItem);
    return this;
  }

   /**
   * The IDs of the security groups associated with the NICs.
   * @return securityGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the security groups associated with the NICs.")

  public List<String> getSecurityGroupIds() {
    return securityGroupIds;
  }


  public void setSecurityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }


  public FiltersNic securityGroupNames(List<String> securityGroupNames) {
    
    this.securityGroupNames = securityGroupNames;
    return this;
  }

  public FiltersNic addSecurityGroupNamesItem(String securityGroupNamesItem) {
    if (this.securityGroupNames == null) {
      this.securityGroupNames = new ArrayList<String>();
    }
    this.securityGroupNames.add(securityGroupNamesItem);
    return this;
  }

   /**
   * The names of the security groups associated with the NICs.
   * @return securityGroupNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The names of the security groups associated with the NICs.")

  public List<String> getSecurityGroupNames() {
    return securityGroupNames;
  }


  public void setSecurityGroupNames(List<String> securityGroupNames) {
    this.securityGroupNames = securityGroupNames;
  }


  public FiltersNic states(List<String> states) {
    
    this.states = states;
    return this;
  }

  public FiltersNic addStatesItem(String statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<String>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * The states of the NICs.
   * @return states
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The states of the NICs.")

  public List<String> getStates() {
    return states;
  }


  public void setStates(List<String> states) {
    this.states = states;
  }


  public FiltersNic subnetIds(List<String> subnetIds) {
    
    this.subnetIds = subnetIds;
    return this;
  }

  public FiltersNic addSubnetIdsItem(String subnetIdsItem) {
    if (this.subnetIds == null) {
      this.subnetIds = new ArrayList<String>();
    }
    this.subnetIds.add(subnetIdsItem);
    return this;
  }

   /**
   * The IDs of the Subnets for the NICs.
   * @return subnetIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the Subnets for the NICs.")

  public List<String> getSubnetIds() {
    return subnetIds;
  }


  public void setSubnetIds(List<String> subnetIds) {
    this.subnetIds = subnetIds;
  }


  public FiltersNic subregionNames(List<String> subregionNames) {
    
    this.subregionNames = subregionNames;
    return this;
  }

  public FiltersNic addSubregionNamesItem(String subregionNamesItem) {
    if (this.subregionNames == null) {
      this.subregionNames = new ArrayList<String>();
    }
    this.subregionNames.add(subregionNamesItem);
    return this;
  }

   /**
   * The Subregions where the NICs are located.
   * @return subregionNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Subregions where the NICs are located.")

  public List<String> getSubregionNames() {
    return subregionNames;
  }


  public void setSubregionNames(List<String> subregionNames) {
    this.subregionNames = subregionNames;
  }


  public FiltersNic tagKeys(List<String> tagKeys) {
    
    this.tagKeys = tagKeys;
    return this;
  }

  public FiltersNic addTagKeysItem(String tagKeysItem) {
    if (this.tagKeys == null) {
      this.tagKeys = new ArrayList<String>();
    }
    this.tagKeys.add(tagKeysItem);
    return this;
  }

   /**
   * The keys of the tags associated with the NICs.
   * @return tagKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The keys of the tags associated with the NICs.")

  public List<String> getTagKeys() {
    return tagKeys;
  }


  public void setTagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
  }


  public FiltersNic tagValues(List<String> tagValues) {
    
    this.tagValues = tagValues;
    return this;
  }

  public FiltersNic addTagValuesItem(String tagValuesItem) {
    if (this.tagValues == null) {
      this.tagValues = new ArrayList<String>();
    }
    this.tagValues.add(tagValuesItem);
    return this;
  }

   /**
   * The values of the tags associated with the NICs.
   * @return tagValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The values of the tags associated with the NICs.")

  public List<String> getTagValues() {
    return tagValues;
  }


  public void setTagValues(List<String> tagValues) {
    this.tagValues = tagValues;
  }


  public FiltersNic tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public FiltersNic addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The key/value combination of the tags associated with the NICs, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key/value combination of the tags associated with the NICs, in the following format: &quot;Filters&quot;:{&quot;Tags&quot;:[&quot;TAGKEY=TAGVALUE&quot;]}.")

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
    FiltersNic filtersNic = (FiltersNic) o;
    return Objects.equals(this.descriptions, filtersNic.descriptions) &&
        Objects.equals(this.isSourceDestCheck, filtersNic.isSourceDestCheck) &&
        Objects.equals(this.linkNicDeleteOnVmDeletion, filtersNic.linkNicDeleteOnVmDeletion) &&
        Objects.equals(this.linkNicDeviceNumbers, filtersNic.linkNicDeviceNumbers) &&
        Objects.equals(this.linkNicLinkNicIds, filtersNic.linkNicLinkNicIds) &&
        Objects.equals(this.linkNicStates, filtersNic.linkNicStates) &&
        Objects.equals(this.linkNicVmAccountIds, filtersNic.linkNicVmAccountIds) &&
        Objects.equals(this.linkNicVmIds, filtersNic.linkNicVmIds) &&
        Objects.equals(this.linkPublicIpAccountIds, filtersNic.linkPublicIpAccountIds) &&
        Objects.equals(this.linkPublicIpLinkPublicIpIds, filtersNic.linkPublicIpLinkPublicIpIds) &&
        Objects.equals(this.linkPublicIpPublicIpIds, filtersNic.linkPublicIpPublicIpIds) &&
        Objects.equals(this.linkPublicIpPublicIps, filtersNic.linkPublicIpPublicIps) &&
        Objects.equals(this.macAddresses, filtersNic.macAddresses) &&
        Objects.equals(this.netIds, filtersNic.netIds) &&
        Objects.equals(this.nicIds, filtersNic.nicIds) &&
        Objects.equals(this.privateDnsNames, filtersNic.privateDnsNames) &&
        Objects.equals(this.privateIpsLinkPublicIpAccountIds, filtersNic.privateIpsLinkPublicIpAccountIds) &&
        Objects.equals(this.privateIpsLinkPublicIpPublicIps, filtersNic.privateIpsLinkPublicIpPublicIps) &&
        Objects.equals(this.privateIpsPrimaryIp, filtersNic.privateIpsPrimaryIp) &&
        Objects.equals(this.privateIpsPrivateIps, filtersNic.privateIpsPrivateIps) &&
        Objects.equals(this.securityGroupIds, filtersNic.securityGroupIds) &&
        Objects.equals(this.securityGroupNames, filtersNic.securityGroupNames) &&
        Objects.equals(this.states, filtersNic.states) &&
        Objects.equals(this.subnetIds, filtersNic.subnetIds) &&
        Objects.equals(this.subregionNames, filtersNic.subregionNames) &&
        Objects.equals(this.tagKeys, filtersNic.tagKeys) &&
        Objects.equals(this.tagValues, filtersNic.tagValues) &&
        Objects.equals(this.tags, filtersNic.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptions, isSourceDestCheck, linkNicDeleteOnVmDeletion, linkNicDeviceNumbers, linkNicLinkNicIds, linkNicStates, linkNicVmAccountIds, linkNicVmIds, linkPublicIpAccountIds, linkPublicIpLinkPublicIpIds, linkPublicIpPublicIpIds, linkPublicIpPublicIps, macAddresses, netIds, nicIds, privateDnsNames, privateIpsLinkPublicIpAccountIds, privateIpsLinkPublicIpPublicIps, privateIpsPrimaryIp, privateIpsPrivateIps, securityGroupIds, securityGroupNames, states, subnetIds, subregionNames, tagKeys, tagValues, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltersNic {\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    isSourceDestCheck: ").append(toIndentedString(isSourceDestCheck)).append("\n");
    sb.append("    linkNicDeleteOnVmDeletion: ").append(toIndentedString(linkNicDeleteOnVmDeletion)).append("\n");
    sb.append("    linkNicDeviceNumbers: ").append(toIndentedString(linkNicDeviceNumbers)).append("\n");
    sb.append("    linkNicLinkNicIds: ").append(toIndentedString(linkNicLinkNicIds)).append("\n");
    sb.append("    linkNicStates: ").append(toIndentedString(linkNicStates)).append("\n");
    sb.append("    linkNicVmAccountIds: ").append(toIndentedString(linkNicVmAccountIds)).append("\n");
    sb.append("    linkNicVmIds: ").append(toIndentedString(linkNicVmIds)).append("\n");
    sb.append("    linkPublicIpAccountIds: ").append(toIndentedString(linkPublicIpAccountIds)).append("\n");
    sb.append("    linkPublicIpLinkPublicIpIds: ").append(toIndentedString(linkPublicIpLinkPublicIpIds)).append("\n");
    sb.append("    linkPublicIpPublicIpIds: ").append(toIndentedString(linkPublicIpPublicIpIds)).append("\n");
    sb.append("    linkPublicIpPublicIps: ").append(toIndentedString(linkPublicIpPublicIps)).append("\n");
    sb.append("    macAddresses: ").append(toIndentedString(macAddresses)).append("\n");
    sb.append("    netIds: ").append(toIndentedString(netIds)).append("\n");
    sb.append("    nicIds: ").append(toIndentedString(nicIds)).append("\n");
    sb.append("    privateDnsNames: ").append(toIndentedString(privateDnsNames)).append("\n");
    sb.append("    privateIpsLinkPublicIpAccountIds: ").append(toIndentedString(privateIpsLinkPublicIpAccountIds)).append("\n");
    sb.append("    privateIpsLinkPublicIpPublicIps: ").append(toIndentedString(privateIpsLinkPublicIpPublicIps)).append("\n");
    sb.append("    privateIpsPrimaryIp: ").append(toIndentedString(privateIpsPrimaryIp)).append("\n");
    sb.append("    privateIpsPrivateIps: ").append(toIndentedString(privateIpsPrivateIps)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
    sb.append("    securityGroupNames: ").append(toIndentedString(securityGroupNames)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    subnetIds: ").append(toIndentedString(subnetIds)).append("\n");
    sb.append("    subregionNames: ").append(toIndentedString(subregionNames)).append("\n");
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


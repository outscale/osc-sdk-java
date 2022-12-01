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
public class FiltersRouteTable {
  public static final String SERIALIZED_NAME_LINK_ROUTE_TABLE_IDS = "LinkRouteTableIds";
  @SerializedName(SERIALIZED_NAME_LINK_ROUTE_TABLE_IDS)
  private List<String> linkRouteTableIds = null;

  public static final String SERIALIZED_NAME_LINK_ROUTE_TABLE_LINK_ROUTE_TABLE_IDS = "LinkRouteTableLinkRouteTableIds";
  @SerializedName(SERIALIZED_NAME_LINK_ROUTE_TABLE_LINK_ROUTE_TABLE_IDS)
  private List<String> linkRouteTableLinkRouteTableIds = null;

  public static final String SERIALIZED_NAME_LINK_ROUTE_TABLE_MAIN = "LinkRouteTableMain";
  @SerializedName(SERIALIZED_NAME_LINK_ROUTE_TABLE_MAIN)
  private Boolean linkRouteTableMain;

  public static final String SERIALIZED_NAME_LINK_SUBNET_IDS = "LinkSubnetIds";
  @SerializedName(SERIALIZED_NAME_LINK_SUBNET_IDS)
  private List<String> linkSubnetIds = null;

  public static final String SERIALIZED_NAME_NET_IDS = "NetIds";
  @SerializedName(SERIALIZED_NAME_NET_IDS)
  private List<String> netIds = null;

  public static final String SERIALIZED_NAME_ROUTE_CREATION_METHODS = "RouteCreationMethods";
  @SerializedName(SERIALIZED_NAME_ROUTE_CREATION_METHODS)
  private List<String> routeCreationMethods = null;

  public static final String SERIALIZED_NAME_ROUTE_DESTINATION_IP_RANGES = "RouteDestinationIpRanges";
  @SerializedName(SERIALIZED_NAME_ROUTE_DESTINATION_IP_RANGES)
  private List<String> routeDestinationIpRanges = null;

  public static final String SERIALIZED_NAME_ROUTE_DESTINATION_SERVICE_IDS = "RouteDestinationServiceIds";
  @SerializedName(SERIALIZED_NAME_ROUTE_DESTINATION_SERVICE_IDS)
  private List<String> routeDestinationServiceIds = null;

  public static final String SERIALIZED_NAME_ROUTE_GATEWAY_IDS = "RouteGatewayIds";
  @SerializedName(SERIALIZED_NAME_ROUTE_GATEWAY_IDS)
  private List<String> routeGatewayIds = null;

  public static final String SERIALIZED_NAME_ROUTE_NAT_SERVICE_IDS = "RouteNatServiceIds";
  @SerializedName(SERIALIZED_NAME_ROUTE_NAT_SERVICE_IDS)
  private List<String> routeNatServiceIds = null;

  public static final String SERIALIZED_NAME_ROUTE_NET_PEERING_IDS = "RouteNetPeeringIds";
  @SerializedName(SERIALIZED_NAME_ROUTE_NET_PEERING_IDS)
  private List<String> routeNetPeeringIds = null;

  public static final String SERIALIZED_NAME_ROUTE_STATES = "RouteStates";
  @SerializedName(SERIALIZED_NAME_ROUTE_STATES)
  private List<String> routeStates = null;

  public static final String SERIALIZED_NAME_ROUTE_TABLE_IDS = "RouteTableIds";
  @SerializedName(SERIALIZED_NAME_ROUTE_TABLE_IDS)
  private List<String> routeTableIds = null;

  public static final String SERIALIZED_NAME_ROUTE_VM_IDS = "RouteVmIds";
  @SerializedName(SERIALIZED_NAME_ROUTE_VM_IDS)
  private List<String> routeVmIds = null;

  public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";
  @SerializedName(SERIALIZED_NAME_TAG_KEYS)
  private List<String> tagKeys = null;

  public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";
  @SerializedName(SERIALIZED_NAME_TAG_VALUES)
  private List<String> tagValues = null;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;


  public FiltersRouteTable linkRouteTableIds(List<String> linkRouteTableIds) {
    
    this.linkRouteTableIds = linkRouteTableIds;
    return this;
  }

  public FiltersRouteTable addLinkRouteTableIdsItem(String linkRouteTableIdsItem) {
    if (this.linkRouteTableIds == null) {
      this.linkRouteTableIds = new ArrayList<String>();
    }
    this.linkRouteTableIds.add(linkRouteTableIdsItem);
    return this;
  }

   /**
   * The IDs of the route tables involved in the associations.
   * @return linkRouteTableIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the route tables involved in the associations.")

  public List<String> getLinkRouteTableIds() {
    return linkRouteTableIds;
  }


  public void setLinkRouteTableIds(List<String> linkRouteTableIds) {
    this.linkRouteTableIds = linkRouteTableIds;
  }


  public FiltersRouteTable linkRouteTableLinkRouteTableIds(List<String> linkRouteTableLinkRouteTableIds) {
    
    this.linkRouteTableLinkRouteTableIds = linkRouteTableLinkRouteTableIds;
    return this;
  }

  public FiltersRouteTable addLinkRouteTableLinkRouteTableIdsItem(String linkRouteTableLinkRouteTableIdsItem) {
    if (this.linkRouteTableLinkRouteTableIds == null) {
      this.linkRouteTableLinkRouteTableIds = new ArrayList<String>();
    }
    this.linkRouteTableLinkRouteTableIds.add(linkRouteTableLinkRouteTableIdsItem);
    return this;
  }

   /**
   * The IDs of the associations between the route tables and the Subnets.
   * @return linkRouteTableLinkRouteTableIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the associations between the route tables and the Subnets.")

  public List<String> getLinkRouteTableLinkRouteTableIds() {
    return linkRouteTableLinkRouteTableIds;
  }


  public void setLinkRouteTableLinkRouteTableIds(List<String> linkRouteTableLinkRouteTableIds) {
    this.linkRouteTableLinkRouteTableIds = linkRouteTableLinkRouteTableIds;
  }


  public FiltersRouteTable linkRouteTableMain(Boolean linkRouteTableMain) {
    
    this.linkRouteTableMain = linkRouteTableMain;
    return this;
  }

   /**
   * If true, the route tables are the main ones for their Nets.
   * @return linkRouteTableMain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the route tables are the main ones for their Nets.")

  public Boolean getLinkRouteTableMain() {
    return linkRouteTableMain;
  }


  public void setLinkRouteTableMain(Boolean linkRouteTableMain) {
    this.linkRouteTableMain = linkRouteTableMain;
  }


  public FiltersRouteTable linkSubnetIds(List<String> linkSubnetIds) {
    
    this.linkSubnetIds = linkSubnetIds;
    return this;
  }

  public FiltersRouteTable addLinkSubnetIdsItem(String linkSubnetIdsItem) {
    if (this.linkSubnetIds == null) {
      this.linkSubnetIds = new ArrayList<String>();
    }
    this.linkSubnetIds.add(linkSubnetIdsItem);
    return this;
  }

   /**
   * The IDs of the Subnets involved in the associations.
   * @return linkSubnetIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the Subnets involved in the associations.")

  public List<String> getLinkSubnetIds() {
    return linkSubnetIds;
  }


  public void setLinkSubnetIds(List<String> linkSubnetIds) {
    this.linkSubnetIds = linkSubnetIds;
  }


  public FiltersRouteTable netIds(List<String> netIds) {
    
    this.netIds = netIds;
    return this;
  }

  public FiltersRouteTable addNetIdsItem(String netIdsItem) {
    if (this.netIds == null) {
      this.netIds = new ArrayList<String>();
    }
    this.netIds.add(netIdsItem);
    return this;
  }

   /**
   * The IDs of the Nets for the route tables.
   * @return netIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the Nets for the route tables.")

  public List<String> getNetIds() {
    return netIds;
  }


  public void setNetIds(List<String> netIds) {
    this.netIds = netIds;
  }


  public FiltersRouteTable routeCreationMethods(List<String> routeCreationMethods) {
    
    this.routeCreationMethods = routeCreationMethods;
    return this;
  }

  public FiltersRouteTable addRouteCreationMethodsItem(String routeCreationMethodsItem) {
    if (this.routeCreationMethods == null) {
      this.routeCreationMethods = new ArrayList<String>();
    }
    this.routeCreationMethods.add(routeCreationMethodsItem);
    return this;
  }

   /**
   * The methods used to create a route.
   * @return routeCreationMethods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The methods used to create a route.")

  public List<String> getRouteCreationMethods() {
    return routeCreationMethods;
  }


  public void setRouteCreationMethods(List<String> routeCreationMethods) {
    this.routeCreationMethods = routeCreationMethods;
  }


  public FiltersRouteTable routeDestinationIpRanges(List<String> routeDestinationIpRanges) {
    
    this.routeDestinationIpRanges = routeDestinationIpRanges;
    return this;
  }

  public FiltersRouteTable addRouteDestinationIpRangesItem(String routeDestinationIpRangesItem) {
    if (this.routeDestinationIpRanges == null) {
      this.routeDestinationIpRanges = new ArrayList<String>();
    }
    this.routeDestinationIpRanges.add(routeDestinationIpRangesItem);
    return this;
  }

   /**
   * The IP ranges specified in routes in the tables.
   * @return routeDestinationIpRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP ranges specified in routes in the tables.")

  public List<String> getRouteDestinationIpRanges() {
    return routeDestinationIpRanges;
  }


  public void setRouteDestinationIpRanges(List<String> routeDestinationIpRanges) {
    this.routeDestinationIpRanges = routeDestinationIpRanges;
  }


  public FiltersRouteTable routeDestinationServiceIds(List<String> routeDestinationServiceIds) {
    
    this.routeDestinationServiceIds = routeDestinationServiceIds;
    return this;
  }

  public FiltersRouteTable addRouteDestinationServiceIdsItem(String routeDestinationServiceIdsItem) {
    if (this.routeDestinationServiceIds == null) {
      this.routeDestinationServiceIds = new ArrayList<String>();
    }
    this.routeDestinationServiceIds.add(routeDestinationServiceIdsItem);
    return this;
  }

   /**
   * The service IDs specified in routes in the tables.
   * @return routeDestinationServiceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The service IDs specified in routes in the tables.")

  public List<String> getRouteDestinationServiceIds() {
    return routeDestinationServiceIds;
  }


  public void setRouteDestinationServiceIds(List<String> routeDestinationServiceIds) {
    this.routeDestinationServiceIds = routeDestinationServiceIds;
  }


  public FiltersRouteTable routeGatewayIds(List<String> routeGatewayIds) {
    
    this.routeGatewayIds = routeGatewayIds;
    return this;
  }

  public FiltersRouteTable addRouteGatewayIdsItem(String routeGatewayIdsItem) {
    if (this.routeGatewayIds == null) {
      this.routeGatewayIds = new ArrayList<String>();
    }
    this.routeGatewayIds.add(routeGatewayIdsItem);
    return this;
  }

   /**
   * The IDs of the gateways specified in routes in the tables.
   * @return routeGatewayIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the gateways specified in routes in the tables.")

  public List<String> getRouteGatewayIds() {
    return routeGatewayIds;
  }


  public void setRouteGatewayIds(List<String> routeGatewayIds) {
    this.routeGatewayIds = routeGatewayIds;
  }


  public FiltersRouteTable routeNatServiceIds(List<String> routeNatServiceIds) {
    
    this.routeNatServiceIds = routeNatServiceIds;
    return this;
  }

  public FiltersRouteTable addRouteNatServiceIdsItem(String routeNatServiceIdsItem) {
    if (this.routeNatServiceIds == null) {
      this.routeNatServiceIds = new ArrayList<String>();
    }
    this.routeNatServiceIds.add(routeNatServiceIdsItem);
    return this;
  }

   /**
   * The IDs of the NAT services specified in routes in the tables.
   * @return routeNatServiceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the NAT services specified in routes in the tables.")

  public List<String> getRouteNatServiceIds() {
    return routeNatServiceIds;
  }


  public void setRouteNatServiceIds(List<String> routeNatServiceIds) {
    this.routeNatServiceIds = routeNatServiceIds;
  }


  public FiltersRouteTable routeNetPeeringIds(List<String> routeNetPeeringIds) {
    
    this.routeNetPeeringIds = routeNetPeeringIds;
    return this;
  }

  public FiltersRouteTable addRouteNetPeeringIdsItem(String routeNetPeeringIdsItem) {
    if (this.routeNetPeeringIds == null) {
      this.routeNetPeeringIds = new ArrayList<String>();
    }
    this.routeNetPeeringIds.add(routeNetPeeringIdsItem);
    return this;
  }

   /**
   * The IDs of the Net peerings specified in routes in the tables.
   * @return routeNetPeeringIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the Net peerings specified in routes in the tables.")

  public List<String> getRouteNetPeeringIds() {
    return routeNetPeeringIds;
  }


  public void setRouteNetPeeringIds(List<String> routeNetPeeringIds) {
    this.routeNetPeeringIds = routeNetPeeringIds;
  }


  public FiltersRouteTable routeStates(List<String> routeStates) {
    
    this.routeStates = routeStates;
    return this;
  }

  public FiltersRouteTable addRouteStatesItem(String routeStatesItem) {
    if (this.routeStates == null) {
      this.routeStates = new ArrayList<String>();
    }
    this.routeStates.add(routeStatesItem);
    return this;
  }

   /**
   * The states of routes in the route tables (always &#x60;active&#x60;).
   * @return routeStates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The states of routes in the route tables (always `active`).")

  public List<String> getRouteStates() {
    return routeStates;
  }


  public void setRouteStates(List<String> routeStates) {
    this.routeStates = routeStates;
  }


  public FiltersRouteTable routeTableIds(List<String> routeTableIds) {
    
    this.routeTableIds = routeTableIds;
    return this;
  }

  public FiltersRouteTable addRouteTableIdsItem(String routeTableIdsItem) {
    if (this.routeTableIds == null) {
      this.routeTableIds = new ArrayList<String>();
    }
    this.routeTableIds.add(routeTableIdsItem);
    return this;
  }

   /**
   * The IDs of the route tables.
   * @return routeTableIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the route tables.")

  public List<String> getRouteTableIds() {
    return routeTableIds;
  }


  public void setRouteTableIds(List<String> routeTableIds) {
    this.routeTableIds = routeTableIds;
  }


  public FiltersRouteTable routeVmIds(List<String> routeVmIds) {
    
    this.routeVmIds = routeVmIds;
    return this;
  }

  public FiltersRouteTable addRouteVmIdsItem(String routeVmIdsItem) {
    if (this.routeVmIds == null) {
      this.routeVmIds = new ArrayList<String>();
    }
    this.routeVmIds.add(routeVmIdsItem);
    return this;
  }

   /**
   * The IDs of the VMs specified in routes in the tables.
   * @return routeVmIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the VMs specified in routes in the tables.")

  public List<String> getRouteVmIds() {
    return routeVmIds;
  }


  public void setRouteVmIds(List<String> routeVmIds) {
    this.routeVmIds = routeVmIds;
  }


  public FiltersRouteTable tagKeys(List<String> tagKeys) {
    
    this.tagKeys = tagKeys;
    return this;
  }

  public FiltersRouteTable addTagKeysItem(String tagKeysItem) {
    if (this.tagKeys == null) {
      this.tagKeys = new ArrayList<String>();
    }
    this.tagKeys.add(tagKeysItem);
    return this;
  }

   /**
   * The keys of the tags associated with the route tables.
   * @return tagKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The keys of the tags associated with the route tables.")

  public List<String> getTagKeys() {
    return tagKeys;
  }


  public void setTagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
  }


  public FiltersRouteTable tagValues(List<String> tagValues) {
    
    this.tagValues = tagValues;
    return this;
  }

  public FiltersRouteTable addTagValuesItem(String tagValuesItem) {
    if (this.tagValues == null) {
      this.tagValues = new ArrayList<String>();
    }
    this.tagValues.add(tagValuesItem);
    return this;
  }

   /**
   * The values of the tags associated with the route tables.
   * @return tagValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The values of the tags associated with the route tables.")

  public List<String> getTagValues() {
    return tagValues;
  }


  public void setTagValues(List<String> tagValues) {
    this.tagValues = tagValues;
  }


  public FiltersRouteTable tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public FiltersRouteTable addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The key/value combination of the tags associated with the route tables, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key/value combination of the tags associated with the route tables, in the following format: &quot;Filters&quot;:{&quot;Tags&quot;:[&quot;TAGKEY=TAGVALUE&quot;]}.")

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
    FiltersRouteTable filtersRouteTable = (FiltersRouteTable) o;
    return Objects.equals(this.linkRouteTableIds, filtersRouteTable.linkRouteTableIds) &&
        Objects.equals(this.linkRouteTableLinkRouteTableIds, filtersRouteTable.linkRouteTableLinkRouteTableIds) &&
        Objects.equals(this.linkRouteTableMain, filtersRouteTable.linkRouteTableMain) &&
        Objects.equals(this.linkSubnetIds, filtersRouteTable.linkSubnetIds) &&
        Objects.equals(this.netIds, filtersRouteTable.netIds) &&
        Objects.equals(this.routeCreationMethods, filtersRouteTable.routeCreationMethods) &&
        Objects.equals(this.routeDestinationIpRanges, filtersRouteTable.routeDestinationIpRanges) &&
        Objects.equals(this.routeDestinationServiceIds, filtersRouteTable.routeDestinationServiceIds) &&
        Objects.equals(this.routeGatewayIds, filtersRouteTable.routeGatewayIds) &&
        Objects.equals(this.routeNatServiceIds, filtersRouteTable.routeNatServiceIds) &&
        Objects.equals(this.routeNetPeeringIds, filtersRouteTable.routeNetPeeringIds) &&
        Objects.equals(this.routeStates, filtersRouteTable.routeStates) &&
        Objects.equals(this.routeTableIds, filtersRouteTable.routeTableIds) &&
        Objects.equals(this.routeVmIds, filtersRouteTable.routeVmIds) &&
        Objects.equals(this.tagKeys, filtersRouteTable.tagKeys) &&
        Objects.equals(this.tagValues, filtersRouteTable.tagValues) &&
        Objects.equals(this.tags, filtersRouteTable.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkRouteTableIds, linkRouteTableLinkRouteTableIds, linkRouteTableMain, linkSubnetIds, netIds, routeCreationMethods, routeDestinationIpRanges, routeDestinationServiceIds, routeGatewayIds, routeNatServiceIds, routeNetPeeringIds, routeStates, routeTableIds, routeVmIds, tagKeys, tagValues, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltersRouteTable {\n");
    sb.append("    linkRouteTableIds: ").append(toIndentedString(linkRouteTableIds)).append("\n");
    sb.append("    linkRouteTableLinkRouteTableIds: ").append(toIndentedString(linkRouteTableLinkRouteTableIds)).append("\n");
    sb.append("    linkRouteTableMain: ").append(toIndentedString(linkRouteTableMain)).append("\n");
    sb.append("    linkSubnetIds: ").append(toIndentedString(linkSubnetIds)).append("\n");
    sb.append("    netIds: ").append(toIndentedString(netIds)).append("\n");
    sb.append("    routeCreationMethods: ").append(toIndentedString(routeCreationMethods)).append("\n");
    sb.append("    routeDestinationIpRanges: ").append(toIndentedString(routeDestinationIpRanges)).append("\n");
    sb.append("    routeDestinationServiceIds: ").append(toIndentedString(routeDestinationServiceIds)).append("\n");
    sb.append("    routeGatewayIds: ").append(toIndentedString(routeGatewayIds)).append("\n");
    sb.append("    routeNatServiceIds: ").append(toIndentedString(routeNatServiceIds)).append("\n");
    sb.append("    routeNetPeeringIds: ").append(toIndentedString(routeNetPeeringIds)).append("\n");
    sb.append("    routeStates: ").append(toIndentedString(routeStates)).append("\n");
    sb.append("    routeTableIds: ").append(toIndentedString(routeTableIds)).append("\n");
    sb.append("    routeVmIds: ").append(toIndentedString(routeVmIds)).append("\n");
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


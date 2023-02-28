/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.25
 * Contact: support@outscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.outscale.osc_sdk_java.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.outscale.osc_sdk_java.client.JSON;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** One or more filters. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiltersRouteTable {
    public static final String SERIALIZED_NAME_LINK_ROUTE_TABLE_IDS = "LinkRouteTableIds";

    @SerializedName(SERIALIZED_NAME_LINK_ROUTE_TABLE_IDS)
    private List<String> linkRouteTableIds = null;

    public static final String SERIALIZED_NAME_LINK_ROUTE_TABLE_LINK_ROUTE_TABLE_IDS =
            "LinkRouteTableLinkRouteTableIds";

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

    public static final String SERIALIZED_NAME_ROUTE_DESTINATION_IP_RANGES =
            "RouteDestinationIpRanges";

    @SerializedName(SERIALIZED_NAME_ROUTE_DESTINATION_IP_RANGES)
    private List<String> routeDestinationIpRanges = null;

    public static final String SERIALIZED_NAME_ROUTE_DESTINATION_SERVICE_IDS =
            "RouteDestinationServiceIds";

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

    public FiltersRouteTable() {}

    public FiltersRouteTable linkRouteTableIds(List<String> linkRouteTableIds) {

        this.linkRouteTableIds = linkRouteTableIds;
        return this;
    }

    public FiltersRouteTable addLinkRouteTableIdsItem(String linkRouteTableIdsItem) {
        if (this.linkRouteTableIds == null) {
            this.linkRouteTableIds = new ArrayList<>();
        }
        this.linkRouteTableIds.add(linkRouteTableIdsItem);
        return this;
    }

    /**
     * The IDs of the route tables involved in the associations.
     *
     * @return linkRouteTableIds
     */
    @javax.annotation.Nullable
    public List<String> getLinkRouteTableIds() {
        return linkRouteTableIds;
    }

    public void setLinkRouteTableIds(List<String> linkRouteTableIds) {
        this.linkRouteTableIds = linkRouteTableIds;
    }

    public FiltersRouteTable linkRouteTableLinkRouteTableIds(
            List<String> linkRouteTableLinkRouteTableIds) {

        this.linkRouteTableLinkRouteTableIds = linkRouteTableLinkRouteTableIds;
        return this;
    }

    public FiltersRouteTable addLinkRouteTableLinkRouteTableIdsItem(
            String linkRouteTableLinkRouteTableIdsItem) {
        if (this.linkRouteTableLinkRouteTableIds == null) {
            this.linkRouteTableLinkRouteTableIds = new ArrayList<>();
        }
        this.linkRouteTableLinkRouteTableIds.add(linkRouteTableLinkRouteTableIdsItem);
        return this;
    }

    /**
     * The IDs of the associations between the route tables and the Subnets.
     *
     * @return linkRouteTableLinkRouteTableIds
     */
    @javax.annotation.Nullable
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
     *
     * @return linkRouteTableMain
     */
    @javax.annotation.Nullable
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
            this.linkSubnetIds = new ArrayList<>();
        }
        this.linkSubnetIds.add(linkSubnetIdsItem);
        return this;
    }

    /**
     * The IDs of the Subnets involved in the associations.
     *
     * @return linkSubnetIds
     */
    @javax.annotation.Nullable
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
            this.netIds = new ArrayList<>();
        }
        this.netIds.add(netIdsItem);
        return this;
    }

    /**
     * The IDs of the Nets for the route tables.
     *
     * @return netIds
     */
    @javax.annotation.Nullable
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
            this.routeCreationMethods = new ArrayList<>();
        }
        this.routeCreationMethods.add(routeCreationMethodsItem);
        return this;
    }

    /**
     * The methods used to create a route.
     *
     * @return routeCreationMethods
     */
    @javax.annotation.Nullable
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
            this.routeDestinationIpRanges = new ArrayList<>();
        }
        this.routeDestinationIpRanges.add(routeDestinationIpRangesItem);
        return this;
    }

    /**
     * The IP ranges specified in routes in the tables.
     *
     * @return routeDestinationIpRanges
     */
    @javax.annotation.Nullable
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

    public FiltersRouteTable addRouteDestinationServiceIdsItem(
            String routeDestinationServiceIdsItem) {
        if (this.routeDestinationServiceIds == null) {
            this.routeDestinationServiceIds = new ArrayList<>();
        }
        this.routeDestinationServiceIds.add(routeDestinationServiceIdsItem);
        return this;
    }

    /**
     * The service IDs specified in routes in the tables.
     *
     * @return routeDestinationServiceIds
     */
    @javax.annotation.Nullable
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
            this.routeGatewayIds = new ArrayList<>();
        }
        this.routeGatewayIds.add(routeGatewayIdsItem);
        return this;
    }

    /**
     * The IDs of the gateways specified in routes in the tables.
     *
     * @return routeGatewayIds
     */
    @javax.annotation.Nullable
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
            this.routeNatServiceIds = new ArrayList<>();
        }
        this.routeNatServiceIds.add(routeNatServiceIdsItem);
        return this;
    }

    /**
     * The IDs of the NAT services specified in routes in the tables.
     *
     * @return routeNatServiceIds
     */
    @javax.annotation.Nullable
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
            this.routeNetPeeringIds = new ArrayList<>();
        }
        this.routeNetPeeringIds.add(routeNetPeeringIdsItem);
        return this;
    }

    /**
     * The IDs of the Net peerings specified in routes in the tables.
     *
     * @return routeNetPeeringIds
     */
    @javax.annotation.Nullable
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
            this.routeStates = new ArrayList<>();
        }
        this.routeStates.add(routeStatesItem);
        return this;
    }

    /**
     * The states of routes in the route tables (always &#x60;active&#x60;).
     *
     * @return routeStates
     */
    @javax.annotation.Nullable
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
            this.routeTableIds = new ArrayList<>();
        }
        this.routeTableIds.add(routeTableIdsItem);
        return this;
    }

    /**
     * The IDs of the route tables.
     *
     * @return routeTableIds
     */
    @javax.annotation.Nullable
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
            this.routeVmIds = new ArrayList<>();
        }
        this.routeVmIds.add(routeVmIdsItem);
        return this;
    }

    /**
     * The IDs of the VMs specified in routes in the tables.
     *
     * @return routeVmIds
     */
    @javax.annotation.Nullable
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
            this.tagKeys = new ArrayList<>();
        }
        this.tagKeys.add(tagKeysItem);
        return this;
    }

    /**
     * The keys of the tags associated with the route tables.
     *
     * @return tagKeys
     */
    @javax.annotation.Nullable
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
            this.tagValues = new ArrayList<>();
        }
        this.tagValues.add(tagValuesItem);
        return this;
    }

    /**
     * The values of the tags associated with the route tables.
     *
     * @return tagValues
     */
    @javax.annotation.Nullable
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
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * The key/value combination of the tags associated with the route tables, in the following
     * format:
     * &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}.
     *
     * @return tags
     */
    @javax.annotation.Nullable
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
        return Objects.equals(this.linkRouteTableIds, filtersRouteTable.linkRouteTableIds)
                && Objects.equals(
                        this.linkRouteTableLinkRouteTableIds,
                        filtersRouteTable.linkRouteTableLinkRouteTableIds)
                && Objects.equals(this.linkRouteTableMain, filtersRouteTable.linkRouteTableMain)
                && Objects.equals(this.linkSubnetIds, filtersRouteTable.linkSubnetIds)
                && Objects.equals(this.netIds, filtersRouteTable.netIds)
                && Objects.equals(this.routeCreationMethods, filtersRouteTable.routeCreationMethods)
                && Objects.equals(
                        this.routeDestinationIpRanges, filtersRouteTable.routeDestinationIpRanges)
                && Objects.equals(
                        this.routeDestinationServiceIds,
                        filtersRouteTable.routeDestinationServiceIds)
                && Objects.equals(this.routeGatewayIds, filtersRouteTable.routeGatewayIds)
                && Objects.equals(this.routeNatServiceIds, filtersRouteTable.routeNatServiceIds)
                && Objects.equals(this.routeNetPeeringIds, filtersRouteTable.routeNetPeeringIds)
                && Objects.equals(this.routeStates, filtersRouteTable.routeStates)
                && Objects.equals(this.routeTableIds, filtersRouteTable.routeTableIds)
                && Objects.equals(this.routeVmIds, filtersRouteTable.routeVmIds)
                && Objects.equals(this.tagKeys, filtersRouteTable.tagKeys)
                && Objects.equals(this.tagValues, filtersRouteTable.tagValues)
                && Objects.equals(this.tags, filtersRouteTable.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                linkRouteTableIds,
                linkRouteTableLinkRouteTableIds,
                linkRouteTableMain,
                linkSubnetIds,
                netIds,
                routeCreationMethods,
                routeDestinationIpRanges,
                routeDestinationServiceIds,
                routeGatewayIds,
                routeNatServiceIds,
                routeNetPeeringIds,
                routeStates,
                routeTableIds,
                routeVmIds,
                tagKeys,
                tagValues,
                tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersRouteTable {\n");
        sb.append("    linkRouteTableIds: ")
                .append(toIndentedString(linkRouteTableIds))
                .append("\n");
        sb.append("    linkRouteTableLinkRouteTableIds: ")
                .append(toIndentedString(linkRouteTableLinkRouteTableIds))
                .append("\n");
        sb.append("    linkRouteTableMain: ")
                .append(toIndentedString(linkRouteTableMain))
                .append("\n");
        sb.append("    linkSubnetIds: ").append(toIndentedString(linkSubnetIds)).append("\n");
        sb.append("    netIds: ").append(toIndentedString(netIds)).append("\n");
        sb.append("    routeCreationMethods: ")
                .append(toIndentedString(routeCreationMethods))
                .append("\n");
        sb.append("    routeDestinationIpRanges: ")
                .append(toIndentedString(routeDestinationIpRanges))
                .append("\n");
        sb.append("    routeDestinationServiceIds: ")
                .append(toIndentedString(routeDestinationServiceIds))
                .append("\n");
        sb.append("    routeGatewayIds: ").append(toIndentedString(routeGatewayIds)).append("\n");
        sb.append("    routeNatServiceIds: ")
                .append(toIndentedString(routeNatServiceIds))
                .append("\n");
        sb.append("    routeNetPeeringIds: ")
                .append(toIndentedString(routeNetPeeringIds))
                .append("\n");
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
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("LinkRouteTableIds");
        openapiFields.add("LinkRouteTableLinkRouteTableIds");
        openapiFields.add("LinkRouteTableMain");
        openapiFields.add("LinkSubnetIds");
        openapiFields.add("NetIds");
        openapiFields.add("RouteCreationMethods");
        openapiFields.add("RouteDestinationIpRanges");
        openapiFields.add("RouteDestinationServiceIds");
        openapiFields.add("RouteGatewayIds");
        openapiFields.add("RouteNatServiceIds");
        openapiFields.add("RouteNetPeeringIds");
        openapiFields.add("RouteStates");
        openapiFields.add("RouteTableIds");
        openapiFields.add("RouteVmIds");
        openapiFields.add("TagKeys");
        openapiFields.add("TagValues");
        openapiFields.add("Tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersRouteTable
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersRouteTable.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersRouteTable is not found in the"
                                        + " empty JSON string",
                                FiltersRouteTable.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersRouteTable.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersRouteTable` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("LinkRouteTableIds") != null
                && !jsonObj.get("LinkRouteTableIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LinkRouteTableIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("LinkRouteTableIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("LinkRouteTableLinkRouteTableIds") != null
                && !jsonObj.get("LinkRouteTableLinkRouteTableIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LinkRouteTableLinkRouteTableIds` to be an array"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("LinkRouteTableLinkRouteTableIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("LinkSubnetIds") != null && !jsonObj.get("LinkSubnetIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LinkSubnetIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("LinkSubnetIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("NetIds") != null && !jsonObj.get("NetIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetIds` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("NetIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("RouteCreationMethods") != null
                && !jsonObj.get("RouteCreationMethods").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteCreationMethods` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("RouteCreationMethods").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("RouteDestinationIpRanges") != null
                && !jsonObj.get("RouteDestinationIpRanges").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteDestinationIpRanges` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("RouteDestinationIpRanges").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("RouteDestinationServiceIds") != null
                && !jsonObj.get("RouteDestinationServiceIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteDestinationServiceIds` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("RouteDestinationServiceIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("RouteGatewayIds") != null
                && !jsonObj.get("RouteGatewayIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteGatewayIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("RouteGatewayIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("RouteNatServiceIds") != null
                && !jsonObj.get("RouteNatServiceIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteNatServiceIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("RouteNatServiceIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("RouteNetPeeringIds") != null
                && !jsonObj.get("RouteNetPeeringIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteNetPeeringIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("RouteNetPeeringIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("RouteStates") != null && !jsonObj.get("RouteStates").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteStates` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("RouteStates").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("RouteTableIds") != null && !jsonObj.get("RouteTableIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteTableIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("RouteTableIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("RouteVmIds") != null && !jsonObj.get("RouteVmIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteVmIds` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("RouteVmIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("TagKeys") != null && !jsonObj.get("TagKeys").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `TagKeys` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("TagKeys").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("TagValues") != null && !jsonObj.get("TagValues").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `TagValues` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("TagValues").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Tags` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Tags").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersRouteTable.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersRouteTable' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersRouteTable> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersRouteTable.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersRouteTable>() {
                        @Override
                        public void write(JsonWriter out, FiltersRouteTable value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersRouteTable read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersRouteTable given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersRouteTable
     * @throws IOException if the JSON string is invalid with respect to FiltersRouteTable
     */
    public static FiltersRouteTable fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersRouteTable.class);
    }

    /**
     * Convert an instance of FiltersRouteTable to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

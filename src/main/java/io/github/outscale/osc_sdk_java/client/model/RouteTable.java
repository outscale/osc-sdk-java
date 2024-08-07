/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/About-the-APIs.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html).  > If you try to sign requests with an invalid access key four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages.  > If you try to sign requests with an invalid password four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).<br /> # Error Codes Reference You can learn more about errors returned by the API in the dedicated [errors page](api-errors.html).
 *
 * The version of the OpenAPI document: 1.30.0
 * Contact: support@outscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.outscale.osc_sdk_java.client.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
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

/** Information about the route table. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RouteTable {
    public static final String SERIALIZED_NAME_LINK_ROUTE_TABLES = "LinkRouteTables";

    @SerializedName(SERIALIZED_NAME_LINK_ROUTE_TABLES)
    private List<LinkRouteTable> linkRouteTables = null;

    public static final String SERIALIZED_NAME_NET_ID = "NetId";

    @SerializedName(SERIALIZED_NAME_NET_ID)
    private String netId;

    public static final String SERIALIZED_NAME_ROUTE_PROPAGATING_VIRTUAL_GATEWAYS =
            "RoutePropagatingVirtualGateways";

    @SerializedName(SERIALIZED_NAME_ROUTE_PROPAGATING_VIRTUAL_GATEWAYS)
    private List<RoutePropagatingVirtualGateway> routePropagatingVirtualGateways = null;

    public static final String SERIALIZED_NAME_ROUTE_TABLE_ID = "RouteTableId";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLE_ID)
    private String routeTableId;

    public static final String SERIALIZED_NAME_ROUTES = "Routes";

    @SerializedName(SERIALIZED_NAME_ROUTES)
    private List<Route> routes = null;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public RouteTable() {}

    public RouteTable linkRouteTables(List<LinkRouteTable> linkRouteTables) {

        this.linkRouteTables = linkRouteTables;
        return this;
    }

    public RouteTable addLinkRouteTablesItem(LinkRouteTable linkRouteTablesItem) {
        if (this.linkRouteTables == null) {
            this.linkRouteTables = new ArrayList<>();
        }
        this.linkRouteTables.add(linkRouteTablesItem);
        return this;
    }

    /**
     * One or more associations between the route table and Subnets.
     *
     * @return linkRouteTables
     */
    @javax.annotation.Nullable
    public List<LinkRouteTable> getLinkRouteTables() {
        return linkRouteTables;
    }

    public void setLinkRouteTables(List<LinkRouteTable> linkRouteTables) {
        this.linkRouteTables = linkRouteTables;
    }

    public RouteTable netId(String netId) {

        this.netId = netId;
        return this;
    }

    /**
     * The ID of the Net for the route table.
     *
     * @return netId
     */
    @javax.annotation.Nullable
    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public RouteTable routePropagatingVirtualGateways(
            List<RoutePropagatingVirtualGateway> routePropagatingVirtualGateways) {

        this.routePropagatingVirtualGateways = routePropagatingVirtualGateways;
        return this;
    }

    public RouteTable addRoutePropagatingVirtualGatewaysItem(
            RoutePropagatingVirtualGateway routePropagatingVirtualGatewaysItem) {
        if (this.routePropagatingVirtualGateways == null) {
            this.routePropagatingVirtualGateways = new ArrayList<>();
        }
        this.routePropagatingVirtualGateways.add(routePropagatingVirtualGatewaysItem);
        return this;
    }

    /**
     * Information about virtual gateways propagating routes.
     *
     * @return routePropagatingVirtualGateways
     */
    @javax.annotation.Nullable
    public List<RoutePropagatingVirtualGateway> getRoutePropagatingVirtualGateways() {
        return routePropagatingVirtualGateways;
    }

    public void setRoutePropagatingVirtualGateways(
            List<RoutePropagatingVirtualGateway> routePropagatingVirtualGateways) {
        this.routePropagatingVirtualGateways = routePropagatingVirtualGateways;
    }

    public RouteTable routeTableId(String routeTableId) {

        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * The ID of the route table.
     *
     * @return routeTableId
     */
    @javax.annotation.Nullable
    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public RouteTable routes(List<Route> routes) {

        this.routes = routes;
        return this;
    }

    public RouteTable addRoutesItem(Route routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        this.routes.add(routesItem);
        return this;
    }

    /**
     * One or more routes in the route table.
     *
     * @return routes
     */
    @javax.annotation.Nullable
    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public RouteTable tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public RouteTable addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the route table.
     *
     * @return tags
     */
    @javax.annotation.Nullable
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
        RouteTable routeTable = (RouteTable) o;
        return Objects.equals(this.linkRouteTables, routeTable.linkRouteTables)
                && Objects.equals(this.netId, routeTable.netId)
                && Objects.equals(
                        this.routePropagatingVirtualGateways,
                        routeTable.routePropagatingVirtualGateways)
                && Objects.equals(this.routeTableId, routeTable.routeTableId)
                && Objects.equals(this.routes, routeTable.routes)
                && Objects.equals(this.tags, routeTable.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                linkRouteTables,
                netId,
                routePropagatingVirtualGateways,
                routeTableId,
                routes,
                tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RouteTable {\n");
        sb.append("    linkRouteTables: ").append(toIndentedString(linkRouteTables)).append("\n");
        sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
        sb.append("    routePropagatingVirtualGateways: ")
                .append(toIndentedString(routePropagatingVirtualGateways))
                .append("\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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
        openapiFields.add("LinkRouteTables");
        openapiFields.add("NetId");
        openapiFields.add("RoutePropagatingVirtualGateways");
        openapiFields.add("RouteTableId");
        openapiFields.add("Routes");
        openapiFields.add("Tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to RouteTable
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!RouteTable.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RouteTable is not found in the empty"
                                        + " JSON string",
                                RouteTable.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!RouteTable.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RouteTable` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if (jsonObj.get("LinkRouteTables") != null
                && !jsonObj.get("LinkRouteTables").isJsonNull()) {
            JsonArray jsonArraylinkRouteTables = jsonObj.getAsJsonArray("LinkRouteTables");
            if (jsonArraylinkRouteTables != null) {
                // ensure the json data is an array
                if (!jsonObj.get("LinkRouteTables").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `LinkRouteTables` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("LinkRouteTables").toString()));
                }

                // validate the optional field `LinkRouteTables` (array)
                for (int i = 0; i < jsonArraylinkRouteTables.size(); i++) {
                    LinkRouteTable.validateJsonObject(
                            jsonArraylinkRouteTables.get(i).getAsJsonObject());
                }
                ;
            }
        }
        if ((jsonObj.get("NetId") != null && !jsonObj.get("NetId").isJsonNull())
                && !jsonObj.get("NetId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NetId").toString()));
        }
        if (jsonObj.get("RoutePropagatingVirtualGateways") != null
                && !jsonObj.get("RoutePropagatingVirtualGateways").isJsonNull()) {
            JsonArray jsonArrayroutePropagatingVirtualGateways =
                    jsonObj.getAsJsonArray("RoutePropagatingVirtualGateways");
            if (jsonArrayroutePropagatingVirtualGateways != null) {
                // ensure the json data is an array
                if (!jsonObj.get("RoutePropagatingVirtualGateways").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `RoutePropagatingVirtualGateways` to be an"
                                            + " array in the JSON string but got `%s`",
                                    jsonObj.get("RoutePropagatingVirtualGateways").toString()));
                }

                // validate the optional field `RoutePropagatingVirtualGateways` (array)
                for (int i = 0; i < jsonArrayroutePropagatingVirtualGateways.size(); i++) {
                    RoutePropagatingVirtualGateway.validateJsonObject(
                            jsonArrayroutePropagatingVirtualGateways.get(i).getAsJsonObject());
                }
                ;
            }
        }
        if ((jsonObj.get("RouteTableId") != null && !jsonObj.get("RouteTableId").isJsonNull())
                && !jsonObj.get("RouteTableId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteTableId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("RouteTableId").toString()));
        }
        if (jsonObj.get("Routes") != null && !jsonObj.get("Routes").isJsonNull()) {
            JsonArray jsonArrayroutes = jsonObj.getAsJsonArray("Routes");
            if (jsonArrayroutes != null) {
                // ensure the json data is an array
                if (!jsonObj.get("Routes").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `Routes` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("Routes").toString()));
                }

                // validate the optional field `Routes` (array)
                for (int i = 0; i < jsonArrayroutes.size(); i++) {
                    Route.validateJsonObject(jsonArrayroutes.get(i).getAsJsonObject());
                }
                ;
            }
        }
        if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
            JsonArray jsonArraytags = jsonObj.getAsJsonArray("Tags");
            if (jsonArraytags != null) {
                // ensure the json data is an array
                if (!jsonObj.get("Tags").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `Tags` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("Tags").toString()));
                }

                // validate the optional field `Tags` (array)
                for (int i = 0; i < jsonArraytags.size(); i++) {
                    ResourceTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RouteTable.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RouteTable' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RouteTable> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RouteTable.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RouteTable>() {
                        @Override
                        public void write(JsonWriter out, RouteTable value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RouteTable read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RouteTable given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RouteTable
     * @throws IOException if the JSON string is invalid with respect to RouteTable
     */
    public static RouteTable fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RouteTable.class);
    }

    /**
     * Convert an instance of RouteTable to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

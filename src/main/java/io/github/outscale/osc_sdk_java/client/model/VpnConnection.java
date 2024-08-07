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

/** Information about a VPN connection. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VpnConnection {
    public static final String SERIALIZED_NAME_CLIENT_GATEWAY_CONFIGURATION =
            "ClientGatewayConfiguration";

    @SerializedName(SERIALIZED_NAME_CLIENT_GATEWAY_CONFIGURATION)
    private String clientGatewayConfiguration;

    public static final String SERIALIZED_NAME_CLIENT_GATEWAY_ID = "ClientGatewayId";

    @SerializedName(SERIALIZED_NAME_CLIENT_GATEWAY_ID)
    private String clientGatewayId;

    public static final String SERIALIZED_NAME_CONNECTION_TYPE = "ConnectionType";

    @SerializedName(SERIALIZED_NAME_CONNECTION_TYPE)
    private String connectionType;

    public static final String SERIALIZED_NAME_ROUTES = "Routes";

    @SerializedName(SERIALIZED_NAME_ROUTES)
    private List<RouteLight> routes = null;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_STATIC_ROUTES_ONLY = "StaticRoutesOnly";

    @SerializedName(SERIALIZED_NAME_STATIC_ROUTES_ONLY)
    private Boolean staticRoutesOnly;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public static final String SERIALIZED_NAME_VGW_TELEMETRIES = "VgwTelemetries";

    @SerializedName(SERIALIZED_NAME_VGW_TELEMETRIES)
    private List<VgwTelemetry> vgwTelemetries = null;

    public static final String SERIALIZED_NAME_VIRTUAL_GATEWAY_ID = "VirtualGatewayId";

    @SerializedName(SERIALIZED_NAME_VIRTUAL_GATEWAY_ID)
    private String virtualGatewayId;

    public static final String SERIALIZED_NAME_VPN_CONNECTION_ID = "VpnConnectionId";

    @SerializedName(SERIALIZED_NAME_VPN_CONNECTION_ID)
    private String vpnConnectionId;

    public static final String SERIALIZED_NAME_VPN_OPTIONS = "VpnOptions";

    @SerializedName(SERIALIZED_NAME_VPN_OPTIONS)
    private VpnOptions vpnOptions;

    public VpnConnection() {}

    public VpnConnection clientGatewayConfiguration(String clientGatewayConfiguration) {

        this.clientGatewayConfiguration = clientGatewayConfiguration;
        return this;
    }

    /**
     * Example configuration for the client gateway.
     *
     * @return clientGatewayConfiguration
     */
    @javax.annotation.Nullable
    public String getClientGatewayConfiguration() {
        return clientGatewayConfiguration;
    }

    public void setClientGatewayConfiguration(String clientGatewayConfiguration) {
        this.clientGatewayConfiguration = clientGatewayConfiguration;
    }

    public VpnConnection clientGatewayId(String clientGatewayId) {

        this.clientGatewayId = clientGatewayId;
        return this;
    }

    /**
     * The ID of the client gateway used on the client end of the connection.
     *
     * @return clientGatewayId
     */
    @javax.annotation.Nullable
    public String getClientGatewayId() {
        return clientGatewayId;
    }

    public void setClientGatewayId(String clientGatewayId) {
        this.clientGatewayId = clientGatewayId;
    }

    public VpnConnection connectionType(String connectionType) {

        this.connectionType = connectionType;
        return this;
    }

    /**
     * The type of VPN connection (always &#x60;ipsec.1&#x60;).
     *
     * @return connectionType
     */
    @javax.annotation.Nullable
    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public VpnConnection routes(List<RouteLight> routes) {

        this.routes = routes;
        return this;
    }

    public VpnConnection addRoutesItem(RouteLight routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        this.routes.add(routesItem);
        return this;
    }

    /**
     * Information about one or more static routes associated with the VPN connection, if any.
     *
     * @return routes
     */
    @javax.annotation.Nullable
    public List<RouteLight> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RouteLight> routes) {
        this.routes = routes;
    }

    public VpnConnection state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the VPN connection (&#x60;pending&#x60; \\| &#x60;available&#x60; \\|
     * &#x60;deleting&#x60; \\| &#x60;deleted&#x60;).
     *
     * @return state
     */
    @javax.annotation.Nullable
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public VpnConnection staticRoutesOnly(Boolean staticRoutesOnly) {

        this.staticRoutesOnly = staticRoutesOnly;
        return this;
    }

    /**
     * If false, the VPN connection uses dynamic routing with Border Gateway Protocol (BGP). If
     * true, routing is controlled using static routes. For more information about how to create and
     * delete static routes, see [CreateVpnConnectionRoute](#createvpnconnectionroute) and
     * [DeleteVpnConnectionRoute](#deletevpnconnectionroute).
     *
     * @return staticRoutesOnly
     */
    @javax.annotation.Nullable
    public Boolean getStaticRoutesOnly() {
        return staticRoutesOnly;
    }

    public void setStaticRoutesOnly(Boolean staticRoutesOnly) {
        this.staticRoutesOnly = staticRoutesOnly;
    }

    public VpnConnection tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public VpnConnection addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the VPN connection.
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

    public VpnConnection vgwTelemetries(List<VgwTelemetry> vgwTelemetries) {

        this.vgwTelemetries = vgwTelemetries;
        return this;
    }

    public VpnConnection addVgwTelemetriesItem(VgwTelemetry vgwTelemetriesItem) {
        if (this.vgwTelemetries == null) {
            this.vgwTelemetries = new ArrayList<>();
        }
        this.vgwTelemetries.add(vgwTelemetriesItem);
        return this;
    }

    /**
     * Information about the current state of one or more of the VPN tunnels.
     *
     * @return vgwTelemetries
     */
    @javax.annotation.Nullable
    public List<VgwTelemetry> getVgwTelemetries() {
        return vgwTelemetries;
    }

    public void setVgwTelemetries(List<VgwTelemetry> vgwTelemetries) {
        this.vgwTelemetries = vgwTelemetries;
    }

    public VpnConnection virtualGatewayId(String virtualGatewayId) {

        this.virtualGatewayId = virtualGatewayId;
        return this;
    }

    /**
     * The ID of the virtual gateway used on the OUTSCALE end of the connection.
     *
     * @return virtualGatewayId
     */
    @javax.annotation.Nullable
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    public VpnConnection vpnConnectionId(String vpnConnectionId) {

        this.vpnConnectionId = vpnConnectionId;
        return this;
    }

    /**
     * The ID of the VPN connection.
     *
     * @return vpnConnectionId
     */
    @javax.annotation.Nullable
    public String getVpnConnectionId() {
        return vpnConnectionId;
    }

    public void setVpnConnectionId(String vpnConnectionId) {
        this.vpnConnectionId = vpnConnectionId;
    }

    public VpnConnection vpnOptions(VpnOptions vpnOptions) {

        this.vpnOptions = vpnOptions;
        return this;
    }

    /**
     * Get vpnOptions
     *
     * @return vpnOptions
     */
    @javax.annotation.Nullable
    public VpnOptions getVpnOptions() {
        return vpnOptions;
    }

    public void setVpnOptions(VpnOptions vpnOptions) {
        this.vpnOptions = vpnOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpnConnection vpnConnection = (VpnConnection) o;
        return Objects.equals(
                        this.clientGatewayConfiguration, vpnConnection.clientGatewayConfiguration)
                && Objects.equals(this.clientGatewayId, vpnConnection.clientGatewayId)
                && Objects.equals(this.connectionType, vpnConnection.connectionType)
                && Objects.equals(this.routes, vpnConnection.routes)
                && Objects.equals(this.state, vpnConnection.state)
                && Objects.equals(this.staticRoutesOnly, vpnConnection.staticRoutesOnly)
                && Objects.equals(this.tags, vpnConnection.tags)
                && Objects.equals(this.vgwTelemetries, vpnConnection.vgwTelemetries)
                && Objects.equals(this.virtualGatewayId, vpnConnection.virtualGatewayId)
                && Objects.equals(this.vpnConnectionId, vpnConnection.vpnConnectionId)
                && Objects.equals(this.vpnOptions, vpnConnection.vpnOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientGatewayConfiguration,
                clientGatewayId,
                connectionType,
                routes,
                state,
                staticRoutesOnly,
                tags,
                vgwTelemetries,
                virtualGatewayId,
                vpnConnectionId,
                vpnOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpnConnection {\n");
        sb.append("    clientGatewayConfiguration: ")
                .append(toIndentedString(clientGatewayConfiguration))
                .append("\n");
        sb.append("    clientGatewayId: ").append(toIndentedString(clientGatewayId)).append("\n");
        sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    staticRoutesOnly: ").append(toIndentedString(staticRoutesOnly)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    vgwTelemetries: ").append(toIndentedString(vgwTelemetries)).append("\n");
        sb.append("    virtualGatewayId: ").append(toIndentedString(virtualGatewayId)).append("\n");
        sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
        sb.append("    vpnOptions: ").append(toIndentedString(vpnOptions)).append("\n");
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
        openapiFields.add("ClientGatewayConfiguration");
        openapiFields.add("ClientGatewayId");
        openapiFields.add("ConnectionType");
        openapiFields.add("Routes");
        openapiFields.add("State");
        openapiFields.add("StaticRoutesOnly");
        openapiFields.add("Tags");
        openapiFields.add("VgwTelemetries");
        openapiFields.add("VirtualGatewayId");
        openapiFields.add("VpnConnectionId");
        openapiFields.add("VpnOptions");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to VpnConnection
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!VpnConnection.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VpnConnection is not found in the"
                                        + " empty JSON string",
                                VpnConnection.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!VpnConnection.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `VpnConnection` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("ClientGatewayConfiguration") != null
                        && !jsonObj.get("ClientGatewayConfiguration").isJsonNull())
                && !jsonObj.get("ClientGatewayConfiguration").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ClientGatewayConfiguration` to be a primitive"
                                    + " type in the JSON string but got `%s`",
                            jsonObj.get("ClientGatewayConfiguration").toString()));
        }
        if ((jsonObj.get("ClientGatewayId") != null && !jsonObj.get("ClientGatewayId").isJsonNull())
                && !jsonObj.get("ClientGatewayId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ClientGatewayId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("ClientGatewayId").toString()));
        }
        if ((jsonObj.get("ConnectionType") != null && !jsonObj.get("ConnectionType").isJsonNull())
                && !jsonObj.get("ConnectionType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ConnectionType` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("ConnectionType").toString()));
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
                    RouteLight.validateJsonObject(jsonArrayroutes.get(i).getAsJsonObject());
                }
                ;
            }
        }
        if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull())
                && !jsonObj.get("State").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `State` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("State").toString()));
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
        if (jsonObj.get("VgwTelemetries") != null && !jsonObj.get("VgwTelemetries").isJsonNull()) {
            JsonArray jsonArrayvgwTelemetries = jsonObj.getAsJsonArray("VgwTelemetries");
            if (jsonArrayvgwTelemetries != null) {
                // ensure the json data is an array
                if (!jsonObj.get("VgwTelemetries").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `VgwTelemetries` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("VgwTelemetries").toString()));
                }

                // validate the optional field `VgwTelemetries` (array)
                for (int i = 0; i < jsonArrayvgwTelemetries.size(); i++) {
                    VgwTelemetry.validateJsonObject(
                            jsonArrayvgwTelemetries.get(i).getAsJsonObject());
                }
                ;
            }
        }
        if ((jsonObj.get("VirtualGatewayId") != null
                        && !jsonObj.get("VirtualGatewayId").isJsonNull())
                && !jsonObj.get("VirtualGatewayId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VirtualGatewayId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("VirtualGatewayId").toString()));
        }
        if ((jsonObj.get("VpnConnectionId") != null && !jsonObj.get("VpnConnectionId").isJsonNull())
                && !jsonObj.get("VpnConnectionId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VpnConnectionId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("VpnConnectionId").toString()));
        }
        // validate the optional field `VpnOptions`
        if (jsonObj.get("VpnOptions") != null && !jsonObj.get("VpnOptions").isJsonNull()) {
            VpnOptions.validateJsonObject(jsonObj.getAsJsonObject("VpnOptions"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VpnConnection.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VpnConnection' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VpnConnection> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VpnConnection.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VpnConnection>() {
                        @Override
                        public void write(JsonWriter out, VpnConnection value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VpnConnection read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VpnConnection given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VpnConnection
     * @throws IOException if the JSON string is invalid with respect to VpnConnection
     */
    public static VpnConnection fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VpnConnection.class);
    }

    /**
     * Convert an instance of VpnConnection to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

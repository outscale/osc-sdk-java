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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** UpdateRouteRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateRouteRequest {
    public static final String SERIALIZED_NAME_DESTINATION_IP_RANGE = "DestinationIpRange";

    @SerializedName(SERIALIZED_NAME_DESTINATION_IP_RANGE)
    private String destinationIpRange;

    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_GATEWAY_ID = "GatewayId";

    @SerializedName(SERIALIZED_NAME_GATEWAY_ID)
    private String gatewayId;

    public static final String SERIALIZED_NAME_NAT_SERVICE_ID = "NatServiceId";

    @SerializedName(SERIALIZED_NAME_NAT_SERVICE_ID)
    private String natServiceId;

    public static final String SERIALIZED_NAME_NET_PEERING_ID = "NetPeeringId";

    @SerializedName(SERIALIZED_NAME_NET_PEERING_ID)
    private String netPeeringId;

    public static final String SERIALIZED_NAME_NIC_ID = "NicId";

    @SerializedName(SERIALIZED_NAME_NIC_ID)
    private String nicId;

    public static final String SERIALIZED_NAME_ROUTE_TABLE_ID = "RouteTableId";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLE_ID)
    private String routeTableId;

    public static final String SERIALIZED_NAME_VM_ID = "VmId";

    @SerializedName(SERIALIZED_NAME_VM_ID)
    private String vmId;

    public UpdateRouteRequest() {}

    public UpdateRouteRequest destinationIpRange(String destinationIpRange) {

        this.destinationIpRange = destinationIpRange;
        return this;
    }

    /**
     * The IP range used for the destination match, in CIDR notation (for example,
     * &#x60;10.0.0.0/24&#x60;).
     *
     * @return destinationIpRange
     */
    @javax.annotation.Nonnull
    public String getDestinationIpRange() {
        return destinationIpRange;
    }

    public void setDestinationIpRange(String destinationIpRange) {
        this.destinationIpRange = destinationIpRange;
    }

    public UpdateRouteRequest dryRun(Boolean dryRun) {

        this.dryRun = dryRun;
        return this;
    }

    /**
     * If true, checks whether you have the required permissions to perform the action.
     *
     * @return dryRun
     */
    @javax.annotation.Nullable
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public UpdateRouteRequest gatewayId(String gatewayId) {

        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * The ID of an Internet service or virtual gateway attached to your Net.
     *
     * @return gatewayId
     */
    @javax.annotation.Nullable
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public UpdateRouteRequest natServiceId(String natServiceId) {

        this.natServiceId = natServiceId;
        return this;
    }

    /**
     * The ID of a NAT service.
     *
     * @return natServiceId
     */
    @javax.annotation.Nullable
    public String getNatServiceId() {
        return natServiceId;
    }

    public void setNatServiceId(String natServiceId) {
        this.natServiceId = natServiceId;
    }

    public UpdateRouteRequest netPeeringId(String netPeeringId) {

        this.netPeeringId = netPeeringId;
        return this;
    }

    /**
     * The ID of a Net peering.
     *
     * @return netPeeringId
     */
    @javax.annotation.Nullable
    public String getNetPeeringId() {
        return netPeeringId;
    }

    public void setNetPeeringId(String netPeeringId) {
        this.netPeeringId = netPeeringId;
    }

    public UpdateRouteRequest nicId(String nicId) {

        this.nicId = nicId;
        return this;
    }

    /**
     * The ID of a network interface card (NIC).
     *
     * @return nicId
     */
    @javax.annotation.Nullable
    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public UpdateRouteRequest routeTableId(String routeTableId) {

        this.routeTableId = routeTableId;
        return this;
    }

    /**
     * The ID of the route table.
     *
     * @return routeTableId
     */
    @javax.annotation.Nonnull
    public String getRouteTableId() {
        return routeTableId;
    }

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    public UpdateRouteRequest vmId(String vmId) {

        this.vmId = vmId;
        return this;
    }

    /**
     * The ID of a NAT VM in your Net.
     *
     * @return vmId
     */
    @javax.annotation.Nullable
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRouteRequest updateRouteRequest = (UpdateRouteRequest) o;
        return Objects.equals(this.destinationIpRange, updateRouteRequest.destinationIpRange)
                && Objects.equals(this.dryRun, updateRouteRequest.dryRun)
                && Objects.equals(this.gatewayId, updateRouteRequest.gatewayId)
                && Objects.equals(this.natServiceId, updateRouteRequest.natServiceId)
                && Objects.equals(this.netPeeringId, updateRouteRequest.netPeeringId)
                && Objects.equals(this.nicId, updateRouteRequest.nicId)
                && Objects.equals(this.routeTableId, updateRouteRequest.routeTableId)
                && Objects.equals(this.vmId, updateRouteRequest.vmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                destinationIpRange,
                dryRun,
                gatewayId,
                natServiceId,
                netPeeringId,
                nicId,
                routeTableId,
                vmId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRouteRequest {\n");
        sb.append("    destinationIpRange: ")
                .append(toIndentedString(destinationIpRange))
                .append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    natServiceId: ").append(toIndentedString(natServiceId)).append("\n");
        sb.append("    netPeeringId: ").append(toIndentedString(netPeeringId)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
        sb.append("    routeTableId: ").append(toIndentedString(routeTableId)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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
        openapiFields.add("DestinationIpRange");
        openapiFields.add("DryRun");
        openapiFields.add("GatewayId");
        openapiFields.add("NatServiceId");
        openapiFields.add("NetPeeringId");
        openapiFields.add("NicId");
        openapiFields.add("RouteTableId");
        openapiFields.add("VmId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("DestinationIpRange");
        openapiRequiredFields.add("RouteTableId");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to UpdateRouteRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!UpdateRouteRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateRouteRequest is not found in"
                                        + " the empty JSON string",
                                UpdateRouteRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!UpdateRouteRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateRouteRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateRouteRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("DestinationIpRange").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `DestinationIpRange` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("DestinationIpRange").toString()));
        }
        if ((jsonObj.get("GatewayId") != null && !jsonObj.get("GatewayId").isJsonNull())
                && !jsonObj.get("GatewayId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `GatewayId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("GatewayId").toString()));
        }
        if ((jsonObj.get("NatServiceId") != null && !jsonObj.get("NatServiceId").isJsonNull())
                && !jsonObj.get("NatServiceId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NatServiceId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("NatServiceId").toString()));
        }
        if ((jsonObj.get("NetPeeringId") != null && !jsonObj.get("NetPeeringId").isJsonNull())
                && !jsonObj.get("NetPeeringId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NetPeeringId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("NetPeeringId").toString()));
        }
        if ((jsonObj.get("NicId") != null && !jsonObj.get("NicId").isJsonNull())
                && !jsonObj.get("NicId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NicId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NicId").toString()));
        }
        if (!jsonObj.get("RouteTableId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RouteTableId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("RouteTableId").toString()));
        }
        if ((jsonObj.get("VmId") != null && !jsonObj.get("VmId").isJsonNull())
                && !jsonObj.get("VmId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VmId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateRouteRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateRouteRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateRouteRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateRouteRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateRouteRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateRouteRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateRouteRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateRouteRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateRouteRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateRouteRequest
     */
    public static UpdateRouteRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateRouteRequest.class);
    }

    /**
     * Convert an instance of UpdateRouteRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

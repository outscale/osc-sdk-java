/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.27
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
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Information about the current state of a VPN tunnel. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VgwTelemetry {
    public static final String SERIALIZED_NAME_ACCEPTED_ROUTE_COUNT = "AcceptedRouteCount";

    @SerializedName(SERIALIZED_NAME_ACCEPTED_ROUTE_COUNT)
    private Integer acceptedRouteCount;

    public static final String SERIALIZED_NAME_LAST_STATE_CHANGE_DATE = "LastStateChangeDate";

    @SerializedName(SERIALIZED_NAME_LAST_STATE_CHANGE_DATE)
    private OffsetDateTime lastStateChangeDate;

    public static final String SERIALIZED_NAME_OUTSIDE_IP_ADDRESS = "OutsideIpAddress";

    @SerializedName(SERIALIZED_NAME_OUTSIDE_IP_ADDRESS)
    private String outsideIpAddress;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_STATE_DESCRIPTION = "StateDescription";

    @SerializedName(SERIALIZED_NAME_STATE_DESCRIPTION)
    private String stateDescription;

    public VgwTelemetry() {}

    public VgwTelemetry acceptedRouteCount(Integer acceptedRouteCount) {

        this.acceptedRouteCount = acceptedRouteCount;
        return this;
    }

    /**
     * The number of routes accepted through BGP (Border Gateway Protocol) route exchanges.
     *
     * @return acceptedRouteCount
     */
    @javax.annotation.Nullable
    public Integer getAcceptedRouteCount() {
        return acceptedRouteCount;
    }

    public void setAcceptedRouteCount(Integer acceptedRouteCount) {
        this.acceptedRouteCount = acceptedRouteCount;
    }

    public VgwTelemetry lastStateChangeDate(OffsetDateTime lastStateChangeDate) {

        this.lastStateChangeDate = lastStateChangeDate;
        return this;
    }

    /**
     * The date and time (UTC) of the latest state update.
     *
     * @return lastStateChangeDate
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastStateChangeDate() {
        return lastStateChangeDate;
    }

    public void setLastStateChangeDate(OffsetDateTime lastStateChangeDate) {
        this.lastStateChangeDate = lastStateChangeDate;
    }

    public VgwTelemetry outsideIpAddress(String outsideIpAddress) {

        this.outsideIpAddress = outsideIpAddress;
        return this;
    }

    /**
     * The IP on the OUTSCALE side of the tunnel.
     *
     * @return outsideIpAddress
     */
    @javax.annotation.Nullable
    public String getOutsideIpAddress() {
        return outsideIpAddress;
    }

    public void setOutsideIpAddress(String outsideIpAddress) {
        this.outsideIpAddress = outsideIpAddress;
    }

    public VgwTelemetry state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the IPSEC tunnel (&#x60;UP&#x60; \\| &#x60;DOWN&#x60;).
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

    public VgwTelemetry stateDescription(String stateDescription) {

        this.stateDescription = stateDescription;
        return this;
    }

    /**
     * A description of the current state of the tunnel.
     *
     * @return stateDescription
     */
    @javax.annotation.Nullable
    public String getStateDescription() {
        return stateDescription;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VgwTelemetry vgwTelemetry = (VgwTelemetry) o;
        return Objects.equals(this.acceptedRouteCount, vgwTelemetry.acceptedRouteCount)
                && Objects.equals(this.lastStateChangeDate, vgwTelemetry.lastStateChangeDate)
                && Objects.equals(this.outsideIpAddress, vgwTelemetry.outsideIpAddress)
                && Objects.equals(this.state, vgwTelemetry.state)
                && Objects.equals(this.stateDescription, vgwTelemetry.stateDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                acceptedRouteCount, lastStateChangeDate, outsideIpAddress, state, stateDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VgwTelemetry {\n");
        sb.append("    acceptedRouteCount: ")
                .append(toIndentedString(acceptedRouteCount))
                .append("\n");
        sb.append("    lastStateChangeDate: ")
                .append(toIndentedString(lastStateChangeDate))
                .append("\n");
        sb.append("    outsideIpAddress: ").append(toIndentedString(outsideIpAddress)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateDescription: ").append(toIndentedString(stateDescription)).append("\n");
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
        openapiFields.add("AcceptedRouteCount");
        openapiFields.add("LastStateChangeDate");
        openapiFields.add("OutsideIpAddress");
        openapiFields.add("State");
        openapiFields.add("StateDescription");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to VgwTelemetry
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!VgwTelemetry.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VgwTelemetry is not found in the"
                                        + " empty JSON string",
                                VgwTelemetry.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!VgwTelemetry.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `VgwTelemetry` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("OutsideIpAddress") != null
                        && !jsonObj.get("OutsideIpAddress").isJsonNull())
                && !jsonObj.get("OutsideIpAddress").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `OutsideIpAddress` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("OutsideIpAddress").toString()));
        }
        if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull())
                && !jsonObj.get("State").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `State` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("State").toString()));
        }
        if ((jsonObj.get("StateDescription") != null
                        && !jsonObj.get("StateDescription").isJsonNull())
                && !jsonObj.get("StateDescription").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `StateDescription` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("StateDescription").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VgwTelemetry.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VgwTelemetry' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VgwTelemetry> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VgwTelemetry.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VgwTelemetry>() {
                        @Override
                        public void write(JsonWriter out, VgwTelemetry value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VgwTelemetry read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VgwTelemetry given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VgwTelemetry
     * @throws IOException if the JSON string is invalid with respect to VgwTelemetry
     */
    public static VgwTelemetry fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VgwTelemetry.class);
    }

    /**
     * Convert an instance of VgwTelemetry to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

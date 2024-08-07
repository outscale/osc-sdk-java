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

/** Information about the VPN options. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VpnOptions {
    public static final String SERIALIZED_NAME_PHASE1_OPTIONS = "Phase1Options";

    @SerializedName(SERIALIZED_NAME_PHASE1_OPTIONS)
    private Phase1Options phase1Options;

    public static final String SERIALIZED_NAME_PHASE2_OPTIONS = "Phase2Options";

    @SerializedName(SERIALIZED_NAME_PHASE2_OPTIONS)
    private Phase2Options phase2Options;

    public static final String SERIALIZED_NAME_TUNNEL_INSIDE_IP_RANGE = "TunnelInsideIpRange";

    @SerializedName(SERIALIZED_NAME_TUNNEL_INSIDE_IP_RANGE)
    private String tunnelInsideIpRange;

    public VpnOptions() {}

    public VpnOptions phase1Options(Phase1Options phase1Options) {

        this.phase1Options = phase1Options;
        return this;
    }

    /**
     * Get phase1Options
     *
     * @return phase1Options
     */
    @javax.annotation.Nullable
    public Phase1Options getPhase1Options() {
        return phase1Options;
    }

    public void setPhase1Options(Phase1Options phase1Options) {
        this.phase1Options = phase1Options;
    }

    public VpnOptions phase2Options(Phase2Options phase2Options) {

        this.phase2Options = phase2Options;
        return this;
    }

    /**
     * Get phase2Options
     *
     * @return phase2Options
     */
    @javax.annotation.Nullable
    public Phase2Options getPhase2Options() {
        return phase2Options;
    }

    public void setPhase2Options(Phase2Options phase2Options) {
        this.phase2Options = phase2Options;
    }

    public VpnOptions tunnelInsideIpRange(String tunnelInsideIpRange) {

        this.tunnelInsideIpRange = tunnelInsideIpRange;
        return this;
    }

    /**
     * The range of inside IPs for the tunnel. This must be a /30 CIDR block from the
     * 169.254.254.0/24 range.
     *
     * @return tunnelInsideIpRange
     */
    @javax.annotation.Nullable
    public String getTunnelInsideIpRange() {
        return tunnelInsideIpRange;
    }

    public void setTunnelInsideIpRange(String tunnelInsideIpRange) {
        this.tunnelInsideIpRange = tunnelInsideIpRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpnOptions vpnOptions = (VpnOptions) o;
        return Objects.equals(this.phase1Options, vpnOptions.phase1Options)
                && Objects.equals(this.phase2Options, vpnOptions.phase2Options)
                && Objects.equals(this.tunnelInsideIpRange, vpnOptions.tunnelInsideIpRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase1Options, phase2Options, tunnelInsideIpRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpnOptions {\n");
        sb.append("    phase1Options: ").append(toIndentedString(phase1Options)).append("\n");
        sb.append("    phase2Options: ").append(toIndentedString(phase2Options)).append("\n");
        sb.append("    tunnelInsideIpRange: ")
                .append(toIndentedString(tunnelInsideIpRange))
                .append("\n");
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
        openapiFields.add("Phase1Options");
        openapiFields.add("Phase2Options");
        openapiFields.add("TunnelInsideIpRange");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to VpnOptions
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!VpnOptions.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VpnOptions is not found in the empty"
                                        + " JSON string",
                                VpnOptions.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!VpnOptions.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `VpnOptions` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // validate the optional field `Phase1Options`
        if (jsonObj.get("Phase1Options") != null && !jsonObj.get("Phase1Options").isJsonNull()) {
            Phase1Options.validateJsonObject(jsonObj.getAsJsonObject("Phase1Options"));
        }
        // validate the optional field `Phase2Options`
        if (jsonObj.get("Phase2Options") != null && !jsonObj.get("Phase2Options").isJsonNull()) {
            Phase2Options.validateJsonObject(jsonObj.getAsJsonObject("Phase2Options"));
        }
        if ((jsonObj.get("TunnelInsideIpRange") != null
                        && !jsonObj.get("TunnelInsideIpRange").isJsonNull())
                && !jsonObj.get("TunnelInsideIpRange").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `TunnelInsideIpRange` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("TunnelInsideIpRange").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VpnOptions.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VpnOptions' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VpnOptions> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VpnOptions.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VpnOptions>() {
                        @Override
                        public void write(JsonWriter out, VpnOptions value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VpnOptions read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VpnOptions given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VpnOptions
     * @throws IOException if the JSON string is invalid with respect to VpnOptions
     */
    public static VpnOptions fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VpnOptions.class);
    }

    /**
     * Convert an instance of VpnOptions to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

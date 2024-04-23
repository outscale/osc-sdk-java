/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html).  > If you try to sign requests with an invalid access key four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages.  > If you try to sign requests with an invalid password four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).<br /> # Error Codes Reference You can learn more about errors returned by the API in the dedicated [errors page](api-errors.html).
 *
 * The version of the OpenAPI document: 1.29.3
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

/** Information about the health check configuration. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HealthCheck {
    public static final String SERIALIZED_NAME_CHECK_INTERVAL = "CheckInterval";

    @SerializedName(SERIALIZED_NAME_CHECK_INTERVAL)
    private Integer checkInterval;

    public static final String SERIALIZED_NAME_HEALTHY_THRESHOLD = "HealthyThreshold";

    @SerializedName(SERIALIZED_NAME_HEALTHY_THRESHOLD)
    private Integer healthyThreshold;

    public static final String SERIALIZED_NAME_PATH = "Path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_PORT = "Port";

    @SerializedName(SERIALIZED_NAME_PORT)
    private Integer port;

    public static final String SERIALIZED_NAME_PROTOCOL = "Protocol";

    @SerializedName(SERIALIZED_NAME_PROTOCOL)
    private String protocol;

    public static final String SERIALIZED_NAME_TIMEOUT = "Timeout";

    @SerializedName(SERIALIZED_NAME_TIMEOUT)
    private Integer timeout;

    public static final String SERIALIZED_NAME_UNHEALTHY_THRESHOLD = "UnhealthyThreshold";

    @SerializedName(SERIALIZED_NAME_UNHEALTHY_THRESHOLD)
    private Integer unhealthyThreshold;

    public HealthCheck() {}

    public HealthCheck checkInterval(Integer checkInterval) {

        this.checkInterval = checkInterval;
        return this;
    }

    /**
     * The number of seconds between two requests (between &#x60;5&#x60; and &#x60;600&#x60; both
     * included).
     *
     * @return checkInterval
     */
    @javax.annotation.Nonnull
    public Integer getCheckInterval() {
        return checkInterval;
    }

    public void setCheckInterval(Integer checkInterval) {
        this.checkInterval = checkInterval;
    }

    public HealthCheck healthyThreshold(Integer healthyThreshold) {

        this.healthyThreshold = healthyThreshold;
        return this;
    }

    /**
     * The number of consecutive successful requests before considering the VM as healthy (between
     * &#x60;2&#x60; and &#x60;10&#x60; both included).
     *
     * @return healthyThreshold
     */
    @javax.annotation.Nonnull
    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    public HealthCheck path(String path) {

        this.path = path;
        return this;
    }

    /**
     * If you use the HTTP or HTTPS protocols, the request URL path.
     *
     * @return path
     */
    @javax.annotation.Nullable
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public HealthCheck port(Integer port) {

        this.port = port;
        return this;
    }

    /**
     * The port number (between &#x60;1&#x60; and &#x60;65535&#x60;, both included).
     *
     * @return port
     */
    @javax.annotation.Nonnull
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public HealthCheck protocol(String protocol) {

        this.protocol = protocol;
        return this;
    }

    /**
     * The protocol for the URL of the VM (&#x60;HTTP&#x60; \\| &#x60;HTTPS&#x60; \\|
     * &#x60;TCP&#x60; \\| &#x60;SSL&#x60;).
     *
     * @return protocol
     */
    @javax.annotation.Nonnull
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public HealthCheck timeout(Integer timeout) {

        this.timeout = timeout;
        return this;
    }

    /**
     * The maximum waiting time for a response before considering the VM as unhealthy, in seconds
     * (between &#x60;2&#x60; and &#x60;60&#x60; both included).
     *
     * @return timeout
     */
    @javax.annotation.Nonnull
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public HealthCheck unhealthyThreshold(Integer unhealthyThreshold) {

        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    /**
     * The number of consecutive failed requests before considering the VM as unhealthy (between
     * &#x60;2&#x60; and &#x60;10&#x60; both included).
     *
     * @return unhealthyThreshold
     */
    @javax.annotation.Nonnull
    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthCheck healthCheck = (HealthCheck) o;
        return Objects.equals(this.checkInterval, healthCheck.checkInterval)
                && Objects.equals(this.healthyThreshold, healthCheck.healthyThreshold)
                && Objects.equals(this.path, healthCheck.path)
                && Objects.equals(this.port, healthCheck.port)
                && Objects.equals(this.protocol, healthCheck.protocol)
                && Objects.equals(this.timeout, healthCheck.timeout)
                && Objects.equals(this.unhealthyThreshold, healthCheck.unhealthyThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                checkInterval, healthyThreshold, path, port, protocol, timeout, unhealthyThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthCheck {\n");
        sb.append("    checkInterval: ").append(toIndentedString(checkInterval)).append("\n");
        sb.append("    healthyThreshold: ").append(toIndentedString(healthyThreshold)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    unhealthyThreshold: ")
                .append(toIndentedString(unhealthyThreshold))
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
        openapiFields.add("CheckInterval");
        openapiFields.add("HealthyThreshold");
        openapiFields.add("Path");
        openapiFields.add("Port");
        openapiFields.add("Protocol");
        openapiFields.add("Timeout");
        openapiFields.add("UnhealthyThreshold");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("CheckInterval");
        openapiRequiredFields.add("HealthyThreshold");
        openapiRequiredFields.add("Port");
        openapiRequiredFields.add("Protocol");
        openapiRequiredFields.add("Timeout");
        openapiRequiredFields.add("UnhealthyThreshold");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to HealthCheck
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!HealthCheck.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in HealthCheck is not found in the empty"
                                        + " JSON string",
                                HealthCheck.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!HealthCheck.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `HealthCheck` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : HealthCheck.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if ((jsonObj.get("Path") != null && !jsonObj.get("Path").isJsonNull())
                && !jsonObj.get("Path").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Path` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Path").toString()));
        }
        if (!jsonObj.get("Protocol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Protocol` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Protocol").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!HealthCheck.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'HealthCheck' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<HealthCheck> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(HealthCheck.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<HealthCheck>() {
                        @Override
                        public void write(JsonWriter out, HealthCheck value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public HealthCheck read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of HealthCheck given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of HealthCheck
     * @throws IOException if the JSON string is invalid with respect to HealthCheck
     */
    public static HealthCheck fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, HealthCheck.class);
    }

    /**
     * Convert an instance of HealthCheck to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

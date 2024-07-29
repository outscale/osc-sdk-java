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

/** Information about the listener to create. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListenerForCreation {
    public static final String SERIALIZED_NAME_BACKEND_PORT = "BackendPort";

    @SerializedName(SERIALIZED_NAME_BACKEND_PORT)
    private Integer backendPort;

    public static final String SERIALIZED_NAME_BACKEND_PROTOCOL = "BackendProtocol";

    @SerializedName(SERIALIZED_NAME_BACKEND_PROTOCOL)
    private String backendProtocol;

    public static final String SERIALIZED_NAME_LOAD_BALANCER_PORT = "LoadBalancerPort";

    @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_PORT)
    private Integer loadBalancerPort;

    public static final String SERIALIZED_NAME_LOAD_BALANCER_PROTOCOL = "LoadBalancerProtocol";

    @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_PROTOCOL)
    private String loadBalancerProtocol;

    public static final String SERIALIZED_NAME_SERVER_CERTIFICATE_ID = "ServerCertificateId";

    @SerializedName(SERIALIZED_NAME_SERVER_CERTIFICATE_ID)
    private String serverCertificateId;

    public ListenerForCreation() {}

    public ListenerForCreation backendPort(Integer backendPort) {

        this.backendPort = backendPort;
        return this;
    }

    /**
     * The port on which the backend VM is listening (between &#x60;1&#x60; and &#x60;65535&#x60;,
     * both included).
     *
     * @return backendPort
     */
    @javax.annotation.Nonnull
    public Integer getBackendPort() {
        return backendPort;
    }

    public void setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
    }

    public ListenerForCreation backendProtocol(String backendProtocol) {

        this.backendProtocol = backendProtocol;
        return this;
    }

    /**
     * The protocol for routing traffic to backend VMs (&#x60;HTTP&#x60; \\| &#x60;HTTPS&#x60; \\|
     * &#x60;TCP&#x60; \\| &#x60;SSL&#x60;).
     *
     * @return backendProtocol
     */
    @javax.annotation.Nullable
    public String getBackendProtocol() {
        return backendProtocol;
    }

    public void setBackendProtocol(String backendProtocol) {
        this.backendProtocol = backendProtocol;
    }

    public ListenerForCreation loadBalancerPort(Integer loadBalancerPort) {

        this.loadBalancerPort = loadBalancerPort;
        return this;
    }

    /**
     * The port on which the load balancer is listening (between &#x60;1&#x60; and
     * &#x60;65535&#x60;, both included).
     *
     * @return loadBalancerPort
     */
    @javax.annotation.Nonnull
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }

    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }

    public ListenerForCreation loadBalancerProtocol(String loadBalancerProtocol) {

        this.loadBalancerProtocol = loadBalancerProtocol;
        return this;
    }

    /**
     * The routing protocol (&#x60;HTTP&#x60; \\| &#x60;HTTPS&#x60; \\| &#x60;TCP&#x60; \\|
     * &#x60;SSL&#x60;).
     *
     * @return loadBalancerProtocol
     */
    @javax.annotation.Nonnull
    public String getLoadBalancerProtocol() {
        return loadBalancerProtocol;
    }

    public void setLoadBalancerProtocol(String loadBalancerProtocol) {
        this.loadBalancerProtocol = loadBalancerProtocol;
    }

    public ListenerForCreation serverCertificateId(String serverCertificateId) {

        this.serverCertificateId = serverCertificateId;
        return this;
    }

    /**
     * The OUTSCALE Resource Name (ORN) of the server certificate. For more information, see
     * [Resource Identifiers &gt; OUTSCALE Resource Names
     * (ORNs)](https://docs.outscale.com/en/userguide/Resource-Identifiers.html#_outscale_resource_names_orns).
     *
     * @return serverCertificateId
     */
    @javax.annotation.Nullable
    public String getServerCertificateId() {
        return serverCertificateId;
    }

    public void setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListenerForCreation listenerForCreation = (ListenerForCreation) o;
        return Objects.equals(this.backendPort, listenerForCreation.backendPort)
                && Objects.equals(this.backendProtocol, listenerForCreation.backendProtocol)
                && Objects.equals(this.loadBalancerPort, listenerForCreation.loadBalancerPort)
                && Objects.equals(
                        this.loadBalancerProtocol, listenerForCreation.loadBalancerProtocol)
                && Objects.equals(
                        this.serverCertificateId, listenerForCreation.serverCertificateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                backendPort,
                backendProtocol,
                loadBalancerPort,
                loadBalancerProtocol,
                serverCertificateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListenerForCreation {\n");
        sb.append("    backendPort: ").append(toIndentedString(backendPort)).append("\n");
        sb.append("    backendProtocol: ").append(toIndentedString(backendProtocol)).append("\n");
        sb.append("    loadBalancerPort: ").append(toIndentedString(loadBalancerPort)).append("\n");
        sb.append("    loadBalancerProtocol: ")
                .append(toIndentedString(loadBalancerProtocol))
                .append("\n");
        sb.append("    serverCertificateId: ")
                .append(toIndentedString(serverCertificateId))
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
        openapiFields.add("BackendPort");
        openapiFields.add("BackendProtocol");
        openapiFields.add("LoadBalancerPort");
        openapiFields.add("LoadBalancerProtocol");
        openapiFields.add("ServerCertificateId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("BackendPort");
        openapiRequiredFields.add("LoadBalancerPort");
        openapiRequiredFields.add("LoadBalancerProtocol");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ListenerForCreation
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ListenerForCreation.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ListenerForCreation is not found in"
                                        + " the empty JSON string",
                                ListenerForCreation.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ListenerForCreation.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ListenerForCreation` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ListenerForCreation.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if ((jsonObj.get("BackendProtocol") != null && !jsonObj.get("BackendProtocol").isJsonNull())
                && !jsonObj.get("BackendProtocol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `BackendProtocol` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("BackendProtocol").toString()));
        }
        if (!jsonObj.get("LoadBalancerProtocol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LoadBalancerProtocol` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("LoadBalancerProtocol").toString()));
        }
        if ((jsonObj.get("ServerCertificateId") != null
                        && !jsonObj.get("ServerCertificateId").isJsonNull())
                && !jsonObj.get("ServerCertificateId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ServerCertificateId` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("ServerCertificateId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ListenerForCreation.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ListenerForCreation' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ListenerForCreation> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ListenerForCreation.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ListenerForCreation>() {
                        @Override
                        public void write(JsonWriter out, ListenerForCreation value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ListenerForCreation read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ListenerForCreation given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ListenerForCreation
     * @throws IOException if the JSON string is invalid with respect to ListenerForCreation
     */
    public static ListenerForCreation fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ListenerForCreation.class);
    }

    /**
     * Convert an instance of ListenerForCreation to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

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

/** Information about the listener. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Listener {
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

    public static final String SERIALIZED_NAME_POLICY_NAMES = "PolicyNames";

    @SerializedName(SERIALIZED_NAME_POLICY_NAMES)
    private List<String> policyNames = null;

    public static final String SERIALIZED_NAME_SERVER_CERTIFICATE_ID = "ServerCertificateId";

    @SerializedName(SERIALIZED_NAME_SERVER_CERTIFICATE_ID)
    private String serverCertificateId;

    public Listener() {}

    public Listener backendPort(Integer backendPort) {

        this.backendPort = backendPort;
        return this;
    }

    /**
     * The port on which the back-end VM is listening (between &#x60;1&#x60; and &#x60;65535&#x60;,
     * both included).
     *
     * @return backendPort
     */
    @javax.annotation.Nullable
    public Integer getBackendPort() {
        return backendPort;
    }

    public void setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
    }

    public Listener backendProtocol(String backendProtocol) {

        this.backendProtocol = backendProtocol;
        return this;
    }

    /**
     * The protocol for routing traffic to back-end VMs (&#x60;HTTP&#x60; \\| &#x60;HTTPS&#x60; \\|
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

    public Listener loadBalancerPort(Integer loadBalancerPort) {

        this.loadBalancerPort = loadBalancerPort;
        return this;
    }

    /**
     * The port on which the load balancer is listening (between &#x60;1&#x60; and
     * &#x60;65535&#x60;, both included).
     *
     * @return loadBalancerPort
     */
    @javax.annotation.Nullable
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }

    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }

    public Listener loadBalancerProtocol(String loadBalancerProtocol) {

        this.loadBalancerProtocol = loadBalancerProtocol;
        return this;
    }

    /**
     * The routing protocol (&#x60;HTTP&#x60; \\| &#x60;HTTPS&#x60; \\| &#x60;TCP&#x60; \\|
     * &#x60;SSL&#x60;).
     *
     * @return loadBalancerProtocol
     */
    @javax.annotation.Nullable
    public String getLoadBalancerProtocol() {
        return loadBalancerProtocol;
    }

    public void setLoadBalancerProtocol(String loadBalancerProtocol) {
        this.loadBalancerProtocol = loadBalancerProtocol;
    }

    public Listener policyNames(List<String> policyNames) {

        this.policyNames = policyNames;
        return this;
    }

    public Listener addPolicyNamesItem(String policyNamesItem) {
        if (this.policyNames == null) {
            this.policyNames = new ArrayList<>();
        }
        this.policyNames.add(policyNamesItem);
        return this;
    }

    /**
     * The names of the policies. If there are no policies enabled, the list is empty.
     *
     * @return policyNames
     */
    @javax.annotation.Nullable
    public List<String> getPolicyNames() {
        return policyNames;
    }

    public void setPolicyNames(List<String> policyNames) {
        this.policyNames = policyNames;
    }

    public Listener serverCertificateId(String serverCertificateId) {

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
        Listener listener = (Listener) o;
        return Objects.equals(this.backendPort, listener.backendPort)
                && Objects.equals(this.backendProtocol, listener.backendProtocol)
                && Objects.equals(this.loadBalancerPort, listener.loadBalancerPort)
                && Objects.equals(this.loadBalancerProtocol, listener.loadBalancerProtocol)
                && Objects.equals(this.policyNames, listener.policyNames)
                && Objects.equals(this.serverCertificateId, listener.serverCertificateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                backendPort,
                backendProtocol,
                loadBalancerPort,
                loadBalancerProtocol,
                policyNames,
                serverCertificateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Listener {\n");
        sb.append("    backendPort: ").append(toIndentedString(backendPort)).append("\n");
        sb.append("    backendProtocol: ").append(toIndentedString(backendProtocol)).append("\n");
        sb.append("    loadBalancerPort: ").append(toIndentedString(loadBalancerPort)).append("\n");
        sb.append("    loadBalancerProtocol: ")
                .append(toIndentedString(loadBalancerProtocol))
                .append("\n");
        sb.append("    policyNames: ").append(toIndentedString(policyNames)).append("\n");
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
        openapiFields.add("PolicyNames");
        openapiFields.add("ServerCertificateId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Listener
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Listener.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Listener is not found in the empty"
                                        + " JSON string",
                                Listener.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Listener.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `Listener` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
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
        if ((jsonObj.get("LoadBalancerProtocol") != null
                        && !jsonObj.get("LoadBalancerProtocol").isJsonNull())
                && !jsonObj.get("LoadBalancerProtocol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LoadBalancerProtocol` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("LoadBalancerProtocol").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("PolicyNames") != null && !jsonObj.get("PolicyNames").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PolicyNames` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("PolicyNames").toString()));
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
            if (!Listener.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Listener' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Listener> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Listener.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Listener>() {
                        @Override
                        public void write(JsonWriter out, Listener value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Listener read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Listener given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Listener
     * @throws IOException if the JSON string is invalid with respect to Listener
     */
    public static Listener fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Listener.class);
    }

    /**
     * Convert an instance of Listener to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html). ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages. ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).
 *
 * The version of the OpenAPI document: 1.28.7
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

/** LinkLoadBalancerBackendMachinesRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkLoadBalancerBackendMachinesRequest {
    public static final String SERIALIZED_NAME_BACKEND_IPS = "BackendIps";

    @SerializedName(SERIALIZED_NAME_BACKEND_IPS)
    private List<String> backendIps = null;

    public static final String SERIALIZED_NAME_BACKEND_VM_IDS = "BackendVmIds";

    @SerializedName(SERIALIZED_NAME_BACKEND_VM_IDS)
    private List<String> backendVmIds = null;

    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_LOAD_BALANCER_NAME = "LoadBalancerName";

    @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_NAME)
    private String loadBalancerName;

    public LinkLoadBalancerBackendMachinesRequest() {}

    public LinkLoadBalancerBackendMachinesRequest backendIps(List<String> backendIps) {

        this.backendIps = backendIps;
        return this;
    }

    public LinkLoadBalancerBackendMachinesRequest addBackendIpsItem(String backendIpsItem) {
        if (this.backendIps == null) {
            this.backendIps = new ArrayList<>();
        }
        this.backendIps.add(backendIpsItem);
        return this;
    }

    /**
     * One or more public IPs of back-end VMs.
     *
     * @return backendIps
     */
    @javax.annotation.Nullable
    public List<String> getBackendIps() {
        return backendIps;
    }

    public void setBackendIps(List<String> backendIps) {
        this.backendIps = backendIps;
    }

    public LinkLoadBalancerBackendMachinesRequest backendVmIds(List<String> backendVmIds) {

        this.backendVmIds = backendVmIds;
        return this;
    }

    public LinkLoadBalancerBackendMachinesRequest addBackendVmIdsItem(String backendVmIdsItem) {
        if (this.backendVmIds == null) {
            this.backendVmIds = new ArrayList<>();
        }
        this.backendVmIds.add(backendVmIdsItem);
        return this;
    }

    /**
     * One or more IDs of back-end VMs.
     *
     * @return backendVmIds
     */
    @javax.annotation.Nullable
    public List<String> getBackendVmIds() {
        return backendVmIds;
    }

    public void setBackendVmIds(List<String> backendVmIds) {
        this.backendVmIds = backendVmIds;
    }

    public LinkLoadBalancerBackendMachinesRequest dryRun(Boolean dryRun) {

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

    public LinkLoadBalancerBackendMachinesRequest loadBalancerName(String loadBalancerName) {

        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * The name of the load balancer.
     *
     * @return loadBalancerName
     */
    @javax.annotation.Nonnull
    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkLoadBalancerBackendMachinesRequest linkLoadBalancerBackendMachinesRequest =
                (LinkLoadBalancerBackendMachinesRequest) o;
        return Objects.equals(this.backendIps, linkLoadBalancerBackendMachinesRequest.backendIps)
                && Objects.equals(
                        this.backendVmIds, linkLoadBalancerBackendMachinesRequest.backendVmIds)
                && Objects.equals(this.dryRun, linkLoadBalancerBackendMachinesRequest.dryRun)
                && Objects.equals(
                        this.loadBalancerName,
                        linkLoadBalancerBackendMachinesRequest.loadBalancerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backendIps, backendVmIds, dryRun, loadBalancerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkLoadBalancerBackendMachinesRequest {\n");
        sb.append("    backendIps: ").append(toIndentedString(backendIps)).append("\n");
        sb.append("    backendVmIds: ").append(toIndentedString(backendVmIds)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
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
        openapiFields.add("BackendIps");
        openapiFields.add("BackendVmIds");
        openapiFields.add("DryRun");
        openapiFields.add("LoadBalancerName");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("LoadBalancerName");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to
     *     LinkLoadBalancerBackendMachinesRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!LinkLoadBalancerBackendMachinesRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " LinkLoadBalancerBackendMachinesRequest is not found in the"
                                    + " empty JSON string",
                                LinkLoadBalancerBackendMachinesRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!LinkLoadBalancerBackendMachinesRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `LinkLoadBalancerBackendMachinesRequest` properties. JSON:"
                                    + " %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : LinkLoadBalancerBackendMachinesRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("BackendIps") != null && !jsonObj.get("BackendIps").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `BackendIps` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("BackendIps").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("BackendVmIds") != null && !jsonObj.get("BackendVmIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `BackendVmIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("BackendVmIds").toString()));
        }
        if (!jsonObj.get("LoadBalancerName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LoadBalancerName` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("LoadBalancerName").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!LinkLoadBalancerBackendMachinesRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'LinkLoadBalancerBackendMachinesRequest'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<LinkLoadBalancerBackendMachinesRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(LinkLoadBalancerBackendMachinesRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<LinkLoadBalancerBackendMachinesRequest>() {
                        @Override
                        public void write(
                                JsonWriter out, LinkLoadBalancerBackendMachinesRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public LinkLoadBalancerBackendMachinesRequest read(JsonReader in)
                                throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of LinkLoadBalancerBackendMachinesRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of LinkLoadBalancerBackendMachinesRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     LinkLoadBalancerBackendMachinesRequest
     */
    public static LinkLoadBalancerBackendMachinesRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, LinkLoadBalancerBackendMachinesRequest.class);
    }

    /**
     * Convert an instance of LinkLoadBalancerBackendMachinesRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** UpdateListenerRuleRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateListenerRuleRequest {
    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_HOST_PATTERN = "HostPattern";

    @SerializedName(SERIALIZED_NAME_HOST_PATTERN)
    private String hostPattern;

    public static final String SERIALIZED_NAME_LISTENER_RULE_NAME = "ListenerRuleName";

    @SerializedName(SERIALIZED_NAME_LISTENER_RULE_NAME)
    private String listenerRuleName;

    public static final String SERIALIZED_NAME_PATH_PATTERN = "PathPattern";

    @SerializedName(SERIALIZED_NAME_PATH_PATTERN)
    private String pathPattern;

    public UpdateListenerRuleRequest() {}

    public UpdateListenerRuleRequest dryRun(Boolean dryRun) {

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

    public UpdateListenerRuleRequest hostPattern(String hostPattern) {

        this.hostPattern = hostPattern;
        return this;
    }

    /**
     * A host-name pattern for the rule, with a maximum length of 128 characters. This host-name
     * pattern supports maximum three wildcards, and must not contain any special characters except
     * [-.?].
     *
     * @return hostPattern
     */
    @javax.annotation.Nullable
    public String getHostPattern() {
        return hostPattern;
    }

    public void setHostPattern(String hostPattern) {
        this.hostPattern = hostPattern;
    }

    public UpdateListenerRuleRequest listenerRuleName(String listenerRuleName) {

        this.listenerRuleName = listenerRuleName;
        return this;
    }

    /**
     * The name of the listener rule.
     *
     * @return listenerRuleName
     */
    @javax.annotation.Nonnull
    public String getListenerRuleName() {
        return listenerRuleName;
    }

    public void setListenerRuleName(String listenerRuleName) {
        this.listenerRuleName = listenerRuleName;
    }

    public UpdateListenerRuleRequest pathPattern(String pathPattern) {

        this.pathPattern = pathPattern;
        return this;
    }

    /**
     * A path pattern for the rule, with a maximum length of 128 characters. This path pattern
     * supports maximum three wildcards, and must not contain any special characters except
     * [_-.$/~&amp;quot;&#39;@:+?].
     *
     * @return pathPattern
     */
    @javax.annotation.Nullable
    public String getPathPattern() {
        return pathPattern;
    }

    public void setPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateListenerRuleRequest updateListenerRuleRequest = (UpdateListenerRuleRequest) o;
        return Objects.equals(this.dryRun, updateListenerRuleRequest.dryRun)
                && Objects.equals(this.hostPattern, updateListenerRuleRequest.hostPattern)
                && Objects.equals(this.listenerRuleName, updateListenerRuleRequest.listenerRuleName)
                && Objects.equals(this.pathPattern, updateListenerRuleRequest.pathPattern);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, hostPattern, listenerRuleName, pathPattern);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateListenerRuleRequest {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    hostPattern: ").append(toIndentedString(hostPattern)).append("\n");
        sb.append("    listenerRuleName: ").append(toIndentedString(listenerRuleName)).append("\n");
        sb.append("    pathPattern: ").append(toIndentedString(pathPattern)).append("\n");
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
        openapiFields.add("DryRun");
        openapiFields.add("HostPattern");
        openapiFields.add("ListenerRuleName");
        openapiFields.add("PathPattern");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("ListenerRuleName");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to UpdateListenerRuleRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!UpdateListenerRuleRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateListenerRuleRequest is not"
                                        + " found in the empty JSON string",
                                UpdateListenerRuleRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!UpdateListenerRuleRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateListenerRuleRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateListenerRuleRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if ((jsonObj.get("HostPattern") != null && !jsonObj.get("HostPattern").isJsonNull())
                && !jsonObj.get("HostPattern").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `HostPattern` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("HostPattern").toString()));
        }
        if (!jsonObj.get("ListenerRuleName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ListenerRuleName` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("ListenerRuleName").toString()));
        }
        if ((jsonObj.get("PathPattern") != null && !jsonObj.get("PathPattern").isJsonNull())
                && !jsonObj.get("PathPattern").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PathPattern` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PathPattern").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateListenerRuleRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateListenerRuleRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateListenerRuleRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateListenerRuleRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateListenerRuleRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateListenerRuleRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateListenerRuleRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateListenerRuleRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateListenerRuleRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateListenerRuleRequest
     */
    public static UpdateListenerRuleRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateListenerRuleRequest.class);
    }

    /**
     * Convert an instance of UpdateListenerRuleRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

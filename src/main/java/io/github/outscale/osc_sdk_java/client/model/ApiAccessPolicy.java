/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html). ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages. ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).
 *
 * The version of the OpenAPI document: 1.28.5
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

/** Information about the API access policy. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiAccessPolicy {
    public static final String SERIALIZED_NAME_MAX_ACCESS_KEY_EXPIRATION_SECONDS =
            "MaxAccessKeyExpirationSeconds";

    @SerializedName(SERIALIZED_NAME_MAX_ACCESS_KEY_EXPIRATION_SECONDS)
    private Long maxAccessKeyExpirationSeconds;

    public static final String SERIALIZED_NAME_REQUIRE_TRUSTED_ENV = "RequireTrustedEnv";

    @SerializedName(SERIALIZED_NAME_REQUIRE_TRUSTED_ENV)
    private Boolean requireTrustedEnv;

    public ApiAccessPolicy() {}

    public ApiAccessPolicy maxAccessKeyExpirationSeconds(Long maxAccessKeyExpirationSeconds) {

        this.maxAccessKeyExpirationSeconds = maxAccessKeyExpirationSeconds;
        return this;
    }

    /**
     * The maximum possible lifetime for your access keys, in seconds. If &#x60;0&#x60;, your access
     * keys can have unlimited lifetimes.
     *
     * @return maxAccessKeyExpirationSeconds
     */
    @javax.annotation.Nullable
    public Long getMaxAccessKeyExpirationSeconds() {
        return maxAccessKeyExpirationSeconds;
    }

    public void setMaxAccessKeyExpirationSeconds(Long maxAccessKeyExpirationSeconds) {
        this.maxAccessKeyExpirationSeconds = maxAccessKeyExpirationSeconds;
    }

    public ApiAccessPolicy requireTrustedEnv(Boolean requireTrustedEnv) {

        this.requireTrustedEnv = requireTrustedEnv;
        return this;
    }

    /**
     * If true, a trusted session is activated, allowing you to bypass Certificate Authorities (CAs)
     * enforcement. For more information, see [About Your API Access
     * Policy](https://docs.outscale.com/en/userguide/About-Your-API-Access-Policy.html).&lt;br
     * /&gt; If this is enabled, it is required that you and all your users log in to Cockpit v2
     * using the WebAuthn method for multi-factor authentication. For more information, see [About
     * Authentication &gt; Multi-Factor
     * Authentication](https://docs.outscale.com/en/userguide/About-Authentication.html#_multi_factor_authentication).
     *
     * @return requireTrustedEnv
     */
    @javax.annotation.Nullable
    public Boolean getRequireTrustedEnv() {
        return requireTrustedEnv;
    }

    public void setRequireTrustedEnv(Boolean requireTrustedEnv) {
        this.requireTrustedEnv = requireTrustedEnv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiAccessPolicy apiAccessPolicy = (ApiAccessPolicy) o;
        return Objects.equals(
                        this.maxAccessKeyExpirationSeconds,
                        apiAccessPolicy.maxAccessKeyExpirationSeconds)
                && Objects.equals(this.requireTrustedEnv, apiAccessPolicy.requireTrustedEnv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxAccessKeyExpirationSeconds, requireTrustedEnv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiAccessPolicy {\n");
        sb.append("    maxAccessKeyExpirationSeconds: ")
                .append(toIndentedString(maxAccessKeyExpirationSeconds))
                .append("\n");
        sb.append("    requireTrustedEnv: ")
                .append(toIndentedString(requireTrustedEnv))
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
        openapiFields.add("MaxAccessKeyExpirationSeconds");
        openapiFields.add("RequireTrustedEnv");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ApiAccessPolicy
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ApiAccessPolicy.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ApiAccessPolicy is not found in the"
                                        + " empty JSON string",
                                ApiAccessPolicy.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ApiAccessPolicy.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ApiAccessPolicy` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ApiAccessPolicy.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ApiAccessPolicy' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ApiAccessPolicy> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ApiAccessPolicy.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ApiAccessPolicy>() {
                        @Override
                        public void write(JsonWriter out, ApiAccessPolicy value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ApiAccessPolicy read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ApiAccessPolicy given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ApiAccessPolicy
     * @throws IOException if the JSON string is invalid with respect to ApiAccessPolicy
     */
    public static ApiAccessPolicy fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ApiAccessPolicy.class);
    }

    /**
     * Convert an instance of ApiAccessPolicy to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

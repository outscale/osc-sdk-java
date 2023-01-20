/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.24
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
     * enforcement. For more information, see the &#x60;ApiKeyAuth&#x60; authentication scheme in
     * the [Authentication](#authentication) section.
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

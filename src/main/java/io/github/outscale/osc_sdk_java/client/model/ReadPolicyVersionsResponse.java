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
import com.google.gson.JsonArray;
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

/** ReadPolicyVersionsResponse */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadPolicyVersionsResponse {
    public static final String SERIALIZED_NAME_HAS_MORE_ITEMS = "HasMoreItems";

    @SerializedName(SERIALIZED_NAME_HAS_MORE_ITEMS)
    private Boolean hasMoreItems;

    public static final String SERIALIZED_NAME_MAX_RESULTS_LIMIT = "MaxResultsLimit";

    @SerializedName(SERIALIZED_NAME_MAX_RESULTS_LIMIT)
    private Integer maxResultsLimit;

    public static final String SERIALIZED_NAME_POLICY_VERSIONS = "PolicyVersions";

    @SerializedName(SERIALIZED_NAME_POLICY_VERSIONS)
    private List<PolicyVersion> policyVersions = null;

    public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";

    @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
    private ResponseContext responseContext;

    public ReadPolicyVersionsResponse() {}

    public ReadPolicyVersionsResponse hasMoreItems(Boolean hasMoreItems) {

        this.hasMoreItems = hasMoreItems;
        return this;
    }

    /**
     * If true, there are more items to return using the &#x60;FirstItem&#x60; parameter in a new
     * request.
     *
     * @return hasMoreItems
     */
    @javax.annotation.Nullable
    public Boolean getHasMoreItems() {
        return hasMoreItems;
    }

    public void setHasMoreItems(Boolean hasMoreItems) {
        this.hasMoreItems = hasMoreItems;
    }

    public ReadPolicyVersionsResponse maxResultsLimit(Integer maxResultsLimit) {

        this.maxResultsLimit = maxResultsLimit;
        return this;
    }

    /**
     * Indicates maximum results defined for the operation.
     *
     * @return maxResultsLimit
     */
    @javax.annotation.Nullable
    public Integer getMaxResultsLimit() {
        return maxResultsLimit;
    }

    public void setMaxResultsLimit(Integer maxResultsLimit) {
        this.maxResultsLimit = maxResultsLimit;
    }

    public ReadPolicyVersionsResponse policyVersions(List<PolicyVersion> policyVersions) {

        this.policyVersions = policyVersions;
        return this;
    }

    public ReadPolicyVersionsResponse addPolicyVersionsItem(PolicyVersion policyVersionsItem) {
        if (this.policyVersions == null) {
            this.policyVersions = new ArrayList<>();
        }
        this.policyVersions.add(policyVersionsItem);
        return this;
    }

    /**
     * A list of all the versions of the policy.
     *
     * @return policyVersions
     */
    @javax.annotation.Nullable
    public List<PolicyVersion> getPolicyVersions() {
        return policyVersions;
    }

    public void setPolicyVersions(List<PolicyVersion> policyVersions) {
        this.policyVersions = policyVersions;
    }

    public ReadPolicyVersionsResponse responseContext(ResponseContext responseContext) {

        this.responseContext = responseContext;
        return this;
    }

    /**
     * Get responseContext
     *
     * @return responseContext
     */
    @javax.annotation.Nullable
    public ResponseContext getResponseContext() {
        return responseContext;
    }

    public void setResponseContext(ResponseContext responseContext) {
        this.responseContext = responseContext;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReadPolicyVersionsResponse readPolicyVersionsResponse = (ReadPolicyVersionsResponse) o;
        return Objects.equals(this.hasMoreItems, readPolicyVersionsResponse.hasMoreItems)
                && Objects.equals(this.maxResultsLimit, readPolicyVersionsResponse.maxResultsLimit)
                && Objects.equals(this.policyVersions, readPolicyVersionsResponse.policyVersions)
                && Objects.equals(this.responseContext, readPolicyVersionsResponse.responseContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasMoreItems, maxResultsLimit, policyVersions, responseContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadPolicyVersionsResponse {\n");
        sb.append("    hasMoreItems: ").append(toIndentedString(hasMoreItems)).append("\n");
        sb.append("    maxResultsLimit: ").append(toIndentedString(maxResultsLimit)).append("\n");
        sb.append("    policyVersions: ").append(toIndentedString(policyVersions)).append("\n");
        sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
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
        openapiFields.add("HasMoreItems");
        openapiFields.add("MaxResultsLimit");
        openapiFields.add("PolicyVersions");
        openapiFields.add("ResponseContext");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ReadPolicyVersionsResponse
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ReadPolicyVersionsResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ReadPolicyVersionsResponse is not"
                                        + " found in the empty JSON string",
                                ReadPolicyVersionsResponse.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ReadPolicyVersionsResponse.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ReadPolicyVersionsResponse` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if (jsonObj.get("PolicyVersions") != null && !jsonObj.get("PolicyVersions").isJsonNull()) {
            JsonArray jsonArraypolicyVersions = jsonObj.getAsJsonArray("PolicyVersions");
            if (jsonArraypolicyVersions != null) {
                // ensure the json data is an array
                if (!jsonObj.get("PolicyVersions").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `PolicyVersions` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("PolicyVersions").toString()));
                }

                // validate the optional field `PolicyVersions` (array)
                for (int i = 0; i < jsonArraypolicyVersions.size(); i++) {
                    PolicyVersion.validateJsonObject(
                            jsonArraypolicyVersions.get(i).getAsJsonObject());
                }
                ;
            }
        }
        // validate the optional field `ResponseContext`
        if (jsonObj.get("ResponseContext") != null
                && !jsonObj.get("ResponseContext").isJsonNull()) {
            ResponseContext.validateJsonObject(jsonObj.getAsJsonObject("ResponseContext"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ReadPolicyVersionsResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ReadPolicyVersionsResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ReadPolicyVersionsResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ReadPolicyVersionsResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ReadPolicyVersionsResponse>() {
                        @Override
                        public void write(JsonWriter out, ReadPolicyVersionsResponse value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ReadPolicyVersionsResponse read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ReadPolicyVersionsResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ReadPolicyVersionsResponse
     * @throws IOException if the JSON string is invalid with respect to ReadPolicyVersionsResponse
     */
    public static ReadPolicyVersionsResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ReadPolicyVersionsResponse.class);
    }

    /**
     * Convert an instance of ReadPolicyVersionsResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

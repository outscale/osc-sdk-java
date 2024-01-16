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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** One or more filters. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiltersApiLog {
    public static final String SERIALIZED_NAME_QUERY_ACCESS_KEYS = "QueryAccessKeys";

    @SerializedName(SERIALIZED_NAME_QUERY_ACCESS_KEYS)
    private List<String> queryAccessKeys = null;

    public static final String SERIALIZED_NAME_QUERY_API_NAMES = "QueryApiNames";

    @SerializedName(SERIALIZED_NAME_QUERY_API_NAMES)
    private List<String> queryApiNames = null;

    public static final String SERIALIZED_NAME_QUERY_CALL_NAMES = "QueryCallNames";

    @SerializedName(SERIALIZED_NAME_QUERY_CALL_NAMES)
    private List<String> queryCallNames = null;

    public static final String SERIALIZED_NAME_QUERY_DATE_AFTER = "QueryDateAfter";

    @SerializedName(SERIALIZED_NAME_QUERY_DATE_AFTER)
    private OffsetDateTime queryDateAfter;

    public static final String SERIALIZED_NAME_QUERY_DATE_BEFORE = "QueryDateBefore";

    @SerializedName(SERIALIZED_NAME_QUERY_DATE_BEFORE)
    private OffsetDateTime queryDateBefore;

    public static final String SERIALIZED_NAME_QUERY_IP_ADDRESSES = "QueryIpAddresses";

    @SerializedName(SERIALIZED_NAME_QUERY_IP_ADDRESSES)
    private List<String> queryIpAddresses = null;

    public static final String SERIALIZED_NAME_QUERY_USER_AGENTS = "QueryUserAgents";

    @SerializedName(SERIALIZED_NAME_QUERY_USER_AGENTS)
    private List<String> queryUserAgents = null;

    public static final String SERIALIZED_NAME_REQUEST_IDS = "RequestIds";

    @SerializedName(SERIALIZED_NAME_REQUEST_IDS)
    private List<String> requestIds = null;

    public static final String SERIALIZED_NAME_RESPONSE_STATUS_CODES = "ResponseStatusCodes";

    @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS_CODES)
    private List<Integer> responseStatusCodes = null;

    public FiltersApiLog() {}

    public FiltersApiLog queryAccessKeys(List<String> queryAccessKeys) {

        this.queryAccessKeys = queryAccessKeys;
        return this;
    }

    public FiltersApiLog addQueryAccessKeysItem(String queryAccessKeysItem) {
        if (this.queryAccessKeys == null) {
            this.queryAccessKeys = new ArrayList<>();
        }
        this.queryAccessKeys.add(queryAccessKeysItem);
        return this;
    }

    /**
     * The access keys used for the logged calls.
     *
     * @return queryAccessKeys
     */
    @javax.annotation.Nullable
    public List<String> getQueryAccessKeys() {
        return queryAccessKeys;
    }

    public void setQueryAccessKeys(List<String> queryAccessKeys) {
        this.queryAccessKeys = queryAccessKeys;
    }

    public FiltersApiLog queryApiNames(List<String> queryApiNames) {

        this.queryApiNames = queryApiNames;
        return this;
    }

    public FiltersApiLog addQueryApiNamesItem(String queryApiNamesItem) {
        if (this.queryApiNames == null) {
            this.queryApiNames = new ArrayList<>();
        }
        this.queryApiNames.add(queryApiNamesItem);
        return this;
    }

    /**
     * The names of the APIs of the logged calls (always &#x60;oapi&#x60; for the OUTSCALE API).
     *
     * @return queryApiNames
     */
    @javax.annotation.Nullable
    public List<String> getQueryApiNames() {
        return queryApiNames;
    }

    public void setQueryApiNames(List<String> queryApiNames) {
        this.queryApiNames = queryApiNames;
    }

    public FiltersApiLog queryCallNames(List<String> queryCallNames) {

        this.queryCallNames = queryCallNames;
        return this;
    }

    public FiltersApiLog addQueryCallNamesItem(String queryCallNamesItem) {
        if (this.queryCallNames == null) {
            this.queryCallNames = new ArrayList<>();
        }
        this.queryCallNames.add(queryCallNamesItem);
        return this;
    }

    /**
     * The names of the logged calls.
     *
     * @return queryCallNames
     */
    @javax.annotation.Nullable
    public List<String> getQueryCallNames() {
        return queryCallNames;
    }

    public void setQueryCallNames(List<String> queryCallNames) {
        this.queryCallNames = queryCallNames;
    }

    public FiltersApiLog queryDateAfter(OffsetDateTime queryDateAfter) {

        this.queryDateAfter = queryDateAfter;
        return this;
    }

    /**
     * The date and time, or the date, after which you want to retrieve logged calls, in ISO 8601
     * format (for example, &#x60;2020-06-14T00:00:00.000Z&#x60; or &#x60;2020-06-14&#x60;). By
     * default, this date is set to 48 hours before the &#x60;QueryDateBefore&#x60; parameter value.
     *
     * @return queryDateAfter
     */
    @javax.annotation.Nullable
    public OffsetDateTime getQueryDateAfter() {
        return queryDateAfter;
    }

    public void setQueryDateAfter(OffsetDateTime queryDateAfter) {
        this.queryDateAfter = queryDateAfter;
    }

    public FiltersApiLog queryDateBefore(OffsetDateTime queryDateBefore) {

        this.queryDateBefore = queryDateBefore;
        return this;
    }

    /**
     * The date and time, or the date, before which you want to retrieve logged calls, in ISO 8601
     * format (for example, &#x60;2020-06-30T00:00:00.000Z&#x60; or &#x60;2020-06-14&#x60;). By
     * default, this date is set to now, or 48 hours after the &#x60;QueryDateAfter&#x60; parameter
     * value.
     *
     * @return queryDateBefore
     */
    @javax.annotation.Nullable
    public OffsetDateTime getQueryDateBefore() {
        return queryDateBefore;
    }

    public void setQueryDateBefore(OffsetDateTime queryDateBefore) {
        this.queryDateBefore = queryDateBefore;
    }

    public FiltersApiLog queryIpAddresses(List<String> queryIpAddresses) {

        this.queryIpAddresses = queryIpAddresses;
        return this;
    }

    public FiltersApiLog addQueryIpAddressesItem(String queryIpAddressesItem) {
        if (this.queryIpAddresses == null) {
            this.queryIpAddresses = new ArrayList<>();
        }
        this.queryIpAddresses.add(queryIpAddressesItem);
        return this;
    }

    /**
     * The IPs used for the logged calls.
     *
     * @return queryIpAddresses
     */
    @javax.annotation.Nullable
    public List<String> getQueryIpAddresses() {
        return queryIpAddresses;
    }

    public void setQueryIpAddresses(List<String> queryIpAddresses) {
        this.queryIpAddresses = queryIpAddresses;
    }

    public FiltersApiLog queryUserAgents(List<String> queryUserAgents) {

        this.queryUserAgents = queryUserAgents;
        return this;
    }

    public FiltersApiLog addQueryUserAgentsItem(String queryUserAgentsItem) {
        if (this.queryUserAgents == null) {
            this.queryUserAgents = new ArrayList<>();
        }
        this.queryUserAgents.add(queryUserAgentsItem);
        return this;
    }

    /**
     * The user agents of the HTTP requests of the logged calls.
     *
     * @return queryUserAgents
     */
    @javax.annotation.Nullable
    public List<String> getQueryUserAgents() {
        return queryUserAgents;
    }

    public void setQueryUserAgents(List<String> queryUserAgents) {
        this.queryUserAgents = queryUserAgents;
    }

    public FiltersApiLog requestIds(List<String> requestIds) {

        this.requestIds = requestIds;
        return this;
    }

    public FiltersApiLog addRequestIdsItem(String requestIdsItem) {
        if (this.requestIds == null) {
            this.requestIds = new ArrayList<>();
        }
        this.requestIds.add(requestIdsItem);
        return this;
    }

    /**
     * The request IDs provided in the responses of the logged calls.
     *
     * @return requestIds
     */
    @javax.annotation.Nullable
    public List<String> getRequestIds() {
        return requestIds;
    }

    public void setRequestIds(List<String> requestIds) {
        this.requestIds = requestIds;
    }

    public FiltersApiLog responseStatusCodes(List<Integer> responseStatusCodes) {

        this.responseStatusCodes = responseStatusCodes;
        return this;
    }

    public FiltersApiLog addResponseStatusCodesItem(Integer responseStatusCodesItem) {
        if (this.responseStatusCodes == null) {
            this.responseStatusCodes = new ArrayList<>();
        }
        this.responseStatusCodes.add(responseStatusCodesItem);
        return this;
    }

    /**
     * The HTTP status codes of the logged calls.
     *
     * @return responseStatusCodes
     */
    @javax.annotation.Nullable
    public List<Integer> getResponseStatusCodes() {
        return responseStatusCodes;
    }

    public void setResponseStatusCodes(List<Integer> responseStatusCodes) {
        this.responseStatusCodes = responseStatusCodes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersApiLog filtersApiLog = (FiltersApiLog) o;
        return Objects.equals(this.queryAccessKeys, filtersApiLog.queryAccessKeys)
                && Objects.equals(this.queryApiNames, filtersApiLog.queryApiNames)
                && Objects.equals(this.queryCallNames, filtersApiLog.queryCallNames)
                && Objects.equals(this.queryDateAfter, filtersApiLog.queryDateAfter)
                && Objects.equals(this.queryDateBefore, filtersApiLog.queryDateBefore)
                && Objects.equals(this.queryIpAddresses, filtersApiLog.queryIpAddresses)
                && Objects.equals(this.queryUserAgents, filtersApiLog.queryUserAgents)
                && Objects.equals(this.requestIds, filtersApiLog.requestIds)
                && Objects.equals(this.responseStatusCodes, filtersApiLog.responseStatusCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                queryAccessKeys,
                queryApiNames,
                queryCallNames,
                queryDateAfter,
                queryDateBefore,
                queryIpAddresses,
                queryUserAgents,
                requestIds,
                responseStatusCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersApiLog {\n");
        sb.append("    queryAccessKeys: ").append(toIndentedString(queryAccessKeys)).append("\n");
        sb.append("    queryApiNames: ").append(toIndentedString(queryApiNames)).append("\n");
        sb.append("    queryCallNames: ").append(toIndentedString(queryCallNames)).append("\n");
        sb.append("    queryDateAfter: ").append(toIndentedString(queryDateAfter)).append("\n");
        sb.append("    queryDateBefore: ").append(toIndentedString(queryDateBefore)).append("\n");
        sb.append("    queryIpAddresses: ").append(toIndentedString(queryIpAddresses)).append("\n");
        sb.append("    queryUserAgents: ").append(toIndentedString(queryUserAgents)).append("\n");
        sb.append("    requestIds: ").append(toIndentedString(requestIds)).append("\n");
        sb.append("    responseStatusCodes: ")
                .append(toIndentedString(responseStatusCodes))
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
        openapiFields.add("QueryAccessKeys");
        openapiFields.add("QueryApiNames");
        openapiFields.add("QueryCallNames");
        openapiFields.add("QueryDateAfter");
        openapiFields.add("QueryDateBefore");
        openapiFields.add("QueryIpAddresses");
        openapiFields.add("QueryUserAgents");
        openapiFields.add("RequestIds");
        openapiFields.add("ResponseStatusCodes");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersApiLog
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersApiLog.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersApiLog is not found in the"
                                        + " empty JSON string",
                                FiltersApiLog.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersApiLog.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersApiLog` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("QueryAccessKeys") != null
                && !jsonObj.get("QueryAccessKeys").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryAccessKeys` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("QueryAccessKeys").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("QueryApiNames") != null && !jsonObj.get("QueryApiNames").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryApiNames` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("QueryApiNames").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("QueryCallNames") != null && !jsonObj.get("QueryCallNames").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryCallNames` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("QueryCallNames").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("QueryIpAddresses") != null
                && !jsonObj.get("QueryIpAddresses").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryIpAddresses` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("QueryIpAddresses").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("QueryUserAgents") != null
                && !jsonObj.get("QueryUserAgents").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryUserAgents` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("QueryUserAgents").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("RequestIds") != null && !jsonObj.get("RequestIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RequestIds` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("RequestIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("ResponseStatusCodes") != null
                && !jsonObj.get("ResponseStatusCodes").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ResponseStatusCodes` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ResponseStatusCodes").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersApiLog.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersApiLog' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersApiLog> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersApiLog.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersApiLog>() {
                        @Override
                        public void write(JsonWriter out, FiltersApiLog value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersApiLog read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersApiLog given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersApiLog
     * @throws IOException if the JSON string is invalid with respect to FiltersApiLog
     */
    public static FiltersApiLog fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersApiLog.class);
    }

    /**
     * Convert an instance of FiltersApiLog to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

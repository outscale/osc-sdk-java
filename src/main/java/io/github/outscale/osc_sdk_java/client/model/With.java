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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** The information to display in each returned log. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class With {
    public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private Boolean accountId = true;

    public static final String SERIALIZED_NAME_CALL_DURATION = "CallDuration";

    @SerializedName(SERIALIZED_NAME_CALL_DURATION)
    private Boolean callDuration = true;

    public static final String SERIALIZED_NAME_QUERY_ACCESS_KEY = "QueryAccessKey";

    @SerializedName(SERIALIZED_NAME_QUERY_ACCESS_KEY)
    private Boolean queryAccessKey = true;

    public static final String SERIALIZED_NAME_QUERY_API_NAME = "QueryApiName";

    @SerializedName(SERIALIZED_NAME_QUERY_API_NAME)
    private Boolean queryApiName = true;

    public static final String SERIALIZED_NAME_QUERY_API_VERSION = "QueryApiVersion";

    @SerializedName(SERIALIZED_NAME_QUERY_API_VERSION)
    private Boolean queryApiVersion = true;

    public static final String SERIALIZED_NAME_QUERY_CALL_NAME = "QueryCallName";

    @SerializedName(SERIALIZED_NAME_QUERY_CALL_NAME)
    private Boolean queryCallName = true;

    public static final String SERIALIZED_NAME_QUERY_DATE = "QueryDate";

    @SerializedName(SERIALIZED_NAME_QUERY_DATE)
    private Boolean queryDate = true;

    public static final String SERIALIZED_NAME_QUERY_HEADER_RAW = "QueryHeaderRaw";

    @SerializedName(SERIALIZED_NAME_QUERY_HEADER_RAW)
    private Boolean queryHeaderRaw = true;

    public static final String SERIALIZED_NAME_QUERY_HEADER_SIZE = "QueryHeaderSize";

    @SerializedName(SERIALIZED_NAME_QUERY_HEADER_SIZE)
    private Boolean queryHeaderSize = true;

    public static final String SERIALIZED_NAME_QUERY_IP_ADDRESS = "QueryIpAddress";

    @SerializedName(SERIALIZED_NAME_QUERY_IP_ADDRESS)
    private Boolean queryIpAddress = true;

    public static final String SERIALIZED_NAME_QUERY_PAYLOAD_RAW = "QueryPayloadRaw";

    @SerializedName(SERIALIZED_NAME_QUERY_PAYLOAD_RAW)
    private Boolean queryPayloadRaw = true;

    public static final String SERIALIZED_NAME_QUERY_PAYLOAD_SIZE = "QueryPayloadSize";

    @SerializedName(SERIALIZED_NAME_QUERY_PAYLOAD_SIZE)
    private Boolean queryPayloadSize = true;

    public static final String SERIALIZED_NAME_QUERY_USER_AGENT = "QueryUserAgent";

    @SerializedName(SERIALIZED_NAME_QUERY_USER_AGENT)
    private Boolean queryUserAgent = true;

    public static final String SERIALIZED_NAME_REQUEST_ID = "RequestId";

    @SerializedName(SERIALIZED_NAME_REQUEST_ID)
    private Boolean requestId = true;

    public static final String SERIALIZED_NAME_RESPONSE_SIZE = "ResponseSize";

    @SerializedName(SERIALIZED_NAME_RESPONSE_SIZE)
    private Boolean responseSize = true;

    public static final String SERIALIZED_NAME_RESPONSE_STATUS_CODE = "ResponseStatusCode";

    @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS_CODE)
    private Boolean responseStatusCode = true;

    public With() {}

    public With accountId(Boolean accountId) {

        this.accountId = accountId;
        return this;
    }

    /**
     * By default or if set to true, the account ID is displayed.
     *
     * @return accountId
     */
    @javax.annotation.Nullable
    public Boolean getAccountId() {
        return accountId;
    }

    public void setAccountId(Boolean accountId) {
        this.accountId = accountId;
    }

    public With callDuration(Boolean callDuration) {

        this.callDuration = callDuration;
        return this;
    }

    /**
     * By default or if set to true, the duration of the call is displayed.
     *
     * @return callDuration
     */
    @javax.annotation.Nullable
    public Boolean getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Boolean callDuration) {
        this.callDuration = callDuration;
    }

    public With queryAccessKey(Boolean queryAccessKey) {

        this.queryAccessKey = queryAccessKey;
        return this;
    }

    /**
     * By default or if set to true, the access key is displayed.
     *
     * @return queryAccessKey
     */
    @javax.annotation.Nullable
    public Boolean getQueryAccessKey() {
        return queryAccessKey;
    }

    public void setQueryAccessKey(Boolean queryAccessKey) {
        this.queryAccessKey = queryAccessKey;
    }

    public With queryApiName(Boolean queryApiName) {

        this.queryApiName = queryApiName;
        return this;
    }

    /**
     * By default or if set to true, the name of the API is displayed.
     *
     * @return queryApiName
     */
    @javax.annotation.Nullable
    public Boolean getQueryApiName() {
        return queryApiName;
    }

    public void setQueryApiName(Boolean queryApiName) {
        this.queryApiName = queryApiName;
    }

    public With queryApiVersion(Boolean queryApiVersion) {

        this.queryApiVersion = queryApiVersion;
        return this;
    }

    /**
     * By default or if set to true, the version of the API is displayed.
     *
     * @return queryApiVersion
     */
    @javax.annotation.Nullable
    public Boolean getQueryApiVersion() {
        return queryApiVersion;
    }

    public void setQueryApiVersion(Boolean queryApiVersion) {
        this.queryApiVersion = queryApiVersion;
    }

    public With queryCallName(Boolean queryCallName) {

        this.queryCallName = queryCallName;
        return this;
    }

    /**
     * By default or if set to true, the name of the call is displayed.
     *
     * @return queryCallName
     */
    @javax.annotation.Nullable
    public Boolean getQueryCallName() {
        return queryCallName;
    }

    public void setQueryCallName(Boolean queryCallName) {
        this.queryCallName = queryCallName;
    }

    public With queryDate(Boolean queryDate) {

        this.queryDate = queryDate;
        return this;
    }

    /**
     * By default or if set to true, the date of the call is displayed.
     *
     * @return queryDate
     */
    @javax.annotation.Nullable
    public Boolean getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(Boolean queryDate) {
        this.queryDate = queryDate;
    }

    public With queryHeaderRaw(Boolean queryHeaderRaw) {

        this.queryHeaderRaw = queryHeaderRaw;
        return this;
    }

    /**
     * By default or if set to true, the raw header of the HTTP request is displayed.
     *
     * @return queryHeaderRaw
     */
    @javax.annotation.Nullable
    public Boolean getQueryHeaderRaw() {
        return queryHeaderRaw;
    }

    public void setQueryHeaderRaw(Boolean queryHeaderRaw) {
        this.queryHeaderRaw = queryHeaderRaw;
    }

    public With queryHeaderSize(Boolean queryHeaderSize) {

        this.queryHeaderSize = queryHeaderSize;
        return this;
    }

    /**
     * By default or if set to true, the size of the raw header of the HTTP request is displayed.
     *
     * @return queryHeaderSize
     */
    @javax.annotation.Nullable
    public Boolean getQueryHeaderSize() {
        return queryHeaderSize;
    }

    public void setQueryHeaderSize(Boolean queryHeaderSize) {
        this.queryHeaderSize = queryHeaderSize;
    }

    public With queryIpAddress(Boolean queryIpAddress) {

        this.queryIpAddress = queryIpAddress;
        return this;
    }

    /**
     * By default or if set to true, the IP is displayed.
     *
     * @return queryIpAddress
     */
    @javax.annotation.Nullable
    public Boolean getQueryIpAddress() {
        return queryIpAddress;
    }

    public void setQueryIpAddress(Boolean queryIpAddress) {
        this.queryIpAddress = queryIpAddress;
    }

    public With queryPayloadRaw(Boolean queryPayloadRaw) {

        this.queryPayloadRaw = queryPayloadRaw;
        return this;
    }

    /**
     * By default or if set to true, the raw payload of the HTTP request is displayed.
     *
     * @return queryPayloadRaw
     */
    @javax.annotation.Nullable
    public Boolean getQueryPayloadRaw() {
        return queryPayloadRaw;
    }

    public void setQueryPayloadRaw(Boolean queryPayloadRaw) {
        this.queryPayloadRaw = queryPayloadRaw;
    }

    public With queryPayloadSize(Boolean queryPayloadSize) {

        this.queryPayloadSize = queryPayloadSize;
        return this;
    }

    /**
     * By default or if set to true, the size of the raw payload of the HTTP request is displayed.
     *
     * @return queryPayloadSize
     */
    @javax.annotation.Nullable
    public Boolean getQueryPayloadSize() {
        return queryPayloadSize;
    }

    public void setQueryPayloadSize(Boolean queryPayloadSize) {
        this.queryPayloadSize = queryPayloadSize;
    }

    public With queryUserAgent(Boolean queryUserAgent) {

        this.queryUserAgent = queryUserAgent;
        return this;
    }

    /**
     * By default or if set to true, the user agent of the HTTP request is displayed.
     *
     * @return queryUserAgent
     */
    @javax.annotation.Nullable
    public Boolean getQueryUserAgent() {
        return queryUserAgent;
    }

    public void setQueryUserAgent(Boolean queryUserAgent) {
        this.queryUserAgent = queryUserAgent;
    }

    public With requestId(Boolean requestId) {

        this.requestId = requestId;
        return this;
    }

    /**
     * By default or if set to true, the request ID is displayed.
     *
     * @return requestId
     */
    @javax.annotation.Nullable
    public Boolean getRequestId() {
        return requestId;
    }

    public void setRequestId(Boolean requestId) {
        this.requestId = requestId;
    }

    public With responseSize(Boolean responseSize) {

        this.responseSize = responseSize;
        return this;
    }

    /**
     * By default or if set to true, the size of the response is displayed.
     *
     * @return responseSize
     */
    @javax.annotation.Nullable
    public Boolean getResponseSize() {
        return responseSize;
    }

    public void setResponseSize(Boolean responseSize) {
        this.responseSize = responseSize;
    }

    public With responseStatusCode(Boolean responseStatusCode) {

        this.responseStatusCode = responseStatusCode;
        return this;
    }

    /**
     * By default or if set to true, the HTTP status code of the response is displayed.
     *
     * @return responseStatusCode
     */
    @javax.annotation.Nullable
    public Boolean getResponseStatusCode() {
        return responseStatusCode;
    }

    public void setResponseStatusCode(Boolean responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        With with = (With) o;
        return Objects.equals(this.accountId, with.accountId)
                && Objects.equals(this.callDuration, with.callDuration)
                && Objects.equals(this.queryAccessKey, with.queryAccessKey)
                && Objects.equals(this.queryApiName, with.queryApiName)
                && Objects.equals(this.queryApiVersion, with.queryApiVersion)
                && Objects.equals(this.queryCallName, with.queryCallName)
                && Objects.equals(this.queryDate, with.queryDate)
                && Objects.equals(this.queryHeaderRaw, with.queryHeaderRaw)
                && Objects.equals(this.queryHeaderSize, with.queryHeaderSize)
                && Objects.equals(this.queryIpAddress, with.queryIpAddress)
                && Objects.equals(this.queryPayloadRaw, with.queryPayloadRaw)
                && Objects.equals(this.queryPayloadSize, with.queryPayloadSize)
                && Objects.equals(this.queryUserAgent, with.queryUserAgent)
                && Objects.equals(this.requestId, with.requestId)
                && Objects.equals(this.responseSize, with.responseSize)
                && Objects.equals(this.responseStatusCode, with.responseStatusCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accountId,
                callDuration,
                queryAccessKey,
                queryApiName,
                queryApiVersion,
                queryCallName,
                queryDate,
                queryHeaderRaw,
                queryHeaderSize,
                queryIpAddress,
                queryPayloadRaw,
                queryPayloadSize,
                queryUserAgent,
                requestId,
                responseSize,
                responseStatusCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class With {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    callDuration: ").append(toIndentedString(callDuration)).append("\n");
        sb.append("    queryAccessKey: ").append(toIndentedString(queryAccessKey)).append("\n");
        sb.append("    queryApiName: ").append(toIndentedString(queryApiName)).append("\n");
        sb.append("    queryApiVersion: ").append(toIndentedString(queryApiVersion)).append("\n");
        sb.append("    queryCallName: ").append(toIndentedString(queryCallName)).append("\n");
        sb.append("    queryDate: ").append(toIndentedString(queryDate)).append("\n");
        sb.append("    queryHeaderRaw: ").append(toIndentedString(queryHeaderRaw)).append("\n");
        sb.append("    queryHeaderSize: ").append(toIndentedString(queryHeaderSize)).append("\n");
        sb.append("    queryIpAddress: ").append(toIndentedString(queryIpAddress)).append("\n");
        sb.append("    queryPayloadRaw: ").append(toIndentedString(queryPayloadRaw)).append("\n");
        sb.append("    queryPayloadSize: ").append(toIndentedString(queryPayloadSize)).append("\n");
        sb.append("    queryUserAgent: ").append(toIndentedString(queryUserAgent)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    responseSize: ").append(toIndentedString(responseSize)).append("\n");
        sb.append("    responseStatusCode: ")
                .append(toIndentedString(responseStatusCode))
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
        openapiFields.add("AccountId");
        openapiFields.add("CallDuration");
        openapiFields.add("QueryAccessKey");
        openapiFields.add("QueryApiName");
        openapiFields.add("QueryApiVersion");
        openapiFields.add("QueryCallName");
        openapiFields.add("QueryDate");
        openapiFields.add("QueryHeaderRaw");
        openapiFields.add("QueryHeaderSize");
        openapiFields.add("QueryIpAddress");
        openapiFields.add("QueryPayloadRaw");
        openapiFields.add("QueryPayloadSize");
        openapiFields.add("QueryUserAgent");
        openapiFields.add("RequestId");
        openapiFields.add("ResponseSize");
        openapiFields.add("ResponseStatusCode");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to With
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!With.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in With is not found in the empty JSON"
                                        + " string",
                                With.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!With.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `With`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!With.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'With' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<With> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(With.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<With>() {
                        @Override
                        public void write(JsonWriter out, With value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public With read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of With given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of With
     * @throws IOException if the JSON string is invalid with respect to With
     */
    public static With fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, With.class);
    }

    /**
     * Convert an instance of With to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

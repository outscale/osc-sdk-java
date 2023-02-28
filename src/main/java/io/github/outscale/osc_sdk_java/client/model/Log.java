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
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Information about the log. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Log {
    public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private String accountId;

    public static final String SERIALIZED_NAME_CALL_DURATION = "CallDuration";

    @SerializedName(SERIALIZED_NAME_CALL_DURATION)
    private Integer callDuration;

    public static final String SERIALIZED_NAME_QUERY_ACCESS_KEY = "QueryAccessKey";

    @SerializedName(SERIALIZED_NAME_QUERY_ACCESS_KEY)
    private String queryAccessKey;

    public static final String SERIALIZED_NAME_QUERY_API_NAME = "QueryApiName";

    @SerializedName(SERIALIZED_NAME_QUERY_API_NAME)
    private String queryApiName;

    public static final String SERIALIZED_NAME_QUERY_API_VERSION = "QueryApiVersion";

    @SerializedName(SERIALIZED_NAME_QUERY_API_VERSION)
    private String queryApiVersion;

    public static final String SERIALIZED_NAME_QUERY_CALL_NAME = "QueryCallName";

    @SerializedName(SERIALIZED_NAME_QUERY_CALL_NAME)
    private String queryCallName;

    public static final String SERIALIZED_NAME_QUERY_DATE = "QueryDate";

    @SerializedName(SERIALIZED_NAME_QUERY_DATE)
    private OffsetDateTime queryDate;

    public static final String SERIALIZED_NAME_QUERY_HEADER_RAW = "QueryHeaderRaw";

    @SerializedName(SERIALIZED_NAME_QUERY_HEADER_RAW)
    private String queryHeaderRaw;

    public static final String SERIALIZED_NAME_QUERY_HEADER_SIZE = "QueryHeaderSize";

    @SerializedName(SERIALIZED_NAME_QUERY_HEADER_SIZE)
    private Integer queryHeaderSize;

    public static final String SERIALIZED_NAME_QUERY_IP_ADDRESS = "QueryIpAddress";

    @SerializedName(SERIALIZED_NAME_QUERY_IP_ADDRESS)
    private String queryIpAddress;

    public static final String SERIALIZED_NAME_QUERY_PAYLOAD_RAW = "QueryPayloadRaw";

    @SerializedName(SERIALIZED_NAME_QUERY_PAYLOAD_RAW)
    private String queryPayloadRaw;

    public static final String SERIALIZED_NAME_QUERY_PAYLOAD_SIZE = "QueryPayloadSize";

    @SerializedName(SERIALIZED_NAME_QUERY_PAYLOAD_SIZE)
    private Integer queryPayloadSize;

    public static final String SERIALIZED_NAME_QUERY_USER_AGENT = "QueryUserAgent";

    @SerializedName(SERIALIZED_NAME_QUERY_USER_AGENT)
    private String queryUserAgent;

    public static final String SERIALIZED_NAME_REQUEST_ID = "RequestId";

    @SerializedName(SERIALIZED_NAME_REQUEST_ID)
    private String requestId;

    public static final String SERIALIZED_NAME_RESPONSE_SIZE = "ResponseSize";

    @SerializedName(SERIALIZED_NAME_RESPONSE_SIZE)
    private Integer responseSize;

    public static final String SERIALIZED_NAME_RESPONSE_STATUS_CODE = "ResponseStatusCode";

    @SerializedName(SERIALIZED_NAME_RESPONSE_STATUS_CODE)
    private Integer responseStatusCode;

    public Log() {}

    public Log accountId(String accountId) {

        this.accountId = accountId;
        return this;
    }

    /**
     * The account ID of the logged call.
     *
     * @return accountId
     */
    @javax.annotation.Nullable
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Log callDuration(Integer callDuration) {

        this.callDuration = callDuration;
        return this;
    }

    /**
     * The duration of the logged call, in microseconds.
     *
     * @return callDuration
     */
    @javax.annotation.Nullable
    public Integer getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
    }

    public Log queryAccessKey(String queryAccessKey) {

        this.queryAccessKey = queryAccessKey;
        return this;
    }

    /**
     * The access key used for the logged call.
     *
     * @return queryAccessKey
     */
    @javax.annotation.Nullable
    public String getQueryAccessKey() {
        return queryAccessKey;
    }

    public void setQueryAccessKey(String queryAccessKey) {
        this.queryAccessKey = queryAccessKey;
    }

    public Log queryApiName(String queryApiName) {

        this.queryApiName = queryApiName;
        return this;
    }

    /**
     * The name of the API used by the logged call (always &#x60;oapi&#x60; for the OUTSCALE API).
     *
     * @return queryApiName
     */
    @javax.annotation.Nullable
    public String getQueryApiName() {
        return queryApiName;
    }

    public void setQueryApiName(String queryApiName) {
        this.queryApiName = queryApiName;
    }

    public Log queryApiVersion(String queryApiVersion) {

        this.queryApiVersion = queryApiVersion;
        return this;
    }

    /**
     * The version of the API used by the logged call.
     *
     * @return queryApiVersion
     */
    @javax.annotation.Nullable
    public String getQueryApiVersion() {
        return queryApiVersion;
    }

    public void setQueryApiVersion(String queryApiVersion) {
        this.queryApiVersion = queryApiVersion;
    }

    public Log queryCallName(String queryCallName) {

        this.queryCallName = queryCallName;
        return this;
    }

    /**
     * The name of the logged call.
     *
     * @return queryCallName
     */
    @javax.annotation.Nullable
    public String getQueryCallName() {
        return queryCallName;
    }

    public void setQueryCallName(String queryCallName) {
        this.queryCallName = queryCallName;
    }

    public Log queryDate(OffsetDateTime queryDate) {

        this.queryDate = queryDate;
        return this;
    }

    /**
     * The date of the logged call, in ISO 8601 format.
     *
     * @return queryDate
     */
    @javax.annotation.Nullable
    public OffsetDateTime getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(OffsetDateTime queryDate) {
        this.queryDate = queryDate;
    }

    public Log queryHeaderRaw(String queryHeaderRaw) {

        this.queryHeaderRaw = queryHeaderRaw;
        return this;
    }

    /**
     * The raw header of the HTTP request of the logged call.
     *
     * @return queryHeaderRaw
     */
    @javax.annotation.Nullable
    public String getQueryHeaderRaw() {
        return queryHeaderRaw;
    }

    public void setQueryHeaderRaw(String queryHeaderRaw) {
        this.queryHeaderRaw = queryHeaderRaw;
    }

    public Log queryHeaderSize(Integer queryHeaderSize) {

        this.queryHeaderSize = queryHeaderSize;
        return this;
    }

    /**
     * The size of the raw header of the HTTP request of the logged call, in bytes.
     *
     * @return queryHeaderSize
     */
    @javax.annotation.Nullable
    public Integer getQueryHeaderSize() {
        return queryHeaderSize;
    }

    public void setQueryHeaderSize(Integer queryHeaderSize) {
        this.queryHeaderSize = queryHeaderSize;
    }

    public Log queryIpAddress(String queryIpAddress) {

        this.queryIpAddress = queryIpAddress;
        return this;
    }

    /**
     * The IP used for the logged call.
     *
     * @return queryIpAddress
     */
    @javax.annotation.Nullable
    public String getQueryIpAddress() {
        return queryIpAddress;
    }

    public void setQueryIpAddress(String queryIpAddress) {
        this.queryIpAddress = queryIpAddress;
    }

    public Log queryPayloadRaw(String queryPayloadRaw) {

        this.queryPayloadRaw = queryPayloadRaw;
        return this;
    }

    /**
     * The raw payload of the HTTP request of the logged call.
     *
     * @return queryPayloadRaw
     */
    @javax.annotation.Nullable
    public String getQueryPayloadRaw() {
        return queryPayloadRaw;
    }

    public void setQueryPayloadRaw(String queryPayloadRaw) {
        this.queryPayloadRaw = queryPayloadRaw;
    }

    public Log queryPayloadSize(Integer queryPayloadSize) {

        this.queryPayloadSize = queryPayloadSize;
        return this;
    }

    /**
     * The size of the raw payload of the HTTP request of the logged call, in bytes.
     *
     * @return queryPayloadSize
     */
    @javax.annotation.Nullable
    public Integer getQueryPayloadSize() {
        return queryPayloadSize;
    }

    public void setQueryPayloadSize(Integer queryPayloadSize) {
        this.queryPayloadSize = queryPayloadSize;
    }

    public Log queryUserAgent(String queryUserAgent) {

        this.queryUserAgent = queryUserAgent;
        return this;
    }

    /**
     * The user agent of the HTTP request of the logged call.
     *
     * @return queryUserAgent
     */
    @javax.annotation.Nullable
    public String getQueryUserAgent() {
        return queryUserAgent;
    }

    public void setQueryUserAgent(String queryUserAgent) {
        this.queryUserAgent = queryUserAgent;
    }

    public Log requestId(String requestId) {

        this.requestId = requestId;
        return this;
    }

    /**
     * The request ID provided in the response of the logged call.
     *
     * @return requestId
     */
    @javax.annotation.Nullable
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Log responseSize(Integer responseSize) {

        this.responseSize = responseSize;
        return this;
    }

    /**
     * The size of the response of the logged call, in bytes.
     *
     * @return responseSize
     */
    @javax.annotation.Nullable
    public Integer getResponseSize() {
        return responseSize;
    }

    public void setResponseSize(Integer responseSize) {
        this.responseSize = responseSize;
    }

    public Log responseStatusCode(Integer responseStatusCode) {

        this.responseStatusCode = responseStatusCode;
        return this;
    }

    /**
     * The HTTP status code of the response of the logged call.
     *
     * @return responseStatusCode
     */
    @javax.annotation.Nullable
    public Integer getResponseStatusCode() {
        return responseStatusCode;
    }

    public void setResponseStatusCode(Integer responseStatusCode) {
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
        Log log = (Log) o;
        return Objects.equals(this.accountId, log.accountId)
                && Objects.equals(this.callDuration, log.callDuration)
                && Objects.equals(this.queryAccessKey, log.queryAccessKey)
                && Objects.equals(this.queryApiName, log.queryApiName)
                && Objects.equals(this.queryApiVersion, log.queryApiVersion)
                && Objects.equals(this.queryCallName, log.queryCallName)
                && Objects.equals(this.queryDate, log.queryDate)
                && Objects.equals(this.queryHeaderRaw, log.queryHeaderRaw)
                && Objects.equals(this.queryHeaderSize, log.queryHeaderSize)
                && Objects.equals(this.queryIpAddress, log.queryIpAddress)
                && Objects.equals(this.queryPayloadRaw, log.queryPayloadRaw)
                && Objects.equals(this.queryPayloadSize, log.queryPayloadSize)
                && Objects.equals(this.queryUserAgent, log.queryUserAgent)
                && Objects.equals(this.requestId, log.requestId)
                && Objects.equals(this.responseSize, log.responseSize)
                && Objects.equals(this.responseStatusCode, log.responseStatusCode);
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
        sb.append("class Log {\n");
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
     * @throws IOException if the JSON Object is invalid with respect to Log
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Log.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Log is not found in the empty JSON"
                                        + " string",
                                Log.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Log.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Log`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("AccountId") != null && !jsonObj.get("AccountId").isJsonNull())
                && !jsonObj.get("AccountId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `AccountId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("AccountId").toString()));
        }
        if ((jsonObj.get("QueryAccessKey") != null && !jsonObj.get("QueryAccessKey").isJsonNull())
                && !jsonObj.get("QueryAccessKey").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryAccessKey` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("QueryAccessKey").toString()));
        }
        if ((jsonObj.get("QueryApiName") != null && !jsonObj.get("QueryApiName").isJsonNull())
                && !jsonObj.get("QueryApiName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryApiName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("QueryApiName").toString()));
        }
        if ((jsonObj.get("QueryApiVersion") != null && !jsonObj.get("QueryApiVersion").isJsonNull())
                && !jsonObj.get("QueryApiVersion").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryApiVersion` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("QueryApiVersion").toString()));
        }
        if ((jsonObj.get("QueryCallName") != null && !jsonObj.get("QueryCallName").isJsonNull())
                && !jsonObj.get("QueryCallName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryCallName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("QueryCallName").toString()));
        }
        if ((jsonObj.get("QueryHeaderRaw") != null && !jsonObj.get("QueryHeaderRaw").isJsonNull())
                && !jsonObj.get("QueryHeaderRaw").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryHeaderRaw` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("QueryHeaderRaw").toString()));
        }
        if ((jsonObj.get("QueryIpAddress") != null && !jsonObj.get("QueryIpAddress").isJsonNull())
                && !jsonObj.get("QueryIpAddress").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryIpAddress` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("QueryIpAddress").toString()));
        }
        if ((jsonObj.get("QueryPayloadRaw") != null && !jsonObj.get("QueryPayloadRaw").isJsonNull())
                && !jsonObj.get("QueryPayloadRaw").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryPayloadRaw` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("QueryPayloadRaw").toString()));
        }
        if ((jsonObj.get("QueryUserAgent") != null && !jsonObj.get("QueryUserAgent").isJsonNull())
                && !jsonObj.get("QueryUserAgent").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QueryUserAgent` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("QueryUserAgent").toString()));
        }
        if ((jsonObj.get("RequestId") != null && !jsonObj.get("RequestId").isJsonNull())
                && !jsonObj.get("RequestId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `RequestId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("RequestId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Log.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Log' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Log> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Log.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Log>() {
                        @Override
                        public void write(JsonWriter out, Log value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Log read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Log given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Log
     * @throws IOException if the JSON string is invalid with respect to Log
     */
    public static Log fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Log.class);
    }

    /**
     * Convert an instance of Log to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

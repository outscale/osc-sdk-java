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
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** ReadConsumptionAccountRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadConsumptionAccountRequest {
    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_FROM_DATE = "FromDate";

    @SerializedName(SERIALIZED_NAME_FROM_DATE)
    private LocalDate fromDate;

    public static final String SERIALIZED_NAME_OVERALL = "Overall";

    @SerializedName(SERIALIZED_NAME_OVERALL)
    private Boolean overall = false;

    public static final String SERIALIZED_NAME_SHOW_PRICE = "ShowPrice";

    @SerializedName(SERIALIZED_NAME_SHOW_PRICE)
    private Boolean showPrice;

    public static final String SERIALIZED_NAME_TO_DATE = "ToDate";

    @SerializedName(SERIALIZED_NAME_TO_DATE)
    private LocalDate toDate;

    public ReadConsumptionAccountRequest() {}

    public ReadConsumptionAccountRequest dryRun(Boolean dryRun) {

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

    public ReadConsumptionAccountRequest fromDate(LocalDate fromDate) {

        this.fromDate = fromDate;
        return this;
    }

    /**
     * The beginning of the time period, in ISO 8601 date format (for example,
     * &#x60;2020-06-14&#x60;). The date-time format is also accepted, but only with a time set to
     * midnight (for example, &#x60;2020-06-14T00:00:00.000Z&#x60;). This value is included in the
     * time period.
     *
     * @return fromDate
     */
    @javax.annotation.Nonnull
    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public ReadConsumptionAccountRequest overall(Boolean overall) {

        this.overall = overall;
        return this;
    }

    /**
     * By default or if false, returns only the consumption of the specific account that sends this
     * request. If true, returns either the overall consumption of your paying account and all
     * linked accounts (if the account that sends this request is a paying account) or returns
     * nothing (if the account that sends this request is a linked account).
     *
     * @return overall
     */
    @javax.annotation.Nullable
    public Boolean getOverall() {
        return overall;
    }

    public void setOverall(Boolean overall) {
        this.overall = overall;
    }

    public ReadConsumptionAccountRequest showPrice(Boolean showPrice) {

        this.showPrice = showPrice;
        return this;
    }

    /**
     * If true, the response also includes the unit price of the consumed resource
     * (&#x60;UnitPrice&#x60;) and the total price of the consumed resource during the specified
     * time period (&#x60;Price&#x60;), in the currency of your account.
     *
     * @return showPrice
     */
    @javax.annotation.Nullable
    public Boolean getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(Boolean showPrice) {
        this.showPrice = showPrice;
    }

    public ReadConsumptionAccountRequest toDate(LocalDate toDate) {

        this.toDate = toDate;
        return this;
    }

    /**
     * The end of the time period, in ISO 8601 date format (for example, &#x60;2020-06-30&#x60;).
     * The date-time format is also accepted, but only with a time set to midnight (for example,
     * &#x60;2020-06-30T00:00:00.000Z&#x60;). This value is excluded from the time period, and must
     * be set to a later date than &#x60;FromDate&#x60;.
     *
     * @return toDate
     */
    @javax.annotation.Nonnull
    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReadConsumptionAccountRequest readConsumptionAccountRequest =
                (ReadConsumptionAccountRequest) o;
        return Objects.equals(this.dryRun, readConsumptionAccountRequest.dryRun)
                && Objects.equals(this.fromDate, readConsumptionAccountRequest.fromDate)
                && Objects.equals(this.overall, readConsumptionAccountRequest.overall)
                && Objects.equals(this.showPrice, readConsumptionAccountRequest.showPrice)
                && Objects.equals(this.toDate, readConsumptionAccountRequest.toDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, fromDate, overall, showPrice, toDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadConsumptionAccountRequest {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
        sb.append("    showPrice: ").append(toIndentedString(showPrice)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
        openapiFields.add("FromDate");
        openapiFields.add("Overall");
        openapiFields.add("ShowPrice");
        openapiFields.add("ToDate");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("FromDate");
        openapiRequiredFields.add("ToDate");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to
     *     ReadConsumptionAccountRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ReadConsumptionAccountRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ReadConsumptionAccountRequest is not"
                                        + " found in the empty JSON string",
                                ReadConsumptionAccountRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ReadConsumptionAccountRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ReadConsumptionAccountRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ReadConsumptionAccountRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ReadConsumptionAccountRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ReadConsumptionAccountRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ReadConsumptionAccountRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ReadConsumptionAccountRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ReadConsumptionAccountRequest>() {
                        @Override
                        public void write(JsonWriter out, ReadConsumptionAccountRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ReadConsumptionAccountRequest read(JsonReader in)
                                throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ReadConsumptionAccountRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ReadConsumptionAccountRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     ReadConsumptionAccountRequest
     */
    public static ReadConsumptionAccountRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ReadConsumptionAccountRequest.class);
    }

    /**
     * Convert an instance of ReadConsumptionAccountRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

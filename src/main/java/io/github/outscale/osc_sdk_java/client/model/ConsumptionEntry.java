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
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Information about the resources consumed during the specified time period. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsumptionEntry {
    public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private String accountId;

    public static final String SERIALIZED_NAME_CATEGORY = "Category";

    @SerializedName(SERIALIZED_NAME_CATEGORY)
    private String category;

    public static final String SERIALIZED_NAME_FROM_DATE = "FromDate";

    @SerializedName(SERIALIZED_NAME_FROM_DATE)
    private OffsetDateTime fromDate;

    public static final String SERIALIZED_NAME_OPERATION = "Operation";

    @SerializedName(SERIALIZED_NAME_OPERATION)
    private String operation;

    public static final String SERIALIZED_NAME_PAYING_ACCOUNT_ID = "PayingAccountId";

    @SerializedName(SERIALIZED_NAME_PAYING_ACCOUNT_ID)
    private String payingAccountId;

    public static final String SERIALIZED_NAME_PRICE = "Price";

    @SerializedName(SERIALIZED_NAME_PRICE)
    private Double price;

    public static final String SERIALIZED_NAME_SERVICE = "Service";

    @SerializedName(SERIALIZED_NAME_SERVICE)
    private String service;

    public static final String SERIALIZED_NAME_SUBREGION_NAME = "SubregionName";

    @SerializedName(SERIALIZED_NAME_SUBREGION_NAME)
    private String subregionName;

    public static final String SERIALIZED_NAME_TITLE = "Title";

    @SerializedName(SERIALIZED_NAME_TITLE)
    private String title;

    public static final String SERIALIZED_NAME_TO_DATE = "ToDate";

    @SerializedName(SERIALIZED_NAME_TO_DATE)
    private OffsetDateTime toDate;

    public static final String SERIALIZED_NAME_TYPE = "Type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_UNIT_PRICE = "UnitPrice";

    @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
    private Double unitPrice;

    public static final String SERIALIZED_NAME_VALUE = "Value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    private Double value;

    public ConsumptionEntry() {}

    public ConsumptionEntry accountId(String accountId) {

        this.accountId = accountId;
        return this;
    }

    /**
     * The ID of your TINA account.
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

    public ConsumptionEntry category(String category) {

        this.category = category;
        return this;
    }

    /**
     * The category of the resource (for example, &#x60;network&#x60;).
     *
     * @return category
     */
    @javax.annotation.Nullable
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ConsumptionEntry fromDate(OffsetDateTime fromDate) {

        this.fromDate = fromDate;
        return this;
    }

    /**
     * The beginning of the time period (UTC).
     *
     * @return fromDate
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(OffsetDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public ConsumptionEntry operation(String operation) {

        this.operation = operation;
        return this;
    }

    /**
     * The API call that triggered the resource consumption (for example, &#x60;RunInstances&#x60;
     * or &#x60;CreateVolume&#x60;).
     *
     * @return operation
     */
    @javax.annotation.Nullable
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ConsumptionEntry payingAccountId(String payingAccountId) {

        this.payingAccountId = payingAccountId;
        return this;
    }

    /**
     * The ID of the TINA account which is billed for your consumption. It can be different from
     * your account in the &#x60;AccountId&#x60; parameter.
     *
     * @return payingAccountId
     */
    @javax.annotation.Nullable
    public String getPayingAccountId() {
        return payingAccountId;
    }

    public void setPayingAccountId(String payingAccountId) {
        this.payingAccountId = payingAccountId;
    }

    public ConsumptionEntry price(Double price) {

        this.price = price;
        return this;
    }

    /**
     * The total price of the consumed resource during the specified time period, in the currency of
     * the Region&#39;s catalog.
     *
     * @return price
     */
    @javax.annotation.Nullable
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ConsumptionEntry service(String service) {

        this.service = service;
        return this;
    }

    /**
     * The service of the API call (&#x60;TinaOS-FCU&#x60;, &#x60;TinaOS-LBU&#x60;,
     * &#x60;TinaOS-DirectLink&#x60;, &#x60;TinaOS-OOS&#x60;, or &#x60;TinaOS-OSU&#x60;).
     *
     * @return service
     */
    @javax.annotation.Nullable
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public ConsumptionEntry subregionName(String subregionName) {

        this.subregionName = subregionName;
        return this;
    }

    /**
     * The name of the Subregion.
     *
     * @return subregionName
     */
    @javax.annotation.Nullable
    public String getSubregionName() {
        return subregionName;
    }

    public void setSubregionName(String subregionName) {
        this.subregionName = subregionName;
    }

    public ConsumptionEntry title(String title) {

        this.title = title;
        return this;
    }

    /**
     * A description of the consumed resource.
     *
     * @return title
     */
    @javax.annotation.Nullable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ConsumptionEntry toDate(OffsetDateTime toDate) {

        this.toDate = toDate;
        return this;
    }

    /**
     * The end of the time period (UTC).
     *
     * @return toDate
     */
    @javax.annotation.Nullable
    public OffsetDateTime getToDate() {
        return toDate;
    }

    public void setToDate(OffsetDateTime toDate) {
        this.toDate = toDate;
    }

    public ConsumptionEntry type(String type) {

        this.type = type;
        return this;
    }

    /**
     * The type of resource, depending on the API call.
     *
     * @return type
     */
    @javax.annotation.Nullable
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConsumptionEntry unitPrice(Double unitPrice) {

        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * The unit price of the consumed resource, in the currency of the Region&#39;s catalog.
     *
     * @return unitPrice
     */
    @javax.annotation.Nullable
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ConsumptionEntry value(Double value) {

        this.value = value;
        return this;
    }

    /**
     * The consumed amount for the resource. The unit depends on the resource type. For more
     * information, see the &#x60;Title&#x60; element.
     *
     * @return value
     */
    @javax.annotation.Nullable
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsumptionEntry consumptionEntry = (ConsumptionEntry) o;
        return Objects.equals(this.accountId, consumptionEntry.accountId)
                && Objects.equals(this.category, consumptionEntry.category)
                && Objects.equals(this.fromDate, consumptionEntry.fromDate)
                && Objects.equals(this.operation, consumptionEntry.operation)
                && Objects.equals(this.payingAccountId, consumptionEntry.payingAccountId)
                && Objects.equals(this.price, consumptionEntry.price)
                && Objects.equals(this.service, consumptionEntry.service)
                && Objects.equals(this.subregionName, consumptionEntry.subregionName)
                && Objects.equals(this.title, consumptionEntry.title)
                && Objects.equals(this.toDate, consumptionEntry.toDate)
                && Objects.equals(this.type, consumptionEntry.type)
                && Objects.equals(this.unitPrice, consumptionEntry.unitPrice)
                && Objects.equals(this.value, consumptionEntry.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accountId,
                category,
                fromDate,
                operation,
                payingAccountId,
                price,
                service,
                subregionName,
                title,
                toDate,
                type,
                unitPrice,
                value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumptionEntry {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    payingAccountId: ").append(toIndentedString(payingAccountId)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    subregionName: ").append(toIndentedString(subregionName)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
        openapiFields.add("Category");
        openapiFields.add("FromDate");
        openapiFields.add("Operation");
        openapiFields.add("PayingAccountId");
        openapiFields.add("Price");
        openapiFields.add("Service");
        openapiFields.add("SubregionName");
        openapiFields.add("Title");
        openapiFields.add("ToDate");
        openapiFields.add("Type");
        openapiFields.add("UnitPrice");
        openapiFields.add("Value");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ConsumptionEntry
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ConsumptionEntry.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ConsumptionEntry is not found in the"
                                        + " empty JSON string",
                                ConsumptionEntry.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ConsumptionEntry.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ConsumptionEntry` properties. JSON: %s",
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
        if ((jsonObj.get("Category") != null && !jsonObj.get("Category").isJsonNull())
                && !jsonObj.get("Category").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Category` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Category").toString()));
        }
        if ((jsonObj.get("Operation") != null && !jsonObj.get("Operation").isJsonNull())
                && !jsonObj.get("Operation").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Operation` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Operation").toString()));
        }
        if ((jsonObj.get("PayingAccountId") != null && !jsonObj.get("PayingAccountId").isJsonNull())
                && !jsonObj.get("PayingAccountId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PayingAccountId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("PayingAccountId").toString()));
        }
        if ((jsonObj.get("Service") != null && !jsonObj.get("Service").isJsonNull())
                && !jsonObj.get("Service").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Service` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Service").toString()));
        }
        if ((jsonObj.get("SubregionName") != null && !jsonObj.get("SubregionName").isJsonNull())
                && !jsonObj.get("SubregionName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubregionName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SubregionName").toString()));
        }
        if ((jsonObj.get("Title") != null && !jsonObj.get("Title").isJsonNull())
                && !jsonObj.get("Title").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Title` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Title").toString()));
        }
        if ((jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull())
                && !jsonObj.get("Type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Type").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ConsumptionEntry.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ConsumptionEntry' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ConsumptionEntry> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ConsumptionEntry.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ConsumptionEntry>() {
                        @Override
                        public void write(JsonWriter out, ConsumptionEntry value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ConsumptionEntry read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ConsumptionEntry given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ConsumptionEntry
     * @throws IOException if the JSON string is invalid with respect to ConsumptionEntry
     */
    public static ConsumptionEntry fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ConsumptionEntry.class);
    }

    /**
     * Convert an instance of ConsumptionEntry to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

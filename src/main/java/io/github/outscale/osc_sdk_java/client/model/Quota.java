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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Information about the quota. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Quota {
    public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private String accountId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "Description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_MAX_VALUE = "MaxValue";

    @SerializedName(SERIALIZED_NAME_MAX_VALUE)
    private Integer maxValue;

    public static final String SERIALIZED_NAME_NAME = "Name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_QUOTA_COLLECTION = "QuotaCollection";

    @SerializedName(SERIALIZED_NAME_QUOTA_COLLECTION)
    private String quotaCollection;

    public static final String SERIALIZED_NAME_SHORT_DESCRIPTION = "ShortDescription";

    @SerializedName(SERIALIZED_NAME_SHORT_DESCRIPTION)
    private String shortDescription;

    public static final String SERIALIZED_NAME_USED_VALUE = "UsedValue";

    @SerializedName(SERIALIZED_NAME_USED_VALUE)
    private Integer usedValue;

    public Quota() {}

    public Quota accountId(String accountId) {

        this.accountId = accountId;
        return this;
    }

    /**
     * The account ID of the owner of the quotas.
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

    public Quota description(String description) {

        this.description = description;
        return this;
    }

    /**
     * The description of the quota.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Quota maxValue(Integer maxValue) {

        this.maxValue = maxValue;
        return this;
    }

    /**
     * The maximum value of the quota for the account (if there is no limit, &#x60;0&#x60;).
     *
     * @return maxValue
     */
    @javax.annotation.Nullable
    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }

    public Quota name(String name) {

        this.name = name;
        return this;
    }

    /**
     * The unique name of the quota.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Quota quotaCollection(String quotaCollection) {

        this.quotaCollection = quotaCollection;
        return this;
    }

    /**
     * The group name of the quota.
     *
     * @return quotaCollection
     */
    @javax.annotation.Nullable
    public String getQuotaCollection() {
        return quotaCollection;
    }

    public void setQuotaCollection(String quotaCollection) {
        this.quotaCollection = quotaCollection;
    }

    public Quota shortDescription(String shortDescription) {

        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * The description of the quota.
     *
     * @return shortDescription
     */
    @javax.annotation.Nullable
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Quota usedValue(Integer usedValue) {

        this.usedValue = usedValue;
        return this;
    }

    /**
     * The limit value currently used by the account.
     *
     * @return usedValue
     */
    @javax.annotation.Nullable
    public Integer getUsedValue() {
        return usedValue;
    }

    public void setUsedValue(Integer usedValue) {
        this.usedValue = usedValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Quota quota = (Quota) o;
        return Objects.equals(this.accountId, quota.accountId)
                && Objects.equals(this.description, quota.description)
                && Objects.equals(this.maxValue, quota.maxValue)
                && Objects.equals(this.name, quota.name)
                && Objects.equals(this.quotaCollection, quota.quotaCollection)
                && Objects.equals(this.shortDescription, quota.shortDescription)
                && Objects.equals(this.usedValue, quota.usedValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accountId,
                description,
                maxValue,
                name,
                quotaCollection,
                shortDescription,
                usedValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quota {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    quotaCollection: ").append(toIndentedString(quotaCollection)).append("\n");
        sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
        sb.append("    usedValue: ").append(toIndentedString(usedValue)).append("\n");
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
        openapiFields.add("Description");
        openapiFields.add("MaxValue");
        openapiFields.add("Name");
        openapiFields.add("QuotaCollection");
        openapiFields.add("ShortDescription");
        openapiFields.add("UsedValue");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Quota
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Quota.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Quota is not found in the empty JSON"
                                        + " string",
                                Quota.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Quota.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Quota`"
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
        if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull())
                && !jsonObj.get("Description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Description").toString()));
        }
        if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull())
                && !jsonObj.get("Name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Name").toString()));
        }
        if ((jsonObj.get("QuotaCollection") != null && !jsonObj.get("QuotaCollection").isJsonNull())
                && !jsonObj.get("QuotaCollection").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `QuotaCollection` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("QuotaCollection").toString()));
        }
        if ((jsonObj.get("ShortDescription") != null
                        && !jsonObj.get("ShortDescription").isJsonNull())
                && !jsonObj.get("ShortDescription").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ShortDescription` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("ShortDescription").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Quota.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Quota' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Quota> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Quota.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Quota>() {
                        @Override
                        public void write(JsonWriter out, Quota value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Quota read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Quota given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Quota
     * @throws IOException if the JSON string is invalid with respect to Quota
     */
    public static Quota fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Quota.class);
    }

    /**
     * Convert an instance of Quota to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

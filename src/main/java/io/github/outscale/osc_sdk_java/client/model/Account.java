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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Information about the account. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Account {
    public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
    private String accountId;

    public static final String SERIALIZED_NAME_ADDITIONAL_EMAILS = "AdditionalEmails";

    @SerializedName(SERIALIZED_NAME_ADDITIONAL_EMAILS)
    private List<String> additionalEmails = null;

    public static final String SERIALIZED_NAME_CITY = "City";

    @SerializedName(SERIALIZED_NAME_CITY)
    private String city;

    public static final String SERIALIZED_NAME_COMPANY_NAME = "CompanyName";

    @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
    private String companyName;

    public static final String SERIALIZED_NAME_COUNTRY = "Country";

    @SerializedName(SERIALIZED_NAME_COUNTRY)
    private String country;

    public static final String SERIALIZED_NAME_CUSTOMER_ID = "CustomerId";

    @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
    private String customerId;

    public static final String SERIALIZED_NAME_EMAIL = "Email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    private String email;

    public static final String SERIALIZED_NAME_FIRST_NAME = "FirstName";

    @SerializedName(SERIALIZED_NAME_FIRST_NAME)
    private String firstName;

    public static final String SERIALIZED_NAME_JOB_TITLE = "JobTitle";

    @SerializedName(SERIALIZED_NAME_JOB_TITLE)
    private String jobTitle;

    public static final String SERIALIZED_NAME_LAST_NAME = "LastName";

    @SerializedName(SERIALIZED_NAME_LAST_NAME)
    private String lastName;

    public static final String SERIALIZED_NAME_MOBILE_NUMBER = "MobileNumber";

    @SerializedName(SERIALIZED_NAME_MOBILE_NUMBER)
    private String mobileNumber;

    public static final String SERIALIZED_NAME_PHONE_NUMBER = "PhoneNumber";

    @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
    private String phoneNumber;

    public static final String SERIALIZED_NAME_STATE_PROVINCE = "StateProvince";

    @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
    private String stateProvince;

    public static final String SERIALIZED_NAME_VAT_NUMBER = "VatNumber";

    @SerializedName(SERIALIZED_NAME_VAT_NUMBER)
    private String vatNumber;

    public static final String SERIALIZED_NAME_ZIP_CODE = "ZipCode";

    @SerializedName(SERIALIZED_NAME_ZIP_CODE)
    private String zipCode;

    public Account() {}

    public Account accountId(String accountId) {

        this.accountId = accountId;
        return this;
    }

    /**
     * The ID of the account.
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

    public Account additionalEmails(List<String> additionalEmails) {

        this.additionalEmails = additionalEmails;
        return this;
    }

    public Account addAdditionalEmailsItem(String additionalEmailsItem) {
        if (this.additionalEmails == null) {
            this.additionalEmails = new ArrayList<>();
        }
        this.additionalEmails.add(additionalEmailsItem);
        return this;
    }

    /**
     * One or more additional email addresses for the account. These addresses are used for
     * notifications only.
     *
     * @return additionalEmails
     */
    @javax.annotation.Nullable
    public List<String> getAdditionalEmails() {
        return additionalEmails;
    }

    public void setAdditionalEmails(List<String> additionalEmails) {
        this.additionalEmails = additionalEmails;
    }

    public Account city(String city) {

        this.city = city;
        return this;
    }

    /**
     * The city of the account owner.
     *
     * @return city
     */
    @javax.annotation.Nullable
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Account companyName(String companyName) {

        this.companyName = companyName;
        return this;
    }

    /**
     * The name of the company for the account.
     *
     * @return companyName
     */
    @javax.annotation.Nullable
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Account country(String country) {

        this.country = country;
        return this;
    }

    /**
     * The country of the account owner.
     *
     * @return country
     */
    @javax.annotation.Nullable
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Account customerId(String customerId) {

        this.customerId = customerId;
        return this;
    }

    /**
     * The ID of the customer.
     *
     * @return customerId
     */
    @javax.annotation.Nullable
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Account email(String email) {

        this.email = email;
        return this;
    }

    /**
     * The main email address for the account. This address is used for your credentials and for
     * notifications.
     *
     * @return email
     */
    @javax.annotation.Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account firstName(String firstName) {

        this.firstName = firstName;
        return this;
    }

    /**
     * The first name of the account owner.
     *
     * @return firstName
     */
    @javax.annotation.Nullable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Account jobTitle(String jobTitle) {

        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * The job title of the account owner.
     *
     * @return jobTitle
     */
    @javax.annotation.Nullable
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Account lastName(String lastName) {

        this.lastName = lastName;
        return this;
    }

    /**
     * The last name of the account owner.
     *
     * @return lastName
     */
    @javax.annotation.Nullable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account mobileNumber(String mobileNumber) {

        this.mobileNumber = mobileNumber;
        return this;
    }

    /**
     * The mobile phone number of the account owner.
     *
     * @return mobileNumber
     */
    @javax.annotation.Nullable
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Account phoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The landline phone number of the account owner.
     *
     * @return phoneNumber
     */
    @javax.annotation.Nullable
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account stateProvince(String stateProvince) {

        this.stateProvince = stateProvince;
        return this;
    }

    /**
     * The state/province of the account.
     *
     * @return stateProvince
     */
    @javax.annotation.Nullable
    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public Account vatNumber(String vatNumber) {

        this.vatNumber = vatNumber;
        return this;
    }

    /**
     * The value added tax (VAT) number for the account.
     *
     * @return vatNumber
     */
    @javax.annotation.Nullable
    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public Account zipCode(String zipCode) {

        this.zipCode = zipCode;
        return this;
    }

    /**
     * The ZIP code of the city.
     *
     * @return zipCode
     */
    @javax.annotation.Nullable
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(this.accountId, account.accountId)
                && Objects.equals(this.additionalEmails, account.additionalEmails)
                && Objects.equals(this.city, account.city)
                && Objects.equals(this.companyName, account.companyName)
                && Objects.equals(this.country, account.country)
                && Objects.equals(this.customerId, account.customerId)
                && Objects.equals(this.email, account.email)
                && Objects.equals(this.firstName, account.firstName)
                && Objects.equals(this.jobTitle, account.jobTitle)
                && Objects.equals(this.lastName, account.lastName)
                && Objects.equals(this.mobileNumber, account.mobileNumber)
                && Objects.equals(this.phoneNumber, account.phoneNumber)
                && Objects.equals(this.stateProvince, account.stateProvince)
                && Objects.equals(this.vatNumber, account.vatNumber)
                && Objects.equals(this.zipCode, account.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accountId,
                additionalEmails,
                city,
                companyName,
                country,
                customerId,
                email,
                firstName,
                jobTitle,
                lastName,
                mobileNumber,
                phoneNumber,
                stateProvince,
                vatNumber,
                zipCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Account {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    additionalEmails: ").append(toIndentedString(additionalEmails)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
        sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
        sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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
        openapiFields.add("AdditionalEmails");
        openapiFields.add("City");
        openapiFields.add("CompanyName");
        openapiFields.add("Country");
        openapiFields.add("CustomerId");
        openapiFields.add("Email");
        openapiFields.add("FirstName");
        openapiFields.add("JobTitle");
        openapiFields.add("LastName");
        openapiFields.add("MobileNumber");
        openapiFields.add("PhoneNumber");
        openapiFields.add("StateProvince");
        openapiFields.add("VatNumber");
        openapiFields.add("ZipCode");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Account
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Account.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Account is not found in the empty"
                                        + " JSON string",
                                Account.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Account.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Account`"
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
        // ensure the optional json data is an array if present
        if (jsonObj.get("AdditionalEmails") != null
                && !jsonObj.get("AdditionalEmails").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `AdditionalEmails` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("AdditionalEmails").toString()));
        }
        if ((jsonObj.get("City") != null && !jsonObj.get("City").isJsonNull())
                && !jsonObj.get("City").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `City` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("City").toString()));
        }
        if ((jsonObj.get("CompanyName") != null && !jsonObj.get("CompanyName").isJsonNull())
                && !jsonObj.get("CompanyName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CompanyName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("CompanyName").toString()));
        }
        if ((jsonObj.get("Country") != null && !jsonObj.get("Country").isJsonNull())
                && !jsonObj.get("Country").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Country` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Country").toString()));
        }
        if ((jsonObj.get("CustomerId") != null && !jsonObj.get("CustomerId").isJsonNull())
                && !jsonObj.get("CustomerId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CustomerId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("CustomerId").toString()));
        }
        if ((jsonObj.get("Email") != null && !jsonObj.get("Email").isJsonNull())
                && !jsonObj.get("Email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Email` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Email").toString()));
        }
        if ((jsonObj.get("FirstName") != null && !jsonObj.get("FirstName").isJsonNull())
                && !jsonObj.get("FirstName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `FirstName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("FirstName").toString()));
        }
        if ((jsonObj.get("JobTitle") != null && !jsonObj.get("JobTitle").isJsonNull())
                && !jsonObj.get("JobTitle").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `JobTitle` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("JobTitle").toString()));
        }
        if ((jsonObj.get("LastName") != null && !jsonObj.get("LastName").isJsonNull())
                && !jsonObj.get("LastName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `LastName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("LastName").toString()));
        }
        if ((jsonObj.get("MobileNumber") != null && !jsonObj.get("MobileNumber").isJsonNull())
                && !jsonObj.get("MobileNumber").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `MobileNumber` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("MobileNumber").toString()));
        }
        if ((jsonObj.get("PhoneNumber") != null && !jsonObj.get("PhoneNumber").isJsonNull())
                && !jsonObj.get("PhoneNumber").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PhoneNumber` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PhoneNumber").toString()));
        }
        if ((jsonObj.get("StateProvince") != null && !jsonObj.get("StateProvince").isJsonNull())
                && !jsonObj.get("StateProvince").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `StateProvince` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("StateProvince").toString()));
        }
        if ((jsonObj.get("VatNumber") != null && !jsonObj.get("VatNumber").isJsonNull())
                && !jsonObj.get("VatNumber").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VatNumber` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("VatNumber").toString()));
        }
        if ((jsonObj.get("ZipCode") != null && !jsonObj.get("ZipCode").isJsonNull())
                && !jsonObj.get("ZipCode").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ZipCode` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ZipCode").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Account.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Account' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Account> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Account.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Account>() {
                        @Override
                        public void write(JsonWriter out, Account value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Account read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Account given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Account
     * @throws IOException if the JSON string is invalid with respect to Account
     */
    public static Account fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Account.class);
    }

    /**
     * Convert an instance of Account to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** UpdateAccountRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateAccountRequest {
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

    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

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

    public UpdateAccountRequest() {}

    public UpdateAccountRequest additionalEmails(List<String> additionalEmails) {

        this.additionalEmails = additionalEmails;
        return this;
    }

    public UpdateAccountRequest addAdditionalEmailsItem(String additionalEmailsItem) {
        if (this.additionalEmails == null) {
            this.additionalEmails = new ArrayList<>();
        }
        this.additionalEmails.add(additionalEmailsItem);
        return this;
    }

    /**
     * One or more additional email addresses for the account. These addresses are used for
     * notifications only. If you already have a list of additional emails registered, you cannot
     * add to it, only replace it. To remove all registered additional emails, specify an empty
     * list.
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

    public UpdateAccountRequest city(String city) {

        this.city = city;
        return this;
    }

    /**
     * The new city of the account owner.
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

    public UpdateAccountRequest companyName(String companyName) {

        this.companyName = companyName;
        return this;
    }

    /**
     * The new name of the company for the account.
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

    public UpdateAccountRequest country(String country) {

        this.country = country;
        return this;
    }

    /**
     * The new country of the account owner.
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

    public UpdateAccountRequest dryRun(Boolean dryRun) {

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

    public UpdateAccountRequest email(String email) {

        this.email = email;
        return this;
    }

    /**
     * The main email address for the account. This address is used for your credentials and
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

    public UpdateAccountRequest firstName(String firstName) {

        this.firstName = firstName;
        return this;
    }

    /**
     * The new first name of the account owner.
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

    public UpdateAccountRequest jobTitle(String jobTitle) {

        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * The new job title of the account owner.
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

    public UpdateAccountRequest lastName(String lastName) {

        this.lastName = lastName;
        return this;
    }

    /**
     * The new last name of the account owner.
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

    public UpdateAccountRequest mobileNumber(String mobileNumber) {

        this.mobileNumber = mobileNumber;
        return this;
    }

    /**
     * The new mobile phone number of the account owner.
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

    public UpdateAccountRequest phoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The new landline phone number of the account owner.
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

    public UpdateAccountRequest stateProvince(String stateProvince) {

        this.stateProvince = stateProvince;
        return this;
    }

    /**
     * The new state/province of the account owner.
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

    public UpdateAccountRequest vatNumber(String vatNumber) {

        this.vatNumber = vatNumber;
        return this;
    }

    /**
     * The new value added tax (VAT) number for the account.
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

    public UpdateAccountRequest zipCode(String zipCode) {

        this.zipCode = zipCode;
        return this;
    }

    /**
     * The new ZIP code of the city.
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
        UpdateAccountRequest updateAccountRequest = (UpdateAccountRequest) o;
        return Objects.equals(this.additionalEmails, updateAccountRequest.additionalEmails)
                && Objects.equals(this.city, updateAccountRequest.city)
                && Objects.equals(this.companyName, updateAccountRequest.companyName)
                && Objects.equals(this.country, updateAccountRequest.country)
                && Objects.equals(this.dryRun, updateAccountRequest.dryRun)
                && Objects.equals(this.email, updateAccountRequest.email)
                && Objects.equals(this.firstName, updateAccountRequest.firstName)
                && Objects.equals(this.jobTitle, updateAccountRequest.jobTitle)
                && Objects.equals(this.lastName, updateAccountRequest.lastName)
                && Objects.equals(this.mobileNumber, updateAccountRequest.mobileNumber)
                && Objects.equals(this.phoneNumber, updateAccountRequest.phoneNumber)
                && Objects.equals(this.stateProvince, updateAccountRequest.stateProvince)
                && Objects.equals(this.vatNumber, updateAccountRequest.vatNumber)
                && Objects.equals(this.zipCode, updateAccountRequest.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                additionalEmails,
                city,
                companyName,
                country,
                dryRun,
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
        sb.append("class UpdateAccountRequest {\n");
        sb.append("    additionalEmails: ").append(toIndentedString(additionalEmails)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
        openapiFields.add("AdditionalEmails");
        openapiFields.add("City");
        openapiFields.add("CompanyName");
        openapiFields.add("Country");
        openapiFields.add("DryRun");
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
     * @throws IOException if the JSON Object is invalid with respect to UpdateAccountRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!UpdateAccountRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateAccountRequest is not found in"
                                        + " the empty JSON string",
                                UpdateAccountRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!UpdateAccountRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateAccountRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
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
            if (!UpdateAccountRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateAccountRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateAccountRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateAccountRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateAccountRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateAccountRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateAccountRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateAccountRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateAccountRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateAccountRequest
     */
    public static UpdateAccountRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateAccountRequest.class);
    }

    /**
     * Convert an instance of UpdateAccountRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

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
import com.google.gson.annotations.JsonAdapter;
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

/** Information about the catalogs. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Catalogs {
    public static final String SERIALIZED_NAME_ENTRIES = "Entries";

    @SerializedName(SERIALIZED_NAME_ENTRIES)
    private List<CatalogEntry> entries = null;

    public static final String SERIALIZED_NAME_FROM_DATE = "FromDate";

    @SerializedName(SERIALIZED_NAME_FROM_DATE)
    private OffsetDateTime fromDate;

    /** The state of the catalog (&#x60;CURRENT&#x60; \\| &#x60;OBSOLETE&#x60;). */
    @JsonAdapter(StateEnum.Adapter.class)
    public enum StateEnum {
        CURRENT("CURRENT"),

        OBSOLETE("OBSOLETE");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private StateEnum state;

    public static final String SERIALIZED_NAME_TO_DATE = "ToDate";

    @SerializedName(SERIALIZED_NAME_TO_DATE)
    private OffsetDateTime toDate;

    public Catalogs() {}

    public Catalogs entries(List<CatalogEntry> entries) {

        this.entries = entries;
        return this;
    }

    public Catalogs addEntriesItem(CatalogEntry entriesItem) {
        if (this.entries == null) {
            this.entries = new ArrayList<>();
        }
        this.entries.add(entriesItem);
        return this;
    }

    /**
     * One or more catalog entries.
     *
     * @return entries
     */
    @javax.annotation.Nullable
    public List<CatalogEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<CatalogEntry> entries) {
        this.entries = entries;
    }

    public Catalogs fromDate(OffsetDateTime fromDate) {

        this.fromDate = fromDate;
        return this;
    }

    /**
     * The beginning of the time period, in ISO 8601 date-time format.
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

    public Catalogs state(StateEnum state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the catalog (&#x60;CURRENT&#x60; \\| &#x60;OBSOLETE&#x60;).
     *
     * @return state
     */
    @javax.annotation.Nullable
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public Catalogs toDate(OffsetDateTime toDate) {

        this.toDate = toDate;
        return this;
    }

    /**
     * The end of the time period, in ISO 8601 date-time format.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Catalogs catalogs = (Catalogs) o;
        return Objects.equals(this.entries, catalogs.entries)
                && Objects.equals(this.fromDate, catalogs.fromDate)
                && Objects.equals(this.state, catalogs.state)
                && Objects.equals(this.toDate, catalogs.toDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entries, fromDate, state, toDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Catalogs {\n");
        sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
        sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
        openapiFields.add("Entries");
        openapiFields.add("FromDate");
        openapiFields.add("State");
        openapiFields.add("ToDate");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Catalogs
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Catalogs.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Catalogs is not found in the empty"
                                        + " JSON string",
                                Catalogs.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Catalogs.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `Catalogs` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if (jsonObj.get("Entries") != null && !jsonObj.get("Entries").isJsonNull()) {
            JsonArray jsonArrayentries = jsonObj.getAsJsonArray("Entries");
            if (jsonArrayentries != null) {
                // ensure the json data is an array
                if (!jsonObj.get("Entries").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `Entries` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("Entries").toString()));
                }

                // validate the optional field `Entries` (array)
                for (int i = 0; i < jsonArrayentries.size(); i++) {
                    CatalogEntry.validateJsonObject(jsonArrayentries.get(i).getAsJsonObject());
                }
                ;
            }
        }
        if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull())
                && !jsonObj.get("State").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `State` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("State").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Catalogs.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Catalogs' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Catalogs> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Catalogs.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Catalogs>() {
                        @Override
                        public void write(JsonWriter out, Catalogs value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Catalogs read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Catalogs given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Catalogs
     * @throws IOException if the JSON string is invalid with respect to Catalogs
     */
    public static Catalogs fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Catalogs.class);
    }

    /**
     * Convert an instance of Catalogs to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

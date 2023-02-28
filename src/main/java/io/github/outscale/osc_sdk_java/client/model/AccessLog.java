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

/** Information about access logs. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessLog {
    public static final String SERIALIZED_NAME_IS_ENABLED = "IsEnabled";

    @SerializedName(SERIALIZED_NAME_IS_ENABLED)
    private Boolean isEnabled;

    public static final String SERIALIZED_NAME_OSU_BUCKET_NAME = "OsuBucketName";

    @SerializedName(SERIALIZED_NAME_OSU_BUCKET_NAME)
    private String osuBucketName;

    public static final String SERIALIZED_NAME_OSU_BUCKET_PREFIX = "OsuBucketPrefix";

    @SerializedName(SERIALIZED_NAME_OSU_BUCKET_PREFIX)
    private String osuBucketPrefix;

    public static final String SERIALIZED_NAME_PUBLICATION_INTERVAL = "PublicationInterval";

    @SerializedName(SERIALIZED_NAME_PUBLICATION_INTERVAL)
    private Integer publicationInterval;

    public AccessLog() {}

    public AccessLog isEnabled(Boolean isEnabled) {

        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * If true, access logs are enabled for your load balancer. If false, they are not. If you set
     * this to true in your request, the &#x60;OsuBucketName&#x60; parameter is required.
     *
     * @return isEnabled
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public AccessLog osuBucketName(String osuBucketName) {

        this.osuBucketName = osuBucketName;
        return this;
    }

    /**
     * The name of the OOS bucket for the access logs.
     *
     * @return osuBucketName
     */
    @javax.annotation.Nullable
    public String getOsuBucketName() {
        return osuBucketName;
    }

    public void setOsuBucketName(String osuBucketName) {
        this.osuBucketName = osuBucketName;
    }

    public AccessLog osuBucketPrefix(String osuBucketPrefix) {

        this.osuBucketPrefix = osuBucketPrefix;
        return this;
    }

    /**
     * The path to the folder of the access logs in your OOS bucket (by default, the
     * &#x60;root&#x60; level of your bucket).
     *
     * @return osuBucketPrefix
     */
    @javax.annotation.Nullable
    public String getOsuBucketPrefix() {
        return osuBucketPrefix;
    }

    public void setOsuBucketPrefix(String osuBucketPrefix) {
        this.osuBucketPrefix = osuBucketPrefix;
    }

    public AccessLog publicationInterval(Integer publicationInterval) {

        this.publicationInterval = publicationInterval;
        return this;
    }

    /**
     * The time interval for the publication of access logs in the OOS bucket, in minutes. This
     * value can be either &#x60;5&#x60; or &#x60;60&#x60; (by default, &#x60;60&#x60;).
     *
     * @return publicationInterval
     */
    @javax.annotation.Nullable
    public Integer getPublicationInterval() {
        return publicationInterval;
    }

    public void setPublicationInterval(Integer publicationInterval) {
        this.publicationInterval = publicationInterval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessLog accessLog = (AccessLog) o;
        return Objects.equals(this.isEnabled, accessLog.isEnabled)
                && Objects.equals(this.osuBucketName, accessLog.osuBucketName)
                && Objects.equals(this.osuBucketPrefix, accessLog.osuBucketPrefix)
                && Objects.equals(this.publicationInterval, accessLog.publicationInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEnabled, osuBucketName, osuBucketPrefix, publicationInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessLog {\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
        sb.append("    osuBucketName: ").append(toIndentedString(osuBucketName)).append("\n");
        sb.append("    osuBucketPrefix: ").append(toIndentedString(osuBucketPrefix)).append("\n");
        sb.append("    publicationInterval: ")
                .append(toIndentedString(publicationInterval))
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
        openapiFields.add("IsEnabled");
        openapiFields.add("OsuBucketName");
        openapiFields.add("OsuBucketPrefix");
        openapiFields.add("PublicationInterval");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to AccessLog
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!AccessLog.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AccessLog is not found in the empty"
                                        + " JSON string",
                                AccessLog.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!AccessLog.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AccessLog` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("OsuBucketName") != null && !jsonObj.get("OsuBucketName").isJsonNull())
                && !jsonObj.get("OsuBucketName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `OsuBucketName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("OsuBucketName").toString()));
        }
        if ((jsonObj.get("OsuBucketPrefix") != null && !jsonObj.get("OsuBucketPrefix").isJsonNull())
                && !jsonObj.get("OsuBucketPrefix").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `OsuBucketPrefix` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("OsuBucketPrefix").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AccessLog.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AccessLog' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AccessLog> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AccessLog.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AccessLog>() {
                        @Override
                        public void write(JsonWriter out, AccessLog value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AccessLog read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AccessLog given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AccessLog
     * @throws IOException if the JSON string is invalid with respect to AccessLog
     */
    public static AccessLog fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AccessLog.class);
    }

    /**
     * Convert an instance of AccessLog to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

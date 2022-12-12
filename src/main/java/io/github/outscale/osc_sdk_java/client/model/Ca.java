/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.23
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

/** Information about the Client Certificate Authority (CA). */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Ca {
    public static final String SERIALIZED_NAME_CA_FINGERPRINT = "CaFingerprint";

    @SerializedName(SERIALIZED_NAME_CA_FINGERPRINT)
    private String caFingerprint;

    public static final String SERIALIZED_NAME_CA_ID = "CaId";

    @SerializedName(SERIALIZED_NAME_CA_ID)
    private String caId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "Description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public Ca() {}

    public Ca caFingerprint(String caFingerprint) {

        this.caFingerprint = caFingerprint;
        return this;
    }

    /**
     * The fingerprint of the CA.
     *
     * @return caFingerprint
     */
    @javax.annotation.Nullable
    public String getCaFingerprint() {
        return caFingerprint;
    }

    public void setCaFingerprint(String caFingerprint) {
        this.caFingerprint = caFingerprint;
    }

    public Ca caId(String caId) {

        this.caId = caId;
        return this;
    }

    /**
     * The ID of the CA.
     *
     * @return caId
     */
    @javax.annotation.Nullable
    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId;
    }

    public Ca description(String description) {

        this.description = description;
        return this;
    }

    /**
     * The description of the CA.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ca ca = (Ca) o;
        return Objects.equals(this.caFingerprint, ca.caFingerprint)
                && Objects.equals(this.caId, ca.caId)
                && Objects.equals(this.description, ca.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caFingerprint, caId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ca {\n");
        sb.append("    caFingerprint: ").append(toIndentedString(caFingerprint)).append("\n");
        sb.append("    caId: ").append(toIndentedString(caId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
        openapiFields.add("CaFingerprint");
        openapiFields.add("CaId");
        openapiFields.add("Description");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Ca
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Ca.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Ca is not found in the empty JSON"
                                        + " string",
                                Ca.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Ca.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Ca`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("CaFingerprint") != null && !jsonObj.get("CaFingerprint").isJsonNull())
                && !jsonObj.get("CaFingerprint").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CaFingerprint` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("CaFingerprint").toString()));
        }
        if ((jsonObj.get("CaId") != null && !jsonObj.get("CaId").isJsonNull())
                && !jsonObj.get("CaId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `CaId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("CaId").toString()));
        }
        if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull())
                && !jsonObj.get("Description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Description").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Ca.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Ca' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Ca> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Ca.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Ca>() {
                        @Override
                        public void write(JsonWriter out, Ca value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Ca read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Ca given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Ca
     * @throws IOException if the JSON string is invalid with respect to Ca
     */
    public static Ca fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Ca.class);
    }

    /**
     * Convert an instance of Ca to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.27
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

/** Information about Phase 2 of the Internet Key Exchange (IKE) negotiation. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Phase2Options {
    public static final String SERIALIZED_NAME_PHASE2_DH_GROUP_NUMBERS = "Phase2DhGroupNumbers";

    @SerializedName(SERIALIZED_NAME_PHASE2_DH_GROUP_NUMBERS)
    private List<Integer> phase2DhGroupNumbers = null;

    public static final String SERIALIZED_NAME_PHASE2_ENCRYPTION_ALGORITHMS =
            "Phase2EncryptionAlgorithms";

    @SerializedName(SERIALIZED_NAME_PHASE2_ENCRYPTION_ALGORITHMS)
    private List<String> phase2EncryptionAlgorithms = null;

    public static final String SERIALIZED_NAME_PHASE2_INTEGRITY_ALGORITHMS =
            "Phase2IntegrityAlgorithms";

    @SerializedName(SERIALIZED_NAME_PHASE2_INTEGRITY_ALGORITHMS)
    private List<String> phase2IntegrityAlgorithms = null;

    public static final String SERIALIZED_NAME_PHASE2_LIFETIME_SECONDS = "Phase2LifetimeSeconds";

    @SerializedName(SERIALIZED_NAME_PHASE2_LIFETIME_SECONDS)
    private Integer phase2LifetimeSeconds;

    public static final String SERIALIZED_NAME_PRE_SHARED_KEY = "PreSharedKey";

    @SerializedName(SERIALIZED_NAME_PRE_SHARED_KEY)
    private String preSharedKey;

    public Phase2Options() {}

    public Phase2Options phase2DhGroupNumbers(List<Integer> phase2DhGroupNumbers) {

        this.phase2DhGroupNumbers = phase2DhGroupNumbers;
        return this;
    }

    public Phase2Options addPhase2DhGroupNumbersItem(Integer phase2DhGroupNumbersItem) {
        if (this.phase2DhGroupNumbers == null) {
            this.phase2DhGroupNumbers = new ArrayList<>();
        }
        this.phase2DhGroupNumbers.add(phase2DhGroupNumbersItem);
        return this;
    }

    /**
     * The Diffie-Hellman (DH) group numbers allowed for the VPN tunnel for phase 2.
     *
     * @return phase2DhGroupNumbers
     */
    @javax.annotation.Nullable
    public List<Integer> getPhase2DhGroupNumbers() {
        return phase2DhGroupNumbers;
    }

    public void setPhase2DhGroupNumbers(List<Integer> phase2DhGroupNumbers) {
        this.phase2DhGroupNumbers = phase2DhGroupNumbers;
    }

    public Phase2Options phase2EncryptionAlgorithms(List<String> phase2EncryptionAlgorithms) {

        this.phase2EncryptionAlgorithms = phase2EncryptionAlgorithms;
        return this;
    }

    public Phase2Options addPhase2EncryptionAlgorithmsItem(String phase2EncryptionAlgorithmsItem) {
        if (this.phase2EncryptionAlgorithms == null) {
            this.phase2EncryptionAlgorithms = new ArrayList<>();
        }
        this.phase2EncryptionAlgorithms.add(phase2EncryptionAlgorithmsItem);
        return this;
    }

    /**
     * The encryption algorithms allowed for the VPN tunnel for phase 2.
     *
     * @return phase2EncryptionAlgorithms
     */
    @javax.annotation.Nullable
    public List<String> getPhase2EncryptionAlgorithms() {
        return phase2EncryptionAlgorithms;
    }

    public void setPhase2EncryptionAlgorithms(List<String> phase2EncryptionAlgorithms) {
        this.phase2EncryptionAlgorithms = phase2EncryptionAlgorithms;
    }

    public Phase2Options phase2IntegrityAlgorithms(List<String> phase2IntegrityAlgorithms) {

        this.phase2IntegrityAlgorithms = phase2IntegrityAlgorithms;
        return this;
    }

    public Phase2Options addPhase2IntegrityAlgorithmsItem(String phase2IntegrityAlgorithmsItem) {
        if (this.phase2IntegrityAlgorithms == null) {
            this.phase2IntegrityAlgorithms = new ArrayList<>();
        }
        this.phase2IntegrityAlgorithms.add(phase2IntegrityAlgorithmsItem);
        return this;
    }

    /**
     * The integrity algorithms allowed for the VPN tunnel for phase 2.
     *
     * @return phase2IntegrityAlgorithms
     */
    @javax.annotation.Nullable
    public List<String> getPhase2IntegrityAlgorithms() {
        return phase2IntegrityAlgorithms;
    }

    public void setPhase2IntegrityAlgorithms(List<String> phase2IntegrityAlgorithms) {
        this.phase2IntegrityAlgorithms = phase2IntegrityAlgorithms;
    }

    public Phase2Options phase2LifetimeSeconds(Integer phase2LifetimeSeconds) {

        this.phase2LifetimeSeconds = phase2LifetimeSeconds;
        return this;
    }

    /**
     * The lifetime for phase 2 of the Internet Key Exchange (IKE) negociation process, in seconds.
     *
     * @return phase2LifetimeSeconds
     */
    @javax.annotation.Nullable
    public Integer getPhase2LifetimeSeconds() {
        return phase2LifetimeSeconds;
    }

    public void setPhase2LifetimeSeconds(Integer phase2LifetimeSeconds) {
        this.phase2LifetimeSeconds = phase2LifetimeSeconds;
    }

    public Phase2Options preSharedKey(String preSharedKey) {

        this.preSharedKey = preSharedKey;
        return this;
    }

    /**
     * The pre-shared key to establish the initial authentication between the client gateway and the
     * virtual gateway. This key can contain any character except line breaks and double quotes
     * (&amp;quot;).
     *
     * @return preSharedKey
     */
    @javax.annotation.Nullable
    public String getPreSharedKey() {
        return preSharedKey;
    }

    public void setPreSharedKey(String preSharedKey) {
        this.preSharedKey = preSharedKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phase2Options phase2Options = (Phase2Options) o;
        return Objects.equals(this.phase2DhGroupNumbers, phase2Options.phase2DhGroupNumbers)
                && Objects.equals(
                        this.phase2EncryptionAlgorithms, phase2Options.phase2EncryptionAlgorithms)
                && Objects.equals(
                        this.phase2IntegrityAlgorithms, phase2Options.phase2IntegrityAlgorithms)
                && Objects.equals(this.phase2LifetimeSeconds, phase2Options.phase2LifetimeSeconds)
                && Objects.equals(this.preSharedKey, phase2Options.preSharedKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                phase2DhGroupNumbers,
                phase2EncryptionAlgorithms,
                phase2IntegrityAlgorithms,
                phase2LifetimeSeconds,
                preSharedKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Phase2Options {\n");
        sb.append("    phase2DhGroupNumbers: ")
                .append(toIndentedString(phase2DhGroupNumbers))
                .append("\n");
        sb.append("    phase2EncryptionAlgorithms: ")
                .append(toIndentedString(phase2EncryptionAlgorithms))
                .append("\n");
        sb.append("    phase2IntegrityAlgorithms: ")
                .append(toIndentedString(phase2IntegrityAlgorithms))
                .append("\n");
        sb.append("    phase2LifetimeSeconds: ")
                .append(toIndentedString(phase2LifetimeSeconds))
                .append("\n");
        sb.append("    preSharedKey: ").append(toIndentedString(preSharedKey)).append("\n");
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
        openapiFields.add("Phase2DhGroupNumbers");
        openapiFields.add("Phase2EncryptionAlgorithms");
        openapiFields.add("Phase2IntegrityAlgorithms");
        openapiFields.add("Phase2LifetimeSeconds");
        openapiFields.add("PreSharedKey");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Phase2Options
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Phase2Options.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Phase2Options is not found in the"
                                        + " empty JSON string",
                                Phase2Options.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Phase2Options.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `Phase2Options` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Phase2DhGroupNumbers") != null
                && !jsonObj.get("Phase2DhGroupNumbers").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Phase2DhGroupNumbers` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Phase2DhGroupNumbers").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Phase2EncryptionAlgorithms") != null
                && !jsonObj.get("Phase2EncryptionAlgorithms").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Phase2EncryptionAlgorithms` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("Phase2EncryptionAlgorithms").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Phase2IntegrityAlgorithms") != null
                && !jsonObj.get("Phase2IntegrityAlgorithms").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Phase2IntegrityAlgorithms` to be an array in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("Phase2IntegrityAlgorithms").toString()));
        }
        if ((jsonObj.get("PreSharedKey") != null && !jsonObj.get("PreSharedKey").isJsonNull())
                && !jsonObj.get("PreSharedKey").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PreSharedKey` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PreSharedKey").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Phase2Options.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Phase2Options' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Phase2Options> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Phase2Options.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Phase2Options>() {
                        @Override
                        public void write(JsonWriter out, Phase2Options value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Phase2Options read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Phase2Options given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Phase2Options
     * @throws IOException if the JSON string is invalid with respect to Phase2Options
     */
    public static Phase2Options fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Phase2Options.class);
    }

    /**
     * Convert an instance of Phase2Options to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

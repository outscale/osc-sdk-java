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

/** CreateDirectLinkRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateDirectLinkRequest {
    public static final String SERIALIZED_NAME_BANDWIDTH = "Bandwidth";

    @SerializedName(SERIALIZED_NAME_BANDWIDTH)
    private String bandwidth;

    public static final String SERIALIZED_NAME_DIRECT_LINK_NAME = "DirectLinkName";

    @SerializedName(SERIALIZED_NAME_DIRECT_LINK_NAME)
    private String directLinkName;

    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_LOCATION = "Location";

    @SerializedName(SERIALIZED_NAME_LOCATION)
    private String location;

    public CreateDirectLinkRequest() {}

    public CreateDirectLinkRequest bandwidth(String bandwidth) {

        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * The bandwidth of the DirectLink (&#x60;1Gbps&#x60; \\| &#x60;10Gbps&#x60;).
     *
     * @return bandwidth
     */
    @javax.annotation.Nonnull
    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public CreateDirectLinkRequest directLinkName(String directLinkName) {

        this.directLinkName = directLinkName;
        return this;
    }

    /**
     * The name of the DirectLink.
     *
     * @return directLinkName
     */
    @javax.annotation.Nonnull
    public String getDirectLinkName() {
        return directLinkName;
    }

    public void setDirectLinkName(String directLinkName) {
        this.directLinkName = directLinkName;
    }

    public CreateDirectLinkRequest dryRun(Boolean dryRun) {

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

    public CreateDirectLinkRequest location(String location) {

        this.location = location;
        return this;
    }

    /**
     * The code of the requested location for the DirectLink, returned by the
     * [ReadLocations](#readlocations) method.
     *
     * @return location
     */
    @javax.annotation.Nonnull
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDirectLinkRequest createDirectLinkRequest = (CreateDirectLinkRequest) o;
        return Objects.equals(this.bandwidth, createDirectLinkRequest.bandwidth)
                && Objects.equals(this.directLinkName, createDirectLinkRequest.directLinkName)
                && Objects.equals(this.dryRun, createDirectLinkRequest.dryRun)
                && Objects.equals(this.location, createDirectLinkRequest.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth, directLinkName, dryRun, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDirectLinkRequest {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    directLinkName: ").append(toIndentedString(directLinkName)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
        openapiFields.add("Bandwidth");
        openapiFields.add("DirectLinkName");
        openapiFields.add("DryRun");
        openapiFields.add("Location");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("Bandwidth");
        openapiRequiredFields.add("DirectLinkName");
        openapiRequiredFields.add("Location");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CreateDirectLinkRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateDirectLinkRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateDirectLinkRequest is not found"
                                        + " in the empty JSON string",
                                CreateDirectLinkRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateDirectLinkRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateDirectLinkRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateDirectLinkRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("Bandwidth").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Bandwidth` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Bandwidth").toString()));
        }
        if (!jsonObj.get("DirectLinkName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `DirectLinkName` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("DirectLinkName").toString()));
        }
        if (!jsonObj.get("Location").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Location` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Location").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateDirectLinkRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateDirectLinkRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateDirectLinkRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateDirectLinkRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateDirectLinkRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateDirectLinkRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateDirectLinkRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateDirectLinkRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateDirectLinkRequest
     * @throws IOException if the JSON string is invalid with respect to CreateDirectLinkRequest
     */
    public static CreateDirectLinkRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateDirectLinkRequest.class);
    }

    /**
     * Convert an instance of CreateDirectLinkRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).
 *
 * The version of the OpenAPI document: 1.26
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

/** UpdateServerCertificateRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateServerCertificateRequest {
    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_NAME = "Name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NEW_NAME = "NewName";

    @SerializedName(SERIALIZED_NAME_NEW_NAME)
    private String newName;

    public static final String SERIALIZED_NAME_NEW_PATH = "NewPath";

    @SerializedName(SERIALIZED_NAME_NEW_PATH)
    private String newPath;

    public UpdateServerCertificateRequest() {}

    public UpdateServerCertificateRequest dryRun(Boolean dryRun) {

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

    public UpdateServerCertificateRequest name(String name) {

        this.name = name;
        return this;
    }

    /**
     * The name of the server certificate you want to modify.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateServerCertificateRequest newName(String newName) {

        this.newName = newName;
        return this;
    }

    /**
     * A new name for the server certificate.
     *
     * @return newName
     */
    @javax.annotation.Nullable
    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public UpdateServerCertificateRequest newPath(String newPath) {

        this.newPath = newPath;
        return this;
    }

    /**
     * A new path for the server certificate.
     *
     * @return newPath
     */
    @javax.annotation.Nullable
    public String getNewPath() {
        return newPath;
    }

    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateServerCertificateRequest updateServerCertificateRequest =
                (UpdateServerCertificateRequest) o;
        return Objects.equals(this.dryRun, updateServerCertificateRequest.dryRun)
                && Objects.equals(this.name, updateServerCertificateRequest.name)
                && Objects.equals(this.newName, updateServerCertificateRequest.newName)
                && Objects.equals(this.newPath, updateServerCertificateRequest.newPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, name, newName, newPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerCertificateRequest {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
        sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
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
        openapiFields.add("Name");
        openapiFields.add("NewName");
        openapiFields.add("NewPath");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("Name");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to
     *     UpdateServerCertificateRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!UpdateServerCertificateRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateServerCertificateRequest is not"
                                        + " found in the empty JSON string",
                                UpdateServerCertificateRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!UpdateServerCertificateRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateServerCertificateRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateServerCertificateRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("Name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Name").toString()));
        }
        if ((jsonObj.get("NewName") != null && !jsonObj.get("NewName").isJsonNull())
                && !jsonObj.get("NewName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NewName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("NewName").toString()));
        }
        if ((jsonObj.get("NewPath") != null && !jsonObj.get("NewPath").isJsonNull())
                && !jsonObj.get("NewPath").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NewPath` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("NewPath").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateServerCertificateRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateServerCertificateRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateServerCertificateRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(UpdateServerCertificateRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateServerCertificateRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateServerCertificateRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateServerCertificateRequest read(JsonReader in)
                                throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateServerCertificateRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateServerCertificateRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     UpdateServerCertificateRequest
     */
    public static UpdateServerCertificateRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateServerCertificateRequest.class);
    }

    /**
     * Convert an instance of UpdateServerCertificateRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

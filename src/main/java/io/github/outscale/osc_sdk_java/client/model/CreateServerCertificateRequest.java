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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** CreateServerCertificateRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateServerCertificateRequest {
    public static final String SERIALIZED_NAME_BODY = "Body";

    @SerializedName(SERIALIZED_NAME_BODY)
    private String body;

    public static final String SERIALIZED_NAME_CHAIN = "Chain";

    @SerializedName(SERIALIZED_NAME_CHAIN)
    private String chain;

    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_NAME = "Name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PATH = "Path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_PRIVATE_KEY = "PrivateKey";

    @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
    private String privateKey;

    public CreateServerCertificateRequest() {}

    public CreateServerCertificateRequest body(String body) {

        this.body = body;
        return this;
    }

    /**
     * The PEM-encoded X509 certificate.&lt;br /&gt;With OSC CLI, use the following syntax to make
     * sure your CA file is correctly parsed: &#x60;--CaPem&#x3D;&amp;quot;$(cat
     * FILENAME)&amp;quot;&#x60;.
     *
     * @return body
     */
    @javax.annotation.Nonnull
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public CreateServerCertificateRequest chain(String chain) {

        this.chain = chain;
        return this;
    }

    /**
     * The PEM-encoded intermediate certification authorities.&lt;br /&gt;With OSC CLI, use the
     * following syntax to make sure your CA file is correctly parsed:
     * &#x60;--CaPem&#x3D;&amp;quot;$(cat FILENAME)&amp;quot;&#x60;.
     *
     * @return chain
     */
    @javax.annotation.Nullable
    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public CreateServerCertificateRequest dryRun(Boolean dryRun) {

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

    public CreateServerCertificateRequest name(String name) {

        this.name = name;
        return this;
    }

    /**
     * A unique name for the certificate. Constraints: 1-128 alphanumeric characters, pluses (+),
     * equals (&#x3D;), commas (,), periods (.), at signs (@), minuses (-), or underscores (_).
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

    public CreateServerCertificateRequest path(String path) {

        this.path = path;
        return this;
    }

    /**
     * The path to the server certificate, set to a slash (/) if not specified.
     *
     * @return path
     */
    @javax.annotation.Nullable
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CreateServerCertificateRequest privateKey(String privateKey) {

        this.privateKey = privateKey;
        return this;
    }

    /**
     * The PEM-encoded private key matching the certificate.&lt;br /&gt;With OSC CLI, use the
     * following syntax to make sure your CA file is correctly parsed:
     * &#x60;--CaPem&#x3D;&amp;quot;$(cat FILENAME)&amp;quot;&#x60;.
     *
     * @return privateKey
     */
    @javax.annotation.Nonnull
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateServerCertificateRequest createServerCertificateRequest =
                (CreateServerCertificateRequest) o;
        return Objects.equals(this.body, createServerCertificateRequest.body)
                && Objects.equals(this.chain, createServerCertificateRequest.chain)
                && Objects.equals(this.dryRun, createServerCertificateRequest.dryRun)
                && Objects.equals(this.name, createServerCertificateRequest.name)
                && Objects.equals(this.path, createServerCertificateRequest.path)
                && Objects.equals(this.privateKey, createServerCertificateRequest.privateKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, chain, dryRun, name, path, privateKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServerCertificateRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    chain: ").append(toIndentedString(chain)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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
        openapiFields.add("Body");
        openapiFields.add("Chain");
        openapiFields.add("DryRun");
        openapiFields.add("Name");
        openapiFields.add("Path");
        openapiFields.add("PrivateKey");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("Body");
        openapiRequiredFields.add("Name");
        openapiRequiredFields.add("PrivateKey");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to
     *     CreateServerCertificateRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateServerCertificateRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateServerCertificateRequest is not"
                                        + " found in the empty JSON string",
                                CreateServerCertificateRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateServerCertificateRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateServerCertificateRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateServerCertificateRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("Body").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Body` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Body").toString()));
        }
        if ((jsonObj.get("Chain") != null && !jsonObj.get("Chain").isJsonNull())
                && !jsonObj.get("Chain").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Chain` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Chain").toString()));
        }
        if (!jsonObj.get("Name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Name").toString()));
        }
        if ((jsonObj.get("Path") != null && !jsonObj.get("Path").isJsonNull())
                && !jsonObj.get("Path").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Path` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Path").toString()));
        }
        if (!jsonObj.get("PrivateKey").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PrivateKey` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PrivateKey").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateServerCertificateRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateServerCertificateRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateServerCertificateRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CreateServerCertificateRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateServerCertificateRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateServerCertificateRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateServerCertificateRequest read(JsonReader in)
                                throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateServerCertificateRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateServerCertificateRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     CreateServerCertificateRequest
     */
    public static CreateServerCertificateRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateServerCertificateRequest.class);
    }

    /**
     * Convert an instance of CreateServerCertificateRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

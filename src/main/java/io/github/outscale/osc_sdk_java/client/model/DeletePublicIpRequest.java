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

/** DeletePublicIpRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeletePublicIpRequest {
    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_PUBLIC_IP = "PublicIp";

    @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
    private String publicIp;

    public static final String SERIALIZED_NAME_PUBLIC_IP_ID = "PublicIpId";

    @SerializedName(SERIALIZED_NAME_PUBLIC_IP_ID)
    private String publicIpId;

    public DeletePublicIpRequest() {}

    public DeletePublicIpRequest dryRun(Boolean dryRun) {

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

    public DeletePublicIpRequest publicIp(String publicIp) {

        this.publicIp = publicIp;
        return this;
    }

    /**
     * The public IP. In the public Cloud, this parameter is required.
     *
     * @return publicIp
     */
    @javax.annotation.Nullable
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public DeletePublicIpRequest publicIpId(String publicIpId) {

        this.publicIpId = publicIpId;
        return this;
    }

    /**
     * The ID representing the association of the public IP with the VM or the NIC. In a Net, this
     * parameter is required.
     *
     * @return publicIpId
     */
    @javax.annotation.Nullable
    public String getPublicIpId() {
        return publicIpId;
    }

    public void setPublicIpId(String publicIpId) {
        this.publicIpId = publicIpId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeletePublicIpRequest deletePublicIpRequest = (DeletePublicIpRequest) o;
        return Objects.equals(this.dryRun, deletePublicIpRequest.dryRun)
                && Objects.equals(this.publicIp, deletePublicIpRequest.publicIp)
                && Objects.equals(this.publicIpId, deletePublicIpRequest.publicIpId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, publicIp, publicIpId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePublicIpRequest {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
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
        openapiFields.add("PublicIp");
        openapiFields.add("PublicIpId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to DeletePublicIpRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!DeletePublicIpRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeletePublicIpRequest is not found in"
                                        + " the empty JSON string",
                                DeletePublicIpRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!DeletePublicIpRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DeletePublicIpRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("PublicIp") != null && !jsonObj.get("PublicIp").isJsonNull())
                && !jsonObj.get("PublicIp").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PublicIp` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PublicIp").toString()));
        }
        if ((jsonObj.get("PublicIpId") != null && !jsonObj.get("PublicIpId").isJsonNull())
                && !jsonObj.get("PublicIpId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `PublicIpId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("PublicIpId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeletePublicIpRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeletePublicIpRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeletePublicIpRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DeletePublicIpRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeletePublicIpRequest>() {
                        @Override
                        public void write(JsonWriter out, DeletePublicIpRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DeletePublicIpRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DeletePublicIpRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeletePublicIpRequest
     * @throws IOException if the JSON string is invalid with respect to DeletePublicIpRequest
     */
    public static DeletePublicIpRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeletePublicIpRequest.class);
    }

    /**
     * Convert an instance of DeletePublicIpRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

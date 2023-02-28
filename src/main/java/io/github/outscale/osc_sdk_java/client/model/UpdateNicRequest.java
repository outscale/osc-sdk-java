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

/** UpdateNicRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateNicRequest {
    public static final String SERIALIZED_NAME_DESCRIPTION = "Description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_LINK_NIC = "LinkNic";

    @SerializedName(SERIALIZED_NAME_LINK_NIC)
    private LinkNicToUpdate linkNic;

    public static final String SERIALIZED_NAME_NIC_ID = "NicId";

    @SerializedName(SERIALIZED_NAME_NIC_ID)
    private String nicId;

    public static final String SERIALIZED_NAME_SECURITY_GROUP_IDS = "SecurityGroupIds";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_IDS)
    private List<String> securityGroupIds = null;

    public UpdateNicRequest() {}

    public UpdateNicRequest description(String description) {

        this.description = description;
        return this;
    }

    /**
     * A new description for the NIC.
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

    public UpdateNicRequest dryRun(Boolean dryRun) {

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

    public UpdateNicRequest linkNic(LinkNicToUpdate linkNic) {

        this.linkNic = linkNic;
        return this;
    }

    /**
     * Get linkNic
     *
     * @return linkNic
     */
    @javax.annotation.Nullable
    public LinkNicToUpdate getLinkNic() {
        return linkNic;
    }

    public void setLinkNic(LinkNicToUpdate linkNic) {
        this.linkNic = linkNic;
    }

    public UpdateNicRequest nicId(String nicId) {

        this.nicId = nicId;
        return this;
    }

    /**
     * The ID of the NIC you want to modify.
     *
     * @return nicId
     */
    @javax.annotation.Nonnull
    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public UpdateNicRequest securityGroupIds(List<String> securityGroupIds) {

        this.securityGroupIds = securityGroupIds;
        return this;
    }

    public UpdateNicRequest addSecurityGroupIdsItem(String securityGroupIdsItem) {
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new ArrayList<>();
        }
        this.securityGroupIds.add(securityGroupIdsItem);
        return this;
    }

    /**
     * One or more IDs of security groups for the NIC.&lt;br /&gt; You must specify at least one
     * group, even if you use the default security group in the Net.
     *
     * @return securityGroupIds
     */
    @javax.annotation.Nullable
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNicRequest updateNicRequest = (UpdateNicRequest) o;
        return Objects.equals(this.description, updateNicRequest.description)
                && Objects.equals(this.dryRun, updateNicRequest.dryRun)
                && Objects.equals(this.linkNic, updateNicRequest.linkNic)
                && Objects.equals(this.nicId, updateNicRequest.nicId)
                && Objects.equals(this.securityGroupIds, updateNicRequest.securityGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, dryRun, linkNic, nicId, securityGroupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNicRequest {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    linkNic: ").append(toIndentedString(linkNic)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
        sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
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
        openapiFields.add("Description");
        openapiFields.add("DryRun");
        openapiFields.add("LinkNic");
        openapiFields.add("NicId");
        openapiFields.add("SecurityGroupIds");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("NicId");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to UpdateNicRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!UpdateNicRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateNicRequest is not found in the"
                                        + " empty JSON string",
                                UpdateNicRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!UpdateNicRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateNicRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateNicRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull())
                && !jsonObj.get("Description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Description").toString()));
        }
        // validate the optional field `LinkNic`
        if (jsonObj.get("LinkNic") != null && !jsonObj.get("LinkNic").isJsonNull()) {
            LinkNicToUpdate.validateJsonObject(jsonObj.getAsJsonObject("LinkNic"));
        }
        if (!jsonObj.get("NicId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `NicId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("NicId").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("SecurityGroupIds") != null
                && !jsonObj.get("SecurityGroupIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SecurityGroupIds` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SecurityGroupIds").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateNicRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateNicRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateNicRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(UpdateNicRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateNicRequest>() {
                        @Override
                        public void write(JsonWriter out, UpdateNicRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateNicRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateNicRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateNicRequest
     * @throws IOException if the JSON string is invalid with respect to UpdateNicRequest
     */
    public static UpdateNicRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateNicRequest.class);
    }

    /**
     * Convert an instance of UpdateNicRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

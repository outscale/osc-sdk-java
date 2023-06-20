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

/** Permissions for the resource. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PermissionsOnResource {
    public static final String SERIALIZED_NAME_ACCOUNT_IDS = "AccountIds";

    @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
    private List<String> accountIds = null;

    public static final String SERIALIZED_NAME_GLOBAL_PERMISSION = "GlobalPermission";

    @SerializedName(SERIALIZED_NAME_GLOBAL_PERMISSION)
    private Boolean globalPermission;

    public PermissionsOnResource() {}

    public PermissionsOnResource accountIds(List<String> accountIds) {

        this.accountIds = accountIds;
        return this;
    }

    public PermissionsOnResource addAccountIdsItem(String accountIdsItem) {
        if (this.accountIds == null) {
            this.accountIds = new ArrayList<>();
        }
        this.accountIds.add(accountIdsItem);
        return this;
    }

    /**
     * One or more account IDs that the permission is associated with.
     *
     * @return accountIds
     */
    @javax.annotation.Nullable
    public List<String> getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
    }

    public PermissionsOnResource globalPermission(Boolean globalPermission) {

        this.globalPermission = globalPermission;
        return this;
    }

    /**
     * A global permission for all accounts.&lt;br /&gt; (Request) Set this parameter to true to
     * make the resource public (if the parent parameter is &#x60;Additions&#x60;) or to make the
     * resource private (if the parent parameter is &#x60;Removals&#x60;).&lt;br /&gt; (Response) If
     * true, the resource is public. If false, the resource is private.
     *
     * @return globalPermission
     */
    @javax.annotation.Nullable
    public Boolean getGlobalPermission() {
        return globalPermission;
    }

    public void setGlobalPermission(Boolean globalPermission) {
        this.globalPermission = globalPermission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PermissionsOnResource permissionsOnResource = (PermissionsOnResource) o;
        return Objects.equals(this.accountIds, permissionsOnResource.accountIds)
                && Objects.equals(this.globalPermission, permissionsOnResource.globalPermission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountIds, globalPermission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionsOnResource {\n");
        sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
        sb.append("    globalPermission: ").append(toIndentedString(globalPermission)).append("\n");
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
        openapiFields.add("AccountIds");
        openapiFields.add("GlobalPermission");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to PermissionsOnResource
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!PermissionsOnResource.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PermissionsOnResource is not found in"
                                        + " the empty JSON string",
                                PermissionsOnResource.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!PermissionsOnResource.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `PermissionsOnResource` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("AccountIds") != null && !jsonObj.get("AccountIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `AccountIds` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("AccountIds").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PermissionsOnResource.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PermissionsOnResource' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PermissionsOnResource> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PermissionsOnResource.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PermissionsOnResource>() {
                        @Override
                        public void write(JsonWriter out, PermissionsOnResource value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PermissionsOnResource read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PermissionsOnResource given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PermissionsOnResource
     * @throws IOException if the JSON string is invalid with respect to PermissionsOnResource
     */
    public static PermissionsOnResource fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PermissionsOnResource.class);
    }

    /**
     * Convert an instance of PermissionsOnResource to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

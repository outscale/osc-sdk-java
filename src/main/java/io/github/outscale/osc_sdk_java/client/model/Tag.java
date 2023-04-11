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

/** Information about the tag. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Tag {
    public static final String SERIALIZED_NAME_KEY = "Key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_RESOURCE_ID = "ResourceId";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
    private String resourceId;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "ResourceType";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public static final String SERIALIZED_NAME_VALUE = "Value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;

    public Tag() {}

    public Tag key(String key) {

        this.key = key;
        return this;
    }

    /**
     * The key of the tag, with a minimum of 1 character.
     *
     * @return key
     */
    @javax.annotation.Nullable
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Tag resourceId(String resourceId) {

        this.resourceId = resourceId;
        return this;
    }

    /**
     * The ID of the resource.
     *
     * @return resourceId
     */
    @javax.annotation.Nullable
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public Tag resourceType(String resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * The type of the resource.
     *
     * @return resourceType
     */
    @javax.annotation.Nullable
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public Tag value(String value) {

        this.value = value;
        return this;
    }

    /**
     * The value of the tag, between 0 and 255 characters.
     *
     * @return value
     */
    @javax.annotation.Nullable
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tag tag = (Tag) o;
        return Objects.equals(this.key, tag.key)
                && Objects.equals(this.resourceId, tag.resourceId)
                && Objects.equals(this.resourceType, tag.resourceType)
                && Objects.equals(this.value, tag.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, resourceId, resourceType, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tag {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
        openapiFields.add("Key");
        openapiFields.add("ResourceId");
        openapiFields.add("ResourceType");
        openapiFields.add("Value");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Tag
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Tag.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Tag is not found in the empty JSON"
                                        + " string",
                                Tag.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Tag.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Tag`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("Key") != null && !jsonObj.get("Key").isJsonNull())
                && !jsonObj.get("Key").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Key` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Key").toString()));
        }
        if ((jsonObj.get("ResourceId") != null && !jsonObj.get("ResourceId").isJsonNull())
                && !jsonObj.get("ResourceId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ResourceId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ResourceId").toString()));
        }
        if ((jsonObj.get("ResourceType") != null && !jsonObj.get("ResourceType").isJsonNull())
                && !jsonObj.get("ResourceType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ResourceType` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ResourceType").toString()));
        }
        if ((jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonNull())
                && !jsonObj.get("Value").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Value` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Value").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Tag.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Tag' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Tag> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Tag.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Tag>() {
                        @Override
                        public void write(JsonWriter out, Tag value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Tag read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Tag given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Tag
     * @throws IOException if the JSON string is invalid with respect to Tag
     */
    public static Tag fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Tag.class);
    }

    /**
     * Convert an instance of Tag to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

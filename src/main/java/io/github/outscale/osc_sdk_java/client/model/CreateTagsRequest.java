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
import com.google.gson.JsonArray;
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

/** CreateTagsRequest */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTagsRequest {
    public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";

    @SerializedName(SERIALIZED_NAME_DRY_RUN)
    private Boolean dryRun;

    public static final String SERIALIZED_NAME_RESOURCE_IDS = "ResourceIds";

    @SerializedName(SERIALIZED_NAME_RESOURCE_IDS)
    private List<String> resourceIds = new ArrayList<>();

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = new ArrayList<>();

    public CreateTagsRequest() {}

    public CreateTagsRequest dryRun(Boolean dryRun) {

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

    public CreateTagsRequest resourceIds(List<String> resourceIds) {

        this.resourceIds = resourceIds;
        return this;
    }

    public CreateTagsRequest addResourceIdsItem(String resourceIdsItem) {
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    /**
     * One or more resource IDs.
     *
     * @return resourceIds
     */
    @javax.annotation.Nonnull
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public CreateTagsRequest tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public CreateTagsRequest addTagsItem(ResourceTag tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags to add to the specified resources.
     *
     * @return tags
     */
    @javax.annotation.Nonnull
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTagsRequest createTagsRequest = (CreateTagsRequest) o;
        return Objects.equals(this.dryRun, createTagsRequest.dryRun)
                && Objects.equals(this.resourceIds, createTagsRequest.resourceIds)
                && Objects.equals(this.tags, createTagsRequest.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, resourceIds, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTagsRequest {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
        openapiFields.add("ResourceIds");
        openapiFields.add("Tags");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("ResourceIds");
        openapiRequiredFields.add("Tags");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to CreateTagsRequest
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateTagsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateTagsRequest is not found in the"
                                        + " empty JSON string",
                                CreateTagsRequest.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateTagsRequest.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateTagsRequest` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateTagsRequest.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        // ensure the required json array is present
        if (jsonObj.get("ResourceIds") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("ResourceIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ResourceIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("ResourceIds").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("Tags").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Tags` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Tags").toString()));
        }

        JsonArray jsonArraytags = jsonObj.getAsJsonArray("Tags");
        // validate the required field `Tags` (array)
        for (int i = 0; i < jsonArraytags.size(); i++) {
            ResourceTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateTagsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateTagsRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateTagsRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateTagsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateTagsRequest>() {
                        @Override
                        public void write(JsonWriter out, CreateTagsRequest value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateTagsRequest read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateTagsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateTagsRequest
     * @throws IOException if the JSON string is invalid with respect to CreateTagsRequest
     */
    public static CreateTagsRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateTagsRequest.class);
    }

    /**
     * Convert an instance of CreateTagsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
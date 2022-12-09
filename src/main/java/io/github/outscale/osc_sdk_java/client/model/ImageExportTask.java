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

/** Information about the OMI export task. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ImageExportTask {
    public static final String SERIALIZED_NAME_COMMENT = "Comment";

    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;

    public static final String SERIALIZED_NAME_IMAGE_ID = "ImageId";

    @SerializedName(SERIALIZED_NAME_IMAGE_ID)
    private String imageId;

    public static final String SERIALIZED_NAME_OSU_EXPORT = "OsuExport";

    @SerializedName(SERIALIZED_NAME_OSU_EXPORT)
    private OsuExportImageExportTask osuExport;

    public static final String SERIALIZED_NAME_PROGRESS = "Progress";

    @SerializedName(SERIALIZED_NAME_PROGRESS)
    private Integer progress;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public static final String SERIALIZED_NAME_TASK_ID = "TaskId";

    @SerializedName(SERIALIZED_NAME_TASK_ID)
    private String taskId;

    public ImageExportTask() {}

    public ImageExportTask comment(String comment) {

        this.comment = comment;
        return this;
    }

    /**
     * If the OMI export task fails, an error message appears.
     *
     * @return comment
     */
    @javax.annotation.Nullable
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ImageExportTask imageId(String imageId) {

        this.imageId = imageId;
        return this;
    }

    /**
     * The ID of the OMI to be exported.
     *
     * @return imageId
     */
    @javax.annotation.Nullable
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ImageExportTask osuExport(OsuExportImageExportTask osuExport) {

        this.osuExport = osuExport;
        return this;
    }

    /**
     * Get osuExport
     *
     * @return osuExport
     */
    @javax.annotation.Nullable
    public OsuExportImageExportTask getOsuExport() {
        return osuExport;
    }

    public void setOsuExport(OsuExportImageExportTask osuExport) {
        this.osuExport = osuExport;
    }

    public ImageExportTask progress(Integer progress) {

        this.progress = progress;
        return this;
    }

    /**
     * The progress of the OMI export task, as a percentage.
     *
     * @return progress
     */
    @javax.annotation.Nullable
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ImageExportTask state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the OMI export task (&#x60;pending/queued&#x60; \\| &#x60;pending&#x60; \\|
     * &#x60;completed&#x60; \\| &#x60;failed&#x60; \\| &#x60;cancelled&#x60;).
     *
     * @return state
     */
    @javax.annotation.Nullable
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ImageExportTask tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public ImageExportTask addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the image export task.
     *
     * @return tags
     */
    @javax.annotation.Nullable
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public ImageExportTask taskId(String taskId) {

        this.taskId = taskId;
        return this;
    }

    /**
     * The ID of the OMI export task.
     *
     * @return taskId
     */
    @javax.annotation.Nullable
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageExportTask imageExportTask = (ImageExportTask) o;
        return Objects.equals(this.comment, imageExportTask.comment)
                && Objects.equals(this.imageId, imageExportTask.imageId)
                && Objects.equals(this.osuExport, imageExportTask.osuExport)
                && Objects.equals(this.progress, imageExportTask.progress)
                && Objects.equals(this.state, imageExportTask.state)
                && Objects.equals(this.tags, imageExportTask.tags)
                && Objects.equals(this.taskId, imageExportTask.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, imageId, osuExport, progress, state, tags, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageExportTask {\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    osuExport: ").append(toIndentedString(osuExport)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
        openapiFields.add("Comment");
        openapiFields.add("ImageId");
        openapiFields.add("OsuExport");
        openapiFields.add("Progress");
        openapiFields.add("State");
        openapiFields.add("Tags");
        openapiFields.add("TaskId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ImageExportTask
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ImageExportTask.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ImageExportTask is not found in the"
                                        + " empty JSON string",
                                ImageExportTask.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ImageExportTask.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ImageExportTask` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("Comment") != null && !jsonObj.get("Comment").isJsonNull())
                && !jsonObj.get("Comment").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Comment` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("Comment").toString()));
        }
        if ((jsonObj.get("ImageId") != null && !jsonObj.get("ImageId").isJsonNull())
                && !jsonObj.get("ImageId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ImageId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ImageId").toString()));
        }
        // validate the optional field `OsuExport`
        if (jsonObj.get("OsuExport") != null && !jsonObj.get("OsuExport").isJsonNull()) {
            OsuExportImageExportTask.validateJsonObject(jsonObj.getAsJsonObject("OsuExport"));
        }
        if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull())
                && !jsonObj.get("State").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `State` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("State").toString()));
        }
        if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
            JsonArray jsonArraytags = jsonObj.getAsJsonArray("Tags");
            if (jsonArraytags != null) {
                // ensure the json data is an array
                if (!jsonObj.get("Tags").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `Tags` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("Tags").toString()));
                }

                // validate the optional field `Tags` (array)
                for (int i = 0; i < jsonArraytags.size(); i++) {
                    ResourceTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
                }
                ;
            }
        }
        if ((jsonObj.get("TaskId") != null && !jsonObj.get("TaskId").isJsonNull())
                && !jsonObj.get("TaskId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `TaskId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("TaskId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ImageExportTask.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ImageExportTask' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ImageExportTask> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ImageExportTask.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ImageExportTask>() {
                        @Override
                        public void write(JsonWriter out, ImageExportTask value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ImageExportTask read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ImageExportTask given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ImageExportTask
     * @throws IOException if the JSON string is invalid with respect to ImageExportTask
     */
    public static ImageExportTask fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ImageExportTask.class);
    }

    /**
     * Convert an instance of ImageExportTask to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

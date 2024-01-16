/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html). ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages. ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).
 *
 * The version of the OpenAPI document: 1.28.5
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

/** Information about the snapshot export task. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SnapshotExportTask {
    public static final String SERIALIZED_NAME_COMMENT = "Comment";

    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;

    public static final String SERIALIZED_NAME_OSU_EXPORT = "OsuExport";

    @SerializedName(SERIALIZED_NAME_OSU_EXPORT)
    private OsuExportSnapshotExportTask osuExport;

    public static final String SERIALIZED_NAME_PROGRESS = "Progress";

    @SerializedName(SERIALIZED_NAME_PROGRESS)
    private Integer progress;

    public static final String SERIALIZED_NAME_SNAPSHOT_ID = "SnapshotId";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
    private String snapshotId;

    public static final String SERIALIZED_NAME_STATE = "State";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public static final String SERIALIZED_NAME_TAGS = "Tags";

    @SerializedName(SERIALIZED_NAME_TAGS)
    private List<ResourceTag> tags = null;

    public static final String SERIALIZED_NAME_TASK_ID = "TaskId";

    @SerializedName(SERIALIZED_NAME_TASK_ID)
    private String taskId;

    public SnapshotExportTask() {}

    public SnapshotExportTask comment(String comment) {

        this.comment = comment;
        return this;
    }

    /**
     * If the snapshot export task fails, an error message appears.
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

    public SnapshotExportTask osuExport(OsuExportSnapshotExportTask osuExport) {

        this.osuExport = osuExport;
        return this;
    }

    /**
     * Get osuExport
     *
     * @return osuExport
     */
    @javax.annotation.Nullable
    public OsuExportSnapshotExportTask getOsuExport() {
        return osuExport;
    }

    public void setOsuExport(OsuExportSnapshotExportTask osuExport) {
        this.osuExport = osuExport;
    }

    public SnapshotExportTask progress(Integer progress) {

        this.progress = progress;
        return this;
    }

    /**
     * The progress of the snapshot export task, as a percentage.
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

    public SnapshotExportTask snapshotId(String snapshotId) {

        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * The ID of the snapshot to be exported.
     *
     * @return snapshotId
     */
    @javax.annotation.Nullable
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public SnapshotExportTask state(String state) {

        this.state = state;
        return this;
    }

    /**
     * The state of the snapshot export task (&#x60;pending&#x60; \\| &#x60;active&#x60; \\|
     * &#x60;completed&#x60; \\| &#x60;failed&#x60;).
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

    public SnapshotExportTask tags(List<ResourceTag> tags) {

        this.tags = tags;
        return this;
    }

    public SnapshotExportTask addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * One or more tags associated with the snapshot export task.
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

    public SnapshotExportTask taskId(String taskId) {

        this.taskId = taskId;
        return this;
    }

    /**
     * The ID of the snapshot export task.
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
        SnapshotExportTask snapshotExportTask = (SnapshotExportTask) o;
        return Objects.equals(this.comment, snapshotExportTask.comment)
                && Objects.equals(this.osuExport, snapshotExportTask.osuExport)
                && Objects.equals(this.progress, snapshotExportTask.progress)
                && Objects.equals(this.snapshotId, snapshotExportTask.snapshotId)
                && Objects.equals(this.state, snapshotExportTask.state)
                && Objects.equals(this.tags, snapshotExportTask.tags)
                && Objects.equals(this.taskId, snapshotExportTask.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, osuExport, progress, snapshotId, state, tags, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotExportTask {\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    osuExport: ").append(toIndentedString(osuExport)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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
        openapiFields.add("OsuExport");
        openapiFields.add("Progress");
        openapiFields.add("SnapshotId");
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
     * @throws IOException if the JSON Object is invalid with respect to SnapshotExportTask
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!SnapshotExportTask.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SnapshotExportTask is not found in"
                                        + " the empty JSON string",
                                SnapshotExportTask.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!SnapshotExportTask.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SnapshotExportTask` properties. JSON: %s",
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
        // validate the optional field `OsuExport`
        if (jsonObj.get("OsuExport") != null && !jsonObj.get("OsuExport").isJsonNull()) {
            OsuExportSnapshotExportTask.validateJsonObject(jsonObj.getAsJsonObject("OsuExport"));
        }
        if ((jsonObj.get("SnapshotId") != null && !jsonObj.get("SnapshotId").isJsonNull())
                && !jsonObj.get("SnapshotId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SnapshotId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("SnapshotId").toString()));
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
            if (!SnapshotExportTask.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SnapshotExportTask' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SnapshotExportTask> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SnapshotExportTask.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SnapshotExportTask>() {
                        @Override
                        public void write(JsonWriter out, SnapshotExportTask value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SnapshotExportTask read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SnapshotExportTask given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SnapshotExportTask
     * @throws IOException if the JSON string is invalid with respect to SnapshotExportTask
     */
    public static SnapshotExportTask fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SnapshotExportTask.class);
    }

    /**
     * Convert an instance of SnapshotExportTask to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/About-the-APIs.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html).  > If you try to sign requests with an invalid access key four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages.  > If you try to sign requests with an invalid password four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).<br /> # Error Codes Reference You can learn more about errors returned by the API in the dedicated [errors page](api-errors.html).
 *
 * The version of the OpenAPI document: 1.30.0
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

/** Information about the flexible GPU (fGPU) that is available in the public catalog. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FlexibleGpuCatalog {
    public static final String SERIALIZED_NAME_GENERATIONS = "Generations";

    @SerializedName(SERIALIZED_NAME_GENERATIONS)
    private List<String> generations = null;

    public static final String SERIALIZED_NAME_MAX_CPU = "MaxCpu";

    @SerializedName(SERIALIZED_NAME_MAX_CPU)
    private Integer maxCpu;

    public static final String SERIALIZED_NAME_MAX_RAM = "MaxRam";

    @SerializedName(SERIALIZED_NAME_MAX_RAM)
    private Integer maxRam;

    public static final String SERIALIZED_NAME_MODEL_NAME = "ModelName";

    @SerializedName(SERIALIZED_NAME_MODEL_NAME)
    private String modelName;

    public static final String SERIALIZED_NAME_VRAM = "VRam";

    @SerializedName(SERIALIZED_NAME_VRAM)
    private Integer vram;

    public FlexibleGpuCatalog() {}

    public FlexibleGpuCatalog generations(List<String> generations) {

        this.generations = generations;
        return this;
    }

    public FlexibleGpuCatalog addGenerationsItem(String generationsItem) {
        if (this.generations == null) {
            this.generations = new ArrayList<>();
        }
        this.generations.add(generationsItem);
        return this;
    }

    /**
     * The processor generations that the fGPUs are compatible with.
     *
     * @return generations
     */
    @javax.annotation.Nullable
    public List<String> getGenerations() {
        return generations;
    }

    public void setGenerations(List<String> generations) {
        this.generations = generations;
    }

    public FlexibleGpuCatalog maxCpu(Integer maxCpu) {

        this.maxCpu = maxCpu;
        return this;
    }

    /**
     * The maximum number of VM vCores that the fGPU is compatible with.
     *
     * @return maxCpu
     */
    @javax.annotation.Nullable
    public Integer getMaxCpu() {
        return maxCpu;
    }

    public void setMaxCpu(Integer maxCpu) {
        this.maxCpu = maxCpu;
    }

    public FlexibleGpuCatalog maxRam(Integer maxRam) {

        this.maxRam = maxRam;
        return this;
    }

    /**
     * The maximum amount of VM memory that the fGPU is compatible with.
     *
     * @return maxRam
     */
    @javax.annotation.Nullable
    public Integer getMaxRam() {
        return maxRam;
    }

    public void setMaxRam(Integer maxRam) {
        this.maxRam = maxRam;
    }

    public FlexibleGpuCatalog modelName(String modelName) {

        this.modelName = modelName;
        return this;
    }

    /**
     * The model of fGPU.
     *
     * @return modelName
     */
    @javax.annotation.Nullable
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public FlexibleGpuCatalog vram(Integer vram) {

        this.vram = vram;
        return this;
    }

    /**
     * The amount of video RAM (VRAM) of the fGPU.
     *
     * @return vram
     */
    @javax.annotation.Nullable
    public Integer getVram() {
        return vram;
    }

    public void setVram(Integer vram) {
        this.vram = vram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlexibleGpuCatalog flexibleGpuCatalog = (FlexibleGpuCatalog) o;
        return Objects.equals(this.generations, flexibleGpuCatalog.generations)
                && Objects.equals(this.maxCpu, flexibleGpuCatalog.maxCpu)
                && Objects.equals(this.maxRam, flexibleGpuCatalog.maxRam)
                && Objects.equals(this.modelName, flexibleGpuCatalog.modelName)
                && Objects.equals(this.vram, flexibleGpuCatalog.vram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generations, maxCpu, maxRam, modelName, vram);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlexibleGpuCatalog {\n");
        sb.append("    generations: ").append(toIndentedString(generations)).append("\n");
        sb.append("    maxCpu: ").append(toIndentedString(maxCpu)).append("\n");
        sb.append("    maxRam: ").append(toIndentedString(maxRam)).append("\n");
        sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
        sb.append("    vram: ").append(toIndentedString(vram)).append("\n");
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
        openapiFields.add("Generations");
        openapiFields.add("MaxCpu");
        openapiFields.add("MaxRam");
        openapiFields.add("ModelName");
        openapiFields.add("VRam");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FlexibleGpuCatalog
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FlexibleGpuCatalog.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FlexibleGpuCatalog is not found in"
                                        + " the empty JSON string",
                                FlexibleGpuCatalog.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FlexibleGpuCatalog.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FlexibleGpuCatalog` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Generations") != null && !jsonObj.get("Generations").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Generations` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Generations").toString()));
        }
        if ((jsonObj.get("ModelName") != null && !jsonObj.get("ModelName").isJsonNull())
                && !jsonObj.get("ModelName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ModelName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ModelName").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FlexibleGpuCatalog.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FlexibleGpuCatalog' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FlexibleGpuCatalog> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FlexibleGpuCatalog.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FlexibleGpuCatalog>() {
                        @Override
                        public void write(JsonWriter out, FlexibleGpuCatalog value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FlexibleGpuCatalog read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FlexibleGpuCatalog given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FlexibleGpuCatalog
     * @throws IOException if the JSON string is invalid with respect to FlexibleGpuCatalog
     */
    public static FlexibleGpuCatalog fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FlexibleGpuCatalog.class);
    }

    /**
     * Convert an instance of FlexibleGpuCatalog to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

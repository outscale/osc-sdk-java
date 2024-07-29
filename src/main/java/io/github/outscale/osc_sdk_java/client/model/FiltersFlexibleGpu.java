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

/** One or more filters. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiltersFlexibleGpu {
    public static final String SERIALIZED_NAME_DELETE_ON_VM_DELETION = "DeleteOnVmDeletion";

    @SerializedName(SERIALIZED_NAME_DELETE_ON_VM_DELETION)
    private Boolean deleteOnVmDeletion;

    public static final String SERIALIZED_NAME_FLEXIBLE_GPU_IDS = "FlexibleGpuIds";

    @SerializedName(SERIALIZED_NAME_FLEXIBLE_GPU_IDS)
    private List<String> flexibleGpuIds = null;

    public static final String SERIALIZED_NAME_GENERATIONS = "Generations";

    @SerializedName(SERIALIZED_NAME_GENERATIONS)
    private List<String> generations = null;

    public static final String SERIALIZED_NAME_MODEL_NAMES = "ModelNames";

    @SerializedName(SERIALIZED_NAME_MODEL_NAMES)
    private List<String> modelNames = null;

    public static final String SERIALIZED_NAME_STATES = "States";

    @SerializedName(SERIALIZED_NAME_STATES)
    private List<String> states = null;

    public static final String SERIALIZED_NAME_SUBREGION_NAMES = "SubregionNames";

    @SerializedName(SERIALIZED_NAME_SUBREGION_NAMES)
    private List<String> subregionNames = null;

    public static final String SERIALIZED_NAME_VM_IDS = "VmIds";

    @SerializedName(SERIALIZED_NAME_VM_IDS)
    private List<String> vmIds = null;

    public FiltersFlexibleGpu() {}

    public FiltersFlexibleGpu deleteOnVmDeletion(Boolean deleteOnVmDeletion) {

        this.deleteOnVmDeletion = deleteOnVmDeletion;
        return this;
    }

    /**
     * Indicates whether the fGPU is deleted when terminating the VM.
     *
     * @return deleteOnVmDeletion
     */
    @javax.annotation.Nullable
    public Boolean getDeleteOnVmDeletion() {
        return deleteOnVmDeletion;
    }

    public void setDeleteOnVmDeletion(Boolean deleteOnVmDeletion) {
        this.deleteOnVmDeletion = deleteOnVmDeletion;
    }

    public FiltersFlexibleGpu flexibleGpuIds(List<String> flexibleGpuIds) {

        this.flexibleGpuIds = flexibleGpuIds;
        return this;
    }

    public FiltersFlexibleGpu addFlexibleGpuIdsItem(String flexibleGpuIdsItem) {
        if (this.flexibleGpuIds == null) {
            this.flexibleGpuIds = new ArrayList<>();
        }
        this.flexibleGpuIds.add(flexibleGpuIdsItem);
        return this;
    }

    /**
     * One or more IDs of fGPUs.
     *
     * @return flexibleGpuIds
     */
    @javax.annotation.Nullable
    public List<String> getFlexibleGpuIds() {
        return flexibleGpuIds;
    }

    public void setFlexibleGpuIds(List<String> flexibleGpuIds) {
        this.flexibleGpuIds = flexibleGpuIds;
    }

    public FiltersFlexibleGpu generations(List<String> generations) {

        this.generations = generations;
        return this;
    }

    public FiltersFlexibleGpu addGenerationsItem(String generationsItem) {
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

    public FiltersFlexibleGpu modelNames(List<String> modelNames) {

        this.modelNames = modelNames;
        return this;
    }

    public FiltersFlexibleGpu addModelNamesItem(String modelNamesItem) {
        if (this.modelNames == null) {
            this.modelNames = new ArrayList<>();
        }
        this.modelNames.add(modelNamesItem);
        return this;
    }

    /**
     * One or more models of fGPUs. For more information, see [About Flexible
     * GPUs](https://docs.outscale.com/en/userguide/About-Flexible-GPUs.html).
     *
     * @return modelNames
     */
    @javax.annotation.Nullable
    public List<String> getModelNames() {
        return modelNames;
    }

    public void setModelNames(List<String> modelNames) {
        this.modelNames = modelNames;
    }

    public FiltersFlexibleGpu states(List<String> states) {

        this.states = states;
        return this;
    }

    public FiltersFlexibleGpu addStatesItem(String statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    /**
     * The states of the fGPUs (&#x60;allocated&#x60; \\| &#x60;attaching&#x60; \\|
     * &#x60;attached&#x60; \\| &#x60;detaching&#x60;).
     *
     * @return states
     */
    @javax.annotation.Nullable
    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }

    public FiltersFlexibleGpu subregionNames(List<String> subregionNames) {

        this.subregionNames = subregionNames;
        return this;
    }

    public FiltersFlexibleGpu addSubregionNamesItem(String subregionNamesItem) {
        if (this.subregionNames == null) {
            this.subregionNames = new ArrayList<>();
        }
        this.subregionNames.add(subregionNamesItem);
        return this;
    }

    /**
     * The Subregions where the fGPUs are located.
     *
     * @return subregionNames
     */
    @javax.annotation.Nullable
    public List<String> getSubregionNames() {
        return subregionNames;
    }

    public void setSubregionNames(List<String> subregionNames) {
        this.subregionNames = subregionNames;
    }

    public FiltersFlexibleGpu vmIds(List<String> vmIds) {

        this.vmIds = vmIds;
        return this;
    }

    public FiltersFlexibleGpu addVmIdsItem(String vmIdsItem) {
        if (this.vmIds == null) {
            this.vmIds = new ArrayList<>();
        }
        this.vmIds.add(vmIdsItem);
        return this;
    }

    /**
     * One or more IDs of VMs.
     *
     * @return vmIds
     */
    @javax.annotation.Nullable
    public List<String> getVmIds() {
        return vmIds;
    }

    public void setVmIds(List<String> vmIds) {
        this.vmIds = vmIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersFlexibleGpu filtersFlexibleGpu = (FiltersFlexibleGpu) o;
        return Objects.equals(this.deleteOnVmDeletion, filtersFlexibleGpu.deleteOnVmDeletion)
                && Objects.equals(this.flexibleGpuIds, filtersFlexibleGpu.flexibleGpuIds)
                && Objects.equals(this.generations, filtersFlexibleGpu.generations)
                && Objects.equals(this.modelNames, filtersFlexibleGpu.modelNames)
                && Objects.equals(this.states, filtersFlexibleGpu.states)
                && Objects.equals(this.subregionNames, filtersFlexibleGpu.subregionNames)
                && Objects.equals(this.vmIds, filtersFlexibleGpu.vmIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                deleteOnVmDeletion,
                flexibleGpuIds,
                generations,
                modelNames,
                states,
                subregionNames,
                vmIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersFlexibleGpu {\n");
        sb.append("    deleteOnVmDeletion: ")
                .append(toIndentedString(deleteOnVmDeletion))
                .append("\n");
        sb.append("    flexibleGpuIds: ").append(toIndentedString(flexibleGpuIds)).append("\n");
        sb.append("    generations: ").append(toIndentedString(generations)).append("\n");
        sb.append("    modelNames: ").append(toIndentedString(modelNames)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    subregionNames: ").append(toIndentedString(subregionNames)).append("\n");
        sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
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
        openapiFields.add("DeleteOnVmDeletion");
        openapiFields.add("FlexibleGpuIds");
        openapiFields.add("Generations");
        openapiFields.add("ModelNames");
        openapiFields.add("States");
        openapiFields.add("SubregionNames");
        openapiFields.add("VmIds");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersFlexibleGpu
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersFlexibleGpu.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersFlexibleGpu is not found in"
                                        + " the empty JSON string",
                                FiltersFlexibleGpu.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersFlexibleGpu.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersFlexibleGpu` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("FlexibleGpuIds") != null && !jsonObj.get("FlexibleGpuIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `FlexibleGpuIds` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("FlexibleGpuIds").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Generations") != null && !jsonObj.get("Generations").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Generations` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("Generations").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("ModelNames") != null && !jsonObj.get("ModelNames").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ModelNames` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("ModelNames").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("States") != null && !jsonObj.get("States").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `States` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("States").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("SubregionNames") != null && !jsonObj.get("SubregionNames").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `SubregionNames` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("SubregionNames").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VmIds") != null && !jsonObj.get("VmIds").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmIds` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("VmIds").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersFlexibleGpu.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersFlexibleGpu' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersFlexibleGpu> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersFlexibleGpu.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersFlexibleGpu>() {
                        @Override
                        public void write(JsonWriter out, FiltersFlexibleGpu value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersFlexibleGpu read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersFlexibleGpu given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersFlexibleGpu
     * @throws IOException if the JSON string is invalid with respect to FiltersFlexibleGpu
     */
    public static FiltersFlexibleGpu fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersFlexibleGpu.class);
    }

    /**
     * Convert an instance of FiltersFlexibleGpu to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

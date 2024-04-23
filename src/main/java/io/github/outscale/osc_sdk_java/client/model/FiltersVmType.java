/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html).  > If you try to sign requests with an invalid access key four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages.  > If you try to sign requests with an invalid password four times in a row, further authentication attempts will be prevented for 1 minute. This lockout time increases 1 minute every four failed attempts, for up to 10 minutes.  ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).<br /> # Error Codes Reference You can learn more about errors returned by the API in the dedicated [errors page](api-errors.html).
 *
 * The version of the OpenAPI document: 1.29.3
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
public class FiltersVmType {
    public static final String SERIALIZED_NAME_BSU_OPTIMIZED = "BsuOptimized";

    @SerializedName(SERIALIZED_NAME_BSU_OPTIMIZED)
    private Boolean bsuOptimized;

    public static final String SERIALIZED_NAME_EPHEMERALS_TYPES = "EphemeralsTypes";

    @SerializedName(SERIALIZED_NAME_EPHEMERALS_TYPES)
    private List<String> ephemeralsTypes = null;

    public static final String SERIALIZED_NAME_ETHS = "Eths";

    @SerializedName(SERIALIZED_NAME_ETHS)
    private List<Integer> eths = null;

    public static final String SERIALIZED_NAME_GPUS = "Gpus";

    @SerializedName(SERIALIZED_NAME_GPUS)
    private List<Integer> gpus = null;

    public static final String SERIALIZED_NAME_MEMORY_SIZES = "MemorySizes";

    @SerializedName(SERIALIZED_NAME_MEMORY_SIZES)
    private List<Float> memorySizes = null;

    public static final String SERIALIZED_NAME_VCORE_COUNTS = "VcoreCounts";

    @SerializedName(SERIALIZED_NAME_VCORE_COUNTS)
    private List<Integer> vcoreCounts = null;

    public static final String SERIALIZED_NAME_VM_TYPE_NAMES = "VmTypeNames";

    @SerializedName(SERIALIZED_NAME_VM_TYPE_NAMES)
    private List<String> vmTypeNames = null;

    public static final String SERIALIZED_NAME_VOLUME_COUNTS = "VolumeCounts";

    @SerializedName(SERIALIZED_NAME_VOLUME_COUNTS)
    private List<Integer> volumeCounts = null;

    public static final String SERIALIZED_NAME_VOLUME_SIZES = "VolumeSizes";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZES)
    private List<Integer> volumeSizes = null;

    public FiltersVmType() {}

    public FiltersVmType bsuOptimized(Boolean bsuOptimized) {

        this.bsuOptimized = bsuOptimized;
        return this;
    }

    /**
     * This parameter is not available. It is present in our API for the sake of historical
     * compatibility with AWS.
     *
     * @return bsuOptimized
     */
    @javax.annotation.Nullable
    public Boolean getBsuOptimized() {
        return bsuOptimized;
    }

    public void setBsuOptimized(Boolean bsuOptimized) {
        this.bsuOptimized = bsuOptimized;
    }

    public FiltersVmType ephemeralsTypes(List<String> ephemeralsTypes) {

        this.ephemeralsTypes = ephemeralsTypes;
        return this;
    }

    public FiltersVmType addEphemeralsTypesItem(String ephemeralsTypesItem) {
        if (this.ephemeralsTypes == null) {
            this.ephemeralsTypes = new ArrayList<>();
        }
        this.ephemeralsTypes.add(ephemeralsTypesItem);
        return this;
    }

    /**
     * The types of ephemeral storage disk.
     *
     * @return ephemeralsTypes
     */
    @javax.annotation.Nullable
    public List<String> getEphemeralsTypes() {
        return ephemeralsTypes;
    }

    public void setEphemeralsTypes(List<String> ephemeralsTypes) {
        this.ephemeralsTypes = ephemeralsTypes;
    }

    public FiltersVmType eths(List<Integer> eths) {

        this.eths = eths;
        return this;
    }

    public FiltersVmType addEthsItem(Integer ethsItem) {
        if (this.eths == null) {
            this.eths = new ArrayList<>();
        }
        this.eths.add(ethsItem);
        return this;
    }

    /**
     * The number of Ethernet interfaces available.
     *
     * @return eths
     */
    @javax.annotation.Nullable
    public List<Integer> getEths() {
        return eths;
    }

    public void setEths(List<Integer> eths) {
        this.eths = eths;
    }

    public FiltersVmType gpus(List<Integer> gpus) {

        this.gpus = gpus;
        return this;
    }

    public FiltersVmType addGpusItem(Integer gpusItem) {
        if (this.gpus == null) {
            this.gpus = new ArrayList<>();
        }
        this.gpus.add(gpusItem);
        return this;
    }

    /**
     * The number of GPUs available.
     *
     * @return gpus
     */
    @javax.annotation.Nullable
    public List<Integer> getGpus() {
        return gpus;
    }

    public void setGpus(List<Integer> gpus) {
        this.gpus = gpus;
    }

    public FiltersVmType memorySizes(List<Float> memorySizes) {

        this.memorySizes = memorySizes;
        return this;
    }

    public FiltersVmType addMemorySizesItem(Float memorySizesItem) {
        if (this.memorySizes == null) {
            this.memorySizes = new ArrayList<>();
        }
        this.memorySizes.add(memorySizesItem);
        return this;
    }

    /**
     * The amounts of memory, in gibibytes (GiB).
     *
     * @return memorySizes
     */
    @javax.annotation.Nullable
    public List<Float> getMemorySizes() {
        return memorySizes;
    }

    public void setMemorySizes(List<Float> memorySizes) {
        this.memorySizes = memorySizes;
    }

    public FiltersVmType vcoreCounts(List<Integer> vcoreCounts) {

        this.vcoreCounts = vcoreCounts;
        return this;
    }

    public FiltersVmType addVcoreCountsItem(Integer vcoreCountsItem) {
        if (this.vcoreCounts == null) {
            this.vcoreCounts = new ArrayList<>();
        }
        this.vcoreCounts.add(vcoreCountsItem);
        return this;
    }

    /**
     * The numbers of vCores.
     *
     * @return vcoreCounts
     */
    @javax.annotation.Nullable
    public List<Integer> getVcoreCounts() {
        return vcoreCounts;
    }

    public void setVcoreCounts(List<Integer> vcoreCounts) {
        this.vcoreCounts = vcoreCounts;
    }

    public FiltersVmType vmTypeNames(List<String> vmTypeNames) {

        this.vmTypeNames = vmTypeNames;
        return this;
    }

    public FiltersVmType addVmTypeNamesItem(String vmTypeNamesItem) {
        if (this.vmTypeNames == null) {
            this.vmTypeNames = new ArrayList<>();
        }
        this.vmTypeNames.add(vmTypeNamesItem);
        return this;
    }

    /**
     * The names of the VM types. For more information, see [VM
     * Types](https://docs.outscale.com/en/userguide/VM-Types.html).
     *
     * @return vmTypeNames
     */
    @javax.annotation.Nullable
    public List<String> getVmTypeNames() {
        return vmTypeNames;
    }

    public void setVmTypeNames(List<String> vmTypeNames) {
        this.vmTypeNames = vmTypeNames;
    }

    public FiltersVmType volumeCounts(List<Integer> volumeCounts) {

        this.volumeCounts = volumeCounts;
        return this;
    }

    public FiltersVmType addVolumeCountsItem(Integer volumeCountsItem) {
        if (this.volumeCounts == null) {
            this.volumeCounts = new ArrayList<>();
        }
        this.volumeCounts.add(volumeCountsItem);
        return this;
    }

    /**
     * The maximum number of ephemeral storage disks.
     *
     * @return volumeCounts
     */
    @javax.annotation.Nullable
    public List<Integer> getVolumeCounts() {
        return volumeCounts;
    }

    public void setVolumeCounts(List<Integer> volumeCounts) {
        this.volumeCounts = volumeCounts;
    }

    public FiltersVmType volumeSizes(List<Integer> volumeSizes) {

        this.volumeSizes = volumeSizes;
        return this;
    }

    public FiltersVmType addVolumeSizesItem(Integer volumeSizesItem) {
        if (this.volumeSizes == null) {
            this.volumeSizes = new ArrayList<>();
        }
        this.volumeSizes.add(volumeSizesItem);
        return this;
    }

    /**
     * The size of one ephemeral storage disk, in gibibytes (GiB).
     *
     * @return volumeSizes
     */
    @javax.annotation.Nullable
    public List<Integer> getVolumeSizes() {
        return volumeSizes;
    }

    public void setVolumeSizes(List<Integer> volumeSizes) {
        this.volumeSizes = volumeSizes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FiltersVmType filtersVmType = (FiltersVmType) o;
        return Objects.equals(this.bsuOptimized, filtersVmType.bsuOptimized)
                && Objects.equals(this.ephemeralsTypes, filtersVmType.ephemeralsTypes)
                && Objects.equals(this.eths, filtersVmType.eths)
                && Objects.equals(this.gpus, filtersVmType.gpus)
                && Objects.equals(this.memorySizes, filtersVmType.memorySizes)
                && Objects.equals(this.vcoreCounts, filtersVmType.vcoreCounts)
                && Objects.equals(this.vmTypeNames, filtersVmType.vmTypeNames)
                && Objects.equals(this.volumeCounts, filtersVmType.volumeCounts)
                && Objects.equals(this.volumeSizes, filtersVmType.volumeSizes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                bsuOptimized,
                ephemeralsTypes,
                eths,
                gpus,
                memorySizes,
                vcoreCounts,
                vmTypeNames,
                volumeCounts,
                volumeSizes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FiltersVmType {\n");
        sb.append("    bsuOptimized: ").append(toIndentedString(bsuOptimized)).append("\n");
        sb.append("    ephemeralsTypes: ").append(toIndentedString(ephemeralsTypes)).append("\n");
        sb.append("    eths: ").append(toIndentedString(eths)).append("\n");
        sb.append("    gpus: ").append(toIndentedString(gpus)).append("\n");
        sb.append("    memorySizes: ").append(toIndentedString(memorySizes)).append("\n");
        sb.append("    vcoreCounts: ").append(toIndentedString(vcoreCounts)).append("\n");
        sb.append("    vmTypeNames: ").append(toIndentedString(vmTypeNames)).append("\n");
        sb.append("    volumeCounts: ").append(toIndentedString(volumeCounts)).append("\n");
        sb.append("    volumeSizes: ").append(toIndentedString(volumeSizes)).append("\n");
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
        openapiFields.add("BsuOptimized");
        openapiFields.add("EphemeralsTypes");
        openapiFields.add("Eths");
        openapiFields.add("Gpus");
        openapiFields.add("MemorySizes");
        openapiFields.add("VcoreCounts");
        openapiFields.add("VmTypeNames");
        openapiFields.add("VolumeCounts");
        openapiFields.add("VolumeSizes");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to FiltersVmType
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!FiltersVmType.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in FiltersVmType is not found in the"
                                        + " empty JSON string",
                                FiltersVmType.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!FiltersVmType.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `FiltersVmType` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("EphemeralsTypes") != null
                && !jsonObj.get("EphemeralsTypes").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `EphemeralsTypes` to be an array in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("EphemeralsTypes").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Eths") != null && !jsonObj.get("Eths").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Eths` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Eths").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("Gpus") != null && !jsonObj.get("Gpus").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `Gpus` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("Gpus").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("MemorySizes") != null && !jsonObj.get("MemorySizes").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `MemorySizes` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("MemorySizes").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VcoreCounts") != null && !jsonObj.get("VcoreCounts").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VcoreCounts` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VcoreCounts").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VmTypeNames") != null && !jsonObj.get("VmTypeNames").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VmTypeNames` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VmTypeNames").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VolumeCounts") != null && !jsonObj.get("VolumeCounts").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VolumeCounts` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VolumeCounts").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("VolumeSizes") != null && !jsonObj.get("VolumeSizes").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VolumeSizes` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("VolumeSizes").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FiltersVmType.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FiltersVmType' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FiltersVmType> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(FiltersVmType.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FiltersVmType>() {
                        @Override
                        public void write(JsonWriter out, FiltersVmType value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FiltersVmType read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FiltersVmType given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FiltersVmType
     * @throws IOException if the JSON string is invalid with respect to FiltersVmType
     */
    public static FiltersVmType fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FiltersVmType.class);
    }

    /**
     * Convert an instance of FiltersVmType to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

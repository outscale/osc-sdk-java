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

/** One or more parameters used to automatically set up volumes when the VM is created. */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BlockDeviceMappingImage {
    public static final String SERIALIZED_NAME_BSU = "Bsu";

    @SerializedName(SERIALIZED_NAME_BSU)
    private BsuToCreate bsu;

    public static final String SERIALIZED_NAME_DEVICE_NAME = "DeviceName";

    @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
    private String deviceName;

    public static final String SERIALIZED_NAME_VIRTUAL_DEVICE_NAME = "VirtualDeviceName";

    @SerializedName(SERIALIZED_NAME_VIRTUAL_DEVICE_NAME)
    private String virtualDeviceName;

    public BlockDeviceMappingImage() {}

    public BlockDeviceMappingImage bsu(BsuToCreate bsu) {

        this.bsu = bsu;
        return this;
    }

    /**
     * Get bsu
     *
     * @return bsu
     */
    @javax.annotation.Nullable
    public BsuToCreate getBsu() {
        return bsu;
    }

    public void setBsu(BsuToCreate bsu) {
        this.bsu = bsu;
    }

    public BlockDeviceMappingImage deviceName(String deviceName) {

        this.deviceName = deviceName;
        return this;
    }

    /**
     * The device name for the volume. For a root device, you must use &#x60;/dev/sda1&#x60;. For
     * other volumes, you must use &#x60;/dev/sdX&#x60;, &#x60;/dev/sdXX&#x60;,
     * &#x60;/dev/xvdX&#x60;, or &#x60;/dev/xvdXX&#x60; (where the first &#x60;X&#x60; is a letter
     * between &#x60;b&#x60; and &#x60;z&#x60;, and the second &#x60;X&#x60; is a letter between
     * &#x60;a&#x60; and &#x60;z&#x60;).
     *
     * @return deviceName
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public BlockDeviceMappingImage virtualDeviceName(String virtualDeviceName) {

        this.virtualDeviceName = virtualDeviceName;
        return this;
    }

    /**
     * The name of the virtual device (&#x60;ephemeralN&#x60;).
     *
     * @return virtualDeviceName
     */
    @javax.annotation.Nullable
    public String getVirtualDeviceName() {
        return virtualDeviceName;
    }

    public void setVirtualDeviceName(String virtualDeviceName) {
        this.virtualDeviceName = virtualDeviceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlockDeviceMappingImage blockDeviceMappingImage = (BlockDeviceMappingImage) o;
        return Objects.equals(this.bsu, blockDeviceMappingImage.bsu)
                && Objects.equals(this.deviceName, blockDeviceMappingImage.deviceName)
                && Objects.equals(
                        this.virtualDeviceName, blockDeviceMappingImage.virtualDeviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bsu, deviceName, virtualDeviceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BlockDeviceMappingImage {\n");
        sb.append("    bsu: ").append(toIndentedString(bsu)).append("\n");
        sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
        sb.append("    virtualDeviceName: ")
                .append(toIndentedString(virtualDeviceName))
                .append("\n");
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
        openapiFields.add("Bsu");
        openapiFields.add("DeviceName");
        openapiFields.add("VirtualDeviceName");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to BlockDeviceMappingImage
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!BlockDeviceMappingImage.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in BlockDeviceMappingImage is not found"
                                        + " in the empty JSON string",
                                BlockDeviceMappingImage.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!BlockDeviceMappingImage.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `BlockDeviceMappingImage` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        // validate the optional field `Bsu`
        if (jsonObj.get("Bsu") != null && !jsonObj.get("Bsu").isJsonNull()) {
            BsuToCreate.validateJsonObject(jsonObj.getAsJsonObject("Bsu"));
        }
        if ((jsonObj.get("DeviceName") != null && !jsonObj.get("DeviceName").isJsonNull())
                && !jsonObj.get("DeviceName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `DeviceName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("DeviceName").toString()));
        }
        if ((jsonObj.get("VirtualDeviceName") != null
                        && !jsonObj.get("VirtualDeviceName").isJsonNull())
                && !jsonObj.get("VirtualDeviceName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `VirtualDeviceName` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("VirtualDeviceName").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!BlockDeviceMappingImage.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'BlockDeviceMappingImage' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BlockDeviceMappingImage> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(BlockDeviceMappingImage.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<BlockDeviceMappingImage>() {
                        @Override
                        public void write(JsonWriter out, BlockDeviceMappingImage value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public BlockDeviceMappingImage read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of BlockDeviceMappingImage given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of BlockDeviceMappingImage
     * @throws IOException if the JSON string is invalid with respect to BlockDeviceMappingImage
     */
    public static BlockDeviceMappingImage fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, BlockDeviceMappingImage.class);
    }

    /**
     * Convert an instance of BlockDeviceMappingImage to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

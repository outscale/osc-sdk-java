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


package com.outscale.osc_sdk_java.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.outscale.osc_sdk_java.client.model.BsuToCreate;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.outscale.osc_sdk_java.client.JSON;

/**
 * Information about the block device mapping.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class BlockDeviceMappingVmCreation {
  public static final String SERIALIZED_NAME_BSU = "Bsu";
  @SerializedName(SERIALIZED_NAME_BSU)
  private BsuToCreate bsu;

  public static final String SERIALIZED_NAME_DEVICE_NAME = "DeviceName";
  @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
  private String deviceName;

  public static final String SERIALIZED_NAME_NO_DEVICE = "NoDevice";
  @SerializedName(SERIALIZED_NAME_NO_DEVICE)
  private String noDevice;

  public static final String SERIALIZED_NAME_VIRTUAL_DEVICE_NAME = "VirtualDeviceName";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_DEVICE_NAME)
  private String virtualDeviceName;

  public BlockDeviceMappingVmCreation() {
  }

  public BlockDeviceMappingVmCreation bsu(BsuToCreate bsu) {
    
    this.bsu = bsu;
    return this;
  }

   /**
   * Get bsu
   * @return bsu
  **/
  @javax.annotation.Nullable

  public BsuToCreate getBsu() {
    return bsu;
  }


  public void setBsu(BsuToCreate bsu) {
    this.bsu = bsu;
  }


  public BlockDeviceMappingVmCreation deviceName(String deviceName) {
    
    this.deviceName = deviceName;
    return this;
  }

   /**
   * The device name for the volume. For a root device, you must use &#x60;/dev/sda1&#x60;. For other volumes, you must use &#x60;/dev/sdX&#x60;, &#x60;/dev/sdXX&#x60;, &#x60;/dev/xvdX&#x60;, or &#x60;/dev/xvdXX&#x60; (where the first &#x60;X&#x60; is a letter between &#x60;b&#x60; and &#x60;z&#x60;, and the second &#x60;X&#x60; is a letter between &#x60;a&#x60; and &#x60;z&#x60;).
   * @return deviceName
  **/
  @javax.annotation.Nullable

  public String getDeviceName() {
    return deviceName;
  }


  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }


  public BlockDeviceMappingVmCreation noDevice(String noDevice) {
    
    this.noDevice = noDevice;
    return this;
  }

   /**
   * Removes the device which is included in the block device mapping of the OMI.
   * @return noDevice
  **/
  @javax.annotation.Nullable

  public String getNoDevice() {
    return noDevice;
  }


  public void setNoDevice(String noDevice) {
    this.noDevice = noDevice;
  }


  public BlockDeviceMappingVmCreation virtualDeviceName(String virtualDeviceName) {
    
    this.virtualDeviceName = virtualDeviceName;
    return this;
  }

   /**
   * The name of the virtual device (&#x60;ephemeralN&#x60;).
   * @return virtualDeviceName
  **/
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
    BlockDeviceMappingVmCreation blockDeviceMappingVmCreation = (BlockDeviceMappingVmCreation) o;
    return Objects.equals(this.bsu, blockDeviceMappingVmCreation.bsu) &&
        Objects.equals(this.deviceName, blockDeviceMappingVmCreation.deviceName) &&
        Objects.equals(this.noDevice, blockDeviceMappingVmCreation.noDevice) &&
        Objects.equals(this.virtualDeviceName, blockDeviceMappingVmCreation.virtualDeviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bsu, deviceName, noDevice, virtualDeviceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockDeviceMappingVmCreation {\n");
    sb.append("    bsu: ").append(toIndentedString(bsu)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    noDevice: ").append(toIndentedString(noDevice)).append("\n");
    sb.append("    virtualDeviceName: ").append(toIndentedString(virtualDeviceName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
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
    openapiFields.add("NoDevice");
    openapiFields.add("VirtualDeviceName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BlockDeviceMappingVmCreation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BlockDeviceMappingVmCreation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlockDeviceMappingVmCreation is not found in the empty JSON string", BlockDeviceMappingVmCreation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BlockDeviceMappingVmCreation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BlockDeviceMappingVmCreation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `Bsu`
      if (jsonObj.get("Bsu") != null && !jsonObj.get("Bsu").isJsonNull()) {
        BsuToCreate.validateJsonObject(jsonObj.getAsJsonObject("Bsu"));
      }
      if ((jsonObj.get("DeviceName") != null && !jsonObj.get("DeviceName").isJsonNull()) && !jsonObj.get("DeviceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DeviceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DeviceName").toString()));
      }
      if ((jsonObj.get("NoDevice") != null && !jsonObj.get("NoDevice").isJsonNull()) && !jsonObj.get("NoDevice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NoDevice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NoDevice").toString()));
      }
      if ((jsonObj.get("VirtualDeviceName") != null && !jsonObj.get("VirtualDeviceName").isJsonNull()) && !jsonObj.get("VirtualDeviceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VirtualDeviceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VirtualDeviceName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlockDeviceMappingVmCreation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlockDeviceMappingVmCreation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlockDeviceMappingVmCreation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlockDeviceMappingVmCreation.class));

       return (TypeAdapter<T>) new TypeAdapter<BlockDeviceMappingVmCreation>() {
           @Override
           public void write(JsonWriter out, BlockDeviceMappingVmCreation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BlockDeviceMappingVmCreation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BlockDeviceMappingVmCreation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlockDeviceMappingVmCreation
  * @throws IOException if the JSON string is invalid with respect to BlockDeviceMappingVmCreation
  */
  public static BlockDeviceMappingVmCreation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlockDeviceMappingVmCreation.class);
  }

 /**
  * Convert an instance of BlockDeviceMappingVmCreation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


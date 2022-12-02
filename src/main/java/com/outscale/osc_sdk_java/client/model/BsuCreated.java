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
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * Information about the created BSU volume.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BsuCreated {
  public static final String SERIALIZED_NAME_DELETE_ON_VM_DELETION = "DeleteOnVmDeletion";
  @SerializedName(SERIALIZED_NAME_DELETE_ON_VM_DELETION)
  private Boolean deleteOnVmDeletion;

  public static final String SERIALIZED_NAME_LINK_DATE = "LinkDate";
  @SerializedName(SERIALIZED_NAME_LINK_DATE)
  private OffsetDateTime linkDate;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_VOLUME_ID = "VolumeId";
  @SerializedName(SERIALIZED_NAME_VOLUME_ID)
  private String volumeId;

  public BsuCreated() {
  }

  public BsuCreated deleteOnVmDeletion(Boolean deleteOnVmDeletion) {
    
    this.deleteOnVmDeletion = deleteOnVmDeletion;
    return this;
  }

   /**
   * If true, the volume is deleted when terminating the VM. If false, the volume is not deleted when terminating the VM.
   * @return deleteOnVmDeletion
  **/
  @javax.annotation.Nullable

  public Boolean getDeleteOnVmDeletion() {
    return deleteOnVmDeletion;
  }


  public void setDeleteOnVmDeletion(Boolean deleteOnVmDeletion) {
    this.deleteOnVmDeletion = deleteOnVmDeletion;
  }


  public BsuCreated linkDate(OffsetDateTime linkDate) {
    
    this.linkDate = linkDate;
    return this;
  }

   /**
   * The time and date of attachment of the volume to the VM.
   * @return linkDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLinkDate() {
    return linkDate;
  }


  public void setLinkDate(OffsetDateTime linkDate) {
    this.linkDate = linkDate;
  }


  public BsuCreated state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the volume.
   * @return state
  **/
  @javax.annotation.Nullable

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public BsuCreated volumeId(String volumeId) {
    
    this.volumeId = volumeId;
    return this;
  }

   /**
   * The ID of the volume.
   * @return volumeId
  **/
  @javax.annotation.Nullable

  public String getVolumeId() {
    return volumeId;
  }


  public void setVolumeId(String volumeId) {
    this.volumeId = volumeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BsuCreated bsuCreated = (BsuCreated) o;
    return Objects.equals(this.deleteOnVmDeletion, bsuCreated.deleteOnVmDeletion) &&
        Objects.equals(this.linkDate, bsuCreated.linkDate) &&
        Objects.equals(this.state, bsuCreated.state) &&
        Objects.equals(this.volumeId, bsuCreated.volumeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteOnVmDeletion, linkDate, state, volumeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BsuCreated {\n");
    sb.append("    deleteOnVmDeletion: ").append(toIndentedString(deleteOnVmDeletion)).append("\n");
    sb.append("    linkDate: ").append(toIndentedString(linkDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
    openapiFields.add("DeleteOnVmDeletion");
    openapiFields.add("LinkDate");
    openapiFields.add("State");
    openapiFields.add("VolumeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BsuCreated
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BsuCreated.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BsuCreated is not found in the empty JSON string", BsuCreated.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BsuCreated.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BsuCreated` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) && !jsonObj.get("State").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `State` to be a primitive type in the JSON string but got `%s`", jsonObj.get("State").toString()));
      }
      if ((jsonObj.get("VolumeId") != null && !jsonObj.get("VolumeId").isJsonNull()) && !jsonObj.get("VolumeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VolumeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VolumeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BsuCreated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BsuCreated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BsuCreated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BsuCreated.class));

       return (TypeAdapter<T>) new TypeAdapter<BsuCreated>() {
           @Override
           public void write(JsonWriter out, BsuCreated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BsuCreated read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BsuCreated given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BsuCreated
  * @throws IOException if the JSON string is invalid with respect to BsuCreated
  */
  public static BsuCreated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BsuCreated.class);
  }

 /**
  * Convert an instance of BsuCreated to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


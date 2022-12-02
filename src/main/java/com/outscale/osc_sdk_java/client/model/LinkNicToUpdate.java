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
 * Information about the NIC attachment. If you are modifying the &#x60;DeleteOnVmDeletion&#x60; attribute, you must specify the ID of the NIC attachment.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkNicToUpdate {
  public static final String SERIALIZED_NAME_DELETE_ON_VM_DELETION = "DeleteOnVmDeletion";
  @SerializedName(SERIALIZED_NAME_DELETE_ON_VM_DELETION)
  private Boolean deleteOnVmDeletion;

  public static final String SERIALIZED_NAME_LINK_NIC_ID = "LinkNicId";
  @SerializedName(SERIALIZED_NAME_LINK_NIC_ID)
  private String linkNicId;

  public LinkNicToUpdate() {
  }

  public LinkNicToUpdate deleteOnVmDeletion(Boolean deleteOnVmDeletion) {
    
    this.deleteOnVmDeletion = deleteOnVmDeletion;
    return this;
  }

   /**
   * If true, the NIC is deleted when the VM is terminated. If false, the NIC is detached from the VM.
   * @return deleteOnVmDeletion
  **/
  @javax.annotation.Nullable

  public Boolean getDeleteOnVmDeletion() {
    return deleteOnVmDeletion;
  }


  public void setDeleteOnVmDeletion(Boolean deleteOnVmDeletion) {
    this.deleteOnVmDeletion = deleteOnVmDeletion;
  }


  public LinkNicToUpdate linkNicId(String linkNicId) {
    
    this.linkNicId = linkNicId;
    return this;
  }

   /**
   * The ID of the NIC attachment.
   * @return linkNicId
  **/
  @javax.annotation.Nullable

  public String getLinkNicId() {
    return linkNicId;
  }


  public void setLinkNicId(String linkNicId) {
    this.linkNicId = linkNicId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkNicToUpdate linkNicToUpdate = (LinkNicToUpdate) o;
    return Objects.equals(this.deleteOnVmDeletion, linkNicToUpdate.deleteOnVmDeletion) &&
        Objects.equals(this.linkNicId, linkNicToUpdate.linkNicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteOnVmDeletion, linkNicId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkNicToUpdate {\n");
    sb.append("    deleteOnVmDeletion: ").append(toIndentedString(deleteOnVmDeletion)).append("\n");
    sb.append("    linkNicId: ").append(toIndentedString(linkNicId)).append("\n");
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
    openapiFields.add("LinkNicId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinkNicToUpdate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LinkNicToUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkNicToUpdate is not found in the empty JSON string", LinkNicToUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LinkNicToUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkNicToUpdate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("LinkNicId") != null && !jsonObj.get("LinkNicId").isJsonNull()) && !jsonObj.get("LinkNicId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LinkNicId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LinkNicId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkNicToUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkNicToUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkNicToUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkNicToUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkNicToUpdate>() {
           @Override
           public void write(JsonWriter out, LinkNicToUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkNicToUpdate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkNicToUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkNicToUpdate
  * @throws IOException if the JSON string is invalid with respect to LinkNicToUpdate
  */
  public static LinkNicToUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkNicToUpdate.class);
  }

 /**
  * Convert an instance of LinkNicToUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


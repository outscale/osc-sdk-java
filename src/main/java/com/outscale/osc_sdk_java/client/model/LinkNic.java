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
 * Information about the NIC attachment.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class LinkNic {
  public static final String SERIALIZED_NAME_DELETE_ON_VM_DELETION = "DeleteOnVmDeletion";
  @SerializedName(SERIALIZED_NAME_DELETE_ON_VM_DELETION)
  private Boolean deleteOnVmDeletion;

  public static final String SERIALIZED_NAME_DEVICE_NUMBER = "DeviceNumber";
  @SerializedName(SERIALIZED_NAME_DEVICE_NUMBER)
  private Integer deviceNumber;

  public static final String SERIALIZED_NAME_LINK_NIC_ID = "LinkNicId";
  @SerializedName(SERIALIZED_NAME_LINK_NIC_ID)
  private String linkNicId;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_VM_ACCOUNT_ID = "VmAccountId";
  @SerializedName(SERIALIZED_NAME_VM_ACCOUNT_ID)
  private String vmAccountId;

  public static final String SERIALIZED_NAME_VM_ID = "VmId";
  @SerializedName(SERIALIZED_NAME_VM_ID)
  private String vmId;

  public LinkNic() {
  }

  public LinkNic deleteOnVmDeletion(Boolean deleteOnVmDeletion) {
    
    this.deleteOnVmDeletion = deleteOnVmDeletion;
    return this;
  }

   /**
   * If true, the NIC is deleted when the VM is terminated.
   * @return deleteOnVmDeletion
  **/
  @javax.annotation.Nullable

  public Boolean getDeleteOnVmDeletion() {
    return deleteOnVmDeletion;
  }


  public void setDeleteOnVmDeletion(Boolean deleteOnVmDeletion) {
    this.deleteOnVmDeletion = deleteOnVmDeletion;
  }


  public LinkNic deviceNumber(Integer deviceNumber) {
    
    this.deviceNumber = deviceNumber;
    return this;
  }

   /**
   * The device index for the NIC attachment (between &#x60;1&#x60; and &#x60;7&#x60;, both included).
   * @return deviceNumber
  **/
  @javax.annotation.Nullable

  public Integer getDeviceNumber() {
    return deviceNumber;
  }


  public void setDeviceNumber(Integer deviceNumber) {
    this.deviceNumber = deviceNumber;
  }


  public LinkNic linkNicId(String linkNicId) {
    
    this.linkNicId = linkNicId;
    return this;
  }

   /**
   * The ID of the NIC to attach.
   * @return linkNicId
  **/
  @javax.annotation.Nullable

  public String getLinkNicId() {
    return linkNicId;
  }


  public void setLinkNicId(String linkNicId) {
    this.linkNicId = linkNicId;
  }


  public LinkNic state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the attachment (&#x60;attaching&#x60; \\| &#x60;attached&#x60; \\| &#x60;detaching&#x60; \\| &#x60;detached&#x60;).
   * @return state
  **/
  @javax.annotation.Nullable

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public LinkNic vmAccountId(String vmAccountId) {
    
    this.vmAccountId = vmAccountId;
    return this;
  }

   /**
   * The account ID of the owner of the VM.
   * @return vmAccountId
  **/
  @javax.annotation.Nullable

  public String getVmAccountId() {
    return vmAccountId;
  }


  public void setVmAccountId(String vmAccountId) {
    this.vmAccountId = vmAccountId;
  }


  public LinkNic vmId(String vmId) {
    
    this.vmId = vmId;
    return this;
  }

   /**
   * The ID of the VM.
   * @return vmId
  **/
  @javax.annotation.Nullable

  public String getVmId() {
    return vmId;
  }


  public void setVmId(String vmId) {
    this.vmId = vmId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkNic linkNic = (LinkNic) o;
    return Objects.equals(this.deleteOnVmDeletion, linkNic.deleteOnVmDeletion) &&
        Objects.equals(this.deviceNumber, linkNic.deviceNumber) &&
        Objects.equals(this.linkNicId, linkNic.linkNicId) &&
        Objects.equals(this.state, linkNic.state) &&
        Objects.equals(this.vmAccountId, linkNic.vmAccountId) &&
        Objects.equals(this.vmId, linkNic.vmId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleteOnVmDeletion, deviceNumber, linkNicId, state, vmAccountId, vmId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkNic {\n");
    sb.append("    deleteOnVmDeletion: ").append(toIndentedString(deleteOnVmDeletion)).append("\n");
    sb.append("    deviceNumber: ").append(toIndentedString(deviceNumber)).append("\n");
    sb.append("    linkNicId: ").append(toIndentedString(linkNicId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    vmAccountId: ").append(toIndentedString(vmAccountId)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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
    openapiFields.add("DeviceNumber");
    openapiFields.add("LinkNicId");
    openapiFields.add("State");
    openapiFields.add("VmAccountId");
    openapiFields.add("VmId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinkNic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LinkNic.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkNic is not found in the empty JSON string", LinkNic.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LinkNic.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkNic` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("LinkNicId") != null && !jsonObj.get("LinkNicId").isJsonNull()) && !jsonObj.get("LinkNicId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LinkNicId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LinkNicId").toString()));
      }
      if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) && !jsonObj.get("State").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `State` to be a primitive type in the JSON string but got `%s`", jsonObj.get("State").toString()));
      }
      if ((jsonObj.get("VmAccountId") != null && !jsonObj.get("VmAccountId").isJsonNull()) && !jsonObj.get("VmAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VmAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VmAccountId").toString()));
      }
      if ((jsonObj.get("VmId") != null && !jsonObj.get("VmId").isJsonNull()) && !jsonObj.get("VmId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VmId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VmId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkNic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkNic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkNic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkNic.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkNic>() {
           @Override
           public void write(JsonWriter out, LinkNic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkNic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkNic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkNic
  * @throws IOException if the JSON string is invalid with respect to LinkNic
  */
  public static LinkNic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkNic.class);
  }

 /**
  * Convert an instance of LinkNic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


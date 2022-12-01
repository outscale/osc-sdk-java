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
import java.util.ArrayList;
import java.util.List;

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
 * LinkPrivateIpsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class LinkPrivateIpsRequest {
  public static final String SERIALIZED_NAME_ALLOW_RELINK = "AllowRelink";
  @SerializedName(SERIALIZED_NAME_ALLOW_RELINK)
  private Boolean allowRelink;

  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_NIC_ID = "NicId";
  @SerializedName(SERIALIZED_NAME_NIC_ID)
  private String nicId;

  public static final String SERIALIZED_NAME_PRIVATE_IPS = "PrivateIps";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IPS)
  private List<String> privateIps = null;

  public static final String SERIALIZED_NAME_SECONDARY_PRIVATE_IP_COUNT = "SecondaryPrivateIpCount";
  @SerializedName(SERIALIZED_NAME_SECONDARY_PRIVATE_IP_COUNT)
  private Integer secondaryPrivateIpCount;

  public LinkPrivateIpsRequest() {
  }

  public LinkPrivateIpsRequest allowRelink(Boolean allowRelink) {
    
    this.allowRelink = allowRelink;
    return this;
  }

   /**
   * If true, allows an IP that is already assigned to another NIC in the same Subnet to be assigned to the NIC you specified.
   * @return allowRelink
  **/
  @javax.annotation.Nullable

  public Boolean getAllowRelink() {
    return allowRelink;
  }


  public void setAllowRelink(Boolean allowRelink) {
    this.allowRelink = allowRelink;
  }


  public LinkPrivateIpsRequest dryRun(Boolean dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

   /**
   * If true, checks whether you have the required permissions to perform the action.
   * @return dryRun
  **/
  @javax.annotation.Nullable

  public Boolean getDryRun() {
    return dryRun;
  }


  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }


  public LinkPrivateIpsRequest nicId(String nicId) {
    
    this.nicId = nicId;
    return this;
  }

   /**
   * The ID of the NIC.
   * @return nicId
  **/
  @javax.annotation.Nonnull

  public String getNicId() {
    return nicId;
  }


  public void setNicId(String nicId) {
    this.nicId = nicId;
  }


  public LinkPrivateIpsRequest privateIps(List<String> privateIps) {
    
    this.privateIps = privateIps;
    return this;
  }

  public LinkPrivateIpsRequest addPrivateIpsItem(String privateIpsItem) {
    if (this.privateIps == null) {
      this.privateIps = new ArrayList<>();
    }
    this.privateIps.add(privateIpsItem);
    return this;
  }

   /**
   * The secondary private IP or IPs you want to assign to the NIC within the IP range of the Subnet.
   * @return privateIps
  **/
  @javax.annotation.Nullable

  public List<String> getPrivateIps() {
    return privateIps;
  }


  public void setPrivateIps(List<String> privateIps) {
    this.privateIps = privateIps;
  }


  public LinkPrivateIpsRequest secondaryPrivateIpCount(Integer secondaryPrivateIpCount) {
    
    this.secondaryPrivateIpCount = secondaryPrivateIpCount;
    return this;
  }

   /**
   * The number of secondary private IPs to assign to the NIC.
   * @return secondaryPrivateIpCount
  **/
  @javax.annotation.Nullable

  public Integer getSecondaryPrivateIpCount() {
    return secondaryPrivateIpCount;
  }


  public void setSecondaryPrivateIpCount(Integer secondaryPrivateIpCount) {
    this.secondaryPrivateIpCount = secondaryPrivateIpCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkPrivateIpsRequest linkPrivateIpsRequest = (LinkPrivateIpsRequest) o;
    return Objects.equals(this.allowRelink, linkPrivateIpsRequest.allowRelink) &&
        Objects.equals(this.dryRun, linkPrivateIpsRequest.dryRun) &&
        Objects.equals(this.nicId, linkPrivateIpsRequest.nicId) &&
        Objects.equals(this.privateIps, linkPrivateIpsRequest.privateIps) &&
        Objects.equals(this.secondaryPrivateIpCount, linkPrivateIpsRequest.secondaryPrivateIpCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowRelink, dryRun, nicId, privateIps, secondaryPrivateIpCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkPrivateIpsRequest {\n");
    sb.append("    allowRelink: ").append(toIndentedString(allowRelink)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
    sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
    sb.append("    secondaryPrivateIpCount: ").append(toIndentedString(secondaryPrivateIpCount)).append("\n");
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
    openapiFields.add("AllowRelink");
    openapiFields.add("DryRun");
    openapiFields.add("NicId");
    openapiFields.add("PrivateIps");
    openapiFields.add("SecondaryPrivateIpCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("NicId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinkPrivateIpsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LinkPrivateIpsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkPrivateIpsRequest is not found in the empty JSON string", LinkPrivateIpsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LinkPrivateIpsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkPrivateIpsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LinkPrivateIpsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("NicId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NicId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NicId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("PrivateIps") != null && !jsonObj.get("PrivateIps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrivateIps` to be an array in the JSON string but got `%s`", jsonObj.get("PrivateIps").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkPrivateIpsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkPrivateIpsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkPrivateIpsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkPrivateIpsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkPrivateIpsRequest>() {
           @Override
           public void write(JsonWriter out, LinkPrivateIpsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkPrivateIpsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkPrivateIpsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkPrivateIpsRequest
  * @throws IOException if the JSON string is invalid with respect to LinkPrivateIpsRequest
  */
  public static LinkPrivateIpsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkPrivateIpsRequest.class);
  }

 /**
  * Convert an instance of LinkPrivateIpsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


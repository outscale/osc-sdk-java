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
import com.outscale.osc_sdk_java.client.model.LinkPublicIp;
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
 * Information about the private IP.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PrivateIp {
  public static final String SERIALIZED_NAME_IS_PRIMARY = "IsPrimary";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY)
  private Boolean isPrimary;

  public static final String SERIALIZED_NAME_LINK_PUBLIC_IP = "LinkPublicIp";
  @SerializedName(SERIALIZED_NAME_LINK_PUBLIC_IP)
  private LinkPublicIp linkPublicIp;

  public static final String SERIALIZED_NAME_PRIVATE_DNS_NAME = "PrivateDnsName";
  @SerializedName(SERIALIZED_NAME_PRIVATE_DNS_NAME)
  private String privateDnsName;

  public static final String SERIALIZED_NAME_PRIVATE_IP = "PrivateIp";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IP)
  private String privateIp;

  public PrivateIp() {
  }

  public PrivateIp isPrimary(Boolean isPrimary) {
    
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * If true, the IP is the primary private IP of the NIC.
   * @return isPrimary
  **/
  @javax.annotation.Nullable

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  public PrivateIp linkPublicIp(LinkPublicIp linkPublicIp) {
    
    this.linkPublicIp = linkPublicIp;
    return this;
  }

   /**
   * Get linkPublicIp
   * @return linkPublicIp
  **/
  @javax.annotation.Nullable

  public LinkPublicIp getLinkPublicIp() {
    return linkPublicIp;
  }


  public void setLinkPublicIp(LinkPublicIp linkPublicIp) {
    this.linkPublicIp = linkPublicIp;
  }


  public PrivateIp privateDnsName(String privateDnsName) {
    
    this.privateDnsName = privateDnsName;
    return this;
  }

   /**
   * The name of the private DNS.
   * @return privateDnsName
  **/
  @javax.annotation.Nullable

  public String getPrivateDnsName() {
    return privateDnsName;
  }


  public void setPrivateDnsName(String privateDnsName) {
    this.privateDnsName = privateDnsName;
  }


  public PrivateIp privateIp(String privateIp) {
    
    this.privateIp = privateIp;
    return this;
  }

   /**
   * The private IP of the NIC.
   * @return privateIp
  **/
  @javax.annotation.Nullable

  public String getPrivateIp() {
    return privateIp;
  }


  public void setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateIp privateIp = (PrivateIp) o;
    return Objects.equals(this.isPrimary, privateIp.isPrimary) &&
        Objects.equals(this.linkPublicIp, privateIp.linkPublicIp) &&
        Objects.equals(this.privateDnsName, privateIp.privateDnsName) &&
        Objects.equals(this.privateIp, privateIp.privateIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPrimary, linkPublicIp, privateDnsName, privateIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateIp {\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    linkPublicIp: ").append(toIndentedString(linkPublicIp)).append("\n");
    sb.append("    privateDnsName: ").append(toIndentedString(privateDnsName)).append("\n");
    sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
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
    openapiFields.add("IsPrimary");
    openapiFields.add("LinkPublicIp");
    openapiFields.add("PrivateDnsName");
    openapiFields.add("PrivateIp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PrivateIp
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PrivateIp.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PrivateIp is not found in the empty JSON string", PrivateIp.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PrivateIp.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PrivateIp` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `LinkPublicIp`
      if (jsonObj.get("LinkPublicIp") != null && !jsonObj.get("LinkPublicIp").isJsonNull()) {
        LinkPublicIp.validateJsonObject(jsonObj.getAsJsonObject("LinkPublicIp"));
      }
      if ((jsonObj.get("PrivateDnsName") != null && !jsonObj.get("PrivateDnsName").isJsonNull()) && !jsonObj.get("PrivateDnsName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrivateDnsName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrivateDnsName").toString()));
      }
      if ((jsonObj.get("PrivateIp") != null && !jsonObj.get("PrivateIp").isJsonNull()) && !jsonObj.get("PrivateIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrivateIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrivateIp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PrivateIp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PrivateIp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PrivateIp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PrivateIp.class));

       return (TypeAdapter<T>) new TypeAdapter<PrivateIp>() {
           @Override
           public void write(JsonWriter out, PrivateIp value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PrivateIp read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PrivateIp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PrivateIp
  * @throws IOException if the JSON string is invalid with respect to PrivateIp
  */
  public static PrivateIp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PrivateIp.class);
  }

 /**
  * Convert an instance of PrivateIp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


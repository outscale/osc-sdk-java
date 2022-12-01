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
 * Information about the security group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class SecurityGroupLight {
  public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "SecurityGroupId";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
  private String securityGroupId;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_NAME = "SecurityGroupName";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_NAME)
  private String securityGroupName;

  public SecurityGroupLight() {
  }

  public SecurityGroupLight securityGroupId(String securityGroupId) {
    
    this.securityGroupId = securityGroupId;
    return this;
  }

   /**
   * The ID of the security group.
   * @return securityGroupId
  **/
  @javax.annotation.Nullable

  public String getSecurityGroupId() {
    return securityGroupId;
  }


  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
  }


  public SecurityGroupLight securityGroupName(String securityGroupName) {
    
    this.securityGroupName = securityGroupName;
    return this;
  }

   /**
   * The name of the security group.
   * @return securityGroupName
  **/
  @javax.annotation.Nullable

  public String getSecurityGroupName() {
    return securityGroupName;
  }


  public void setSecurityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroupLight securityGroupLight = (SecurityGroupLight) o;
    return Objects.equals(this.securityGroupId, securityGroupLight.securityGroupId) &&
        Objects.equals(this.securityGroupName, securityGroupLight.securityGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityGroupId, securityGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupLight {\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
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
    openapiFields.add("SecurityGroupId");
    openapiFields.add("SecurityGroupName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SecurityGroupLight
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SecurityGroupLight.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecurityGroupLight is not found in the empty JSON string", SecurityGroupLight.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SecurityGroupLight.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SecurityGroupLight` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("SecurityGroupId") != null && !jsonObj.get("SecurityGroupId").isJsonNull()) && !jsonObj.get("SecurityGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecurityGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecurityGroupId").toString()));
      }
      if ((jsonObj.get("SecurityGroupName") != null && !jsonObj.get("SecurityGroupName").isJsonNull()) && !jsonObj.get("SecurityGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecurityGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecurityGroupName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityGroupLight.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityGroupLight' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityGroupLight> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityGroupLight.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityGroupLight>() {
           @Override
           public void write(JsonWriter out, SecurityGroupLight value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityGroupLight read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityGroupLight given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityGroupLight
  * @throws IOException if the JSON string is invalid with respect to SecurityGroupLight
  */
  public static SecurityGroupLight fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityGroupLight.class);
  }

 /**
  * Convert an instance of SecurityGroupLight to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


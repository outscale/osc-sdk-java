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
 * Information about the source security group of the load balancer, which you can use as part of your inbound rules for your registered VMs.&lt;br /&gt; To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SourceSecurityGroup {
  public static final String SERIALIZED_NAME_SECURITY_GROUP_ACCOUNT_ID = "SecurityGroupAccountId";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ACCOUNT_ID)
  private String securityGroupAccountId;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_NAME = "SecurityGroupName";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_NAME)
  private String securityGroupName;

  public SourceSecurityGroup() {
  }

  public SourceSecurityGroup securityGroupAccountId(String securityGroupAccountId) {
    
    this.securityGroupAccountId = securityGroupAccountId;
    return this;
  }

   /**
   * The account ID of the owner of the security group.
   * @return securityGroupAccountId
  **/
  @javax.annotation.Nullable

  public String getSecurityGroupAccountId() {
    return securityGroupAccountId;
  }


  public void setSecurityGroupAccountId(String securityGroupAccountId) {
    this.securityGroupAccountId = securityGroupAccountId;
  }


  public SourceSecurityGroup securityGroupName(String securityGroupName) {
    
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
    SourceSecurityGroup sourceSecurityGroup = (SourceSecurityGroup) o;
    return Objects.equals(this.securityGroupAccountId, sourceSecurityGroup.securityGroupAccountId) &&
        Objects.equals(this.securityGroupName, sourceSecurityGroup.securityGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityGroupAccountId, securityGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceSecurityGroup {\n");
    sb.append("    securityGroupAccountId: ").append(toIndentedString(securityGroupAccountId)).append("\n");
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
    openapiFields.add("SecurityGroupAccountId");
    openapiFields.add("SecurityGroupName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SourceSecurityGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SourceSecurityGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceSecurityGroup is not found in the empty JSON string", SourceSecurityGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SourceSecurityGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SourceSecurityGroup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("SecurityGroupAccountId") != null && !jsonObj.get("SecurityGroupAccountId").isJsonNull()) && !jsonObj.get("SecurityGroupAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecurityGroupAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecurityGroupAccountId").toString()));
      }
      if ((jsonObj.get("SecurityGroupName") != null && !jsonObj.get("SecurityGroupName").isJsonNull()) && !jsonObj.get("SecurityGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecurityGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecurityGroupName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceSecurityGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceSecurityGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceSecurityGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceSecurityGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceSecurityGroup>() {
           @Override
           public void write(JsonWriter out, SourceSecurityGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SourceSecurityGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SourceSecurityGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SourceSecurityGroup
  * @throws IOException if the JSON string is invalid with respect to SourceSecurityGroup
  */
  public static SourceSecurityGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceSecurityGroup.class);
  }

 /**
  * Convert an instance of SourceSecurityGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


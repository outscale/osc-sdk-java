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
 * CreateSecurityGroupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class CreateSecurityGroupRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_NET_ID = "NetId";
  @SerializedName(SERIALIZED_NAME_NET_ID)
  private String netId;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_NAME = "SecurityGroupName";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_NAME)
  private String securityGroupName;

  public CreateSecurityGroupRequest() {
  }

  public CreateSecurityGroupRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description for the security group, with a maximum length of 255 [ASCII printable characters](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
   * @return description
  **/
  @javax.annotation.Nonnull

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateSecurityGroupRequest dryRun(Boolean dryRun) {
    
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


  public CreateSecurityGroupRequest netId(String netId) {
    
    this.netId = netId;
    return this;
  }

   /**
   * The ID of the Net for the security group.
   * @return netId
  **/
  @javax.annotation.Nullable

  public String getNetId() {
    return netId;
  }


  public void setNetId(String netId) {
    this.netId = netId;
  }


  public CreateSecurityGroupRequest securityGroupName(String securityGroupName) {
    
    this.securityGroupName = securityGroupName;
    return this;
  }

   /**
   * The name of the security group.&lt;br /&gt; This name must not start with &#x60;sg-&#x60;.&lt;/br&gt; This name must be unique and contain between 1 and 255 ASCII characters. Accented letters are not allowed.
   * @return securityGroupName
  **/
  @javax.annotation.Nonnull

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
    CreateSecurityGroupRequest createSecurityGroupRequest = (CreateSecurityGroupRequest) o;
    return Objects.equals(this.description, createSecurityGroupRequest.description) &&
        Objects.equals(this.dryRun, createSecurityGroupRequest.dryRun) &&
        Objects.equals(this.netId, createSecurityGroupRequest.netId) &&
        Objects.equals(this.securityGroupName, createSecurityGroupRequest.securityGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dryRun, netId, securityGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSecurityGroupRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
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
    openapiFields.add("Description");
    openapiFields.add("DryRun");
    openapiFields.add("NetId");
    openapiFields.add("SecurityGroupName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Description");
    openapiRequiredFields.add("SecurityGroupName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSecurityGroupRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateSecurityGroupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSecurityGroupRequest is not found in the empty JSON string", CreateSecurityGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSecurityGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSecurityGroupRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSecurityGroupRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if ((jsonObj.get("NetId") != null && !jsonObj.get("NetId").isJsonNull()) && !jsonObj.get("NetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NetId").toString()));
      }
      if (!jsonObj.get("SecurityGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecurityGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecurityGroupName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSecurityGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSecurityGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSecurityGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSecurityGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSecurityGroupRequest>() {
           @Override
           public void write(JsonWriter out, CreateSecurityGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSecurityGroupRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSecurityGroupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSecurityGroupRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSecurityGroupRequest
  */
  public static CreateSecurityGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSecurityGroupRequest.class);
  }

 /**
  * Convert an instance of CreateSecurityGroupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * Information about the access key.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessKey {
  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "AccessKeyId";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  private String accessKeyId;

  public static final String SERIALIZED_NAME_CREATION_DATE = "CreationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "ExpirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public static final String SERIALIZED_NAME_LAST_MODIFICATION_DATE = "LastModificationDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFICATION_DATE)
  private OffsetDateTime lastModificationDate;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public AccessKey() {
  }

  public AccessKey accessKeyId(String accessKeyId) {
    
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * The ID of the access key.
   * @return accessKeyId
  **/
  @javax.annotation.Nullable

  public String getAccessKeyId() {
    return accessKeyId;
  }


  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public AccessKey creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date and time (UTC) of creation of the access key.
   * @return creationDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public AccessKey expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The date (UTC) at which the access key expires.
   * @return expirationDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }


  public AccessKey lastModificationDate(OffsetDateTime lastModificationDate) {
    
    this.lastModificationDate = lastModificationDate;
    return this;
  }

   /**
   * The date and time (UTC) of the last modification of the access key.
   * @return lastModificationDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getLastModificationDate() {
    return lastModificationDate;
  }


  public void setLastModificationDate(OffsetDateTime lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
  }


  public AccessKey state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the access key (&#x60;ACTIVE&#x60; if the key is valid for API calls, or &#x60;INACTIVE&#x60; if not).
   * @return state
  **/
  @javax.annotation.Nullable

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessKey accessKey = (AccessKey) o;
    return Objects.equals(this.accessKeyId, accessKey.accessKeyId) &&
        Objects.equals(this.creationDate, accessKey.creationDate) &&
        Objects.equals(this.expirationDate, accessKey.expirationDate) &&
        Objects.equals(this.lastModificationDate, accessKey.lastModificationDate) &&
        Objects.equals(this.state, accessKey.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, creationDate, expirationDate, lastModificationDate, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessKey {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("AccessKeyId");
    openapiFields.add("CreationDate");
    openapiFields.add("ExpirationDate");
    openapiFields.add("LastModificationDate");
    openapiFields.add("State");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccessKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccessKey.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessKey is not found in the empty JSON string", AccessKey.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccessKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessKey` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("AccessKeyId") != null && !jsonObj.get("AccessKeyId").isJsonNull()) && !jsonObj.get("AccessKeyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccessKeyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccessKeyId").toString()));
      }
      if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) && !jsonObj.get("State").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `State` to be a primitive type in the JSON string but got `%s`", jsonObj.get("State").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessKey.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessKey>() {
           @Override
           public void write(JsonWriter out, AccessKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessKey
  * @throws IOException if the JSON string is invalid with respect to AccessKey
  */
  public static AccessKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessKey.class);
  }

 /**
  * Convert an instance of AccessKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


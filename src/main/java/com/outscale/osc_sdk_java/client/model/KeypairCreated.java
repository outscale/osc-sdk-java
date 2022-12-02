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
 * Information about the created keypair.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeypairCreated {
  public static final String SERIALIZED_NAME_KEYPAIR_FINGERPRINT = "KeypairFingerprint";
  @SerializedName(SERIALIZED_NAME_KEYPAIR_FINGERPRINT)
  private String keypairFingerprint;

  public static final String SERIALIZED_NAME_KEYPAIR_NAME = "KeypairName";
  @SerializedName(SERIALIZED_NAME_KEYPAIR_NAME)
  private String keypairName;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "PrivateKey";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private String privateKey;

  public KeypairCreated() {
  }

  public KeypairCreated keypairFingerprint(String keypairFingerprint) {
    
    this.keypairFingerprint = keypairFingerprint;
    return this;
  }

   /**
   * The MD5 public key fingerprint as specified in section 4 of RFC 4716.
   * @return keypairFingerprint
  **/
  @javax.annotation.Nullable

  public String getKeypairFingerprint() {
    return keypairFingerprint;
  }


  public void setKeypairFingerprint(String keypairFingerprint) {
    this.keypairFingerprint = keypairFingerprint;
  }


  public KeypairCreated keypairName(String keypairName) {
    
    this.keypairName = keypairName;
    return this;
  }

   /**
   * The name of the keypair.
   * @return keypairName
  **/
  @javax.annotation.Nullable

  public String getKeypairName() {
    return keypairName;
  }


  public void setKeypairName(String keypairName) {
    this.keypairName = keypairName;
  }


  public KeypairCreated privateKey(String privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * The private key. When saving the private key in a .rsa file, replace the &#x60;\\n&#x60; escape sequences with line breaks.
   * @return privateKey
  **/
  @javax.annotation.Nullable

  public String getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeypairCreated keypairCreated = (KeypairCreated) o;
    return Objects.equals(this.keypairFingerprint, keypairCreated.keypairFingerprint) &&
        Objects.equals(this.keypairName, keypairCreated.keypairName) &&
        Objects.equals(this.privateKey, keypairCreated.privateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keypairFingerprint, keypairName, privateKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeypairCreated {\n");
    sb.append("    keypairFingerprint: ").append(toIndentedString(keypairFingerprint)).append("\n");
    sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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
    openapiFields.add("KeypairFingerprint");
    openapiFields.add("KeypairName");
    openapiFields.add("PrivateKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeypairCreated
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeypairCreated.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeypairCreated is not found in the empty JSON string", KeypairCreated.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeypairCreated.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeypairCreated` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("KeypairFingerprint") != null && !jsonObj.get("KeypairFingerprint").isJsonNull()) && !jsonObj.get("KeypairFingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeypairFingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeypairFingerprint").toString()));
      }
      if ((jsonObj.get("KeypairName") != null && !jsonObj.get("KeypairName").isJsonNull()) && !jsonObj.get("KeypairName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeypairName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeypairName").toString()));
      }
      if ((jsonObj.get("PrivateKey") != null && !jsonObj.get("PrivateKey").isJsonNull()) && !jsonObj.get("PrivateKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrivateKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrivateKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeypairCreated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeypairCreated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeypairCreated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeypairCreated.class));

       return (TypeAdapter<T>) new TypeAdapter<KeypairCreated>() {
           @Override
           public void write(JsonWriter out, KeypairCreated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeypairCreated read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeypairCreated given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeypairCreated
  * @throws IOException if the JSON string is invalid with respect to KeypairCreated
  */
  public static KeypairCreated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeypairCreated.class);
  }

 /**
  * Convert an instance of KeypairCreated to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


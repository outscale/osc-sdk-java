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
 * One or more filters.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiltersKeypair {
  public static final String SERIALIZED_NAME_KEYPAIR_FINGERPRINTS = "KeypairFingerprints";
  @SerializedName(SERIALIZED_NAME_KEYPAIR_FINGERPRINTS)
  private List<String> keypairFingerprints = null;

  public static final String SERIALIZED_NAME_KEYPAIR_NAMES = "KeypairNames";
  @SerializedName(SERIALIZED_NAME_KEYPAIR_NAMES)
  private List<String> keypairNames = null;

  public FiltersKeypair() {
  }

  public FiltersKeypair keypairFingerprints(List<String> keypairFingerprints) {
    
    this.keypairFingerprints = keypairFingerprints;
    return this;
  }

  public FiltersKeypair addKeypairFingerprintsItem(String keypairFingerprintsItem) {
    if (this.keypairFingerprints == null) {
      this.keypairFingerprints = new ArrayList<>();
    }
    this.keypairFingerprints.add(keypairFingerprintsItem);
    return this;
  }

   /**
   * The fingerprints of the keypairs.
   * @return keypairFingerprints
  **/
  @javax.annotation.Nullable

  public List<String> getKeypairFingerprints() {
    return keypairFingerprints;
  }


  public void setKeypairFingerprints(List<String> keypairFingerprints) {
    this.keypairFingerprints = keypairFingerprints;
  }


  public FiltersKeypair keypairNames(List<String> keypairNames) {
    
    this.keypairNames = keypairNames;
    return this;
  }

  public FiltersKeypair addKeypairNamesItem(String keypairNamesItem) {
    if (this.keypairNames == null) {
      this.keypairNames = new ArrayList<>();
    }
    this.keypairNames.add(keypairNamesItem);
    return this;
  }

   /**
   * The names of the keypairs.
   * @return keypairNames
  **/
  @javax.annotation.Nullable

  public List<String> getKeypairNames() {
    return keypairNames;
  }


  public void setKeypairNames(List<String> keypairNames) {
    this.keypairNames = keypairNames;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltersKeypair filtersKeypair = (FiltersKeypair) o;
    return Objects.equals(this.keypairFingerprints, filtersKeypair.keypairFingerprints) &&
        Objects.equals(this.keypairNames, filtersKeypair.keypairNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keypairFingerprints, keypairNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltersKeypair {\n");
    sb.append("    keypairFingerprints: ").append(toIndentedString(keypairFingerprints)).append("\n");
    sb.append("    keypairNames: ").append(toIndentedString(keypairNames)).append("\n");
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
    openapiFields.add("KeypairFingerprints");
    openapiFields.add("KeypairNames");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FiltersKeypair
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FiltersKeypair.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FiltersKeypair is not found in the empty JSON string", FiltersKeypair.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FiltersKeypair.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FiltersKeypair` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("KeypairFingerprints") != null && !jsonObj.get("KeypairFingerprints").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeypairFingerprints` to be an array in the JSON string but got `%s`", jsonObj.get("KeypairFingerprints").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("KeypairNames") != null && !jsonObj.get("KeypairNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeypairNames` to be an array in the JSON string but got `%s`", jsonObj.get("KeypairNames").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FiltersKeypair.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FiltersKeypair' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FiltersKeypair> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FiltersKeypair.class));

       return (TypeAdapter<T>) new TypeAdapter<FiltersKeypair>() {
           @Override
           public void write(JsonWriter out, FiltersKeypair value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FiltersKeypair read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FiltersKeypair given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FiltersKeypair
  * @throws IOException if the JSON string is invalid with respect to FiltersKeypair
  */
  public static FiltersKeypair fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FiltersKeypair.class);
  }

 /**
  * Convert an instance of FiltersKeypair to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


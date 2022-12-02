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
import com.outscale.osc_sdk_java.client.model.DirectLinkInterfaces;
import com.outscale.osc_sdk_java.client.model.ResponseContext;
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
 * ReadDirectLinkInterfacesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadDirectLinkInterfacesResponse {
  public static final String SERIALIZED_NAME_DIRECT_LINK_INTERFACES = "DirectLinkInterfaces";
  @SerializedName(SERIALIZED_NAME_DIRECT_LINK_INTERFACES)
  private List<DirectLinkInterfaces> directLinkInterfaces = null;

  public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
  private ResponseContext responseContext;

  public ReadDirectLinkInterfacesResponse() {
  }

  public ReadDirectLinkInterfacesResponse directLinkInterfaces(List<DirectLinkInterfaces> directLinkInterfaces) {
    
    this.directLinkInterfaces = directLinkInterfaces;
    return this;
  }

  public ReadDirectLinkInterfacesResponse addDirectLinkInterfacesItem(DirectLinkInterfaces directLinkInterfacesItem) {
    if (this.directLinkInterfaces == null) {
      this.directLinkInterfaces = new ArrayList<>();
    }
    this.directLinkInterfaces.add(directLinkInterfacesItem);
    return this;
  }

   /**
   * Information about one or more DirectLink interfaces.
   * @return directLinkInterfaces
  **/
  @javax.annotation.Nullable

  public List<DirectLinkInterfaces> getDirectLinkInterfaces() {
    return directLinkInterfaces;
  }


  public void setDirectLinkInterfaces(List<DirectLinkInterfaces> directLinkInterfaces) {
    this.directLinkInterfaces = directLinkInterfaces;
  }


  public ReadDirectLinkInterfacesResponse responseContext(ResponseContext responseContext) {
    
    this.responseContext = responseContext;
    return this;
  }

   /**
   * Get responseContext
   * @return responseContext
  **/
  @javax.annotation.Nullable

  public ResponseContext getResponseContext() {
    return responseContext;
  }


  public void setResponseContext(ResponseContext responseContext) {
    this.responseContext = responseContext;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadDirectLinkInterfacesResponse readDirectLinkInterfacesResponse = (ReadDirectLinkInterfacesResponse) o;
    return Objects.equals(this.directLinkInterfaces, readDirectLinkInterfacesResponse.directLinkInterfaces) &&
        Objects.equals(this.responseContext, readDirectLinkInterfacesResponse.responseContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directLinkInterfaces, responseContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadDirectLinkInterfacesResponse {\n");
    sb.append("    directLinkInterfaces: ").append(toIndentedString(directLinkInterfaces)).append("\n");
    sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
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
    openapiFields.add("DirectLinkInterfaces");
    openapiFields.add("ResponseContext");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReadDirectLinkInterfacesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReadDirectLinkInterfacesResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadDirectLinkInterfacesResponse is not found in the empty JSON string", ReadDirectLinkInterfacesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReadDirectLinkInterfacesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadDirectLinkInterfacesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("DirectLinkInterfaces") != null && !jsonObj.get("DirectLinkInterfaces").isJsonNull()) {
        JsonArray jsonArraydirectLinkInterfaces = jsonObj.getAsJsonArray("DirectLinkInterfaces");
        if (jsonArraydirectLinkInterfaces != null) {
          // ensure the json data is an array
          if (!jsonObj.get("DirectLinkInterfaces").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `DirectLinkInterfaces` to be an array in the JSON string but got `%s`", jsonObj.get("DirectLinkInterfaces").toString()));
          }

          // validate the optional field `DirectLinkInterfaces` (array)
          for (int i = 0; i < jsonArraydirectLinkInterfaces.size(); i++) {
            DirectLinkInterfaces.validateJsonObject(jsonArraydirectLinkInterfaces.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `ResponseContext`
      if (jsonObj.get("ResponseContext") != null && !jsonObj.get("ResponseContext").isJsonNull()) {
        ResponseContext.validateJsonObject(jsonObj.getAsJsonObject("ResponseContext"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadDirectLinkInterfacesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadDirectLinkInterfacesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadDirectLinkInterfacesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadDirectLinkInterfacesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadDirectLinkInterfacesResponse>() {
           @Override
           public void write(JsonWriter out, ReadDirectLinkInterfacesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadDirectLinkInterfacesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReadDirectLinkInterfacesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReadDirectLinkInterfacesResponse
  * @throws IOException if the JSON string is invalid with respect to ReadDirectLinkInterfacesResponse
  */
  public static ReadDirectLinkInterfacesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadDirectLinkInterfacesResponse.class);
  }

 /**
  * Convert an instance of ReadDirectLinkInterfacesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


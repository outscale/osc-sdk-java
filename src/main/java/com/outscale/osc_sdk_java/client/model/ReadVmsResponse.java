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
import com.outscale.osc_sdk_java.client.model.ResponseContext;
import com.outscale.osc_sdk_java.client.model.Vm;
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
 * ReadVmsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class ReadVmsResponse {
  public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
  private ResponseContext responseContext;

  public static final String SERIALIZED_NAME_VMS = "Vms";
  @SerializedName(SERIALIZED_NAME_VMS)
  private List<Vm> vms = null;

  public ReadVmsResponse() {
  }

  public ReadVmsResponse responseContext(ResponseContext responseContext) {
    
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


  public ReadVmsResponse vms(List<Vm> vms) {
    
    this.vms = vms;
    return this;
  }

  public ReadVmsResponse addVmsItem(Vm vmsItem) {
    if (this.vms == null) {
      this.vms = new ArrayList<>();
    }
    this.vms.add(vmsItem);
    return this;
  }

   /**
   * Information about one or more VMs.
   * @return vms
  **/
  @javax.annotation.Nullable

  public List<Vm> getVms() {
    return vms;
  }


  public void setVms(List<Vm> vms) {
    this.vms = vms;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadVmsResponse readVmsResponse = (ReadVmsResponse) o;
    return Objects.equals(this.responseContext, readVmsResponse.responseContext) &&
        Objects.equals(this.vms, readVmsResponse.vms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseContext, vms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadVmsResponse {\n");
    sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
    sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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
    openapiFields.add("ResponseContext");
    openapiFields.add("Vms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReadVmsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReadVmsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadVmsResponse is not found in the empty JSON string", ReadVmsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReadVmsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadVmsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `ResponseContext`
      if (jsonObj.get("ResponseContext") != null && !jsonObj.get("ResponseContext").isJsonNull()) {
        ResponseContext.validateJsonObject(jsonObj.getAsJsonObject("ResponseContext"));
      }
      if (jsonObj.get("Vms") != null && !jsonObj.get("Vms").isJsonNull()) {
        JsonArray jsonArrayvms = jsonObj.getAsJsonArray("Vms");
        if (jsonArrayvms != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Vms").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Vms` to be an array in the JSON string but got `%s`", jsonObj.get("Vms").toString()));
          }

          // validate the optional field `Vms` (array)
          for (int i = 0; i < jsonArrayvms.size(); i++) {
            Vm.validateJsonObject(jsonArrayvms.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadVmsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadVmsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadVmsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadVmsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadVmsResponse>() {
           @Override
           public void write(JsonWriter out, ReadVmsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadVmsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReadVmsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReadVmsResponse
  * @throws IOException if the JSON string is invalid with respect to ReadVmsResponse
  */
  public static ReadVmsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadVmsResponse.class);
  }

 /**
  * Convert an instance of ReadVmsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


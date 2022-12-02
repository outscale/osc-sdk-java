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
 * ReadVmsHealthRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReadVmsHealthRequest {
  public static final String SERIALIZED_NAME_BACKEND_VM_IDS = "BackendVmIds";
  @SerializedName(SERIALIZED_NAME_BACKEND_VM_IDS)
  private List<String> backendVmIds = null;

  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_NAME = "LoadBalancerName";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_NAME)
  private String loadBalancerName;

  public ReadVmsHealthRequest() {
  }

  public ReadVmsHealthRequest backendVmIds(List<String> backendVmIds) {
    
    this.backendVmIds = backendVmIds;
    return this;
  }

  public ReadVmsHealthRequest addBackendVmIdsItem(String backendVmIdsItem) {
    if (this.backendVmIds == null) {
      this.backendVmIds = new ArrayList<>();
    }
    this.backendVmIds.add(backendVmIdsItem);
    return this;
  }

   /**
   * One or more IDs of back-end VMs.
   * @return backendVmIds
  **/
  @javax.annotation.Nullable

  public List<String> getBackendVmIds() {
    return backendVmIds;
  }


  public void setBackendVmIds(List<String> backendVmIds) {
    this.backendVmIds = backendVmIds;
  }


  public ReadVmsHealthRequest dryRun(Boolean dryRun) {
    
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


  public ReadVmsHealthRequest loadBalancerName(String loadBalancerName) {
    
    this.loadBalancerName = loadBalancerName;
    return this;
  }

   /**
   * The name of the load balancer.
   * @return loadBalancerName
  **/
  @javax.annotation.Nonnull

  public String getLoadBalancerName() {
    return loadBalancerName;
  }


  public void setLoadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadVmsHealthRequest readVmsHealthRequest = (ReadVmsHealthRequest) o;
    return Objects.equals(this.backendVmIds, readVmsHealthRequest.backendVmIds) &&
        Objects.equals(this.dryRun, readVmsHealthRequest.dryRun) &&
        Objects.equals(this.loadBalancerName, readVmsHealthRequest.loadBalancerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendVmIds, dryRun, loadBalancerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadVmsHealthRequest {\n");
    sb.append("    backendVmIds: ").append(toIndentedString(backendVmIds)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
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
    openapiFields.add("BackendVmIds");
    openapiFields.add("DryRun");
    openapiFields.add("LoadBalancerName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("LoadBalancerName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReadVmsHealthRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReadVmsHealthRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadVmsHealthRequest is not found in the empty JSON string", ReadVmsHealthRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReadVmsHealthRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadVmsHealthRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReadVmsHealthRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("BackendVmIds") != null && !jsonObj.get("BackendVmIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BackendVmIds` to be an array in the JSON string but got `%s`", jsonObj.get("BackendVmIds").toString()));
      }
      if (!jsonObj.get("LoadBalancerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoadBalancerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoadBalancerName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadVmsHealthRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadVmsHealthRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadVmsHealthRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadVmsHealthRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadVmsHealthRequest>() {
           @Override
           public void write(JsonWriter out, ReadVmsHealthRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadVmsHealthRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReadVmsHealthRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReadVmsHealthRequest
  * @throws IOException if the JSON string is invalid with respect to ReadVmsHealthRequest
  */
  public static ReadVmsHealthRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadVmsHealthRequest.class);
  }

 /**
  * Convert an instance of ReadVmsHealthRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


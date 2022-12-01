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
import com.outscale.osc_sdk_java.client.model.VpnConnection;
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
 * ReadVpnConnectionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class ReadVpnConnectionsResponse {
  public static final String SERIALIZED_NAME_RESPONSE_CONTEXT = "ResponseContext";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CONTEXT)
  private ResponseContext responseContext;

  public static final String SERIALIZED_NAME_VPN_CONNECTIONS = "VpnConnections";
  @SerializedName(SERIALIZED_NAME_VPN_CONNECTIONS)
  private List<VpnConnection> vpnConnections = null;

  public ReadVpnConnectionsResponse() {
  }

  public ReadVpnConnectionsResponse responseContext(ResponseContext responseContext) {
    
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


  public ReadVpnConnectionsResponse vpnConnections(List<VpnConnection> vpnConnections) {
    
    this.vpnConnections = vpnConnections;
    return this;
  }

  public ReadVpnConnectionsResponse addVpnConnectionsItem(VpnConnection vpnConnectionsItem) {
    if (this.vpnConnections == null) {
      this.vpnConnections = new ArrayList<>();
    }
    this.vpnConnections.add(vpnConnectionsItem);
    return this;
  }

   /**
   * Information about one or more VPN connections.
   * @return vpnConnections
  **/
  @javax.annotation.Nullable

  public List<VpnConnection> getVpnConnections() {
    return vpnConnections;
  }


  public void setVpnConnections(List<VpnConnection> vpnConnections) {
    this.vpnConnections = vpnConnections;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadVpnConnectionsResponse readVpnConnectionsResponse = (ReadVpnConnectionsResponse) o;
    return Objects.equals(this.responseContext, readVpnConnectionsResponse.responseContext) &&
        Objects.equals(this.vpnConnections, readVpnConnectionsResponse.vpnConnections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseContext, vpnConnections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadVpnConnectionsResponse {\n");
    sb.append("    responseContext: ").append(toIndentedString(responseContext)).append("\n");
    sb.append("    vpnConnections: ").append(toIndentedString(vpnConnections)).append("\n");
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
    openapiFields.add("VpnConnections");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReadVpnConnectionsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReadVpnConnectionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadVpnConnectionsResponse is not found in the empty JSON string", ReadVpnConnectionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReadVpnConnectionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadVpnConnectionsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `ResponseContext`
      if (jsonObj.get("ResponseContext") != null && !jsonObj.get("ResponseContext").isJsonNull()) {
        ResponseContext.validateJsonObject(jsonObj.getAsJsonObject("ResponseContext"));
      }
      if (jsonObj.get("VpnConnections") != null && !jsonObj.get("VpnConnections").isJsonNull()) {
        JsonArray jsonArrayvpnConnections = jsonObj.getAsJsonArray("VpnConnections");
        if (jsonArrayvpnConnections != null) {
          // ensure the json data is an array
          if (!jsonObj.get("VpnConnections").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `VpnConnections` to be an array in the JSON string but got `%s`", jsonObj.get("VpnConnections").toString()));
          }

          // validate the optional field `VpnConnections` (array)
          for (int i = 0; i < jsonArrayvpnConnections.size(); i++) {
            VpnConnection.validateJsonObject(jsonArrayvpnConnections.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadVpnConnectionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadVpnConnectionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadVpnConnectionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadVpnConnectionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadVpnConnectionsResponse>() {
           @Override
           public void write(JsonWriter out, ReadVpnConnectionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadVpnConnectionsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReadVpnConnectionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReadVpnConnectionsResponse
  * @throws IOException if the JSON string is invalid with respect to ReadVpnConnectionsResponse
  */
  public static ReadVpnConnectionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadVpnConnectionsResponse.class);
  }

 /**
  * Convert an instance of ReadVpnConnectionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


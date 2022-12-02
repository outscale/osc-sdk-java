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
import com.outscale.osc_sdk_java.client.model.VpnOptions;
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
 * UpdateVpnConnectionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateVpnConnectionRequest {
  public static final String SERIALIZED_NAME_CLIENT_GATEWAY_ID = "ClientGatewayId";
  @SerializedName(SERIALIZED_NAME_CLIENT_GATEWAY_ID)
  private String clientGatewayId;

  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_VIRTUAL_GATEWAY_ID = "VirtualGatewayId";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_GATEWAY_ID)
  private String virtualGatewayId;

  public static final String SERIALIZED_NAME_VPN_CONNECTION_ID = "VpnConnectionId";
  @SerializedName(SERIALIZED_NAME_VPN_CONNECTION_ID)
  private String vpnConnectionId;

  public static final String SERIALIZED_NAME_VPN_OPTIONS = "VpnOptions";
  @SerializedName(SERIALIZED_NAME_VPN_OPTIONS)
  private VpnOptions vpnOptions;

  public UpdateVpnConnectionRequest() {
  }

  public UpdateVpnConnectionRequest clientGatewayId(String clientGatewayId) {
    
    this.clientGatewayId = clientGatewayId;
    return this;
  }

   /**
   * The ID of the client gateway.
   * @return clientGatewayId
  **/
  @javax.annotation.Nullable

  public String getClientGatewayId() {
    return clientGatewayId;
  }


  public void setClientGatewayId(String clientGatewayId) {
    this.clientGatewayId = clientGatewayId;
  }


  public UpdateVpnConnectionRequest dryRun(Boolean dryRun) {
    
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


  public UpdateVpnConnectionRequest virtualGatewayId(String virtualGatewayId) {
    
    this.virtualGatewayId = virtualGatewayId;
    return this;
  }

   /**
   * The ID of the virtual gateway.
   * @return virtualGatewayId
  **/
  @javax.annotation.Nullable

  public String getVirtualGatewayId() {
    return virtualGatewayId;
  }


  public void setVirtualGatewayId(String virtualGatewayId) {
    this.virtualGatewayId = virtualGatewayId;
  }


  public UpdateVpnConnectionRequest vpnConnectionId(String vpnConnectionId) {
    
    this.vpnConnectionId = vpnConnectionId;
    return this;
  }

   /**
   * The ID of the VPN connection you want to modify.
   * @return vpnConnectionId
  **/
  @javax.annotation.Nonnull

  public String getVpnConnectionId() {
    return vpnConnectionId;
  }


  public void setVpnConnectionId(String vpnConnectionId) {
    this.vpnConnectionId = vpnConnectionId;
  }


  public UpdateVpnConnectionRequest vpnOptions(VpnOptions vpnOptions) {
    
    this.vpnOptions = vpnOptions;
    return this;
  }

   /**
   * Get vpnOptions
   * @return vpnOptions
  **/
  @javax.annotation.Nullable

  public VpnOptions getVpnOptions() {
    return vpnOptions;
  }


  public void setVpnOptions(VpnOptions vpnOptions) {
    this.vpnOptions = vpnOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVpnConnectionRequest updateVpnConnectionRequest = (UpdateVpnConnectionRequest) o;
    return Objects.equals(this.clientGatewayId, updateVpnConnectionRequest.clientGatewayId) &&
        Objects.equals(this.dryRun, updateVpnConnectionRequest.dryRun) &&
        Objects.equals(this.virtualGatewayId, updateVpnConnectionRequest.virtualGatewayId) &&
        Objects.equals(this.vpnConnectionId, updateVpnConnectionRequest.vpnConnectionId) &&
        Objects.equals(this.vpnOptions, updateVpnConnectionRequest.vpnOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientGatewayId, dryRun, virtualGatewayId, vpnConnectionId, vpnOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVpnConnectionRequest {\n");
    sb.append("    clientGatewayId: ").append(toIndentedString(clientGatewayId)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    virtualGatewayId: ").append(toIndentedString(virtualGatewayId)).append("\n");
    sb.append("    vpnConnectionId: ").append(toIndentedString(vpnConnectionId)).append("\n");
    sb.append("    vpnOptions: ").append(toIndentedString(vpnOptions)).append("\n");
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
    openapiFields.add("ClientGatewayId");
    openapiFields.add("DryRun");
    openapiFields.add("VirtualGatewayId");
    openapiFields.add("VpnConnectionId");
    openapiFields.add("VpnOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("VpnConnectionId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateVpnConnectionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateVpnConnectionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateVpnConnectionRequest is not found in the empty JSON string", UpdateVpnConnectionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateVpnConnectionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateVpnConnectionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateVpnConnectionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ClientGatewayId") != null && !jsonObj.get("ClientGatewayId").isJsonNull()) && !jsonObj.get("ClientGatewayId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ClientGatewayId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ClientGatewayId").toString()));
      }
      if ((jsonObj.get("VirtualGatewayId") != null && !jsonObj.get("VirtualGatewayId").isJsonNull()) && !jsonObj.get("VirtualGatewayId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VirtualGatewayId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VirtualGatewayId").toString()));
      }
      if (!jsonObj.get("VpnConnectionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VpnConnectionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VpnConnectionId").toString()));
      }
      // validate the optional field `VpnOptions`
      if (jsonObj.get("VpnOptions") != null && !jsonObj.get("VpnOptions").isJsonNull()) {
        VpnOptions.validateJsonObject(jsonObj.getAsJsonObject("VpnOptions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateVpnConnectionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateVpnConnectionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateVpnConnectionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateVpnConnectionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateVpnConnectionRequest>() {
           @Override
           public void write(JsonWriter out, UpdateVpnConnectionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateVpnConnectionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateVpnConnectionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateVpnConnectionRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateVpnConnectionRequest
  */
  public static UpdateVpnConnectionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateVpnConnectionRequest.class);
  }

 /**
  * Convert an instance of UpdateVpnConnectionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


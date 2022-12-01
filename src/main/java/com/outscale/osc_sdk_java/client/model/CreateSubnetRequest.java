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
 * CreateSubnetRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class CreateSubnetRequest {
  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_IP_RANGE = "IpRange";
  @SerializedName(SERIALIZED_NAME_IP_RANGE)
  private String ipRange;

  public static final String SERIALIZED_NAME_NET_ID = "NetId";
  @SerializedName(SERIALIZED_NAME_NET_ID)
  private String netId;

  public static final String SERIALIZED_NAME_SUBREGION_NAME = "SubregionName";
  @SerializedName(SERIALIZED_NAME_SUBREGION_NAME)
  private String subregionName;

  public CreateSubnetRequest() {
  }

  public CreateSubnetRequest dryRun(Boolean dryRun) {
    
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


  public CreateSubnetRequest ipRange(String ipRange) {
    
    this.ipRange = ipRange;
    return this;
  }

   /**
   * The IP range in the Subnet, in CIDR notation (for example, &#x60;10.0.0.0/16&#x60;).&lt;br /&gt; The IP range of the Subnet can be either the same as the Net one if you create only a single Subnet in this Net, or a subset of the Net one. In case of several Subnets in a Net, their IP ranges must not overlap. The smallest Subnet you can create uses a /29 netmask (eight IPs). For more information, see [About VPCs](https://docs.outscale.com/en/userguide/About-VPCs.html).
   * @return ipRange
  **/
  @javax.annotation.Nonnull

  public String getIpRange() {
    return ipRange;
  }


  public void setIpRange(String ipRange) {
    this.ipRange = ipRange;
  }


  public CreateSubnetRequest netId(String netId) {
    
    this.netId = netId;
    return this;
  }

   /**
   * The ID of the Net for which you want to create a Subnet.
   * @return netId
  **/
  @javax.annotation.Nonnull

  public String getNetId() {
    return netId;
  }


  public void setNetId(String netId) {
    this.netId = netId;
  }


  public CreateSubnetRequest subregionName(String subregionName) {
    
    this.subregionName = subregionName;
    return this;
  }

   /**
   * The name of the Subregion in which you want to create the Subnet.
   * @return subregionName
  **/
  @javax.annotation.Nullable

  public String getSubregionName() {
    return subregionName;
  }


  public void setSubregionName(String subregionName) {
    this.subregionName = subregionName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubnetRequest createSubnetRequest = (CreateSubnetRequest) o;
    return Objects.equals(this.dryRun, createSubnetRequest.dryRun) &&
        Objects.equals(this.ipRange, createSubnetRequest.ipRange) &&
        Objects.equals(this.netId, createSubnetRequest.netId) &&
        Objects.equals(this.subregionName, createSubnetRequest.subregionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, ipRange, netId, subregionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubnetRequest {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
    sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
    sb.append("    subregionName: ").append(toIndentedString(subregionName)).append("\n");
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
    openapiFields.add("DryRun");
    openapiFields.add("IpRange");
    openapiFields.add("NetId");
    openapiFields.add("SubregionName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("IpRange");
    openapiRequiredFields.add("NetId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSubnetRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateSubnetRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSubnetRequest is not found in the empty JSON string", CreateSubnetRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSubnetRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSubnetRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSubnetRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("IpRange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IpRange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IpRange").toString()));
      }
      if (!jsonObj.get("NetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NetId").toString()));
      }
      if ((jsonObj.get("SubregionName") != null && !jsonObj.get("SubregionName").isJsonNull()) && !jsonObj.get("SubregionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubregionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SubregionName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubnetRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubnetRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubnetRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubnetRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubnetRequest>() {
           @Override
           public void write(JsonWriter out, CreateSubnetRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubnetRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubnetRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubnetRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSubnetRequest
  */
  public static CreateSubnetRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubnetRequest.class);
  }

 /**
  * Convert an instance of CreateSubnetRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


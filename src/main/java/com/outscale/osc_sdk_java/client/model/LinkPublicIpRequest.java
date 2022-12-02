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
 * LinkPublicIpRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LinkPublicIpRequest {
  public static final String SERIALIZED_NAME_ALLOW_RELINK = "AllowRelink";
  @SerializedName(SERIALIZED_NAME_ALLOW_RELINK)
  private Boolean allowRelink;

  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_NIC_ID = "NicId";
  @SerializedName(SERIALIZED_NAME_NIC_ID)
  private String nicId;

  public static final String SERIALIZED_NAME_PRIVATE_IP = "PrivateIp";
  @SerializedName(SERIALIZED_NAME_PRIVATE_IP)
  private String privateIp;

  public static final String SERIALIZED_NAME_PUBLIC_IP = "PublicIp";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
  private String publicIp;

  public static final String SERIALIZED_NAME_PUBLIC_IP_ID = "PublicIpId";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP_ID)
  private String publicIpId;

  public static final String SERIALIZED_NAME_VM_ID = "VmId";
  @SerializedName(SERIALIZED_NAME_VM_ID)
  private String vmId;

  public LinkPublicIpRequest() {
  }

  public LinkPublicIpRequest allowRelink(Boolean allowRelink) {
    
    this.allowRelink = allowRelink;
    return this;
  }

   /**
   * If true, allows the public IP to be associated with the VM or NIC that you specify even if it is already associated with another VM or NIC. If false, prevents the EIP from being associated with the VM or NIC that you specify if it is already associated with another VM or NIC. (By default, true in the public Cloud, false in a Net.)
   * @return allowRelink
  **/
  @javax.annotation.Nullable

  public Boolean getAllowRelink() {
    return allowRelink;
  }


  public void setAllowRelink(Boolean allowRelink) {
    this.allowRelink = allowRelink;
  }


  public LinkPublicIpRequest dryRun(Boolean dryRun) {
    
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


  public LinkPublicIpRequest nicId(String nicId) {
    
    this.nicId = nicId;
    return this;
  }

   /**
   * (Net only) The ID of the NIC. This parameter is required if the VM has more than one NIC attached. Otherwise, you need to specify the &#x60;VmId&#x60; parameter instead. You cannot specify both parameters at the same time.
   * @return nicId
  **/
  @javax.annotation.Nullable

  public String getNicId() {
    return nicId;
  }


  public void setNicId(String nicId) {
    this.nicId = nicId;
  }


  public LinkPublicIpRequest privateIp(String privateIp) {
    
    this.privateIp = privateIp;
    return this;
  }

   /**
   * (Net only) The primary or secondary private IP of the specified NIC. By default, the primary private IP.
   * @return privateIp
  **/
  @javax.annotation.Nullable

  public String getPrivateIp() {
    return privateIp;
  }


  public void setPrivateIp(String privateIp) {
    this.privateIp = privateIp;
  }


  public LinkPublicIpRequest publicIp(String publicIp) {
    
    this.publicIp = publicIp;
    return this;
  }

   /**
   * The public IP. This parameter is required unless you use the &#x60;PublicIpId&#x60; parameter.
   * @return publicIp
  **/
  @javax.annotation.Nullable

  public String getPublicIp() {
    return publicIp;
  }


  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  public LinkPublicIpRequest publicIpId(String publicIpId) {
    
    this.publicIpId = publicIpId;
    return this;
  }

   /**
   * The allocation ID of the public IP. This parameter is required unless you use the &#x60;PublicIp&#x60; parameter.
   * @return publicIpId
  **/
  @javax.annotation.Nullable

  public String getPublicIpId() {
    return publicIpId;
  }


  public void setPublicIpId(String publicIpId) {
    this.publicIpId = publicIpId;
  }


  public LinkPublicIpRequest vmId(String vmId) {
    
    this.vmId = vmId;
    return this;
  }

   /**
   * The ID of the VM.&lt;br /&gt; - In the public Cloud, this parameter is required.&lt;br /&gt; - In a Net, this parameter is required if the VM has only one NIC. Otherwise, you need to specify the &#x60;NicId&#x60; parameter instead. You cannot specify both parameters at the same time.
   * @return vmId
  **/
  @javax.annotation.Nullable

  public String getVmId() {
    return vmId;
  }


  public void setVmId(String vmId) {
    this.vmId = vmId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkPublicIpRequest linkPublicIpRequest = (LinkPublicIpRequest) o;
    return Objects.equals(this.allowRelink, linkPublicIpRequest.allowRelink) &&
        Objects.equals(this.dryRun, linkPublicIpRequest.dryRun) &&
        Objects.equals(this.nicId, linkPublicIpRequest.nicId) &&
        Objects.equals(this.privateIp, linkPublicIpRequest.privateIp) &&
        Objects.equals(this.publicIp, linkPublicIpRequest.publicIp) &&
        Objects.equals(this.publicIpId, linkPublicIpRequest.publicIpId) &&
        Objects.equals(this.vmId, linkPublicIpRequest.vmId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowRelink, dryRun, nicId, privateIp, publicIp, publicIpId, vmId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkPublicIpRequest {\n");
    sb.append("    allowRelink: ").append(toIndentedString(allowRelink)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
    sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    publicIpId: ").append(toIndentedString(publicIpId)).append("\n");
    sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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
    openapiFields.add("AllowRelink");
    openapiFields.add("DryRun");
    openapiFields.add("NicId");
    openapiFields.add("PrivateIp");
    openapiFields.add("PublicIp");
    openapiFields.add("PublicIpId");
    openapiFields.add("VmId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinkPublicIpRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LinkPublicIpRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkPublicIpRequest is not found in the empty JSON string", LinkPublicIpRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LinkPublicIpRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkPublicIpRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("NicId") != null && !jsonObj.get("NicId").isJsonNull()) && !jsonObj.get("NicId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NicId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NicId").toString()));
      }
      if ((jsonObj.get("PrivateIp") != null && !jsonObj.get("PrivateIp").isJsonNull()) && !jsonObj.get("PrivateIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrivateIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrivateIp").toString()));
      }
      if ((jsonObj.get("PublicIp") != null && !jsonObj.get("PublicIp").isJsonNull()) && !jsonObj.get("PublicIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PublicIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PublicIp").toString()));
      }
      if ((jsonObj.get("PublicIpId") != null && !jsonObj.get("PublicIpId").isJsonNull()) && !jsonObj.get("PublicIpId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PublicIpId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PublicIpId").toString()));
      }
      if ((jsonObj.get("VmId") != null && !jsonObj.get("VmId").isJsonNull()) && !jsonObj.get("VmId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VmId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VmId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkPublicIpRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkPublicIpRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkPublicIpRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkPublicIpRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkPublicIpRequest>() {
           @Override
           public void write(JsonWriter out, LinkPublicIpRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkPublicIpRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkPublicIpRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkPublicIpRequest
  * @throws IOException if the JSON string is invalid with respect to LinkPublicIpRequest
  */
  public static LinkPublicIpRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkPublicIpRequest.class);
  }

 /**
  * Convert an instance of LinkPublicIpRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


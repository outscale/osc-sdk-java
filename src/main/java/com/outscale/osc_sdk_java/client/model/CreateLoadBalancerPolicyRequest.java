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
 * CreateLoadBalancerPolicyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateLoadBalancerPolicyRequest {
  public static final String SERIALIZED_NAME_COOKIE_EXPIRATION_PERIOD = "CookieExpirationPeriod";
  @SerializedName(SERIALIZED_NAME_COOKIE_EXPIRATION_PERIOD)
  private Integer cookieExpirationPeriod;

  public static final String SERIALIZED_NAME_COOKIE_NAME = "CookieName";
  @SerializedName(SERIALIZED_NAME_COOKIE_NAME)
  private String cookieName;

  public static final String SERIALIZED_NAME_DRY_RUN = "DryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private Boolean dryRun;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_NAME = "LoadBalancerName";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_NAME)
  private String loadBalancerName;

  public static final String SERIALIZED_NAME_POLICY_NAME = "PolicyName";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "PolicyType";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private String policyType;

  public CreateLoadBalancerPolicyRequest() {
  }

  public CreateLoadBalancerPolicyRequest cookieExpirationPeriod(Integer cookieExpirationPeriod) {
    
    this.cookieExpirationPeriod = cookieExpirationPeriod;
    return this;
  }

   /**
   * The lifetime of the cookie, in seconds. If not specified, the default value of this parameter is &#x60;1&#x60;, which means that the sticky session lasts for the duration of the browser session.
   * @return cookieExpirationPeriod
  **/
  @javax.annotation.Nullable

  public Integer getCookieExpirationPeriod() {
    return cookieExpirationPeriod;
  }


  public void setCookieExpirationPeriod(Integer cookieExpirationPeriod) {
    this.cookieExpirationPeriod = cookieExpirationPeriod;
  }


  public CreateLoadBalancerPolicyRequest cookieName(String cookieName) {
    
    this.cookieName = cookieName;
    return this;
  }

   /**
   * The name of the application cookie used for stickiness. This parameter is required if you create a stickiness policy based on an application-generated cookie.
   * @return cookieName
  **/
  @javax.annotation.Nullable

  public String getCookieName() {
    return cookieName;
  }


  public void setCookieName(String cookieName) {
    this.cookieName = cookieName;
  }


  public CreateLoadBalancerPolicyRequest dryRun(Boolean dryRun) {
    
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


  public CreateLoadBalancerPolicyRequest loadBalancerName(String loadBalancerName) {
    
    this.loadBalancerName = loadBalancerName;
    return this;
  }

   /**
   * The name of the load balancer for which you want to create a policy.
   * @return loadBalancerName
  **/
  @javax.annotation.Nonnull

  public String getLoadBalancerName() {
    return loadBalancerName;
  }


  public void setLoadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
  }


  public CreateLoadBalancerPolicyRequest policyName(String policyName) {
    
    this.policyName = policyName;
    return this;
  }

   /**
   * The name of the policy. This name must be unique and consist of alphanumeric characters and dashes (-).
   * @return policyName
  **/
  @javax.annotation.Nonnull

  public String getPolicyName() {
    return policyName;
  }


  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  public CreateLoadBalancerPolicyRequest policyType(String policyType) {
    
    this.policyType = policyType;
    return this;
  }

   /**
   * The type of stickiness policy you want to create: &#x60;app&#x60; or &#x60;load_balancer&#x60;.
   * @return policyType
  **/
  @javax.annotation.Nonnull

  public String getPolicyType() {
    return policyType;
  }


  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLoadBalancerPolicyRequest createLoadBalancerPolicyRequest = (CreateLoadBalancerPolicyRequest) o;
    return Objects.equals(this.cookieExpirationPeriod, createLoadBalancerPolicyRequest.cookieExpirationPeriod) &&
        Objects.equals(this.cookieName, createLoadBalancerPolicyRequest.cookieName) &&
        Objects.equals(this.dryRun, createLoadBalancerPolicyRequest.dryRun) &&
        Objects.equals(this.loadBalancerName, createLoadBalancerPolicyRequest.loadBalancerName) &&
        Objects.equals(this.policyName, createLoadBalancerPolicyRequest.policyName) &&
        Objects.equals(this.policyType, createLoadBalancerPolicyRequest.policyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookieExpirationPeriod, cookieName, dryRun, loadBalancerName, policyName, policyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLoadBalancerPolicyRequest {\n");
    sb.append("    cookieExpirationPeriod: ").append(toIndentedString(cookieExpirationPeriod)).append("\n");
    sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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
    openapiFields.add("CookieExpirationPeriod");
    openapiFields.add("CookieName");
    openapiFields.add("DryRun");
    openapiFields.add("LoadBalancerName");
    openapiFields.add("PolicyName");
    openapiFields.add("PolicyType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("LoadBalancerName");
    openapiRequiredFields.add("PolicyName");
    openapiRequiredFields.add("PolicyType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateLoadBalancerPolicyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateLoadBalancerPolicyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateLoadBalancerPolicyRequest is not found in the empty JSON string", CreateLoadBalancerPolicyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateLoadBalancerPolicyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateLoadBalancerPolicyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateLoadBalancerPolicyRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("CookieName") != null && !jsonObj.get("CookieName").isJsonNull()) && !jsonObj.get("CookieName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CookieName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CookieName").toString()));
      }
      if (!jsonObj.get("LoadBalancerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoadBalancerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoadBalancerName").toString()));
      }
      if (!jsonObj.get("PolicyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PolicyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PolicyName").toString()));
      }
      if (!jsonObj.get("PolicyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PolicyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PolicyType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateLoadBalancerPolicyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateLoadBalancerPolicyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateLoadBalancerPolicyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateLoadBalancerPolicyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateLoadBalancerPolicyRequest>() {
           @Override
           public void write(JsonWriter out, CreateLoadBalancerPolicyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateLoadBalancerPolicyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateLoadBalancerPolicyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateLoadBalancerPolicyRequest
  * @throws IOException if the JSON string is invalid with respect to CreateLoadBalancerPolicyRequest
  */
  public static CreateLoadBalancerPolicyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateLoadBalancerPolicyRequest.class);
  }

 /**
  * Convert an instance of CreateLoadBalancerPolicyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


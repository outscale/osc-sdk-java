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
 * Information about the listener rule.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ListenerRuleForCreation {
  public static final String SERIALIZED_NAME_ACTION = "Action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_HOST_NAME_PATTERN = "HostNamePattern";
  @SerializedName(SERIALIZED_NAME_HOST_NAME_PATTERN)
  private String hostNamePattern;

  public static final String SERIALIZED_NAME_LISTENER_RULE_NAME = "ListenerRuleName";
  @SerializedName(SERIALIZED_NAME_LISTENER_RULE_NAME)
  private String listenerRuleName;

  public static final String SERIALIZED_NAME_PATH_PATTERN = "PathPattern";
  @SerializedName(SERIALIZED_NAME_PATH_PATTERN)
  private String pathPattern;

  public static final String SERIALIZED_NAME_PRIORITY = "Priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public ListenerRuleForCreation() {
  }

  public ListenerRuleForCreation action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * The type of action for the rule (always &#x60;forward&#x60;).
   * @return action
  **/
  @javax.annotation.Nullable

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public ListenerRuleForCreation hostNamePattern(String hostNamePattern) {
    
    this.hostNamePattern = hostNamePattern;
    return this;
  }

   /**
   * A host-name pattern for the rule, with a maximum length of 128 characters. This host-name pattern supports maximum three wildcards, and must not contain any special characters except [-.?]. 
   * @return hostNamePattern
  **/
  @javax.annotation.Nullable

  public String getHostNamePattern() {
    return hostNamePattern;
  }


  public void setHostNamePattern(String hostNamePattern) {
    this.hostNamePattern = hostNamePattern;
  }


  public ListenerRuleForCreation listenerRuleName(String listenerRuleName) {
    
    this.listenerRuleName = listenerRuleName;
    return this;
  }

   /**
   * A human-readable name for the listener rule.
   * @return listenerRuleName
  **/
  @javax.annotation.Nonnull

  public String getListenerRuleName() {
    return listenerRuleName;
  }


  public void setListenerRuleName(String listenerRuleName) {
    this.listenerRuleName = listenerRuleName;
  }


  public ListenerRuleForCreation pathPattern(String pathPattern) {
    
    this.pathPattern = pathPattern;
    return this;
  }

   /**
   * A path pattern for the rule, with a maximum length of 128 characters. This path pattern supports maximum three wildcards, and must not contain any special characters except [_-.$/~&amp;quot;&#39;@:+?].
   * @return pathPattern
  **/
  @javax.annotation.Nullable

  public String getPathPattern() {
    return pathPattern;
  }


  public void setPathPattern(String pathPattern) {
    this.pathPattern = pathPattern;
  }


  public ListenerRuleForCreation priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * The priority level of the listener rule, between &#x60;1&#x60; and &#x60;19999&#x60; both included. Each rule must have a unique priority level. Otherwise, an error is returned.
   * @return priority
  **/
  @javax.annotation.Nonnull

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListenerRuleForCreation listenerRuleForCreation = (ListenerRuleForCreation) o;
    return Objects.equals(this.action, listenerRuleForCreation.action) &&
        Objects.equals(this.hostNamePattern, listenerRuleForCreation.hostNamePattern) &&
        Objects.equals(this.listenerRuleName, listenerRuleForCreation.listenerRuleName) &&
        Objects.equals(this.pathPattern, listenerRuleForCreation.pathPattern) &&
        Objects.equals(this.priority, listenerRuleForCreation.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, hostNamePattern, listenerRuleName, pathPattern, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListenerRuleForCreation {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    hostNamePattern: ").append(toIndentedString(hostNamePattern)).append("\n");
    sb.append("    listenerRuleName: ").append(toIndentedString(listenerRuleName)).append("\n");
    sb.append("    pathPattern: ").append(toIndentedString(pathPattern)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
    openapiFields.add("Action");
    openapiFields.add("HostNamePattern");
    openapiFields.add("ListenerRuleName");
    openapiFields.add("PathPattern");
    openapiFields.add("Priority");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ListenerRuleName");
    openapiRequiredFields.add("Priority");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListenerRuleForCreation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListenerRuleForCreation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListenerRuleForCreation is not found in the empty JSON string", ListenerRuleForCreation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListenerRuleForCreation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListenerRuleForCreation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListenerRuleForCreation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Action") != null && !jsonObj.get("Action").isJsonNull()) && !jsonObj.get("Action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Action").toString()));
      }
      if ((jsonObj.get("HostNamePattern") != null && !jsonObj.get("HostNamePattern").isJsonNull()) && !jsonObj.get("HostNamePattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `HostNamePattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("HostNamePattern").toString()));
      }
      if (!jsonObj.get("ListenerRuleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ListenerRuleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ListenerRuleName").toString()));
      }
      if ((jsonObj.get("PathPattern") != null && !jsonObj.get("PathPattern").isJsonNull()) && !jsonObj.get("PathPattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PathPattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PathPattern").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListenerRuleForCreation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListenerRuleForCreation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListenerRuleForCreation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListenerRuleForCreation.class));

       return (TypeAdapter<T>) new TypeAdapter<ListenerRuleForCreation>() {
           @Override
           public void write(JsonWriter out, ListenerRuleForCreation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListenerRuleForCreation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListenerRuleForCreation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListenerRuleForCreation
  * @throws IOException if the JSON string is invalid with respect to ListenerRuleForCreation
  */
  public static ListenerRuleForCreation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListenerRuleForCreation.class);
  }

 /**
  * Convert an instance of ListenerRuleForCreation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


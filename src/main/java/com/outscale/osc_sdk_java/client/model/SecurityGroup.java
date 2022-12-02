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
import com.outscale.osc_sdk_java.client.model.ResourceTag;
import com.outscale.osc_sdk_java.client.model.SecurityGroupRule;
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
 * Information about the security group.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityGroup {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INBOUND_RULES = "InboundRules";
  @SerializedName(SERIALIZED_NAME_INBOUND_RULES)
  private List<SecurityGroupRule> inboundRules = null;

  public static final String SERIALIZED_NAME_NET_ID = "NetId";
  @SerializedName(SERIALIZED_NAME_NET_ID)
  private String netId;

  public static final String SERIALIZED_NAME_OUTBOUND_RULES = "OutboundRules";
  @SerializedName(SERIALIZED_NAME_OUTBOUND_RULES)
  private List<SecurityGroupRule> outboundRules = null;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_ID = "SecurityGroupId";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_ID)
  private String securityGroupId;

  public static final String SERIALIZED_NAME_SECURITY_GROUP_NAME = "SecurityGroupName";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUP_NAME)
  private String securityGroupName;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<ResourceTag> tags = null;

  public SecurityGroup() {
  }

  public SecurityGroup accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of a user that has been granted permission.
   * @return accountId
  **/
  @javax.annotation.Nullable

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public SecurityGroup description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the security group.
   * @return description
  **/
  @javax.annotation.Nullable

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SecurityGroup inboundRules(List<SecurityGroupRule> inboundRules) {
    
    this.inboundRules = inboundRules;
    return this;
  }

  public SecurityGroup addInboundRulesItem(SecurityGroupRule inboundRulesItem) {
    if (this.inboundRules == null) {
      this.inboundRules = new ArrayList<>();
    }
    this.inboundRules.add(inboundRulesItem);
    return this;
  }

   /**
   * The inbound rules associated with the security group.
   * @return inboundRules
  **/
  @javax.annotation.Nullable

  public List<SecurityGroupRule> getInboundRules() {
    return inboundRules;
  }


  public void setInboundRules(List<SecurityGroupRule> inboundRules) {
    this.inboundRules = inboundRules;
  }


  public SecurityGroup netId(String netId) {
    
    this.netId = netId;
    return this;
  }

   /**
   * The ID of the Net for the security group.
   * @return netId
  **/
  @javax.annotation.Nullable

  public String getNetId() {
    return netId;
  }


  public void setNetId(String netId) {
    this.netId = netId;
  }


  public SecurityGroup outboundRules(List<SecurityGroupRule> outboundRules) {
    
    this.outboundRules = outboundRules;
    return this;
  }

  public SecurityGroup addOutboundRulesItem(SecurityGroupRule outboundRulesItem) {
    if (this.outboundRules == null) {
      this.outboundRules = new ArrayList<>();
    }
    this.outboundRules.add(outboundRulesItem);
    return this;
  }

   /**
   * The outbound rules associated with the security group.
   * @return outboundRules
  **/
  @javax.annotation.Nullable

  public List<SecurityGroupRule> getOutboundRules() {
    return outboundRules;
  }


  public void setOutboundRules(List<SecurityGroupRule> outboundRules) {
    this.outboundRules = outboundRules;
  }


  public SecurityGroup securityGroupId(String securityGroupId) {
    
    this.securityGroupId = securityGroupId;
    return this;
  }

   /**
   * The ID of the security group.
   * @return securityGroupId
  **/
  @javax.annotation.Nullable

  public String getSecurityGroupId() {
    return securityGroupId;
  }


  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
  }


  public SecurityGroup securityGroupName(String securityGroupName) {
    
    this.securityGroupName = securityGroupName;
    return this;
  }

   /**
   * The name of the security group.
   * @return securityGroupName
  **/
  @javax.annotation.Nullable

  public String getSecurityGroupName() {
    return securityGroupName;
  }


  public void setSecurityGroupName(String securityGroupName) {
    this.securityGroupName = securityGroupName;
  }


  public SecurityGroup tags(List<ResourceTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public SecurityGroup addTagsItem(ResourceTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * One or more tags associated with the security group.
   * @return tags
  **/
  @javax.annotation.Nullable

  public List<ResourceTag> getTags() {
    return tags;
  }


  public void setTags(List<ResourceTag> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityGroup securityGroup = (SecurityGroup) o;
    return Objects.equals(this.accountId, securityGroup.accountId) &&
        Objects.equals(this.description, securityGroup.description) &&
        Objects.equals(this.inboundRules, securityGroup.inboundRules) &&
        Objects.equals(this.netId, securityGroup.netId) &&
        Objects.equals(this.outboundRules, securityGroup.outboundRules) &&
        Objects.equals(this.securityGroupId, securityGroup.securityGroupId) &&
        Objects.equals(this.securityGroupName, securityGroup.securityGroupName) &&
        Objects.equals(this.tags, securityGroup.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, description, inboundRules, netId, outboundRules, securityGroupId, securityGroupName, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroup {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inboundRules: ").append(toIndentedString(inboundRules)).append("\n");
    sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
    sb.append("    outboundRules: ").append(toIndentedString(outboundRules)).append("\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    securityGroupName: ").append(toIndentedString(securityGroupName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("AccountId");
    openapiFields.add("Description");
    openapiFields.add("InboundRules");
    openapiFields.add("NetId");
    openapiFields.add("OutboundRules");
    openapiFields.add("SecurityGroupId");
    openapiFields.add("SecurityGroupName");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SecurityGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SecurityGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecurityGroup is not found in the empty JSON string", SecurityGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SecurityGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SecurityGroup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("AccountId") != null && !jsonObj.get("AccountId").isJsonNull()) && !jsonObj.get("AccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountId").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if (jsonObj.get("InboundRules") != null && !jsonObj.get("InboundRules").isJsonNull()) {
        JsonArray jsonArrayinboundRules = jsonObj.getAsJsonArray("InboundRules");
        if (jsonArrayinboundRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("InboundRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `InboundRules` to be an array in the JSON string but got `%s`", jsonObj.get("InboundRules").toString()));
          }

          // validate the optional field `InboundRules` (array)
          for (int i = 0; i < jsonArrayinboundRules.size(); i++) {
            SecurityGroupRule.validateJsonObject(jsonArrayinboundRules.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("NetId") != null && !jsonObj.get("NetId").isJsonNull()) && !jsonObj.get("NetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NetId").toString()));
      }
      if (jsonObj.get("OutboundRules") != null && !jsonObj.get("OutboundRules").isJsonNull()) {
        JsonArray jsonArrayoutboundRules = jsonObj.getAsJsonArray("OutboundRules");
        if (jsonArrayoutboundRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("OutboundRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `OutboundRules` to be an array in the JSON string but got `%s`", jsonObj.get("OutboundRules").toString()));
          }

          // validate the optional field `OutboundRules` (array)
          for (int i = 0; i < jsonArrayoutboundRules.size(); i++) {
            SecurityGroupRule.validateJsonObject(jsonArrayoutboundRules.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("SecurityGroupId") != null && !jsonObj.get("SecurityGroupId").isJsonNull()) && !jsonObj.get("SecurityGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecurityGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecurityGroupId").toString()));
      }
      if ((jsonObj.get("SecurityGroupName") != null && !jsonObj.get("SecurityGroupName").isJsonNull()) && !jsonObj.get("SecurityGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecurityGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecurityGroupName").toString()));
      }
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonNull()) {
        JsonArray jsonArraytags = jsonObj.getAsJsonArray("Tags");
        if (jsonArraytags != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Tags").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Tags` to be an array in the JSON string but got `%s`", jsonObj.get("Tags").toString()));
          }

          // validate the optional field `Tags` (array)
          for (int i = 0; i < jsonArraytags.size(); i++) {
            ResourceTag.validateJsonObject(jsonArraytags.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityGroup>() {
           @Override
           public void write(JsonWriter out, SecurityGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityGroup
  * @throws IOException if the JSON string is invalid with respect to SecurityGroup
  */
  public static SecurityGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityGroup.class);
  }

 /**
  * Convert an instance of SecurityGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


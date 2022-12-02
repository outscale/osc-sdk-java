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
 * One or more filters.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiltersVm {
  public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";
  @SerializedName(SERIALIZED_NAME_TAG_KEYS)
  private List<String> tagKeys = null;

  public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";
  @SerializedName(SERIALIZED_NAME_TAG_VALUES)
  private List<String> tagValues = null;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_VM_IDS = "VmIds";
  @SerializedName(SERIALIZED_NAME_VM_IDS)
  private List<String> vmIds = null;

  public FiltersVm() {
  }

  public FiltersVm tagKeys(List<String> tagKeys) {
    
    this.tagKeys = tagKeys;
    return this;
  }

  public FiltersVm addTagKeysItem(String tagKeysItem) {
    if (this.tagKeys == null) {
      this.tagKeys = new ArrayList<>();
    }
    this.tagKeys.add(tagKeysItem);
    return this;
  }

   /**
   * The keys of the tags associated with the VMs.
   * @return tagKeys
  **/
  @javax.annotation.Nullable

  public List<String> getTagKeys() {
    return tagKeys;
  }


  public void setTagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
  }


  public FiltersVm tagValues(List<String> tagValues) {
    
    this.tagValues = tagValues;
    return this;
  }

  public FiltersVm addTagValuesItem(String tagValuesItem) {
    if (this.tagValues == null) {
      this.tagValues = new ArrayList<>();
    }
    this.tagValues.add(tagValuesItem);
    return this;
  }

   /**
   * The values of the tags associated with the VMs.
   * @return tagValues
  **/
  @javax.annotation.Nullable

  public List<String> getTagValues() {
    return tagValues;
  }


  public void setTagValues(List<String> tagValues) {
    this.tagValues = tagValues;
  }


  public FiltersVm tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public FiltersVm addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The key/value combination of the tags associated with the VMs, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}.
   * @return tags
  **/
  @javax.annotation.Nullable

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public FiltersVm vmIds(List<String> vmIds) {
    
    this.vmIds = vmIds;
    return this;
  }

  public FiltersVm addVmIdsItem(String vmIdsItem) {
    if (this.vmIds == null) {
      this.vmIds = new ArrayList<>();
    }
    this.vmIds.add(vmIdsItem);
    return this;
  }

   /**
   * One or more IDs of VMs.
   * @return vmIds
  **/
  @javax.annotation.Nullable

  public List<String> getVmIds() {
    return vmIds;
  }


  public void setVmIds(List<String> vmIds) {
    this.vmIds = vmIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltersVm filtersVm = (FiltersVm) o;
    return Objects.equals(this.tagKeys, filtersVm.tagKeys) &&
        Objects.equals(this.tagValues, filtersVm.tagValues) &&
        Objects.equals(this.tags, filtersVm.tags) &&
        Objects.equals(this.vmIds, filtersVm.vmIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagKeys, tagValues, tags, vmIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltersVm {\n");
    sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
    sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
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
    openapiFields.add("TagKeys");
    openapiFields.add("TagValues");
    openapiFields.add("Tags");
    openapiFields.add("VmIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FiltersVm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FiltersVm.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FiltersVm is not found in the empty JSON string", FiltersVm.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FiltersVm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FiltersVm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("TagKeys") != null && !jsonObj.get("TagKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TagKeys` to be an array in the JSON string but got `%s`", jsonObj.get("TagKeys").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("TagValues") != null && !jsonObj.get("TagValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TagValues` to be an array in the JSON string but got `%s`", jsonObj.get("TagValues").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Tags") != null && !jsonObj.get("Tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tags` to be an array in the JSON string but got `%s`", jsonObj.get("Tags").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("VmIds") != null && !jsonObj.get("VmIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `VmIds` to be an array in the JSON string but got `%s`", jsonObj.get("VmIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FiltersVm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FiltersVm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FiltersVm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FiltersVm.class));

       return (TypeAdapter<T>) new TypeAdapter<FiltersVm>() {
           @Override
           public void write(JsonWriter out, FiltersVm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FiltersVm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FiltersVm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FiltersVm
  * @throws IOException if the JSON string is invalid with respect to FiltersVm
  */
  public static FiltersVm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FiltersVm.class);
  }

 /**
  * Convert an instance of FiltersVm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


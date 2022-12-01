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
 * Information about the catalog entry.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class CatalogEntry {
  public static final String SERIALIZED_NAME_CATEGORY = "Category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_FLAGS = "Flags";
  @SerializedName(SERIALIZED_NAME_FLAGS)
  private String flags;

  public static final String SERIALIZED_NAME_OPERATION = "Operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_SERVICE = "Service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private String service;

  public static final String SERIALIZED_NAME_SUBREGION_NAME = "SubregionName";
  @SerializedName(SERIALIZED_NAME_SUBREGION_NAME)
  private String subregionName;

  public static final String SERIALIZED_NAME_TITLE = "Title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "UnitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Float unitPrice;

  public CatalogEntry() {
  }

  public CatalogEntry category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category of the catalog entry (for example, &#x60;network&#x60;).
   * @return category
  **/
  @javax.annotation.Nullable

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public CatalogEntry flags(String flags) {
    
    this.flags = flags;
    return this;
  }

   /**
   * When returned and equal to &#x60;PER_MONTH&#x60;, the price of the catalog entry is calculated on a monthly basis.
   * @return flags
  **/
  @javax.annotation.Nullable

  public String getFlags() {
    return flags;
  }


  public void setFlags(String flags) {
    this.flags = flags;
  }


  public CatalogEntry operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * The API call associated with the catalog entry (for example, &#x60;CreateVms&#x60; or &#x60;RunInstances&#x60;).
   * @return operation
  **/
  @javax.annotation.Nullable

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public CatalogEntry service(String service) {
    
    this.service = service;
    return this;
  }

   /**
   * The service associated with the catalog entry (&#x60;TinaOS-FCU&#x60;, &#x60;TinaOS-LBU&#x60;, &#x60;TinaOS-DirectLink&#x60;, or &#x60;TinaOS-OOS&#x60;).
   * @return service
  **/
  @javax.annotation.Nullable

  public String getService() {
    return service;
  }


  public void setService(String service) {
    this.service = service;
  }


  public CatalogEntry subregionName(String subregionName) {
    
    this.subregionName = subregionName;
    return this;
  }

   /**
   * The Subregion associated with the catalog entry.
   * @return subregionName
  **/
  @javax.annotation.Nullable

  public String getSubregionName() {
    return subregionName;
  }


  public void setSubregionName(String subregionName) {
    this.subregionName = subregionName;
  }


  public CatalogEntry title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The description of the catalog entry.
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CatalogEntry type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of resource associated with the catalog entry.
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CatalogEntry unitPrice(Float unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The unit price of the catalog entry, in the currency of the catalog of the Region where the API method was used.
   * @return unitPrice
  **/
  @javax.annotation.Nullable

  public Float getUnitPrice() {
    return unitPrice;
  }


  public void setUnitPrice(Float unitPrice) {
    this.unitPrice = unitPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogEntry catalogEntry = (CatalogEntry) o;
    return Objects.equals(this.category, catalogEntry.category) &&
        Objects.equals(this.flags, catalogEntry.flags) &&
        Objects.equals(this.operation, catalogEntry.operation) &&
        Objects.equals(this.service, catalogEntry.service) &&
        Objects.equals(this.subregionName, catalogEntry.subregionName) &&
        Objects.equals(this.title, catalogEntry.title) &&
        Objects.equals(this.type, catalogEntry.type) &&
        Objects.equals(this.unitPrice, catalogEntry.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, flags, operation, service, subregionName, title, type, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogEntry {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    subregionName: ").append(toIndentedString(subregionName)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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
    openapiFields.add("Category");
    openapiFields.add("Flags");
    openapiFields.add("Operation");
    openapiFields.add("Service");
    openapiFields.add("SubregionName");
    openapiFields.add("Title");
    openapiFields.add("Type");
    openapiFields.add("UnitPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CatalogEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CatalogEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogEntry is not found in the empty JSON string", CatalogEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CatalogEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogEntry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Category") != null && !jsonObj.get("Category").isJsonNull()) && !jsonObj.get("Category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Category").toString()));
      }
      if ((jsonObj.get("Flags") != null && !jsonObj.get("Flags").isJsonNull()) && !jsonObj.get("Flags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Flags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Flags").toString()));
      }
      if ((jsonObj.get("Operation") != null && !jsonObj.get("Operation").isJsonNull()) && !jsonObj.get("Operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Operation").toString()));
      }
      if ((jsonObj.get("Service") != null && !jsonObj.get("Service").isJsonNull()) && !jsonObj.get("Service").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Service` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Service").toString()));
      }
      if ((jsonObj.get("SubregionName") != null && !jsonObj.get("SubregionName").isJsonNull()) && !jsonObj.get("SubregionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubregionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SubregionName").toString()));
      }
      if ((jsonObj.get("Title") != null && !jsonObj.get("Title").isJsonNull()) && !jsonObj.get("Title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Title").toString()));
      }
      if ((jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogEntry>() {
           @Override
           public void write(JsonWriter out, CatalogEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogEntry
  * @throws IOException if the JSON string is invalid with respect to CatalogEntry
  */
  public static CatalogEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogEntry.class);
  }

 /**
  * Convert an instance of CatalogEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import java.time.LocalDate;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class FiltersVmsState {
  public static final String SERIALIZED_NAME_MAINTENANCE_EVENT_CODES = "MaintenanceEventCodes";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_EVENT_CODES)
  private List<String> maintenanceEventCodes = null;

  public static final String SERIALIZED_NAME_MAINTENANCE_EVENT_DESCRIPTIONS = "MaintenanceEventDescriptions";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_EVENT_DESCRIPTIONS)
  private List<String> maintenanceEventDescriptions = null;

  public static final String SERIALIZED_NAME_MAINTENANCE_EVENTS_NOT_AFTER = "MaintenanceEventsNotAfter";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_EVENTS_NOT_AFTER)
  private List<LocalDate> maintenanceEventsNotAfter = null;

  public static final String SERIALIZED_NAME_MAINTENANCE_EVENTS_NOT_BEFORE = "MaintenanceEventsNotBefore";
  @SerializedName(SERIALIZED_NAME_MAINTENANCE_EVENTS_NOT_BEFORE)
  private List<LocalDate> maintenanceEventsNotBefore = null;

  public static final String SERIALIZED_NAME_SUBREGION_NAMES = "SubregionNames";
  @SerializedName(SERIALIZED_NAME_SUBREGION_NAMES)
  private List<String> subregionNames = null;

  public static final String SERIALIZED_NAME_VM_IDS = "VmIds";
  @SerializedName(SERIALIZED_NAME_VM_IDS)
  private List<String> vmIds = null;

  public static final String SERIALIZED_NAME_VM_STATES = "VmStates";
  @SerializedName(SERIALIZED_NAME_VM_STATES)
  private List<String> vmStates = null;

  public FiltersVmsState() {
  }

  public FiltersVmsState maintenanceEventCodes(List<String> maintenanceEventCodes) {
    
    this.maintenanceEventCodes = maintenanceEventCodes;
    return this;
  }

  public FiltersVmsState addMaintenanceEventCodesItem(String maintenanceEventCodesItem) {
    if (this.maintenanceEventCodes == null) {
      this.maintenanceEventCodes = new ArrayList<>();
    }
    this.maintenanceEventCodes.add(maintenanceEventCodesItem);
    return this;
  }

   /**
   * The code for the scheduled event (&#x60;system-reboot&#x60; \\| &#x60;system-maintenance&#x60;).
   * @return maintenanceEventCodes
  **/
  @javax.annotation.Nullable

  public List<String> getMaintenanceEventCodes() {
    return maintenanceEventCodes;
  }


  public void setMaintenanceEventCodes(List<String> maintenanceEventCodes) {
    this.maintenanceEventCodes = maintenanceEventCodes;
  }


  public FiltersVmsState maintenanceEventDescriptions(List<String> maintenanceEventDescriptions) {
    
    this.maintenanceEventDescriptions = maintenanceEventDescriptions;
    return this;
  }

  public FiltersVmsState addMaintenanceEventDescriptionsItem(String maintenanceEventDescriptionsItem) {
    if (this.maintenanceEventDescriptions == null) {
      this.maintenanceEventDescriptions = new ArrayList<>();
    }
    this.maintenanceEventDescriptions.add(maintenanceEventDescriptionsItem);
    return this;
  }

   /**
   * The description of the scheduled event.
   * @return maintenanceEventDescriptions
  **/
  @javax.annotation.Nullable

  public List<String> getMaintenanceEventDescriptions() {
    return maintenanceEventDescriptions;
  }


  public void setMaintenanceEventDescriptions(List<String> maintenanceEventDescriptions) {
    this.maintenanceEventDescriptions = maintenanceEventDescriptions;
  }


  public FiltersVmsState maintenanceEventsNotAfter(List<LocalDate> maintenanceEventsNotAfter) {
    
    this.maintenanceEventsNotAfter = maintenanceEventsNotAfter;
    return this;
  }

  public FiltersVmsState addMaintenanceEventsNotAfterItem(LocalDate maintenanceEventsNotAfterItem) {
    if (this.maintenanceEventsNotAfter == null) {
      this.maintenanceEventsNotAfter = new ArrayList<>();
    }
    this.maintenanceEventsNotAfter.add(maintenanceEventsNotAfterItem);
    return this;
  }

   /**
   * The latest time the event can end.
   * @return maintenanceEventsNotAfter
  **/
  @javax.annotation.Nullable

  public List<LocalDate> getMaintenanceEventsNotAfter() {
    return maintenanceEventsNotAfter;
  }


  public void setMaintenanceEventsNotAfter(List<LocalDate> maintenanceEventsNotAfter) {
    this.maintenanceEventsNotAfter = maintenanceEventsNotAfter;
  }


  public FiltersVmsState maintenanceEventsNotBefore(List<LocalDate> maintenanceEventsNotBefore) {
    
    this.maintenanceEventsNotBefore = maintenanceEventsNotBefore;
    return this;
  }

  public FiltersVmsState addMaintenanceEventsNotBeforeItem(LocalDate maintenanceEventsNotBeforeItem) {
    if (this.maintenanceEventsNotBefore == null) {
      this.maintenanceEventsNotBefore = new ArrayList<>();
    }
    this.maintenanceEventsNotBefore.add(maintenanceEventsNotBeforeItem);
    return this;
  }

   /**
   * The earliest time the event can start.
   * @return maintenanceEventsNotBefore
  **/
  @javax.annotation.Nullable

  public List<LocalDate> getMaintenanceEventsNotBefore() {
    return maintenanceEventsNotBefore;
  }


  public void setMaintenanceEventsNotBefore(List<LocalDate> maintenanceEventsNotBefore) {
    this.maintenanceEventsNotBefore = maintenanceEventsNotBefore;
  }


  public FiltersVmsState subregionNames(List<String> subregionNames) {
    
    this.subregionNames = subregionNames;
    return this;
  }

  public FiltersVmsState addSubregionNamesItem(String subregionNamesItem) {
    if (this.subregionNames == null) {
      this.subregionNames = new ArrayList<>();
    }
    this.subregionNames.add(subregionNamesItem);
    return this;
  }

   /**
   * The names of the Subregions of the VMs.
   * @return subregionNames
  **/
  @javax.annotation.Nullable

  public List<String> getSubregionNames() {
    return subregionNames;
  }


  public void setSubregionNames(List<String> subregionNames) {
    this.subregionNames = subregionNames;
  }


  public FiltersVmsState vmIds(List<String> vmIds) {
    
    this.vmIds = vmIds;
    return this;
  }

  public FiltersVmsState addVmIdsItem(String vmIdsItem) {
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


  public FiltersVmsState vmStates(List<String> vmStates) {
    
    this.vmStates = vmStates;
    return this;
  }

  public FiltersVmsState addVmStatesItem(String vmStatesItem) {
    if (this.vmStates == null) {
      this.vmStates = new ArrayList<>();
    }
    this.vmStates.add(vmStatesItem);
    return this;
  }

   /**
   * The states of the VMs (&#x60;pending&#x60; \\| &#x60;running&#x60; \\| &#x60;stopping&#x60; \\| &#x60;stopped&#x60; \\| &#x60;shutting-down&#x60; \\| &#x60;terminated&#x60; \\| &#x60;quarantine&#x60;).
   * @return vmStates
  **/
  @javax.annotation.Nullable

  public List<String> getVmStates() {
    return vmStates;
  }


  public void setVmStates(List<String> vmStates) {
    this.vmStates = vmStates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltersVmsState filtersVmsState = (FiltersVmsState) o;
    return Objects.equals(this.maintenanceEventCodes, filtersVmsState.maintenanceEventCodes) &&
        Objects.equals(this.maintenanceEventDescriptions, filtersVmsState.maintenanceEventDescriptions) &&
        Objects.equals(this.maintenanceEventsNotAfter, filtersVmsState.maintenanceEventsNotAfter) &&
        Objects.equals(this.maintenanceEventsNotBefore, filtersVmsState.maintenanceEventsNotBefore) &&
        Objects.equals(this.subregionNames, filtersVmsState.subregionNames) &&
        Objects.equals(this.vmIds, filtersVmsState.vmIds) &&
        Objects.equals(this.vmStates, filtersVmsState.vmStates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenanceEventCodes, maintenanceEventDescriptions, maintenanceEventsNotAfter, maintenanceEventsNotBefore, subregionNames, vmIds, vmStates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltersVmsState {\n");
    sb.append("    maintenanceEventCodes: ").append(toIndentedString(maintenanceEventCodes)).append("\n");
    sb.append("    maintenanceEventDescriptions: ").append(toIndentedString(maintenanceEventDescriptions)).append("\n");
    sb.append("    maintenanceEventsNotAfter: ").append(toIndentedString(maintenanceEventsNotAfter)).append("\n");
    sb.append("    maintenanceEventsNotBefore: ").append(toIndentedString(maintenanceEventsNotBefore)).append("\n");
    sb.append("    subregionNames: ").append(toIndentedString(subregionNames)).append("\n");
    sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
    sb.append("    vmStates: ").append(toIndentedString(vmStates)).append("\n");
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
    openapiFields.add("MaintenanceEventCodes");
    openapiFields.add("MaintenanceEventDescriptions");
    openapiFields.add("MaintenanceEventsNotAfter");
    openapiFields.add("MaintenanceEventsNotBefore");
    openapiFields.add("SubregionNames");
    openapiFields.add("VmIds");
    openapiFields.add("VmStates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FiltersVmsState
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FiltersVmsState.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FiltersVmsState is not found in the empty JSON string", FiltersVmsState.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FiltersVmsState.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FiltersVmsState` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("MaintenanceEventCodes") != null && !jsonObj.get("MaintenanceEventCodes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MaintenanceEventCodes` to be an array in the JSON string but got `%s`", jsonObj.get("MaintenanceEventCodes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("MaintenanceEventDescriptions") != null && !jsonObj.get("MaintenanceEventDescriptions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MaintenanceEventDescriptions` to be an array in the JSON string but got `%s`", jsonObj.get("MaintenanceEventDescriptions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("MaintenanceEventsNotAfter") != null && !jsonObj.get("MaintenanceEventsNotAfter").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MaintenanceEventsNotAfter` to be an array in the JSON string but got `%s`", jsonObj.get("MaintenanceEventsNotAfter").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("MaintenanceEventsNotBefore") != null && !jsonObj.get("MaintenanceEventsNotBefore").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `MaintenanceEventsNotBefore` to be an array in the JSON string but got `%s`", jsonObj.get("MaintenanceEventsNotBefore").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("SubregionNames") != null && !jsonObj.get("SubregionNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubregionNames` to be an array in the JSON string but got `%s`", jsonObj.get("SubregionNames").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("VmIds") != null && !jsonObj.get("VmIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `VmIds` to be an array in the JSON string but got `%s`", jsonObj.get("VmIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("VmStates") != null && !jsonObj.get("VmStates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `VmStates` to be an array in the JSON string but got `%s`", jsonObj.get("VmStates").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FiltersVmsState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FiltersVmsState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FiltersVmsState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FiltersVmsState.class));

       return (TypeAdapter<T>) new TypeAdapter<FiltersVmsState>() {
           @Override
           public void write(JsonWriter out, FiltersVmsState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FiltersVmsState read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FiltersVmsState given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FiltersVmsState
  * @throws IOException if the JSON string is invalid with respect to FiltersVmsState
  */
  public static FiltersVmsState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FiltersVmsState.class);
  }

 /**
  * Convert an instance of FiltersVmsState to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


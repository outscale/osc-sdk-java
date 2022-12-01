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
 * Information about Phase 1 of the Internet Key Exchange (IKE) negotiation. When Phase 1 finishes successfully, peers proceed to Phase 2 negotiations. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class Phase1Options {
  public static final String SERIALIZED_NAME_DPD_TIMEOUT_ACTION = "DpdTimeoutAction";
  @SerializedName(SERIALIZED_NAME_DPD_TIMEOUT_ACTION)
  private String dpdTimeoutAction;

  public static final String SERIALIZED_NAME_DPD_TIMEOUT_SECONDS = "DpdTimeoutSeconds";
  @SerializedName(SERIALIZED_NAME_DPD_TIMEOUT_SECONDS)
  private Integer dpdTimeoutSeconds;

  public static final String SERIALIZED_NAME_IKE_VERSIONS = "IkeVersions";
  @SerializedName(SERIALIZED_NAME_IKE_VERSIONS)
  private List<String> ikeVersions = null;

  public static final String SERIALIZED_NAME_PHASE1_DH_GROUP_NUMBERS = "Phase1DhGroupNumbers";
  @SerializedName(SERIALIZED_NAME_PHASE1_DH_GROUP_NUMBERS)
  private List<Integer> phase1DhGroupNumbers = null;

  public static final String SERIALIZED_NAME_PHASE1_ENCRYPTION_ALGORITHMS = "Phase1EncryptionAlgorithms";
  @SerializedName(SERIALIZED_NAME_PHASE1_ENCRYPTION_ALGORITHMS)
  private List<String> phase1EncryptionAlgorithms = null;

  public static final String SERIALIZED_NAME_PHASE1_INTEGRITY_ALGORITHMS = "Phase1IntegrityAlgorithms";
  @SerializedName(SERIALIZED_NAME_PHASE1_INTEGRITY_ALGORITHMS)
  private List<String> phase1IntegrityAlgorithms = null;

  public static final String SERIALIZED_NAME_PHASE1_LIFETIME_SECONDS = "Phase1LifetimeSeconds";
  @SerializedName(SERIALIZED_NAME_PHASE1_LIFETIME_SECONDS)
  private Integer phase1LifetimeSeconds;

  public static final String SERIALIZED_NAME_REPLAY_WINDOW_SIZE = "ReplayWindowSize";
  @SerializedName(SERIALIZED_NAME_REPLAY_WINDOW_SIZE)
  private Integer replayWindowSize;

  public static final String SERIALIZED_NAME_STARTUP_ACTION = "StartupAction";
  @SerializedName(SERIALIZED_NAME_STARTUP_ACTION)
  private String startupAction;

  public Phase1Options() {
  }

  public Phase1Options dpdTimeoutAction(String dpdTimeoutAction) {
    
    this.dpdTimeoutAction = dpdTimeoutAction;
    return this;
  }

   /**
   * The action to carry out after a Dead Peer Detection (DPD) timeout occurs.
   * @return dpdTimeoutAction
  **/
  @javax.annotation.Nullable

  public String getDpdTimeoutAction() {
    return dpdTimeoutAction;
  }


  public void setDpdTimeoutAction(String dpdTimeoutAction) {
    this.dpdTimeoutAction = dpdTimeoutAction;
  }


  public Phase1Options dpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
    
    this.dpdTimeoutSeconds = dpdTimeoutSeconds;
    return this;
  }

   /**
   * The maximum waiting time for a Dead Peer Detection (DPD) response before considering the peer as dead, in seconds.
   * @return dpdTimeoutSeconds
  **/
  @javax.annotation.Nullable

  public Integer getDpdTimeoutSeconds() {
    return dpdTimeoutSeconds;
  }


  public void setDpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
    this.dpdTimeoutSeconds = dpdTimeoutSeconds;
  }


  public Phase1Options ikeVersions(List<String> ikeVersions) {
    
    this.ikeVersions = ikeVersions;
    return this;
  }

  public Phase1Options addIkeVersionsItem(String ikeVersionsItem) {
    if (this.ikeVersions == null) {
      this.ikeVersions = new ArrayList<>();
    }
    this.ikeVersions.add(ikeVersionsItem);
    return this;
  }

   /**
   * The Internet Key Exchange (IKE) versions allowed for the VPN tunnel.
   * @return ikeVersions
  **/
  @javax.annotation.Nullable

  public List<String> getIkeVersions() {
    return ikeVersions;
  }


  public void setIkeVersions(List<String> ikeVersions) {
    this.ikeVersions = ikeVersions;
  }


  public Phase1Options phase1DhGroupNumbers(List<Integer> phase1DhGroupNumbers) {
    
    this.phase1DhGroupNumbers = phase1DhGroupNumbers;
    return this;
  }

  public Phase1Options addPhase1DhGroupNumbersItem(Integer phase1DhGroupNumbersItem) {
    if (this.phase1DhGroupNumbers == null) {
      this.phase1DhGroupNumbers = new ArrayList<>();
    }
    this.phase1DhGroupNumbers.add(phase1DhGroupNumbersItem);
    return this;
  }

   /**
   * The Diffie-Hellman (DH) group numbers allowed for the VPN tunnel for phase 1.
   * @return phase1DhGroupNumbers
  **/
  @javax.annotation.Nullable

  public List<Integer> getPhase1DhGroupNumbers() {
    return phase1DhGroupNumbers;
  }


  public void setPhase1DhGroupNumbers(List<Integer> phase1DhGroupNumbers) {
    this.phase1DhGroupNumbers = phase1DhGroupNumbers;
  }


  public Phase1Options phase1EncryptionAlgorithms(List<String> phase1EncryptionAlgorithms) {
    
    this.phase1EncryptionAlgorithms = phase1EncryptionAlgorithms;
    return this;
  }

  public Phase1Options addPhase1EncryptionAlgorithmsItem(String phase1EncryptionAlgorithmsItem) {
    if (this.phase1EncryptionAlgorithms == null) {
      this.phase1EncryptionAlgorithms = new ArrayList<>();
    }
    this.phase1EncryptionAlgorithms.add(phase1EncryptionAlgorithmsItem);
    return this;
  }

   /**
   * The encryption algorithms allowed for the VPN tunnel for phase 1.
   * @return phase1EncryptionAlgorithms
  **/
  @javax.annotation.Nullable

  public List<String> getPhase1EncryptionAlgorithms() {
    return phase1EncryptionAlgorithms;
  }


  public void setPhase1EncryptionAlgorithms(List<String> phase1EncryptionAlgorithms) {
    this.phase1EncryptionAlgorithms = phase1EncryptionAlgorithms;
  }


  public Phase1Options phase1IntegrityAlgorithms(List<String> phase1IntegrityAlgorithms) {
    
    this.phase1IntegrityAlgorithms = phase1IntegrityAlgorithms;
    return this;
  }

  public Phase1Options addPhase1IntegrityAlgorithmsItem(String phase1IntegrityAlgorithmsItem) {
    if (this.phase1IntegrityAlgorithms == null) {
      this.phase1IntegrityAlgorithms = new ArrayList<>();
    }
    this.phase1IntegrityAlgorithms.add(phase1IntegrityAlgorithmsItem);
    return this;
  }

   /**
   * The integrity algorithms allowed for the VPN tunnel for phase 1.
   * @return phase1IntegrityAlgorithms
  **/
  @javax.annotation.Nullable

  public List<String> getPhase1IntegrityAlgorithms() {
    return phase1IntegrityAlgorithms;
  }


  public void setPhase1IntegrityAlgorithms(List<String> phase1IntegrityAlgorithms) {
    this.phase1IntegrityAlgorithms = phase1IntegrityAlgorithms;
  }


  public Phase1Options phase1LifetimeSeconds(Integer phase1LifetimeSeconds) {
    
    this.phase1LifetimeSeconds = phase1LifetimeSeconds;
    return this;
  }

   /**
   * The lifetime for phase 1 of the IKE negotiation process, in seconds.
   * @return phase1LifetimeSeconds
  **/
  @javax.annotation.Nullable

  public Integer getPhase1LifetimeSeconds() {
    return phase1LifetimeSeconds;
  }


  public void setPhase1LifetimeSeconds(Integer phase1LifetimeSeconds) {
    this.phase1LifetimeSeconds = phase1LifetimeSeconds;
  }


  public Phase1Options replayWindowSize(Integer replayWindowSize) {
    
    this.replayWindowSize = replayWindowSize;
    return this;
  }

   /**
   * The number of packets in an IKE replay window.
   * @return replayWindowSize
  **/
  @javax.annotation.Nullable

  public Integer getReplayWindowSize() {
    return replayWindowSize;
  }


  public void setReplayWindowSize(Integer replayWindowSize) {
    this.replayWindowSize = replayWindowSize;
  }


  public Phase1Options startupAction(String startupAction) {
    
    this.startupAction = startupAction;
    return this;
  }

   /**
   * The action to carry out when establishing tunnels for a VPN connection.
   * @return startupAction
  **/
  @javax.annotation.Nullable

  public String getStartupAction() {
    return startupAction;
  }


  public void setStartupAction(String startupAction) {
    this.startupAction = startupAction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phase1Options phase1Options = (Phase1Options) o;
    return Objects.equals(this.dpdTimeoutAction, phase1Options.dpdTimeoutAction) &&
        Objects.equals(this.dpdTimeoutSeconds, phase1Options.dpdTimeoutSeconds) &&
        Objects.equals(this.ikeVersions, phase1Options.ikeVersions) &&
        Objects.equals(this.phase1DhGroupNumbers, phase1Options.phase1DhGroupNumbers) &&
        Objects.equals(this.phase1EncryptionAlgorithms, phase1Options.phase1EncryptionAlgorithms) &&
        Objects.equals(this.phase1IntegrityAlgorithms, phase1Options.phase1IntegrityAlgorithms) &&
        Objects.equals(this.phase1LifetimeSeconds, phase1Options.phase1LifetimeSeconds) &&
        Objects.equals(this.replayWindowSize, phase1Options.replayWindowSize) &&
        Objects.equals(this.startupAction, phase1Options.startupAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpdTimeoutAction, dpdTimeoutSeconds, ikeVersions, phase1DhGroupNumbers, phase1EncryptionAlgorithms, phase1IntegrityAlgorithms, phase1LifetimeSeconds, replayWindowSize, startupAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phase1Options {\n");
    sb.append("    dpdTimeoutAction: ").append(toIndentedString(dpdTimeoutAction)).append("\n");
    sb.append("    dpdTimeoutSeconds: ").append(toIndentedString(dpdTimeoutSeconds)).append("\n");
    sb.append("    ikeVersions: ").append(toIndentedString(ikeVersions)).append("\n");
    sb.append("    phase1DhGroupNumbers: ").append(toIndentedString(phase1DhGroupNumbers)).append("\n");
    sb.append("    phase1EncryptionAlgorithms: ").append(toIndentedString(phase1EncryptionAlgorithms)).append("\n");
    sb.append("    phase1IntegrityAlgorithms: ").append(toIndentedString(phase1IntegrityAlgorithms)).append("\n");
    sb.append("    phase1LifetimeSeconds: ").append(toIndentedString(phase1LifetimeSeconds)).append("\n");
    sb.append("    replayWindowSize: ").append(toIndentedString(replayWindowSize)).append("\n");
    sb.append("    startupAction: ").append(toIndentedString(startupAction)).append("\n");
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
    openapiFields.add("DpdTimeoutAction");
    openapiFields.add("DpdTimeoutSeconds");
    openapiFields.add("IkeVersions");
    openapiFields.add("Phase1DhGroupNumbers");
    openapiFields.add("Phase1EncryptionAlgorithms");
    openapiFields.add("Phase1IntegrityAlgorithms");
    openapiFields.add("Phase1LifetimeSeconds");
    openapiFields.add("ReplayWindowSize");
    openapiFields.add("StartupAction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Phase1Options
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Phase1Options.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Phase1Options is not found in the empty JSON string", Phase1Options.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Phase1Options.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Phase1Options` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("DpdTimeoutAction") != null && !jsonObj.get("DpdTimeoutAction").isJsonNull()) && !jsonObj.get("DpdTimeoutAction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DpdTimeoutAction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DpdTimeoutAction").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("IkeVersions") != null && !jsonObj.get("IkeVersions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `IkeVersions` to be an array in the JSON string but got `%s`", jsonObj.get("IkeVersions").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Phase1DhGroupNumbers") != null && !jsonObj.get("Phase1DhGroupNumbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Phase1DhGroupNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("Phase1DhGroupNumbers").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Phase1EncryptionAlgorithms") != null && !jsonObj.get("Phase1EncryptionAlgorithms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Phase1EncryptionAlgorithms` to be an array in the JSON string but got `%s`", jsonObj.get("Phase1EncryptionAlgorithms").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Phase1IntegrityAlgorithms") != null && !jsonObj.get("Phase1IntegrityAlgorithms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Phase1IntegrityAlgorithms` to be an array in the JSON string but got `%s`", jsonObj.get("Phase1IntegrityAlgorithms").toString()));
      }
      if ((jsonObj.get("StartupAction") != null && !jsonObj.get("StartupAction").isJsonNull()) && !jsonObj.get("StartupAction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StartupAction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StartupAction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Phase1Options.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Phase1Options' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Phase1Options> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Phase1Options.class));

       return (TypeAdapter<T>) new TypeAdapter<Phase1Options>() {
           @Override
           public void write(JsonWriter out, Phase1Options value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Phase1Options read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Phase1Options given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Phase1Options
  * @throws IOException if the JSON string is invalid with respect to Phase1Options
  */
  public static Phase1Options fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Phase1Options.class);
  }

 /**
  * Convert an instance of Phase1Options to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


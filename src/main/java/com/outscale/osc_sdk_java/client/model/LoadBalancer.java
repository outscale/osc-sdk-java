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
import com.outscale.osc_sdk_java.client.model.AccessLog;
import com.outscale.osc_sdk_java.client.model.ApplicationStickyCookiePolicy;
import com.outscale.osc_sdk_java.client.model.HealthCheck;
import com.outscale.osc_sdk_java.client.model.Listener;
import com.outscale.osc_sdk_java.client.model.LoadBalancerStickyCookiePolicy;
import com.outscale.osc_sdk_java.client.model.ResourceTag;
import com.outscale.osc_sdk_java.client.model.SourceSecurityGroup;
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
 * Information about the load balancer.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-02T08:39:48.703371583Z[GMT]")
public class LoadBalancer {
  public static final String SERIALIZED_NAME_ACCESS_LOG = "AccessLog";
  @SerializedName(SERIALIZED_NAME_ACCESS_LOG)
  private AccessLog accessLog;

  public static final String SERIALIZED_NAME_APPLICATION_STICKY_COOKIE_POLICIES = "ApplicationStickyCookiePolicies";
  @SerializedName(SERIALIZED_NAME_APPLICATION_STICKY_COOKIE_POLICIES)
  private List<ApplicationStickyCookiePolicy> applicationStickyCookiePolicies = null;

  public static final String SERIALIZED_NAME_BACKEND_IPS = "BackendIps";
  @SerializedName(SERIALIZED_NAME_BACKEND_IPS)
  private List<String> backendIps = null;

  public static final String SERIALIZED_NAME_BACKEND_VM_IDS = "BackendVmIds";
  @SerializedName(SERIALIZED_NAME_BACKEND_VM_IDS)
  private List<String> backendVmIds = null;

  public static final String SERIALIZED_NAME_DNS_NAME = "DnsName";
  @SerializedName(SERIALIZED_NAME_DNS_NAME)
  private String dnsName;

  public static final String SERIALIZED_NAME_HEALTH_CHECK = "HealthCheck";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK)
  private HealthCheck healthCheck;

  public static final String SERIALIZED_NAME_LISTENERS = "Listeners";
  @SerializedName(SERIALIZED_NAME_LISTENERS)
  private List<Listener> listeners = null;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_NAME = "LoadBalancerName";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_NAME)
  private String loadBalancerName;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_STICKY_COOKIE_POLICIES = "LoadBalancerStickyCookiePolicies";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_STICKY_COOKIE_POLICIES)
  private List<LoadBalancerStickyCookiePolicy> loadBalancerStickyCookiePolicies = null;

  public static final String SERIALIZED_NAME_LOAD_BALANCER_TYPE = "LoadBalancerType";
  @SerializedName(SERIALIZED_NAME_LOAD_BALANCER_TYPE)
  private String loadBalancerType;

  public static final String SERIALIZED_NAME_NET_ID = "NetId";
  @SerializedName(SERIALIZED_NAME_NET_ID)
  private String netId;

  public static final String SERIALIZED_NAME_PUBLIC_IP = "PublicIp";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
  private String publicIp;

  public static final String SERIALIZED_NAME_SECURED_COOKIES = "SecuredCookies";
  @SerializedName(SERIALIZED_NAME_SECURED_COOKIES)
  private Boolean securedCookies;

  public static final String SERIALIZED_NAME_SECURITY_GROUPS = "SecurityGroups";
  @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS)
  private List<String> securityGroups = null;

  public static final String SERIALIZED_NAME_SOURCE_SECURITY_GROUP = "SourceSecurityGroup";
  @SerializedName(SERIALIZED_NAME_SOURCE_SECURITY_GROUP)
  private SourceSecurityGroup sourceSecurityGroup;

  public static final String SERIALIZED_NAME_SUBNETS = "Subnets";
  @SerializedName(SERIALIZED_NAME_SUBNETS)
  private List<String> subnets = null;

  public static final String SERIALIZED_NAME_SUBREGION_NAMES = "SubregionNames";
  @SerializedName(SERIALIZED_NAME_SUBREGION_NAMES)
  private List<String> subregionNames = null;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<ResourceTag> tags = null;

  public LoadBalancer() {
  }

  public LoadBalancer accessLog(AccessLog accessLog) {
    
    this.accessLog = accessLog;
    return this;
  }

   /**
   * Get accessLog
   * @return accessLog
  **/
  @javax.annotation.Nullable

  public AccessLog getAccessLog() {
    return accessLog;
  }


  public void setAccessLog(AccessLog accessLog) {
    this.accessLog = accessLog;
  }


  public LoadBalancer applicationStickyCookiePolicies(List<ApplicationStickyCookiePolicy> applicationStickyCookiePolicies) {
    
    this.applicationStickyCookiePolicies = applicationStickyCookiePolicies;
    return this;
  }

  public LoadBalancer addApplicationStickyCookiePoliciesItem(ApplicationStickyCookiePolicy applicationStickyCookiePoliciesItem) {
    if (this.applicationStickyCookiePolicies == null) {
      this.applicationStickyCookiePolicies = new ArrayList<>();
    }
    this.applicationStickyCookiePolicies.add(applicationStickyCookiePoliciesItem);
    return this;
  }

   /**
   * The stickiness policies defined for the load balancer.
   * @return applicationStickyCookiePolicies
  **/
  @javax.annotation.Nullable

  public List<ApplicationStickyCookiePolicy> getApplicationStickyCookiePolicies() {
    return applicationStickyCookiePolicies;
  }


  public void setApplicationStickyCookiePolicies(List<ApplicationStickyCookiePolicy> applicationStickyCookiePolicies) {
    this.applicationStickyCookiePolicies = applicationStickyCookiePolicies;
  }


  public LoadBalancer backendIps(List<String> backendIps) {
    
    this.backendIps = backendIps;
    return this;
  }

  public LoadBalancer addBackendIpsItem(String backendIpsItem) {
    if (this.backendIps == null) {
      this.backendIps = new ArrayList<>();
    }
    this.backendIps.add(backendIpsItem);
    return this;
  }

   /**
   * One or more public IPs of back-end VMs.
   * @return backendIps
  **/
  @javax.annotation.Nullable

  public List<String> getBackendIps() {
    return backendIps;
  }


  public void setBackendIps(List<String> backendIps) {
    this.backendIps = backendIps;
  }


  public LoadBalancer backendVmIds(List<String> backendVmIds) {
    
    this.backendVmIds = backendVmIds;
    return this;
  }

  public LoadBalancer addBackendVmIdsItem(String backendVmIdsItem) {
    if (this.backendVmIds == null) {
      this.backendVmIds = new ArrayList<>();
    }
    this.backendVmIds.add(backendVmIdsItem);
    return this;
  }

   /**
   * One or more IDs of back-end VMs for the load balancer.
   * @return backendVmIds
  **/
  @javax.annotation.Nullable

  public List<String> getBackendVmIds() {
    return backendVmIds;
  }


  public void setBackendVmIds(List<String> backendVmIds) {
    this.backendVmIds = backendVmIds;
  }


  public LoadBalancer dnsName(String dnsName) {
    
    this.dnsName = dnsName;
    return this;
  }

   /**
   * The DNS name of the load balancer.
   * @return dnsName
  **/
  @javax.annotation.Nullable

  public String getDnsName() {
    return dnsName;
  }


  public void setDnsName(String dnsName) {
    this.dnsName = dnsName;
  }


  public LoadBalancer healthCheck(HealthCheck healthCheck) {
    
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @javax.annotation.Nullable

  public HealthCheck getHealthCheck() {
    return healthCheck;
  }


  public void setHealthCheck(HealthCheck healthCheck) {
    this.healthCheck = healthCheck;
  }


  public LoadBalancer listeners(List<Listener> listeners) {
    
    this.listeners = listeners;
    return this;
  }

  public LoadBalancer addListenersItem(Listener listenersItem) {
    if (this.listeners == null) {
      this.listeners = new ArrayList<>();
    }
    this.listeners.add(listenersItem);
    return this;
  }

   /**
   * The listeners for the load balancer.
   * @return listeners
  **/
  @javax.annotation.Nullable

  public List<Listener> getListeners() {
    return listeners;
  }


  public void setListeners(List<Listener> listeners) {
    this.listeners = listeners;
  }


  public LoadBalancer loadBalancerName(String loadBalancerName) {
    
    this.loadBalancerName = loadBalancerName;
    return this;
  }

   /**
   * The name of the load balancer.
   * @return loadBalancerName
  **/
  @javax.annotation.Nullable

  public String getLoadBalancerName() {
    return loadBalancerName;
  }


  public void setLoadBalancerName(String loadBalancerName) {
    this.loadBalancerName = loadBalancerName;
  }


  public LoadBalancer loadBalancerStickyCookiePolicies(List<LoadBalancerStickyCookiePolicy> loadBalancerStickyCookiePolicies) {
    
    this.loadBalancerStickyCookiePolicies = loadBalancerStickyCookiePolicies;
    return this;
  }

  public LoadBalancer addLoadBalancerStickyCookiePoliciesItem(LoadBalancerStickyCookiePolicy loadBalancerStickyCookiePoliciesItem) {
    if (this.loadBalancerStickyCookiePolicies == null) {
      this.loadBalancerStickyCookiePolicies = new ArrayList<>();
    }
    this.loadBalancerStickyCookiePolicies.add(loadBalancerStickyCookiePoliciesItem);
    return this;
  }

   /**
   * The policies defined for the load balancer.
   * @return loadBalancerStickyCookiePolicies
  **/
  @javax.annotation.Nullable

  public List<LoadBalancerStickyCookiePolicy> getLoadBalancerStickyCookiePolicies() {
    return loadBalancerStickyCookiePolicies;
  }


  public void setLoadBalancerStickyCookiePolicies(List<LoadBalancerStickyCookiePolicy> loadBalancerStickyCookiePolicies) {
    this.loadBalancerStickyCookiePolicies = loadBalancerStickyCookiePolicies;
  }


  public LoadBalancer loadBalancerType(String loadBalancerType) {
    
    this.loadBalancerType = loadBalancerType;
    return this;
  }

   /**
   * The type of load balancer. Valid only for load balancers in a Net.&lt;br /&gt; If &#x60;LoadBalancerType&#x60; is &#x60;internet-facing&#x60;, the load balancer has a public DNS name that resolves to a public IP.&lt;br /&gt; If &#x60;LoadBalancerType&#x60; is &#x60;internal&#x60;, the load balancer has a public DNS name that resolves to a private IP.
   * @return loadBalancerType
  **/
  @javax.annotation.Nullable

  public String getLoadBalancerType() {
    return loadBalancerType;
  }


  public void setLoadBalancerType(String loadBalancerType) {
    this.loadBalancerType = loadBalancerType;
  }


  public LoadBalancer netId(String netId) {
    
    this.netId = netId;
    return this;
  }

   /**
   * The ID of the Net for the load balancer.
   * @return netId
  **/
  @javax.annotation.Nullable

  public String getNetId() {
    return netId;
  }


  public void setNetId(String netId) {
    this.netId = netId;
  }


  public LoadBalancer publicIp(String publicIp) {
    
    this.publicIp = publicIp;
    return this;
  }

   /**
   * (internet-facing only) The public IP associated with the load balancer.
   * @return publicIp
  **/
  @javax.annotation.Nullable

  public String getPublicIp() {
    return publicIp;
  }


  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  public LoadBalancer securedCookies(Boolean securedCookies) {
    
    this.securedCookies = securedCookies;
    return this;
  }

   /**
   * Whether secure cookies are enabled for the load balancer.
   * @return securedCookies
  **/
  @javax.annotation.Nullable

  public Boolean getSecuredCookies() {
    return securedCookies;
  }


  public void setSecuredCookies(Boolean securedCookies) {
    this.securedCookies = securedCookies;
  }


  public LoadBalancer securityGroups(List<String> securityGroups) {
    
    this.securityGroups = securityGroups;
    return this;
  }

  public LoadBalancer addSecurityGroupsItem(String securityGroupsItem) {
    if (this.securityGroups == null) {
      this.securityGroups = new ArrayList<>();
    }
    this.securityGroups.add(securityGroupsItem);
    return this;
  }

   /**
   * One or more IDs of security groups for the load balancers. Valid only for load balancers in a Net.
   * @return securityGroups
  **/
  @javax.annotation.Nullable

  public List<String> getSecurityGroups() {
    return securityGroups;
  }


  public void setSecurityGroups(List<String> securityGroups) {
    this.securityGroups = securityGroups;
  }


  public LoadBalancer sourceSecurityGroup(SourceSecurityGroup sourceSecurityGroup) {
    
    this.sourceSecurityGroup = sourceSecurityGroup;
    return this;
  }

   /**
   * Get sourceSecurityGroup
   * @return sourceSecurityGroup
  **/
  @javax.annotation.Nullable

  public SourceSecurityGroup getSourceSecurityGroup() {
    return sourceSecurityGroup;
  }


  public void setSourceSecurityGroup(SourceSecurityGroup sourceSecurityGroup) {
    this.sourceSecurityGroup = sourceSecurityGroup;
  }


  public LoadBalancer subnets(List<String> subnets) {
    
    this.subnets = subnets;
    return this;
  }

  public LoadBalancer addSubnetsItem(String subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

   /**
   * The ID of the Subnet in which the load balancer was created.
   * @return subnets
  **/
  @javax.annotation.Nullable

  public List<String> getSubnets() {
    return subnets;
  }


  public void setSubnets(List<String> subnets) {
    this.subnets = subnets;
  }


  public LoadBalancer subregionNames(List<String> subregionNames) {
    
    this.subregionNames = subregionNames;
    return this;
  }

  public LoadBalancer addSubregionNamesItem(String subregionNamesItem) {
    if (this.subregionNames == null) {
      this.subregionNames = new ArrayList<>();
    }
    this.subregionNames.add(subregionNamesItem);
    return this;
  }

   /**
   * The ID of the Subregion in which the load balancer was created.
   * @return subregionNames
  **/
  @javax.annotation.Nullable

  public List<String> getSubregionNames() {
    return subregionNames;
  }


  public void setSubregionNames(List<String> subregionNames) {
    this.subregionNames = subregionNames;
  }


  public LoadBalancer tags(List<ResourceTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public LoadBalancer addTagsItem(ResourceTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * One or more tags associated with the load balancer.
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
    LoadBalancer loadBalancer = (LoadBalancer) o;
    return Objects.equals(this.accessLog, loadBalancer.accessLog) &&
        Objects.equals(this.applicationStickyCookiePolicies, loadBalancer.applicationStickyCookiePolicies) &&
        Objects.equals(this.backendIps, loadBalancer.backendIps) &&
        Objects.equals(this.backendVmIds, loadBalancer.backendVmIds) &&
        Objects.equals(this.dnsName, loadBalancer.dnsName) &&
        Objects.equals(this.healthCheck, loadBalancer.healthCheck) &&
        Objects.equals(this.listeners, loadBalancer.listeners) &&
        Objects.equals(this.loadBalancerName, loadBalancer.loadBalancerName) &&
        Objects.equals(this.loadBalancerStickyCookiePolicies, loadBalancer.loadBalancerStickyCookiePolicies) &&
        Objects.equals(this.loadBalancerType, loadBalancer.loadBalancerType) &&
        Objects.equals(this.netId, loadBalancer.netId) &&
        Objects.equals(this.publicIp, loadBalancer.publicIp) &&
        Objects.equals(this.securedCookies, loadBalancer.securedCookies) &&
        Objects.equals(this.securityGroups, loadBalancer.securityGroups) &&
        Objects.equals(this.sourceSecurityGroup, loadBalancer.sourceSecurityGroup) &&
        Objects.equals(this.subnets, loadBalancer.subnets) &&
        Objects.equals(this.subregionNames, loadBalancer.subregionNames) &&
        Objects.equals(this.tags, loadBalancer.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLog, applicationStickyCookiePolicies, backendIps, backendVmIds, dnsName, healthCheck, listeners, loadBalancerName, loadBalancerStickyCookiePolicies, loadBalancerType, netId, publicIp, securedCookies, securityGroups, sourceSecurityGroup, subnets, subregionNames, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancer {\n");
    sb.append("    accessLog: ").append(toIndentedString(accessLog)).append("\n");
    sb.append("    applicationStickyCookiePolicies: ").append(toIndentedString(applicationStickyCookiePolicies)).append("\n");
    sb.append("    backendIps: ").append(toIndentedString(backendIps)).append("\n");
    sb.append("    backendVmIds: ").append(toIndentedString(backendVmIds)).append("\n");
    sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    loadBalancerName: ").append(toIndentedString(loadBalancerName)).append("\n");
    sb.append("    loadBalancerStickyCookiePolicies: ").append(toIndentedString(loadBalancerStickyCookiePolicies)).append("\n");
    sb.append("    loadBalancerType: ").append(toIndentedString(loadBalancerType)).append("\n");
    sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    securedCookies: ").append(toIndentedString(securedCookies)).append("\n");
    sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
    sb.append("    sourceSecurityGroup: ").append(toIndentedString(sourceSecurityGroup)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    subregionNames: ").append(toIndentedString(subregionNames)).append("\n");
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
    openapiFields.add("AccessLog");
    openapiFields.add("ApplicationStickyCookiePolicies");
    openapiFields.add("BackendIps");
    openapiFields.add("BackendVmIds");
    openapiFields.add("DnsName");
    openapiFields.add("HealthCheck");
    openapiFields.add("Listeners");
    openapiFields.add("LoadBalancerName");
    openapiFields.add("LoadBalancerStickyCookiePolicies");
    openapiFields.add("LoadBalancerType");
    openapiFields.add("NetId");
    openapiFields.add("PublicIp");
    openapiFields.add("SecuredCookies");
    openapiFields.add("SecurityGroups");
    openapiFields.add("SourceSecurityGroup");
    openapiFields.add("Subnets");
    openapiFields.add("SubregionNames");
    openapiFields.add("Tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LoadBalancer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LoadBalancer.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LoadBalancer is not found in the empty JSON string", LoadBalancer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LoadBalancer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LoadBalancer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `AccessLog`
      if (jsonObj.get("AccessLog") != null && !jsonObj.get("AccessLog").isJsonNull()) {
        AccessLog.validateJsonObject(jsonObj.getAsJsonObject("AccessLog"));
      }
      if (jsonObj.get("ApplicationStickyCookiePolicies") != null && !jsonObj.get("ApplicationStickyCookiePolicies").isJsonNull()) {
        JsonArray jsonArrayapplicationStickyCookiePolicies = jsonObj.getAsJsonArray("ApplicationStickyCookiePolicies");
        if (jsonArrayapplicationStickyCookiePolicies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ApplicationStickyCookiePolicies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ApplicationStickyCookiePolicies` to be an array in the JSON string but got `%s`", jsonObj.get("ApplicationStickyCookiePolicies").toString()));
          }

          // validate the optional field `ApplicationStickyCookiePolicies` (array)
          for (int i = 0; i < jsonArrayapplicationStickyCookiePolicies.size(); i++) {
            ApplicationStickyCookiePolicy.validateJsonObject(jsonArrayapplicationStickyCookiePolicies.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("BackendIps") != null && !jsonObj.get("BackendIps").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BackendIps` to be an array in the JSON string but got `%s`", jsonObj.get("BackendIps").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("BackendVmIds") != null && !jsonObj.get("BackendVmIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `BackendVmIds` to be an array in the JSON string but got `%s`", jsonObj.get("BackendVmIds").toString()));
      }
      if ((jsonObj.get("DnsName") != null && !jsonObj.get("DnsName").isJsonNull()) && !jsonObj.get("DnsName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DnsName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DnsName").toString()));
      }
      // validate the optional field `HealthCheck`
      if (jsonObj.get("HealthCheck") != null && !jsonObj.get("HealthCheck").isJsonNull()) {
        HealthCheck.validateJsonObject(jsonObj.getAsJsonObject("HealthCheck"));
      }
      if (jsonObj.get("Listeners") != null && !jsonObj.get("Listeners").isJsonNull()) {
        JsonArray jsonArraylisteners = jsonObj.getAsJsonArray("Listeners");
        if (jsonArraylisteners != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Listeners").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Listeners` to be an array in the JSON string but got `%s`", jsonObj.get("Listeners").toString()));
          }

          // validate the optional field `Listeners` (array)
          for (int i = 0; i < jsonArraylisteners.size(); i++) {
            Listener.validateJsonObject(jsonArraylisteners.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("LoadBalancerName") != null && !jsonObj.get("LoadBalancerName").isJsonNull()) && !jsonObj.get("LoadBalancerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoadBalancerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoadBalancerName").toString()));
      }
      if (jsonObj.get("LoadBalancerStickyCookiePolicies") != null && !jsonObj.get("LoadBalancerStickyCookiePolicies").isJsonNull()) {
        JsonArray jsonArrayloadBalancerStickyCookiePolicies = jsonObj.getAsJsonArray("LoadBalancerStickyCookiePolicies");
        if (jsonArrayloadBalancerStickyCookiePolicies != null) {
          // ensure the json data is an array
          if (!jsonObj.get("LoadBalancerStickyCookiePolicies").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `LoadBalancerStickyCookiePolicies` to be an array in the JSON string but got `%s`", jsonObj.get("LoadBalancerStickyCookiePolicies").toString()));
          }

          // validate the optional field `LoadBalancerStickyCookiePolicies` (array)
          for (int i = 0; i < jsonArrayloadBalancerStickyCookiePolicies.size(); i++) {
            LoadBalancerStickyCookiePolicy.validateJsonObject(jsonArrayloadBalancerStickyCookiePolicies.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("LoadBalancerType") != null && !jsonObj.get("LoadBalancerType").isJsonNull()) && !jsonObj.get("LoadBalancerType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoadBalancerType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoadBalancerType").toString()));
      }
      if ((jsonObj.get("NetId") != null && !jsonObj.get("NetId").isJsonNull()) && !jsonObj.get("NetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NetId").toString()));
      }
      if ((jsonObj.get("PublicIp") != null && !jsonObj.get("PublicIp").isJsonNull()) && !jsonObj.get("PublicIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PublicIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PublicIp").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("SecurityGroups") != null && !jsonObj.get("SecurityGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecurityGroups` to be an array in the JSON string but got `%s`", jsonObj.get("SecurityGroups").toString()));
      }
      // validate the optional field `SourceSecurityGroup`
      if (jsonObj.get("SourceSecurityGroup") != null && !jsonObj.get("SourceSecurityGroup").isJsonNull()) {
        SourceSecurityGroup.validateJsonObject(jsonObj.getAsJsonObject("SourceSecurityGroup"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Subnets") != null && !jsonObj.get("Subnets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subnets` to be an array in the JSON string but got `%s`", jsonObj.get("Subnets").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("SubregionNames") != null && !jsonObj.get("SubregionNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubregionNames` to be an array in the JSON string but got `%s`", jsonObj.get("SubregionNames").toString()));
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
       if (!LoadBalancer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LoadBalancer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LoadBalancer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LoadBalancer.class));

       return (TypeAdapter<T>) new TypeAdapter<LoadBalancer>() {
           @Override
           public void write(JsonWriter out, LoadBalancer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LoadBalancer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LoadBalancer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LoadBalancer
  * @throws IOException if the JSON string is invalid with respect to LoadBalancer
  */
  public static LoadBalancer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LoadBalancer.class);
  }

 /**
  * Convert an instance of LoadBalancer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


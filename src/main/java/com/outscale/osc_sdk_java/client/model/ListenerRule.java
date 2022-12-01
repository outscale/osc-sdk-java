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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Information about the listener rule.
 */
@ApiModel(description = "Information about the listener rule.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class ListenerRule {
  public static final String SERIALIZED_NAME_ACTION = "Action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_HOST_NAME_PATTERN = "HostNamePattern";
  @SerializedName(SERIALIZED_NAME_HOST_NAME_PATTERN)
  private String hostNamePattern;

  public static final String SERIALIZED_NAME_LISTENER_ID = "ListenerId";
  @SerializedName(SERIALIZED_NAME_LISTENER_ID)
  private Integer listenerId;

  public static final String SERIALIZED_NAME_LISTENER_RULE_ID = "ListenerRuleId";
  @SerializedName(SERIALIZED_NAME_LISTENER_RULE_ID)
  private Integer listenerRuleId;

  public static final String SERIALIZED_NAME_LISTENER_RULE_NAME = "ListenerRuleName";
  @SerializedName(SERIALIZED_NAME_LISTENER_RULE_NAME)
  private String listenerRuleName;

  public static final String SERIALIZED_NAME_PATH_PATTERN = "PathPattern";
  @SerializedName(SERIALIZED_NAME_PATH_PATTERN)
  private String pathPattern;

  public static final String SERIALIZED_NAME_PRIORITY = "Priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_VM_IDS = "VmIds";
  @SerializedName(SERIALIZED_NAME_VM_IDS)
  private List<String> vmIds = null;


  public ListenerRule action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * The type of action for the rule (always &#x60;forward&#x60;).
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of action for the rule (always `forward`).")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public ListenerRule hostNamePattern(String hostNamePattern) {
    
    this.hostNamePattern = hostNamePattern;
    return this;
  }

   /**
   * A host-name pattern for the rule, with a maximum length of 128 characters. This host-name pattern supports maximum three wildcards, and must not contain any special characters except [-.?].
   * @return hostNamePattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A host-name pattern for the rule, with a maximum length of 128 characters. This host-name pattern supports maximum three wildcards, and must not contain any special characters except [-.?].")

  public String getHostNamePattern() {
    return hostNamePattern;
  }


  public void setHostNamePattern(String hostNamePattern) {
    this.hostNamePattern = hostNamePattern;
  }


  public ListenerRule listenerId(Integer listenerId) {
    
    this.listenerId = listenerId;
    return this;
  }

   /**
   * The ID of the listener.
   * @return listenerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the listener.")

  public Integer getListenerId() {
    return listenerId;
  }


  public void setListenerId(Integer listenerId) {
    this.listenerId = listenerId;
  }


  public ListenerRule listenerRuleId(Integer listenerRuleId) {
    
    this.listenerRuleId = listenerRuleId;
    return this;
  }

   /**
   * The ID of the listener rule.
   * @return listenerRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the listener rule.")

  public Integer getListenerRuleId() {
    return listenerRuleId;
  }


  public void setListenerRuleId(Integer listenerRuleId) {
    this.listenerRuleId = listenerRuleId;
  }


  public ListenerRule listenerRuleName(String listenerRuleName) {
    
    this.listenerRuleName = listenerRuleName;
    return this;
  }

   /**
   * A human-readable name for the listener rule.
   * @return listenerRuleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable name for the listener rule.")

  public String getListenerRuleName() {
    return listenerRuleName;
  }


  public void setListenerRuleName(String listenerRuleName) {
    this.listenerRuleName = listenerRuleName;
  }


  public ListenerRule pathPattern(String pathPattern) {
    
    this.pathPattern = pathPattern;
    return this;
  }

   /**
   * A path pattern for the rule, with a maximum length of 128 characters. This path pattern supports maximum three wildcards, and must not contain any special characters except [_-.$/~&amp;quot;&#39;@:+?].
   * @return pathPattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A path pattern for the rule, with a maximum length of 128 characters. This path pattern supports maximum three wildcards, and must not contain any special characters except [_-.$/~&quot;'@:+?].")

  public String getPathPattern() {
    return pathPattern;
  }


  public void setPathPattern(String pathPattern) {
    this.pathPattern = pathPattern;
  }


  public ListenerRule priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * The priority level of the listener rule, between &#x60;1&#x60; and &#x60;19999&#x60; both included. Each rule must have a unique priority level. Otherwise, an error is returned.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The priority level of the listener rule, between `1` and `19999` both included. Each rule must have a unique priority level. Otherwise, an error is returned.")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public ListenerRule vmIds(List<String> vmIds) {
    
    this.vmIds = vmIds;
    return this;
  }

  public ListenerRule addVmIdsItem(String vmIdsItem) {
    if (this.vmIds == null) {
      this.vmIds = new ArrayList<String>();
    }
    this.vmIds.add(vmIdsItem);
    return this;
  }

   /**
   * The IDs of the backend VMs.
   * @return vmIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the backend VMs.")

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
    ListenerRule listenerRule = (ListenerRule) o;
    return Objects.equals(this.action, listenerRule.action) &&
        Objects.equals(this.hostNamePattern, listenerRule.hostNamePattern) &&
        Objects.equals(this.listenerId, listenerRule.listenerId) &&
        Objects.equals(this.listenerRuleId, listenerRule.listenerRuleId) &&
        Objects.equals(this.listenerRuleName, listenerRule.listenerRuleName) &&
        Objects.equals(this.pathPattern, listenerRule.pathPattern) &&
        Objects.equals(this.priority, listenerRule.priority) &&
        Objects.equals(this.vmIds, listenerRule.vmIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, hostNamePattern, listenerId, listenerRuleId, listenerRuleName, pathPattern, priority, vmIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListenerRule {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    hostNamePattern: ").append(toIndentedString(hostNamePattern)).append("\n");
    sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
    sb.append("    listenerRuleId: ").append(toIndentedString(listenerRuleId)).append("\n");
    sb.append("    listenerRuleName: ").append(toIndentedString(listenerRuleName)).append("\n");
    sb.append("    pathPattern: ").append(toIndentedString(pathPattern)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

}


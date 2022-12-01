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

/**
 * Information about the DirectLink interfaces.
 */
@ApiModel(description = "Information about the DirectLink interfaces.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class DirectLinkInterfaces {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_BGP_ASN = "BgpAsn";
  @SerializedName(SERIALIZED_NAME_BGP_ASN)
  private Integer bgpAsn;

  public static final String SERIALIZED_NAME_BGP_KEY = "BgpKey";
  @SerializedName(SERIALIZED_NAME_BGP_KEY)
  private String bgpKey;

  public static final String SERIALIZED_NAME_CLIENT_PRIVATE_IP = "ClientPrivateIp";
  @SerializedName(SERIALIZED_NAME_CLIENT_PRIVATE_IP)
  private String clientPrivateIp;

  public static final String SERIALIZED_NAME_DIRECT_LINK_ID = "DirectLinkId";
  @SerializedName(SERIALIZED_NAME_DIRECT_LINK_ID)
  private String directLinkId;

  public static final String SERIALIZED_NAME_DIRECT_LINK_INTERFACE_ID = "DirectLinkInterfaceId";
  @SerializedName(SERIALIZED_NAME_DIRECT_LINK_INTERFACE_ID)
  private String directLinkInterfaceId;

  public static final String SERIALIZED_NAME_DIRECT_LINK_INTERFACE_NAME = "DirectLinkInterfaceName";
  @SerializedName(SERIALIZED_NAME_DIRECT_LINK_INTERFACE_NAME)
  private String directLinkInterfaceName;

  public static final String SERIALIZED_NAME_INTERFACE_TYPE = "InterfaceType";
  @SerializedName(SERIALIZED_NAME_INTERFACE_TYPE)
  private String interfaceType;

  public static final String SERIALIZED_NAME_LOCATION = "Location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_MTU = "Mtu";
  @SerializedName(SERIALIZED_NAME_MTU)
  private Integer mtu;

  public static final String SERIALIZED_NAME_OUTSCALE_PRIVATE_IP = "OutscalePrivateIp";
  @SerializedName(SERIALIZED_NAME_OUTSCALE_PRIVATE_IP)
  private String outscalePrivateIp;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_VIRTUAL_GATEWAY_ID = "VirtualGatewayId";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_GATEWAY_ID)
  private String virtualGatewayId;

  public static final String SERIALIZED_NAME_VLAN = "Vlan";
  @SerializedName(SERIALIZED_NAME_VLAN)
  private Integer vlan;


  public DirectLinkInterfaces accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the owner of the DirectLink interface.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID of the owner of the DirectLink interface.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public DirectLinkInterfaces bgpAsn(Integer bgpAsn) {
    
    this.bgpAsn = bgpAsn;
    return this;
  }

   /**
   * The BGP (Border Gateway Protocol) ASN (Autonomous System Number) on the customer&#39;s side of the DirectLink interface.
   * @return bgpAsn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The BGP (Border Gateway Protocol) ASN (Autonomous System Number) on the customer's side of the DirectLink interface.")

  public Integer getBgpAsn() {
    return bgpAsn;
  }


  public void setBgpAsn(Integer bgpAsn) {
    this.bgpAsn = bgpAsn;
  }


  public DirectLinkInterfaces bgpKey(String bgpKey) {
    
    this.bgpKey = bgpKey;
    return this;
  }

   /**
   * The BGP authentication key.
   * @return bgpKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The BGP authentication key.")

  public String getBgpKey() {
    return bgpKey;
  }


  public void setBgpKey(String bgpKey) {
    this.bgpKey = bgpKey;
  }


  public DirectLinkInterfaces clientPrivateIp(String clientPrivateIp) {
    
    this.clientPrivateIp = clientPrivateIp;
    return this;
  }

   /**
   * The IP on the customer&#39;s side of the DirectLink interface.
   * @return clientPrivateIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP on the customer's side of the DirectLink interface.")

  public String getClientPrivateIp() {
    return clientPrivateIp;
  }


  public void setClientPrivateIp(String clientPrivateIp) {
    this.clientPrivateIp = clientPrivateIp;
  }


  public DirectLinkInterfaces directLinkId(String directLinkId) {
    
    this.directLinkId = directLinkId;
    return this;
  }

   /**
   * The ID of the DirectLink.
   * @return directLinkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the DirectLink.")

  public String getDirectLinkId() {
    return directLinkId;
  }


  public void setDirectLinkId(String directLinkId) {
    this.directLinkId = directLinkId;
  }


  public DirectLinkInterfaces directLinkInterfaceId(String directLinkInterfaceId) {
    
    this.directLinkInterfaceId = directLinkInterfaceId;
    return this;
  }

   /**
   * The ID of the DirectLink interface.
   * @return directLinkInterfaceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the DirectLink interface.")

  public String getDirectLinkInterfaceId() {
    return directLinkInterfaceId;
  }


  public void setDirectLinkInterfaceId(String directLinkInterfaceId) {
    this.directLinkInterfaceId = directLinkInterfaceId;
  }


  public DirectLinkInterfaces directLinkInterfaceName(String directLinkInterfaceName) {
    
    this.directLinkInterfaceName = directLinkInterfaceName;
    return this;
  }

   /**
   * The name of the DirectLink interface.
   * @return directLinkInterfaceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the DirectLink interface.")

  public String getDirectLinkInterfaceName() {
    return directLinkInterfaceName;
  }


  public void setDirectLinkInterfaceName(String directLinkInterfaceName) {
    this.directLinkInterfaceName = directLinkInterfaceName;
  }


  public DirectLinkInterfaces interfaceType(String interfaceType) {
    
    this.interfaceType = interfaceType;
    return this;
  }

   /**
   * The type of the DirectLink interface (always &#x60;private&#x60;).
   * @return interfaceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the DirectLink interface (always `private`).")

  public String getInterfaceType() {
    return interfaceType;
  }


  public void setInterfaceType(String interfaceType) {
    this.interfaceType = interfaceType;
  }


  public DirectLinkInterfaces location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * The datacenter where the DirectLink interface is located.
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The datacenter where the DirectLink interface is located.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public DirectLinkInterfaces mtu(Integer mtu) {
    
    this.mtu = mtu;
    return this;
  }

   /**
   * The maximum transmission unit (MTU) of the DirectLink interface, in bytes (by default, &#x60;1500&#x60;).
   * @return mtu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum transmission unit (MTU) of the DirectLink interface, in bytes (by default, `1500`).")

  public Integer getMtu() {
    return mtu;
  }


  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }


  public DirectLinkInterfaces outscalePrivateIp(String outscalePrivateIp) {
    
    this.outscalePrivateIp = outscalePrivateIp;
    return this;
  }

   /**
   * The IP on the OUTSCALE side of the DirectLink interface.
   * @return outscalePrivateIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP on the OUTSCALE side of the DirectLink interface.")

  public String getOutscalePrivateIp() {
    return outscalePrivateIp;
  }


  public void setOutscalePrivateIp(String outscalePrivateIp) {
    this.outscalePrivateIp = outscalePrivateIp;
  }


  public DirectLinkInterfaces state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the DirectLink interface (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;deleting&#x60; \\| &#x60;deleted&#x60; \\| &#x60;confirming&#x60; \\| &#x60;rejected&#x60; \\| &#x60;expired&#x60;).
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the DirectLink interface (`pending` \\| `available` \\| `deleting` \\| `deleted` \\| `confirming` \\| `rejected` \\| `expired`).")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public DirectLinkInterfaces virtualGatewayId(String virtualGatewayId) {
    
    this.virtualGatewayId = virtualGatewayId;
    return this;
  }

   /**
   * The ID of the target virtual gateway.
   * @return virtualGatewayId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the target virtual gateway.")

  public String getVirtualGatewayId() {
    return virtualGatewayId;
  }


  public void setVirtualGatewayId(String virtualGatewayId) {
    this.virtualGatewayId = virtualGatewayId;
  }


  public DirectLinkInterfaces vlan(Integer vlan) {
    
    this.vlan = vlan;
    return this;
  }

   /**
   * The VLAN number associated with the DirectLink interface.
   * @return vlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The VLAN number associated with the DirectLink interface.")

  public Integer getVlan() {
    return vlan;
  }


  public void setVlan(Integer vlan) {
    this.vlan = vlan;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectLinkInterfaces directLinkInterfaces = (DirectLinkInterfaces) o;
    return Objects.equals(this.accountId, directLinkInterfaces.accountId) &&
        Objects.equals(this.bgpAsn, directLinkInterfaces.bgpAsn) &&
        Objects.equals(this.bgpKey, directLinkInterfaces.bgpKey) &&
        Objects.equals(this.clientPrivateIp, directLinkInterfaces.clientPrivateIp) &&
        Objects.equals(this.directLinkId, directLinkInterfaces.directLinkId) &&
        Objects.equals(this.directLinkInterfaceId, directLinkInterfaces.directLinkInterfaceId) &&
        Objects.equals(this.directLinkInterfaceName, directLinkInterfaces.directLinkInterfaceName) &&
        Objects.equals(this.interfaceType, directLinkInterfaces.interfaceType) &&
        Objects.equals(this.location, directLinkInterfaces.location) &&
        Objects.equals(this.mtu, directLinkInterfaces.mtu) &&
        Objects.equals(this.outscalePrivateIp, directLinkInterfaces.outscalePrivateIp) &&
        Objects.equals(this.state, directLinkInterfaces.state) &&
        Objects.equals(this.virtualGatewayId, directLinkInterfaces.virtualGatewayId) &&
        Objects.equals(this.vlan, directLinkInterfaces.vlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bgpAsn, bgpKey, clientPrivateIp, directLinkId, directLinkInterfaceId, directLinkInterfaceName, interfaceType, location, mtu, outscalePrivateIp, state, virtualGatewayId, vlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectLinkInterfaces {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bgpAsn: ").append(toIndentedString(bgpAsn)).append("\n");
    sb.append("    bgpKey: ").append(toIndentedString(bgpKey)).append("\n");
    sb.append("    clientPrivateIp: ").append(toIndentedString(clientPrivateIp)).append("\n");
    sb.append("    directLinkId: ").append(toIndentedString(directLinkId)).append("\n");
    sb.append("    directLinkInterfaceId: ").append(toIndentedString(directLinkInterfaceId)).append("\n");
    sb.append("    directLinkInterfaceName: ").append(toIndentedString(directLinkInterfaceName)).append("\n");
    sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
    sb.append("    outscalePrivateIp: ").append(toIndentedString(outscalePrivateIp)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    virtualGatewayId: ").append(toIndentedString(virtualGatewayId)).append("\n");
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
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


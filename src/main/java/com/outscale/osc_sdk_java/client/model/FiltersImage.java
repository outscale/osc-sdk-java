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
 * One or more filters.
 */
@ApiModel(description = "One or more filters.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-01T09:51:28.653202Z[Etc/UTC]")
public class FiltersImage {
  public static final String SERIALIZED_NAME_ACCOUNT_ALIASES = "AccountAliases";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ALIASES)
  private List<String> accountAliases = null;

  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "AccountIds";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = null;

  public static final String SERIALIZED_NAME_ARCHITECTURES = "Architectures";
  @SerializedName(SERIALIZED_NAME_ARCHITECTURES)
  private List<String> architectures = null;

  public static final String SERIALIZED_NAME_BLOCK_DEVICE_MAPPING_DELETE_ON_VM_DELETION = "BlockDeviceMappingDeleteOnVmDeletion";
  @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_MAPPING_DELETE_ON_VM_DELETION)
  private Boolean blockDeviceMappingDeleteOnVmDeletion;

  public static final String SERIALIZED_NAME_BLOCK_DEVICE_MAPPING_DEVICE_NAMES = "BlockDeviceMappingDeviceNames";
  @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_MAPPING_DEVICE_NAMES)
  private List<String> blockDeviceMappingDeviceNames = null;

  public static final String SERIALIZED_NAME_BLOCK_DEVICE_MAPPING_SNAPSHOT_IDS = "BlockDeviceMappingSnapshotIds";
  @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_MAPPING_SNAPSHOT_IDS)
  private List<String> blockDeviceMappingSnapshotIds = null;

  public static final String SERIALIZED_NAME_BLOCK_DEVICE_MAPPING_VOLUME_SIZES = "BlockDeviceMappingVolumeSizes";
  @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_MAPPING_VOLUME_SIZES)
  private List<Integer> blockDeviceMappingVolumeSizes = null;

  public static final String SERIALIZED_NAME_BLOCK_DEVICE_MAPPING_VOLUME_TYPES = "BlockDeviceMappingVolumeTypes";
  @SerializedName(SERIALIZED_NAME_BLOCK_DEVICE_MAPPING_VOLUME_TYPES)
  private List<String> blockDeviceMappingVolumeTypes = null;

  public static final String SERIALIZED_NAME_DESCRIPTIONS = "Descriptions";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIONS)
  private List<String> descriptions = null;

  public static final String SERIALIZED_NAME_FILE_LOCATIONS = "FileLocations";
  @SerializedName(SERIALIZED_NAME_FILE_LOCATIONS)
  private List<String> fileLocations = null;

  public static final String SERIALIZED_NAME_HYPERVISORS = "Hypervisors";
  @SerializedName(SERIALIZED_NAME_HYPERVISORS)
  private List<String> hypervisors = null;

  public static final String SERIALIZED_NAME_IMAGE_IDS = "ImageIds";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_IMAGE_NAMES = "ImageNames";
  @SerializedName(SERIALIZED_NAME_IMAGE_NAMES)
  private List<String> imageNames = null;

  public static final String SERIALIZED_NAME_PERMISSIONS_TO_LAUNCH_ACCOUNT_IDS = "PermissionsToLaunchAccountIds";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS_TO_LAUNCH_ACCOUNT_IDS)
  private List<String> permissionsToLaunchAccountIds = null;

  public static final String SERIALIZED_NAME_PERMISSIONS_TO_LAUNCH_GLOBAL_PERMISSION = "PermissionsToLaunchGlobalPermission";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS_TO_LAUNCH_GLOBAL_PERMISSION)
  private Boolean permissionsToLaunchGlobalPermission;

  public static final String SERIALIZED_NAME_PRODUCT_CODES = "ProductCodes";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODES)
  private List<String> productCodes = null;

  public static final String SERIALIZED_NAME_ROOT_DEVICE_NAMES = "RootDeviceNames";
  @SerializedName(SERIALIZED_NAME_ROOT_DEVICE_NAMES)
  private List<String> rootDeviceNames = null;

  public static final String SERIALIZED_NAME_ROOT_DEVICE_TYPES = "RootDeviceTypes";
  @SerializedName(SERIALIZED_NAME_ROOT_DEVICE_TYPES)
  private List<String> rootDeviceTypes = null;

  public static final String SERIALIZED_NAME_STATES = "States";
  @SerializedName(SERIALIZED_NAME_STATES)
  private List<String> states = null;

  public static final String SERIALIZED_NAME_TAG_KEYS = "TagKeys";
  @SerializedName(SERIALIZED_NAME_TAG_KEYS)
  private List<String> tagKeys = null;

  public static final String SERIALIZED_NAME_TAG_VALUES = "TagValues";
  @SerializedName(SERIALIZED_NAME_TAG_VALUES)
  private List<String> tagValues = null;

  public static final String SERIALIZED_NAME_TAGS = "Tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_VIRTUALIZATION_TYPES = "VirtualizationTypes";
  @SerializedName(SERIALIZED_NAME_VIRTUALIZATION_TYPES)
  private List<String> virtualizationTypes = null;


  public FiltersImage accountAliases(List<String> accountAliases) {
    
    this.accountAliases = accountAliases;
    return this;
  }

  public FiltersImage addAccountAliasesItem(String accountAliasesItem) {
    if (this.accountAliases == null) {
      this.accountAliases = new ArrayList<String>();
    }
    this.accountAliases.add(accountAliasesItem);
    return this;
  }

   /**
   * The account aliases of the owners of the OMIs.
   * @return accountAliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account aliases of the owners of the OMIs.")

  public List<String> getAccountAliases() {
    return accountAliases;
  }


  public void setAccountAliases(List<String> accountAliases) {
    this.accountAliases = accountAliases;
  }


  public FiltersImage accountIds(List<String> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public FiltersImage addAccountIdsItem(String accountIdsItem) {
    if (this.accountIds == null) {
      this.accountIds = new ArrayList<String>();
    }
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * The account IDs of the owners of the OMIs. By default, all the OMIs for which you have launch permissions are described.
   * @return accountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account IDs of the owners of the OMIs. By default, all the OMIs for which you have launch permissions are described.")

  public List<String> getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }


  public FiltersImage architectures(List<String> architectures) {
    
    this.architectures = architectures;
    return this;
  }

  public FiltersImage addArchitecturesItem(String architecturesItem) {
    if (this.architectures == null) {
      this.architectures = new ArrayList<String>();
    }
    this.architectures.add(architecturesItem);
    return this;
  }

   /**
   * The architectures of the OMIs (&#x60;i386&#x60; \\| &#x60;x86_64&#x60;).
   * @return architectures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The architectures of the OMIs (`i386` \\| `x86_64`).")

  public List<String> getArchitectures() {
    return architectures;
  }


  public void setArchitectures(List<String> architectures) {
    this.architectures = architectures;
  }


  public FiltersImage blockDeviceMappingDeleteOnVmDeletion(Boolean blockDeviceMappingDeleteOnVmDeletion) {
    
    this.blockDeviceMappingDeleteOnVmDeletion = blockDeviceMappingDeleteOnVmDeletion;
    return this;
  }

   /**
   * Whether the volumes are deleted or not when terminating the VM.
   * @return blockDeviceMappingDeleteOnVmDeletion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the volumes are deleted or not when terminating the VM.")

  public Boolean getBlockDeviceMappingDeleteOnVmDeletion() {
    return blockDeviceMappingDeleteOnVmDeletion;
  }


  public void setBlockDeviceMappingDeleteOnVmDeletion(Boolean blockDeviceMappingDeleteOnVmDeletion) {
    this.blockDeviceMappingDeleteOnVmDeletion = blockDeviceMappingDeleteOnVmDeletion;
  }


  public FiltersImage blockDeviceMappingDeviceNames(List<String> blockDeviceMappingDeviceNames) {
    
    this.blockDeviceMappingDeviceNames = blockDeviceMappingDeviceNames;
    return this;
  }

  public FiltersImage addBlockDeviceMappingDeviceNamesItem(String blockDeviceMappingDeviceNamesItem) {
    if (this.blockDeviceMappingDeviceNames == null) {
      this.blockDeviceMappingDeviceNames = new ArrayList<String>();
    }
    this.blockDeviceMappingDeviceNames.add(blockDeviceMappingDeviceNamesItem);
    return this;
  }

   /**
   * The device names for the volumes.
   * @return blockDeviceMappingDeviceNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The device names for the volumes.")

  public List<String> getBlockDeviceMappingDeviceNames() {
    return blockDeviceMappingDeviceNames;
  }


  public void setBlockDeviceMappingDeviceNames(List<String> blockDeviceMappingDeviceNames) {
    this.blockDeviceMappingDeviceNames = blockDeviceMappingDeviceNames;
  }


  public FiltersImage blockDeviceMappingSnapshotIds(List<String> blockDeviceMappingSnapshotIds) {
    
    this.blockDeviceMappingSnapshotIds = blockDeviceMappingSnapshotIds;
    return this;
  }

  public FiltersImage addBlockDeviceMappingSnapshotIdsItem(String blockDeviceMappingSnapshotIdsItem) {
    if (this.blockDeviceMappingSnapshotIds == null) {
      this.blockDeviceMappingSnapshotIds = new ArrayList<String>();
    }
    this.blockDeviceMappingSnapshotIds.add(blockDeviceMappingSnapshotIdsItem);
    return this;
  }

   /**
   * The IDs of the snapshots used to create the volumes.
   * @return blockDeviceMappingSnapshotIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the snapshots used to create the volumes.")

  public List<String> getBlockDeviceMappingSnapshotIds() {
    return blockDeviceMappingSnapshotIds;
  }


  public void setBlockDeviceMappingSnapshotIds(List<String> blockDeviceMappingSnapshotIds) {
    this.blockDeviceMappingSnapshotIds = blockDeviceMappingSnapshotIds;
  }


  public FiltersImage blockDeviceMappingVolumeSizes(List<Integer> blockDeviceMappingVolumeSizes) {
    
    this.blockDeviceMappingVolumeSizes = blockDeviceMappingVolumeSizes;
    return this;
  }

  public FiltersImage addBlockDeviceMappingVolumeSizesItem(Integer blockDeviceMappingVolumeSizesItem) {
    if (this.blockDeviceMappingVolumeSizes == null) {
      this.blockDeviceMappingVolumeSizes = new ArrayList<Integer>();
    }
    this.blockDeviceMappingVolumeSizes.add(blockDeviceMappingVolumeSizesItem);
    return this;
  }

   /**
   * The sizes of the volumes, in gibibytes (GiB).
   * @return blockDeviceMappingVolumeSizes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sizes of the volumes, in gibibytes (GiB).")

  public List<Integer> getBlockDeviceMappingVolumeSizes() {
    return blockDeviceMappingVolumeSizes;
  }


  public void setBlockDeviceMappingVolumeSizes(List<Integer> blockDeviceMappingVolumeSizes) {
    this.blockDeviceMappingVolumeSizes = blockDeviceMappingVolumeSizes;
  }


  public FiltersImage blockDeviceMappingVolumeTypes(List<String> blockDeviceMappingVolumeTypes) {
    
    this.blockDeviceMappingVolumeTypes = blockDeviceMappingVolumeTypes;
    return this;
  }

  public FiltersImage addBlockDeviceMappingVolumeTypesItem(String blockDeviceMappingVolumeTypesItem) {
    if (this.blockDeviceMappingVolumeTypes == null) {
      this.blockDeviceMappingVolumeTypes = new ArrayList<String>();
    }
    this.blockDeviceMappingVolumeTypes.add(blockDeviceMappingVolumeTypesItem);
    return this;
  }

   /**
   * The types of volumes (&#x60;standard&#x60; \\| &#x60;gp2&#x60; \\| &#x60;io1&#x60;).
   * @return blockDeviceMappingVolumeTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The types of volumes (`standard` \\| `gp2` \\| `io1`).")

  public List<String> getBlockDeviceMappingVolumeTypes() {
    return blockDeviceMappingVolumeTypes;
  }


  public void setBlockDeviceMappingVolumeTypes(List<String> blockDeviceMappingVolumeTypes) {
    this.blockDeviceMappingVolumeTypes = blockDeviceMappingVolumeTypes;
  }


  public FiltersImage descriptions(List<String> descriptions) {
    
    this.descriptions = descriptions;
    return this;
  }

  public FiltersImage addDescriptionsItem(String descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<String>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * The descriptions of the OMIs, provided when they were created.
   * @return descriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The descriptions of the OMIs, provided when they were created.")

  public List<String> getDescriptions() {
    return descriptions;
  }


  public void setDescriptions(List<String> descriptions) {
    this.descriptions = descriptions;
  }


  public FiltersImage fileLocations(List<String> fileLocations) {
    
    this.fileLocations = fileLocations;
    return this;
  }

  public FiltersImage addFileLocationsItem(String fileLocationsItem) {
    if (this.fileLocations == null) {
      this.fileLocations = new ArrayList<String>();
    }
    this.fileLocations.add(fileLocationsItem);
    return this;
  }

   /**
   * The locations of the buckets where the OMI files are stored.
   * @return fileLocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The locations of the buckets where the OMI files are stored.")

  public List<String> getFileLocations() {
    return fileLocations;
  }


  public void setFileLocations(List<String> fileLocations) {
    this.fileLocations = fileLocations;
  }


  public FiltersImage hypervisors(List<String> hypervisors) {
    
    this.hypervisors = hypervisors;
    return this;
  }

  public FiltersImage addHypervisorsItem(String hypervisorsItem) {
    if (this.hypervisors == null) {
      this.hypervisors = new ArrayList<String>();
    }
    this.hypervisors.add(hypervisorsItem);
    return this;
  }

   /**
   * The hypervisor type of the OMI (always &#x60;xen&#x60;).
   * @return hypervisors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hypervisor type of the OMI (always `xen`).")

  public List<String> getHypervisors() {
    return hypervisors;
  }


  public void setHypervisors(List<String> hypervisors) {
    this.hypervisors = hypervisors;
  }


  public FiltersImage imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public FiltersImage addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<String>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * The IDs of the OMIs.
   * @return imageIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IDs of the OMIs.")

  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public FiltersImage imageNames(List<String> imageNames) {
    
    this.imageNames = imageNames;
    return this;
  }

  public FiltersImage addImageNamesItem(String imageNamesItem) {
    if (this.imageNames == null) {
      this.imageNames = new ArrayList<String>();
    }
    this.imageNames.add(imageNamesItem);
    return this;
  }

   /**
   * The names of the OMIs, provided when they were created.
   * @return imageNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The names of the OMIs, provided when they were created.")

  public List<String> getImageNames() {
    return imageNames;
  }


  public void setImageNames(List<String> imageNames) {
    this.imageNames = imageNames;
  }


  public FiltersImage permissionsToLaunchAccountIds(List<String> permissionsToLaunchAccountIds) {
    
    this.permissionsToLaunchAccountIds = permissionsToLaunchAccountIds;
    return this;
  }

  public FiltersImage addPermissionsToLaunchAccountIdsItem(String permissionsToLaunchAccountIdsItem) {
    if (this.permissionsToLaunchAccountIds == null) {
      this.permissionsToLaunchAccountIds = new ArrayList<String>();
    }
    this.permissionsToLaunchAccountIds.add(permissionsToLaunchAccountIdsItem);
    return this;
  }

   /**
   * The account IDs of the users who have launch permissions for the OMIs.
   * @return permissionsToLaunchAccountIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account IDs of the users who have launch permissions for the OMIs.")

  public List<String> getPermissionsToLaunchAccountIds() {
    return permissionsToLaunchAccountIds;
  }


  public void setPermissionsToLaunchAccountIds(List<String> permissionsToLaunchAccountIds) {
    this.permissionsToLaunchAccountIds = permissionsToLaunchAccountIds;
  }


  public FiltersImage permissionsToLaunchGlobalPermission(Boolean permissionsToLaunchGlobalPermission) {
    
    this.permissionsToLaunchGlobalPermission = permissionsToLaunchGlobalPermission;
    return this;
  }

   /**
   * If true, lists all public OMIs. If false, lists all private OMIs.
   * @return permissionsToLaunchGlobalPermission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, lists all public OMIs. If false, lists all private OMIs.")

  public Boolean getPermissionsToLaunchGlobalPermission() {
    return permissionsToLaunchGlobalPermission;
  }


  public void setPermissionsToLaunchGlobalPermission(Boolean permissionsToLaunchGlobalPermission) {
    this.permissionsToLaunchGlobalPermission = permissionsToLaunchGlobalPermission;
  }


  public FiltersImage productCodes(List<String> productCodes) {
    
    this.productCodes = productCodes;
    return this;
  }

  public FiltersImage addProductCodesItem(String productCodesItem) {
    if (this.productCodes == null) {
      this.productCodes = new ArrayList<String>();
    }
    this.productCodes.add(productCodesItem);
    return this;
  }

   /**
   * The product code associated with the OMI (&#x60;0001&#x60; Linux/Unix \\| &#x60;0002&#x60; Windows \\| &#x60;0004&#x60; Linux/Oracle \\| &#x60;0005&#x60; Windows 10).
   * @return productCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The product code associated with the OMI (`0001` Linux/Unix \\| `0002` Windows \\| `0004` Linux/Oracle \\| `0005` Windows 10).")

  public List<String> getProductCodes() {
    return productCodes;
  }


  public void setProductCodes(List<String> productCodes) {
    this.productCodes = productCodes;
  }


  public FiltersImage rootDeviceNames(List<String> rootDeviceNames) {
    
    this.rootDeviceNames = rootDeviceNames;
    return this;
  }

  public FiltersImage addRootDeviceNamesItem(String rootDeviceNamesItem) {
    if (this.rootDeviceNames == null) {
      this.rootDeviceNames = new ArrayList<String>();
    }
    this.rootDeviceNames.add(rootDeviceNamesItem);
    return this;
  }

   /**
   * The name of the root device. This value must be /dev/sda1.
   * @return rootDeviceNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the root device. This value must be /dev/sda1.")

  public List<String> getRootDeviceNames() {
    return rootDeviceNames;
  }


  public void setRootDeviceNames(List<String> rootDeviceNames) {
    this.rootDeviceNames = rootDeviceNames;
  }


  public FiltersImage rootDeviceTypes(List<String> rootDeviceTypes) {
    
    this.rootDeviceTypes = rootDeviceTypes;
    return this;
  }

  public FiltersImage addRootDeviceTypesItem(String rootDeviceTypesItem) {
    if (this.rootDeviceTypes == null) {
      this.rootDeviceTypes = new ArrayList<String>();
    }
    this.rootDeviceTypes.add(rootDeviceTypesItem);
    return this;
  }

   /**
   * The types of root device used by the OMIs (always &#x60;bsu&#x60;).
   * @return rootDeviceTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The types of root device used by the OMIs (always `bsu`).")

  public List<String> getRootDeviceTypes() {
    return rootDeviceTypes;
  }


  public void setRootDeviceTypes(List<String> rootDeviceTypes) {
    this.rootDeviceTypes = rootDeviceTypes;
  }


  public FiltersImage states(List<String> states) {
    
    this.states = states;
    return this;
  }

  public FiltersImage addStatesItem(String statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<String>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * The states of the OMIs (&#x60;pending&#x60; \\| &#x60;available&#x60; \\| &#x60;failed&#x60;).
   * @return states
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The states of the OMIs (`pending` \\| `available` \\| `failed`).")

  public List<String> getStates() {
    return states;
  }


  public void setStates(List<String> states) {
    this.states = states;
  }


  public FiltersImage tagKeys(List<String> tagKeys) {
    
    this.tagKeys = tagKeys;
    return this;
  }

  public FiltersImage addTagKeysItem(String tagKeysItem) {
    if (this.tagKeys == null) {
      this.tagKeys = new ArrayList<String>();
    }
    this.tagKeys.add(tagKeysItem);
    return this;
  }

   /**
   * The keys of the tags associated with the OMIs.
   * @return tagKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The keys of the tags associated with the OMIs.")

  public List<String> getTagKeys() {
    return tagKeys;
  }


  public void setTagKeys(List<String> tagKeys) {
    this.tagKeys = tagKeys;
  }


  public FiltersImage tagValues(List<String> tagValues) {
    
    this.tagValues = tagValues;
    return this;
  }

  public FiltersImage addTagValuesItem(String tagValuesItem) {
    if (this.tagValues == null) {
      this.tagValues = new ArrayList<String>();
    }
    this.tagValues.add(tagValuesItem);
    return this;
  }

   /**
   * The values of the tags associated with the OMIs.
   * @return tagValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The values of the tags associated with the OMIs.")

  public List<String> getTagValues() {
    return tagValues;
  }


  public void setTagValues(List<String> tagValues) {
    this.tagValues = tagValues;
  }


  public FiltersImage tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public FiltersImage addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The key/value combination of the tags associated with the OMIs, in the following format: &amp;quot;Filters&amp;quot;:{&amp;quot;Tags&amp;quot;:[&amp;quot;TAGKEY&#x3D;TAGVALUE&amp;quot;]}.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key/value combination of the tags associated with the OMIs, in the following format: &quot;Filters&quot;:{&quot;Tags&quot;:[&quot;TAGKEY=TAGVALUE&quot;]}.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public FiltersImage virtualizationTypes(List<String> virtualizationTypes) {
    
    this.virtualizationTypes = virtualizationTypes;
    return this;
  }

  public FiltersImage addVirtualizationTypesItem(String virtualizationTypesItem) {
    if (this.virtualizationTypes == null) {
      this.virtualizationTypes = new ArrayList<String>();
    }
    this.virtualizationTypes.add(virtualizationTypesItem);
    return this;
  }

   /**
   * The virtualization types (always &#x60;hvm&#x60;).
   * @return virtualizationTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The virtualization types (always `hvm`).")

  public List<String> getVirtualizationTypes() {
    return virtualizationTypes;
  }


  public void setVirtualizationTypes(List<String> virtualizationTypes) {
    this.virtualizationTypes = virtualizationTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiltersImage filtersImage = (FiltersImage) o;
    return Objects.equals(this.accountAliases, filtersImage.accountAliases) &&
        Objects.equals(this.accountIds, filtersImage.accountIds) &&
        Objects.equals(this.architectures, filtersImage.architectures) &&
        Objects.equals(this.blockDeviceMappingDeleteOnVmDeletion, filtersImage.blockDeviceMappingDeleteOnVmDeletion) &&
        Objects.equals(this.blockDeviceMappingDeviceNames, filtersImage.blockDeviceMappingDeviceNames) &&
        Objects.equals(this.blockDeviceMappingSnapshotIds, filtersImage.blockDeviceMappingSnapshotIds) &&
        Objects.equals(this.blockDeviceMappingVolumeSizes, filtersImage.blockDeviceMappingVolumeSizes) &&
        Objects.equals(this.blockDeviceMappingVolumeTypes, filtersImage.blockDeviceMappingVolumeTypes) &&
        Objects.equals(this.descriptions, filtersImage.descriptions) &&
        Objects.equals(this.fileLocations, filtersImage.fileLocations) &&
        Objects.equals(this.hypervisors, filtersImage.hypervisors) &&
        Objects.equals(this.imageIds, filtersImage.imageIds) &&
        Objects.equals(this.imageNames, filtersImage.imageNames) &&
        Objects.equals(this.permissionsToLaunchAccountIds, filtersImage.permissionsToLaunchAccountIds) &&
        Objects.equals(this.permissionsToLaunchGlobalPermission, filtersImage.permissionsToLaunchGlobalPermission) &&
        Objects.equals(this.productCodes, filtersImage.productCodes) &&
        Objects.equals(this.rootDeviceNames, filtersImage.rootDeviceNames) &&
        Objects.equals(this.rootDeviceTypes, filtersImage.rootDeviceTypes) &&
        Objects.equals(this.states, filtersImage.states) &&
        Objects.equals(this.tagKeys, filtersImage.tagKeys) &&
        Objects.equals(this.tagValues, filtersImage.tagValues) &&
        Objects.equals(this.tags, filtersImage.tags) &&
        Objects.equals(this.virtualizationTypes, filtersImage.virtualizationTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountAliases, accountIds, architectures, blockDeviceMappingDeleteOnVmDeletion, blockDeviceMappingDeviceNames, blockDeviceMappingSnapshotIds, blockDeviceMappingVolumeSizes, blockDeviceMappingVolumeTypes, descriptions, fileLocations, hypervisors, imageIds, imageNames, permissionsToLaunchAccountIds, permissionsToLaunchGlobalPermission, productCodes, rootDeviceNames, rootDeviceTypes, states, tagKeys, tagValues, tags, virtualizationTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiltersImage {\n");
    sb.append("    accountAliases: ").append(toIndentedString(accountAliases)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
    sb.append("    architectures: ").append(toIndentedString(architectures)).append("\n");
    sb.append("    blockDeviceMappingDeleteOnVmDeletion: ").append(toIndentedString(blockDeviceMappingDeleteOnVmDeletion)).append("\n");
    sb.append("    blockDeviceMappingDeviceNames: ").append(toIndentedString(blockDeviceMappingDeviceNames)).append("\n");
    sb.append("    blockDeviceMappingSnapshotIds: ").append(toIndentedString(blockDeviceMappingSnapshotIds)).append("\n");
    sb.append("    blockDeviceMappingVolumeSizes: ").append(toIndentedString(blockDeviceMappingVolumeSizes)).append("\n");
    sb.append("    blockDeviceMappingVolumeTypes: ").append(toIndentedString(blockDeviceMappingVolumeTypes)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    fileLocations: ").append(toIndentedString(fileLocations)).append("\n");
    sb.append("    hypervisors: ").append(toIndentedString(hypervisors)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    imageNames: ").append(toIndentedString(imageNames)).append("\n");
    sb.append("    permissionsToLaunchAccountIds: ").append(toIndentedString(permissionsToLaunchAccountIds)).append("\n");
    sb.append("    permissionsToLaunchGlobalPermission: ").append(toIndentedString(permissionsToLaunchGlobalPermission)).append("\n");
    sb.append("    productCodes: ").append(toIndentedString(productCodes)).append("\n");
    sb.append("    rootDeviceNames: ").append(toIndentedString(rootDeviceNames)).append("\n");
    sb.append("    rootDeviceTypes: ").append(toIndentedString(rootDeviceTypes)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
    sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    virtualizationTypes: ").append(toIndentedString(virtualizationTypes)).append("\n");
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


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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.outscale.osc_sdk_java.client.model.BlockDeviceMappingCreated;
import com.outscale.osc_sdk_java.client.model.NicLight;
import com.outscale.osc_sdk_java.client.model.Placement;
import com.outscale.osc_sdk_java.client.model.ResourceTag;
import com.outscale.osc_sdk_java.client.model.SecurityGroupLight;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for Vm
 */
public class VmTest {
    private final Vm model = new Vm();

    /**
     * Model tests for Vm
     */
    @Test
    public void testVm() {
        // TODO: test Vm
    }

    /**
     * Test the property 'architecture'
     */
    @Test
    public void architectureTest() {
        // TODO: test architecture
    }

    /**
     * Test the property 'blockDeviceMappings'
     */
    @Test
    public void blockDeviceMappingsTest() {
        // TODO: test blockDeviceMappings
    }

    /**
     * Test the property 'bsuOptimized'
     */
    @Test
    public void bsuOptimizedTest() {
        // TODO: test bsuOptimized
    }

    /**
     * Test the property 'clientToken'
     */
    @Test
    public void clientTokenTest() {
        // TODO: test clientToken
    }

    /**
     * Test the property 'creationDate'
     */
    @Test
    public void creationDateTest() {
        // TODO: test creationDate
    }

    /**
     * Test the property 'deletionProtection'
     */
    @Test
    public void deletionProtectionTest() {
        // TODO: test deletionProtection
    }

    /**
     * Test the property 'hypervisor'
     */
    @Test
    public void hypervisorTest() {
        // TODO: test hypervisor
    }

    /**
     * Test the property 'imageId'
     */
    @Test
    public void imageIdTest() {
        // TODO: test imageId
    }

    /**
     * Test the property 'isSourceDestChecked'
     */
    @Test
    public void isSourceDestCheckedTest() {
        // TODO: test isSourceDestChecked
    }

    /**
     * Test the property 'keypairName'
     */
    @Test
    public void keypairNameTest() {
        // TODO: test keypairName
    }

    /**
     * Test the property 'launchNumber'
     */
    @Test
    public void launchNumberTest() {
        // TODO: test launchNumber
    }

    /**
     * Test the property 'nestedVirtualization'
     */
    @Test
    public void nestedVirtualizationTest() {
        // TODO: test nestedVirtualization
    }

    /**
     * Test the property 'netId'
     */
    @Test
    public void netIdTest() {
        // TODO: test netId
    }

    /**
     * Test the property 'nics'
     */
    @Test
    public void nicsTest() {
        // TODO: test nics
    }

    /**
     * Test the property 'osFamily'
     */
    @Test
    public void osFamilyTest() {
        // TODO: test osFamily
    }

    /**
     * Test the property 'performance'
     */
    @Test
    public void performanceTest() {
        // TODO: test performance
    }

    /**
     * Test the property 'placement'
     */
    @Test
    public void placementTest() {
        // TODO: test placement
    }

    /**
     * Test the property 'privateDnsName'
     */
    @Test
    public void privateDnsNameTest() {
        // TODO: test privateDnsName
    }

    /**
     * Test the property 'privateIp'
     */
    @Test
    public void privateIpTest() {
        // TODO: test privateIp
    }

    /**
     * Test the property 'productCodes'
     */
    @Test
    public void productCodesTest() {
        // TODO: test productCodes
    }

    /**
     * Test the property 'publicDnsName'
     */
    @Test
    public void publicDnsNameTest() {
        // TODO: test publicDnsName
    }

    /**
     * Test the property 'publicIp'
     */
    @Test
    public void publicIpTest() {
        // TODO: test publicIp
    }

    /**
     * Test the property 'reservationId'
     */
    @Test
    public void reservationIdTest() {
        // TODO: test reservationId
    }

    /**
     * Test the property 'rootDeviceName'
     */
    @Test
    public void rootDeviceNameTest() {
        // TODO: test rootDeviceName
    }

    /**
     * Test the property 'rootDeviceType'
     */
    @Test
    public void rootDeviceTypeTest() {
        // TODO: test rootDeviceType
    }

    /**
     * Test the property 'securityGroups'
     */
    @Test
    public void securityGroupsTest() {
        // TODO: test securityGroups
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'stateReason'
     */
    @Test
    public void stateReasonTest() {
        // TODO: test stateReason
    }

    /**
     * Test the property 'subnetId'
     */
    @Test
    public void subnetIdTest() {
        // TODO: test subnetId
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'userData'
     */
    @Test
    public void userDataTest() {
        // TODO: test userData
    }

    /**
     * Test the property 'vmId'
     */
    @Test
    public void vmIdTest() {
        // TODO: test vmId
    }

    /**
     * Test the property 'vmInitiatedShutdownBehavior'
     */
    @Test
    public void vmInitiatedShutdownBehaviorTest() {
        // TODO: test vmInitiatedShutdownBehavior
    }

    /**
     * Test the property 'vmType'
     */
    @Test
    public void vmTypeTest() {
        // TODO: test vmType
    }

}

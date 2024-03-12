/*
 * 3DS OUTSCALE API
 * Welcome to the OUTSCALE API documentation.<br /> The OUTSCALE API enables you to manage your resources in the OUTSCALE Cloud. This documentation describes the different actions available along with code examples.<br /><br /> Throttling: To protect against overloads, the number of identical requests allowed in a given time period is limited.<br /> Brute force: To protect against brute force attacks, the number of failed authentication attempts in a given time period is limited.<br /><br /> You can learn more about errors returned by the API in the dedicated [errors page](api/errors).<br /><br /> Note that the OUTSCALE Cloud is compatible with Amazon Web Services (AWS) APIs, but there are [differences in resource names](https://docs.outscale.com/en/userguide/OUTSCALE-APIs-Reference.html) between AWS and the OUTSCALE API.<br /> You can also manage your resources using the [Cockpit](https://docs.outscale.com/en/userguide/About-Cockpit.html) web interface.<br /><br /> An OpenAPI description of the OUTSCALE API is also available in this [GitHub repository](https://github.com/outscale/osc-api).<br /> # Authentication Schemes ### Access Key/Secret Key The main way to authenticate your requests to the OUTSCALE API is to use an access key and a secret key.<br /> The mechanism behind this is based on AWS Signature Version 4, whose technical implementation details are described in [Signature of API Requests](https://docs.outscale.com/en/userguide/Signature-of-API-Requests.html).<br /><br /> In practice, the way to specify your access key and secret key depends on the tool or SDK you want to use to interact with the API.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify your access key, secret key, and the Region of your account. > 2. You then specify the `--profile` option when executing OSC CLI commands. >  > For more information, see [Installing and Configuring OSC CLI](https://docs.outscale.com/en/userguide/Installing-and-Configuring-OSC-CLI.html).  See the code samples in each section of this documentation for specific examples in different programming languages.<br /> For more information about access keys, see [About Access Keys](https://docs.outscale.com/en/userguide/About-Access-Keys.html). ### Login/Password For certain API actions, you can also use basic authentication with the login (email address) and password of your TINA account.<br /> This is useful only in special circumstances, for example if you do not know your access key/secret key and want to retrieve them programmatically.<br /> In most cases, however, you can use the Cockpit web interface to retrieve them.<br />  > For example, if you use OSC CLI: > 1. You need to create an **~/.osc/config.json** file to specify the Region of your account, but you leave the access key value and secret key value empty (`&quot;&quot;`). > 2. You then specify the `--profile`, `--authentication-method`, `--login`, and `--password` options when executing OSC CLI commands.  See the code samples in each section of this documentation for specific examples in different programming languages. ### No Authentication A few API actions do not require any authentication. They are indicated as such in this documentation.<br /> ### Other Security Mechanisms In parallel with the authentication schemes, you can add other security mechanisms to your OUTSCALE account, for example to restrict API requests by IP or other criteria.<br /> For more information, see [Managing Your API Accesses](https://docs.outscale.com/en/userguide/Managing-Your-API-Accesses.html).
 *
 * The version of the OpenAPI document: 1.28.7
 * Contact: support@outscale.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.outscale.osc_sdk_java.client.model;

import org.junit.jupiter.api.Test;

/** Model tests for FiltersNic */
public class FiltersNicTest {
    private final FiltersNic model = new FiltersNic();

    /** Model tests for FiltersNic */
    @Test
    public void testFiltersNic() {
        // TODO: test FiltersNic
    }

    /** Test the property 'descriptions' */
    @Test
    public void descriptionsTest() {
        // TODO: test descriptions
    }

    /** Test the property 'isSourceDestCheck' */
    @Test
    public void isSourceDestCheckTest() {
        // TODO: test isSourceDestCheck
    }

    /** Test the property 'linkNicDeleteOnVmDeletion' */
    @Test
    public void linkNicDeleteOnVmDeletionTest() {
        // TODO: test linkNicDeleteOnVmDeletion
    }

    /** Test the property 'linkNicDeviceNumbers' */
    @Test
    public void linkNicDeviceNumbersTest() {
        // TODO: test linkNicDeviceNumbers
    }

    /** Test the property 'linkNicLinkNicIds' */
    @Test
    public void linkNicLinkNicIdsTest() {
        // TODO: test linkNicLinkNicIds
    }

    /** Test the property 'linkNicStates' */
    @Test
    public void linkNicStatesTest() {
        // TODO: test linkNicStates
    }

    /** Test the property 'linkNicVmAccountIds' */
    @Test
    public void linkNicVmAccountIdsTest() {
        // TODO: test linkNicVmAccountIds
    }

    /** Test the property 'linkNicVmIds' */
    @Test
    public void linkNicVmIdsTest() {
        // TODO: test linkNicVmIds
    }

    /** Test the property 'linkPublicIpAccountIds' */
    @Test
    public void linkPublicIpAccountIdsTest() {
        // TODO: test linkPublicIpAccountIds
    }

    /** Test the property 'linkPublicIpLinkPublicIpIds' */
    @Test
    public void linkPublicIpLinkPublicIpIdsTest() {
        // TODO: test linkPublicIpLinkPublicIpIds
    }

    /** Test the property 'linkPublicIpPublicIpIds' */
    @Test
    public void linkPublicIpPublicIpIdsTest() {
        // TODO: test linkPublicIpPublicIpIds
    }

    /** Test the property 'linkPublicIpPublicIps' */
    @Test
    public void linkPublicIpPublicIpsTest() {
        // TODO: test linkPublicIpPublicIps
    }

    /** Test the property 'macAddresses' */
    @Test
    public void macAddressesTest() {
        // TODO: test macAddresses
    }

    /** Test the property 'netIds' */
    @Test
    public void netIdsTest() {
        // TODO: test netIds
    }

    /** Test the property 'nicIds' */
    @Test
    public void nicIdsTest() {
        // TODO: test nicIds
    }

    /** Test the property 'privateDnsNames' */
    @Test
    public void privateDnsNamesTest() {
        // TODO: test privateDnsNames
    }

    /** Test the property 'privateIpsLinkPublicIpAccountIds' */
    @Test
    public void privateIpsLinkPublicIpAccountIdsTest() {
        // TODO: test privateIpsLinkPublicIpAccountIds
    }

    /** Test the property 'privateIpsLinkPublicIpPublicIps' */
    @Test
    public void privateIpsLinkPublicIpPublicIpsTest() {
        // TODO: test privateIpsLinkPublicIpPublicIps
    }

    /** Test the property 'privateIpsPrimaryIp' */
    @Test
    public void privateIpsPrimaryIpTest() {
        // TODO: test privateIpsPrimaryIp
    }

    /** Test the property 'privateIpsPrivateIps' */
    @Test
    public void privateIpsPrivateIpsTest() {
        // TODO: test privateIpsPrivateIps
    }

    /** Test the property 'securityGroupIds' */
    @Test
    public void securityGroupIdsTest() {
        // TODO: test securityGroupIds
    }

    /** Test the property 'securityGroupNames' */
    @Test
    public void securityGroupNamesTest() {
        // TODO: test securityGroupNames
    }

    /** Test the property 'states' */
    @Test
    public void statesTest() {
        // TODO: test states
    }

    /** Test the property 'subnetIds' */
    @Test
    public void subnetIdsTest() {
        // TODO: test subnetIds
    }

    /** Test the property 'subregionNames' */
    @Test
    public void subregionNamesTest() {
        // TODO: test subregionNames
    }

    /** Test the property 'tagKeys' */
    @Test
    public void tagKeysTest() {
        // TODO: test tagKeys
    }

    /** Test the property 'tagValues' */
    @Test
    public void tagValuesTest() {
        // TODO: test tagValues
    }

    /** Test the property 'tags' */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }
}

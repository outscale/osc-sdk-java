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

package io.github.outscale.osc_sdk_java.client.api;

import io.github.outscale.osc_sdk_java.client.ApiException;
import io.github.outscale.osc_sdk_java.client.model.CreateVirtualGatewayRequest;
import io.github.outscale.osc_sdk_java.client.model.CreateVirtualGatewayResponse;
import io.github.outscale.osc_sdk_java.client.model.DeleteVirtualGatewayRequest;
import io.github.outscale.osc_sdk_java.client.model.DeleteVirtualGatewayResponse;
import io.github.outscale.osc_sdk_java.client.model.LinkVirtualGatewayRequest;
import io.github.outscale.osc_sdk_java.client.model.LinkVirtualGatewayResponse;
import io.github.outscale.osc_sdk_java.client.model.ReadVirtualGatewaysRequest;
import io.github.outscale.osc_sdk_java.client.model.ReadVirtualGatewaysResponse;
import io.github.outscale.osc_sdk_java.client.model.UnlinkVirtualGatewayRequest;
import io.github.outscale.osc_sdk_java.client.model.UnlinkVirtualGatewayResponse;
import io.github.outscale.osc_sdk_java.client.model.UpdateRoutePropagationRequest;
import io.github.outscale.osc_sdk_java.client.model.UpdateRoutePropagationResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/** API tests for VirtualGatewayApi */
@Disabled
public class VirtualGatewayApiTest {

    private final VirtualGatewayApi api = new VirtualGatewayApi();

    /** @throws ApiException if the Api call fails */
    @Test
    public void createVirtualGatewayTest() throws ApiException {
        CreateVirtualGatewayRequest createVirtualGatewayRequest = null;
        CreateVirtualGatewayResponse response =
                api.createVirtualGateway(createVirtualGatewayRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void deleteVirtualGatewayTest() throws ApiException {
        DeleteVirtualGatewayRequest deleteVirtualGatewayRequest = null;
        DeleteVirtualGatewayResponse response =
                api.deleteVirtualGateway(deleteVirtualGatewayRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void linkVirtualGatewayTest() throws ApiException {
        LinkVirtualGatewayRequest linkVirtualGatewayRequest = null;
        LinkVirtualGatewayResponse response = api.linkVirtualGateway(linkVirtualGatewayRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void readVirtualGatewaysTest() throws ApiException {
        ReadVirtualGatewaysRequest readVirtualGatewaysRequest = null;
        ReadVirtualGatewaysResponse response = api.readVirtualGateways(readVirtualGatewaysRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void unlinkVirtualGatewayTest() throws ApiException {
        UnlinkVirtualGatewayRequest unlinkVirtualGatewayRequest = null;
        UnlinkVirtualGatewayResponse response =
                api.unlinkVirtualGateway(unlinkVirtualGatewayRequest);
        // TODO: test validations
    }

    /** @throws ApiException if the Api call fails */
    @Test
    public void updateRoutePropagationTest() throws ApiException {
        UpdateRoutePropagationRequest updateRoutePropagationRequest = null;
        UpdateRoutePropagationResponse response =
                api.updateRoutePropagation(updateRoutePropagationRequest);
        // TODO: test validations
    }
}

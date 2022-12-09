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

package io.github.outscale.osc_sdk_java.client;

import java.util.Collection;
import java.util.Iterator;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StringUtil {
    /**
     * Check if the given array contains the given value (with case-insensitive comparison).
     *
     * @param array The array
     * @param value The value to search
     * @return true if the array contains the value
     */
    public static boolean containsIgnoreCase(String[] array, String value) {
        for (String str : array) {
            if (value == null && str == null) {
                return true;
            }
            if (value != null && value.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Join an array of strings with the given separator.
     *
     * <p>Note: This might be replaced by utility method from commons-lang or guava someday if one
     * of those libraries is added as dependency.
     *
     * @param array The array of strings
     * @param separator The separator
     * @return the resulting string
     */
    public static String join(String[] array, String separator) {
        int len = array.length;
        if (len == 0) {
            return "";
        }

        StringBuilder out = new StringBuilder();
        out.append(array[0]);
        for (int i = 1; i < len; i++) {
            out.append(separator).append(array[i]);
        }
        return out.toString();
    }

    /**
     * Join a list of strings with the given separator.
     *
     * @param list The list of strings
     * @param separator The separator
     * @return the resulting string
     */
    public static String join(Collection<String> list, String separator) {
        Iterator<String> iterator = list.iterator();
        StringBuilder out = new StringBuilder();
        if (iterator.hasNext()) {
            out.append(iterator.next());
        }
        while (iterator.hasNext()) {
            out.append(separator).append(iterator.next());
        }
        return out.toString();
    }
}

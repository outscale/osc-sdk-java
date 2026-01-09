package io.github.outscale.osc_sdk_java.client;

public class ConfigurationException extends Exception {

    /** Constructor for ConfigurationException. */
    public ConfigurationException() {}

    /**
     * Constructor for ConfigurationException.
     *
     * @param message the error message
     */
    public ConfigurationException(String message) {
        super(message);
    }

    /**
     * Get the exception message including HTTP response data.
     *
     * @return The exception message
     */
    public String getMessage() {
        return String.format("Message: %s", super.getMessage());
    }
}

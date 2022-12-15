package io.github.outscale.osc_sdk_java.client;

public class ConfigurationEnv extends ConfigurationInitializer {
    private Profile profile;

    public ConfigurationEnv() {}

    public static ConfigurationEnv loadConfigEnv() {
        ConfigurationEnv configurationEnv = new ConfigurationEnv();

        configurationEnv.profile = new Profile();
        configurationEnv.profile.setAccessKey(System.getenv("OSC_ACCESS_KEY"));
        configurationEnv.profile.setSecretKey(System.getenv("OSC_SECRET_KEY"));
        configurationEnv.profile.setRegion(System.getenv("OSC_REGION"));
        configurationEnv.profile.setX509ClientCert(System.getenv("OSC_X509_CLIENT_CERT"));
        configurationEnv.profile.setX509ClientCertB64(System.getenv("OSC_X509_CLIENT_CERT_B64"));
        configurationEnv.profile.setX509ClientKey(System.getenv("OSC_X509_CLIENT_KEY"));
        configurationEnv.profile.setX509ClientKeyB64(System.getenv("OSC_X509_CLIENT_KEY_B64"));
        configurationEnv.profile.setMethod(System.getenv("OSC_METHOD"));
        configurationEnv.profile.setProtocol(System.getenv("OSC_PROTOCOL"));

        Endpoint endpoints = new Endpoint();
        endpoints.setApi(System.getenv("OSC_ENDPOINT_API"));
        configurationEnv.profile.setEndpoints(endpoints);

        return configurationEnv;
    }

    public ApiClient getApiClient() throws ConfigurationException {
        return getApiClient(profile);
    }

    @Override
    public String toString() {
        return profile.toString();
    }
}

package io.github.outscale.osc_sdk_java.client;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ConfigurationInitializerTest {

    private final ConfigurationInitializer configuration = new ConfigurationInitializer();

    private String getValidCertificateFile() {
        return ConfigurationInitializerTest.class.getResource("certs/valid/sdk.test.crt").getFile();
    }

    private String getValidKeyFile() {
        return ConfigurationInitializerTest.class.getResource("certs/valid/sdk.test.key").getFile();
    }

    private String getInvalidKeyFile() {
        return ConfigurationInitializerTest.class
                .getResource("certs/invalid/sdk.test.key")
                .getFile();
    }

    private String getInvalidCertificateFile() {
        return ConfigurationInitializerTest.class
                .getResource("certs/invalid/sdk.test.crt")
                .getFile();
    }

    private String getValidCertificateB64() {
        return "LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSURPVENDQWlFQ0ZCQlFQUmloN1pwNEhtcTZLeGtaOFdUbCtUcklNQTBHQ1NxR1NJYjNEUUVCQ3dVQU1HMHgKQ3pBSkJnTlZCQVlUQWxSVE1RMHdDd1lEVlFRSURBUlVaWE4wTVEwd0N3WURWUVFIREFSVVpYTjBNUTB3Q3dZRApWUVFLREFSVVpYTjBNUTB3Q3dZRFZRUUxEQVJVWlhOME1RMHdDd1lEVlFRRERBUlVSVk5VTVJNd0VRWUpLb1pJCmh2Y05BUWtCRmdSVVJWTlVNQjRYRFRJeU1USXhOVEV5TXpZeE1Wb1hEVEkxTURrd09URXlNell4TVZvd1JURUwKTUFrR0ExVUVCaE1DVkZNeEV6QVJCZ05WQkFnTUNsTnZiV1V0VTNSaGRHVXhJVEFmQmdOVkJBb01HRWx1ZEdWeQpibVYwSUZkcFpHZHBkSE1nVUhSNUlFeDBaRENDQVNJd0RRWUpLb1pJaHZjTkFRRUJCUUFEZ2dFUEFEQ0NBUW9DCmdnRUJBS0VXYVJSNUltMkdnMHZjcVI1a0RmNHFyQ3N4amJkbmsvbk5DVDMzV25vVmRVUnVGQVlVV1ljVTVTdCsKTFg3RkdFK0VaOUo1bzlYLzBUcGFRbTMxZndIRUdieWJBQWQzRzI1Y2IwNnd4cGhHL3V6YWR0WVRHdURTdjQ3cgpPLzZuVTBnaG9hMldKRXVLSDJsNXJxQTZHakd4OWFqc1RUeThTbk9zV2MrOFdQRGhBaHhiRjFBS0hhMHprTE9kCm0zWlpnRTk2SWpEdjR1c0lQeUlhR2N1b21lNjBMUnB6OGp6NlBpYWtkbmFWZ21NWVpKMHRncndQWTkvRmd6cGEKVFo3QWhEcTcrSUJQZ1B5cXFZYnZuUHY1bTBvVlp5NG1CRkZuNTdrNnVjcUZpSUJvdDZsN3NDaTRSNXBGV1c2MwpRMFFmaEs4UUZkRXNzeUp6ejdJdGpqYTJuLzhDQXdFQUFUQU5CZ2txaGtpRzl3MEJBUXNGQUFPQ0FRRUFVdmMwClVIS3B5V3Y5Uld0UGZlb3luYTdTOHNJMi9wM2UxNXh4V1ZKSW8zOVZBSmMyRTUvTzZSYVRHS2N6RzkxcjNCMEsKaWhwVkpEWllHM0V2VGtOWWN3Unhqb25URjBkYU5mTzYrSndIOGdMcFRrQU9GN3Ywd0gzeGRRVWJzOW0yY2RWdgphZ3dTT0M1WXdlTFdiaGw2Vm9tRlp0b3h0eE0xclRWUkFDcVNWNzBwNnNQK3FJUFNOUkxOZmVoVkt0Vm5PYmJUCmpFRndRZS9Vb2pCZ2FTMXM0Ni9lK0dMTkdmQWs0MmNZbnVyUU9QTFVKT1pvYmVncXpodElkNytQUndBbGVyT28KODhjb0RXY3JPRnl2RkdUUTJoMXB3dko3NkFNNXh5NHFFbitRNzVCZ0VuaWJSeHBzWUpDeUU1RGErem5LWnlGUQoyeHdWRS9aU2lOcm9BTno1NXc9PQotLS0tLUVORCBDRVJUSUZJQ0FURS0tLS0tCg==";
    }

    private String getValidKeyB64() {
        return "LS0tLS1CRUdJTiBSU0EgUFJJVkFURSBLRVktLS0tLQpNSUlFb3dJQkFBS0NBUUVBb1JacEZIa2liWWFEUzl5cEhtUU4vaXFzS3pHTnQyZVQrYzBKUGZkYWVoVjFSRzRVCkJoUlpoeFRsSzM0dGZzVVlUNFJuMG5tajFmL1JPbHBDYmZWL0FjUVp2SnNBQjNjYmJseHZUckRHbUViKzdOcDIKMWhNYTROSy9qdXM3L3FkVFNDR2hyWllrUzRvZmFYbXVvRG9hTWJIMXFPeE5QTHhLYzZ4Wno3eFk4T0VDSEZzWApVQW9kclRPUXM1MmJkbG1BVDNvaU1PL2k2d2cvSWhvWnk2aVo3clF0R25QeVBQbytKcVIyZHBXQ1l4aGtuUzJDCnZBOWozOFdET2xwTm5zQ0VPcnY0Z0UrQS9LcXBodStjKy9tYlNoVm5MaVlFVVdmbnVUcTV5b1dJZ0dpM3FYdXcKS0xoSG1rVlpicmREUkIrRXJ4QVYwU3l6SW5QUHNpMk9OcmFmL3dJREFRQUJBb0lCQUhGTUg5QUVldEJwd1VMRQpDamFUekx1dEs3YWRmYjAzSG42ZFZSaStObWFUWFEwcUZ1OUh0TWdyVEJ2US9SS2ljVHpNTlhGMW1HUFZMMFZKCllsdVFSU25xME9jMFpVcmEzUEk4RlJWVmcvaHFScll6MlUwcjFzVzF0SUZDdGNtZnloVjdnZ2xqQmxnUzU1RDUKd25aekp5VTRzejJDSmJqSC9kMXBwU2xVb1lHWXdvUXUvTzdYamJmbVFyTVY2L2o3dHRibUNMZmpaVjZ3UE53bwpETWZCUnlLKzY3WFhjcTV4c2dreE9qanhTbFUyZmY2ekh1TjhXU3hPUmlWNGw0OEIydU5wV041VWQySDkvcFNGCjgvZlZkNkFtaFh6SzlCL29kQUlKSFhPdU9iQ0JUbGRSV3h5VEVLbW10TTVrZE5GdE51MkRBN1RSNFY0VWJzTWMKZW83NkFMRUNnWUVBeldzdE42VGdzRTJJdXVlbm83ajRmaXhXdDN4MFU1SkNyZjg0cURZUzQ1cVVmbzBzU3gxdQp3V0F3M09FTjBmNHhkTUJEb2x0eFFOejBmQ1pkR1hVOGxiQUpzbENxWm1EVlRCcXUyTmdaTnhBbHNMYzdNNHY0CkdJb2svaE5YOHF1L0dVbEpqRnNBSzJxNTZMWE5uc3Z2TlZLcWQwdGRPOFB3WmNKU25mZ1lnV01DZ1lFQXlNREUKSHpIWEppMFlDd2RVQmF6SkpQVGtXV1pMYnlyTWk0di95OElNZTNmMC9nWUR1ZUtCZWdiVE1rVWxZN3lqTk5YYQpuZUlWSndvYk05MnJDNU9rVldvalo2ZlA1MVUydy9kendsSFZGanJiaFZtVVN0RjViZGdZRHNDbm5rMUdwTjdOCnM0bS8vVjV2RjBFbk5MY1hkY1IzTlFXMzRpNXdybmFOUm1ZejE3VUNnWUFneEZYa0tHTEcvTGN3eVQ4T2VMVDYKdTJ2aHZQSjVXajFVci8rRHBZeUJ6ZWlkL3pydmlIUmdXRTJ6RGhzOFFnWDFqNjI2T2tmb2h0Wmc3Mld1WitzUQpIWktPWlJ1cFZRenhKTmg3TW8xaklTcEI5QmgzY241U3U4YUcyT01RaktEaEViV3ZzOXhsRUpNek1iem85YkxrCm1Ka2tpbHNHNjR4dlR2NEt3TVozN1FLQmdRQ2RZTWtmTDJKY01rUEQrWlc3OFMycXhEVHpoTWNrT2lncVNiRloKV2lHUTlZUmhVL085Mkx6cUhjbVpnaTJDbDlKV1RFUmJPMjZic1VlTURIM1gwSUdtMkZNeklwSlE1elBNd3dQRAoxWVU0TFNJRTB5bjIwV3JoV3VQWlJOemlzKy9xdGlRS1dMWGkraElhNTkvRmFyZUFnbWwxYnFzdUxIdjN1VWFkClp1ZkRkUUtCZ0Zsb1ZJWlpNcGFIZGI2TUw3UmhPbGZQcXNldHl3TmFOMG0yVFAyY0tpMXVsTnZCNC9zd1I5WkQKYUN4TXd0c1BFK21Qa0ZpVXlQcUd1U1AvZSs3dzBIejFjdlJkT251TUNDVUE0alg5RFRjN2JOTFZKVVYwUHFsZgpoYlFPaDJzdFE5b0FJMStBOXpTZEhSWUUvMXpPWW9XaDlUN0N0T3YxRHhMMEFqa1Iwc2w1Ci0tLS0tRU5EIFJTQSBQUklWQVRFIEtFWS0tLS0tCg==";
    }

    /**
     * Model tests for AccepterNet
     *
     * @throws ConfigurationException
     */
    @Test
    public void testRegion() throws ConfigurationException {
        Profile profile = new Profile();
        profile.setRegion("us-east-2");

        ApiClient client = this.configuration.getApiClient(profile);

        assertEquals(1, client.getServers().size());
        assertEquals("https://api.{region}.outscale.com/api/v1", client.getServers().get(0).URL);
    }

    @Test
    public void testCertificateFileOk() throws ConfigurationException {
        Profile profile = new Profile();
        profile.setRegion("us-east-2");
        profile.setX509ClientCert(this.getValidCertificateFile());
        profile.setX509ClientKey(this.getValidKeyFile());

        ApiClient client = this.configuration.getApiClient(profile);
        assertNotEquals(null, client);
    }

    @Test
    public void testCertificateFileKo() throws ConfigurationException {
        Profile profile = new Profile();
        profile.setRegion("us-east-2");

        // Invalid Certificate
        profile.setX509ClientCert(this.getInvalidCertificateFile());
        profile.setX509ClientKey(this.getValidKeyFile());

        assertThrows(
                ConfigurationException.class,
                () -> {
                    this.configuration.getApiClient(profile);
                });

        // Invalid Private Key
        profile.setX509ClientCert(this.getValidCertificateFile());
        profile.setX509ClientKey(this.getInvalidKeyFile());
        assertThrows(
                ConfigurationException.class,
                () -> {
                    this.configuration.getApiClient(profile);
                });

        // Invalid Path
        profile.setX509ClientCert("notAPath");
        profile.setX509ClientKey(this.getValidKeyFile());
        assertThrows(
                ConfigurationException.class,
                () -> {
                    this.configuration.getApiClient(profile);
                });
    }

    @Test
    public void testCertificateEnvOk() throws ConfigurationException {
        Profile profile = new Profile();
        profile.setRegion("us-east-2");

        profile.setX509ClientCertB64(this.getValidCertificateB64());
        profile.setX509ClientKeyB64(this.getValidKeyB64());

        assertNotEquals(null, this.configuration.getApiClient(profile));
    }

    @Test
    public void testCertificateBoth() throws ConfigurationException {
        Profile profile = new Profile();
        profile.setRegion("us-east-2");

        // Set Both
        profile.setX509ClientCert(this.getValidCertificateFile());
        profile.setX509ClientKey(this.getValidKeyFile());
        profile.setX509ClientCertB64(this.getValidCertificateB64());
        profile.setX509ClientKeyB64(this.getValidCertificateB64());

        assertThrows(
                ConfigurationException.class,
                () -> {
                    this.configuration.getApiClient(profile);
                });
    }

    @Test
    public void testCertificateEnvKo() throws ConfigurationException {
        Profile profile = new Profile();
        profile.setRegion("us-east-2");

        // Invalid Certificate
        profile.setX509ClientCertB64("NotValid");
        profile.setX509ClientKeyB64(this.getValidKeyB64());
        assertThrows(
                ConfigurationException.class,
                () -> {
                    this.configuration.getApiClient(profile);
                });

        // Invalid PrivateKey
        profile.setX509ClientCertB64(this.getValidCertificateB64());
        profile.setX509ClientKeyB64("NotValid");
        assertThrows(
                ConfigurationException.class,
                () -> {
                    this.configuration.getApiClient(profile);
                });
    }
}

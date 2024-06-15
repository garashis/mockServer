package com.example.mock;

import org.mockserver.configuration.ConfigurationProperties;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.integration.ClientAndServer;
import org.springframework.context.annotation.Configuration;

import static org.mockserver.integration.ClientAndServer.startClientAndServer;

@Configuration
public class TestMockServer {
    private static ClientAndServer mockServer;

    public TestMockServer() {
        ConfigurationProperties configurationProperties = new ConfigurationProperties();
//        configurationProperties.maxInitialLineLength(10);
//        configurationProperties.initializationJsonPath("expectations/{*}.json");
        mockServer = startClientAndServer(1080);
    }

}

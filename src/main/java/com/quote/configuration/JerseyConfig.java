package com.quote.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.quote.rest.QuoteController;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(QuoteController.class);
    }
}
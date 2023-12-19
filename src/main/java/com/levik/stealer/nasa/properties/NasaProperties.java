package com.levik.stealer.nasa.properties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "nasa")
@NoArgsConstructor
@Getter
@Setter
public class NasaProperties {
    private String host;
    private String apiKey;
}

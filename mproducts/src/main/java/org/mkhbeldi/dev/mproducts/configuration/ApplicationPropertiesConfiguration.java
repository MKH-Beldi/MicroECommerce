package org.mkhbeldi.dev.mproducts.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("custom-configs")
@RefreshScope
@Getter
@Setter
public class ApplicationPropertiesConfiguration {
    private int limitProducts;
}

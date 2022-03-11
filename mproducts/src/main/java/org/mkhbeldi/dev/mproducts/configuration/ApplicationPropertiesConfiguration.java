package org.mkhbeldi.dev.mproducts.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("custom-configs")
@Getter
@Setter
public class ApplicationPropertiesConfiguration {
    private int limitProducts;
}

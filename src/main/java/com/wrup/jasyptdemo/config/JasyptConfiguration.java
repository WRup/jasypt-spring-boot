package com.wrup.jasyptdemo.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;
import org.springframework.context.annotation.Configuration;

@Configuration
@EncryptablePropertySource("application.properties")
public class JasyptConfiguration {
}

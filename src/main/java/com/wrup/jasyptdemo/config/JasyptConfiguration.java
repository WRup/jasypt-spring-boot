package com.wrup.jasyptdemo.config;

import com.ulisesbocchio.jasyptspringboot.encryptor.SimpleGCMConfig;
import com.ulisesbocchio.jasyptspringboot.encryptor.SimpleGCMStringEncryptor;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JasyptConfiguration {

    @Value("${encryption.password}")
    private String encryptionPassword;

    @Bean("jasyptEncryptionBean")
    public StringEncryptor stringEncryptor() {
        SimpleGCMConfig config = new SimpleGCMConfig();
        config.setSecretKeyPassword(encryptionPassword);
        config.setSecretKeyIterations(1000);
        return new SimpleGCMStringEncryptor(config);
    }
}

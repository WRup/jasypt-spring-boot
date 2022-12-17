package com.wrup.jasyptdemo.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {

    @Bean
    public HikariDataSource hikariConfig(@Value("${spring.datasource.url}") String databaseUrl,
                                         @Value("${spring.datasource.username}") String databaseUsername,
                                         @Value("${spring.datasource.password}") String databasePassword
    ) {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(databaseUrl);
        hikariConfig.setUsername(databaseUsername);
        hikariConfig.setPassword(databasePassword);
        return new HikariDataSource(hikariConfig);
    }
}

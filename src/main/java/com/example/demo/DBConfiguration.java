package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@PropertySource("file:///C:/config/db-${spring.profiles.active}.properties")
@ConfigurationProperties(prefix = "database")
@Component
public class DBConfiguration {
	private String username;
	private String password;
	private String schemaname;

}

package com.project.springbootexternalconfig1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties
@PropertySource(factory = YamlPropertySourceFactory.class, value = "classpath:application.yaml")
public class Config {

	@Value("${spring.abc}")
	public String abc;
	
	@Bean
	public void test() {
		System.out.println(abc);
	}
}

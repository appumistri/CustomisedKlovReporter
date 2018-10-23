package com.aventstack.klov.configuration;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter {

	@Value("${report.path}")
	private String appPath = "";
	
	private Path resourcePath = Paths.get(appPath, "resources/images");

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/**")
		.addResourceLocations("file:" + resourcePath + "/Favicon.png")
		.addResourceLocations("file:" + resourcePath + "/Logo.png");
	}
}
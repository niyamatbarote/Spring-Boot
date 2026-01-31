package com.loveCalc.config;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// This file is the ALTERNATE for the application-config.xml file
// Thus we Deleted that file now make the configuration
// Without using the XML FILE

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.controllers")
public class ApplicationConfig {

	// Setting Up View Resolver :
	// It's Return Type is InternalResourceViewResolver
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/view/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
}

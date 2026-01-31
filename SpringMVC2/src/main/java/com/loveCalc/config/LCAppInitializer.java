package com.loveCalc.config;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.controllers.TestController;

public class LCAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?> @Nullable [] getRootConfigClasses() {
		// TODO Auto-generated method stub
//		Class[] array1= {TestController.class};
		return null;
	}

	@Override
	protected Class<?> @Nullable [] getServletConfigClasses() {
		// Configuring Servlet Class Location
		Class[] array = {ApplicationConfig.class};
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// Servlet Mapping
		String[] arr = {"/"};
		return null;
	}

}

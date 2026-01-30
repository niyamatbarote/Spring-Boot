package com.loveCalc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class LoveCalcApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("Web Applicatioin Initialized");
		
		// Set the location of config file
		// This is web Application Container Object
		XmlWebApplicationContext webApp = new XmlWebApplicationContext();
		
		// Setting Spring Config Location
		webApp.setConfigLocation("application-config.xml");
		
		// Create a Dispather Servlet Object
		// DispatcherServlet needs a Spring Config file to get Initialize
			DispatcherServlet ds = new DispatcherServlet(webApp);
			
//			Add/Register Dispatcher Servlet to Servlet Context
			ServletRegistration.Dynamic myCustomDispServlet = servletContext.addServlet("myDispatcherServelt", ds);
			
			// Servlet Mapping :-
			// Load On Startup :-
			myCustomDispServlet.setLoadOnStartup(1);
			// Url Mapping :-
			myCustomDispServlet.addMapping("/myWeb/*"); 	
			
	}
	
}

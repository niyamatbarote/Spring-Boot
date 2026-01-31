package com.loveCalc.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

//public class LoveCalcApplicationInitializer implements WebApplicationInitializer {
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		System.out.println("Web Applicatioin Initialized");
//		
//		// Set the location of config file
//		// 1) This/SET is web Application Container Object
////		Removed Bcoz Not Using XML Configuration
////		XmlWebApplicationContext webApp = new XmlWebApplicationContext();
//		AnnotationConfigWebApplicationContext container = new AnnotationConfigWebApplicationContext();
//		
//		// 2) Setting Spring Config Location
////		Removed Bcoz Not Using XML Configuration
////		webApp.setConfigLocation("classpath:application-config.xml");
//		container.register(ApplicationConfig.class);
//		
//		
//		// 3) Create a Dispather Servlet Object
//		// DispatcherServlet needs a Spring Config file to get Initialize
//			DispatcherServlet ds = new DispatcherServlet(container);
//			
//			// 4) Add/Register Dispatcher Servlet to Servlet Context
//			// Here myDispatcherServlet is the Name of the My Servlet
//			ServletRegistration.Dynamic myCustomDispServlet = servletContext.addServlet("myDispatcherServlet", ds);
//			
//			// 5) Servlet Mapping :-
//			// Load On Startup :-
//			myCustomDispServlet.setLoadOnStartup(1);
//			// Url Mapping :-
//			myCustomDispServlet.addMapping("/"); 	
//			
//	}
//	
//}

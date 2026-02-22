package com.controllers;


import com.loveCalc.config.ApplicationConfig;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.api.SIgnInDTO;
import com.api.SignUpDTO;
import com.api.UserInfoDTO;

@Controller
public class LCAppController {

    private final ApplicationConfig applicationConfig;

    private final TestController testController;

    private final InternalResourceViewResolver viewResolver;

    LCAppController(InternalResourceViewResolver viewResolver, TestController testController, ApplicationConfig applicationConfig) {
        this.viewResolver = viewResolver;
        this.testController = testController;
        this.applicationConfig = applicationConfig;
    }

	@RequestMapping("/")
	public String application(@ModelAttribute("info") UserInfoDTO dto) 	{
		
		// Fetch th user Input form the Home page
		// then we will send it to the result page
		
//		UserInfoDTO dto = new UserInfoDTO();
//		md.addAttribute("info", dto);         s                                
		
		// The following code is replaced OR Altered using this line of code :
		// (@ModelAttribute("info") UserInfoDTO dto
		// This is used to FETCH The User INPUT From THe VIEW
		
		return "myApp";
	}
	
	@RequestMapping("/process") 
	public String resultPage(@Valid @ModelAttribute("info") UserInfoDTO dto, BindingResult result) {
		// @RequestParam String yourName,@RequestParam String crushName
// NOTE **** WE roemoved @RequestParam bcz we needed to create each String Like @RequestParam("userName") for each Value
// This is not good practice for data like large FROMS thus we created a UserInfoDTO class for This ALTERNATIVE		
		// @RequestParam is Used to Get the Data from the View to The Backend.
		// Alternative of this is HttpServletRequest interface is used for Retrieving the data from the view
		// i.e. In Other Words we are Able to *CAPTURE OR BIND* parameters to Variables
//		System.out.println(yourName1);
//		System.out.println(crushName1);
		
		// *** NOTE we MUST First Retrieve the data from VIEW and then we can RESEND it to the VIEW using Model interface
		// Using The Model Interface we are sending the data to VIEW
//		md.addAttribute("info", dto);
//		md.addAttribute("crushName", crushName1 );
		
		// Using Getter Method in the UserInfoDTO class we can get/retrieve the user input from the view
		
		// Internally its doing ::::
		// 1) UserInfoDTO user = new UserInfoDTO();
		// 2) UserInfoDTO.setYourName("Niyamat");
		
		// hasError() has return type of Boolean
		if (result.hasErrors()) {
			System.out.println("Error has occured ");
			return "myApp";
		}
		System.out.println(dto.isTnc());
		
		return "result";
	}
	
	@RequestMapping("/signin")
	public String signUp(@ModelAttribute("in") SIgnInDTO sign) {
		
		System.out.println(sign.getUsername());
		System.out.println(sign.getPass());
		return "signin";
	}
	
	// Using SignUpDTO class to GET/COLLECT The Data from the VIEW
	@RequestMapping("/signup")
	public String signUp(@ModelAttribute("up") SignUpDTO signup) {
		System.out.println("On SignUp Page");
		return "signup";
	}
	// Using SignUpDTO class to SEND/SHOW The Data to the VIEW
	@RequestMapping("/regsucc")
	public String regSuccess(@ModelAttribute("reg") SignUpDTO signup ) {
		System.out.println("On Sign  UP Success Page");
		return "regsucc";
	}
	
	
}

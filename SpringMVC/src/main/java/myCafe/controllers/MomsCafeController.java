package myCafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class MomsCafeController {
	
	
	@RequestMapping("/mycafe")
	public String welcome(org.springframework.ui.Model model) {
//		Here Model is An interface Which Helps to send data from CONTROLLER to VIEW
//		sending data to view JSP Page
		String myCafe = "MOM'S CAFE";
		
		model.addAttribute("myMom", "Hiiiiiiiiiiii");
		
		return "cafe";
	}
}

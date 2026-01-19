package myCafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MomsCafeController {
	
	
	@RequestMapping("/mycafe")
	public String welcome(org.springframework.ui.Model model) {
//		Here Model is An interface Which Helps to send data from CONTROLLER to VIEW
//		sending data to view JSP Page
		String myCafe = "MOM'S CAFE";
		
		model.addAttribute("myMom", myCafe);
		
		return "cafe";
	}
	
	@RequestMapping("/processOrder")
	// HttpServletRequest is used to send the received data to the View
	public String processOrder(HttpServletRequest req, org.springframework.ui.Model model) {
		
		// ****** Handling data received from the user
		String order = req.getParameter("foodtype");
		
		// ****** Sending the Data Back to the View
		model.addAttribute("myOrder", order);
		
		// User redirected to this .JSP file
		return "orderProcess";
	}
}

package myHome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisterController {
	
	
	
	@ResponseBody
	@RequestMapping("/makeupkit")
	public String giveKit() {
		return "Take This Makeup Kit But Return It ASAP ...!!!";
	}

}

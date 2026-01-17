package myHome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BrotherController {
	
	@ResponseBody
	@RequestMapping("/bat")
	public String giveBat() {
		return "Here is Cricket Bat For YOu ..!!";
	}

}

package myHome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//We Can Also Use the @ResponseBody on the Class Level
// To Visit the bat page we need to use the destination as :- http://localhost:8082/SpringMVC/myHome.com/boy/bat
@Controller
@RequestMapping("/boy")
public class BrotherController {
	
	@ResponseBody
	@RequestMapping("/bat")
	public String giveBat() {
		return "Here is Cricket Bat For YOu ..!!";
	}
	
//	We can Make many methods in same class with different urls with different actions --
	
	@ResponseBody
	@RequestMapping("/book")
	public String book() {
		return "Just Take My Book and Don't Return..!!"	;
	}

}

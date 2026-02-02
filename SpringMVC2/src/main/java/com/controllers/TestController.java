package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

//	@ResponseBody
	@RequestMapping("/testing")
//	@ResponseBody To Map the /testing with test.jsp we Dont need ResponseBody Annotation
	public String testController() {
		return "test";
	}
}

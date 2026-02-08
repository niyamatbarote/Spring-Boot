package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LCAppController {

	@RequestMapping("/")
	public String application() {
		return "myApp";
	}
}

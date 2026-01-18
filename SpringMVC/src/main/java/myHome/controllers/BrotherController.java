package myHome.controllers;

import java.nio.channels.Pipe.SourceChannel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//We Can Also Use the @ResponseBody on the Class Level
// To Visit the bat page we need to use the destination as :- http://localhost:8082/SpringMVC/myHome.com/boy/bat
@Controller
@RequestMapping("/boy")
public class BrotherController {

    private final SisterController sisterController;

    BrotherController(SisterController sisterController) {
        this.sisterController = sisterController;
    }
	
//    if we Use @ResponseBody then we will get only Strnig Not THe Definit Directed Folder
//	@ResponseBody
	@RequestMapping("/bat")
	public String giveBat() {
		return "boyBat";
	}
	
//	We can Make many methods in same class with different urls with different actions --
	
	@ResponseBody
	@RequestMapping("/book")
	public String book() {
		// Sout thing will be printed on "console" 
		// ** only when we hit the /book link
		System.out.println("This is Book Method");
		return "Just Take My Book and Don't Return..!!"	;
	}

}

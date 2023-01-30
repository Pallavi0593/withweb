package com.example.FirstMVCApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GreetController {
	
	@GetMapping("/greet")
 public String greetmsg(Model md) {
	 String msg="Good Evening All";
	 
	 md.addAttribute("GREETMESSAGE", msg);
	
	return "Greet";
	 
 }
}

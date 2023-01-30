package com.example.FirstMVCApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class welcomeController {

	public welcomeController() {
		super();
	System.out.println("welcome to controller class");
	}
	
	@GetMapping("/WelcomeMsg")
public ModelAndView getmessage() {
	String msg="Welcome to bikkadIt";
	
	ModelAndView mav=new ModelAndView();
	mav.addObject("MESSAGE",msg);
	mav.setViewName("Welcome");
	return mav;
}
}

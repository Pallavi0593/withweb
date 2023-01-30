package com.BikkadIt.AutowiringModes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIt.AutowiringModes.service.Studentservice;
@Controller
public class StudentController {
@Autowired
	private Studentservice studentservice;
	
	public void controller()
	{
		studentservice.report();
		System.out.println("Student Controller Method");
	}

	
}

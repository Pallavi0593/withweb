package com.BikkadIt.AutowiringModes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIt.AutowiringModes.controller.StudentController;
@SpringBootApplication
public class AutowiringModesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutowiringModesApplication.class, args);
		
		StudentController studentController = context.getBean(StudentController.class);
		
		studentController.controller();
	}

}

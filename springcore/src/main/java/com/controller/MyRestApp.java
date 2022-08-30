package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Feedback;
import com.service.AppService;

@RestController
public class MyRestApp {

	@Autowired
	private AppService service;

	@PostMapping("/feedbck")
	public String userRegister(@RequestParam("name") String name, @RequestParam("email") String email , @RequestParam("feedback") String feedback) {
		Feedback f = new Feedback(name,email,feedback);
		boolean data= service.addFeedback(f);
		if(data) {
			return "Feedback Added....";
		}
		else {
			return "Feedback not added";
		}
		
	}
}


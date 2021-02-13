package com.softvision.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.softvision.demo.service.DemoMessageService;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {

	@Autowired
	private DemoMessageService demoMessageService;
	
	@RequestMapping(value = "/test")
	public void getMessage() {
		String deneme = "deneme";
		demoMessageService.sendMessage(deneme);		
	}
	
	@RequestMapping(value = "/test/custom" ,method = RequestMethod.PUT)
	public void sendMessageCustomOutput(@RequestBody String message) {
		 
		demoMessageService.sendMessageCustomOutput(message);		
	}
	
}

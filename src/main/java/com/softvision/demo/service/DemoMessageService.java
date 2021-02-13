package com.softvision.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softvision.demo.beans.CustomSourceBean;
import com.softvision.demo.beans.SimpleSourceBean;

@Service
public class DemoMessageService {
	
	@Autowired
	SimpleSourceBean simpleSourceBean;
	
	@Autowired
	CustomSourceBean customSourceBean;
	
	public void sendMessage(String message) {
		simpleSourceBean.publishMessage(message);
	}
	
	public void sendMessageCustomOutput(String message) {
		customSourceBean.publishMessage(message);
	}
	
	public void sendMessageCustomOutput2(String message) {
		
	}
}

package com.softvision.demo.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.softvision.demo.channels.CustomInput;

@EnableBinding(CustomInput.class)
public class CustomChannelMessageHandler {

	@StreamListener("customInput")
	public void loggerSink(String message) {
		System.out.println("Received message: " + message);
	}
}

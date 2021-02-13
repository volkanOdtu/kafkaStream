package com.softvision.demo.beans;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.softvision.demo.channels.CustomOutput;

@Component
@EnableBinding(CustomOutput.class)
public class CustomSourceBean {
	CustomOutput customOutput;
	
	public CustomSourceBean(CustomOutput customOutput) {
		this.customOutput = customOutput;
	}
	
	public void publishMessage(String message) {
		System.out.println("Message is being sent: "+ message);
		
		customOutput.output().send(MessageBuilder.withPayload(message).build());
	}
}

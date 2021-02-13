package com.softvision.demo.beans;

import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;


//Default named channel "output"
@Component
public class SimpleSourceBean {

	Source source;
	
	public SimpleSourceBean(Source source) {
		this.source = source;
	}
	
	public void publishMessage(String message) {
		System.out.println("Message is being sent: "+ message);
		source.output().send(MessageBuilder.withPayload(message).build());
	}
}

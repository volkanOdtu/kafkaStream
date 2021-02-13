package com.softvision.demo.service;
 
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class DemoMessageHandler {

	@StreamListener(Sink.INPUT) //"input"
	public void loggerSink(String message) {
		System.out.println("Received message: " + message);
	}
}

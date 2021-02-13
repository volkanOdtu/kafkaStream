package com.softvision.demo.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomInput {
	@Input("customInput")
	SubscribableChannel input();
}

package com.softvision.demo.channels;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomOutput {
	@Output("customOutput")
	MessageChannel output();
}

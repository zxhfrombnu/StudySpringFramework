package com.helen.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:example.properties")
@ConfigurationProperties(prefix="my")
//@ConfigurationProperties(prefix="my", locations="classpath:example.properties")
public class MyMessage {
	private String messageValue;

	public String getMessageValue() {
		return messageValue;
	}

	public void setMessageValue(String messageValue) {
		this.messageValue = messageValue;
	}
}

//@Component
//public class MyMessage {
//	@Value("${my.messageValue}")
//	private String messageValue;
//
//	public String getMessageValue() {
//		return messageValue;
//	}
//
//	public void setMessageValue(String messageValue) {
//		this.messageValue = messageValue;
//	}
//}


//@Component
//public class MyMessage {
//	@Value("${my.messageValue}")
//	private int messageValue;
//
//	public int getMessageValue() {
//		return messageValue;
//	}
//
//	public void setMessageValue(int messageValue) {
//		this.messageValue = messageValue;
//	}
//}
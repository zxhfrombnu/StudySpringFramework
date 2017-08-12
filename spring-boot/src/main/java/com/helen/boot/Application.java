package com.helen.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableConfigurationProperties(value = MyMessage.class)
public class Application {
	@Autowired
	ApplicationArguments args;

	@Autowired
	private MyMessage myMessage;
	
	@RequestMapping("/")
	public String welcome() {
		String value = args.getOptionNames().iterator().next();
		return "Welcome, your lucky number is " + value;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

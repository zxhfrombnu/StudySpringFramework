package com.helen.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan


//@Import(MyConfiguration.class)

public class Application {
	@Value("${name}")
	String name;
	
	@Autowired
	String message;

	@RequestMapping("/")
	public String home() {
		//return "Hello World";
		//return name;
		return message;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

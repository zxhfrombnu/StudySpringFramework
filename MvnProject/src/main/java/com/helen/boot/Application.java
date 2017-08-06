package com.helen.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Application {
	@Value("${name}")
	String name;

	@RequestMapping("/")
	public String home() {
		//return "Hello World";
		return name;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

package com.helen.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@ServletComponentScan
public class WebApplication {
	@RequestMapping("/thymeleaf")
	public String thymeleaf() {
		return "template";
	}

//	@RequestMapping("mustache")
//	public String mustache(Model model) {
//		model.addAttribute("company", "OReilly");
//		return "template";
//	}

	@RequestMapping("viewresolver")
	public String viewResolver() {
		return "viewresolver";
	}

	@ResponseBody
	@RequestMapping("/cat")
	public Cat cat() {
		return new Cat("Athena", "Bengal", 1);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}

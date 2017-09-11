package com.helen.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RestController
@SpringBootApplication

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan


//@Import(MyConfiguration.class)
@Controller
public class Application {
	@Value("${name}")
	String name;
	
	@Autowired
	String message;

	//please access the url: http://localhost:9001/test/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		//return "Hello World";
		//return name;
		//return message;
		model.addAttribute("message", message);
        return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

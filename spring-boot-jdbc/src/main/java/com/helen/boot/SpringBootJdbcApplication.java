package com.helen.boot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@RestController
@Controller
public class SpringBootJdbcApplication {
	
	@Autowired
	private JdbcTemplate template;

	// access the url : http://localhost:8080/stocks
	@RequestMapping("/stocks")
	public String stocks(Model model) {
		List<Map<String, Object>> result = template.queryForList("select * from stock");
		model.addAttribute("stocks", result);
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}
}

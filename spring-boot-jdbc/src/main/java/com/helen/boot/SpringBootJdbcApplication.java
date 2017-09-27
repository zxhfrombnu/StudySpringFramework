package com.helen.boot;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@Controller
//public class SpringBootJdbcApplication {
public class SpringBootJdbcApplication extends SpringBootServletInitializer {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SpringBootJdbcApplication.class);
	}

//	// for tomcat server access the url : http://localhost:8080/stocks
//	@RequestMapping("/stocks")
//	public String stocks(Model model) {
//		List<Map<String, Object>> result = template.queryForList("select * from stock");
//		model.addAttribute("stocks", result);
//		return "index";
//	}
	
	// for Pivotal tc server access the url : http://localhost:8080/spring-boot-jdbc/stocks
	@RequestMapping("/stocks")
	@ResponseBody
	public List<Map<String, Object>> stocks(Model model) {
		List<Map<String, Object>> result = template.queryForList("select * from stock");
		return result;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}
}

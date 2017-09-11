package com.helen.boot;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@EnableWebSecurity
@EnableOAuth2Sso
//@RestController
@Controller
public class SpringBootSecurityApplication extends WebSecurityConfigurerAdapter {
	
//	@RequestMapping("/user")
//	public Principal user(Principal principal) {
//		return principal;
//	}
	@RequestMapping("/user")
	public String user(Principal principal, Model model) {
		model.addAttribute("principal", principal);
		return "index";
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}
}

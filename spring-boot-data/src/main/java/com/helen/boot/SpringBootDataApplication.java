package com.helen.boot;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDataApplication {
	
	@Autowired
	private EntityManager em;
	
	// for tomcat server access the url : http://localhost:8080/stocks
	// it tries to use h2 database by default
	@RequestMapping("/stocks")
	public List<Stock> stocks() {
		return em.createQuery("select s from Stock s").getResultList();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataApplication.class, args);
	}
}

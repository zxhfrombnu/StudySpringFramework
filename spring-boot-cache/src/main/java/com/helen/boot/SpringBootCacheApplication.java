package com.helen.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCacheApplication implements CommandLineRunner {

	@Autowired
	private StockTracker tracker;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("The price is...");
		for(int x = 0; x < 10; x++) {
			System.out.println(tracker.getPrice("T"));
		}
	}
}

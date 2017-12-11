package com.helen.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
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

		System.out.println("Getting price with new method");
		System.out.println(tracker.getPriceWithManager("T"));
	}
}

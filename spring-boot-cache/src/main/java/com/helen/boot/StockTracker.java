package com.helen.boot;

import java.util.Random;

import javax.cache.annotation.CacheResult;

import org.springframework.stereotype.Component;

@Component
public class StockTracker {
	@CacheResult
	public double getPrice(String symbol) {
		System.out.println("Generating the price...");
		return 20 + (200 - 20) * new Random().nextDouble();
	}
}

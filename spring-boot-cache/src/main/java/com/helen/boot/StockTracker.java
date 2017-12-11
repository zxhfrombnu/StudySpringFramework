package com.helen.boot;

import java.util.Random;

import javax.cache.annotation.CacheResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;


@Component
public class StockTracker {
	@Autowired
	private CacheManager manager;

	public double getPriceWithManager(String symbol) {
		Cache cache = manager.getCache("price");
		return Double.valueOf(cache.get(symbol).getObjectValue().toString());
	}

	@CacheResult(cacheName="price")
	public double getPrice(String symbol) {
		System.out.println("Generating the price...");
		return 20 + (200 - 20) * new Random().nextDouble();
	}
}

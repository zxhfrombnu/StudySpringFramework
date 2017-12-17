package com.helen.boot;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicate implements HealthIndicator {

	@Override
	public Health health() {
		return Health.down().withDetail("Error Message", "There is no connection to the service.").build();
	}

}

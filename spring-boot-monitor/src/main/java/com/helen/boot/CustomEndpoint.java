package com.helen.boot;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

@Component
public class CustomEndpoint implements Endpoint<String> {

	@Override
	public String getId() {
		return "custom";
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isSensitive() {
		return false;
	}

	@Override
	public String invoke() {
		return "Successful Endpoint Test";
	}

}

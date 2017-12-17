package com.helen.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@Autowired
	private CounterService counterService;

	@RequestMapping("/execute")
	public String execute() {
		counterService.increment("simple.service.execute");
		return "invoked";
	}
}

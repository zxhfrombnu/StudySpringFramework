package com.helen.boot;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//solution1
@Configuration
public class MyCustomizer {
	@Bean
	public EmbeddedServletContainerFactory factory() {
		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
		factory.setContextPath("/app3");
		return factory;
	}
}

//@Component
//public class MyCustomizer implements EmbeddedServletContainerCustomizer {
//
//	@Override
//	public void customize(ConfigurableEmbeddedServletContainer container) {
//		container.setContextPath("/app2");
//	}
//}

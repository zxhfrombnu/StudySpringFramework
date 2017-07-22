package com.helen;

import java.text.NumberFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoWithSpring {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("applicationContext.xml");
		NumberFormat nf = context.getBean(NumberFormat.class);
		double amount = 12345678.9012345;
		System.out.println(nf.format(amount));
	}
}

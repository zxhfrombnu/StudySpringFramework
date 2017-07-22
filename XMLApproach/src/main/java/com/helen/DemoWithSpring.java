package com.helen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.helen.entities.BaseballGame;

public class DemoWithSpring {
	public static void main(String[] args) {
//		ApplicationContext context = 
//				new AnnotationConfigApplicationContext(AppConfig.class);
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BaseballGame game = context.getBean("baseballGame", BaseballGame.class);
		System.out.println(game.playGame());
		
		System.out.println("There are " + context.getBeanDefinitionCount());
		for (String name : context.getBeanDefinitionNames()) {
			System.out.println("name : " + name);
		}
	}
}

package com.helen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.helen.entities.Game;

public class DemoWithSpring {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Game game = context.getBean("game", Game.class);
		System.out.println(game.playGame());
		
		System.out.println("There are " + context.getBeanDefinitionCount());
		for (String name : context.getBeanDefinitionNames()) {
			System.out.println("name : " + name);
		}
	}
}

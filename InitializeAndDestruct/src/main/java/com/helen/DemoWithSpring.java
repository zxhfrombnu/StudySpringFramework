package com.helen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.helen.entities.Game;
import com.helen.entities.Team;

public class DemoWithSpring {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		Team royals = context.getBean("royals", Team.class);
		
		Game game1 = context.getBean("game", Game.class);
		System.out.println(game1);
		
		context.close();
	}
}

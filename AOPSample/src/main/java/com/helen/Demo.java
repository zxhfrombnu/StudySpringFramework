package com.helen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.helen.config.AppConfig;
import com.helen.entities.Game;
import com.helen.entities.Team;

public class Demo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Game game = context.getBean("game", Game.class);
		Team royals = context.getBean("royals", Team.class);
		Team redSox = context.getBean("redSox", Team.class);
		Team cubs = context.getBean("cubs", Team.class);
		
		game.setHomeTeam(royals);
		game.setAwayTeam(cubs);
		game.playGame();
		//System.out.println(game.playGame());
		
		game.setHomeTeam(cubs);
		game.setAwayTeam(redSox);
		game.playGame();
		//System.out.println(game.playGame());

		context.close();
	}
}

package com.helen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.helen.entities.BaseballGame;
import com.helen.entities.Cubs;
import com.helen.entities.Game;
import com.helen.entities.RedSox;
import com.helen.entities.Team;

@Configuration
public class AppConfig {
	@Bean
	public Game game() {
		return new BaseballGame(redSox(), cubs());
	}
	
	@Bean
	public Team redSox() {
		return new RedSox();
	}
	
	@Bean
	public Team cubs() {
		return new Cubs();
	}
}

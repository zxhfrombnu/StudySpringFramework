package com.helen;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.helen.entities.BaseballGame;
import com.helen.entities.Cubs;
import com.helen.entities.Game;
import com.helen.entities.RedSox;
import com.helen.entities.Team;

@Configuration
@Import(InfrastructureConfig.class)
public class AppConfig {
	@Bean
	public Game game(DataSource dataSource) {
		BaseballGame baseballGame = new BaseballGame(redSox(), cubs());
		baseballGame.setDataSource(dataSource);
		return baseballGame;
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

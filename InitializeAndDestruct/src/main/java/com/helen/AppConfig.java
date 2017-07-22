package com.helen;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.helen.entities.BaseballGame;
import com.helen.entities.Cubs;
import com.helen.entities.Game;
import com.helen.entities.RedSox;
import com.helen.entities.Team;

@Configuration
@ComponentScan(basePackages = "com.helen")
public class AppConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private List<Team> teams;
	
	//@Bean(initMethod = "startGame", destroyMethod = "endGame")
	@Bean
	//@Scope("prototype")
	public Game game() {
		BaseballGame baseballGame = 
				new BaseballGame(redSox(), cubs());
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

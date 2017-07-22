package com.helen;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.helen.entities.BaseballGame;
import com.helen.entities.Game;
import com.helen.entities.Team;

@Configuration
@ComponentScan(basePackages = "com.helen")
public class AppConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private List<Team> teams;
	
	@Bean
	public Game game() {
		BaseballGame baseballGame = 
				new BaseballGame(teams.get(0), teams.get(1));
		baseballGame.setDataSource(dataSource);
		return baseballGame;
	}
}

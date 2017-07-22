package com.helen;

import java.text.NumberFormat;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.helen.entities.BaseballGame;
import com.helen.entities.Cubs;
import com.helen.entities.Game;
import com.helen.entities.RedSox;
import com.helen.entities.Team;

@Configuration
@ComponentScan(basePackages = "com.helen")
public class AppConfig {
	
	@Bean
	public NumberFormat nf() {
		return NumberFormat.getCurrencyInstance();
	}
	
//	@Autowired
//	private DataSource dataSource;
//	
//	@Resource
//	private Team redSox;
//	
//	@Resource
//	private Team cubs;
//	
//	@Bean
//	public Game game() {
//		BaseballGame baseballGame = new BaseballGame(redSox, cubs);
//		baseballGame.setDataSource(dataSource);
//		return baseballGame;
//	}
//	
//	@Bean
//	public Team redSox() {
//		return new RedSox();
//	}
//	
//	@Bean
//	public Team cubs() {
//		return new Cubs();
//	}
}

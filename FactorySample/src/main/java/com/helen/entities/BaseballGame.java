package com.helen.entities;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballGame implements Game {
	@Autowired
	@Qualifier("cubs")
	private Team homeTeam;
	@Autowired
	@Qualifier("redSox")
	private Team awayTeam;
	@Autowired
	private DataSource dataSource;
	
	public BaseballGame() {}
	public BaseballGame(Team homeTeam, Team awayTeam) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void setHomeTeam(Team team) {
		this.homeTeam = team;
	}
	@Override
	public Team getHomeTeam() {
		return this.homeTeam;
	}
	@Override
	public void setAwayTeam(Team team) {
		this.awayTeam = team;
	}
	@Override
	public Team getAwayTeam() {
		return this.awayTeam;
	}
	@Override
	public String playGame() {
		// TODO Auto-generated method stub
		return Math.random() < 0.5 ? getHomeTeam().getName() : getAwayTeam().getName();
	}
}

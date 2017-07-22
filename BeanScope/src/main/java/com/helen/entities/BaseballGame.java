package com.helen.entities;

import javax.sql.DataSource;

public class BaseballGame implements Game {
	private Team homeTeam;
	private Team awayTeam;
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
	@Override
	public String toString() {
		return String.format("Game between %s at %s", awayTeam.getName(), homeTeam.getName());
	}
}

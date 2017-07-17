package com.helen.entities;

public class BaseballGame implements Game {
	private Team homeTeam;
	private Team awayTeam;
	
	public BaseballGame() {}
	public BaseballGame(Team homeTeam, Team awayTeam) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
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

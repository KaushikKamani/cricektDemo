package com.Cricket.CricketDemo.model;

public class MatchRequest {

	private String team1;
	private String team2;
	private String match_name;
	private String tournament_name;
	
	public String getTeam1() {
		return team1;
	}
	
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	
	public String getTeam2() {
		return team2;
	}
	
	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getMatch_name() {
		return match_name;
	}

	public void setMatch_name(String match_name) {
		this.match_name = match_name;
	}

	public String getTournament_name() {
		return tournament_name;
	}

	public void setTournament_name(String tournament_name) {
		this.tournament_name = tournament_name;
	}

	public MatchRequest() {
	}

	public MatchRequest(String team1, String team2, String match_name, String tournament_name) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.match_name = match_name;
		this.tournament_name = tournament_name;
	}
}

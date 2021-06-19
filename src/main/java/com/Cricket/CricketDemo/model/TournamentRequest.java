package com.Cricket.CricketDemo.model;

public class TournamentRequest {

	private String tournament_name;

	public String getTournament_name() {
		return tournament_name;
	}

	public void setTournament_name(String tournament_name) {
		this.tournament_name = tournament_name;
	}

	public TournamentRequest(String tournament_name) {
		super();
		this.tournament_name = tournament_name;
	}

	public TournamentRequest() {
	}
	
}

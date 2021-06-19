package com.Cricket.CricketDemo.model;

import java.util.List;

import com.Cricket.CricketDemo.Entity.TournamentEntity;

public class TournamentResponse {

	private String tournament_response;
	private List<TournamentEntity> tournamentList;
	
	public String getTournament_response() {
		return tournament_response;
	}
	
	public void setTournament_response(String tournament_response) {
		this.tournament_response = tournament_response;
	}
	
	public List<TournamentEntity> getTournamentList() {
		return tournamentList;
	}
	
	public void setTournamentList(List<TournamentEntity> tournamentList) {
		this.tournamentList = tournamentList;
	}

	public TournamentResponse(String tournament_response, List<TournamentEntity> tournamentList) {
		super();
		this.tournament_response = tournament_response;
		this.tournamentList = tournamentList;
	}

	public TournamentResponse() {
	}
	
}

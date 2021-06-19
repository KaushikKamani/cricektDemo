package com.Cricket.CricketDemo.model;

import java.util.List;

import com.Cricket.CricketDemo.Entity.TeamEntity;

public class TeamResponse {

	private String teamsResponse;
	List<TeamEntity> teamsList;
	
	public String getTeamsResponse() {
		return teamsResponse;
	}
	
	public void setTeamsResponse(String teamsResponse) {
		this.teamsResponse = teamsResponse;
	}
	
	public List<TeamEntity> getTeamsList() {
		return teamsList;
	}
	
	public void setTeamsList(List<TeamEntity> teamsList) {
		this.teamsList = teamsList;
	}
	
	
}

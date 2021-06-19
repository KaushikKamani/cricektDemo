package com.Cricket.CricketDemo.model;

public class TeamRequest {

	private String team_name;
	
	public TeamRequest() {
	}
	
	public TeamRequest(String team_name) {
		super();
		this.team_name = team_name;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
}

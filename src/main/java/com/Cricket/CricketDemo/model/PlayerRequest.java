package com.Cricket.CricketDemo.model;

import java.util.List;

public class PlayerRequest {

	private Integer team_id;
	private List<PlayerBulkRequest> players;
	
	public Integer getTeam_id() {
		return team_id;
	}
	
	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}

	public List<PlayerBulkRequest> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerBulkRequest> players) {
		this.players = players;
	}

	public PlayerRequest(Integer team_id, List<PlayerBulkRequest> players) {
		super();
		this.team_id = team_id;
		this.players = players;
	}

	public PlayerRequest() {
	}
	
}

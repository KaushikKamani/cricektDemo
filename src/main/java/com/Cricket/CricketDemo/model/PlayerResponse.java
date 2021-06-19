package com.Cricket.CricketDemo.model;

import java.util.List;

import com.Cricket.CricketDemo.Entity.PlayerEntity;

public class PlayerResponse {
	
	private String playersResponse;
	List<PlayerEntity> playerList;
	
	public String getPlayersResponse() {
		return playersResponse;
	}
	
	public void setPlayersResponse(String playersResponse) {
		this.playersResponse = playersResponse;
	}
	
	public List<PlayerEntity> getPlayerList() {
		return playerList;
	}
	
	public void setPlayerList(List<PlayerEntity> playerList) {
		this.playerList = playerList;
	}
	
	
}

package com.Cricket.CricketDemo.Service;

import com.Cricket.CricketDemo.model.PlayerRequest;
import com.Cricket.CricketDemo.model.PlayerResponse;

public interface PlayerService {

	public PlayerResponse addPlayers(PlayerRequest request);
}

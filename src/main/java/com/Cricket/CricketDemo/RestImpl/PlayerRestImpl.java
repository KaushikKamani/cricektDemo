package com.Cricket.CricketDemo.RestImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Cricket.CricketDemo.Rest.PlayerRest;
import com.Cricket.CricketDemo.Service.PlayerService;
import com.Cricket.CricketDemo.model.PlayerRequest;
import com.Cricket.CricketDemo.model.PlayerResponse;

@RestController
public class PlayerRestImpl implements PlayerRest {
	
	@Autowired
	private PlayerService playerService;
	
	@PostMapping(value = "/addPlayer", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PlayerResponse addPlayers(@RequestBody PlayerRequest request) {
		PlayerResponse response = playerService.addPlayers(request);
		return response;
	}
}

package com.Cricket.CricketDemo.Rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Cricket.CricketDemo.model.PlayerRequest;
import com.Cricket.CricketDemo.model.PlayerResponse;

@RequestMapping(value = "/player")
public interface PlayerRest {
	
	@PostMapping(value = "/addPlayer", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PlayerResponse addPlayers(@RequestBody PlayerRequest request);

}

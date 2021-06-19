package com.Cricket.CricketDemo.Rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Cricket.CricketDemo.model.TeamRequest;
import com.Cricket.CricketDemo.model.TeamResponse;

@RequestMapping(value = "/team")
public interface TeamRest {
	
	@PostMapping(value = "/addTeam", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody TeamResponse addTeams(@RequestBody TeamRequest request);
}

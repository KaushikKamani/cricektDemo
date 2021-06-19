package com.Cricket.CricketDemo.RestImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Cricket.CricketDemo.Rest.TeamRest;
import com.Cricket.CricketDemo.Service.TeamService;
import com.Cricket.CricketDemo.model.TeamRequest;
import com.Cricket.CricketDemo.model.TeamResponse;

@RestController
public class TeamRestImpl implements TeamRest {

	@Autowired
	private TeamService teamService;
	
	@PostMapping(value = "/addTeam", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody TeamResponse addTeams(@RequestBody TeamRequest request) {
		TeamResponse response = teamService.addTeams(request);
		return response;
	}
}

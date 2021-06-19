package com.Cricket.CricketDemo.RestImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Cricket.CricketDemo.Rest.MatchRest;
import com.Cricket.CricketDemo.Service.MatchService;
import com.Cricket.CricketDemo.model.MatchRequest;
import com.Cricket.CricketDemo.model.MatchResponse;

@RestController
public class MatchRestImpl implements MatchRest{

	@Autowired
	private MatchService matchService;
	
	@PostMapping(value = "/addMatch", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MatchResponse addMatch(MatchRequest request) {
		MatchResponse response = matchService.addMatch(request);
		return response;
	}
}

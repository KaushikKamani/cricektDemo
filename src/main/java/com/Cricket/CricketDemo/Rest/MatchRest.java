package com.Cricket.CricketDemo.Rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Cricket.CricketDemo.model.MatchRequest;
import com.Cricket.CricketDemo.model.MatchResponse;

@RequestMapping(value = "/match")
public interface MatchRest {

	@PostMapping(value = "/addMatch", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MatchResponse addMatch(@RequestBody MatchRequest request);
}

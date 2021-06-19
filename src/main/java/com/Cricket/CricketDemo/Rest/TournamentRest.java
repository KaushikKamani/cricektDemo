package com.Cricket.CricketDemo.Rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Cricket.CricketDemo.model.TournamentRequest;
import com.Cricket.CricketDemo.model.TournamentResponse;

@RequestMapping(value = "/tournament")
public interface TournamentRest {

	@PostMapping(value = "/addTournament", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody TournamentResponse addTournaments(@RequestBody TournamentRequest request);
}

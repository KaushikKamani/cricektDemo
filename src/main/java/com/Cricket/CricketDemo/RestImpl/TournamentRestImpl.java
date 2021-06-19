package com.Cricket.CricketDemo.RestImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Cricket.CricketDemo.Rest.TournamentRest;
import com.Cricket.CricketDemo.Service.TournamentService;
import com.Cricket.CricketDemo.model.TournamentRequest;
import com.Cricket.CricketDemo.model.TournamentResponse;

@RestController
public class TournamentRestImpl implements TournamentRest {

	@Autowired
	private TournamentService tournamentServie;
	
	@PostMapping(value = "/addTournament", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody TournamentResponse addTournaments(TournamentRequest request) {
		TournamentResponse response = tournamentServie.addTournaments(request);
		return response;
	}
}

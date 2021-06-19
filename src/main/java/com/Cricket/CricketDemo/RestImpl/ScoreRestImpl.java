package com.Cricket.CricketDemo.RestImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Cricket.CricketDemo.Rest.ScoringRest;
import com.Cricket.CricketDemo.Service.ScoreService;
import com.Cricket.CricketDemo.model.ScoreRequest;
import com.Cricket.CricketDemo.model.ScoreResponse;

@RestController
public class ScoreRestImpl implements ScoringRest {

	@Autowired
	private ScoreService scoreService;
	
	@PostMapping(value = "/addScore", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ScoreResponse addScore(ScoreRequest request) {
		ScoreResponse response = scoreService.addScore(request);
		return response;
	}

	@PostMapping(value = "/downWickets", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ScoreResponse downWicket(ScoreRequest request) {
		ScoreResponse response = scoreService.downWicket(request);
		return response;
	}

	@GetMapping(value = "/getScore")
	public ScoreResponse getScores(@RequestParam(value = "team_name") String team_name) {
		ScoreResponse response = scoreService.getScores(team_name);
		return response;
	}

}

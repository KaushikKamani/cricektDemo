package com.Cricket.CricketDemo.Rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Cricket.CricketDemo.model.ScoreRequest;
import com.Cricket.CricketDemo.model.ScoreResponse;

@RequestMapping(value = "/score")
public interface ScoringRest {

	@PostMapping(value = "/addScore", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ScoreResponse addScore(@RequestBody ScoreRequest request);
	
	@PostMapping(value = "/downWickets", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ScoreResponse downWicket(@RequestBody ScoreRequest request);
	
	@GetMapping("/getScore")
	public ScoreResponse getScores(@RequestParam(value = "team_name") String team_name);
}

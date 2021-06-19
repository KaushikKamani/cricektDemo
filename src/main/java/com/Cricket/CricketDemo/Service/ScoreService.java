package com.Cricket.CricketDemo.Service;

import com.Cricket.CricketDemo.model.ScoreRequest;
import com.Cricket.CricketDemo.model.ScoreResponse;

public interface ScoreService {

	public ScoreResponse addScore(ScoreRequest request);
	public ScoreResponse downWicket(ScoreRequest request);
	public ScoreResponse getScores(String team_name);

}

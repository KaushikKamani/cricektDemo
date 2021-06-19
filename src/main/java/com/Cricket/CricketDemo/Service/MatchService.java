package com.Cricket.CricketDemo.Service;

import com.Cricket.CricketDemo.model.MatchRequest;
import com.Cricket.CricketDemo.model.MatchResponse;

public interface MatchService {

	public MatchResponse addMatch(MatchRequest request);

}

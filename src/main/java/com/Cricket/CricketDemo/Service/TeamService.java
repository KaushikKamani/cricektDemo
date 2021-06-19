package com.Cricket.CricketDemo.Service;

import com.Cricket.CricketDemo.model.TeamRequest;
import com.Cricket.CricketDemo.model.TeamResponse;

public interface TeamService {

	public TeamResponse addTeams(TeamRequest request);
}

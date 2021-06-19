package com.Cricket.CricketDemo.ServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cricket.CricketDemo.Entity.TeamEntity;
import com.Cricket.CricketDemo.Repository.TeamRepository;
import com.Cricket.CricketDemo.Service.TeamService;
import com.Cricket.CricketDemo.model.TeamRequest;
import com.Cricket.CricketDemo.model.TeamResponse;

@Service
public class TeamServiceImpl implements TeamService {

	private static final Logger logger = LoggerFactory.getLogger(TeamServiceImpl.class);
	
	@Autowired
	TeamRepository teamRepo;
	
	@Override
	public TeamResponse addTeams(TeamRequest request) {
		
		TeamResponse response = new TeamResponse();
		TeamEntity team = new TeamEntity();
		
		try {
				team.setTeam_name(request.getTeam_name());
				teamRepo.save(team);
				response.setTeamsResponse("Team Added SuccessFully !!! ");
				response.setTeamsList(teamRepo.findAll());
				
		}catch (Exception e) {
			logger.info("Exception in Add Cricket Team !!! ", e);
		}
		
		return response;
	}
}

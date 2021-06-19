package com.Cricket.CricketDemo.ServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cricket.CricketDemo.Entity.MatchEntity;
import com.Cricket.CricketDemo.Entity.TeamEntity;
import com.Cricket.CricketDemo.Entity.TournamentEntity;
import com.Cricket.CricketDemo.Repository.MatchRepository;
import com.Cricket.CricketDemo.Repository.TeamRepository;
import com.Cricket.CricketDemo.Repository.TournamentRepository;
import com.Cricket.CricketDemo.Service.MatchService;
import com.Cricket.CricketDemo.model.MatchRequest;
import com.Cricket.CricketDemo.model.MatchResponse;

@Service
public class MatchServiceImpl implements MatchService {

	private static final Logger logger = LoggerFactory.getLogger(MatchServiceImpl.class);
	
	@Autowired
	MatchRepository matchRepo;
	
	@Autowired
	TeamRepository teamRepo;
	
	@Autowired
	TournamentRepository tournamentRepo;
	
	@Override
	public MatchResponse addMatch(MatchRequest request) {
		
		MatchResponse response = new MatchResponse();
		
		try {
				MatchEntity match = new MatchEntity();
				TournamentEntity tournament = tournamentRepo.findByTournamentName(request.getTournament_name());
				match.setTournament(tournament);
				match.setMatch_name(request.getMatch_name());
				MatchEntity savedMatch = matchRepo.saveAndFlush(match);
				TeamEntity team1 = teamRepo.findByTeamName(request.getTeam1());
				team1.setMatch(savedMatch);
				TeamEntity team2 = teamRepo.findByTeamName(request.getTeam2());
				team2.setMatch(savedMatch);
				teamRepo.save(team1);
				teamRepo.save(team2);
				
				response.setMatchResponse("Match Added SuccessFully !!! ");
				
		}catch (Exception e) {
			logger.info("Exception in Add Match ", e);
		}
		
		return response;
	}

}

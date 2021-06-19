package com.Cricket.CricketDemo.ServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cricket.CricketDemo.Entity.TournamentEntity;
import com.Cricket.CricketDemo.Repository.TournamentRepository;
import com.Cricket.CricketDemo.Service.TournamentService;
import com.Cricket.CricketDemo.model.TournamentRequest;
import com.Cricket.CricketDemo.model.TournamentResponse;

@Service
public class TournamentServiceImpl implements TournamentService {

	private static final Logger logger = LoggerFactory.getLogger(TournamentServiceImpl.class);
	
	@Autowired
	TournamentRepository tournamentRepo;
	
	@Override
	public TournamentResponse addTournaments(TournamentRequest request) {
		
		TournamentResponse response = new TournamentResponse();
		
		try {
			
				TournamentEntity tournament = new TournamentEntity();
				
				tournament.setTournament_name(request.getTournament_name());
				tournamentRepo.save(tournament);
				response.setTournament_response("Tournament Added SuccessFully !!! ");
				response.setTournamentList(tournamentRepo.findAll());
			
		}catch (Exception e) {
			logger.info("Exception in Add Tournament ", e);
		}
		
		return response;
	}

}

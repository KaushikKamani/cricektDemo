package com.Cricket.CricketDemo.ServiceImpl;

import java.util.ArrayList;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cricket.CricketDemo.Entity.MatchEntity;
import com.Cricket.CricketDemo.Entity.ScoreEntity;
import com.Cricket.CricketDemo.Entity.TeamEntity;
import com.Cricket.CricketDemo.Repository.MatchRepository;
import com.Cricket.CricketDemo.Repository.ScoreRepository;
import com.Cricket.CricketDemo.Repository.TeamRepository;
import com.Cricket.CricketDemo.Service.ScoreService;
import com.Cricket.CricketDemo.model.ScoreRequest;
import com.Cricket.CricketDemo.model.ScoreResponse;
import com.Cricket.CricketDemo.Util.*;

@Service
public class ScoreServiceImpl implements ScoreService{

	private static final Logger logger = LoggerFactory.getLogger(ScoreServiceImpl.class);
	
	@Autowired
	ScoreRepository scoreRepo;
	
	@Autowired
	TeamRepository teamRepo;

	@Autowired
	MatchRepository matchRepo;
	
	@Override
	public ScoreResponse getScores(String team_name) {
		
		ScoreResponse response = new ScoreResponse();
		
		try {
				TeamEntity team = teamRepo.findByTeamName(team_name);
				MatchEntity match = team.getMatch();
				ScoreEntity score = match.getScore();
				ArrayList<ScoreEntity> scoreArray = new ArrayList<>();
				scoreArray.add(score);
				response.setScoreResponse("Get Score SuccessFully !!! ");
				response.setScoresList(scoreArray);
			
		}catch (Exception e) {
			logger.info("Exception in Get Score List ", e);
		}
		
		return response;
	}


	@Override
	public ScoreResponse addScore(ScoreRequest request) {
		ScoreResponse response = new ScoreResponse();
		
		try {
				ScoreEntity score = scoreRepo.findByMatchId(request.getMatch_id());
				
				if(score == null) {
					score = new ScoreEntity();
					Optional<MatchEntity> matchOptional = matchRepo.findById(request.getMatch_id());
					
					if(matchOptional.isPresent()) {
						score.setMatch(matchOptional.get());
					}
				}
				
				if(scoreConstants.total_0 == request.getRuns() || scoreConstants.total_1 == request.getRuns() || scoreConstants.total_2 == request.getRuns() || scoreConstants.total_3 == request.getRuns() || scoreConstants.total_4 == request.getRuns() || scoreConstants.total_6 == request.getRuns()) {
					
					if(score.getRuns() == null) {
						score.setRuns(request.getRuns());
					}else {
						score.setRuns(score.getRuns() + request.getRuns());
					}
					
					if(score.getBalls() == null) {
						score.setBalls(1);
					}else {
						score.setBalls(score.getBalls() + 1);
					}
					
				}
				
				if(scoreConstants.total_0 == request.getRuns()) {
					if(score.getTotal_0() == null) {
						score.setTotal_0(1);
					}else {
						score.setTotal_0(score.getTotal_0() + 1);
					}
				}else if(scoreConstants.total_4 == request.getRuns()) {
					if(score.getTotal_4() == null) {
						score.setTotal_4(1);
					}else {
						score.setTotal_4(score.getTotal_4() + 1);
					}
				}else if(scoreConstants.total_6 == request.getRuns()) {
					if(score.getTotal_6() == null) {
						score.setTotal_6(1);
					}else {
						score.setTotal_6(score.getTotal_6() + 1);
					}
				}
				
				ScoreEntity scoreSaved = scoreRepo.save(score);
				if(score.getMatch() != null) {
					MatchEntity matches = score.getMatch();
					matches.setScore(scoreSaved);
					matchRepo.save(matches);
				}
				response.setScoreResponse("Score Added SuccessFully !!! ");
				response.setScoresList(scoreRepo.findAll());
				
		} catch (Exception e) {
			logger.info("Exception in Add Score ", e);
		}
		return response;
	}


	@Override
	public ScoreResponse downWicket(ScoreRequest request) {
		ScoreResponse response = new ScoreResponse();
		
		try {	
			TeamEntity team = teamRepo.findByTeamName(request.getTeam_name());
			MatchEntity match = team.getMatch();
			ScoreEntity score = match.getScore();
			
			if(score.getWickets() < 10) {
				score.setWickets(score.getWickets() + 1);
				scoreRepo.save(score);
				response.setScoreResponse("Wicket Down SuccessFully !!! ");
				response.setScoresList(scoreRepo.findAll());
			}
		}
		catch (Exception e) {
			logger.info("Exception in Add Score ", e);
		}
		
		return response;
	}
}
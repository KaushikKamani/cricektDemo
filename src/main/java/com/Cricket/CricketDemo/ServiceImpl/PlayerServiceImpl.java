package com.Cricket.CricketDemo.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cricket.CricketDemo.Entity.PlayerEntity;
import com.Cricket.CricketDemo.Entity.TeamEntity;
import com.Cricket.CricketDemo.Repository.PlayerRepository;
import com.Cricket.CricketDemo.Repository.TeamRepository;
import com.Cricket.CricketDemo.Service.PlayerService;
import com.Cricket.CricketDemo.model.PlayerBulkRequest;
import com.Cricket.CricketDemo.model.PlayerRequest;
import com.Cricket.CricketDemo.model.PlayerResponse;

@Service
public class PlayerServiceImpl implements PlayerService {

	private static final Logger logger = LoggerFactory.getLogger(PlayerServiceImpl.class);
	
	@Autowired
	PlayerRepository playerRepo;
	
	@Autowired
	TeamRepository teamRepo;
	
	@Override
	public PlayerResponse addPlayers(PlayerRequest request) {
		
		PlayerResponse response = new PlayerResponse();
		List<PlayerEntity> list = new ArrayList<>();
		Optional<TeamEntity> teamEntityOptional = teamRepo.findById(request.getTeam_id());
		
		try {				
				for(PlayerBulkRequest playerBulkRequest : request.getPlayers()) {
					
					PlayerEntity playerList = new PlayerEntity();
					if(teamEntityOptional.isPresent()) {
						playerList.setTeam_id(teamEntityOptional.get());
					}
					
					playerList.setPlayer_name(playerBulkRequest.getPlayerNames());

					list.add(playerList);
				}
				
				if (!list.isEmpty()) {
					for (PlayerEntity player : list) {
						playerRepo.save(player);
					}
				}
				
				response.setPlayersResponse("Players Added SuccessFully !!! ");
				response.setPlayerList(playerRepo.findAll());
				
		}catch (Exception e) {
			logger.info("Exception in Add Players !!! ", e);
		}
		
		return response;
	}

}

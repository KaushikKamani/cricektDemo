package com.Cricket.CricketDemo.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Cricket.CricketDemo.Entity.TournamentEntity;

@Repository
public interface TournamentRepository extends JpaRepository<TournamentEntity, Serializable> {

	@Query("from TournamentEntity where tournament_name =:tournament_name")
	public TournamentEntity findByTournamentName(@Param("tournament_name") String tournament_name);

}

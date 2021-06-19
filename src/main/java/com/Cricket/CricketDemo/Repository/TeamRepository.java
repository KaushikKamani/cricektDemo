package com.Cricket.CricketDemo.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Cricket.CricketDemo.Entity.TeamEntity;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Serializable> {

	@Query("from TeamEntity where team_name =:team_name")
	TeamEntity findByTeamName(@Param("team_name") String team_name);

}

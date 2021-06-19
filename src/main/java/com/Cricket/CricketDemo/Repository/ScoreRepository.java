package com.Cricket.CricketDemo.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Cricket.CricketDemo.Entity.ScoreEntity;

@Repository
public interface ScoreRepository extends JpaRepository<ScoreEntity, Serializable> {

	@Query("from ScoreEntity where match_id =:match_id")
	ScoreEntity findByMatchId(@Param("match_id") Integer match_id);

}

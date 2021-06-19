package com.Cricket.CricketDemo.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Cricket.CricketDemo.Entity.MatchEntity;

@Repository
public interface MatchRepository extends JpaRepository<MatchEntity, Serializable> {

}

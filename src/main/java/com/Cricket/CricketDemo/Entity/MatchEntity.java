package com.Cricket.CricketDemo.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "match_tbl")
public class MatchEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "match_id")
	private Integer match_id;

	@Column(name = "match_name")
	private String match_name;
	
	@OneToOne
	@JoinColumn(name = "score_score_id")
	private ScoreEntity score;
	
	@ManyToOne
	@JoinColumn(name = "tournament_id")
	private TournamentEntity tournament;

	public Integer getMatch_id() {
		return match_id;
	}

	public void setMatch_id(Integer match_id) {
		this.match_id = match_id;
	}

	public String getMatch_name() {
		return match_name;
	}

	public void setMatch_name(String match_name) {
		this.match_name = match_name;
	}

	public ScoreEntity getScore() {
		return score;
	}

	public void setScore(ScoreEntity score) {
		this.score = score;
	}

	public TournamentEntity getTournament() {
		return tournament;
	}

	public void setTournament(TournamentEntity tournament) {
		this.tournament = tournament;
	}

	public MatchEntity() {
	}

	public MatchEntity(Integer match_id, String match_name, ScoreEntity score, TournamentEntity tournament) {
		super();
		this.match_id = match_id;
		this.match_name = match_name;
		this.score = score;
		this.tournament = tournament;
	}
	
}

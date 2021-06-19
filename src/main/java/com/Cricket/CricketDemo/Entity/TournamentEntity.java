package com.Cricket.CricketDemo.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tournament_tbl")
public class TournamentEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tournament_id")
	private Integer tournament_id;

	@Column(name = "tournament_name")
	private String tournament_name;
	
	@OneToMany(mappedBy = "match_id")
	private List<MatchEntity> match;

	public Integer getTournament_id() {
		return tournament_id;
	}

	public void setTournament_id(Integer tournament_id) {
		this.tournament_id = tournament_id;
	}

	public String getTournament_name() {
		return tournament_name;
	}

	public void setTournament_name(String tournament_name) {
		this.tournament_name = tournament_name;
	}

	public TournamentEntity(Integer tournament_id, String tournament_name) {
		super();
		this.tournament_id = tournament_id;
		this.tournament_name = tournament_name;
	}

	public TournamentEntity() {
	}

}

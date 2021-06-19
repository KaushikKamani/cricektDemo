package com.Cricket.CricketDemo.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Team_tbl")
public class TeamEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "team_id")
	private Integer team_id;

	@Column(name = "team_name")
	private String team_name;

	@OneToMany(mappedBy = "team_id")
	private List<PlayerEntity> player_name;
	
	@JoinColumn(name = "match_id")
	@ManyToOne
	private MatchEntity match;

	public Integer getTeam_id() {
		return team_id;
	}

	public void setTeam_id(Integer team_id) {
		this.team_id = team_id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public List<PlayerEntity> getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(List<PlayerEntity> player_name) {
		this.player_name = player_name;
	}

	public MatchEntity getMatch() {
		return match;
	}

	public void setMatch(MatchEntity match) {
		this.match = match;
	}

	public TeamEntity(Integer team_id, String team_name, List<PlayerEntity> player_name, MatchEntity match) {
		super();
		this.team_id = team_id;
		this.team_name = team_name;
		this.player_name = player_name;
		this.match = match;
	}

	public TeamEntity() {
	}
}

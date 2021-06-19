package com.Cricket.CricketDemo.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Player_tbl")
public class PlayerEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "player_id")
	private Integer player_id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "team_id")
	private TeamEntity team_id;

	@Column(name = "player_name")
	private String player_name;

	public Integer getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(Integer player_id) {
		this.player_id = player_id;
	}

	public TeamEntity getTeam_id() {
		return team_id;
	}

	public void setTeam_id(TeamEntity team_id) {
		this.team_id = team_id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public PlayerEntity() {
	}

	public PlayerEntity(Integer player_id, TeamEntity team_id, String player_name) {
		super();
		this.player_id = player_id;
		this.team_id = team_id;
		this.player_name = player_name;
	}
	
}

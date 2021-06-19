package com.Cricket.CricketDemo.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "score_tbl")
public class ScoreEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "score_id")
	private Integer score_id;
	
	@Column(name = "runs")
	private Integer runs;
	
	@Column(name = "wickets")
	private Integer wickets;
	
	@Column(name = "balls")
	private Integer balls;
	
	@JoinColumn(name = "match_id")
	@OneToOne
	private MatchEntity match;
	
	@Column(name = "total_0")
	private Integer total_0;
	
	@Column(name = "total_4")
	private Integer total_4;
	
	@Column(name = "total_6")
	private Integer total_6;

	public Integer getScore_id() {
		return score_id;
	}

	public void setScore_id(Integer score_id) {
		this.score_id = score_id;
	}

	public Integer getRuns() {
		return runs;
	}

	public void setRuns(Integer runs) {
		this.runs = runs;
	}

	public Integer getWickets() {
		return wickets;
	}

	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}

	public Integer getBalls() {
		return balls;
	}

	public void setBalls(Integer balls) {
		this.balls = balls;
	}

	public MatchEntity getMatch() {
		return match;
	}

	public void setMatch(MatchEntity match) {
		this.match = match;
	}	

	public Integer getTotal_4() {
		return total_4;
	}

	public void setTotal_4(Integer total_4) {
		this.total_4 = total_4;
	}

	public Integer getTotal_6() {
		return total_6;
	}

	public void setTotal_6(Integer total_6) {
		this.total_6 = total_6;
	}

	public Integer getTotal_0() {
		return total_0;
	}

	public void setTotal_0(Integer total_0) {
		this.total_0 = total_0;
	}

	public ScoreEntity(Integer score_id, Integer runs, Integer wickets, Integer balls, MatchEntity match,
			Integer total_0, Integer total_4, Integer total_6) {
		super();
		this.score_id = score_id;
		this.runs = runs;
		this.wickets = wickets;
		this.balls = balls;
		this.match = match;
		this.total_0 = total_0;
		this.total_4 = total_4;
		this.total_6 = total_6;
	}

	public ScoreEntity() {
	}

}

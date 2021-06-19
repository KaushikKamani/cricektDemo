package com.Cricket.CricketDemo.model;

public class ScoreRequest {

	private Integer match_id;
	private Integer runs;
	private Integer wicket;
	private Integer balls;
	private String team_name;
	
	public Integer getMatch_id() {
		return match_id;
	}

	public void setMatch_id(Integer match_id) {
		this.match_id = match_id;
	}

	public Integer getRuns() {
		return runs;
	}
	
	public void setRuns(Integer runs) {
		this.runs = runs;
	}	

	public Integer getWicket() {
		return wicket;
	}

	public void setWicket(Integer wicket) {
		this.wicket = wicket;
	}

	public Integer getBalls() {
		return balls;
	}

	public void setBalls(Integer balls) {
		this.balls = balls;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public ScoreRequest() {

	}

	public ScoreRequest(Integer match_id, Integer runs, Integer wicket, Integer balls, String team_name) {
		super();
		this.match_id = match_id;
		this.runs = runs;
		this.wicket = wicket;
		this.balls = balls;
		this.team_name = team_name;
	}

}

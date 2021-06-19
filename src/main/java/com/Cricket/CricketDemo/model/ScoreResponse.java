package com.Cricket.CricketDemo.model;

import java.util.List;

import com.Cricket.CricketDemo.Entity.ScoreEntity;

public class ScoreResponse {

	private Integer totalRuns;
	private Integer totalOvers;
	private Integer totalWickets;
	private Integer totalDotBalls;
	private Integer total4s;
	private Integer total6s;
	private String scoreResponse;
	
	private List<ScoreEntity> scoresList;

	public Integer getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(Integer totalRuns) {
		this.totalRuns = totalRuns;
	}

	public Integer getTotalOvers() {
		return totalOvers;
	}

	public void setTotalOvers(Integer totalOvers) {
		this.totalOvers = totalOvers;
	}

	public Integer getTotalWickets() {
		return totalWickets;
	}

	public void setTotalWickets(Integer totalWickets) {
		this.totalWickets = totalWickets;
	}

	public Integer getTotalDotBalls() {
		return totalDotBalls;
	}

	public void setTotalDotBalls(Integer totalDotBalls) {
		this.totalDotBalls = totalDotBalls;
	}

	public Integer getTotal4s() {
		return total4s;
	}

	public void setTotal4s(Integer total4s) {
		this.total4s = total4s;
	}

	public Integer getTotal6s() {
		return total6s;
	}

	public void setTotal6s(Integer total6s) {
		this.total6s = total6s;
	}

	public String getScoreResponse() {
		return scoreResponse;
	}

	public void setScoreResponse(String scoreResponse) {
		this.scoreResponse = scoreResponse;
	}

	public List<ScoreEntity> getScoresList() {
		return scoresList;
	}

	public void setScoresList(List<ScoreEntity> list) {
		this.scoresList = list;
	}
	
}

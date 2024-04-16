package com.Cricket.Cricbuzz.payload;


public class statisticsDto {
	private long player_id;
	private String name;
	private int matches_played;
	private int runs;
	private double average;
	private double strike_rate;
	public statisticsDto() {
		super();
	}
	public statisticsDto(long player_id, String name, int matches_played, int runs, double average,
			double strike_rate) {
		super();
		this.player_id = player_id;
		this.name = name;
		this.matches_played = matches_played;
		this.runs = runs;
		this.average = average;
		this.strike_rate = strike_rate;
	}
	public long getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(long player_id) {
		this.player_id = player_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMatches_played() {
		return matches_played;
	}
	public void setMatches_played(int matches_played) {
		this.matches_played = matches_played;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public double getStrike_rate() {
		return strike_rate;
	}
	public void setStrike_rate(double strike_rate) {
		this.strike_rate = strike_rate;
	}
	@Override
	public String toString() {
		return "statisticsDto [player_id=" + player_id + ", name=" + name + ", matches_played=" + matches_played
				+ ", runs=" + runs + ", average=" + average + ", strike_rate=" + strike_rate + "]";
	}
	
	
}

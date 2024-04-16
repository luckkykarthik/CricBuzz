package com.Cricket.Cricbuzz.payload;

import java.time.LocalDate;

public class matchDto {

	private String team1;
	private String team2;
	private LocalDate date;
	private String venue;
	public matchDto() {
		super();
	}
	public matchDto(String team1, String team2, LocalDate date, String venue) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
		this.venue = venue;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	@Override
	public String toString() {
		return "matchDto [team_1=" + team1 + ", team_2=" + team2 + ", date=" + date + ", venue=" + venue + "]";
	}
}

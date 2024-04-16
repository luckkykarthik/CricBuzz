package com.Cricket.Cricbuzz.payload;

import java.time.LocalDate;
import java.util.List;

public class MatchDetailsDTO {
	private Long matchId;
    private String team1;
    private String team2;
    private LocalDate date;
    private String venue;
    private String status;
//    private TeamSquadDTO squads;
	public MatchDetailsDTO() {
		super();
	}
	public MatchDetailsDTO(Long matchId, String team1, String team2, LocalDate date, String venue, String status) {
		super();
		this.matchId = matchId;
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
		this.venue = venue;
		this.status = status;
//		this.squads = squads;
	}
	public Long getMatchId() {
		return matchId;
	}
	public void setMatchId(Long matchId) {
		this.matchId = matchId;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
//	public TeamSquadDTO getSquads() {
//		return squads;
//	}
//	public void setSquads(TeamSquadDTO squads) {
//		this.squads = squads;
//	}
	@Override
	public String toString() {
		return "MatchDetailsDTO [matchId=" + matchId + ", team1=" + team1 + ", team2=" + team2 + ", date=" + date
				+ ", venue=" + venue + ", status=" + status +  "]";
	}
    
}
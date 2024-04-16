package com.Cricket.Cricbuzz.payload;

import java.util.List;

public class TeamSquadDTO {
	private List<PlayerDTO> team1;
    private List<PlayerDTO> team2;
	public TeamSquadDTO() {
		super();
	}
	public TeamSquadDTO(List<PlayerDTO> team1, List<PlayerDTO> team2) {
		super();
		this.team1 = team1;
		this.team2 = team2;
	}
	public List<PlayerDTO> getTeam1() {
		return team1;
	}
	public void setTeam1(List<PlayerDTO> team1) {
		this.team1 = team1;
	}
	public List<PlayerDTO> getTeam2() {
		return team2;
	}
	public void setTeam2(List<PlayerDTO> team2) {
		this.team2 = team2;
	}
	@Override
	public String toString() {
		return "TeamSquadDTO [team1=" + team1 + ", team2=" + team2 + "]";
	}
	
    
}

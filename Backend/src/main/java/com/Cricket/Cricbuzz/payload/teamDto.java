package com.Cricket.Cricbuzz.payload;

public class teamDto {
	String teamname;

	public teamDto() {
		super();
	}

	public teamDto(String teamname) {
		super();
		this.teamname = teamname;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	@Override
	public String toString() {
		return "teamDto [teamname=" + teamname + "]";
	}

	
}

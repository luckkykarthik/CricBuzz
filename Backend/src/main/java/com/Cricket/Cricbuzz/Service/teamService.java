package com.Cricket.Cricbuzz.Service;

import com.Cricket.Cricbuzz.model.team;
import com.Cricket.Cricbuzz.payload.teamDto;

public interface teamService {

	team createTeam(teamDto teamDto);

}

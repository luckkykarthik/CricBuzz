package com.Cricket.Cricbuzz.Service;

import com.Cricket.Cricbuzz.payload.PlayerAddedResp;
import com.Cricket.Cricbuzz.payload.inputPlayerDto;

public interface playerService {


	public PlayerAddedResp createPlayerForTeam(long teamid, inputPlayerDto playerDto);
}

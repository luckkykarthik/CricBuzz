package com.Cricket.Cricbuzz.Service;

import java.util.List;

import com.Cricket.Cricbuzz.payload.MatchDetailsDTO;
import com.Cricket.Cricbuzz.payload.matchDto;
import com.Cricket.Cricbuzz.payload.matchRespDto;

public interface matchService {
	public matchRespDto createMatch(matchDto MatchDto);

	public List<matchDto> getMatchSchedules();

	public MatchDetailsDTO getMatchDetails(Long matchid);
}

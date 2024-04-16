package com.Cricket.Cricbuzz.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cricket.Cricbuzz.Exception.playerNotExists;
import com.Cricket.Cricbuzz.Service.playerStatService;
import com.Cricket.Cricbuzz.model.playerStats;
import com.Cricket.Cricbuzz.payload.statisticsDto;
import com.Cricket.Cricbuzz.repositories.playerStatsRepo;

@Service
public class playerStatServImp implements playerStatService{
	

	
	@Autowired
	private playerStatsRepo Psr;

	@Override
	public statisticsDto GetPlayerStatistics(long playerid) {
//		player Player=Pr.findById(playerid).orElseThrow(()-> new playerNotExists("player not exists"));
				
		playerStats ps=Psr.findByPlayerId(playerid);
		if(ps==null) {
			throw new playerNotExists("player not exists");
		}
//		playerStats ps=Psr.findByPlayerId(playerid);
		statisticsDto std=new statisticsDto();
		std.setAverage(ps.getAverage());
		std.setMatches_played(ps.getMatchesPlayed());
		std.setName(ps.getName());
		std.setPlayer_id(ps.getPlayer().getId());
		std.setRuns(ps.getRuns());
		std.setStrike_rate(ps.getStrikeRate());
		return std;
	}

}

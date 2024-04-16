package com.Cricket.Cricbuzz.ServiceImp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cricket.Cricbuzz.Exception.playerAlreadyExists;
import com.Cricket.Cricbuzz.Exception.teamNotFound;
import com.Cricket.Cricbuzz.Service.playerService;
import com.Cricket.Cricbuzz.model.player;
import com.Cricket.Cricbuzz.model.playerStats;
import com.Cricket.Cricbuzz.model.team;
import com.Cricket.Cricbuzz.payload.PlayerAddedResp;
import com.Cricket.Cricbuzz.payload.inputPlayerDto;
import com.Cricket.Cricbuzz.repositories.playerRepo;
import com.Cricket.Cricbuzz.repositories.playerStatsRepo;
import com.Cricket.Cricbuzz.repositories.teamRepo;

@Service
public class playerServImp implements playerService{
	
	@Autowired
	private playerRepo Pr;
	
	@Autowired
	private teamRepo Tr;
	
	@Autowired
	private playerStatsRepo Psr;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public PlayerAddedResp createPlayerForTeam(long teamid, inputPlayerDto playerDto) {
	    team Team = Tr.findById(teamid)
	                  .orElseThrow(() -> new teamNotFound("Team not found"));
	    
	    if (Pr.existsByName(playerDto.getName())) {
	        throw new playerAlreadyExists("Player already exists");
	    }
	    
	    player player = modelMapper.map(playerDto, player.class);
	    player.setTeam(Team);
	    player saved=Pr.save(player);
	    playerStats pst=new playerStats();
	    pst.setAverage(250);
	    pst.setMatchesPlayed(23);
	    pst.setStrikeRate(0);
	    pst.setRuns(0);
	    pst.setPlayer(saved);
	    Psr.save(pst);
	    PlayerAddedResp par=new PlayerAddedResp(saved.getId());
	    return par;
	}

}

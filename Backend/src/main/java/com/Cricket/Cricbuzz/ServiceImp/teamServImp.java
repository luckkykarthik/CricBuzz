package com.Cricket.Cricbuzz.ServiceImp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cricket.Cricbuzz.Exception.teamExists;
import com.Cricket.Cricbuzz.Service.teamService;
import com.Cricket.Cricbuzz.model.team;
import com.Cricket.Cricbuzz.payload.teamDto;
import com.Cricket.Cricbuzz.repositories.teamRepo;

@Service
public class teamServImp implements teamService{
	
	@Autowired
	private teamRepo Tr;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public team createTeam(teamDto teamDto) {
		try {
			team existingTeam = Tr.findByTeamname(teamDto.getTeamname());
	        
	        if (existingTeam!=null) {
	            throw new teamExists("Team already exists");
	        }
	        
	        // If team does not exist, save the new team
	        team team = modelMapper.map(teamDto, team.class);
	        team savedTeam = Tr.save(team);
	        return savedTeam;
		}catch(Exception e) {
			throw new teamExists("Team already Exists");
		}
	}

}

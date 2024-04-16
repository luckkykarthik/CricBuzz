package com.Cricket.Cricbuzz.ServiceImp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cricket.Cricbuzz.Exception.MatchAlreadyExistsException;
import com.Cricket.Cricbuzz.Exception.matchIdNotExists;
import com.Cricket.Cricbuzz.Service.matchService;
import com.Cricket.Cricbuzz.model.Tmatches;
import com.Cricket.Cricbuzz.model.player;
import com.Cricket.Cricbuzz.payload.MatchDetailsDTO;
import com.Cricket.Cricbuzz.payload.PlayerDTO;
import com.Cricket.Cricbuzz.payload.TeamSquadDTO;
import com.Cricket.Cricbuzz.payload.matchDto;
import com.Cricket.Cricbuzz.payload.matchRespDto;
import com.Cricket.Cricbuzz.repositories.MatchRepo;
import com.Cricket.Cricbuzz.repositories.playerRepo;
import com.Cricket.Cricbuzz.repositories.teamRepo;

@Service
public class matchSevImp implements matchService{
	
	
	@Autowired
	private MatchRepo Mr;
	
	@Autowired
	private playerRepo Pr;
	
	
	@Autowired
	private teamRepo Tr;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public matchRespDto createMatch(matchDto MatchDto) {
		try {
			Tmatches Match=modelMapper.map(MatchDto, Tmatches.class);
			Tmatches savedMatch=Mr.save(Match);
//			System.out.println(savedMatch.getId());
			matchRespDto mrd=new matchRespDto();
			mrd.setId(savedMatch.getId());
			return mrd;
		}
		catch(Exception e) {
//			System.out.println("hello we Exc");
			throw new MatchAlreadyExistsException("A match with the same details already exists");
		}
	}

	@Override
	public List<matchDto> getMatchSchedules() {
		List<Tmatches> matches= Mr.findAll();
		return matches.stream().map(match -> modelMapper.map(match,matchDto.class)).collect(Collectors.toList());
	}

	@Override
	public MatchDetailsDTO getMatchDetails(Long matchid) {

//		List<PlayerDTO> team1=new ArrayList<>();
//		List<PlayerDTO> team2=new ArrayList<>();
//		Tmatches tm=Mr.findById(matchid).orElseThrow(
//				()-> new matchIdNotExists("Match not found")
//				);
//		String team1name=tm.getTeam1();
//		String team2name=tm.getTeam2();
//		LocalDate date=tm.getDate();
//		String venue=tm.getVenue();
//		String status="upcoming";
//		long team1id=Tr.findByTeamname(team1name).getId();
//		long team2id=Tr.findByTeamname(team2name).getId();
//		List<player> team1o=Pr.findByTeamId(team1id);
//		List<player> team2o=Pr.findByTeamId(team2id);
//		team1=team1o.stream().map(team -> modelMapper.map(team,PlayerDTO.class)).collect(Collectors.toList());
//		team2=team2o.stream().map(team -> modelMapper.map(team,PlayerDTO.class)).collect(Collectors.toList());
//		TeamSquadDTO tsd=new TeamSquadDTO(team1,team2);
//		MatchDetailsDTO mdd=new MatchDetailsDTO(matchid,team1name,team2name,date,venue,status,tsd);
//		return mdd;
		
		Tmatches tm=Mr.findById(matchid).orElseThrow(
				()-> new matchIdNotExists("Match not found")
				);
		String team1name=tm.getTeam1();
		String team2name=tm.getTeam2();
		LocalDate date=tm.getDate();
		String venue=tm.getVenue();
		String status="upcoming";
		MatchDetailsDTO mdd=new MatchDetailsDTO(matchid,team1name,team2name,date,venue,status);
		return mdd;
	}
	
}

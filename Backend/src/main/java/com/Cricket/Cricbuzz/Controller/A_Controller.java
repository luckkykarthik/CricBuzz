package com.Cricket.Cricbuzz.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Cricket.Cricbuzz.SecurityConfig.JwtTokenGenerator;
import com.Cricket.Cricbuzz.Service.adminService;
import com.Cricket.Cricbuzz.Service.matchService;
import com.Cricket.Cricbuzz.Service.playerService;
import com.Cricket.Cricbuzz.Service.playerStatService;
import com.Cricket.Cricbuzz.Service.teamService;
import com.Cricket.Cricbuzz.model.team;
import com.Cricket.Cricbuzz.payload.JwtAuthResponse;
import com.Cricket.Cricbuzz.payload.LoginFailureDto;
import com.Cricket.Cricbuzz.payload.MatchDetailsDTO;
import com.Cricket.Cricbuzz.payload.PlayerAddedResp;
import com.Cricket.Cricbuzz.payload.adminDto;
import com.Cricket.Cricbuzz.payload.inputPlayerDto;
import com.Cricket.Cricbuzz.payload.loginDto;
import com.Cricket.Cricbuzz.payload.matchDto;
import com.Cricket.Cricbuzz.payload.matchRespDto;
import com.Cricket.Cricbuzz.payload.registerRespDto;
import com.Cricket.Cricbuzz.payload.statisticsDto;
import com.Cricket.Cricbuzz.payload.teamDto;


@RestController
@RequestMapping("/api")
public class A_Controller {

	@Autowired
	private adminService as;
	
	@Autowired
	private playerStatService pss;
	
	@Autowired
	private matchService ms;
	
	@Autowired
	private teamService ts;
	
	@Autowired
	private playerService ps;
	
//	@GetMapping("/check")
//	public String check() {
//		return "hello";
//	}
	@Autowired
	private JwtTokenGenerator jwtT;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/admin/signup")
	public ResponseEntity<registerRespDto> register(@RequestBody adminDto AdminDto){
		return new ResponseEntity<>(as.createAdmin(AdminDto),HttpStatus.OK);
	}
	
	@PostMapping(value="/admin/login" ,produces = "application/json")
	@ResponseBody
	public ResponseEntity<?> loginuser(@RequestBody loginDto logindto){
		try {
//		System.out.println(logindto.getUsername());
//		System.out.println(logindto.getPassword());
			Authentication authentication=authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(logindto.getUsername(),logindto.getPassword())
					);
			System.out.println(authentication);
			SecurityContextHolder.getContext().setAuthentication(authentication);
			String token=jwtT.generateToken(authentication);
			JwtAuthResponse response = new JwtAuthResponse(token);
//			response.setAccess_token(token);
//			System.out.println(token);
			return ResponseEntity.ok(response);
			
		}catch(Exception e) {
			LoginFailureDto failureDto = new LoginFailureDto();
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(failureDto);
		}
	}
	
	@PostMapping("/matches")
	public ResponseEntity<matchRespDto>  createMatch(@RequestBody matchDto MatchDto){
		return new ResponseEntity<>(ms.createMatch(MatchDto),HttpStatus.CREATED);
	}
	@GetMapping("/matches")
	public ResponseEntity<List<matchDto>>  GetMatchSchedules(){

		return new ResponseEntity<>(ms.getMatchSchedules(),HttpStatus.OK);
	}
	@PostMapping("/team/create")
	public ResponseEntity<team>  createTeam(@RequestBody teamDto TeamDto){
		return new ResponseEntity<>(ts.createTeam(TeamDto),HttpStatus.CREATED);
	}
	
	@PostMapping("/teams/{teamid}/squad")
	public ResponseEntity<PlayerAddedResp>  createPlayerForTeam(@PathVariable(name="teamid") long  teamid,@RequestBody inputPlayerDto playerDto){
		return new ResponseEntity<>(ps.createPlayerForTeam(teamid,playerDto),HttpStatus.CREATED);
	}
	@GetMapping("/players/{playerid}/stats")
	public ResponseEntity<statisticsDto>  GetPlayerStatistics(@PathVariable(name="playerid") long  playerid){
		return new ResponseEntity<>(pss.GetPlayerStatistics(playerid),HttpStatus.CREATED);
	}
	@GetMapping("/matches/{matchid}")
    public ResponseEntity<MatchDetailsDTO> getMatchDetails(@PathVariable(name="matchid") long matchid) {
		return new ResponseEntity<>(ms.getMatchDetails(matchid),HttpStatus.OK);
	}
	
}
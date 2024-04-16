package com.Cricket.Cricbuzz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cricket.Cricbuzz.model.player;

public interface playerRepo extends JpaRepository<player, Long>{
	boolean existsByName(String name);
	
//	List<player> findByTeam(team team);
//	List<player> findByTeamId(long teamid);
}

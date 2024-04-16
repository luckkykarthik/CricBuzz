package com.Cricket.Cricbuzz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cricket.Cricbuzz.model.team;

public interface teamRepo extends JpaRepository<team, Long>{
	public team findByTeamname(String teamname);
}

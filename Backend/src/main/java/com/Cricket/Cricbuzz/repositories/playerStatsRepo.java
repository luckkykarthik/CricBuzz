package com.Cricket.Cricbuzz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cricket.Cricbuzz.model.playerStats;

public interface playerStatsRepo extends JpaRepository<playerStats,Long>{

	playerStats findByPlayerId(long playerid);

}

package com.Cricket.Cricbuzz.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cricket.Cricbuzz.model.Tmatches;

public interface MatchRepo extends JpaRepository<Tmatches,Long>{
	List<Tmatches> findByTeam1AndTeam2AndDateAndVenue(String team1,String team2,LocalDate date,String venue);
}

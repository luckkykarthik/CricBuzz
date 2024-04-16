package com.Cricket.Cricbuzz.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tmatches {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable=false)
    private String team1;
	
	@Column(nullable=false)
    private String team2;
	
	@Column(nullable=false)
    private LocalDate date;
	
	@Column(nullable=false)
    private String venue;

	public Tmatches() {
		super();
	}

	public Tmatches(Long id, String team1, String team2, LocalDate date, String venue) {
		super();
		this.id = id;
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
		this.venue = venue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	@Override
	public String toString() {
		return "Tmatches [id=" + id + ", team1=" + team1 + ", team2=" + team2 + ", date=" + date + ", venue=" + venue
				+ "]";
	}
	
}

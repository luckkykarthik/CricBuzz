package com.Cricket.Cricbuzz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class player {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(nullable=false)
    private String name;
	
	@Column(nullable=false)
    private String role;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private team Team;

	public player() {
		super();
	}

	public player(Long id, String name, String role, team team) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		Team = team;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public team getTeam() {
		return Team;
	}

	public void setTeam(team team) {
		Team = team;
	}

	@Override
	public String toString() {
		return "player [id=" + id + ", name=" + name + ", role=" + role + ", Team=" + Team + "]";
	}
    
}

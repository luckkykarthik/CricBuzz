package com.Cricket.Cricbuzz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class playerStats {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @OneToOne
	    @JoinColumn(name = "player_id")
	    private player player;
	    private String name;
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private int matchesPlayed;
	    private int runs;
	    private double average;
	    private double strikeRate;
		public playerStats() {
			super();
		}
		public playerStats(Long id, com.Cricket.Cricbuzz.model.player player, String name, int matchesPlayed, int runs,
				double average, double strikeRate) {
			super();
			this.id = id;
			this.player = player;
			this.name = name;
			this.matchesPlayed = matchesPlayed;
			this.runs = runs;
			this.average = average;
			this.strikeRate = strikeRate;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public player getPlayer() {
			return player;
		}
		public void setPlayer(player player) {
			this.player = player;
		}
		public int getMatchesPlayed() {
			return matchesPlayed;
		}
		public void setMatchesPlayed(int matchesPlayed) {
			this.matchesPlayed = matchesPlayed;
		}
		public int getRuns() {
			return runs;
		}
		public void setRuns(int runs) {
			this.runs = runs;
		}
		public double getAverage() {
			return average;
		}
		public void setAverage(double average) {
			this.average = average;
		}
		public double getStrikeRate() {
			return strikeRate;
		}
		public void setStrikeRate(double strikeRate) {
			this.strikeRate = strikeRate;
		}
		@Override
		public String toString() {
			return "playerStats [id=" + id + ", player=" + player + ", name=" + name + ", matchesPlayed="
					+ matchesPlayed + ", runs=" + runs + ", average=" + average + ", strikeRate=" + strikeRate + "]";
		}
		
	    
}

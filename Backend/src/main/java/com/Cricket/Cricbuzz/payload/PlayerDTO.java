package com.Cricket.Cricbuzz.payload;

public class PlayerDTO {
	private Long playerId;
    private String name;
	public PlayerDTO() {
		super();
	}
	public PlayerDTO(Long playerId, String name) {
		super();
		this.playerId = playerId;
		this.name = name;
	}
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PlayerDTO [playerId=" + playerId + ", name=" + name + "]";
	}
    
}

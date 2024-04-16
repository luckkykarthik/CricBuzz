package com.Cricket.Cricbuzz.payload;

public class PlayerAddedResp {
	String message="Player added to squad Succesfully";
	long id;
	public PlayerAddedResp(long id) {
		super();
		this.id = id;
	}
	public PlayerAddedResp() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PlayerAddedResp [message=" + message + ", id=" + id + "]";
	}
	
}

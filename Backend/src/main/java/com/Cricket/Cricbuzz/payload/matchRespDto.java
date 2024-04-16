package com.Cricket.Cricbuzz.payload;

public class matchRespDto {
	String message="Match created successfully";
	long id;
	public matchRespDto(String message, long id) {
		super();
		this.message = message;
		this.id = id;
	}
	public matchRespDto() {
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
		return "matchRespDto [message=" + message + ", id=" + id + "]";
	}
	
}

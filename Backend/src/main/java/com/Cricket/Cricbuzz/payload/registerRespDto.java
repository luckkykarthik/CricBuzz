package com.Cricket.Cricbuzz.payload;

public class registerRespDto {
	
	String status;
	int status_code;
	long id;
	public registerRespDto(String status, int status_code, long id) {
		super();
		this.status = status;
		this.status_code = status_code;
		this.id = id;
	}
	public registerRespDto() {
		super();
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStatus_code() {
		return status_code;
	}
	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}

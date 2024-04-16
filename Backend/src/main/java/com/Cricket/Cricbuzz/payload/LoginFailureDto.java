package com.Cricket.Cricbuzz.payload;

public class LoginFailureDto {
	String status="Incorrect username/password provided. Please retry";
	int status_code=401;
	public LoginFailureDto() {
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
	@Override
	public String toString() {
		return "LoginFailureDto [status=" + status + ", status_code=" + status_code + "]";
	}
	
}

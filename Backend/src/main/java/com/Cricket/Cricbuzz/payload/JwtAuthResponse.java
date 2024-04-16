package com.Cricket.Cricbuzz.payload;

public class JwtAuthResponse {
	String status="Login Successful";
	int status_code=200;
	long id;
	String access_token;
	
	public JwtAuthResponse() {
		super();
	}

	public JwtAuthResponse(String access_token) {
		super();
		this.access_token = access_token;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
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

	@Override
	public String toString() {
		return "JwtAuthResponse [status=" + status + ", status_code=" + status_code + ", id=" + id + ", access_token="
				+ access_token + "]";
	}
}

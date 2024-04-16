package com.Cricket.Cricbuzz.payload;

public class inputPlayerDto {
	String name;
	String role;
	public inputPlayerDto(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	public inputPlayerDto() {
		super();
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
	@Override
	public String toString() {
		return "inputPlayerDto [name=" + name + ", role=" + role + "]";
	}
	
}

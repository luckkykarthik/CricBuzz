package com.Cricket.Cricbuzz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="admin",uniqueConstraints = { @UniqueConstraint(columnNames = {"email","username"})})
public class admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	@Column(nullable=false)
	String username;
	@Column(nullable=false)
	String password;
	@Column(nullable=false)
	String email;
	public admin() {
		super();
	}
	public admin(long id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "admin [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}
	
}

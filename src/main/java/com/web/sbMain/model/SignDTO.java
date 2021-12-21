package com.web.sbMain.model;

import java.sql.*;

public class SignDTO {
	private int id;
	private String userid;
	private String password;
	private String username;
	private String email;
	private String phone;
	private Date joindate;
	
	public SignDTO() {}
	
	public SignDTO(String userid, String password) {
		this.userid = userid;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
	// 패스워드 같은지 확인하는 메서드
	public boolean equalsPassword(SignDTO dto) {
		return this.password.equals(dto.getPassword());
	}
}


package com.web.sbMain.model;

import java.util.*;

import  com.web.sbMain.*;

public class SignService {
	
	public SignDTO findAccount(SignDTO dto) {
		SignDAO dao = new SignDAO();
		SignDTO data = dao.selectAccount(dto);
		return data;
	}
	
	public boolean isValid(SignDTO dto) {
		if(isEmpty(dto.getUserid()) || isEmpty(dto.getPassword()) || isEmpty(dto.getUsername())
				|| isEmpty(dto.getEmail()) || isEmpty(dto.getPhone())) {
			return false;
		}
		return true;
	}
	
	private boolean isEmpty(String str) {
		// 빈칸인 경우
		return str.isEmpty();
	}
	
	public boolean joinAccount(SignDTO dto) {
		SignDAO dao = new SignDAO();
		boolean data = dao.joinAccount(dto);
		
		if(data) {
			dao.commit();
		} else {
			dao.rollback();
		}
		dao.close();
		return data;
	}
	
	public boolean login(SignDTO dto) {
		SignDAO dao = new SignDAO();
		SignDTO data = dao.selectLogin(dto.getUserid(), dto.getPassword());
		dao.close();
		if(data != null) {
			dto.setId(data.getId());
			dto.setPassword("");
			dto.setEmail(data.getEmail());
			dto.setJoindate(data.getJoindate());
			return true;
		}
		return false;
	}
}

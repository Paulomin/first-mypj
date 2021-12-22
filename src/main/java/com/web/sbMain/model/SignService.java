package com.web.sbMain.model;

import java.util.*;

import  com.web.sbMain.*;

public class SignService {
	
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
	
	public boolean login(SignDTO dto) {
		SignDAO dao = new SignDAO();
		List<SignDTO> data = dao.select(dto.getUserid());
		if(data.size() == 1) {
			SignDTO signUserData = data.get(0);
			if(dto.equalsPassword(signUserData)) {
				dto.setUserid(signUserData.getUserid());
				dto.setPassword(signUserData.getPassword());
				dto.setUsername(signUserData.getUsername());
				dto.setEmail(signUserData.getEmail());
				dto.setPhone(signUserData.getPhone());
				dto.setJoindate(signUserData.getJoindate());
				dao.close();
				return true;
			} else {
				dao.close();
				return false;
			} 
		} else {
			dao.close();
			return false;
		}
	}

}

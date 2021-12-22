package com.web.sbMain.model;

import java.util.*;

public class SignService {
	
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
				dao.close();
			}
		}
	}

}

package com.web.sbMain.model;

import java.util.*;
import org.apache.ibatis.session.*;
import com.db.conn.*;

public class SignDAO {
	private OracleConnect oc;
	private MybatisConnect mc;
	private SqlSession sess;
	
	public SignDAO() {
		this.oc = new OracleConnect(true);
		this.mc = new MybatisConnect();
		this.sess = this.mc.getSession();
	}
	
	public boolean joinAccount(SignDTO dto) {
		int res = this.sess.insert("SignMapper.joinAccount", dto);
		System.out.println("res : " + res);
		return res == 1 ? true : false;
	}
	
	public boolean updateAccountInfo(SignDTO dto) {
		int res = this.sess.update("SignMapper.updateAccountInfo", dto);
		return res == 1 ? true : false;
	}
	
	public boolean uadateAccountPassword(SignDTO dto) {
		int res = this.sess.update("SignMapper.updateAccountPassword", dto);
		return res == 1 ? true : false;
	}
	
	public boolean deleteAccount(SignDTO dto) {
		int res = this.sess.delete("SignMapper.deleteAccount", dto);
		return res == 1 ? true : false;
	}
	
	public SignDTO selectAccount(SignDTO dto) {
		SignDTO data = this.sess.selectOne("SignMapper.selectAccount", dto);
		return data;
	}
	
	public SignDTO selectLogin(String userid, String password) {
		SignDTO dto = new SignDTO();
		dto.setUserid(userid);
		dto.setPassword(password);
		
		SignDTO data = this.sess.selectOne("SignMapper.selectLogin", dto);
		return data;
	}
	
	public void commit() {
		oc.commit();
		mc.commit();
	}
	
	public void rollback() {
		oc.rollback();
		mc.rollback();
	}
	
	public void close() {
		oc.close();
		mc.close();
	}


}

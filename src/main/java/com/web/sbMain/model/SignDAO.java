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

	public SignDTO selectLogin(SignDTO dto) {
		SignDTO data = this.sess.selectOne("SignMapper.selectId", dto);
		return  data;
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

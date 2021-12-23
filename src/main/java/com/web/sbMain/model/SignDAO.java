package com.web.sbMain.model;

import java.util.*;

import com.db.conn.*;

public class SignDAO {
	private OracleConnect oc = null;
	
	public SignDAO() {
		this.oc = new OracleConnect(true);
	}

	
	
	public void commit() {
		oc.commit();
	}
	public void rollback() {
		oc.rollback();
	}
	public void close() {
		oc.close();
	}



	public List<SignDTO> select(String userid) {
		
	}
}

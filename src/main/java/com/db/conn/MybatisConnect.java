package com.db.conn;

import java.io.*;
import org.apache.ibatis.io.*;
import org.apache.ibatis.session.*;

public class MybatisConnect {
	// 이 클래스는 오라클커넥트와 같은 개념 
	private SqlSession sess;
	
	public MybatisConnect() {
		this.connect();
	}

	private void connect() {
		String resource = "resources/mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			// 쉽게 설명해서 세션에 저장된 내용들을 읽는다? 요런 개념 저장된다
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// 밑의 코드는 setAutoCommit(false)와 같음 자동커밋 안함 설정
			this.sess = sqlSessionFactory.openSession(false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 저장된 세션을 사용 하기 위한 메서드
	public SqlSession getSession() {
		if(this.sess == null) {
			this.connect();
		}
		return this.sess;
	}
	
	public void commit() {
		this.sess.commit();
	}
	
	public void rollback() {
		this.sess.rollback();
	}
	
	public void close() {
		this.sess.close();
	}
}

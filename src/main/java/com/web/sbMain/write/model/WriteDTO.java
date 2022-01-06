package com.web.sbMain.write.model;

import java.sql.*;

public class WriteDTO {
	private int id;
	private String title;
	private String resell;
	private String contents;
	private String imgUrl;
	private Date wdate;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getResell() {
		return resell;
	}
	
	public void setResell(String resell) {
		this.resell = resell;
	}
	
	public String getContents() {
		return contents;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public Date getWdate() {
		return wdate;
	}
	
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

	@Override
	public String toString() {
		return "WriteDTO [id=" + id + ", title=" + title + ", resell=" + resell + ", contents=" + contents + ", imgUrl="
				+ imgUrl + ", wdate=" + wdate + "]";
	}
	
	
}

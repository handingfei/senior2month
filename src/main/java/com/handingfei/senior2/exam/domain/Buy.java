package com.handingfei.senior2.exam.domain;

import java.io.Serializable;
import java.util.Date;

public class Buy implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String type;
	
	private int type_id;
	
	private Date uptime;
	
	private double jiage1;
	
	private double jiage2;
	
	private String picture;

	private Type type2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public Date getUptime() {
		return uptime;
	}

	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	public double getJiage1() {
		return jiage1;
	}

	public void setJiage1(double jiage1) {
		this.jiage1 = jiage1;
	}

	public double getJiage2() {
		return jiage2;
	}

	public void setJiage2(double jiage2) {
		this.jiage2 = jiage2;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Type getType2() {
		return type2;
	}

	public void setType2(Type type2) {
		this.type2 = type2;
	}
	
}

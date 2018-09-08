package com.mall.admin.category.entity;

import java.util.Date;

public class CategoryList {
	
	private int catSeq;
	private String catNm;
	private String catCd;
	private String catNavYn;
	private String insertID;
	private String updateID;
	private Date insertDate;
	private Date updateDate;
	
	public int getCatSeq() {
		return catSeq;
	}
	public void setCatSeq(int catSeq) {
		this.catSeq = catSeq;
	}
	public String getCatNm() {
		return catNm;
	}
	public void setCatNm(String catNm) {
		this.catNm = catNm;
	}
	public String getCatCd() {
		return catCd;
	}
	public void setCatCd(String catCd) {
		this.catCd = catCd;
	}
	public String getCatNavYn() {
		return catNavYn;
	}
	public void setCatNavYn(String catNavYn) {
		this.catNavYn = catNavYn;
	}
	public String getInsertID() {
		return insertID;
	}
	public void setInsertID(String insertID) {
		this.insertID = insertID;
	}
	public String getUpdateID() {
		return updateID;
	}
	public void setUpdateID(String updateID) {
		this.updateID = updateID;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	

}

package com.mall.admin.category.entity;

public class SubCategoryList {
	private int catSubSeq;
	private int catSeq;
	private String catNm;
	private String catCd;
	private boolean naviYn; 
	private String insertID;
	private String updateID;
	private String insertDate;
	private String updateDate;
	
	public int getCatSubSeq() {
		return catSubSeq;
	}
	public void setCatSubSeq(int catSubSeq) {
		this.catSubSeq = catSubSeq;
	}
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
	public boolean isNaviYn() {
		return naviYn;
	}
	public void setNaviYn(boolean naviYn) {
		this.naviYn = naviYn;
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
	public String getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
}

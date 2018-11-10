package com.mall.admin.board.entity;

import java.io.Serializable;
import java.util.Date;

public class notice implements Serializable{

	private static final long serialVersionUID = -1905069415627896520L;
	
	//notice_sq
	private int noticeSeq;
	//notice_type
	private String noticeType;
	//notice_title
	private String noticeTitle;
	//notice_desc
	private String noticeDesc;
	//notice_fix_yn
	private String noticeFixYN;
	//notice_view_cnt
	private int noticeViewCnt;

	//insert_id, insert_date
	private String insertID;
	private Date insertDate;
	//update_id, update_date
	private String updateID;
	private Date updateDate;
	
	//search, find  : contents ->> key : keyword
	private String key;
	private String keyword;
	
	
	
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getNoticeSeq() {
		return noticeSeq;
	}
	public void setNoticeSeq(int noticeSeq) {
		this.noticeSeq = noticeSeq;
	}
	public String getNoticeType() {
		return noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeDesc() {
		return noticeDesc;
	}
	public void setNoticeDesc(String noticeDesc) {
		this.noticeDesc = noticeDesc;
	}
	public String getNoticeFixYN() {
		return noticeFixYN;
	}
	public void setNoticeFixYN(String noticeFixYN) {
		this.noticeFixYN = noticeFixYN;
	}
	public int getNoticeViewCnt() {
		return noticeViewCnt;
	}
	public void setNoticeViewCnt(int noticeViewCnt) {
		this.noticeViewCnt = noticeViewCnt;
	}
	public String getInsertID() {
		return insertID;
	}
	public void setInsertID(String insertID) {
		this.insertID = insertID;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public String getUpdateID() {
		return updateID;
	}
	public void setUpdateID(String updateID) {
		this.updateID = updateID;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
	
}

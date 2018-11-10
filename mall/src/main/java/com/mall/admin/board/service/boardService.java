package com.mall.admin.board.service;

import java.util.List;

import com.mall.admin.board.entity.notice;

public interface boardService {

	public List<notice> noticeList(notice notice);//게시물 목록
	
	public notice noticeView(notice notice);//게시물 상세
	
	public int noticeTotal(notice notice); //전체 게시물 수

}

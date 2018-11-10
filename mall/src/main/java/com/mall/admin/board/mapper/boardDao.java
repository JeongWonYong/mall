package com.mall.admin.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mall.admin.board.entity.notice;

@Repository
public interface boardDao {
	
	public List<notice> noticeList(notice notice);//게시물 목록
	
	public notice noticeView(notice notice);//게시물 상세
	
	public int noticeTotal(notice notice); //전체 게시물 수
	
	//등록
	//삭제

}

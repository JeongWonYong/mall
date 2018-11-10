package com.mall.admin.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.admin.board.entity.notice;
import com.mall.admin.board.mapper.boardDao;

@Service
public class boardServiceImpl implements boardService{
	
	@Autowired
	private boardDao boardDao;

	@Override
	public List<notice> noticeList(notice notice) {
		
		List<notice> noticeList = boardDao.noticeList(notice);
		
		return noticeList;
	}

	@Override
	public notice noticeView(notice notice) {
		
		notice noticeView = boardDao.noticeView(notice);
		
		return noticeView;
	}

	@Override
	public int noticeTotal(notice notice) {

		int noticeTotal = boardDao.noticeTotal(notice);
		
		return noticeTotal;
	}
	
	
	

}

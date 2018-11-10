package com.mall.admin.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.admin.board.entity.notice;
import com.mall.admin.board.service.boardService;

@Controller
public class boardController {
	
	@Autowired
	private boardService boardService;
	
	private Logger logger = LoggerFactory.getLogger(boardController.class);
	
	
	@RequestMapping("/admin/notice")
	public String notice(Model model,notice notice) {
		logger.info("notice/event Page");
		
		model.addAttribute("noticeList",boardService.noticeList(notice));
		
//		model.addAttribute("categoryList",categoryService.getCategoryList());
        return "/admin/board/notice";
	}
	

}

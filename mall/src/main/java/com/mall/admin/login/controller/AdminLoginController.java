package com.mall.admin.login.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mall.admin.login.service.AdminLoginService;
import com.mall.admin.member.entity.AdminMemberEntity;

@Controller
public class AdminLoginController {
	
	@Inject
	private AdminLoginService loginService;

	private Logger logger = LoggerFactory.getLogger(AdminLoginController.class);
	
	
	//로그인 화면 호출
	@RequestMapping("/admin/login")
	public ModelAndView index(ModelAndView mav) {
	    logger.info("Admin login page!");
	    
	    mav.setViewName("/admin/login");

		return mav;
	}
	
	//로그인 실행
	@RequestMapping(value="/admin/login", params= "action=login")
	public ModelAndView login(HttpSession session,ModelAndView mav, AdminMemberEntity entity) {
	    logger.info("Admin login Process!");
	    
	    String msg = "-";

	    int login = loginService.login(entity);

	    
	    if(login == 2 ) {
	    	msg = "로그인 성공";
	    	session.setAttribute("adminID", entity.getAdminID());
	    	session.setAttribute("adminPassword", entity.getAdminPassword());
	    	mav.setViewName("redirect:/admin/index"); 	
	    }
	    else {
	    	msg = "로그인 실패";
	    	mav.setViewName("/admin/login");
	    }
	    
	    mav.addObject("msg", msg);
	   
		
		return mav;
	}
	
	@RequestMapping("/admin/logout")
	public String logout( HttpSession session) {
		loginService.logout(session);
		
		return "/admin/login";
	}
	
	
}

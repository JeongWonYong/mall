package com.mall.shop.login.controller;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mall.admin.member.entity.MemberEntity;
import com.mall.shop.login.service.LoginService;

@Controller
public class LoginController {
	
	@Inject
	private LoginService loginService;

	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	
	//로그인 화면 호출
	@RequestMapping("/shop/login")
	public ModelAndView login(ModelAndView mav) {
	    logger.info("Shop login page!");
	    
	    mav.setViewName("/shop/login");

		return mav;
	}
	
	//로그인 실행
	@RequestMapping(value="/shop/login", params= "action=login")
	public ModelAndView login(HttpSession session,ModelAndView mav, MemberEntity entity) {
	    logger.info("Shop login Process!");
	    
	    String msg = "-";

	    int login = loginService.login(entity);

	    
	    if(login == 2 ) {
	    	msg = "로그인 성공";
	    	session.setAttribute("memId", entity.getMemId());
	    	session.setAttribute("memPw", entity.getMemPw());
	    	mav.setViewName("redirect:/shop/success"); 	
	    }
	    else {
	    	msg = "로그인 실패";
	    	mav.setViewName("/shop/login");
	    }
	    
	    mav.addObject("msg", msg);
	   
		
		return mav;
	}
	
	@RequestMapping("/shop/success")
	public ModelAndView success(ModelAndView mav ) {
	    logger.info("Welcome success!");
		
		return mav;
	}
	@RequestMapping("/shop/logout")
	public String logout( HttpSession session) {
		loginService.logout(session);
		
		return "/shop/login";
	}
	
	
}

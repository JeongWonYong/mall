package com.mall.shop.login.service;

import javax.servlet.http.HttpSession;

import com.mall.admin.member.entity.MemberEntity;

public interface LoginService {
	
	public int login(MemberEntity entity);
	
	public void logout(HttpSession session);


}

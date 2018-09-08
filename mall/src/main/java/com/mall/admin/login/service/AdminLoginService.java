package com.mall.admin.login.service;

import javax.servlet.http.HttpSession;

import com.mall.admin.member.entity.AdminMemberEntity;

public interface AdminLoginService {
	
	public int login(AdminMemberEntity entity);
	
	public void logout(HttpSession session);
	
	public int test1();

}

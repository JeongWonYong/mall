package com.mall.admin.login.mapper;

import org.springframework.stereotype.Repository;

import com.mall.admin.member.entity.AdminMemberEntity;

@Repository
public interface AdminLoginDao {
	
	public String login(AdminMemberEntity entity);
	
	public int test1();

}

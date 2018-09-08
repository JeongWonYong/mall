package com.mall.shop.login.mapper;

import org.springframework.stereotype.Repository;

import com.mall.admin.member.entity.MemberEntity;

@Repository
public interface LoginDao {
	
	public String login(MemberEntity entity);
	
}

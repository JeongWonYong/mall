package com.mall.admin.member.service.impl;

import javax.inject.Inject;

import com.mall.admin.member.mapper.AdminDao;
import com.mall.admin.member.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Inject
	AdminDao adminDao;

	@Override
	public int test() {
		// TODO Auto-generated method stub
		return adminDao.test();
	}


}

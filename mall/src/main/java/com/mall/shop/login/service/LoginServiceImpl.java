package com.mall.shop.login.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.mall.admin.member.entity.MemberEntity;
import com.mall.shop.login.mapper.LoginDao;


@Service
public class LoginServiceImpl implements LoginService {

	@Inject
	private LoginDao loginDao;

	@Override
	public int login(MemberEntity entity) {

		int result = -1; // sql 조회 , 비밀번호 비교 실패

		String password = loginDao.login(entity);
		if (password == null || password.length() == 0) {
			result = 0; // ID 없음
		} else {
			if (password.equals(entity.getMemPw())) {
				// 입력받은 비밀번호와 조회된 비밀번호가 동일하다면 로그인 성공
				result = 2;
			} else {
				// ID는 있으나 비밀번호가 일치하지 않음.
				result = 1;
			}
		}

		return result;
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate(); //세션초기화
		return ;
	}


}

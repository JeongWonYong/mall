package com.mall.common;

import static org.hamcrest.CoreMatchers.instanceOf;

import com.mall.admin.member.entity.AdminMemberEntity;
import com.mall.admin.member.entity.MemberEntity;

public class Pagination {
	
	public String getPagination(Object obj) {
		//페이징을하기위한 객체 형변환 체크
		if (obj instanceof AdminMemberEntity) {
			AdminMemberEntity entity = (AdminMemberEntity) obj;
		}
		if (obj instanceof MemberEntity) {
			MemberEntity entity = (MemberEntity) obj;
		}
		
		
		return "";
	}

}

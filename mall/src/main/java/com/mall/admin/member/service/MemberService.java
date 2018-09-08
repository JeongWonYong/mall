package com.mall.admin.member.service;

import java.util.List;

import com.mall.admin.member.entity.AdminMemberEntity;
import com.mall.admin.member.entity.MemberEntity;

public interface MemberService {
    
    public List<AdminMemberEntity> getAdminMemberList();
    public List<MemberEntity> getMemberList(MemberEntity member);
    public MemberEntity getMember(MemberEntity member);
    public int getAllMemberCnt();
} 

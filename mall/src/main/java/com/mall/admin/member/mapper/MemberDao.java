package com.mall.admin.member.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mall.admin.member.entity.AdminMemberEntity;
import com.mall.admin.member.entity.MemberEntity;

@Repository
public interface MemberDao {
    public List<AdminMemberEntity> getAdminMemberList();
    public List<MemberEntity> getMemberList(MemberEntity member);
    public MemberEntity getMember(MemberEntity member);
    public int getAllMemberCnt();
}

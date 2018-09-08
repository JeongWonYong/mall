package com.mall.admin.member.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mall.admin.member.entity.AdminMemberEntity;
import com.mall.admin.member.entity.MemberEntity;
import com.mall.admin.member.mapper.MemberDao;
import com.mall.admin.member.service.MemberService;

/**
 * 사용자 관리 화면 서비스
 * 
 * @author inu
 * 
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Inject
    private MemberDao memberMapper;
    /**
     * 관리자 목록
     * @author inu
     * @return
     */
    @Override
    public List<AdminMemberEntity> getAdminMemberList(){
        List<AdminMemberEntity> returnList = new ArrayList<AdminMemberEntity>();
        
        return returnList;
    }
    
    /**
     * 사용자 목록
     * @author inu
     * @return
     */
    @Override
    public List<MemberEntity> getMemberList(MemberEntity member){
        List<MemberEntity> returnList = memberMapper.getMemberList(member);
        
        return returnList;
    }

    /**
     * 사용자 상세 조회
     */
    @Override
    public MemberEntity getMember(MemberEntity member) {
        return memberMapper.getMember(member);
    }

    /**
     * 사용자 총 인원 조회
     */
    @Override
    public int getAllMemberCnt() {
        return memberMapper.getAllMemberCnt();
    }
}

package com.mall.admin.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mall.admin.member.entity.MemberEntity;
import com.mall.admin.member.service.MemberService;

@Controller
@RequestMapping("member/")
public class MemberController {
    
    private Logger logger = LoggerFactory.getLogger(MemberController.class);
    
    public static int PAGE_SIZE = 20;
    
    @Autowired
    private MemberService memberService;
    
    /**
     * 목록 화면
     * @param member
     * @return
     */
    @RequestMapping("list")
    public ModelAndView memManageView(MemberEntity member){
        ModelAndView mav = new ModelAndView("/admin/member/list");
        logger.info("memberManage LIST Page");
        
        member.setPage(1, PAGE_SIZE);
        //첫 목록 조회
        mav.addObject("memberList", memberService.getMemberList(member));
        //페이지 개수
        
        return mav;
    }
    
    /**
     * 목록 더보기
     * @param member
     * @return
     */
    @RequestMapping("more")
    public ModelAndView memListMore(MemberEntity member){
        ModelAndView mav = new ModelAndView("jsonView");
        logger.info("memberManage LIST Page");
        
        member.setPage(member.getPage(), PAGE_SIZE);
        
        mav.addObject("memberList", memberService.getMemberList(member));
        return mav;
    }
    
    /**
     * 상세조회
     * @param member
     * @return
     */
    @RequestMapping("detail")
    public ModelAndView memDetailView(MemberEntity member) {
        ModelAndView mav = new ModelAndView("/admin/member/info");
        
        mav.addObject("memberInfo", memberService.getMember(member));
        return mav;
    }
}

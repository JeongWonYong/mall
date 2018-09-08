package com.mall.admin.member.entity;

import java.math.BigInteger;

import com.mall.common.PagingEntity;

public class MemberEntity extends PagingEntity{
    private BigInteger memSq;
    private String memId;
    private String memPw;
    private String memPhone;
    private String memName;
    private String memPostAddr;
    private String memAddr;
    private int memLevel;
    private char memState;
    private char memMarketingYn;
    private String memJoinDate;
    private String memLastLogin;
    public BigInteger getMemSq() {
        return memSq;
    }
    public void setMemSq(BigInteger memSq) {
        this.memSq = memSq;
    }
    public String getMemId() {
        return memId;
    }
    public void setMemId(String memId) {
        this.memId = memId;
    }
    public String getMemPw() {
        return memPw;
    }
    public void setMemPw(String memPw) {
        this.memPw = memPw;
    }
    public String getMemPhone() {
        return memPhone;
    }
    public void setMemPhone(String memPhone) {
        this.memPhone = memPhone;
    }
    public String getMemName() {
        return memName;
    }
    public void setMemName(String memName) {
        this.memName = memName;
    }
    public String getMemPostAddr() {
        return memPostAddr;
    }
    public void setMemPostAddr(String memPostAddr) {
        this.memPostAddr = memPostAddr;
    }
    public String getMemAddr() {
        return memAddr;
    }
    public void setMemAddr(String memAddr) {
        this.memAddr = memAddr;
    }
    public int getMemLevel() {
        return memLevel;
    }
    public void setMemLevel(int memLevel) {
        this.memLevel = memLevel;
    }
    public char getMemState() {
        return memState;
    }
    public void setMemState(char memState) {
        this.memState = memState;
    }
    public char getMemMarketingYn() {
        return memMarketingYn;
    }
    public void setMemMarketingYn(char memMarketingYn) {
        this.memMarketingYn = memMarketingYn;
    }
    public String getMemJoinDate() {
        return memJoinDate;
    }
    public void setMemJoinDate(String memJoinDate) {
        this.memJoinDate = memJoinDate;
    }
    public String getMemLastLogin() {
        return memLastLogin;
    }
    public void setMemLastLogin(String memLastLogin) {
        this.memLastLogin = memLastLogin;
    }

    @Override
    public String toString() {
        return "MemberEntity [memSq=" + memSq + ", memId=" + memId + ", memPw=" + memPw + ", memPhone=" + memPhone + ", memName=" + memName + ", memPostAddr=" + memPostAddr + ", memAddr=" + memAddr + ", memLevel=" + memLevel + ", memState=" + memState + ", memMarketingYn=" + memMarketingYn
                + ", memJoinDate=" + memJoinDate + ", memLastLogin=" + memLastLogin + "]";
    }
    
}

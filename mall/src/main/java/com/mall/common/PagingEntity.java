package com.mall.common;

public class PagingEntity {
    
    private int page;
    private int startNum;
    private int endNum;
    
    public int getPage() {
        return page;
    }
    public void setPage(int page, int size) {
        this.page = page;
        
        this.setStartNum( (page-1) * size );
        this.setEndNum(page*size);
    }
    public int getStartNum() {
        return startNum;
    }
    public void setStartNum(int startNum) {
        this.startNum = startNum;
    }
    public int getEndNum() {
        return endNum;
    }
    public void setEndNum(int endNum) {
        this.endNum = endNum;
    }
    
}

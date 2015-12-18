package com.webnono.core.pagehelper;

/**
 * Created by Administrator on 2015/12/18.
 */
public class PageQueryModel implements IPageQueryModel {
    private int pageNo = 1 ;
    private int limit = 15;
    private int start;

    public PageQueryModel(){}

    public PageQueryModel(int pageNo, int limit){
        this.limit = limit;
        this.pageNo = pageNo;
    }

    @Override
    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public int getStart() {
        return this.start = this.pageNo > 0 ? (this.pageNo - 1) * this.limit : 0;
    }

    public void setStart(int start) {
        this.start = start;
    }
}

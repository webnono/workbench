package com.webnono.core.pagehelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/18.
 */
public class PageModel<T> implements IPageModel<T> {

    //总记录条数
    private int totalRecord;
    //数据集
    private List<T> data;
    //分页条件
    private IPageQueryModel pageQueryModel;
    //总页数
    private int totalPages;
    //导航页的条数
    private int navigatePages = 5;
    //导航页数组
    private int[] navigatePageNums;
    //页码
    private int pageNo;
    //第一页
    private int firstPage;
    //前一页
    private int prePage;
    //下一页
    private int nextPage;
    //最后一页
    private int lastPage;

    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;
    //是否有前一页
    private boolean hasPreviousPage = false;
    //是否有下一页
    private boolean hasNextPage = false;

    public PageModel() {
    }

    public PageModel(int totalRecord, List<T> data) {
        this.totalRecord = totalRecord;
        this.data = data;
    }

    public PageModel(int totalRecord, List<T> data, IPageQueryModel pageQueryModel) {
        this.totalRecord = totalRecord;
        this.data = data;
        this.pageQueryModel = pageQueryModel;
        this.pageNo = pageQueryModel.getPageNo();
        this.totalPages = totalRecord / pageQueryModel.getLimit() + ((totalRecord % pageQueryModel.getLimit() == 0) ? 0 : 1);
        //计算导航页
        calcNavigatePageNums();
        //计算前后页，第一页，最后一页
        calcPage();
        //判断页面边界
        judgePageBoudary();
    }

    public Map<String, Object> toMap() {
        HashMap retData = new HashMap();
        retData.put("totalRecord", Integer.valueOf(this.totalRecord));
        retData.put("data", this.data);
        return retData;
    }

    public String toString() {
        return this.toMap().toString();
    }

    public IPageQueryModel getPageQueryModel() {
        return this.pageQueryModel;
    }

    /**
     * 计算导航页
     */
    private void calcNavigatePageNums() {
        //当总页数小于或等于导航页码数时
        if (totalPages <= navigatePages) {
            navigatePageNums = new int[totalPages];
            for (int i = 0; i < totalPages; i++) {
                navigatePageNums[i] = i + 1;
            }
        } else { //当总页数大于导航页码数时
            navigatePageNums = new int[navigatePages];
            int startNum = pageNo - navigatePages / 2;
            int endNum = pageNo + navigatePages / 2;

            if (startNum < 1) {
                startNum = 1;
                //(最前navigatePages页
                for (int i = 0; i < navigatePages; i++) {
                    navigatePageNums[i] = startNum++;
                }
            } else if (endNum > totalPages) {
                endNum = totalPages;
                //最后navigatePages页
                for (int i = navigatePages - 1; i >= 0; i--) {
                    navigatePageNums[i] = endNum--;
                }
            } else {
                //所有中间页
                for (int i = 0; i < navigatePages; i++) {
                    navigatePageNums[i] = startNum++;
                }
            }
        }
    }

    /**
     * 计算前后页，第一页，最后一页
     */
    private void calcPage() {
        if (navigatePageNums != null && navigatePageNums.length > 0) {
            firstPage = navigatePageNums[0];
            lastPage = navigatePageNums[navigatePageNums.length - 1];
            if (pageNo > 1) {
                prePage = pageNo - 1;
            }
            if (pageNo < totalPages) {
                nextPage = pageNo + 1;
            }
        }
    }

    /**
     * 判定页面边界
     */
    private void judgePageBoudary() {
        isFirstPage = pageNo == 1;
        isLastPage = pageNo == totalPages;
        hasPreviousPage = pageNo > 1;
        hasNextPage = pageNo < totalPages;
    }

    public List<T> getDataList() {
        return this.data;
    }

    public int getTotalRecord() {
        return this.totalRecord;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getNavigatePages() {
        return navigatePages;
    }

    public int[] getNavigatePageNums() {
        return navigatePageNums;
    }

    public int getPageNo() {
        return pageNo;
    }

    public int getFirstPage() {
        return firstPage;
    }

    public int getPrePage() {
        return prePage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public boolean isFirstPage() {
        return isFirstPage;
    }

    public boolean isLastPage() {
        return isLastPage;
    }

    public boolean isHasPreviousPage() {
        return hasPreviousPage;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }
}

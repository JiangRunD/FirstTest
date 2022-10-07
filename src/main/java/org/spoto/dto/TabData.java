package org.spoto.dto;

import org.spoto.utils.PageUtils;

import java.util.List;

public class TabData<T>{

    private Integer pageIndex;

    private Integer maxPage;

    private Integer pageSize;

    private Integer dataCount;

    private List<T> dataList;

    public TabData(Integer pageIndex, Integer maxPage, Integer pageSize, Integer dataCount, List<T> dataList) {
        this.pageIndex = pageIndex;
        this.maxPage = maxPage;
        this.pageSize = pageSize;
        this.dataCount = dataCount;
        this.dataList = dataList;
    }

    public TabData() {
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getMaxPage() {
        this.maxPage= PageUtils.getMaxPage(this.pageSize,this.dataCount);
        return maxPage;
    }

    public void setMaxPage(Integer maxPage) {
        this.maxPage = maxPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getDataCount() {
        return dataCount;
    }

    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    @Override
    public String toString() {
        return "TabData{" +
                "pageIndex=" + pageIndex +
                ", maxPage=" + maxPage +
                ", pageSize=" + pageSize +
                ", dataCount=" + dataCount +
                ", dataList=" + dataList +
                '}';
    }
}

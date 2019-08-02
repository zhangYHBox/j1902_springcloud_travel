package com.qf.j1902.pojo;


/**
 * Created by Administrator on 2019/7/24.
 */

public class Page {
    private int currentPage;    //当前页数
    private int totalPages;       //总页数
    private int totalRows;      //记录总行数
    private int pageSize=5;    //每页记录行数
    private int nextPage;      //下一页
    private int prefPage;       //前一页

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        totalPages = totalRows % pageSize == 0 ? totalRows / pageSize : totalRows / pageSize + 1;
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getNextPage() {
        if (currentPage < totalPages) {
            nextPage = currentPage + 1;
        } else {
            nextPage = currentPage;
        }
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getPrefPage() {
        if (currentPage > 1) {
            prefPage = currentPage - 1;
        } else {
            prefPage = currentPage;
        }
        return prefPage;
    }


    public void setPrefPage(int prefPage) {
        this.prefPage = prefPage;
    }
}

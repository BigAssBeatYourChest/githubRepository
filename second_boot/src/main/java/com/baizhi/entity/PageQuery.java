package com.baizhi.entity;

public class PageQuery {
	private Integer page=1;
	private Integer rows=10;
	private String keywords;
	/**
	 * 排序依据的字段名: 本质：easyui中th的field的值
	 */
	private String sort;
	/**
	 * 排序方式  asc  desc
	 */
	private String order;
	public PageQuery(){}
	public PageQuery(Integer page, Integer rows, String keywords,
                     String sort, String order) {
		super();
		this.page = page;
		this.rows = rows;
		this.keywords = keywords;
		this.sort = sort;
		this.order = order;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	@Override
	public String toString() {
		return "PageQuery [page=" + page + ", rows=" + rows + ", keywords="
				+ keywords + ", sort=" + sort + ", order=" + order + "]";
	}
}

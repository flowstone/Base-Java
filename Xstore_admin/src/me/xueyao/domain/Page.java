package me.xueyao.domain;

import java.util.List;

public class Page {
	private int total; //总记录数
	private int rows; //每页记录数
	private int end; //最后一页的页码
	private int page; //第几页
	
	private List<Good> data; //当前页的数据

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Good> getData() {
		return data;
	}

	public void setData(List<Good> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Page [total=" + total + ", rows=" + rows + ", end=" + end
				+ ", page=" + page + ", data=" + data + "]";
	}
	
	
}

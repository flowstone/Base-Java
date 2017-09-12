package org.xueyao.domain;

import java.util.Arrays;
import java.util.List;

public class PageBean {
	private int total; //总记录数
	private int size; //每页记录数
	private int end; //最后一页的页码
	private int pageNum; //第几页
	
	private List<Product> data; //当前页的数据
	
	private int[] bar; //分页条

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public List<Product> getData() {
		return data;
	}

	public void setData(List<Product> data) {
		this.data = data;
	}
	//计算获取分页条
	public int[] getBar() {
		int start;
		int stop;
		
		if (end < 10) {
			start = 1;
			stop = end;
		} else {
			start = pageNum -5;
			stop = pageNum +4;
			
			if (pageNum -5 <= 0) {
				start = 1;
				stop = 10;
			}
			
			if (pageNum + 4 >= end) {
				start = end - 9;
				stop = end;
			}
		}
			
		//准备设置数组bar
		bar = new int[stop - start + 1];
		int index = 0;
		for (int i=start; i<= stop; i++) {
			bar[index++] = i;
		}
		
		return bar;
	}

	public void setBar(int[] bar) {
		this.bar = bar;
	}

	@Override
	public String toString() {
		return "Page [total=" + total + ", size=" + size + ", end=" + end
				+ ", pageNum=" + pageNum + ", data=" + data + ", bar="
				+ Arrays.toString(bar) + "]";
	}
	
	
	
}

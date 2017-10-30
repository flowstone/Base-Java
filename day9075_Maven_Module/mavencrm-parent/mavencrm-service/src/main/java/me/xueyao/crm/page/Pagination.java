package me.xueyao.crm.page;

import java.util.List;
import java.util.Map;

//分页bean类型
public class Pagination<T> {

	//关注两种
	//请求数据
	private int page=1;//当前页码，给默认值
	private int pageSize=2;//每页最大记录数,默认值
	private Map<String, String[]> parameterMap;//存放所有的参数（包含了业务参数）
	
	public Map<String, String[]> getParameterMap() {
		return parameterMap;
	}

	public void setParameterMap(Map<String, String[]> parameterMap) {
		this.parameterMap = parameterMap;
	}
	//响应的数据:看页面要什么了
	private List<T> resultList;//数据列表
	private long totalCount;//总记录数
	private long totalPage;//总页码数
	
	
	//给出两个getter方法，计算获取起始的页码和查询的最大记录数
	//起始索引
	public int getFirstResult(){
		return (this.page-1)*this.pageSize;
	}
	
	//每页最大查的数量
	public int getMaxResults(){
		return this.pageSize;
	}
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getResultList() {
		return resultList;
	}
	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
		//顺便把总页码数计算好了
		this.totalPage=(totalCount+pageSize-1)/pageSize;
	}
	public long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}
	
	
	
	
	
	
}

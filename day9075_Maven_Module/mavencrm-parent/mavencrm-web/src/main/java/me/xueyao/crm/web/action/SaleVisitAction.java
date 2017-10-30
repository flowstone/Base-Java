package me.xueyao.crm.web.action;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import me.xueyao.crm.domain.LinkMan;
import me.xueyao.crm.domain.SaleVisit;
import me.xueyao.crm.page.Pagination;
import me.xueyao.crm.service.SaleVisitService;

public class SaleVisitAction extends ActionSupport implements ModelDriven<SaleVisit>{
	private SaleVisit saleVisit=new SaleVisit();
	@Override
	public SaleVisit getModel() {
		return saleVisit;
	}
	
	//属性驱动：接收分页参数
	private int page;//默认值是0
	private int pageSize;
	public void setPage(int page) {
		this.page = page;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	//注入service
	private SaleVisitService saleVisitService;
	public void setSaleVisitService(SaleVisitService saleVisitService) {
		this.saleVisitService = saleVisitService;
	}
	//分页列表查询
	public String listPage(){
		//构建分页bean，封装请求相关数据
		Pagination<SaleVisit> pagination=new Pagination<>();
		if(this.page>0){
			//防止第一次查询的时候，没有页码值
			pagination.setPage(page);
		}
		if(this.pageSize>0){
			pagination.setPageSize(pageSize);
		}
		
		//获取所有参数
		Map<String, String[]> parameterMap = ServletActionContext.getRequest().getParameterMap();
		pagination.setParameterMap(parameterMap);
		
		//调用业务层查询所有
		saleVisitService.findSaleVisitListPage(pagination);
		//压入值栈
		//map栈
		ActionContext.getContext().put("pagination", pagination);
		
		//列表
		return "listjsp";
	}
	
	//显示添加页面
	public String showadd(){
		
		return "addjsp";
		
	}
	
	//保存
	public String add(){
		//
		saleVisitService.saveSaleVisit(saleVisit);
		//刷新列表
		return "listaction";
	}

}

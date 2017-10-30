package me.xueyao.crm.web.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.springframework.ui.Model;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import me.xueyao.crm.domain.Customer;
import me.xueyao.crm.domain.LinkMan;
import me.xueyao.crm.page.Pagination;
import me.xueyao.crm.service.CustomerService;
import me.xueyao.crm.service.LinkManService;
//联系人action
public class LinkManAction extends ActionSupport implements ModelDriven<LinkMan>{


    private static final long serialVersionUID = 1L;
    private LinkMan linkMan=new LinkMan();
	@Override
	public LinkMan getModel() {
		return linkMan;
	}
	
	//注入serivce
	private LinkManService linkManService;
	public void setLinkManService(LinkManService linkManService) {
		this.linkManService = linkManService;
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

	//分页列表查询
	public String listPage(){
		
		//构建分页bean，封装请求相关数据
		Pagination<LinkMan> pagination=new Pagination<>();
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
		linkManService.findLinkManListPage(pagination);
		//压入值栈
		//map栈
		ActionContext.getContext().put("pagination", pagination);
		
		//跳转到列表
		return "listjsp";
	}
	
	
	//注入客户service
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	//显示添加页面
	public String showadd(){
		//查询所有的客户列表
		List<Customer> customerList= customerService.findCustomerList();
		//压入值栈
		//set--map集合
		ActionContext.getContext().getValueStack().set("customerList", customerList);
		return "addjsp";
	}
	
	//保存操作
	public String add(){
		//调用业务层
		linkManService.saveLinkMan(linkMan);
		
		//刷新列表
		return "listaction";
	}
	
	//显示修改页面
	public String showedit(){
		//查询所有的客户列表
		List<Customer> customerList= customerService.findCustomerList();
		//压入值栈
		//set--map集合
		ActionContext.getContext().getValueStack().set("customerList", customerList);
		//根据id查询
		LinkMan linkManQuery= linkManService.findLinkManById(linkMan.getLkm_id());
		//压入root栈顶:必须压入root栈
		ActionContext.getContext().getValueStack().push(linkManQuery);
		return "editjsp";
	}
	
	//更新联系人
	public String edit(){
		//调用业务层
		linkManService.updateLinkMan(linkMan);
		return "listaction";
	}
	
	//删除
	public String delete(){
		//调用业务层
		linkManService.deleteLinkMan(linkMan);
		
		return "listaction";
	}
}

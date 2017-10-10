package me.xueyao.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import me.xueyao.domain.Customer;
import me.xueyao.service.CustomerService;
import me.xueyao.service.impl.CustomerServiceImpl;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CustomerService customerService = new CustomerServiceImpl();
	
	private Customer customer = new Customer();
	/**
	 * 查询客户列表
	 * @return
	 */
	public String findAll() {
		List<Customer> customers = customerService.findAllCustomer();
//		HttpServletRequest request = ServletActionContext.getRequest();
//		request.setAttribute("customers", customers);
		//方式一：手动存放
		//先获取值栈对象
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		//查询到集合数据存放到值栈里(对象栈)
		valueStack.set("customers", customers);
		return SUCCESS;
	}
	
	public String save() {
		customerService.save(customer);
		return SUCCESS;
	}

	@Override
	public Customer getModel() {
		return customer;
	}

}

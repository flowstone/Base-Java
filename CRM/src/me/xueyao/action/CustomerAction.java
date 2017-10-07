package me.xueyao.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import me.xueyao.domain.Customer;
import me.xueyao.service.CustomerService;
import me.xueyao.service.impl.CustomerServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private CustomerService customerService = new CustomerServiceImpl();
	
	public String findAll() {
		List<Customer> customers = customerService.findAllCustomer();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("customers", customers);
		return SUCCESS;
	}

}

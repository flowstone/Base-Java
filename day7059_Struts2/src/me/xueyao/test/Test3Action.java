package me.xueyao.test;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Test3Action extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		ServletContext servletContext = ServletActionContext.getServletContext();
		HttpSession session = ServletActionContext.getRequest().getSession();
		System.out.println(ServletActionContext.getServletContext().getMimeType("F:/icon-20150905.png"));
		return SUCCESS;
		
	}
}

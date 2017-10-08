package me.xueyao.test;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class Test4Action extends ActionSupport implements RequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, Object> request;
	@Override
	public String execute() throws Exception {
		request.put("username", "丽丽");
		return SUCCESS;
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

}

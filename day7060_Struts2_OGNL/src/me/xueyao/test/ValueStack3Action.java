package me.xueyao.test;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ValueStack3Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username = "Simon";
	
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
		
	}

	public String getUsername() {
		return username;
	}

	
}

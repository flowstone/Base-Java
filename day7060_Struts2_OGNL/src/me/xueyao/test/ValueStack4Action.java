package me.xueyao.test;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ValueStack4Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username = "flowstone";
	@Override
	public String execute() throws Exception {
//		Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
//		request.put("username", "flowstone");
		return SUCCESS;
		
	}
	public String getUsername() {
		return username;
	}

	
	
}

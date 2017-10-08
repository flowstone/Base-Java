package me.xueyao.test;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Test6Action extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		System.out.println("test6进来了");
		Map<String, Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		System.out.println(request.get("username"));
		return NONE;
		
	}

}

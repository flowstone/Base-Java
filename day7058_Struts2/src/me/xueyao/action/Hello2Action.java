package me.xueyao.action;

import com.opensymphony.xwork2.ActionSupport;

public class Hello2Action extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("hello2");
		return "success";
	}
}

package me.xueyao.test;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		System.out.println("Hello,World");
		return "fail";
	}

}

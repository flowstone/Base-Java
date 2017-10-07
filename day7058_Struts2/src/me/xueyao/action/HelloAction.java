package me.xueyao.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		//调用业务的代码
		System.out.println("Hello World");
		//框架获取到该方法的返回值 ，返回值 对应的要跳转到页面
		return "success";
	}
	
	

}

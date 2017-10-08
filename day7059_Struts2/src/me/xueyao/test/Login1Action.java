package me.xueyao.test;

import com.opensymphony.xwork2.ActionSupport;

public class Login1Action extends ActionSupport{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	
	@Override
	public String execute() throws Exception {
		System.out.println(username);
		System.out.println(password);
		return NONE;
		
	}
	
	
	public void setUsername(String username) {
		System.out.println("调用了setUsername方法");
		this.username = username;
	}

	public void setPassword(String password) {
		System.out.println("调用了setPassword方法");
		this.password = password;
	}

	
}

package me.xueyao.test;

import me.xueyao.domain.User;

import com.opensymphony.xwork2.ActionSupport;

public class Login2Action extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user; //对象属性接收参数，名字要和页面上对象名一致
	
	@Override
	public String execute() throws Exception {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		return NONE;
		
	}

	public User getUser() {
		System.out.println("调用getUser方法");
		return user;
	}

	public void setUser(User user) {
		System.out.println("调用setUser方法");
		this.user = user;
	}
	
	

}

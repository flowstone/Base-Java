package me.xueyao.test;

import java.util.List;

import me.xueyao.domain.User;

import com.opensymphony.xwork2.ActionSupport;

public class Login5Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<User> users; //接收多个User对象
	
	@Override
	public String execute() throws Exception {
		for (User user : users) {
			System.out.println(user);
		}
		return NONE;
		
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}

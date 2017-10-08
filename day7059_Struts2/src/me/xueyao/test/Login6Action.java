package me.xueyao.test;

import java.util.Map;
import java.util.Set;

import me.xueyao.domain.User;

import com.opensymphony.xwork2.ActionSupport;

public class Login6Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String,User> users;
	
	@Override
	public String execute() throws Exception {
		Set<String> keys = users.keySet();
		for (String key : keys) {
			System.out.println(key+":"+ users.get(key));
		}
		return NONE;
		
	}

	public Map<String, User> getUsers() {
		return users;
	}

	public void setUsers(Map<String, User> users) {
		this.users = users;
	}

	
}

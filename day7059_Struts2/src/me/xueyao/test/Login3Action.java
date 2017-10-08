package me.xueyao.test;

import me.xueyao.domain.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login3Action extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;
	
	private User user = new User(); //一定要手动实例化
	
	@Override
	public String execute() throws Exception {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		return NONE;
	}
	/**
	 * struts2先判断Action类是否实现了ModelDriven
	 * 如果实现，调用getModel方法，返回一个对象，框架会把参数填充到返回参数中
	 */
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}

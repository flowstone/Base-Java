package me.xueyao.test;

import me.xueyao.domain.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login4Action extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user = new User(); //手动实例化
	private int age; //属性驱动
	
	@Override
	public String execute() throws Exception {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println("对象："+user.getAge());
		System.out.println("属性："+age);
		return NONE;
	}
	
	
	@Override
	public User getModel() {
		System.out.println("调用了getModel方法");
		return user;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

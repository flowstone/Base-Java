package me.xueyao.action;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String add() {
		System.out.println("员工新增");
		return NONE;
	}
	
	public String list() {
		System.out.println("员工查询");
		return NONE;
	}
	
	public String update() {
		System.out.println("员工修改");
		return NONE;
	}
	
	public String delete() {
		System.out.println("员工删除");
		return NONE;
	}
}

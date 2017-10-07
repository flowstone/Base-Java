package me.xueyao.action;

import com.opensymphony.xwork2.ActionSupport;

public class DeptAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	public String add() {
		System.out.println("部门新增");
		return NONE;
	}
	
	public String list() {
		System.out.println("部门查询");
		return NONE;
	}
	
	public String update() {
		System.out.println("部门修改");
		return NONE;
	}
	
	public String delete() {
		System.out.println("部门删除");
		return NONE;
	}
}

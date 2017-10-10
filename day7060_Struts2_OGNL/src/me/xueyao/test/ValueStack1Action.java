package me.xueyao.test;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStack1Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int age = 20; //在对象栈中，也能被 搜索到，推荐使用该方法，需要提供getter方法
	
	@Override
	public String execute() throws Exception {
		//第二种获取值栈
		//从ActionContext获取值栈
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		//向对象栈中存放数据（匿名存放）
		valueStack.push("石头");
		//向对象栈存放数据（有名字的存放）
		valueStack.set("username", "flowstone");
		
		//向上下文栈里放数据
		ActionContext.getContext().put("username", "Stone");
		//向上下文栈里放数据
		ActionContext.getContext().put("password", "1024");
		return SUCCESS;
		
	}

	public int getAge() {
		return age;
	}
	
	
}

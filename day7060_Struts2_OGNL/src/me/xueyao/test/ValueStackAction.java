package me.xueyao.test;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStackAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		//第一种获取值栈
		Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		//从request域中获取值栈
		ValueStack valueStack1 = (ValueStack) request.get("struts.valueStack");
		//第二种获取值栈
		//从ActionContext获取值栈
		ValueStack valueStack2 = ActionContext.getContext().getValueStack();
		
		System.out.println(valueStack1 == valueStack2);
		return SUCCESS;
		
	}
}

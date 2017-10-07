package me.xueyao.action;

import com.opensymphony.xwork2.Action;

public class Test2Action  implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("test2请求进来了");
		//return SUCCESS;
		return NONE;
	}

}

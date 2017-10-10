package me.xueyao.test;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ValueStack2Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public String execute() throws Exception {
		//向request域中存放值
		Map<String,Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		request.put("username", "Stone");
		
		//向Session域中存放值
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("username", "FlowStone");
		
		//向application域中存放值 
		Map<String, Object> application = ActionContext.getContext().getApplication();
		application.put("username","石头");
		return SUCCESS;
		
	}

	
}

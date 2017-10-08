package me.xueyao.test;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Test1Action extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		// ActionContext表示Action的上下文对象，类似于Map
		//框架会把HttpServletRequest里属性值获取出来，形成map集合  解耦合
		Map<String, Object> request = (Map<String, Object>) ActionContext.getContext().get("request");
		request.put("username", "小明");
		System.out.println(request.get("username"));
		
		
		//HttpSession
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("username", "小华");
		System.out.println(session.get("username"));
		
		
		//ServletContext
		Map<String, Object> application = ActionContext.getContext().getApplication();
		application.put("username", "小丽");
		System.out.println(application.get("username"));
		
		Map<String, Object> parameters = ActionContext.getContext().getParameters();
		//System.out.println(parameters.get("username"));
		String[] array = (String[]) parameters.get("username");
		System.out.println(array[0]);
		return SUCCESS;
		
		
	}
}

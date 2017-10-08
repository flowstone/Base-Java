package me.xueyao.test;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Test2Action extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware, ParameterAware {

	private static final long serialVersionUID = 1L;
	
	private Map<String, String[]> parameters;
	private Map<String, Object> application;
	private Map<String, Object> session;
	private Map<String, Object> request;
	
	@Override
	public String execute() throws Exception {
		request.put("username", "张三");
		application.put("username", "小丽");
		session.put("username", "小李");
		
		System.out.println(request.get("username"));
		System.out.println(parameters.get("username")[0]);
		return SUCCESS;
	}
	
	@Override
	public void setParameters(Map<String, String[]> parameters) {
		this.parameters = parameters;
	}
	/**
	 * 框架自动调用setApplication方法，把ServletContext解耦后得到的那个map注入到程序里来
	 */
	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}
	/**
	 * 框架自动调用setSession方法把HttpSession解耦后得到那个map注入到程序里来
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	/**
	 * 框架会自动调用setRequest方法，把HttpServletRequest解耦后得到的那个
	 * map通过该方法注入到程序里来
	 */
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

}

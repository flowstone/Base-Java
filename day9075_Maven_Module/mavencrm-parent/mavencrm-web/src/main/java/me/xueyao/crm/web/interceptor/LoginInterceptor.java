package me.xueyao.crm.web.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		if(null==ServletActionContext.getRequest().getSession().getAttribute("loginUser")){
			
			ActionSupport action= (ActionSupport) invocation.getAction();
			action.addActionError("您还没有登录，请先登录！");
			return action.LOGIN;
		}
		//放行
		return invocation.invoke();
	}

}

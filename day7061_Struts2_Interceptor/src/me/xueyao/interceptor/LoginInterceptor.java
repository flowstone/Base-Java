package me.xueyao.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        Map<String, Object> session = invocation.getInvocationContext().getSession();
        if (session.get("username") != null) {
            //已经登录过，放行
            return invocation.invoke();
        } else {
            //没有登录
          ActionSupport action =   (ActionSupport) invocation.getAction();
          action.addActionError("您还没有登录，请登录");
          return "no_login";
        }
    }

}

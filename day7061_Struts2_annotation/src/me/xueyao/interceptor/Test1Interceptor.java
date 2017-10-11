package me.xueyao.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class Test1Interceptor extends MethodFilterInterceptor {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        System.out.println("请求经过测试拦截器1...");
        return invocation.invoke();
    }


}

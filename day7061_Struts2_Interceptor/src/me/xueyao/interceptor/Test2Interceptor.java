package me.xueyao.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class Test2Interceptor extends AbstractInterceptor{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("请求经过测试拦截器2....");
        String result = invocation.invoke();
        System.out.println("响应经过测试拦截器2...");
        return result;
    }

}

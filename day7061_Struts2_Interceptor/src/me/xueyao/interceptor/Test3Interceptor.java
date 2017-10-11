package me.xueyao.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 指定拦截，更为灵活
 * @author XueYao
 *
 */
public class Test3Interceptor extends MethodFilterInterceptor{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        System.out.println("请求经过测试拦截器3...");
        String result = invocation.invoke();
        System.out.println("响应经过测试拦截器3...");
        return result;
    }

}

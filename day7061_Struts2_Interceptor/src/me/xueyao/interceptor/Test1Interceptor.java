package me.xueyao.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Test1Interceptor implements Interceptor{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 销毁方法
     */
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }
    
    /**
     * 初始化方法
     */
    @Override
    public void init() {
        // TODO Auto-generated method stub
        
    }

    /**
     * 拦截方法
     * @param ActionInvocation    Action调试对象
     * @return String 
     */
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("请求经过测试拦截器1...");
        //执行下一步,result其实是Action中方法的返回值
        String result = invocation.invoke();
        System.out.println("响应经过测试拦截器1...");
        return result;
        //return "fail";
    }

}

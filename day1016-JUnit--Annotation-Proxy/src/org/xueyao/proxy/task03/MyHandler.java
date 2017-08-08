package org.xueyao.proxy.task03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.junit.Before;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 7:08:09 PM
 */
public class MyHandler implements InvocationHandler {
    private Object target;
    
    public MyHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        Object result = method.invoke(this.target, args);
        this.after();
        return result;
    }
    
    public void before() {
        System.out.println("项目设计");
    }
    
    public void after() {
        System.out.println("项目总结");
    }

}

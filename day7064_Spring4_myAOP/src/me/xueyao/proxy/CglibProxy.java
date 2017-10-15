package me.xueyao.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import me.xueyao.dao.impl.DeptDao;

/**
 * cglib代理：可以针对那些没有实现接口的类来做代理，采用的是子类的方式来代理
 * @author XueYao
 *
 */
public class CglibProxy implements MethodInterceptor{
    
    private DeptDao deptDao;
    
    public CglibProxy(DeptDao deptDao) {
        this.deptDao = deptDao;
    }
    
    public DeptDao createProxy() {
        //创建cglib的核心类对象
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(deptDao.getClass());
        //设置回调
        enhancer.setCallback(this);
        //创建代理对象
        DeptDao proxy = (DeptDao)enhancer.create();
        return proxy;
    }
    
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("日志记录...");
        Object result = method.invoke(deptDao, args);
        
        return result;
    }
    
}

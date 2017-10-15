package me.xueyao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import me.xueyao.dao.UserDao;

/**
 * Jdk的代理 方式只能针对实现了接口的类来代理 
 * @author XueYao
 *
 */
public class JdkProxy implements InvocationHandler{
    private UserDao userDao;
    
    public JdkProxy(UserDao userDao) {
        this.userDao = userDao;
    }
    
    /**
     * 创建代理对象的方法(增强之后的那个对象)
     * @return
     */
    public UserDao createProxy() {
        UserDao proxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
        return proxy;
    }

    /**
     * 回调
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志记录");
        //执行目标方法（原始方法）
        Object result = method.invoke(userDao, args);
        return result;
    }
}

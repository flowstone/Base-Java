package me.xueyao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 1:55:44 PM
 */
public class SuperStarDemo {
    @Test
    public void demo01() {
        LiuYan liuYan = new LiuYan();
        
        liuYan.sing(5);
        liuYan.liveShow(10);
        liuYan.sleep();
    }
    
    @Test
    public void demo02() {
        final LiuYan liuYan = new LiuYan();
        ClassLoader loader = SuperStarDemo.class.getClassLoader();
        Class<?>[] interfaces = liuYan.getClass().getInterfaces();
        SuperStar proxy = (SuperStar) Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                
                String methodName = method.getName();
                if ("sing".equals(methodName)) {
                    int money = (int) args[0];
                    if (money < 1000) {
                        System.out.println("滚,你的穷屌丝");
                        return null;
                    }
                    System.out.println("代理抽取了:"+money*0.3);
                    return method.invoke(liuYan, (int)(money*0.7));
                } else if ("liveShow".equals(methodName)) {
                    int money = (int)args[0];
                    if (money < 100000) {
                        System.out.println("滚,怎么还是你");
                        return null;
                    }
                    System.out.println("代理抽取了:"+money*0.3);
                    return method.invoke(liuYan, (int)(money*0.7));
                }  else {
                    return method.invoke(liuYan, args);
                }
                
            }
        });
        
        proxy.sing(5);
        proxy.liveShow(10);
        proxy.sleep();
    }
}

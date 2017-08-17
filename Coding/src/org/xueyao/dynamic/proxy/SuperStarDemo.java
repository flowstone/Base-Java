package org.xueyao.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

/**
 * @author Yao Xue
 * @date Aug 16, 2017 12:38:28 PM
 */
public class SuperStarDemo {
    @Test
    public void demo01() {
        LiuYan ly = new LiuYan();
        ly.sing(100);
        ly.liveShow(1000);
        ly.sleep();
        
    }
    
    @Test
    public void demo02() {
        final LiuYan ly = new LiuYan();
        
        ClassLoader loader = SuperStarDemo.class.getClassLoader();
        Class<?>[] interfaces = ly.getClass().getInterfaces();
        SuperStar proxy = (SuperStar)Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
            
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // TODO Auto-generated method stub
                //获得方法名称
                String methodName = method.getName();
                //判断方法
                if ("sing".equals(methodName)) {
                    int money = (int)args[0];
                    if (money < 10000) {
                        System.out.println("滚,穷屌丝,一边去");
                        return null;
                    }
                    System.out.println("抽取了:"+(int)(money * 0.3)+"费用.");
                    //使用反射调用实现类的方法
                    Object obj = method.invoke(ly,(int)(money*0.7));
                    return obj;
                } else if ("liveShow".equals(methodName)){
                    int money = (int)args[0];
                    if (money < 100000) {
                        System.out.println("滚,怎么还是你");
                        return null;
                        
                    }
                    System.out.println("抽取了:"+(int)(money * 0.3)+"费用.");
                    //使用反射调用实现类的方法
                    Object obj = method.invoke(ly,(int)(money*0.7));
                    return obj;
                } else if ("sleep".equals(methodName)) {
                    //直接调用 
                    return method.invoke(ly,args);
                }
                return null;
            } 
        });
        proxy.sing(100000);
        proxy.liveShow(1000000);
        proxy.sleep();
    }
}

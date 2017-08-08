package me.xueyao.reflect;

import java.lang.reflect.Constructor;

import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 6:20:51 PM
 */
public class ConstructorDemo {
    //普通方式:直接 new 对象 
    @Test
    public void demo01() {
        //触发无参构造方法
        //Student stu = new Student();
        
        //触发有参构造方法
        //Student stu = new Student("Jack", 30);
        
        //触发私有构造方法错误 
        //Student stu = new Student("Jack",30,"学霸");
        //System.out.println(stu);
    }
    
    //通过反射调用 无参构造方法,获得实例对象
    @Test
    public void demo2() throws Exception {
        //获取Class对象
        Class<?> cls = Class.forName("me.xueyao.reflect.Student");
        //通过cls直接创建对象,相当于:new Student();
        Object obj = cls.newInstance();
        
    }
    
    //通过反射调用有参数构造方法,获得实例对象
    @Test
    public void demo03() throws Exception {
        //1.获取Class对象
        Class<?> cls = Class.forName("me.xueyao.reflect.Student");
        //2.获得构造 方法
        
        Constructor<?> cons = cls.getConstructor(new Class[]{String.class,int.class});
        
       //3.调用构造方法,获得实例对象
        Object obj = cons.newInstance(new Object[]{"Jack",23});
        System.out.println(obj);
    }
    
    //通过私有构造方法获得实例对象
    @Test
    public void demo04() throws Exception {
        Class<?> cls = Class.forName("me.xueyao.reflect.Student");
        //获取构造方法
        Constructor<?> cons = cls.getDeclaredConstructor(new Class[]{String.class, int.class,String.class});
        //暴力访问
        cons.setAccessible(true);
        //3。调用构造方法，获得实例对象
        Object obj = cons.newInstance(new Object[]{"jack",20,"学渣"});
        System.out.println(obj);
    }
}

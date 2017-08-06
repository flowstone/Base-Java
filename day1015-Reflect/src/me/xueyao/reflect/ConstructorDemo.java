package me.xueyao.reflect;

import java.io.File;
import java.lang.reflect.Constructor;

/**
 * @author Yao Xue
 * @date Aug 6, 2017 4:11:23 PM
 */
public class ConstructorDemo {
    public static void main(String[] args) throws Exception {
        
        //method_1();
        //method_2();
        method_3();
    }
    /**
     * 需求:获取File类中的所有构造方法,包括私有的
     * @throws Exception 
     */
    public static void method_3() throws Exception {
        //* 需求:获取File类中的所有构造方法,包括私有的
        Class clazz = Class.forName("java.io.File");
        /*Constructor[] cons = clazz.getDeclaredConstructors();
        for (Constructor constructor : cons) {
            System.out.println(constructor);
        }*/
        
        //获取File类中私有的构造方法
        Constructor c = clazz.getDeclaredConstructor(String.class, File.class);
        //取消权限检测或者叫做暴力访问
        c.setAccessible(true);
        //创建File类的对象
        File f = (File) c.newInstance("柳岩.jpg", new File("D:\\Temp\\Temp"));
        System.out.println(f.getAbsolutePath());
    }
    /**
     * 开发普遍使用的方法:使用反射技术获取某个类中的构造方法
     * @throws Exception 
     */
    public static void method_2() throws Exception {
        //需求:反射获取File类中的所有公共构造方法
        Class clazz = Class.forName("java.io.File");
        //调用方法获取所有的公共的构造方法
       /* Constructor[] cons = clazz.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }*/
        
        
        //需求:使用File中构造方法创建对象并输出内容
        Constructor constructor = clazz.getConstructor(String.class);
        File f = (File) constructor.newInstance("D:\\Temp\\Temp\\a.txt");
        System.out.println(f.getAbsolutePath());
    }

    public static void method_1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("me.xueyao.reflect.Person");
        /**
         * 这种方式创建某个类的对象时要求这个类比如Person中必须有无参构造方法
         */
        //创建Person对象
        Person p = (Person) clazz.newInstance();
        p.setName("小明");
        System.out.println(p.getName());
    }
}

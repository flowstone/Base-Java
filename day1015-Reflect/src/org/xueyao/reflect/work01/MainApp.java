package org.xueyao.reflect.work01;
/**
 * 一、创建一个包 cn.itcast.demo7 写一个User类 并且提供空参构造
  写一个MainApp类 要求根据提供的信息 创建一个User对象,不能使用new的方式
也就是要采用反射的方式创建对象

 * @author Yao Xue
 * @date Aug 6, 2017 9:10:27 PM
 */
public class MainApp {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("org.xueyao.reflect.work01.User");
        User obj = (User) clazz.newInstance();
        
    }
}

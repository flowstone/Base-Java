package org.xueyao.reflect;
/**
 * @author Yao Xue
 * @date Aug 6, 2017 11:27:50 AM
 */


public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //获取Class类的对象
        Class clazz = Class.forName("org.xueyao.reflect.Person1");
        //使用对象调用函数创建Person类的对象
        Person1 p = (Person1) clazz.newInstance();
        System.out.println(p);  //org.xueyao.reflect.Person1@179935d
        
        //利用无参构造函数创建对象
        String s = String.class.newInstance();
        
        System.out.println(s.length());  //0
    }
}

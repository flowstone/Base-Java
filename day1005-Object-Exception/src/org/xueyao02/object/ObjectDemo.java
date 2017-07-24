package org.xueyao02.object;

import java.util.ArrayList;

/**
 * 1. Object 概念
        1. 所有类的父类,任何类,包括数组,使用 Object 作为超类   
        2. 两个重要方法：equals和toString方法
        
    private static native void registerNatives();申请系统资源,底层调用C/C++(堆区:保存实体对象以及数组)
        1. native修饰的方法,是本地方法,执行在本地方法栈中
 * @author Yao Xue
 * @date Jul 24, 2017 1:45:44 PM
 */
public class ObjectDemo {
    public static void main(String[] args) {
        int[] array = {1}; 
        //获得该数组所属类的超类
        //结果：class java.lang.Object
        System.out.println(array.getClass().getSuperclass());
        
        /**
         * toString:默认打印内存地址值
         * 问题：打印内存地址值有意义？希望打印对象的属性值
         * 解决：重写toString方法(多态)
         */
        Person p = new Person();
        p.name = "张三";
        p.age = 18;
        //方法内部自动调用的是对象tostring方法
        System.out.println(p);  //内存地址值
        System.out.println(p.toString());  //默认打印内存地址值
        
        /**
         * equals: 默认比较内存地址值
         * 问题：比较内存地址值有意义？？希望比较对象的属性值(age)
         * 解决：重写equals方法
         */
         Person p1 = new Person();
         p1.age = 18;
         Person p2 = new Person();
         p2.age = 18;
         
         System.out.println(p1 == p2);  //引用类型 比较的是地址值
         System.out.println(p1.equals(p2));
         System.out.println("--------");
         /**
          * String
          * 1.重写了equals方法
          * 2.重写了toString方法
          * 
          */
         String s1 = new String("abc");
         String s2 = new String("abc");
         System.out.println(s1 == s2);  //false
         System.out.println(s1.equals(s2));
         
         System.out.println(s1);
         ArrayList<String> list = new ArrayList<String>();
         list.add("abc");
         list.add("abc");
         list.add("abc");
         System.out.println(list);
         
    }
}

class Person {
    String name;
    int age;
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age +"]";
    }
    
    @Override
    public boolean equals(Object obj) {
        //1.判空
        if (obj == null) {
            return false;
        }
        //2.进行类型判断，向下转型
        if (obj instanceof Person) {
            Person person = (Person)obj;
            //3.比较年龄
            return this.age == person.age;
        }
        return false;
    }
    
}

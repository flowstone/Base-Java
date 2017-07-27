package me.xueyao.foreach;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 三. 增强for循环
    1. JDK1.5特性：只要实现(继承)Iterable接口，允许对象成为“foreach”语句的目标
    2. 集合Collection（List、Set）和数组都可以使用增强for循环
    3. 语法
        for（数据类型  变量名：集合或数组）{

        }
    4. 增强for循环的原理是Iterator,本质是变量被循环赋值
    4. 优劣
        1. 好处：代码简单，适合遍历查看
        2. 弊端：不能获取元素的索引,不能修改集合中的元素值
        3. 总结：眼看手勿动
    5. 遍历数组
        1. 基本类型 int，可以运算
        2. 引用类型 String，可以调用方法
    6. 遍历集合
        1. String和自定义类型
 * @author Yao Xue
 * @date Jul 27, 2017 12:13:46 AM
 */
public class ForeachDemo {
    public static void main(String[] args) {
        method4();
        method3();
        method2();
        method();
    }
    
    

    private static void method4() {
        Collection<Person> coll = new ArrayList<Person>();
        coll.add(new Person("柳岩", 18));
        coll.add(new Person("杨幂", 19));
        coll.add(new Person("林志玲", 20));
        coll.add(new Person("刘诗诗", 21));
        
        for (Person p: coll) {
            System.out.println(p);
            System.out.println(p.name+":"+p.age);
        }
    }
    
    private static void method3() {
        Collection<String> c = new ArrayList<String>();
        c.add("php");
        c.add("ios");
        c.add("php");
        c.add("ui");
        
        for (String s : c) {
            System.out.println(s);
        }
    }
    
    private static void method2() {
        //引用类型String,可以调用方法
        String[] array = {"java","iso","php","ui"};
        for (String s : array) {
            System.out.println(s.length());
        }
    }
    
    private static void method() {
        //基本类型int,可以运算
        int[] array = {1,2,3};
        for(int i=0; i< array.length; i++) {
            int j = array[i];
            System.out.println(j);
        }
    }
}

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
    
}

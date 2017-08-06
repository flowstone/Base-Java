package org.xueyao.reflect;
/**
 * @author Yao Xue
 * @date Aug 6, 2017 9:14:37 AM
 */
class Person {
    static {
        System.out.println("我是静态代码块");
    }
    
    Person() {
        System.out.println("Person...构造函数");
    }
    {
        System.out.println("构造代码块");
    }
}

public class ClassDemo1 {
    public static void main(String[] args) throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        //方式1:类名.class
        Class clazz1 = Person.class;
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName()); //Person
        

        //方式2:对象.class
        Class clazz2 = new Person().getClass();
        System.out.println(clazz2.getName()); //org.xueyao.reflect.Person
        System.out.println(clazz2.getSimpleName());
        
        //方式3
        Class clazz3 = Class.forName("org.xueyao.reflect.Person");
        System.out.println(clazz3.getName()); //org.xueyao.reflect.Person
        System.out.println(clazz3.getSimpleName());  //Person
    }
}


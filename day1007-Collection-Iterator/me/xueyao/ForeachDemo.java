package me.xueyao;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Yao Xue
 * @date Jul 26, 2017 4:09:07 PM
 */
public class ForeachDemo {
    public static void main(String[] args) {
        //method();
        //method3();
        method4();
    }

    private static void method4() {
        Collection<Person> c = new ArrayList<Person>();
        c.add(new Person("柳岩",18));
        c.add(new Person("杨幂",18));
        c.add(new Person("林志玲",18));
        c.add(new Person("刘诗诗",18));
        
        for (Person p : c) {
            System.out.println(p);
        }
    }

    private static void method3() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("java");
        coll.add("ios");
        coll.add("php");
        coll.add("ui");
        
        for(String s: coll) {
            System.out.println(s);
        }
    }

    private static void method() {
        // TODO Auto-generated method stub
        int[] arr = {1,2,3,4};
        for (int i = 0; i < arr.length; i++) {
            
        }
        for(int i: arr) {
            System.out.println(i);
        }
    }
}

class Person {
    String name;
    int age;
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
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

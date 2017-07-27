package org.xueyao.hashset;

import java.util.HashSet;

import org.xueyao.bean.Person;

/**
 * @author Yao Xue
 * @date Jul 27, 2017 6:01:43 PM
 */
public class CustomDemo {
    public static void main(String[] args) {
       /**
        * 我们使用hashset就希望其中的元素不可重复
        * 参数相同,但是对象 不同,我们希望集合把这些元素当成同一元素
        * 那么就得hashcode方法有equals方法
        */
       HashSet<Person> p = new  HashSet<Person>();
       p.add(new Person("a",18));
       p.add(new Person("b",19));
       p.add(new Person("a",18));
       p.add(new Person("c",20));
       p.add(new Person("d",21));
       
       for (Person person : p) {
           System.out.println(person);
       }
    }
}

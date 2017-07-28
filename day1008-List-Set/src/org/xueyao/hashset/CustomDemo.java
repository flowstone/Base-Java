package org.xueyao.hashset;

import java.util.HashSet;

import org.xueyao.bean.Person;

/**
 * 7. 自定义的对象重写hashCode和equals方法(放进hashset才有意义)
        1. 案例:HashSet集合,哈希表存储自定义的对象
        2. 在HashSet中,自定义对象重写hashCode和equals方法是为了区分是否同一元素
        3. 注意:存储到HashSet中的自定义类型对象,要重写hashCode和equals,不然就失去元素不可重复的意义
        4. String,8个基本类型包装类,全部重写hashCode equals方法
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

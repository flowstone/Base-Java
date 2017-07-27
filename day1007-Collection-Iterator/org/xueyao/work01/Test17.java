package org.xueyao.work01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 自定义人类:包含姓名,年龄,身高属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.
 * 创建5个人对象放到ArrayList中.使用迭代器获取每个人对象.将每个人的年龄加2岁.再使用增强for打印每个人的信息
 * @author Yao Xue
 * @date Jul 27, 2017 10:44:32 AM
 */
public class Test17 {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<Person>();
        person.add(new Person("小明",18,160));
        person.add(new Person("小陈",19,197));
        person.add(new Person("小芳",20,166));
        person.add(new Person("小丽",21,156));
        person.add(new Person("小欣",22,170));
        
        Iterator<Person> it = person.iterator();
        while (it.hasNext()) {
            Person next = it.next();
            next.setAge(next.getAge()+2);
        }
        
        for (Person p : person) {
            System.out.println(p.getAge());
        }
        
    }
}

class Person {
    private String name;
    private int age;
    private int height;
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Person(String name, int age, int height) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    
}
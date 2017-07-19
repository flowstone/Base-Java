package org.xueyao01.walk;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 8:03:41 PM
 */
public class Person {
    private String name = "成员变量";
    private int age;
    public Person() {
        // TODO Auto-generated constructor stub
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    
    public void walk() {
        System.out.println(name + age + "岁从上海走到北京！");
    }
}

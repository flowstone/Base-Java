package com.itheima.object;
/**
 * @author Yao Xue
 * @date Jul 7, 2017 9:45:14 AM
 */
public class Student {
    private String name;
    private int age;
    
    public Student() {
        // TODO Auto-generated constructor stub
    }

    public Student(String name, int age) {
        super();
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
    
}

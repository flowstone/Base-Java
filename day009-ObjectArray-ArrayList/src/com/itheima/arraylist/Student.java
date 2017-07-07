package com.itheima.arraylist;
/**
 * @author Yao Xue
 * @date Jul 7, 2017 2:45:12 PM
 */
public class Student {
    private String name;
    private int age;
    private String sex;
    public Student() {
        // TODO Auto-generated constructor stub
    }
    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    
}

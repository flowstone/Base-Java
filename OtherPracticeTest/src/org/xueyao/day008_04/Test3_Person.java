package org.xueyao.day008_04;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 7:29:46 PM
 */
public class Test3_Person {
    public static void main(String[] args) {
        
    }
}

/*
 * 使用继承前的学生和老师案例
 *  属性： 姓名，年龄
 *  行为：吃饭
 *  老师特有的方法：讲课
 *  学生特有的方法：学习
 * */

class Student {
    private String name;
    private int age;
    public Student() {
        super();
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
    
    public void eat() {
        System.out.println("学生吃饭");
    }
    
    public void study() {
        System.out.println("学生学习");
    }
}

class Teacher {
    private String name;
    private int age;
    public Teacher() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Teacher(String name, int age) {
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
    
    public void eat() {
        System.out.println("老师吃饭");
    }
    
    public void teach() {
        System.out.println("老师讲课");
    }
}

package org.xueyao.objectstream.demo;

import java.io.Serializable;

/**
 * @author Yao Xue
 * @date Aug 2, 2017 5:17:05 PM
 */
public class Student implements Serializable{
    private static final long serialVersionUID = -2738073387733287258L;
    private String name;
    private transient int age;
    public Student() {
        super();
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
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}

package org.xueyao.work01;
/**
 * @author Yao Xue
 * @date Jul 26, 2017 9:23:18 PM
 */
public class Student {
    private String name;
    private int age;
    private int height;
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(String name, int age, int height) {
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

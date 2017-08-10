package org.xueyao.beans.task01;
/**
 * 1.   定义一个Cat类，要求：
属性：名称、年龄、颜色、性别
方法：无参构造方法、全参构造方法，get/set方法。

 * @author Yao Xue
 * @date Aug 10, 2017 6:58:37 PM
 */
public class Cat {
    private String name;
    private int age;
    private String color;
    private char gender;
    public Cat() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Cat(String name, int age, String color, char gender) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
        this.gender = gender;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + ", color=" + color + ", gender=" + gender + "]";
    }
    
    
}

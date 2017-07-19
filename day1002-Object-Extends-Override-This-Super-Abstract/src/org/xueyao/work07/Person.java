package org.xueyao.work07;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 9:04:04 PM
 */
public abstract  class Person {
    private String name;
    private int age;
    private double height;
    
    public Person() {
    }

    public Person(String name, int age, double height) {
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public abstract void say(String content);
}

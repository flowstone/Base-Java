package org.xueyao.work07;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 8:09:23 AM
 */
public abstract class Animal {
    private String color;
    private int age;
    
    public Animal(){}
    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public abstract void eat();
}

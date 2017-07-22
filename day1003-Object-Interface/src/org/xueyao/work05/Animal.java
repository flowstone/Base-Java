package org.xueyao.work05;
/**
 * @author Yao Xue
 * @date Jul 21, 2017 10:01:02 PM
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

package org.xueyao.day008;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 5:05:41 PM
 */
public class Demo1_Extends {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color = "花";
        cat.leg = 4;
        cat.eat();
        cat.sleep();
    }
}

class Animal {
    String color;  //颜色 
    int leg;     //腿的个数 
    
    public void eat() {
        System.out.println("吃饭");
    }
    
    public void sleep() {
        System.out.println("睡觉");
    }
}
class Cat extends Animal{
    /*String color;  //颜色 
    int leg;     //腿的个数 
    
    public void eat() {
        System.out.println("吃饭");
    }
    
    public void sleep() {
        System.out.println("睡觉");
    }*/
}

class Dog extends Animal {
   /* String color;  //颜色 
    int leg;     //腿的个数 
    
    public void eat() {
        System.out.println("吃饭");
    }
    
    public void sleep() {
        System.out.println("睡觉");
    }*/
}
